package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.yh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC3121yh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40284a;

    /* renamed from: b, reason: collision with root package name */
    public final C2773l6 f40285b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f40286c;

    /* renamed from: d, reason: collision with root package name */
    public final C3056w4 f40287d;

    public RunnableC3121yh(Context context, C2773l6 c2773l6, Bundle bundle, C3056w4 c3056w4) {
        this.f40284a = context;
        this.f40285b = c2773l6;
        this.f40286c = bundle;
        this.f40287d = c3056w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C2562d4 a4 = C2562d4.a(this.f40284a, this.f40286c);
            if (a4 == null) {
                return;
            }
            C2771l4 a5 = C2771l4.a(a4);
            C2941rj u4 = Ia.f37730F.u();
            u4.a(a4.f38818b.getAppVersion(), a4.f38818b.getAppBuildNumber());
            u4.a(a4.f38818b.getDeviceType());
            K4 k4 = new K4(new Zl(a4), new J4(a4.f38818b, Bb.c(a4.f38817a.f38132a.getAsString("PROCESS_CFG_CLIDS"))), a4.f38817a.f38133b);
            this.f40287d.a(a5, k4).a(this.f40285b, k4);
        } catch (Throwable th) {
            C2551ck c2551ck = Bj.f37257a;
            String str = "Exception during processing event with type: " + this.f40285b.f39379d + " (" + this.f40285b.f39380e + "): " + th.getMessage();
            c2551ck.getClass();
            c2551ck.a(new Cj(str, th));
        }
    }
}
