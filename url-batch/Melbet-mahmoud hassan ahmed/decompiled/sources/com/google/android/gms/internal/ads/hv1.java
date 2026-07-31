package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class hv1 implements vf1, yu, qb1, za1 {

    /* renamed from: f, reason: collision with root package name */
    private final Context f6427f;

    /* renamed from: g, reason: collision with root package name */
    private final ws2 f6428g;

    /* renamed from: h, reason: collision with root package name */
    private final wv1 f6429h;

    /* renamed from: i, reason: collision with root package name */
    private final ds2 f6430i;

    /* renamed from: j, reason: collision with root package name */
    private final rr2 f6431j;

    /* renamed from: k, reason: collision with root package name */
    private final o42 f6432k;

    /* renamed from: l, reason: collision with root package name */
    private Boolean f6433l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f6434m = ((Boolean) sw.c().b(m10.f8230j5)).booleanValue();

    public hv1(Context context, ws2 ws2Var, wv1 wv1Var, ds2 ds2Var, rr2 rr2Var, o42 o42Var) {
        this.f6427f = context;
        this.f6428g = ws2Var;
        this.f6429h = wv1Var;
        this.f6430i = ds2Var;
        this.f6431j = rr2Var;
        this.f6432k = o42Var;
    }

    private final vv1 b(String str) {
        vv1 a7 = this.f6429h.a();
        a7.d(this.f6430i.f4313b.f3934b);
        a7.c(this.f6431j);
        a7.b("action", str);
        if (!this.f6431j.f11398u.isEmpty()) {
            a7.b("ancn", this.f6431j.f11398u.get(0));
        }
        if (this.f6431j.f11380g0) {
            y2.t.q();
            a7.b("device_connectivity", true != a3.g2.j(this.f6427f) ? "offline" : "online");
            a7.b("event_timestamp", String.valueOf(y2.t.a().b()));
            a7.b("offline_ad", "1");
        }
        if (((Boolean) sw.c().b(m10.f8302s5)).booleanValue()) {
            boolean d7 = g3.o.d(this.f6430i);
            a7.b("scar", String.valueOf(d7));
            if (d7) {
                String b7 = g3.o.b(this.f6430i);
                if (!TextUtils.isEmpty(b7)) {
                    a7.b("ragent", b7);
                }
                String a8 = g3.o.a(this.f6430i);
                if (!TextUtils.isEmpty(a8)) {
                    a7.b("rtype", a8);
                }
            }
        }
        return a7;
    }

    private final void e(vv1 vv1Var) {
        if (!this.f6431j.f11380g0) {
            vv1Var.f();
            return;
        }
        this.f6432k.i(new q42(y2.t.a().b(), this.f6430i.f4313b.f3934b.f12947b, vv1Var.e(), 2));
    }

    private final boolean f() {
        if (this.f6433l == null) {
            synchronized (this) {
                if (this.f6433l == null) {
                    String str = (String) sw.c().b(m10.f8186e1);
                    y2.t.q();
                    String d02 = a3.g2.d0(this.f6427f);
                    boolean z6 = false;
                    if (str != null && d02 != null) {
                        try {
                            z6 = Pattern.matches(str, d02);
                        } catch (RuntimeException e7) {
                            y2.t.p().s(e7, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f6433l = Boolean.valueOf(z6);
                }
            }
        }
        return this.f6433l.booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final void M() {
        if (this.f6431j.f11380g0) {
            e(b("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final void a() {
        if (this.f6434m) {
            vv1 b7 = b("ifts");
            b7.b("reason", "blocked");
            b7.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.vf1
    public final void c() {
        if (f()) {
            b("adapter_shown").f();
        }
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final void d(cv cvVar) {
        cv cvVar2;
        if (this.f6434m) {
            vv1 b7 = b("ifts");
            b7.b("reason", "adapter");
            int i7 = cvVar.f3954f;
            String str = cvVar.f3955g;
            if (cvVar.f3956h.equals("com.google.android.gms.ads") && (cvVar2 = cvVar.f3957i) != null && !cvVar2.f3956h.equals("com.google.android.gms.ads")) {
                cv cvVar3 = cvVar.f3957i;
                i7 = cvVar3.f3954f;
                str = cvVar3.f3955g;
            }
            if (i7 >= 0) {
                b7.b("arec", String.valueOf(i7));
            }
            String a7 = this.f6428g.a(str);
            if (a7 != null) {
                b7.b("areec", a7);
            }
            b7.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.vf1
    public final void g() {
        if (f()) {
            b("adapter_impression").f();
        }
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final void k() {
        if (f() || this.f6431j.f11380g0) {
            e(b("impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final void r0(ok1 ok1Var) {
        if (this.f6434m) {
            vv1 b7 = b("ifts");
            b7.b("reason", "exception");
            if (!TextUtils.isEmpty(ok1Var.getMessage())) {
                b7.b("msg", ok1Var.getMessage());
            }
            b7.f();
        }
    }
}
