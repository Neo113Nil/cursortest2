package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class ix0 extends bk2 {

    /* renamed from: a, reason: collision with root package name */
    private final jl2 f6813a;

    /* renamed from: b, reason: collision with root package name */
    private final b01 f6814b;

    /* renamed from: c, reason: collision with root package name */
    private final ix0 f6815c = this;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<Integer> f6816d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<yj2> f6817e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<String> f6818f;

    /* renamed from: g, reason: collision with root package name */
    private final yv3<hk2> f6819g;

    /* renamed from: h, reason: collision with root package name */
    private final yv3<nk2> f6820h;

    /* renamed from: i, reason: collision with root package name */
    private final yv3<rk2> f6821i;

    /* renamed from: j, reason: collision with root package name */
    private final yv3<zk2> f6822j;

    /* renamed from: k, reason: collision with root package name */
    private final yv3<gl2> f6823k;

    /* renamed from: l, reason: collision with root package name */
    private final yv3<yl2> f6824l;

    /* renamed from: m, reason: collision with root package name */
    private final yv3<Boolean> f6825m;

    /* renamed from: n, reason: collision with root package name */
    private final yv3<tl2> f6826n;

    /* renamed from: o, reason: collision with root package name */
    private final yv3<String> f6827o;

    /* renamed from: p, reason: collision with root package name */
    private final yv3<ev1> f6828p;

    /* renamed from: q, reason: collision with root package name */
    private final yv3<ev1> f6829q;

    /* renamed from: r, reason: collision with root package name */
    private final yv3<ev1> f6830r;

    /* renamed from: s, reason: collision with root package name */
    private final yv3<ev1> f6831s;

    /* renamed from: t, reason: collision with root package name */
    private final yv3<Map<gw2, ev1>> f6832t;

    /* renamed from: u, reason: collision with root package name */
    private final yv3<Set<hi1<ow2>>> f6833u;

    /* renamed from: v, reason: collision with root package name */
    private final yv3<Set<hi1<ow2>>> f6834v;

    /* renamed from: w, reason: collision with root package name */
    private final yv3 f6835w;

    /* renamed from: x, reason: collision with root package name */
    private final yv3<nw2> f6836x;

    /* synthetic */ ix0(b01 b01Var, jl2 jl2Var, hx0 hx0Var) {
        e11 e11Var;
        yv3 yv3Var;
        yv3 yv3Var2;
        uw0 uw0Var;
        yv3 yv3Var3;
        e11 e11Var2;
        yv3 yv3Var4;
        yv3 yv3Var5;
        yv3 yv3Var6;
        y01 y01Var;
        yv3 yv3Var7;
        a11 a11Var;
        c11 c11Var;
        yv3 yv3Var8;
        yv3 yv3Var9;
        yv3 yv3Var10;
        g11 g11Var;
        yv3 yv3Var11;
        yv3 yv3Var12;
        yv3 yv3Var13;
        this.f6814b = b01Var;
        this.f6813a = jl2Var;
        ll2 ll2Var = new ll2(jl2Var);
        this.f6816d = ll2Var;
        e11Var = d11.f4035a;
        yv3Var = b01Var.f3111i;
        yv3Var2 = b01Var.f3123o;
        this.f6817e = new ak2(e11Var, yv3Var, yv3Var2, gv2.b(), ll2Var);
        kl2 kl2Var = new kl2(jl2Var);
        this.f6818f = kl2Var;
        uw0Var = tw0.f12392a;
        yv3Var3 = b01Var.f3111i;
        this.f6819g = new jk2(uw0Var, yv3Var3, kl2Var, gv2.b());
        e11Var2 = d11.f4035a;
        yv3Var4 = b01Var.f3111i;
        yv3Var5 = b01Var.f3098b0;
        yv3Var6 = b01Var.f3123o;
        this.f6820h = new pk2(e11Var2, ll2Var, yv3Var4, yv3Var5, yv3Var6, gv2.b(), kl2Var);
        y01Var = x01.f13979a;
        gv2 b7 = gv2.b();
        yv3Var7 = b01Var.f3111i;
        this.f6821i = new tk2(y01Var, b7, yv3Var7);
        a11Var = z01.f14880a;
        this.f6822j = new bl2(a11Var, gv2.b(), kl2Var);
        c11Var = b11.f3152a;
        yv3Var8 = b01Var.f3123o;
        yv3Var9 = b01Var.f3111i;
        this.f6823k = new il2(c11Var, yv3Var8, yv3Var9);
        this.f6824l = new am2(gv2.b());
        ml2 ml2Var = new ml2(jl2Var);
        this.f6825m = ml2Var;
        yv3Var10 = b01Var.f3098b0;
        g11Var = f11.f4941a;
        gv2 b8 = gv2.b();
        yv3Var11 = b01Var.f3123o;
        this.f6826n = new vl2(yv3Var10, ml2Var, g11Var, b8, kl2Var, yv3Var11);
        nl2 nl2Var = new nl2(jl2Var);
        this.f6827o = nl2Var;
        yv3<ev1> c7 = jv3.c(xu1.b());
        this.f6828p = c7;
        yv3<ev1> c8 = jv3.c(uu1.b());
        this.f6829q = c8;
        yv3<ev1> c9 = jv3.c(zu1.b());
        this.f6830r = c9;
        yv3<ev1> c10 = jv3.c(bv1.b());
        this.f6831s = c10;
        nv3 c11 = ov3.c(4);
        c11.b(gw2.GMS_SIGNALS, c7);
        c11.b(gw2.BUILD_URL, c8);
        c11.b(gw2.HTTP, c9);
        c11.b(gw2.PRE_PROCESS, c10);
        ov3 c12 = c11.c();
        this.f6832t = c12;
        yv3Var12 = b01Var.f3111i;
        yv3<Set<hi1<ow2>>> c13 = jv3.c(new cv1(nl2Var, yv3Var12, gv2.b(), c12));
        this.f6833u = c13;
        vv3 b9 = wv3.b(0, 1);
        b9.a(c13);
        wv3 c14 = b9.c();
        this.f6834v = c14;
        qw2 qw2Var = new qw2(c14);
        this.f6835w = qw2Var;
        gv2 b10 = gv2.b();
        yv3Var13 = b01Var.f3123o;
        this.f6836x = jv3.c(new pw2(b10, yv3Var13, qw2Var));
    }

    private final ek2 d() {
        ln0 ln0Var = new ln0();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        String d7 = this.f6813a.d();
        sv3.b(d7);
        return new ek2(ln0Var, dc3Var, d7, this.f6813a.b(), this.f6813a.a(), null);
    }

    private final dl2 e() {
        w00 w00Var = new w00();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        List<String> f7 = this.f6813a.f();
        sv3.b(f7);
        return new dl2(w00Var, dc3Var, f7, null);
    }

    @Override // com.google.android.gms.internal.ads.bk2
    public final lj2<JSONObject> a() {
        yv3 yv3Var;
        yv3 yv3Var2;
        hn0 hn0Var = new hn0();
        jn0 jn0Var = new jn0();
        yv3Var = this.f6814b.f3146z0;
        Object a7 = yv3Var.a();
        ek2 d7 = d();
        dl2 e7 = e();
        ev3 b7 = jv3.b(this.f6817e);
        ev3 b8 = jv3.b(this.f6819g);
        ev3 b9 = jv3.b(this.f6820h);
        ev3 b10 = jv3.b(this.f6821i);
        ev3 b11 = jv3.b(this.f6822j);
        ev3 b12 = jv3.b(this.f6823k);
        ev3 b13 = jv3.b(this.f6824l);
        ev3 b14 = jv3.b(this.f6826n);
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        yv3Var2 = this.f6814b.f3123o;
        return ql2.b(hn0Var, jn0Var, a7, d7, e7, b7, b8, b9, b10, b11, b12, b13, b14, dc3Var, (ScheduledExecutorService) yv3Var2.a());
    }

    @Override // com.google.android.gms.internal.ads.bk2
    public final lj2<JSONObject> b() {
        yv3 yv3Var;
        yv3 yv3Var2;
        ew0 ew0Var;
        yv3 yv3Var3;
        ew0 ew0Var2;
        yv3 yv3Var4;
        yv3 yv3Var5;
        yv3 yv3Var6;
        ew0 ew0Var3;
        ew0 ew0Var4;
        ew0 ew0Var5;
        yv3 yv3Var7;
        yv3 yv3Var8;
        yv3 yv3Var9;
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        hn0 hn0Var = new hn0();
        sv3.b(dc3Var);
        String c7 = this.f6813a.c();
        sv3.b(c7);
        zk2 zk2Var = new zk2(hn0Var, dc3Var, c7, null);
        yv3Var = this.f6814b.f3123o;
        qh2 qh2Var = new qh2(zk2Var, 0L, (ScheduledExecutorService) yv3Var.a());
        dh0 dh0Var = new dh0();
        yv3Var2 = this.f6814b.f3123o;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) yv3Var2.a();
        ew0Var = this.f6814b.f3097b;
        Context a7 = ew0Var.a();
        sv3.b(a7);
        gl2 gl2Var = new gl2(dh0Var, scheduledExecutorService, a7, null);
        yv3Var3 = this.f6814b.f3123o;
        qh2 qh2Var2 = new qh2(gl2Var, ((Long) sw.c().b(m10.F2)).longValue(), (ScheduledExecutorService) yv3Var3.a());
        ln0 ln0Var = new ln0();
        ew0Var2 = this.f6814b.f3097b;
        Context a8 = ew0Var2.a();
        sv3.b(a8);
        yv3Var4 = this.f6814b.f3123o;
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) yv3Var4.a();
        sv3.b(dc3Var);
        yj2 yj2Var = new yj2(ln0Var, a8, scheduledExecutorService2, dc3Var, this.f6813a.a(), null);
        yv3Var5 = this.f6814b.f3123o;
        qh2 qh2Var3 = new qh2(yj2Var, 0L, (ScheduledExecutorService) yv3Var5.a());
        sv3.b(dc3Var);
        yl2 yl2Var = new yl2(dc3Var);
        yv3Var6 = this.f6814b.f3123o;
        qh2 qh2Var4 = new qh2(yl2Var, 0L, (ScheduledExecutorService) yv3Var6.a());
        pl2 pl2Var = new ij2() { // from class: com.google.android.gms.internal.ads.pl2
            @Override // com.google.android.gms.internal.ads.ij2
            public final cc3 a() {
                return rb3.i(new hj2() { // from class: com.google.android.gms.internal.ads.ol2
                    @Override // com.google.android.gms.internal.ads.hj2
                    public final void c(Object obj) {
                        try {
                            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", o3.j.f19861a);
                        } catch (JSONException unused) {
                        }
                    }
                });
            }
        };
        ew0Var3 = this.f6814b.f3097b;
        Context a9 = ew0Var3.a();
        sv3.b(a9);
        String c8 = this.f6813a.c();
        sv3.b(c8);
        sv3.b(dc3Var);
        hk2 hk2Var = new hk2(null, a9, c8, dc3Var);
        pq pqVar = new pq();
        sv3.b(dc3Var);
        ew0Var4 = this.f6814b.f3097b;
        Context a10 = ew0Var4.a();
        sv3.b(a10);
        ln0 ln0Var2 = new ln0();
        int a11 = this.f6813a.a();
        ew0Var5 = this.f6814b.f3097b;
        Context a12 = ew0Var5.a();
        sv3.b(a12);
        yv3Var7 = this.f6814b.f3098b0;
        tn0 tn0Var = (tn0) yv3Var7.a();
        yv3Var8 = this.f6814b.f3123o;
        ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) yv3Var8.a();
        sv3.b(dc3Var);
        String c9 = this.f6813a.c();
        sv3.b(c9);
        yv3Var9 = this.f6814b.f3146z0;
        return new lj2<>(dc3Var, p73.u(qh2Var, qh2Var2, qh2Var3, qh2Var4, pl2Var, hk2Var, new rk2(pqVar, dc3Var, a10, null), e(), d(), new nk2(ln0Var2, a11, a12, tn0Var, scheduledExecutorService3, dc3Var, c9, null), (ij2) yv3Var9.a()));
    }

    @Override // com.google.android.gms.internal.ads.bk2
    public final nw2 c() {
        return this.f6836x.a();
    }
}
