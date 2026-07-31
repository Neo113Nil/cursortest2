package com.chartboost.sdk.view;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.impl.ag;
import com.chartboost.sdk.impl.cl;
import com.chartboost.sdk.impl.f4;
import com.chartboost.sdk.impl.sg;
import com.chartboost.sdk.impl.x9;
import com.chartboost.sdk.impl.xb;
import com.chartboost.sdk.impl.z9;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b$\u0010\tJ\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\tJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\tJ\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\tJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u0015J\u000f\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010\tJ\u000f\u0010 \u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010\tR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\"¨\u0006%"}, d2 = {"Lcom/chartboost/sdk/view/CBImpressionActivity;", "Landroid/app/Activity;", "Lcom/chartboost/sdk/impl/x9;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", X3.i.u0, X3.i.t0, "onDestroy", "onBackPressed", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onAttachedToWindow", "", "isActivityHardwareAccelerated", "()Z", "finishActivity", "Lcom/chartboost/sdk/impl/cl;", "view", "attachViewToActivity", "(Lcom/chartboost/sdk/impl/cl;)V", "getActivity", "()Lcom/chartboost/sdk/view/CBImpressionActivity;", "setFullscreen", "b", "a", "c", "Lcom/chartboost/sdk/impl/z9;", "Lcom/chartboost/sdk/impl/z9;", "presenter", "<init>", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CBImpressionActivity extends Activity implements x9 {

    /* renamed from: a, reason: from kotlin metadata */
    public z9 presenter;

    public final void a() {
        if (this.presenter == null) {
            if (!Chartboost.isSdkStarted()) {
                xb.b("Cannot start Chartboost activity due to SDK not being initialized.", (Throwable) null, 2, (Object) null);
                finish();
                return;
            }
            f4 f4Var = f4.b;
            ag a = f4Var.i().a();
            Object obj = f4Var.a().b().get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            this.presenter = new z9(this, a, (sg) obj, f4Var.d().j());
        }
    }

    @Override // com.chartboost.sdk.impl.x9
    public void attachViewToActivity(@NotNull cl view) {
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            addContentView(view, new FrameLayout.LayoutParams(-1, -1));
        } catch (Exception e) {
            xb.a("Cannot attach view to activity", e);
        }
    }

    public final boolean b() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("isChartboost", false);
        }
        return false;
    }

    public final void c() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.c, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.chartboost.sdk.impl.x9
    public void finishActivity() {
        finish();
    }

    @Override // com.chartboost.sdk.impl.x9
    @NotNull
    public CBImpressionActivity getActivity() {
        return this;
    }

    @Override // com.chartboost.sdk.impl.x9
    public boolean isActivityHardwareAccelerated() {
        View decorView;
        Window window = getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return false;
        }
        return decorView.isHardwareAccelerated();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        z9 z9Var = this.presenter;
        if (z9Var != null) {
            z9Var.h();
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        z9 z9Var = this.presenter;
        if (z9Var != null) {
            z9Var.b();
        }
        super.onConfigurationChanged(newConfig);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        c();
        if (!b()) {
            xb.b("This activity cannot be called from outside chartboost SDK", (Throwable) null, 2, (Object) null);
            finish();
            return;
        }
        requestWindowFeature(1);
        getWindow().setWindowAnimations(0);
        a();
        z9 z9Var = this.presenter;
        if (z9Var != null) {
            z9Var.c();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        z9 z9Var = this.presenter;
        if (z9Var != null) {
            z9Var.d();
        }
        this.presenter = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        z9 z9Var = this.presenter;
        if (z9Var != null) {
            z9Var.e();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        a();
        z9 z9Var = this.presenter;
        if (z9Var != null) {
            z9Var.f();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        z9 z9Var = this.presenter;
        if (z9Var != null) {
            z9Var.g();
        }
    }

    @Override // com.chartboost.sdk.impl.x9
    public void setFullscreen() {
        WindowInsetsController insetsController;
        int statusBars;
        int navigationBars;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                Window window = getWindow();
                if (window != null) {
                    window.setDecorFitsSystemWindows(true);
                    insetsController = window.getInsetsController();
                    if (insetsController != null) {
                        statusBars = WindowInsets.Type.statusBars();
                        navigationBars = WindowInsets.Type.navigationBars();
                        insetsController.hide(statusBars | navigationBars);
                        insetsController.setSystemBarsBehavior(2);
                    }
                }
            } else {
                Window window2 = getWindow();
                View decorView = window2 != null ? window2.getDecorView() : null;
                if (decorView != null) {
                    decorView.setSystemUiVisibility(3846);
                }
            }
            if (i >= 28) {
                Window window3 = getWindow();
                WindowManager.LayoutParams attributes = window3 != null ? window3.getAttributes() : null;
                if (attributes == null) {
                    return;
                }
                attributes.layoutInDisplayCutoutMode = 1;
            }
        } catch (Exception e) {
            xb.a("Cannot set view to fullscreen", e);
        }
    }
}
