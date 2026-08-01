package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.a6;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.internal.measurement.r6;
import com.google.android.gms.internal.measurement.u6;
import com.google.android.gms.internal.measurement.w6;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class AppMeasurementSdk {

    /* renamed from: a, reason: collision with root package name */
    public final d7 f3061a;

    public AppMeasurementSdk(d7 d7Var) {
        this.f3061a = d7Var;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return d7.c(context, null).f2226b;
    }

    public void beginAdUnitExposure(String str) {
        d7 d7Var = this.f3061a;
        d7Var.a(new u6(d7Var, str, 0));
    }

    public void endAdUnitExposure(String str) {
        d7 d7Var = this.f3061a;
        d7Var.a(new u6(d7Var, str, 1));
    }

    public long generateEventId() {
        return this.f3061a.d();
    }

    public String getAppInstanceId() {
        a6 a6Var = new a6();
        d7 d7Var = this.f3061a;
        d7Var.a(new w6(d7Var, a6Var, 1));
        return (String) a6.E(a6Var.D(50L), String.class);
    }

    public String getGmpAppId() {
        a6 a6Var = new a6();
        d7 d7Var = this.f3061a;
        d7Var.a(new w6(d7Var, a6Var, 0));
        return (String) a6.E(a6Var.D(500L), String.class);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        d7 d7Var = this.f3061a;
        d7Var.a(new r6(d7Var, str, str2, bundle, 1));
    }
}
