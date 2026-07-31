package com.chartboost.sdk.impl;

import android.app.Activity;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class z9 implements b {
    public final x9 a;
    public final ag b;
    public final sg c;
    public final v6 d;
    public int e;

    public z9(x9 view, ag rendererActivityBridge, sg sdkConfiguration, v6 displayMeasurement) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(rendererActivityBridge, "rendererActivityBridge");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        this.a = view;
        this.b = rendererActivityBridge;
        this.c = sdkConfiguration;
        this.d = displayMeasurement;
        this.e = -1;
    }

    @Override // com.chartboost.sdk.impl.b
    public void finishActivity() {
        this.a.finishActivity();
    }

    public void c() {
        this.b.a(this, this.a.getActivity());
        this.a.setFullscreen();
        i();
    }

    public void g() {
        try {
            this.b.onStart();
        } catch (Exception e) {
            xb.a("Cannot perform onResume", e);
        }
    }

    public void f() {
        try {
            this.b.a(this, this.a.getActivity());
        } catch (Exception e) {
            xb.a("Cannot setActivityRendererInterface", e);
        }
        try {
            this.b.onResume();
        } catch (Exception e2) {
            xb.a("Cannot perform onResume", e2);
        }
        this.a.setFullscreen();
        try {
            qe.a(this.a.getActivity(), this.c, this.d);
        } catch (Exception e3) {
            xb.a("Cannot lock the orientation in activity", e3);
        }
    }

    public void e() {
        try {
            this.b.b();
        } catch (Exception e) {
            xb.a("Cannot perform onPause", e);
        }
        try {
            qe.a(this.a.getActivity(), this.c);
        } catch (Exception e2) {
            xb.a("Cannot lock the orientation in activity", e2);
        }
    }

    public void d() {
        try {
            this.b.c();
        } catch (Exception e) {
            xb.a("Cannot perform onStop", e);
        }
    }

    public void b() {
        try {
            this.b.e();
        } catch (Exception e) {
            xb.a("Cannot perform onStop", e);
        }
    }

    public void h() {
        try {
            if (this.a.isActivityHardwareAccelerated()) {
                return;
            }
            xb.b("The activity passed down is not hardware accelerated, so Chartboost cannot show ads", (Throwable) null, 2, (Object) null);
            this.b.a(CBError.Impression.HARDWARE_ACCELERATION_DISABLED);
            this.a.finishActivity();
        } catch (Exception e) {
            xb.b("onAttachedToWindow", e);
        }
    }

    @Override // com.chartboost.sdk.impl.b
    public void a(int i, boolean z) {
        int i2;
        try {
            CBImpressionActivity activity = this.a.getActivity();
            if (qe.a((Activity) activity)) {
                return;
            }
            i();
            if (i != 0) {
                i2 = 1;
                if (i != 1) {
                    i2 = z ? -1 : activity.getResources().getConfiguration().orientation;
                }
            } else {
                i2 = 0;
            }
            activity.setRequestedOrientation(i2);
        } catch (Exception e) {
            xb.b("applyOrientationProperties: ", e);
        }
    }

    @Override // com.chartboost.sdk.impl.b
    public void a(cl viewBase) {
        Intrinsics.checkNotNullParameter(viewBase, "viewBase");
        this.a.attachViewToActivity(viewBase);
    }

    public final void i() {
        try {
            this.e = this.a.getActivity().getRequestedOrientation();
        } catch (Exception e) {
            xb.b("saveOriginalOrientation: ", e);
        }
    }

    @Override // com.chartboost.sdk.impl.b
    public void a() {
        try {
            CBImpressionActivity activity = this.a.getActivity();
            if (qe.a((Activity) activity)) {
                return;
            }
            int requestedOrientation = activity.getRequestedOrientation();
            int i = this.e;
            if (requestedOrientation != i) {
                xb.b("restoreOriginalOrientation: " + i, (Throwable) null, 2, (Object) null);
                activity.setRequestedOrientation(this.e);
            }
        } catch (Exception e) {
            xb.b("restoreOriginalOrientation: ", e);
        }
    }
}
