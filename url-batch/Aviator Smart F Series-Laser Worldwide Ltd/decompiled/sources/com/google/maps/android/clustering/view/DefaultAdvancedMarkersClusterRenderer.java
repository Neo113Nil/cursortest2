package com.google.maps.android.clustering.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.AdvancedMarker;
import com.google.android.gms.maps.model.AdvancedMarkerOptions;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.R;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultAdvancedMarkersClusterRenderer;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.ui.IconGenerator;
import com.google.maps.android.ui.SquareTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public class DefaultAdvancedMarkersClusterRenderer<T extends ClusterItem> implements ClusterRenderer<T> {
    private ClusterManager.OnClusterClickListener<T> mClickListener;
    private final ClusterManager<T> mClusterManager;
    private Set<? extends Cluster<T>> mClusters;
    private ShapeDrawable mColoredCircleBackground;
    private final float mDensity;
    private final IconGenerator mIconGenerator;
    private ClusterManager.OnClusterInfoWindowClickListener<T> mInfoWindowClickListener;
    private ClusterManager.OnClusterInfoWindowLongClickListener<T> mInfoWindowLongClickListener;
    private ClusterManager.OnClusterItemClickListener<T> mItemClickListener;
    private ClusterManager.OnClusterItemInfoWindowClickListener<T> mItemInfoWindowClickListener;
    private ClusterManager.OnClusterItemInfoWindowLongClickListener<T> mItemInfoWindowLongClickListener;
    private final GoogleMap mMap;
    private float mZoom;
    private static final int[] BUCKETS = {10, 20, 50, 100, 200, 500, 1000};
    private static final TimeInterpolator ANIMATION_INTERP = new DecelerateInterpolator();
    private final Executor mExecutor = Executors.newSingleThreadExecutor();
    private Set<MarkerWithPosition> mMarkers = Collections.newSetFromMap(new ConcurrentHashMap());
    private SparseArray<BitmapDescriptor> mIcons = new SparseArray<>();
    private MarkerCache<T> mMarkerCache = new MarkerCache<>();
    private int mMinClusterSize = 4;
    private MarkerCache<Cluster<T>> mClusterMarkerCache = new MarkerCache<>();
    private final DefaultAdvancedMarkersClusterRenderer<T>.ViewModifier mViewModifier = new ViewModifier();
    private boolean mAnimate = true;
    private long mAnimationDurationMs = 300;

    private class AnimationTask extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private final LatLng from;
        private MarkerManager mMarkerManager;
        private boolean mRemoveOnComplete;
        private final Marker marker;
        private final MarkerWithPosition markerWithPosition;
        private final LatLng to;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.mRemoveOnComplete) {
                DefaultAdvancedMarkersClusterRenderer.this.mMarkerCache.remove(this.marker);
                DefaultAdvancedMarkersClusterRenderer.this.mClusterMarkerCache.remove(this.marker);
                this.mMarkerManager.remove(this.marker);
            }
            this.markerWithPosition.position = this.to;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.to;
            double d8 = latLng.latitude;
            LatLng latLng2 = this.from;
            double d9 = latLng2.latitude;
            double d10 = animatedFraction;
            double d11 = ((d8 - d9) * d10) + d9;
            double d12 = latLng.longitude - latLng2.longitude;
            if (Math.abs(d12) > 180.0d) {
                d12 -= Math.signum(d12) * 360.0d;
            }
            this.marker.setPosition(new LatLng(d11, (d12 * d10) + this.from.longitude));
        }

        public void perform() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(DefaultAdvancedMarkersClusterRenderer.ANIMATION_INTERP);
            ofFloat.setDuration(DefaultAdvancedMarkersClusterRenderer.this.mAnimationDurationMs);
            ofFloat.addUpdateListener(this);
            ofFloat.addListener(this);
            ofFloat.start();
        }

        public void removeOnAnimationComplete(MarkerManager markerManager) {
            this.mMarkerManager = markerManager;
            this.mRemoveOnComplete = true;
        }

        private AnimationTask(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.markerWithPosition = markerWithPosition;
            this.marker = markerWithPosition.marker;
            this.from = latLng;
            this.to = latLng2;
        }
    }

    private class CreateMarkerTask {
        private final LatLng animateFrom;
        private final Cluster<T> cluster;
        private final Set<MarkerWithPosition> newMarkers;

        public CreateMarkerTask(Cluster<T> cluster, Set<MarkerWithPosition> set, LatLng latLng) {
            this.cluster = cluster;
            this.newMarkers = set;
            this.animateFrom = latLng;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void perform(DefaultAdvancedMarkersClusterRenderer<T>.MarkerModifier markerModifier) {
            MarkerWithPosition markerWithPosition;
            MarkerWithPosition markerWithPosition2;
            if (DefaultAdvancedMarkersClusterRenderer.this.shouldRenderAsCluster(this.cluster)) {
                AdvancedMarker advancedMarker = (AdvancedMarker) DefaultAdvancedMarkersClusterRenderer.this.mClusterMarkerCache.get((MarkerCache) this.cluster);
                if (advancedMarker == null) {
                    AdvancedMarkerOptions advancedMarkerOptions = new AdvancedMarkerOptions();
                    LatLng latLng = this.animateFrom;
                    if (latLng == null) {
                        latLng = this.cluster.getPosition();
                    }
                    AdvancedMarkerOptions position = advancedMarkerOptions.position(latLng);
                    DefaultAdvancedMarkersClusterRenderer.this.onBeforeClusterRendered(this.cluster, position);
                    advancedMarker = (AdvancedMarker) DefaultAdvancedMarkersClusterRenderer.this.mClusterManager.getClusterMarkerCollection().addMarker(position);
                    DefaultAdvancedMarkersClusterRenderer.this.mClusterMarkerCache.put(this.cluster, advancedMarker);
                    markerWithPosition = new MarkerWithPosition(advancedMarker);
                    LatLng latLng2 = this.animateFrom;
                    if (latLng2 != null) {
                        markerModifier.animate(markerWithPosition, latLng2, this.cluster.getPosition());
                    }
                } else {
                    markerWithPosition = new MarkerWithPosition(advancedMarker);
                    DefaultAdvancedMarkersClusterRenderer.this.onClusterUpdated(this.cluster, advancedMarker);
                }
                DefaultAdvancedMarkersClusterRenderer.this.onClusterRendered(this.cluster, advancedMarker);
                this.newMarkers.add(markerWithPosition);
                return;
            }
            for (T t7 : this.cluster.getItems()) {
                AdvancedMarker advancedMarker2 = (AdvancedMarker) DefaultAdvancedMarkersClusterRenderer.this.mMarkerCache.get((MarkerCache) t7);
                if (advancedMarker2 == null) {
                    AdvancedMarkerOptions advancedMarkerOptions2 = new AdvancedMarkerOptions();
                    LatLng latLng3 = this.animateFrom;
                    if (latLng3 != null) {
                        advancedMarkerOptions2.position(latLng3);
                    } else {
                        advancedMarkerOptions2.position(t7.getPosition());
                        if (t7.getZIndex() != null) {
                            advancedMarkerOptions2.zIndex(t7.getZIndex().floatValue());
                        }
                    }
                    DefaultAdvancedMarkersClusterRenderer.this.onBeforeClusterItemRendered(t7, advancedMarkerOptions2);
                    advancedMarker2 = (AdvancedMarker) DefaultAdvancedMarkersClusterRenderer.this.mClusterManager.getMarkerCollection().addMarker(advancedMarkerOptions2);
                    markerWithPosition2 = new MarkerWithPosition(advancedMarker2);
                    DefaultAdvancedMarkersClusterRenderer.this.mMarkerCache.put(t7, advancedMarker2);
                    LatLng latLng4 = this.animateFrom;
                    if (latLng4 != null) {
                        markerModifier.animate(markerWithPosition2, latLng4, t7.getPosition());
                    }
                } else {
                    markerWithPosition2 = new MarkerWithPosition(advancedMarker2);
                    DefaultAdvancedMarkersClusterRenderer.this.onClusterItemUpdated(t7, advancedMarker2);
                }
                DefaultAdvancedMarkersClusterRenderer.this.onClusterItemRendered(t7, advancedMarker2);
                this.newMarkers.add(markerWithPosition2);
            }
        }
    }

    private static class MarkerCache<T> {
        private Map<T, Marker> mCache;
        private Map<Marker, T> mCacheReverse;

        public Marker get(T t7) {
            return this.mCache.get(t7);
        }

        public void put(T t7, Marker marker) {
            this.mCache.put(t7, marker);
            this.mCacheReverse.put(marker, t7);
        }

        public void remove(Marker marker) {
            T t7 = this.mCacheReverse.get(marker);
            this.mCacheReverse.remove(marker);
            this.mCache.remove(t7);
        }

        private MarkerCache() {
            this.mCache = new HashMap();
            this.mCacheReverse = new HashMap();
        }

        public T get(Marker marker) {
            return this.mCacheReverse.get(marker);
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class MarkerModifier extends Handler implements MessageQueue.IdleHandler {
        private static final int BLANK = 0;
        private final Condition busyCondition;
        private final Lock lock;
        private Queue<DefaultAdvancedMarkersClusterRenderer<T>.AnimationTask> mAnimationTasks;
        private Queue<DefaultAdvancedMarkersClusterRenderer<T>.CreateMarkerTask> mCreateMarkerTasks;
        private boolean mListenerAdded;
        private Queue<DefaultAdvancedMarkersClusterRenderer<T>.CreateMarkerTask> mOnScreenCreateMarkerTasks;
        private Queue<Marker> mOnScreenRemoveMarkerTasks;
        private Queue<Marker> mRemoveMarkerTasks;

        private void performNextTask() {
            if (!this.mOnScreenRemoveMarkerTasks.isEmpty()) {
                removeMarker(this.mOnScreenRemoveMarkerTasks.poll());
                return;
            }
            if (!this.mAnimationTasks.isEmpty()) {
                this.mAnimationTasks.poll().perform();
                return;
            }
            if (!this.mOnScreenCreateMarkerTasks.isEmpty()) {
                this.mOnScreenCreateMarkerTasks.poll().perform(this);
            } else if (!this.mCreateMarkerTasks.isEmpty()) {
                this.mCreateMarkerTasks.poll().perform(this);
            } else {
                if (this.mRemoveMarkerTasks.isEmpty()) {
                    return;
                }
                removeMarker(this.mRemoveMarkerTasks.poll());
            }
        }

        private void removeMarker(Marker marker) {
            DefaultAdvancedMarkersClusterRenderer.this.mMarkerCache.remove(marker);
            DefaultAdvancedMarkersClusterRenderer.this.mClusterMarkerCache.remove(marker);
            DefaultAdvancedMarkersClusterRenderer.this.mClusterManager.getMarkerManager().remove(marker);
        }

        public void add(boolean z7, DefaultAdvancedMarkersClusterRenderer<T>.CreateMarkerTask createMarkerTask) {
            this.lock.lock();
            sendEmptyMessage(0);
            if (z7) {
                this.mOnScreenCreateMarkerTasks.add(createMarkerTask);
            } else {
                this.mCreateMarkerTasks.add(createMarkerTask);
            }
            this.lock.unlock();
        }

        public void animate(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.lock.lock();
            this.mAnimationTasks.add(new AnimationTask(markerWithPosition, latLng, latLng2));
            this.lock.unlock();
        }

        public void animateThenRemove(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.lock.lock();
            DefaultAdvancedMarkersClusterRenderer<T>.AnimationTask animationTask = new AnimationTask(markerWithPosition, latLng, latLng2);
            animationTask.removeOnAnimationComplete(DefaultAdvancedMarkersClusterRenderer.this.mClusterManager.getMarkerManager());
            this.mAnimationTasks.add(animationTask);
            this.lock.unlock();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (!this.mListenerAdded) {
                Looper.myQueue().addIdleHandler(this);
                this.mListenerAdded = true;
            }
            removeMessages(0);
            this.lock.lock();
            for (int i8 = 0; i8 < 10; i8++) {
                try {
                    performNextTask();
                } catch (Throwable th) {
                    this.lock.unlock();
                    throw th;
                }
            }
            if (isBusy()) {
                sendEmptyMessageDelayed(0, 10L);
            } else {
                this.mListenerAdded = false;
                Looper.myQueue().removeIdleHandler(this);
                this.busyCondition.signalAll();
            }
            this.lock.unlock();
        }

        public boolean isBusy() {
            boolean z7;
            try {
                this.lock.lock();
                if (this.mCreateMarkerTasks.isEmpty() && this.mOnScreenCreateMarkerTasks.isEmpty() && this.mOnScreenRemoveMarkerTasks.isEmpty() && this.mRemoveMarkerTasks.isEmpty()) {
                    if (this.mAnimationTasks.isEmpty()) {
                        z7 = false;
                        return z7;
                    }
                }
                z7 = true;
                return z7;
            } finally {
                this.lock.unlock();
            }
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        public void remove(boolean z7, Marker marker) {
            this.lock.lock();
            sendEmptyMessage(0);
            if (z7) {
                this.mOnScreenRemoveMarkerTasks.add(marker);
            } else {
                this.mRemoveMarkerTasks.add(marker);
            }
            this.lock.unlock();
        }

        public void waitUntilFree() {
            while (isBusy()) {
                sendEmptyMessage(0);
                this.lock.lock();
                try {
                    try {
                        if (isBusy()) {
                            this.busyCondition.await();
                        }
                    } catch (InterruptedException e8) {
                        throw new RuntimeException(e8);
                    }
                } finally {
                    this.lock.unlock();
                }
            }
        }

        private MarkerModifier() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.busyCondition = reentrantLock.newCondition();
            this.mCreateMarkerTasks = new LinkedList();
            this.mOnScreenCreateMarkerTasks = new LinkedList();
            this.mRemoveMarkerTasks = new LinkedList();
            this.mOnScreenRemoveMarkerTasks = new LinkedList();
            this.mAnimationTasks = new LinkedList();
        }
    }

    private static class MarkerWithPosition {
        private final Marker marker;
        private LatLng position;

        public boolean equals(Object obj) {
            if (obj instanceof MarkerWithPosition) {
                return this.marker.equals(((MarkerWithPosition) obj).marker);
            }
            return false;
        }

        public int hashCode() {
            return this.marker.hashCode();
        }

        private MarkerWithPosition(Marker marker) {
            this.marker = marker;
            this.position = marker.getPosition();
        }
    }

    private class RenderTask implements Runnable {
        final Set<? extends Cluster<T>> clusters;
        private Runnable mCallback;
        private float mMapZoom;
        private Projection mProjection;
        private SphericalMercatorProjection mSphericalMercatorProjection;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            LatLngBounds build;
            ArrayList arrayList;
            DefaultAdvancedMarkersClusterRenderer defaultAdvancedMarkersClusterRenderer = DefaultAdvancedMarkersClusterRenderer.this;
            if (!defaultAdvancedMarkersClusterRenderer.shouldRender(defaultAdvancedMarkersClusterRenderer.immutableOf(defaultAdvancedMarkersClusterRenderer.mClusters), DefaultAdvancedMarkersClusterRenderer.this.immutableOf(this.clusters))) {
                this.mCallback.run();
                return;
            }
            ArrayList arrayList2 = null;
            MarkerModifier markerModifier = new MarkerModifier();
            float f8 = this.mMapZoom;
            boolean z7 = f8 > DefaultAdvancedMarkersClusterRenderer.this.mZoom;
            float f9 = f8 - DefaultAdvancedMarkersClusterRenderer.this.mZoom;
            Set<MarkerWithPosition> set = DefaultAdvancedMarkersClusterRenderer.this.mMarkers;
            try {
                build = this.mProjection.getVisibleRegion().latLngBounds;
            } catch (Exception e8) {
                e8.printStackTrace();
                build = LatLngBounds.builder().include(new LatLng(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON)).build();
            }
            if (DefaultAdvancedMarkersClusterRenderer.this.mClusters == null || !DefaultAdvancedMarkersClusterRenderer.this.mAnimate) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Cluster<T> cluster : DefaultAdvancedMarkersClusterRenderer.this.mClusters) {
                    if (DefaultAdvancedMarkersClusterRenderer.this.shouldRenderAsCluster(cluster) && build.contains(cluster.getPosition())) {
                        arrayList.add(this.mSphericalMercatorProjection.toPoint(cluster.getPosition()));
                    }
                }
            }
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (Cluster<T> cluster2 : this.clusters) {
                boolean contains = build.contains(cluster2.getPosition());
                if (z7 && contains && DefaultAdvancedMarkersClusterRenderer.this.mAnimate) {
                    Point findClosestCluster = DefaultAdvancedMarkersClusterRenderer.this.findClosestCluster(arrayList, this.mSphericalMercatorProjection.toPoint(cluster2.getPosition()));
                    if (findClosestCluster != null) {
                        markerModifier.add(true, new CreateMarkerTask(cluster2, newSetFromMap, this.mSphericalMercatorProjection.toLatLng(findClosestCluster)));
                    } else {
                        markerModifier.add(true, new CreateMarkerTask(cluster2, newSetFromMap, null));
                    }
                } else {
                    markerModifier.add(contains, new CreateMarkerTask(cluster2, newSetFromMap, null));
                }
            }
            markerModifier.waitUntilFree();
            set.removeAll(newSetFromMap);
            if (DefaultAdvancedMarkersClusterRenderer.this.mAnimate) {
                arrayList2 = new ArrayList();
                for (Cluster<T> cluster3 : this.clusters) {
                    if (DefaultAdvancedMarkersClusterRenderer.this.shouldRenderAsCluster(cluster3) && build.contains(cluster3.getPosition())) {
                        arrayList2.add(this.mSphericalMercatorProjection.toPoint(cluster3.getPosition()));
                    }
                }
            }
            for (MarkerWithPosition markerWithPosition : set) {
                boolean contains2 = build.contains(markerWithPosition.position);
                if (z7 || f9 <= -3.0f || !contains2 || !DefaultAdvancedMarkersClusterRenderer.this.mAnimate) {
                    markerModifier.remove(contains2, markerWithPosition.marker);
                } else {
                    Point findClosestCluster2 = DefaultAdvancedMarkersClusterRenderer.this.findClosestCluster(arrayList2, this.mSphericalMercatorProjection.toPoint(markerWithPosition.position));
                    if (findClosestCluster2 != null) {
                        markerModifier.animateThenRemove(markerWithPosition, markerWithPosition.position, this.mSphericalMercatorProjection.toLatLng(findClosestCluster2));
                    } else {
                        markerModifier.remove(true, markerWithPosition.marker);
                    }
                }
            }
            markerModifier.waitUntilFree();
            DefaultAdvancedMarkersClusterRenderer.this.mMarkers = newSetFromMap;
            DefaultAdvancedMarkersClusterRenderer.this.mClusters = this.clusters;
            DefaultAdvancedMarkersClusterRenderer.this.mZoom = f8;
            this.mCallback.run();
        }

        public void setCallback(Runnable runnable) {
            this.mCallback = runnable;
        }

        public void setMapZoom(float f8) {
            this.mMapZoom = f8;
            this.mSphericalMercatorProjection = new SphericalMercatorProjection(Math.pow(2.0d, Math.min(f8, DefaultAdvancedMarkersClusterRenderer.this.mZoom)) * 256.0d);
        }

        public void setProjection(Projection projection) {
            this.mProjection = projection;
        }

        private RenderTask(Set<? extends Cluster<T>> set) {
            this.clusters = set;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    class ViewModifier extends Handler {
        private static final int RUN_TASK = 0;
        private static final int TASK_FINISHED = 1;
        private DefaultAdvancedMarkersClusterRenderer<T>.RenderTask mNextClusters;
        private boolean mViewModificationInProgress;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleMessage$0() {
            sendEmptyMessage(1);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            DefaultAdvancedMarkersClusterRenderer<T>.RenderTask renderTask;
            if (message.what == 1) {
                this.mViewModificationInProgress = false;
                if (this.mNextClusters != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.mViewModificationInProgress || this.mNextClusters == null) {
                return;
            }
            Projection projection = DefaultAdvancedMarkersClusterRenderer.this.mMap.getProjection();
            synchronized (this) {
                renderTask = this.mNextClusters;
                this.mNextClusters = null;
                this.mViewModificationInProgress = true;
            }
            renderTask.setCallback(new Runnable() { // from class: com.google.maps.android.clustering.view.j
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultAdvancedMarkersClusterRenderer.ViewModifier.this.lambda$handleMessage$0();
                }
            });
            renderTask.setProjection(projection);
            renderTask.setMapZoom(DefaultAdvancedMarkersClusterRenderer.this.mMap.getCameraPosition().zoom);
            DefaultAdvancedMarkersClusterRenderer.this.mExecutor.execute(renderTask);
        }

        public void queue(Set<? extends Cluster<T>> set) {
            synchronized (this) {
                this.mNextClusters = new RenderTask(set);
            }
            sendEmptyMessage(0);
        }

        private ViewModifier() {
            this.mViewModificationInProgress = false;
            this.mNextClusters = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultAdvancedMarkersClusterRenderer(Context context, GoogleMap googleMap, ClusterManager<T> clusterManager) {
        this.mMap = googleMap;
        this.mDensity = context.getResources().getDisplayMetrics().density;
        IconGenerator iconGenerator = new IconGenerator(context);
        this.mIconGenerator = iconGenerator;
        iconGenerator.setContentView(makeSquareTextView(context));
        iconGenerator.setTextAppearance(R.style.amu_ClusterIcon_TextAppearance);
        iconGenerator.setBackground(makeClusterBackground());
        this.mClusterManager = clusterManager;
    }

    private static double distanceSquared(Point point, Point point2) {
        double d8 = point.f15120x;
        double d9 = point2.f15120x;
        double d10 = (d8 - d9) * (d8 - d9);
        double d11 = point.f15121y;
        double d12 = point2.f15121y;
        return d10 + ((d11 - d12) * (d11 - d12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Point findClosestCluster(List<Point> list, Point point) {
        Point point2 = null;
        if (list != null && !list.isEmpty()) {
            int maxDistanceBetweenClusteredItems = this.mClusterManager.getAlgorithm().getMaxDistanceBetweenClusteredItems();
            double d8 = maxDistanceBetweenClusteredItems * maxDistanceBetweenClusteredItems;
            for (Point point3 : list) {
                double distanceSquared = distanceSquared(point3, point);
                if (distanceSquared < d8) {
                    point2 = point3;
                    d8 = distanceSquared;
                }
            }
        }
        return point2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<? extends Cluster<T>> immutableOf(Set<? extends Cluster<T>> set) {
        return set != null ? Collections.unmodifiableSet(set) : Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdd$0(Marker marker) {
        ClusterManager.OnClusterItemInfoWindowLongClickListener<T> onClusterItemInfoWindowLongClickListener = this.mItemInfoWindowLongClickListener;
        if (onClusterItemInfoWindowLongClickListener != null) {
            onClusterItemInfoWindowLongClickListener.onClusterItemInfoWindowLongClick(this.mMarkerCache.get(marker));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onAdd$1(Marker marker) {
        ClusterManager.OnClusterClickListener<T> onClusterClickListener = this.mClickListener;
        return onClusterClickListener != null && onClusterClickListener.onClusterClick(this.mClusterMarkerCache.get(marker));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdd$2(Marker marker) {
        ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener = this.mInfoWindowClickListener;
        if (onClusterInfoWindowClickListener != null) {
            onClusterInfoWindowClickListener.onClusterInfoWindowClick(this.mClusterMarkerCache.get(marker));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdd$3(Marker marker) {
        ClusterManager.OnClusterInfoWindowLongClickListener<T> onClusterInfoWindowLongClickListener = this.mInfoWindowLongClickListener;
        if (onClusterInfoWindowLongClickListener != null) {
            onClusterInfoWindowLongClickListener.onClusterInfoWindowLongClick(this.mClusterMarkerCache.get(marker));
        }
    }

    private LayerDrawable makeClusterBackground() {
        this.mColoredCircleBackground = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.mColoredCircleBackground});
        int i8 = (int) (this.mDensity * 3.0f);
        layerDrawable.setLayerInset(1, i8, i8, i8, i8);
        return layerDrawable;
    }

    private SquareTextView makeSquareTextView(Context context) {
        SquareTextView squareTextView = new SquareTextView(context);
        squareTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        squareTextView.setId(R.id.amu_text);
        int i8 = (int) (this.mDensity * 12.0f);
        squareTextView.setPadding(i8, i8, i8, i8);
        return squareTextView;
    }

    protected int getBucket(@NonNull Cluster<T> cluster) {
        int size = cluster.getSize();
        int i8 = 0;
        if (size <= BUCKETS[0]) {
            return size;
        }
        while (true) {
            int[] iArr = BUCKETS;
            if (i8 >= iArr.length - 1) {
                return iArr[iArr.length - 1];
            }
            int i9 = i8 + 1;
            if (size < iArr[i9]) {
                return iArr[i8];
            }
            i8 = i9;
        }
    }

    public Cluster<T> getCluster(Marker marker) {
        return this.mClusterMarkerCache.get(marker);
    }

    public T getClusterItem(Marker marker) {
        return this.mMarkerCache.get(marker);
    }

    @NonNull
    protected String getClusterText(int i8) {
        if (i8 < BUCKETS[0]) {
            return String.valueOf(i8);
        }
        return i8 + "+";
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    @StyleRes
    public int getClusterTextAppearance(int i8) {
        return R.style.amu_ClusterIcon_TextAppearance;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public int getColor(int i8) {
        float min = 300.0f - Math.min(i8, 300.0f);
        return Color.HSVToColor(new float[]{((min * min) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    @NonNull
    protected BitmapDescriptor getDescriptorForCluster(@NonNull Cluster<T> cluster) {
        int bucket = getBucket(cluster);
        BitmapDescriptor bitmapDescriptor = this.mIcons.get(bucket);
        if (bitmapDescriptor != null) {
            return bitmapDescriptor;
        }
        this.mColoredCircleBackground.getPaint().setColor(getColor(bucket));
        this.mIconGenerator.setTextAppearance(getClusterTextAppearance(bucket));
        BitmapDescriptor fromBitmap = BitmapDescriptorFactory.fromBitmap(this.mIconGenerator.makeIcon(getClusterText(bucket)));
        this.mIcons.put(bucket, fromBitmap);
        return fromBitmap;
    }

    public Marker getMarker(T t7) {
        return this.mMarkerCache.get((MarkerCache<T>) t7);
    }

    public int getMinClusterSize() {
        return this.mMinClusterSize;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onAdd() {
        this.mClusterManager.getMarkerCollection().setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() { // from class: com.google.maps.android.clustering.view.DefaultAdvancedMarkersClusterRenderer.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public boolean onMarkerClick(@NonNull Marker marker) {
                return DefaultAdvancedMarkersClusterRenderer.this.mItemClickListener != null && DefaultAdvancedMarkersClusterRenderer.this.mItemClickListener.onClusterItemClick((ClusterItem) DefaultAdvancedMarkersClusterRenderer.this.mMarkerCache.get(marker));
            }
        });
        this.mClusterManager.getMarkerCollection().setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() { // from class: com.google.maps.android.clustering.view.DefaultAdvancedMarkersClusterRenderer.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
            public void onInfoWindowClick(@NonNull Marker marker) {
                if (DefaultAdvancedMarkersClusterRenderer.this.mItemInfoWindowClickListener != null) {
                    DefaultAdvancedMarkersClusterRenderer.this.mItemInfoWindowClickListener.onClusterItemInfoWindowClick((ClusterItem) DefaultAdvancedMarkersClusterRenderer.this.mMarkerCache.get(marker));
                }
            }
        });
        this.mClusterManager.getMarkerCollection().setOnInfoWindowLongClickListener(new GoogleMap.OnInfoWindowLongClickListener() { // from class: com.google.maps.android.clustering.view.a
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
            public final void onInfoWindowLongClick(Marker marker) {
                DefaultAdvancedMarkersClusterRenderer.this.lambda$onAdd$0(marker);
            }
        });
        this.mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() { // from class: com.google.maps.android.clustering.view.b
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public final boolean onMarkerClick(Marker marker) {
                boolean lambda$onAdd$1;
                lambda$onAdd$1 = DefaultAdvancedMarkersClusterRenderer.this.lambda$onAdd$1(marker);
                return lambda$onAdd$1;
            }
        });
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() { // from class: com.google.maps.android.clustering.view.c
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
            public final void onInfoWindowClick(Marker marker) {
                DefaultAdvancedMarkersClusterRenderer.this.lambda$onAdd$2(marker);
            }
        });
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowLongClickListener(new GoogleMap.OnInfoWindowLongClickListener() { // from class: com.google.maps.android.clustering.view.d
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
            public final void onInfoWindowLongClick(Marker marker) {
                DefaultAdvancedMarkersClusterRenderer.this.lambda$onAdd$3(marker);
            }
        });
    }

    protected void onBeforeClusterItemRendered(@NonNull T t7, @NonNull AdvancedMarkerOptions advancedMarkerOptions) {
        if (t7.getTitle() != null && t7.getSnippet() != null) {
            advancedMarkerOptions.title(t7.getTitle());
            advancedMarkerOptions.snippet(t7.getSnippet());
        } else if (t7.getTitle() != null) {
            advancedMarkerOptions.title(t7.getTitle());
        } else if (t7.getSnippet() != null) {
            advancedMarkerOptions.title(t7.getSnippet());
        }
    }

    protected void onBeforeClusterRendered(@NonNull Cluster<T> cluster, @NonNull AdvancedMarkerOptions advancedMarkerOptions) {
        advancedMarkerOptions.icon(getDescriptorForCluster(cluster));
    }

    protected void onClusterItemRendered(@NonNull T t7, @NonNull Marker marker) {
    }

    protected void onClusterItemUpdated(@NonNull T t7, @NonNull Marker marker) {
        boolean z7 = true;
        boolean z8 = false;
        if (t7.getTitle() != null && t7.getSnippet() != null) {
            if (!t7.getTitle().equals(marker.getTitle())) {
                marker.setTitle(t7.getTitle());
                z8 = true;
            }
            if (t7.getSnippet().equals(marker.getSnippet())) {
                z7 = z8;
            } else {
                marker.setSnippet(t7.getSnippet());
            }
        } else if (t7.getSnippet() != null && !t7.getSnippet().equals(marker.getTitle())) {
            marker.setTitle(t7.getSnippet());
        } else if (t7.getTitle() == null || t7.getTitle().equals(marker.getTitle())) {
            z7 = false;
        } else {
            marker.setTitle(t7.getTitle());
        }
        if (!marker.getPosition().equals(t7.getPosition())) {
            marker.setPosition(t7.getPosition());
            if (t7.getZIndex() != null) {
                marker.setZIndex(t7.getZIndex().floatValue());
            }
        } else if (!z7) {
            return;
        }
        if (marker.isInfoWindowShown()) {
            marker.showInfoWindow();
        }
    }

    protected void onClusterRendered(@NonNull Cluster<T> cluster, @NonNull Marker marker) {
    }

    protected void onClusterUpdated(@NonNull Cluster<T> cluster, @NonNull AdvancedMarker advancedMarker) {
        advancedMarker.setIcon(getDescriptorForCluster(cluster));
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onClustersChanged(Set<? extends Cluster<T>> set) {
        this.mViewModifier.queue(set);
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onRemove() {
        this.mClusterManager.getMarkerCollection().setOnMarkerClickListener(null);
        this.mClusterManager.getMarkerCollection().setOnInfoWindowClickListener(null);
        this.mClusterManager.getMarkerCollection().setOnInfoWindowLongClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowLongClickListener(null);
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setAnimation(boolean z7) {
        this.mAnimate = z7;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setAnimationDuration(long j8) {
        this.mAnimationDurationMs = j8;
    }

    public void setMinClusterSize(int i8) {
        this.mMinClusterSize = i8;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterClickListener(ClusterManager.OnClusterClickListener<T> onClusterClickListener) {
        this.mClickListener = onClusterClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterInfoWindowClickListener(ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
        this.mInfoWindowClickListener = onClusterInfoWindowClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterInfoWindowLongClickListener(ClusterManager.OnClusterInfoWindowLongClickListener<T> onClusterInfoWindowLongClickListener) {
        this.mInfoWindowLongClickListener = onClusterInfoWindowLongClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemClickListener(ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.mItemClickListener = onClusterItemClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemInfoWindowClickListener(ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
        this.mItemInfoWindowClickListener = onClusterItemInfoWindowClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemInfoWindowLongClickListener(ClusterManager.OnClusterItemInfoWindowLongClickListener<T> onClusterItemInfoWindowLongClickListener) {
        this.mItemInfoWindowLongClickListener = onClusterItemInfoWindowLongClickListener;
    }

    protected boolean shouldRender(@NonNull Set<? extends Cluster<T>> set, @NonNull Set<? extends Cluster<T>> set2) {
        return !set2.equals(set);
    }

    protected boolean shouldRenderAsCluster(@NonNull Cluster<T> cluster) {
        return cluster.getSize() >= this.mMinClusterSize;
    }

    public Marker getMarker(Cluster<T> cluster) {
        return this.mClusterMarkerCache.get((MarkerCache<Cluster<T>>) cluster);
    }
}
