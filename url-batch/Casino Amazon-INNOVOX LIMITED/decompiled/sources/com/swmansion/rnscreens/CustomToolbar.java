package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.onesignal.core.internal.config.ConfigModelStoreKt;
import com.swmansion.rnscreens.utils.DecorViewInsetsUtilsKt;
import com.swmansion.rnscreens.utils.InsetsKtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomToolbar.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0014J\b\u0010\u0018\u001a\u00020\u0016H\u0014J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J0\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 H\u0014J\u0006\u0010$\u001a\u00020\u0016J(\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020 H\u0002J\b\u0010*\u001a\u00020\u0016H\u0002J\b\u0010+\u001a\u00020\u0016H\u0002J\b\u0010,\u001a\u00020\u0016H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u00070\u000e¢\u0006\u0002\b\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/swmansion/rnscreens/CustomToolbar;", "Landroidx/appcompat/widget/Toolbar;", "context", "Landroid/content/Context;", ConfigModelStoreKt.CONFIG_NAME_SPACE, "Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "<init>", "(Landroid/content/Context;Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;)V", "getConfig", "()Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "shouldAvoidDisplayCutout", "", "shouldApplyTopInset", "lastInsets", "Landroidx/core/graphics/Insets;", "Lorg/jspecify/annotations/NonNull;", "isForceShadowStateUpdateOnLayoutRequested", "isLayoutEnqueued", "insetsAppliedFromListener", "layoutCallback", "Landroid/view/Choreographer$FrameCallback;", "requestLayout", "", "onAttachedToWindow", "onDetachedFromWindow", "applyDecorViewTopInsetIfNeeded", "onApplyWindowInsets", "Landroid/view/WindowInsets;", "insets", "onLayout", "hasSizeChanged", "l", "", "t", "r", "b", "updateContentInsets", "applyExactPadding", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "resetInsetsState", "clearPaddingIfNeeded", "requestForceShadowStateUpdateOnLayout", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class CustomToolbar extends Toolbar {
    private final ScreenStackHeaderConfig config;
    private boolean insetsAppliedFromListener;
    private boolean isForceShadowStateUpdateOnLayoutRequested;
    private boolean isLayoutEnqueued;
    private Insets lastInsets;
    private final Choreographer.FrameCallback layoutCallback;
    private final boolean shouldApplyTopInset;
    private final boolean shouldAvoidDisplayCutout;

    public final ScreenStackHeaderConfig getConfig() {
        return this.config;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomToolbar(Context context, ScreenStackHeaderConfig config) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.shouldAvoidDisplayCutout = true;
        this.shouldApplyTopInset = true;
        Insets NONE = Insets.NONE;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.lastInsets = NONE;
        getMenu();
        this.layoutCallback = new Choreographer.FrameCallback() { // from class: com.swmansion.rnscreens.CustomToolbar$layoutCallback$1
            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long frameTimeNanos) {
                CustomToolbar.this.isLayoutEnqueued = false;
                CustomToolbar customToolbar = CustomToolbar.this;
                customToolbar.measure(View.MeasureSpec.makeMeasureSpec(customToolbar.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(CustomToolbar.this.getHeight(), Integer.MIN_VALUE));
                CustomToolbar customToolbar2 = CustomToolbar.this;
                customToolbar2.layout(customToolbar2.getLeft(), CustomToolbar.this.getTop(), CustomToolbar.this.getRight(), CustomToolbar.this.getBottom());
            }
        };
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        Window window;
        WindowManager.LayoutParams attributes;
        super.requestLayout();
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        Activity currentActivity = ((ThemedReactContext) context).getCurrentActivity();
        Integer valueOf = (currentActivity == null || (window = currentActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : Integer.valueOf(attributes.softInputMode);
        if (Build.VERSION.SDK_INT > 29 || valueOf == null || valueOf.intValue() != 32 || this.isLayoutEnqueued || this.layoutCallback == null) {
            return;
        }
        this.isLayoutEnqueued = true;
        ReactChoreographer.INSTANCE.getInstance().postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.layoutCallback);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        applyDecorViewTopInsetIfNeeded();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resetInsetsState();
        clearPaddingIfNeeded();
    }

    private final void applyDecorViewTopInsetIfNeeded() {
        Activity currentActivity;
        if (this.config.getLegacyTopInsetBehavior() || !this.config.getConsumeTopInset() || this.insetsAppliedFromListener) {
            return;
        }
        Context context = getContext();
        ThemedReactContext themedReactContext = context instanceof ThemedReactContext ? (ThemedReactContext) context : null;
        if (themedReactContext == null || (currentActivity = themedReactContext.getCurrentActivity()) == null) {
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        int decorViewTopInset = DecorViewInsetsUtilsKt.getDecorViewTopInset(decorView);
        if (decorViewTopInset > 0) {
            applyExactPadding(getPaddingLeft(), decorViewTopInset, getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        this.insetsAppliedFromListener = true;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(insets);
        CustomToolbar customToolbar = this;
        Insets resolveInsetsOrZero$default = InsetsKtKt.resolveInsetsOrZero$default(customToolbar, WindowInsetsCompat.Type.displayCutout(), onApplyWindowInsets, false, 4, null);
        Insets resolveInsetsOrZero$default2 = InsetsKtKt.resolveInsetsOrZero$default(customToolbar, WindowInsetsCompat.Type.systemBars(), onApplyWindowInsets, false, 4, null);
        Insets of = Insets.of(resolveInsetsOrZero$default.left + resolveInsetsOrZero$default2.left, 0, resolveInsetsOrZero$default.right + resolveInsetsOrZero$default2.right, 0);
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        if (!(this.config.getLegacyTopInsetBehavior() ? true : this.config.getConsumeTopInset())) {
            resetInsetsState();
            clearPaddingIfNeeded();
            return onApplyWindowInsets;
        }
        Insets of2 = Insets.of(0, Math.max(resolveInsetsOrZero$default.top, this.shouldApplyTopInset ? resolveInsetsOrZero$default2.top : 0), 0, Math.max(resolveInsetsOrZero$default.bottom, 0));
        Intrinsics.checkNotNullExpressionValue(of2, "of(...)");
        Insets add = Insets.add(of, of2);
        Intrinsics.checkNotNullExpressionValue(add, "add(...)");
        if (!Intrinsics.areEqual(this.lastInsets, add)) {
            this.lastInsets = add;
            applyExactPadding(add.left, this.lastInsets.top, this.lastInsets.right, this.lastInsets.bottom);
        }
        return onApplyWindowInsets;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean hasSizeChanged, int l, int t, int r, int b) {
        super.onLayout(hasSizeChanged, l, t, r, b);
        this.config.onNativeToolbarLayout(this, hasSizeChanged || this.isForceShadowStateUpdateOnLayoutRequested);
        this.isForceShadowStateUpdateOnLayoutRequested = false;
    }

    public final void updateContentInsets() {
        setContentInsetStartWithNavigation(this.config.getPreferredContentInsetStartWithNavigation());
        setContentInsetsRelative(this.config.getPreferredContentInsetStart(), this.config.getDefaultStartInset());
    }

    private final void applyExactPadding(int left, int top, int right, int bottom) {
        requestForceShadowStateUpdateOnLayout();
        setPadding(left, top, right, bottom);
    }

    private final void resetInsetsState() {
        this.insetsAppliedFromListener = false;
        Insets NONE = Insets.NONE;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.lastInsets = NONE;
    }

    private final void clearPaddingIfNeeded() {
        if (getPaddingTop() == 0 && getPaddingBottom() == 0 && getPaddingLeft() == 0 && getPaddingRight() == 0) {
            return;
        }
        applyExactPadding(0, 0, 0, 0);
    }

    private final void requestForceShadowStateUpdateOnLayout() {
        this.isForceShadowStateUpdateOnLayoutRequested = this.shouldAvoidDisplayCutout;
    }
}
