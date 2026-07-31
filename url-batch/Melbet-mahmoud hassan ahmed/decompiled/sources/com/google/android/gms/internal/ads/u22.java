package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class u22 implements vf1, yu, qb1, za1 {

    /* renamed from: f, reason: collision with root package name */
    private final Context f12592f;

    /* renamed from: g, reason: collision with root package name */
    private final ws2 f12593g;

    /* renamed from: h, reason: collision with root package name */
    private final ds2 f12594h;

    /* renamed from: i, reason: collision with root package name */
    private final rr2 f12595i;

    /* renamed from: j, reason: collision with root package name */
    private final o42 f12596j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f12597k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f12598l = ((Boolean) sw.c().b(m10.f8230j5)).booleanValue();

    /* renamed from: m, reason: collision with root package name */
    private final xw2 f12599m;

    /* renamed from: n, reason: collision with root package name */
    private final String f12600n;

    public u22(Context context, ws2 ws2Var, ds2 ds2Var, rr2 rr2Var, o42 o42Var, xw2 xw2Var, String str) {
        this.f12592f = context;
        this.f12593g = ws2Var;
        this.f12594h = ds2Var;
        this.f12595i = rr2Var;
        this.f12596j = o42Var;
        this.f12599m = xw2Var;
        this.f12600n = str;
    }

    private final ww2 b(String str) {
        ww2 b7 = ww2.b(str);
        b7.h(this.f12594h, null);
        b7.f(this.f12595i);
        b7.a("request_id", this.f12600n);
        if (!this.f12595i.f11398u.isEmpty()) {
            b7.a("ancn", this.f12595i.f11398u.get(0));
        }
        if (this.f12595i.f11380g0) {
            y2.t.q();
            b7.a("device_connectivity", true != a3.g2.j(this.f12592f) ? "offline" : "online");
            b7.a("event_timestamp", String.valueOf(y2.t.a().b()));
            b7.a("offline_ad", "1");
        }
        return b7;
    }

    private final void e(ww2 ww2Var) {
        if (!this.f12595i.f11380g0) {
            this.f12599m.a(ww2Var);
            return;
        }
        this.f12596j.i(new q42(y2.t.a().b(), this.f12594h.f4313b.f3934b.f12947b, this.f12599m.b(ww2Var), 2));
    }

    private final boolean f() {
        if (this.f12597k == null) {
            synchronized (this) {
                if (this.f12597k == null) {
                    String str = (String) sw.c().b(m10.f8186e1);
                    y2.t.q();
                    String d02 = a3.g2.d0(this.f12592f);
                    boolean z6 = false;
                    if (str != null && d02 != null) {
                        try {
                            z6 = Pattern.matches(str, d02);
                        } catch (RuntimeException e7) {
                            y2.t.p().s(e7, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f12597k = Boolean.valueOf(z6);
                }
            }
        }
        return this.f12597k.booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final void M() {
        if (this.f12595i.f11380g0) {
            e(b("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final void a() {
        if (this.f12598l) {
            xw2 xw2Var = this.f12599m;
            ww2 b7 = b("ifts");
            b7.a("reason", "blocked");
            xw2Var.a(b7);
        }
    }

    @Override // com.google.android.gms.internal.ads.vf1
    public final void c() {
        if (f()) {
            this.f12599m.a(b("adapter_shown"));
        }
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final void d(cv cvVar) {
        cv cvVar2;
        if (this.f12598l) {
            int i7 = cvVar.f3954f;
            String str = cvVar.f3955g;
            if (cvVar.f3956h.equals("com.google.android.gms.ads") && (cvVar2 = cvVar.f3957i) != null && !cvVar2.f3956h.equals("com.google.android.gms.ads")) {
                cv cvVar3 = cvVar.f3957i;
                i7 = cvVar3.f3954f;
                str = cvVar3.f3955g;
            }
            String a7 = this.f12593g.a(str);
            ww2 b7 = b("ifts");
            b7.a("reason", "adapter");
            if (i7 >= 0) {
                b7.a("arec", String.valueOf(i7));
            }
            if (a7 != null) {
                b7.a("areec", a7);
            }
            this.f12599m.a(b7);
        }
    }

    @Override // com.google.android.gms.internal.ads.vf1
    public final void g() {
        if (f()) {
            this.f12599m.a(b("adapter_impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final void k() {
        if (f() || this.f12595i.f11380g0) {
            e(b("impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final void r0(ok1 ok1Var) {
        if (this.f12598l) {
            ww2 b7 = b("ifts");
            b7.a("reason", "exception");
            if (!TextUtils.isEmpty(ok1Var.getMessage())) {
                b7.a("msg", ok1Var.getMessage());
            }
            this.f12599m.a(b7);
        }
    }
}
