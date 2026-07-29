package com.chartboost.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.impl.s;

@SuppressLint({"Registered"})
/* loaded from: classes.dex */
public class CBImpressionActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    final com.chartboost.sdk.Tracking.a f3551a;

    /* renamed from: b, reason: collision with root package name */
    final Handler f3552b;

    /* renamed from: c, reason: collision with root package name */
    final c f3553c;

    /* renamed from: d, reason: collision with root package name */
    private Activity f3554d;

    public CBImpressionActivity() {
        this.f3551a = h.a() != null ? h.a().o : null;
        this.f3552b = h.a() != null ? h.a().p : null;
        this.f3553c = h.a() != null ? h.a().q : null;
        this.f3554d = null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f3554d != null) {
            return this.f3554d.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void forwardTouchEvents(Activity activity) {
        this.f3554d = activity;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if ((getIntent() != null && !getIntent().getBooleanExtra("isChartboost", false)) || this.f3551a == null || this.f3552b == null || this.f3553c == null) {
            CBLogging.b("CBImpressionActivity", "This activity cannot be called from outside chartboost SDK");
            finish();
            return;
        }
        a();
        requestWindowFeature(1);
        getWindow().setWindowAnimations(0);
        this.f3553c.a(this);
        setContentView(new RelativeLayout(this));
        b();
        CBLogging.a("CBImpressionActivity", "Impression Activity onCreate() called");
    }

    @TargetApi(11)
    private void a() {
        if (s.a().a(11)) {
            getWindow().setFlags(16777216, 16777216);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        try {
            super.onStart();
            if (this.f3553c == null || i.s) {
                return;
            }
            this.f3553c.e(this);
        } catch (Exception e) {
            com.chartboost.sdk.Tracking.a.a(getClass(), "onStart", e);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        try {
            super.onResume();
            if (this.f3553c != null && !i.s) {
                this.f3553c.a((Activity) this);
                this.f3553c.h();
            }
        } catch (Exception e) {
            com.chartboost.sdk.Tracking.a.a(getClass(), "onResume", e);
        }
        Chartboost.setActivityAttrs(this);
    }

    @Override // android.app.Activity
    protected void onPause() {
        try {
            super.onPause();
            if (this.f3553c == null || i.s) {
                return;
            }
            this.f3553c.a((Activity) this);
            this.f3553c.i();
        } catch (Exception e) {
            com.chartboost.sdk.Tracking.a.a(getClass(), "onPause", e);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        try {
            super.onStop();
            if (this.f3553c == null || i.s) {
                return;
            }
            this.f3553c.i(this);
        } catch (Exception e) {
            com.chartboost.sdk.Tracking.a.a(getClass(), "onStop", e);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        try {
            try {
                if (this.f3553c != null && !i.s) {
                    this.f3553c.k(this);
                }
                super.onDestroy();
            } catch (Throwable th) {
                super.onDestroy();
                throw th;
            }
        } catch (Exception e) {
            com.chartboost.sdk.Tracking.a.a(getClass(), "onDestroy", e);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        try {
            if (this.f3553c == null || !this.f3553c.k()) {
                super.onBackPressed();
            }
        } catch (Exception e) {
            com.chartboost.sdk.Tracking.a.a(getClass(), "onBackPressed", e);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!s.a().a(14) || getWindow() == null || getWindow().getDecorView() == null || getWindow().getDecorView().isHardwareAccelerated() || this.f3553c == null) {
                return;
            }
            CBLogging.b("CBImpressionActivity", "The activity passed down is not hardware accelerated, so Chartboost cannot show ads");
            com.chartboost.sdk.Model.c d2 = this.f3553c.d();
            if (d2 != null) {
                d2.a(CBError.CBImpressionError.HARDWARE_ACCELERATION_DISABLED);
            }
            finish();
        } catch (Exception e) {
            com.chartboost.sdk.Tracking.a.a(getClass(), "onAttachedToWindow", e);
        }
    }

    private void b() {
        if (s.a().a(14)) {
            return;
        }
        this.f3552b.post(new Runnable() { // from class: com.chartboost.sdk.CBImpressionActivity.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    CBLogging.e("VideoInit", "preparing activity for video surface");
                    CBImpressionActivity.this.addContentView(new SurfaceView(CBImpressionActivity.this), new ViewGroup.LayoutParams(0, 0));
                } catch (Exception e) {
                    com.chartboost.sdk.Tracking.a.a(CBImpressionActivity.class, "postCreateSurfaceView Runnable.run", e);
                }
            }
        });
    }
}
