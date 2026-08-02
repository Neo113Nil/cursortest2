package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.qh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0780qh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8174a;

    /* renamed from: b, reason: collision with root package name */
    public final W5 f8175b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f8176c;

    /* renamed from: d, reason: collision with root package name */
    public final C0560i4 f8177d;

    public RunnableC0780qh(Context context, W5 w5, Bundle bundle, C0560i4 c0560i4) {
        this.f8174a = context;
        this.f8175b = w5;
        this.f8176c = bundle;
        this.f8177d = c0560i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            P3 a3 = P3.a(this.f8174a, this.f8176c);
            if (a3 == null) {
                return;
            }
            X3 a4 = X3.a(a3);
            C0600jj v = C0876ua.f8420H.v();
            v.a(a3.f6428b.getAppVersion(), a3.f6428b.getAppBuildNumber());
            v.a(a3.f6428b.getDeviceType());
            C0922w4 c0922w4 = new C0922w4(new C0449dm(a3), new C0896v4(a3.f6428b, AbstractC0696nb.c(a3.f6427a.f6044a.getAsString("PROCESS_CFG_CLIDS"))), a3.f6427a.f6045b);
            this.f8177d.a(a4, c0922w4).a(this.f8175b, c0922w4);
        } catch (Throwable th) {
            Vj vj = AbstractC0859tj.f8379a;
            String str = "Exception during processing event with type: " + this.f8175b.f6818d + " (" + this.f8175b.f6819e + "): " + th.getMessage();
            vj.getClass();
            vj.a(new C0885uj(str, th));
        }
    }
}
