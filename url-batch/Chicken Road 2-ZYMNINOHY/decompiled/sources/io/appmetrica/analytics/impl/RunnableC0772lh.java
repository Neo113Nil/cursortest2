package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.lh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0772lh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12303a;

    /* renamed from: b, reason: collision with root package name */
    public final P5 f12304b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f12305c;

    /* renamed from: d, reason: collision with root package name */
    public final C0475a4 f12306d;

    public RunnableC0772lh(Context context, P5 p5, Bundle bundle, C0475a4 c0475a4) {
        this.f12303a = context;
        this.f12304b = p5;
        this.f12305c = bundle;
        this.f12306d = c0475a4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            H3 a3 = H3.a(this.f12303a, this.f12305c);
            if (a3 == null) {
                return;
            }
            P3 a4 = P3.a(a3);
            C0593ej v = C0817na.f12417I.v();
            v.a(a3.f10356b.getAppVersion(), a3.f10356b.getAppBuildNumber());
            v.a(a3.f10356b.getDeviceType());
            C0863p4 c0863p4 = new C0863p4(new Zl(a3), new C0837o4(a3.f10356b, AbstractC0637gb.c(a3.f10355a.f10112a.getAsString("PROCESS_CFG_CLIDS"))), a3.f10355a.f10113b);
            this.f12306d.a(a4, c0863p4).a(this.f12304b, c0863p4);
        } catch (Throwable th) {
            Qj qj = AbstractC0852oj.f12527a;
            String str = "Exception during processing event with type: " + this.f12304b.f10797d + " (" + this.f12304b.f10798e + "): " + th.getMessage();
            qj.getClass();
            qj.a(new C0878pj(str, th));
        }
    }
}
