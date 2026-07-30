package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Ki, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2640Ki implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26001n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2657Li f26002u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Throwable f26003v;

    public /* synthetic */ RunnableC2640Ki(C2657Li c2657Li, Throwable th, int i) {
        this.f26001n = i;
        this.f26002u = c2657Li;
        this.f26003v = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26001n) {
            case 0:
                C2657Li c2657Li = this.f26002u;
                c2657Li.getClass();
                boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Jb)).booleanValue();
                Context context = c2657Li.f26190a;
                Throwable th = this.f26003v;
                if (!booleanValue) {
                    C4287ze.a(context).e("AttributionReportingSampled", th);
                    break;
                } else {
                    C4287ze.c(context).e("AttributionReporting", th);
                    break;
                }
            default:
                C2657Li c2657Li2 = this.f26002u;
                c2657Li2.getClass();
                boolean booleanValue2 = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Jb)).booleanValue();
                Context context2 = c2657Li2.f26190a;
                Throwable th2 = this.f26003v;
                if (!booleanValue2) {
                    C4287ze.a(context2).e("AttributionReportingSampled.getUpdatedUrlAndRegisterSource", th2);
                    break;
                } else {
                    C4287ze.c(context2).e("AttributionReporting.getUpdatedUrlAndRegisterSource", th2);
                    break;
                }
        }
    }
}
