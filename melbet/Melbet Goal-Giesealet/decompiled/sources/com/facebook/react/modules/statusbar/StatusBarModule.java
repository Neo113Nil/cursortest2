package com.facebook.react.modules.statusbar;

import android.app.Activity;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.facebook.common.logging.FLog;
import com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.interfaces.ExtraWindowEventListener;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.view.WindowUtilKt;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: StatusBarModule.kt */
@ReactModule(name = "StatusBarManager")
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0014J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\u0012\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u001d"}, d2 = {"Lcom/facebook/react/modules/statusbar/StatusBarModule;", "Lcom/facebook/fbreact/specs/NativeStatusBarManagerAndroidSpec;", "Lcom/facebook/react/interfaces/ExtraWindowEventListener;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "invalidate", "", "onExtraWindowCreate", "window", "Landroid/view/Window;", "onExtraWindowDestroy", "getTypedExportedConstants", "", "", "", "setColor", "colorDouble", "", "animated", "", "setTranslucent", "translucent", "setHidden", ViewProps.HIDDEN, "setStyle", "style", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StatusBarModule extends NativeStatusBarManagerAndroidSpec implements ExtraWindowEventListener {
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    private static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";
    private static final Set<Window> extraWindows = Collections.newSetFromMap(new WeakHashMap());

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        getReactApplicationContext().addExtraWindowEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeExtraWindowEventListener(this);
    }

    @Override // com.facebook.react.interfaces.ExtraWindowEventListener
    public void onExtraWindowCreate(Window window) {
        Window window2;
        Intrinsics.checkNotNullParameter(window, "window");
        extraWindows.add(window);
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null || (window2 = currentActivity.getWindow()) == null) {
            return;
        }
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window2, window2.getDecorView());
        Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(...)");
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(window2.getDecorView());
        String str = insetsController.isAppearanceLightStatusBars() ? "dark-content" : "light-content";
        boolean isVisible = rootWindowInsets != null ? rootWindowInsets.isVisible(WindowInsetsCompat.Type.statusBars()) : true;
        WindowUtilKt.setStatusBarStyle(window, str);
        WindowUtilKt.setStatusBarVisibility(window, !isVisible);
    }

    @Override // com.facebook.react.interfaces.ExtraWindowEventListener
    public void onExtraWindowDestroy(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        extraWindows.remove(window);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (r2 == null) goto L8;
     */
    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Map<String, Object> getTypedExportedConstants() {
        String str;
        Window window;
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null && (window = currentActivity.getWindow()) != null) {
            int statusBarColor = window.getStatusBarColor();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(statusBarColor & ViewCompat.MEASURED_SIZE_MASK)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        }
        str = "black";
        return MapsKt.mapOf(TuplesKt.to(HEIGHT_KEY, Float.valueOf(PixelUtil.toDIPFromPixel(DisplayMetricsHolder.INSTANCE.getStatusBarHeightPx$ReactAndroid_release(currentActivity)))), TuplesKt.to(DEFAULT_BACKGROUND_COLOR_KEY, str));
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setColor(double colorDouble, boolean animated) {
        int i = (int) colorDouble;
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            FLog.w(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (WindowUtilKt.isEdgeToEdgeFeatureFlagOn()) {
            FLog.w(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is edge-to-edge.");
        } else {
            UiThreadUtil.runOnUiThread(new StatusBarModule$setColor$1(currentActivity, animated, i, getReactApplicationContext()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setTranslucent(final boolean translucent) {
        final Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            FLog.w(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (WindowUtilKt.isEdgeToEdgeFeatureFlagOn()) {
            FLog.w(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is edge-to-edge.");
        } else {
            final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            UiThreadUtil.runOnUiThread(new GuardedRunnable(currentActivity, translucent, reactApplicationContext) { // from class: com.facebook.react.modules.statusbar.StatusBarModule$setTranslucent$1
                final /* synthetic */ Activity $activity;
                final /* synthetic */ boolean $translucent;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(reactApplicationContext);
                    Intrinsics.checkNotNull(reactApplicationContext);
                }

                @Override // com.facebook.react.bridge.GuardedRunnable
                public void runGuarded() {
                    Window window = this.$activity.getWindow();
                    if (window != null) {
                        WindowUtilKt.setStatusBarTranslucency(window, this.$translucent);
                    }
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setHidden(final boolean hidden) {
        final Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            FLog.w(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.statusbar.StatusBarModule$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    StatusBarModule.setHidden$lambda$3(currentActivity, hidden);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setHidden$lambda$3(Activity activity, boolean z) {
        Window window = activity.getWindow();
        if (window != null) {
            WindowUtilKt.setStatusBarVisibility(window, z);
        }
        Set<Window> extraWindows2 = extraWindows;
        Intrinsics.checkNotNullExpressionValue(extraWindows2, "extraWindows");
        for (Window window2 : extraWindows2) {
            Intrinsics.checkNotNull(window2);
            WindowUtilKt.setStatusBarVisibility(window2, z);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setStyle(final String style) {
        final Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            FLog.w(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.statusbar.StatusBarModule$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    StatusBarModule.setStyle$lambda$5(currentActivity, style);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStyle$lambda$5(Activity activity, String str) {
        Window window = activity.getWindow();
        if (window != null) {
            WindowUtilKt.setStatusBarStyle(window, str);
        }
        Set<Window> extraWindows2 = extraWindows;
        Intrinsics.checkNotNullExpressionValue(extraWindows2, "extraWindows");
        for (Window window2 : extraWindows2) {
            Intrinsics.checkNotNull(window2);
            WindowUtilKt.setStatusBarStyle(window2, str);
        }
    }
}
