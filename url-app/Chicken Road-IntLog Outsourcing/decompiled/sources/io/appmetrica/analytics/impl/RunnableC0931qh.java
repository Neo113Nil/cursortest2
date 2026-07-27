package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.qh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0931qh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9108a;

    /* renamed from: b, reason: collision with root package name */
    public final W5 f9109b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f9110c;

    /* renamed from: d, reason: collision with root package name */
    public final C0711i4 f9111d;

    public RunnableC0931qh(Context context, W5 w5, Bundle bundle, C0711i4 c0711i4) {
        this.f9108a = context;
        this.f9109b = w5;
        this.f9110c = bundle;
        this.f9111d = c0711i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            P3 a6 = P3.a(this.f9108a, this.f9110c);
            if (a6 == null) {
                return;
            }
            X3 a7 = X3.a(a6);
            C0751jj v4 = C1027ua.f9366H.v();
            v4.a(a6.f7239b.getAppVersion(), a6.f7239b.getAppBuildNumber());
            v4.a(a6.f7239b.getDeviceType());
            C1073w4 c1073w4 = new C1073w4(new C0600dm(a6), new C1047v4(a6.f7239b, AbstractC0847nb.c(a6.f7238a.f6837a.getAsString("PROCESS_CFG_CLIDS"))), a6.f7238a.f6838b);
            this.f9111d.a(a7, c1073w4).a(this.f9109b, c1073w4);
        } catch (Throwable th) {
            Vj vj = AbstractC1010tj.f9323a;
            String str = "Exception during processing event with type: " + this.f9109b.f7651d + " (" + this.f9109b.f7652e + "): " + th.getMessage();
            vj.getClass();
            vj.a(new C1036uj(str, th));
        }
    }
}
