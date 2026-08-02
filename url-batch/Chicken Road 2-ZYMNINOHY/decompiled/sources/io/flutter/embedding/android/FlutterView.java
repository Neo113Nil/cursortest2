package io.flutter.embedding.android;

import E.AbstractC0003d;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import io.flutter.Log;
import io.flutter.embedding.android.FlutterImageView;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.renderer.FlutterUiResizeListener;
import io.flutter.embedding.engine.renderer.RenderSurface;
import io.flutter.embedding.engine.systemchannels.SettingsChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.editing.ScribePlugin;
import io.flutter.plugin.editing.SpellCheckPlugin;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.plugin.localization.LocalizationPlugin;
import io.flutter.plugin.mouse.MouseCursorPlugin;
import io.flutter.util.ViewUtils;
import io.flutter.view.AccessibilityBridge;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import x1.C1524a;
import y1.g;
import y1.h;
import y1.k;

/* loaded from: classes.dex */
public class FlutterView extends FrameLayout implements MouseCursorPlugin.MouseCursorViewDelegate, KeyboardManager.ViewDelegate {
    static final int CONTENT_SIZING_MAX = 8192;
    private static final String GBOARD_PACKAGE_NAME = "com.google.android.inputmethod.latin";
    private static final String TAG = "FlutterView";
    private AccessibilityBridge accessibilityBridge;
    private AndroidTouchProcessor androidTouchProcessor;
    private FlutterViewDelegate delegate;
    private FlutterEngine flutterEngine;
    private final Set<FlutterEngineAttachmentListener> flutterEngineAttachmentListeners;
    private FlutterImageView flutterImageView;
    private FlutterSurfaceView flutterSurfaceView;
    private FlutterTextureView flutterTextureView;
    private final FlutterUiDisplayListener flutterUiDisplayListener;
    private final Set<FlutterUiDisplayListener> flutterUiDisplayListeners;
    final FlutterUiResizeListener flutterUiResizeListener;
    private int heightMode;
    boolean isContentSizingEnabled;
    private boolean isFlutterUiDisplayed;
    private KeyboardManager keyboardManager;
    private LocalizationPlugin localizationPlugin;
    private MouseCursorPlugin mouseCursorPlugin;
    private final AccessibilityBridge.OnAccessibilityChangeListener onAccessibilityChangeListener;
    private RenderSurface previousRenderSurface;
    RenderSurface renderSurface;
    private ScribePlugin scribePlugin;
    private SpellCheckPlugin spellCheckPlugin;
    private final ContentObserver systemSettingsObserver;
    private TextInputPlugin textInputPlugin;
    private TextServicesManager textServicesManager;
    private final FlutterRenderer.ViewportMetrics viewportMetrics;
    private int widthMode;
    private D.a windowInfoListener;
    private WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepo;

    public interface FlutterEngineAttachmentListener {
        void onFlutterEngineAttachedToFlutterView(FlutterEngine flutterEngine);

        void onFlutterEngineDetachedFromFlutterView();
    }

    public enum ZeroSides {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public FlutterView(Context context) {
        this(context, (AttributeSet) null, new FlutterSurfaceView(context));
    }

    private View findViewByAccessibilityIdRootedAtCurrentView(int i4, View view) {
        Method declaredMethod;
        try {
            declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (declaredMethod.invoke(view, null).equals(Integer.valueOf(i4))) {
            return view;
        }
        if (view instanceof ViewGroup) {
            int i5 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i5 >= viewGroup.getChildCount()) {
                    break;
                }
                View findViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i4, viewGroup.getChildAt(i5));
                if (findViewByAccessibilityIdRootedAtCurrentView != null) {
                    return findViewByAccessibilityIdRootedAtCurrentView;
                }
                i5++;
            }
        }
        return null;
    }

    private int guessBottomKeyboardInset(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void init() {
        Log.v(TAG, "Initializing FlutterView");
        if (this.flutterSurfaceView != null) {
            Log.v(TAG, "Internally using a FlutterSurfaceView.");
            addView(this.flutterSurfaceView);
        } else if (this.flutterTextureView != null) {
            Log.v(TAG, "Internally using a FlutterTextureView.");
            addView(this.flutterTextureView);
        } else {
            Log.v(TAG, "Internally using a FlutterImageView.");
            addView(this.flutterImageView);
        }
        this.isContentSizingEnabled = ContentSizingFlag.isEnabled(getContext());
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseImageView() {
        FlutterImageView flutterImageView = this.flutterImageView;
        if (flutterImageView != null) {
            flutterImageView.closeImageReader();
            removeView(this.flutterImageView);
            this.flutterImageView = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetWillNotDraw(boolean z, boolean z4) {
        boolean z5 = false;
        if (this.flutterEngine.getRenderer().isSoftwareRenderingEnabled()) {
            setWillNotDraw(false);
            return;
        }
        if (!z && !z4) {
            z5 = true;
        }
        setWillNotDraw(z5);
    }

    private void sendViewportMetricsToFlutter() {
        if (!isAttachedToFlutterEngine()) {
            Log.w(TAG, "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.viewportMetrics.devicePixelRatio = getResources().getDisplayMetrics().density;
        this.viewportMetrics.physicalTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.flutterEngine.getRenderer().setViewportMetrics(this.viewportMetrics);
    }

    public boolean acquireLatestImageViewFrame() {
        FlutterImageView flutterImageView = this.flutterImageView;
        if (flutterImageView != null) {
            return flutterImageView.acquireLatestImage();
        }
        return false;
    }

    public void addFlutterEngineAttachmentListener(FlutterEngineAttachmentListener flutterEngineAttachmentListener) {
        this.flutterEngineAttachmentListeners.add(flutterEngineAttachmentListener);
    }

    public void addOnFirstFrameRenderedListener(FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterUiDisplayListeners.add(flutterUiDisplayListener);
    }

    public void attachOverlaySurfaceToRender(FlutterImageView flutterImageView) {
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterImageView.attachToRenderer(flutterEngine.getRenderer());
        }
    }

    public void attachToFlutterEngine(FlutterEngine flutterEngine) {
        Log.v(TAG, "Attaching to a FlutterEngine: " + flutterEngine);
        if (isAttachedToFlutterEngine()) {
            if (flutterEngine == this.flutterEngine) {
                Log.v(TAG, "Already attached to this engine. Doing nothing.");
                return;
            } else {
                Log.v(TAG, "Currently attached to a different engine. Detaching and then attaching to new engine.");
                detachFromFlutterEngine();
            }
        }
        this.flutterEngine = flutterEngine;
        FlutterRenderer renderer = flutterEngine.getRenderer();
        this.isFlutterUiDisplayed = renderer.isDisplayingFlutterUi();
        this.renderSurface.attachToRenderer(renderer);
        renderer.addIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        if (this.isContentSizingEnabled) {
            renderer.addResizingFlutterUiListener(this.flutterUiResizeListener);
        }
        this.mouseCursorPlugin = new MouseCursorPlugin(this, this.flutterEngine.getMouseCursorChannel());
        this.textInputPlugin = new TextInputPlugin(this, this.flutterEngine.getTextInputChannel(), this.flutterEngine.getScribeChannel(), this.flutterEngine.getPlatformViewsController(), this.flutterEngine.getPlatformViewsController2());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.textServicesManager = textServicesManager;
            this.spellCheckPlugin = new SpellCheckPlugin(textServicesManager, this.flutterEngine.getSpellCheckChannel());
        } catch (Exception unused) {
            Log.e(TAG, "TextServicesManager not supported by device, spell check disabled.");
        }
        this.scribePlugin = new ScribePlugin(this, this.textInputPlugin.getInputMethodManager(), this.flutterEngine.getScribeChannel());
        this.localizationPlugin = this.flutterEngine.getLocalizationPlugin();
        this.keyboardManager = new KeyboardManager(this);
        this.androidTouchProcessor = new AndroidTouchProcessor(this.flutterEngine.getRenderer(), false);
        AccessibilityBridge accessibilityBridge = new AccessibilityBridge(this, flutterEngine.getAccessibilityChannel(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), flutterEngine.getPlatformViewsControllerDelegator());
        this.accessibilityBridge = accessibilityBridge;
        accessibilityBridge.setOnAccessibilityChangeListener(this.onAccessibilityChangeListener);
        resetWillNotDraw(this.accessibilityBridge.isAccessibilityEnabled(), this.accessibilityBridge.isTouchExplorationEnabled());
        this.flutterEngine.getPlatformViewsController().attachAccessibilityBridge(this.accessibilityBridge);
        this.flutterEngine.getPlatformViewsController().attachToFlutterRenderer(this.flutterEngine.getRenderer());
        this.flutterEngine.getPlatformViewsController2().attachAccessibilityBridge(this.accessibilityBridge);
        this.flutterEngine.getPlatformViewsController2().attachToFlutterRenderer(this.flutterEngine.getRenderer());
        this.textInputPlugin.getInputMethodManager().restartInput(this);
        sendUserSettingsToFlutter();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.systemSettingsObserver);
        sendViewportMetricsToFlutter();
        flutterEngine.getPlatformViewsController().attachToView(this);
        flutterEngine.getPlatformViewsController2().attachToView(this);
        Iterator<FlutterEngineAttachmentListener> it = this.flutterEngineAttachmentListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterEngineAttachedToFlutterView(flutterEngine);
        }
        if (this.isFlutterUiDisplayed) {
            this.flutterUiDisplayListener.onFlutterUiDisplayed();
        }
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin != null) {
            textInputPlugin.autofill(sparseArray);
        }
    }

    public ZeroSides calculateShouldZeroSides() {
        Context context = getContext();
        if (context.getResources().getConfiguration().orientation == 2) {
            int rotation = ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
            if (rotation == 1) {
                return ZeroSides.RIGHT;
            }
            if (rotation == 3) {
                return ZeroSides.LEFT;
            }
            if (rotation == 0 || rotation == 2) {
                return ZeroSides.BOTH;
            }
        }
        return ZeroSides.NONE;
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        FlutterEngine flutterEngine = this.flutterEngine;
        return flutterEngine != null ? flutterEngine.getPlatformViewsController().checkInputConnectionProxy(view) : super.checkInputConnectionProxy(view);
    }

    public void convertToImageView() {
        this.renderSurface.pause();
        FlutterImageView flutterImageView = this.flutterImageView;
        if (flutterImageView == null) {
            FlutterImageView createImageView = createImageView();
            this.flutterImageView = createImageView;
            addView(createImageView);
        } else {
            flutterImageView.resizeIfNeeded(getWidth(), getHeight());
        }
        this.previousRenderSurface = this.renderSurface;
        FlutterImageView flutterImageView2 = this.flutterImageView;
        this.renderSurface = flutterImageView2;
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterImageView2.attachToRenderer(flutterEngine.getRenderer());
        }
    }

    public FlutterImageView createImageView() {
        return new FlutterImageView(getContext(), getWidth(), getHeight(), FlutterImageView.SurfaceKind.background);
    }

    public WindowInfoRepositoryCallbackAdapterWrapper createWindowInfoRepo() {
        try {
            g gVar = h.f16249a;
            Context context = getContext();
            gVar.getClass();
            return new WindowInfoRepositoryCallbackAdapterWrapper(new C1524a(g.a(context)));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void detachFromFlutterEngine() {
        Log.v(TAG, "Detaching from a FlutterEngine: " + this.flutterEngine);
        if (!isAttachedToFlutterEngine()) {
            Log.v(TAG, "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        Iterator<FlutterEngineAttachmentListener> it = this.flutterEngineAttachmentListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterEngineDetachedFromFlutterView();
        }
        getContext().getContentResolver().unregisterContentObserver(this.systemSettingsObserver);
        this.flutterEngine.getPlatformViewsController().detachFromView();
        this.flutterEngine.getPlatformViewsController2().detachFromView();
        this.flutterEngine.getPlatformViewsController().detachAccessibilityBridge();
        this.flutterEngine.getPlatformViewsController2().detachAccessibilityBridge();
        this.accessibilityBridge.release();
        this.accessibilityBridge = null;
        this.textInputPlugin.getInputMethodManager().restartInput(this);
        this.textInputPlugin.destroy();
        this.keyboardManager.destroy();
        SpellCheckPlugin spellCheckPlugin = this.spellCheckPlugin;
        if (spellCheckPlugin != null) {
            spellCheckPlugin.destroy();
        }
        MouseCursorPlugin mouseCursorPlugin = this.mouseCursorPlugin;
        if (mouseCursorPlugin != null) {
            mouseCursorPlugin.destroy();
        }
        FlutterRenderer renderer = this.flutterEngine.getRenderer();
        this.isFlutterUiDisplayed = false;
        renderer.removeIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        if (this.isContentSizingEnabled) {
            renderer.removeResizingFlutterUiListener(this.flutterUiResizeListener);
        }
        renderer.stopRenderingToSurface();
        renderer.setSemanticsEnabled(false);
        RenderSurface renderSurface = this.previousRenderSurface;
        if (renderSurface != null && this.renderSurface == this.flutterImageView) {
            this.renderSurface = renderSurface;
        }
        this.renderSurface.detachFromRenderer();
        releaseImageView();
        this.previousRenderSurface = null;
        this.flutterEngine = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (isAttachedToFlutterEngine() && this.keyboardManager.handleEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public View findViewByAccessibilityIdTraversal(int i4) {
        if (Build.VERSION.SDK_INT < 29) {
            return findViewByAccessibilityIdRootedAtCurrentView(i4, this);
        }
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            return (View) declaredMethod.invoke(this, Integer.valueOf(i4));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge == null || !accessibilityBridge.isAccessibilityEnabled()) {
            return null;
        }
        return this.accessibilityBridge;
    }

    public FlutterEngine getAttachedFlutterEngine() {
        return this.flutterEngine;
    }

    @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
    public BinaryMessenger getBinaryMessenger() {
        return this.flutterEngine.getDartExecutor();
    }

    public FlutterImageView getCurrentImageSurface() {
        return this.flutterImageView;
    }

    @Override // io.flutter.plugin.mouse.MouseCursorPlugin.MouseCursorViewDelegate
    public PointerIcon getSystemPointerIcon(int i4) {
        return PointerIcon.getSystemIcon(getContext(), i4);
    }

    public FlutterRenderer.ViewportMetrics getViewportMetrics() {
        return this.viewportMetrics;
    }

    public boolean hasRenderedFirstFrame() {
        return this.isFlutterUiDisplayed;
    }

    public boolean isAttachedToFlutterEngine() {
        FlutterEngine flutterEngine = this.flutterEngine;
        return flutterEngine != null && flutterEngine.getRenderer() == this.renderSurface.getAttachedRenderer();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x018b, code lost:
    
        r1 = r10.getDisplayCutout();
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        RoundedCorner roundedCorner4;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        int systemBars;
        Insets insets;
        int i4;
        int i5;
        int i6;
        int i7;
        int ime;
        Insets insets2;
        int i8;
        int i9;
        int i10;
        int i11;
        int systemGestures;
        Insets insets3;
        int i12;
        int i13;
        int i14;
        int i15;
        DisplayCutout displayCutout2;
        Insets waterfallInsets;
        int i16;
        int safeInsetTop;
        int i17;
        int safeInsetRight;
        int i18;
        int safeInsetBottom;
        int i19;
        int safeInsetLeft;
        Insets systemGestureInsets;
        int i20;
        int i21;
        int i22;
        int i23;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i24 = Build.VERSION.SDK_INT;
        if (i24 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            FlutterRenderer.ViewportMetrics viewportMetrics = this.viewportMetrics;
            i20 = systemGestureInsets.top;
            viewportMetrics.systemGestureInsetTop = i20;
            FlutterRenderer.ViewportMetrics viewportMetrics2 = this.viewportMetrics;
            i21 = systemGestureInsets.right;
            viewportMetrics2.systemGestureInsetRight = i21;
            FlutterRenderer.ViewportMetrics viewportMetrics3 = this.viewportMetrics;
            i22 = systemGestureInsets.bottom;
            viewportMetrics3.systemGestureInsetBottom = i22;
            FlutterRenderer.ViewportMetrics viewportMetrics4 = this.viewportMetrics;
            i23 = systemGestureInsets.left;
            viewportMetrics4.systemGestureInsetLeft = i23;
        }
        boolean z = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z4 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i24 >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            FlutterRenderer.ViewportMetrics viewportMetrics5 = this.viewportMetrics;
            i4 = insets.top;
            viewportMetrics5.viewPaddingTop = i4;
            FlutterRenderer.ViewportMetrics viewportMetrics6 = this.viewportMetrics;
            i5 = insets.right;
            viewportMetrics6.viewPaddingRight = i5;
            FlutterRenderer.ViewportMetrics viewportMetrics7 = this.viewportMetrics;
            i6 = insets.bottom;
            viewportMetrics7.viewPaddingBottom = i6;
            FlutterRenderer.ViewportMetrics viewportMetrics8 = this.viewportMetrics;
            i7 = insets.left;
            viewportMetrics8.viewPaddingLeft = i7;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            FlutterRenderer.ViewportMetrics viewportMetrics9 = this.viewportMetrics;
            i8 = insets2.top;
            viewportMetrics9.viewInsetTop = i8;
            FlutterRenderer.ViewportMetrics viewportMetrics10 = this.viewportMetrics;
            i9 = insets2.right;
            viewportMetrics10.viewInsetRight = i9;
            FlutterRenderer.ViewportMetrics viewportMetrics11 = this.viewportMetrics;
            i10 = insets2.bottom;
            viewportMetrics11.viewInsetBottom = i10;
            FlutterRenderer.ViewportMetrics viewportMetrics12 = this.viewportMetrics;
            i11 = insets2.left;
            viewportMetrics12.viewInsetLeft = i11;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            FlutterRenderer.ViewportMetrics viewportMetrics13 = this.viewportMetrics;
            i12 = insets3.top;
            viewportMetrics13.systemGestureInsetTop = i12;
            FlutterRenderer.ViewportMetrics viewportMetrics14 = this.viewportMetrics;
            i13 = insets3.right;
            viewportMetrics14.systemGestureInsetRight = i13;
            FlutterRenderer.ViewportMetrics viewportMetrics15 = this.viewportMetrics;
            i14 = insets3.bottom;
            viewportMetrics15.systemGestureInsetBottom = i14;
            FlutterRenderer.ViewportMetrics viewportMetrics16 = this.viewportMetrics;
            i15 = insets3.left;
            viewportMetrics16.systemGestureInsetLeft = i15;
            displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                waterfallInsets = displayCutout2.getWaterfallInsets();
                FlutterRenderer.ViewportMetrics viewportMetrics17 = this.viewportMetrics;
                int i25 = viewportMetrics17.viewPaddingTop;
                i16 = waterfallInsets.top;
                int max = Math.max(i25, i16);
                safeInsetTop = displayCutout2.getSafeInsetTop();
                viewportMetrics17.viewPaddingTop = Math.max(max, safeInsetTop);
                FlutterRenderer.ViewportMetrics viewportMetrics18 = this.viewportMetrics;
                int i26 = viewportMetrics18.viewPaddingRight;
                i17 = waterfallInsets.right;
                int max2 = Math.max(i26, i17);
                safeInsetRight = displayCutout2.getSafeInsetRight();
                viewportMetrics18.viewPaddingRight = Math.max(max2, safeInsetRight);
                FlutterRenderer.ViewportMetrics viewportMetrics19 = this.viewportMetrics;
                int i27 = viewportMetrics19.viewPaddingBottom;
                i18 = waterfallInsets.bottom;
                int max3 = Math.max(i27, i18);
                safeInsetBottom = displayCutout2.getSafeInsetBottom();
                viewportMetrics19.viewPaddingBottom = Math.max(max3, safeInsetBottom);
                FlutterRenderer.ViewportMetrics viewportMetrics20 = this.viewportMetrics;
                int i28 = viewportMetrics20.viewPaddingLeft;
                i19 = waterfallInsets.left;
                int max4 = Math.max(i28, i19);
                safeInsetLeft = displayCutout2.getSafeInsetLeft();
                viewportMetrics20.viewPaddingLeft = Math.max(max4, safeInsetLeft);
            }
        } else {
            ZeroSides zeroSides = ZeroSides.NONE;
            if (!z4) {
                zeroSides = calculateShouldZeroSides();
            }
            this.viewportMetrics.viewPaddingTop = z ? windowInsets.getSystemWindowInsetTop() : 0;
            this.viewportMetrics.viewPaddingRight = (zeroSides == ZeroSides.RIGHT || zeroSides == ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.viewportMetrics.viewPaddingBottom = (z4 && guessBottomKeyboardInset(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.viewportMetrics.viewPaddingLeft = (zeroSides == ZeroSides.LEFT || zeroSides == ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            FlutterRenderer.ViewportMetrics viewportMetrics21 = this.viewportMetrics;
            viewportMetrics21.viewInsetTop = 0;
            viewportMetrics21.viewInsetRight = 0;
            viewportMetrics21.viewInsetBottom = guessBottomKeyboardInset(windowInsets);
            this.viewportMetrics.viewInsetLeft = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i24 >= 28 && displayCutout != null) {
            boundingRects = displayCutout.getBoundingRects();
            for (Rect rect : boundingRects) {
                Log.v(TAG, "DisplayCutout area reported with bounds = " + rect.toString());
                arrayList.add(new FlutterRenderer.DisplayFeature(rect, FlutterRenderer.DisplayFeatureType.CUTOUT, FlutterRenderer.DisplayFeatureState.UNKNOWN));
            }
        }
        this.viewportMetrics.setDisplayCutouts(arrayList);
        int i29 = Build.VERSION.SDK_INT;
        if (i29 >= 35) {
            this.delegate.growViewportMetricsToCaptionBar(getContext(), this.viewportMetrics);
        }
        if (i29 >= 31) {
            roundedCorner = windowInsets.getRoundedCorner(0);
            roundedCorner2 = windowInsets.getRoundedCorner(1);
            roundedCorner3 = windowInsets.getRoundedCorner(2);
            roundedCorner4 = windowInsets.getRoundedCorner(3);
            this.viewportMetrics.displayCornerRadiusTopLeft = roundedCorner != null ? roundedCorner.getRadius() : 0;
            this.viewportMetrics.displayCornerRadiusTopRight = roundedCorner2 != null ? roundedCorner2.getRadius() : 0;
            this.viewportMetrics.displayCornerRadiusBottomRight = roundedCorner3 != null ? roundedCorner3.getRadius() : 0;
            this.viewportMetrics.displayCornerRadiusBottomLeft = roundedCorner4 != null ? roundedCorner4.getRadius() : 0;
        }
        Log.v(TAG, "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.viewportMetrics.viewPaddingTop + ", Left: " + this.viewportMetrics.viewPaddingLeft + ", Right: " + this.viewportMetrics.viewPaddingRight + "\nKeyboard insets: Bottom: " + this.viewportMetrics.viewInsetBottom + ", Left: " + this.viewportMetrics.viewInsetLeft + ", Right: " + this.viewportMetrics.viewInsetRight + "System Gesture Insets - Left: " + this.viewportMetrics.systemGestureInsetLeft + ", Top: " + this.viewportMetrics.systemGestureInsetTop + ", Right: " + this.viewportMetrics.systemGestureInsetRight + ", Bottom: " + this.viewportMetrics.viewInsetBottom);
        sendViewportMetricsToFlutter();
        return onApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.windowInfoRepo = createWindowInfoRepo();
        Activity activity = ViewUtils.getActivity(getContext());
        WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepositoryCallbackAdapterWrapper = this.windowInfoRepo;
        if (windowInfoRepositoryCallbackAdapterWrapper == null || activity == null) {
            return;
        }
        this.windowInfoListener = new D.a() { // from class: io.flutter.embedding.android.d
            @Override // D.a, androidx.window.extensions.core.util.function.Consumer
            public final void accept(Object obj) {
                FlutterView.this.setWindowInfoListenerDisplayFeatures((k) obj);
            }
        };
        Context context = getContext();
        windowInfoRepositoryCallbackAdapterWrapper.addWindowLayoutInfoListener(activity, Build.VERSION.SDK_INT >= 28 ? AbstractC0003d.c(context) : new A.c(new Handler(context.getMainLooper()), 0), this.windowInfoListener);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.flutterEngine != null) {
            Log.v(TAG, "Configuration changed. Sending locales and user settings to Flutter.");
            this.localizationPlugin.sendLocalesToFlutter(configuration);
            sendUserSettingsToFlutter();
            ViewUtils.calculateMaximumDisplayMetrics(getContext(), this.flutterEngine);
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !isAttachedToFlutterEngine() ? super.onCreateInputConnection(editorInfo) : this.textInputPlugin.createInputConnection(this, this.keyboardManager, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        D.a aVar;
        WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepositoryCallbackAdapterWrapper = this.windowInfoRepo;
        if (windowInfoRepositoryCallbackAdapterWrapper != null && (aVar = this.windowInfoListener) != null) {
            windowInfoRepositoryCallbackAdapterWrapper.removeWindowLayoutInfoListener(aVar);
        }
        this.windowInfoListener = null;
        this.windowInfoRepo = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (isAttachedToFlutterEngine() && this.androidTouchProcessor.onGenericMotionEvent(motionEvent, getContext())) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !isAttachedToFlutterEngine() ? super.onHoverEvent(motionEvent) : this.accessibilityBridge.onAccessibilityHoverEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        this.widthMode = View.MeasureSpec.getMode(i4);
        this.heightMode = View.MeasureSpec.getMode(i5);
        super.onMeasure(i4, i5);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i4) {
        super.onProvideAutofillVirtualStructure(viewStructure, i4);
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin != null) {
            textInputPlugin.onProvideAutofillVirtualStructure(viewStructure, i4);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        Log.v(TAG, "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i6 + " x " + i7 + ", it is now " + i4 + " x " + i5);
        FlutterRenderer.ViewportMetrics viewportMetrics = this.viewportMetrics;
        viewportMetrics.width = i4;
        viewportMetrics.height = i5;
        if (this.isContentSizingEnabled && this.heightMode == 0) {
            Log.d(TAG, "FlutterView height is set to wrap content - updating viewport metrics to max");
            FlutterRenderer.ViewportMetrics viewportMetrics2 = this.viewportMetrics;
            viewportMetrics2.minHeight = 0;
            viewportMetrics2.maxHeight = CONTENT_SIZING_MAX;
        } else {
            viewportMetrics.minHeight = i5;
            viewportMetrics.maxHeight = i5;
        }
        if (this.isContentSizingEnabled && this.widthMode == 0) {
            Log.d(TAG, "FlutterView width is set to wrap content - updating viewport metrics to max");
            FlutterRenderer.ViewportMetrics viewportMetrics3 = this.viewportMetrics;
            viewportMetrics3.minWidth = 0;
            viewportMetrics3.maxWidth = CONTENT_SIZING_MAX;
        } else {
            FlutterRenderer.ViewportMetrics viewportMetrics4 = this.viewportMetrics;
            int i8 = viewportMetrics4.width;
            viewportMetrics4.minWidth = i8;
            viewportMetrics4.maxWidth = i8;
        }
        sendViewportMetricsToFlutter();
    }

    @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
    public boolean onTextInputKeyEvent(KeyEvent keyEvent) {
        return this.textInputPlugin.handleKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isAttachedToFlutterEngine()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        return this.androidTouchProcessor.onTouchEvent(motionEvent);
    }

    @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
    public void redispatch(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    public void removeFlutterEngineAttachmentListener(FlutterEngineAttachmentListener flutterEngineAttachmentListener) {
        this.flutterEngineAttachmentListeners.remove(flutterEngineAttachmentListener);
    }

    public void removeOnFirstFrameRenderedListener(FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterUiDisplayListeners.remove(flutterUiDisplayListener);
    }

    public void revertImageView(final Runnable runnable) {
        if (this.flutterImageView == null) {
            Log.v(TAG, "Tried to revert the image view, but no image view is used.");
            return;
        }
        RenderSurface renderSurface = this.previousRenderSurface;
        if (renderSurface == null) {
            Log.v(TAG, "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.renderSurface = renderSurface;
        this.previousRenderSurface = null;
        final FlutterRenderer renderer = this.flutterEngine.getRenderer();
        if (this.flutterEngine != null && renderer != null) {
            this.renderSurface.resume();
            renderer.addIsDisplayingFlutterUiListener(new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.5
                @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                public void onFlutterUiDisplayed() {
                    renderer.removeIsDisplayingFlutterUiListener(this);
                    runnable.run();
                    FlutterView flutterView = FlutterView.this;
                    if ((flutterView.renderSurface instanceof FlutterImageView) || flutterView.flutterImageView == null) {
                        return;
                    }
                    FlutterView.this.flutterImageView.detachFromRenderer();
                    FlutterView.this.releaseImageView();
                }

                @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                public void onFlutterUiNoLongerDisplayed() {
                }
            });
        } else {
            this.flutterImageView.detachFromRenderer();
            releaseImageView();
            runnable.run();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r1 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void sendUserSettingsToFlutter() {
        boolean z;
        List enabledSpellCheckerInfos;
        boolean z4;
        boolean isSpellCheckerEnabled;
        SettingsChannel.PlatformBrightness platformBrightness = (getResources().getConfiguration().uiMode & 48) == 32 ? SettingsChannel.PlatformBrightness.dark : SettingsChannel.PlatformBrightness.light;
        TextServicesManager textServicesManager = this.textServicesManager;
        if (textServicesManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                enabledSpellCheckerInfos = textServicesManager.getEnabledSpellCheckerInfos();
                Iterator it = enabledSpellCheckerInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z4 = false;
                        break;
                    } else if (((SpellCheckerInfo) it.next()).getPackageName().equals(GBOARD_PACKAGE_NAME)) {
                        z4 = true;
                        break;
                    }
                }
                isSpellCheckerEnabled = this.textServicesManager.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z = true;
            this.flutterEngine.getSettingsChannel().startMessage().setTextScaleFactor(getResources().getConfiguration().fontScale).setDisplayMetrics(getResources().getDisplayMetrics()).setNativeSpellCheckServiceDefined(z).setBrieflyShowPassword(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1).setUse24HourFormat(DateFormat.is24HourFormat(getContext())).setPlatformBrightness(platformBrightness).send();
        }
        z = false;
        this.flutterEngine.getSettingsChannel().startMessage().setTextScaleFactor(getResources().getConfiguration().fontScale).setDisplayMetrics(getResources().getDisplayMetrics()).setNativeSpellCheckServiceDefined(z).setBrieflyShowPassword(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1).setUse24HourFormat(DateFormat.is24HourFormat(getContext())).setPlatformBrightness(platformBrightness).send();
    }

    public void setDelegate(FlutterViewDelegate flutterViewDelegate) {
        this.delegate = flutterViewDelegate;
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        RenderSurface renderSurface = this.renderSurface;
        if (renderSurface instanceof FlutterSurfaceView) {
            ((FlutterSurfaceView) renderSurface).setVisibility(i4);
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(k kVar) {
        y1.b bVar = y1.b.f16230e;
        ?? r7 = kVar.f16255a;
        ArrayList arrayList = new ArrayList();
        for (y1.c cVar : r7) {
            Log.v(TAG, "WindowInfoTracker Display Feature reported with bounds = " + cVar.f16237a.a() + " and type = " + cVar.getClass().getSimpleName());
            v1.b bVar2 = cVar.f16237a;
            FlutterRenderer.DisplayFeatureType displayFeatureType = ((bVar2.f15538c - bVar2.f15536a == 0 || bVar2.f15539d - bVar2.f15537b == 0) ? y1.b.f16229d : bVar) == bVar ? FlutterRenderer.DisplayFeatureType.HINGE : FlutterRenderer.DisplayFeatureType.FOLD;
            y1.b bVar3 = cVar.f16239c;
            arrayList.add(new FlutterRenderer.DisplayFeature(bVar2.a(), displayFeatureType, bVar3 == y1.b.f16231f ? FlutterRenderer.DisplayFeatureState.POSTURE_FLAT : bVar3 == y1.b.f16232g ? FlutterRenderer.DisplayFeatureState.POSTURE_HALF_OPENED : FlutterRenderer.DisplayFeatureState.UNKNOWN));
        }
        this.viewportMetrics.setDisplayFeatures(arrayList);
        sendViewportMetricsToFlutter();
    }

    @Deprecated
    public FlutterView(Context context, RenderMode renderMode) {
        super(context, null);
        this.isContentSizingEnabled = false;
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z, boolean z4) {
                FlutterView.this.resetWillNotDraw(z, z4);
            }
        };
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                Log.v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiResizeListener = new FlutterUiResizeListener() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.flutter.embedding.engine.renderer.FlutterUiResizeListener
            public void resizeEngineView(int i4, int i5) {
                boolean z;
                Object obj = FlutterView.this.renderSurface;
                if (obj == null) {
                    Log.e(FlutterView.TAG, "Flutter engine view not set.");
                    return;
                }
                View view = (View) obj;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                boolean z4 = true;
                if (view.getHeight() != i5) {
                    layoutParams.height = i5;
                    z = true;
                } else {
                    z = false;
                }
                if (view.getWidth() != i4) {
                    layoutParams.width = i4;
                } else {
                    z4 = z;
                }
                if (z4) {
                    view.setLayoutParams(layoutParams);
                }
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.4
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = true;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = false;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.delegate = new FlutterViewDelegate();
        if (renderMode == RenderMode.surface) {
            FlutterSurfaceView flutterSurfaceView = new FlutterSurfaceView(context);
            this.flutterSurfaceView = flutterSurfaceView;
            this.renderSurface = flutterSurfaceView;
        } else {
            if (renderMode != RenderMode.texture) {
                throw new IllegalArgumentException("RenderMode not supported with this constructor: " + renderMode);
            }
            FlutterTextureView flutterTextureView = new FlutterTextureView(context);
            this.flutterTextureView = flutterTextureView;
            this.renderSurface = flutterTextureView;
        }
        init();
    }

    @Deprecated
    public FlutterView(Context context, TransparencyMode transparencyMode) {
        this(context, (AttributeSet) null, new FlutterSurfaceView(context, transparencyMode == TransparencyMode.transparent));
    }

    public FlutterView(Context context, FlutterSurfaceView flutterSurfaceView) {
        this(context, (AttributeSet) null, flutterSurfaceView);
    }

    public FlutterView(Context context, FlutterTextureView flutterTextureView) {
        this(context, (AttributeSet) null, flutterTextureView);
    }

    public FlutterView(Context context, FlutterImageView flutterImageView) {
        this(context, (AttributeSet) null, flutterImageView);
    }

    public FlutterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new FlutterSurfaceView(context));
    }

    @Deprecated
    public FlutterView(Context context, RenderMode renderMode, TransparencyMode transparencyMode) {
        super(context, null);
        this.isContentSizingEnabled = false;
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z, boolean z4) {
                FlutterView.this.resetWillNotDraw(z, z4);
            }
        };
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                Log.v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiResizeListener = new FlutterUiResizeListener() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.flutter.embedding.engine.renderer.FlutterUiResizeListener
            public void resizeEngineView(int i4, int i5) {
                boolean z;
                Object obj = FlutterView.this.renderSurface;
                if (obj == null) {
                    Log.e(FlutterView.TAG, "Flutter engine view not set.");
                    return;
                }
                View view = (View) obj;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                boolean z4 = true;
                if (view.getHeight() != i5) {
                    layoutParams.height = i5;
                    z = true;
                } else {
                    z = false;
                }
                if (view.getWidth() != i4) {
                    layoutParams.width = i4;
                } else {
                    z4 = z;
                }
                if (z4) {
                    view.setLayoutParams(layoutParams);
                }
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.4
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = true;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = false;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.delegate = new FlutterViewDelegate();
        if (renderMode == RenderMode.surface) {
            FlutterSurfaceView flutterSurfaceView = new FlutterSurfaceView(context, transparencyMode == TransparencyMode.transparent);
            this.flutterSurfaceView = flutterSurfaceView;
            this.renderSurface = flutterSurfaceView;
        } else if (renderMode == RenderMode.texture) {
            FlutterTextureView flutterTextureView = new FlutterTextureView(context);
            this.flutterTextureView = flutterTextureView;
            this.renderSurface = flutterTextureView;
        } else {
            throw new IllegalArgumentException("RenderMode not supported with this constructor: " + renderMode);
        }
        init();
    }

    private FlutterView(Context context, AttributeSet attributeSet, FlutterSurfaceView flutterSurfaceView) {
        super(context, attributeSet);
        this.isContentSizingEnabled = false;
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z, boolean z4) {
                FlutterView.this.resetWillNotDraw(z, z4);
            }
        };
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                Log.v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiResizeListener = new FlutterUiResizeListener() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.flutter.embedding.engine.renderer.FlutterUiResizeListener
            public void resizeEngineView(int i4, int i5) {
                boolean z;
                Object obj = FlutterView.this.renderSurface;
                if (obj == null) {
                    Log.e(FlutterView.TAG, "Flutter engine view not set.");
                    return;
                }
                View view = (View) obj;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                boolean z4 = true;
                if (view.getHeight() != i5) {
                    layoutParams.height = i5;
                    z = true;
                } else {
                    z = false;
                }
                if (view.getWidth() != i4) {
                    layoutParams.width = i4;
                } else {
                    z4 = z;
                }
                if (z4) {
                    view.setLayoutParams(layoutParams);
                }
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.4
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = true;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = false;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.delegate = new FlutterViewDelegate();
        this.flutterSurfaceView = flutterSurfaceView;
        this.renderSurface = flutterSurfaceView;
        init();
    }

    private FlutterView(Context context, AttributeSet attributeSet, FlutterTextureView flutterTextureView) {
        super(context, attributeSet);
        this.isContentSizingEnabled = false;
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z, boolean z4) {
                FlutterView.this.resetWillNotDraw(z, z4);
            }
        };
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                Log.v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiResizeListener = new FlutterUiResizeListener() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.flutter.embedding.engine.renderer.FlutterUiResizeListener
            public void resizeEngineView(int i4, int i5) {
                boolean z;
                Object obj = FlutterView.this.renderSurface;
                if (obj == null) {
                    Log.e(FlutterView.TAG, "Flutter engine view not set.");
                    return;
                }
                View view = (View) obj;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                boolean z4 = true;
                if (view.getHeight() != i5) {
                    layoutParams.height = i5;
                    z = true;
                } else {
                    z = false;
                }
                if (view.getWidth() != i4) {
                    layoutParams.width = i4;
                } else {
                    z4 = z;
                }
                if (z4) {
                    view.setLayoutParams(layoutParams);
                }
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.4
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = true;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = false;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.delegate = new FlutterViewDelegate();
        this.flutterTextureView = flutterTextureView;
        this.renderSurface = flutterTextureView;
        init();
    }

    private FlutterView(Context context, AttributeSet attributeSet, FlutterImageView flutterImageView) {
        super(context, attributeSet);
        this.isContentSizingEnabled = false;
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z, boolean z4) {
                FlutterView.this.resetWillNotDraw(z, z4);
            }
        };
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                Log.v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiResizeListener = new FlutterUiResizeListener() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.flutter.embedding.engine.renderer.FlutterUiResizeListener
            public void resizeEngineView(int i4, int i5) {
                boolean z;
                Object obj = FlutterView.this.renderSurface;
                if (obj == null) {
                    Log.e(FlutterView.TAG, "Flutter engine view not set.");
                    return;
                }
                View view = (View) obj;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                boolean z4 = true;
                if (view.getHeight() != i5) {
                    layoutParams.height = i5;
                    z = true;
                } else {
                    z = false;
                }
                if (view.getWidth() != i4) {
                    layoutParams.width = i4;
                } else {
                    z4 = z;
                }
                if (z4) {
                    view.setLayoutParams(layoutParams);
                }
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.4
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = true;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = false;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.delegate = new FlutterViewDelegate();
        this.flutterImageView = flutterImageView;
        this.renderSurface = flutterImageView;
        init();
    }
}
