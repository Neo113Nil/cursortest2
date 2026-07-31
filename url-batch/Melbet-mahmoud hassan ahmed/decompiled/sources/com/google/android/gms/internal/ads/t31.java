package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class t31 {

    /* renamed from: a, reason: collision with root package name */
    private final xw2 f12067a;

    /* renamed from: b, reason: collision with root package name */
    private final wv1 f12068b;

    /* renamed from: c, reason: collision with root package name */
    private final ds2 f12069c;

    public t31(wv1 wv1Var, ds2 ds2Var, xw2 xw2Var) {
        this.f12067a = xw2Var;
        this.f12068b = wv1Var;
        this.f12069c = ds2Var;
    }

    private static String b(int i7) {
        int i8 = i7 - 1;
        return i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void a(long j7, int i7) {
        if (((Boolean) sw.c().b(m10.f8287q6)).booleanValue()) {
            xw2 xw2Var = this.f12067a;
            ww2 b7 = ww2.b("ad_closed");
            b7.g(this.f12069c.f4313b.f3934b);
            b7.a("show_time", String.valueOf(j7));
            b7.a("ad_format", "app_open_ad");
            b7.a("acr", b(i7));
            xw2Var.a(b7);
            return;
        }
        vv1 a7 = this.f12068b.a();
        a7.d(this.f12069c.f4313b.f3934b);
        a7.b("action", "ad_closed");
        a7.b("show_time", String.valueOf(j7));
        a7.b("ad_format", "app_open_ad");
        a7.b("acr", b(i7));
        a7.f();
    }
}
