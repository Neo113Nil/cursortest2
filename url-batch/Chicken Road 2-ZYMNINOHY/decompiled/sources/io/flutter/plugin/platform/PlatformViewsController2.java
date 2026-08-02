package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.AttachedSurfaceControl;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.startapp.sdk.internal.F;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.flutter.Log;
import io.flutter.embedding.android.AndroidTouchProcessor;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.android.MotionEventTracker;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.systemchannels.PlatformViewCreationRequest;
import io.flutter.embedding.engine.systemchannels.PlatformViewTouch;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.view.AccessibilityBridge;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class PlatformViewsController2 implements PlatformViewsAccessibilityDelegate {
    private static final String TAG = "PlatformViewsController2";
    private AndroidTouchProcessor androidTouchProcessor;
    private Context context;
    private FlutterView flutterView;
    private PlatformViewsChannel2 platformViewsChannel;
    private PlatformViewRegistryImpl registry;
    private TextInputPlugin textInputPlugin;
    private FlutterJNI flutterJNI = null;
    private Surface overlayerSurface = null;
    private SurfaceControl overlaySurfaceControl = null;
    private final HashSet<Integer> viewsWithPendingSurfaceCallback = new HashSet<>();
    final PlatformViewsChannel2.PlatformViewsHandler channelHandler = new PlatformViewsChannel2.PlatformViewsHandler() { // from class: io.flutter.plugin.platform.PlatformViewsController2.2
        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void clearFocus(int i4) {
            PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i4);
            if (platformView == null) {
                Log.e(PlatformViewsController2.TAG, "Clearing focus on an unknown view with id: " + i4);
                return;
            }
            View view = platformView.getView();
            if (view != null) {
                view.clearFocus();
                return;
            }
            Log.e(PlatformViewsController2.TAG, "Clearing focus on a null view with id: " + i4);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void createPlatformView(PlatformViewCreationRequest platformViewCreationRequest) {
            PlatformViewsController2.this.createFlutterPlatformView(platformViewCreationRequest);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void dispose(int i4) {
            PlatformViewsController2.this.viewsWithPendingSurfaceCallback.remove(Integer.valueOf(i4));
            PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i4);
            if (platformView == null) {
                Log.e(PlatformViewsController2.TAG, "Disposing unknown platform view with id: " + i4);
                return;
            }
            if (platformView.getView() != null) {
                View view = platformView.getView();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            PlatformViewsController2.this.platformViews.remove(i4);
            try {
                platformView.dispose();
            } catch (RuntimeException e4) {
                Log.e(PlatformViewsController2.TAG, "Disposing platform view threw an exception", e4);
            }
            FlutterMutatorView flutterMutatorView = (FlutterMutatorView) PlatformViewsController2.this.platformViewParent.get(i4);
            if (flutterMutatorView != null) {
                flutterMutatorView.removeAllViews();
                flutterMutatorView.unsetOnDescendantFocusChangeListener();
                ViewGroup viewGroup2 = (ViewGroup) flutterMutatorView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(flutterMutatorView);
                }
                PlatformViewsController2.this.platformViewParent.remove(i4);
            }
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public boolean isSurfaceControlEnabled() {
            return PlatformViewsController2.this.isHcppEnabled();
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void onTouch(PlatformViewTouch platformViewTouch) {
            int i4 = platformViewTouch.viewId;
            float f4 = PlatformViewsController2.this.context.getResources().getDisplayMetrics().density;
            PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i4);
            if (platformView == null) {
                Log.e(PlatformViewsController2.TAG, "Sending touch to an unknown view with id: " + i4);
                return;
            }
            View view = platformView.getView();
            if (view != null) {
                view.dispatchTouchEvent(PlatformViewsController2.this.toMotionEvent(f4, platformViewTouch));
                return;
            }
            Log.e(PlatformViewsController2.TAG, "Sending touch to a null view with id: " + i4);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void setDirection(int i4, int i5) {
            PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i4);
            if (platformView == null) {
                Log.e(PlatformViewsController2.TAG, "Setting direction to an unknown view with id: " + i4);
                return;
            }
            View view = platformView.getView();
            if (view != null) {
                view.setLayoutDirection(i5);
                return;
            }
            Log.e(PlatformViewsController2.TAG, "Setting direction to a null view with id: " + i4);
        }
    };
    private final AccessibilityEventsDelegate accessibilityEventsDelegate = new AccessibilityEventsDelegate();
    private final SparseArray<PlatformView> platformViews = new SparseArray<>();
    private final SparseArray<FlutterMutatorView> platformViewParent = new SparseArray<>();
    private final ArrayList<SurfaceControl.Transaction> pendingTransactions = new ArrayList<>();
    private final ArrayList<SurfaceControl.Transaction> activeTransactions = new ArrayList<>();
    private final MotionEventTracker motionEventTracker = MotionEventTracker.getInstance();

    private SurfaceHolder.Callback createSurfaceClipCallback(final SurfaceView surfaceView, final float f4, final Rect rect, final int i4) {
        return new SurfaceHolder.Callback() { // from class: io.flutter.plugin.platform.PlatformViewsController2.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i5, int i6, int i7) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                SurfaceControl surfaceControl;
                boolean isValid;
                SurfaceControl.Transaction alpha;
                surfaceControl = surfaceView.getSurfaceControl();
                if (surfaceControl != null) {
                    isValid = surfaceControl.isValid();
                    if (isValid) {
                        alpha = PlatformViewsController2.this.createTransaction().setAlpha(surfaceControl, f4);
                        alpha.setCrop(surfaceControl, rect);
                        PlatformViewsController2.this.flutterJNI.scheduleFrame();
                        PlatformViewsController2.this.viewsWithPendingSurfaceCallback.remove(Integer.valueOf(i4));
                        surfaceView.getHolder().removeCallback(this);
                    }
                }
                Log.i(PlatformViewsController2.TAG, "Failed to apply clipping to SurfaceView: " + surfaceView.getId() + " - the SurfaceControl was null or invalid during surfaceCreated callback.");
                PlatformViewsController2.this.flutterJNI.scheduleFrame();
                PlatformViewsController2.this.viewsWithPendingSurfaceCallback.remove(Integer.valueOf(i4));
                surfaceView.getHolder().removeCallback(this);
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                PlatformViewsController2.this.viewsWithPendingSurfaceCallback.remove(Integer.valueOf(i4));
                surfaceView.getHolder().removeCallback(this);
            }
        };
    }

    private void disposeAllViews() {
        while (this.platformViews.size() > 0) {
            this.channelHandler.dispose(this.platformViews.keyAt(0));
        }
    }

    private float getDisplayDensity() {
        return this.context.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializePlatformViewIfNeeded$0(int i4, View view, boolean z) {
        if (z) {
            this.platformViewsChannel.invokeViewFocused(i4);
            return;
        }
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin != null) {
            textInputPlugin.clearPlatformViewClient(i4);
        }
    }

    private void lockInputConnection(VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.lockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionLocked();
    }

    private void maybeApplyClipToSurfaceView(SurfaceView surfaceView, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack, int i8) {
        SurfaceControl surfaceControl;
        boolean isValid;
        SurfaceControl.Transaction alpha;
        RectF rectF = new RectF(i4, i5, i6 + i4, i7 + i5);
        Rect rect = new Rect();
        rectF.roundOut(rect);
        List<Path> finalClippingPaths = flutterMutatorsStack.getFinalClippingPaths();
        if (finalClippingPaths != null && !finalClippingPaths.isEmpty()) {
            RectF rectF2 = new RectF();
            Iterator<Path> it = finalClippingPaths.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                it.next().computeBounds(rectF2, true);
                Rect rect2 = new Rect();
                rectF2.roundOut(rect2);
                if (!rect.intersect(rect2)) {
                    rect.setEmpty();
                    break;
                }
            }
        }
        rect.offset(-i4, -i5);
        if (rect.width() < 0 || rect.height() < 0) {
            rect.setEmpty();
        }
        float finalOpacity = flutterMutatorsStack.getFinalOpacity();
        surfaceControl = surfaceView.getSurfaceControl();
        if (surfaceControl == null) {
            if (this.viewsWithPendingSurfaceCallback.contains(Integer.valueOf(i8))) {
                return;
            }
            this.viewsWithPendingSurfaceCallback.add(Integer.valueOf(i8));
            surfaceView.getHolder().addCallback(createSurfaceClipCallback(surfaceView, finalOpacity, rect, i8));
            return;
        }
        isValid = surfaceControl.isValid();
        if (isValid) {
            alpha = createTransaction().setAlpha(surfaceControl, finalOpacity);
            alpha.setCrop(surfaceControl, rect);
        } else {
            Log.i(TAG, "Skipping applying clip to SurfaceView: " + surfaceView.getId() + " because it has an invalid SurfaceControl.");
        }
    }

    private void maybeInvokeOnFlutterViewAttached(PlatformView platformView) {
        FlutterView flutterView = this.flutterView;
        if (flutterView == null) {
            Log.i(TAG, "null flutterView");
        } else {
            platformView.onFlutterViewAttached(flutterView);
        }
    }

    private static MotionEvent.PointerCoords parsePointerCoords(Object obj, float f4) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        double d4 = f4;
        pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d4);
        pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d4);
        pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d4);
        pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d4);
        pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d4);
        pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d4);
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> parsePointerCoordsList(Object obj, float f4) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(parsePointerCoords(it.next(), f4));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties parsePointerProperties(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> parsePointerPropertiesList(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(parsePointerProperties(it.next()));
        }
        return arrayList;
    }

    private int toLogicalPixels(double d4, float f4) {
        return (int) Math.round(d4 / f4);
    }

    private int toPhysicalPixels(double d4) {
        return (int) Math.round(d4 * getDisplayDensity());
    }

    private static void translateMotionEvent(MotionEvent motionEvent, MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length < 1) {
            return;
        }
        motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
    }

    private void unlockInputConnection(VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.unlockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionUnlocked();
    }

    private static boolean validateDirection(int i4) {
        return i4 == 0 || i4 == 1;
    }

    public void applyTransactions() {
        SurfaceControl.Transaction k4 = F.k();
        for (int i4 = 0; i4 < this.pendingTransactions.size(); i4++) {
            k4 = k4.merge(F.m(this.pendingTransactions.get(i4)));
        }
        k4.apply();
        this.pendingTransactions.clear();
    }

    public void attach(Context context, DartExecutor dartExecutor) {
        if (this.context != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.context = context;
        PlatformViewsChannel2 platformViewsChannel2 = new PlatformViewsChannel2(dartExecutor);
        this.platformViewsChannel = platformViewsChannel2;
        platformViewsChannel2.setPlatformViewsHandler(this.channelHandler);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void attachAccessibilityBridge(AccessibilityBridge accessibilityBridge) {
        this.accessibilityEventsDelegate.setAccessibilityBridge(accessibilityBridge);
    }

    public void attachTextInputPlugin(TextInputPlugin textInputPlugin) {
        this.textInputPlugin = textInputPlugin;
    }

    public void attachToFlutterRenderer(FlutterRenderer flutterRenderer) {
        this.androidTouchProcessor = new AndroidTouchProcessor(flutterRenderer, true);
    }

    public void attachToView(FlutterView flutterView) {
        this.flutterView = flutterView;
        for (int i4 = 0; i4 < this.platformViewParent.size(); i4++) {
            this.flutterView.addView(this.platformViewParent.valueAt(i4));
        }
        for (int i5 = 0; i5 < this.platformViews.size(); i5++) {
            this.platformViews.valueAt(i5).onFlutterViewAttached(this.flutterView);
        }
    }

    public PlatformView createFlutterPlatformView(PlatformViewCreationRequest platformViewCreationRequest) {
        PlatformViewFactory factory = this.registry.getFactory(platformViewCreationRequest.viewType);
        if (factory == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + platformViewCreationRequest.viewType);
        }
        PlatformView create = factory.create(this.context, platformViewCreationRequest.viewId, platformViewCreationRequest.params != null ? factory.getCreateArgsCodec().decodeMessage(platformViewCreationRequest.params) : null);
        View view = create.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(platformViewCreationRequest.direction);
        this.platformViews.put(platformViewCreationRequest.viewId, create);
        maybeInvokeOnFlutterViewAttached(create);
        return create;
    }

    public FlutterOverlaySurface createOverlaySurface() {
        SurfaceControl build;
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction buildReparentTransaction;
        if (this.overlayerSurface == null) {
            SurfaceControl.Builder j4 = F.j();
            j4.setBufferSize(this.flutterView.getWidth(), this.flutterView.getHeight());
            j4.setFormat(1);
            j4.setName("Flutter Overlay Surface");
            j4.setOpaque(false);
            j4.setHidden(false);
            build = j4.build();
            rootSurfaceControl = this.flutterView.getRootSurfaceControl();
            buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
            buildReparentTransaction.apply();
            this.overlayerSurface = F.i(build);
            this.overlaySurfaceControl = build;
        }
        return new FlutterOverlaySurface(0, this.overlayerSurface);
    }

    public SurfaceControl.Transaction createTransaction() {
        SurfaceControl.Transaction k4 = F.k();
        this.pendingTransactions.add(k4);
        return k4;
    }

    public void destroyOverlaySurface() {
        Surface surface = this.overlayerSurface;
        if (surface != null) {
            surface.release();
            this.overlayerSurface = null;
            this.overlaySurfaceControl = null;
        }
    }

    public void detach() {
        PlatformViewsChannel2 platformViewsChannel2 = this.platformViewsChannel;
        if (platformViewsChannel2 != null) {
            platformViewsChannel2.setPlatformViewsHandler(null);
        }
        destroyOverlaySurface();
        this.platformViewsChannel = null;
        this.context = null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void detachAccessibilityBridge() {
        this.accessibilityEventsDelegate.setAccessibilityBridge(null);
    }

    public void detachFromView() {
        for (int i4 = 0; i4 < this.platformViewParent.size(); i4++) {
            this.flutterView.removeView(this.platformViewParent.valueAt(i4));
        }
        destroyOverlaySurface();
        this.flutterView = null;
        for (int i5 = 0; i5 < this.platformViews.size(); i5++) {
            this.platformViews.valueAt(i5).onFlutterViewDetached();
        }
    }

    public void detachTextInputPlugin() {
        this.textInputPlugin = null;
    }

    public void disposePlatformView(int i4) {
        this.channelHandler.dispose(i4);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public View getPlatformViewById(int i4) {
        PlatformView platformView = this.platformViews.get(i4);
        if (platformView == null) {
            return null;
        }
        return platformView.getView();
    }

    public PlatformViewRegistry getRegistry() {
        return this.registry;
    }

    public void hideOverlaySurface() {
        if (this.overlaySurfaceControl == null) {
            return;
        }
        createTransaction().setVisibility(this.overlaySurfaceControl, false);
    }

    public void hidePlatformView(int i4) {
        if (initializePlatformViewIfNeeded(i4)) {
            this.platformViewParent.get(i4).setVisibility(8);
        }
    }

    public boolean initializePlatformViewIfNeeded(int i4) {
        PlatformView platformView = this.platformViews.get(i4);
        if (platformView == null) {
            return false;
        }
        if (this.platformViewParent.get(i4) != null) {
            return true;
        }
        View view = platformView.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Context context = this.context;
        FlutterMutatorView flutterMutatorView = new FlutterMutatorView(context, context.getResources().getDisplayMetrics().density, this.androidTouchProcessor);
        flutterMutatorView.setOnDescendantFocusChangeListener(new b(this, i4, 1));
        this.platformViewParent.put(i4, flutterMutatorView);
        view.setImportantForAccessibility(4);
        flutterMutatorView.addView(view);
        this.flutterView.addView(flutterMutatorView);
        return true;
    }

    public boolean isHcppEnabled() {
        FlutterJNI flutterJNI = this.flutterJNI;
        if (flutterJNI == null) {
            return false;
        }
        return flutterJNI.IsSurfaceControlEnabled();
    }

    public void onDetachedFromJNI() {
        disposeAllViews();
    }

    public void onDisplayPlatformView(int i4, int i5, int i6, int i7, int i8, int i9, int i10, FlutterMutatorsStack flutterMutatorsStack) {
        if (initializePlatformViewIfNeeded(i4)) {
            FlutterMutatorView flutterMutatorView = this.platformViewParent.get(i4);
            flutterMutatorView.readyToDisplay(flutterMutatorsStack, i5, i6, i7, i8);
            flutterMutatorView.setVisibility(0);
            flutterMutatorView.bringToFront();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i9, i10, 51);
            View view = this.platformViews.get(i4).getView();
            if (view != null) {
                view.setLayoutParams(layoutParams);
                view.bringToFront();
                if (view instanceof SurfaceView) {
                    maybeApplyClipToSurfaceView((SurfaceView) view, i5, i6, i7, i8, flutterMutatorsStack, i4);
                }
            }
        }
    }

    public void onEndFrame() {
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction k4 = F.k();
        for (int i4 = 0; i4 < this.activeTransactions.size(); i4++) {
            k4 = k4.merge(F.m(this.activeTransactions.get(i4)));
        }
        this.activeTransactions.clear();
        this.flutterView.invalidate();
        rootSurfaceControl = this.flutterView.getRootSurfaceControl();
        rootSurfaceControl.applyTransactionOnDraw(k4);
    }

    public void onPreEngineRestart() {
        disposeAllViews();
    }

    public void setFlutterJNI(FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    public void setRegistry(PlatformViewRegistry platformViewRegistry) {
        this.registry = (PlatformViewRegistryImpl) platformViewRegistry;
    }

    public void showOverlaySurface() {
        if (this.overlaySurfaceControl == null) {
            return;
        }
        createTransaction().setVisibility(this.overlaySurfaceControl, true);
    }

    public synchronized void swapTransactions() {
        this.activeTransactions.clear();
        this.activeTransactions.addAll(this.pendingTransactions);
        this.pendingTransactions.clear();
    }

    public MotionEvent toMotionEvent(float f4, PlatformViewTouch platformViewTouch) {
        MotionEvent pop = this.motionEventTracker.pop(MotionEventTracker.MotionEventId.from(platformViewTouch.motionEventId));
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) parsePointerCoordsList(platformViewTouch.rawPointerCoords, f4).toArray(new MotionEvent.PointerCoords[platformViewTouch.pointerCount]);
        if (pop != null) {
            translateMotionEvent(pop, pointerCoordsArr);
            return pop;
        }
        return MotionEvent.obtain(platformViewTouch.downTime.longValue(), platformViewTouch.eventTime.longValue(), platformViewTouch.action, platformViewTouch.pointerCount, (MotionEvent.PointerProperties[]) parsePointerPropertiesList(platformViewTouch.rawPointerPropertiesList).toArray(new MotionEvent.PointerProperties[platformViewTouch.pointerCount]), pointerCoordsArr, platformViewTouch.metaState, platformViewTouch.buttonState, platformViewTouch.xPrecision, platformViewTouch.yPrecision, platformViewTouch.deviceId, platformViewTouch.edgeFlags, platformViewTouch.source, platformViewTouch.flags);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public boolean usesVirtualDisplay(int i4) {
        return false;
    }

    private int toLogicalPixels(double d4) {
        return toLogicalPixels(d4, getDisplayDensity());
    }
}
