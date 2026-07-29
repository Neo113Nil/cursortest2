package com.mopub.nativeads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Views;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
class VisibilityTracker {

    @VisibleForTesting
    static final int NUM_ACCESSES_BEFORE_TRIMMING = 50;
    private static final int VISIBILITY_THROTTLE_MILLIS = 100;
    private long mAccessCounter;
    private boolean mIsVisibilityScheduled;

    @VisibleForTesting
    final ViewTreeObserver.OnPreDrawListener mOnPreDrawListener;
    private final Map<View, TrackingInfo> mTrackedViews;
    private final ArrayList<View> mTrimmedViews;
    private final VisibilityChecker mVisibilityChecker;
    private final Handler mVisibilityHandler;
    private final VisibilityRunnable mVisibilityRunnable;
    private VisibilityTrackerListener mVisibilityTrackerListener;

    @VisibleForTesting
    WeakReference<ViewTreeObserver> mWeakViewTreeObserver;

    interface VisibilityTrackerListener {
        void onVisibilityChanged(List<View> list, List<View> list2);
    }

    static class TrackingInfo {
        long mAccessOrder;
        int mMaxInvisiblePercent;
        int mMinViewablePercent;
        Integer mMinVisiblePx;
        View mRootView;

        TrackingInfo() {
        }
    }

    public VisibilityTracker(Context context) {
        this(context, new WeakHashMap(10), new VisibilityChecker(), new Handler());
    }

    @VisibleForTesting
    VisibilityTracker(Context context, Map<View, TrackingInfo> map, VisibilityChecker visibilityChecker, Handler handler) {
        this.mAccessCounter = 0L;
        this.mTrackedViews = map;
        this.mVisibilityChecker = visibilityChecker;
        this.mVisibilityHandler = handler;
        this.mVisibilityRunnable = new VisibilityRunnable();
        this.mTrimmedViews = new ArrayList<>(50);
        this.mOnPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.mopub.nativeads.VisibilityTracker.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                VisibilityTracker.this.scheduleVisibilityCheck();
                return true;
            }
        };
        this.mWeakViewTreeObserver = new WeakReference<>(null);
        setViewTreeObserver(context, null);
    }

    private void setViewTreeObserver(Context context, View view) {
        ViewTreeObserver viewTreeObserver = this.mWeakViewTreeObserver.get();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            View topmostView = Views.getTopmostView(context, view);
            if (topmostView == null) {
                MoPubLog.d("Unable to set Visibility Tracker due to no available root view.");
                return;
            }
            ViewTreeObserver viewTreeObserver2 = topmostView.getViewTreeObserver();
            if (!viewTreeObserver2.isAlive()) {
                MoPubLog.w("Visibility Tracker was unable to track views because the root view tree observer was not alive");
            } else {
                this.mWeakViewTreeObserver = new WeakReference<>(viewTreeObserver2);
                viewTreeObserver2.addOnPreDrawListener(this.mOnPreDrawListener);
            }
        }
    }

    void setVisibilityTrackerListener(VisibilityTrackerListener visibilityTrackerListener) {
        this.mVisibilityTrackerListener = visibilityTrackerListener;
    }

    void addView(View view, int i, Integer num) {
        addView(view, view, i, num);
    }

    void addView(View view, View view2, int i, Integer num) {
        addView(view, view2, i, i, num);
    }

    void addView(View view, View view2, int i, int i2, Integer num) {
        setViewTreeObserver(view2.getContext(), view2);
        TrackingInfo trackingInfo = this.mTrackedViews.get(view2);
        if (trackingInfo == null) {
            trackingInfo = new TrackingInfo();
            this.mTrackedViews.put(view2, trackingInfo);
            scheduleVisibilityCheck();
        }
        int min = Math.min(i2, i);
        trackingInfo.mRootView = view;
        trackingInfo.mMinViewablePercent = i;
        trackingInfo.mMaxInvisiblePercent = min;
        trackingInfo.mAccessOrder = this.mAccessCounter;
        trackingInfo.mMinVisiblePx = num;
        this.mAccessCounter++;
        if (this.mAccessCounter % 50 == 0) {
            trimTrackedViews(this.mAccessCounter - 50);
        }
    }

    private void trimTrackedViews(long j) {
        for (Map.Entry<View, TrackingInfo> entry : this.mTrackedViews.entrySet()) {
            if (entry.getValue().mAccessOrder < j) {
                this.mTrimmedViews.add(entry.getKey());
            }
        }
        Iterator<View> it = this.mTrimmedViews.iterator();
        while (it.hasNext()) {
            removeView(it.next());
        }
        this.mTrimmedViews.clear();
    }

    void removeView(View view) {
        this.mTrackedViews.remove(view);
    }

    void clear() {
        this.mTrackedViews.clear();
        this.mVisibilityHandler.removeMessages(0);
        this.mIsVisibilityScheduled = false;
    }

    void destroy() {
        clear();
        ViewTreeObserver viewTreeObserver = this.mWeakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mWeakViewTreeObserver.clear();
        this.mVisibilityTrackerListener = null;
    }

    void scheduleVisibilityCheck() {
        if (this.mIsVisibilityScheduled) {
            return;
        }
        this.mIsVisibilityScheduled = true;
        this.mVisibilityHandler.postDelayed(this.mVisibilityRunnable, 100L);
    }

    class VisibilityRunnable implements Runnable {
        private final ArrayList<View> mInvisibleViews = new ArrayList<>();
        private final ArrayList<View> mVisibleViews = new ArrayList<>();

        VisibilityRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VisibilityTracker.this.mIsVisibilityScheduled = false;
            for (Map.Entry entry : VisibilityTracker.this.mTrackedViews.entrySet()) {
                View view = (View) entry.getKey();
                int i = ((TrackingInfo) entry.getValue()).mMinViewablePercent;
                int i2 = ((TrackingInfo) entry.getValue()).mMaxInvisiblePercent;
                Integer num = ((TrackingInfo) entry.getValue()).mMinVisiblePx;
                View view2 = ((TrackingInfo) entry.getValue()).mRootView;
                if (!VisibilityTracker.this.mVisibilityChecker.isVisible(view2, view, i, num)) {
                    if (!VisibilityTracker.this.mVisibilityChecker.isVisible(view2, view, i2, null)) {
                        this.mInvisibleViews.add(view);
                    }
                } else {
                    this.mVisibleViews.add(view);
                }
            }
            if (VisibilityTracker.this.mVisibilityTrackerListener != null) {
                VisibilityTracker.this.mVisibilityTrackerListener.onVisibilityChanged(this.mVisibleViews, this.mInvisibleViews);
            }
            this.mVisibleViews.clear();
            this.mInvisibleViews.clear();
        }
    }

    static class VisibilityChecker {
        private final Rect mClipRect = new Rect();

        VisibilityChecker() {
        }

        boolean hasRequiredTimeElapsed(long j, int i) {
            return SystemClock.uptimeMillis() - j >= ((long) i);
        }

        boolean isVisible(View view, View view2, int i, Integer num) {
            if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || !view2.getGlobalVisibleRect(this.mClipRect)) {
                return false;
            }
            long height = this.mClipRect.height() * this.mClipRect.width();
            long height2 = view2.getHeight() * view2.getWidth();
            if (height2 <= 0) {
                return false;
            }
            return (num == null || num.intValue() <= 0) ? height * 100 >= ((long) i) * height2 : height >= ((long) num.intValue());
        }
    }
}
