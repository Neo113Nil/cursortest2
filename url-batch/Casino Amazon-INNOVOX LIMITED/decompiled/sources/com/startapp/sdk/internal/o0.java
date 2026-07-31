package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import java.util.List;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f356a;

    public o0(p0 p0Var) {
        this.f356a = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p0 p0Var = this.f356a;
        try {
            m8.a(p0Var.f372a, (List) p0.a(p0Var.b), new TrackingParams().a("APP_PRESENCE"));
        } catch (Throwable th) {
            n8.a(th);
        }
    }
}
