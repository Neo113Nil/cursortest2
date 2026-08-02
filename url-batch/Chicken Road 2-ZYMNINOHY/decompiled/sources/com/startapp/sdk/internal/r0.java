package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import java.util.List;

/* loaded from: classes.dex */
public final class r0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f7512a;

    public r0(s0 s0Var) {
        this.f7512a = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s0 s0Var = this.f7512a;
        s0Var.getClass();
        try {
            b9.a(s0Var.f7544a, (List) s0.a(s0Var.f7545b), new TrackingParams().a("APP_PRESENCE"));
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
