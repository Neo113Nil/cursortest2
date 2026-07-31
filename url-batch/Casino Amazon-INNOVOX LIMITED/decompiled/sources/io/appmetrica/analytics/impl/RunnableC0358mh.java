package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.mh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0358mh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1379a;
    public final Q5 b;
    public final Bundle c;
    public final C0062b4 d;

    public RunnableC0358mh(Context context, Q5 q5, Bundle bundle, C0062b4 c0062b4) {
        this.f1379a = context;
        this.b = q5;
        this.c = bundle;
        this.d = c0062b4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            I3 a2 = I3.a(this.f1379a, this.c);
            if (a2 == null) {
                return;
            }
            Q3 a3 = Q3.a(a2);
            C0180fj v = C0401oa.I.v();
            v.a(a2.b.getAppVersion(), a2.b.getAppBuildNumber());
            v.a(a2.b.getDeviceType());
            C0445q4 c0445q4 = new C0445q4(new C0054am(a2), new C0420p4(a2.b, AbstractC0224hb.c(a2.f884a.f798a.getAsString("PROCESS_CFG_CLIDS"))), a2.f884a.b);
            this.d.a(a3, c0445q4).a(this.b, c0445q4);
        } catch (Throwable th) {
            Rj rj = AbstractC0435pj.f1437a;
            String str = "Exception during processing event with type: " + this.b.d + " (" + this.b.e + "): " + th.getMessage();
            rj.getClass();
            rj.a(new C0460qj(str, th));
        }
    }
}
