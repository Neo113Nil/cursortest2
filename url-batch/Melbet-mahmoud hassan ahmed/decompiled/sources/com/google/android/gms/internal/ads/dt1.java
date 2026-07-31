package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class dt1 {

    /* renamed from: a, reason: collision with root package name */
    private final ta1 f4323a;

    /* renamed from: b, reason: collision with root package name */
    private final ni1 f4324b;

    /* renamed from: c, reason: collision with root package name */
    private final dc1 f4325c;

    /* renamed from: d, reason: collision with root package name */
    private final rc1 f4326d;

    /* renamed from: e, reason: collision with root package name */
    private final dd1 f4327e;

    /* renamed from: f, reason: collision with root package name */
    private final xf1 f4328f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f4329g;

    /* renamed from: h, reason: collision with root package name */
    private final ji1 f4330h;

    /* renamed from: i, reason: collision with root package name */
    private final b31 f4331i;

    /* renamed from: j, reason: collision with root package name */
    private final y2.b f4332j;

    /* renamed from: k, reason: collision with root package name */
    private final ml0 f4333k;

    /* renamed from: l, reason: collision with root package name */
    private final gb f4334l;

    /* renamed from: m, reason: collision with root package name */
    private final of1 f4335m;

    /* renamed from: n, reason: collision with root package name */
    private final o42 f4336n;

    /* renamed from: o, reason: collision with root package name */
    private final cy2 f4337o;

    /* renamed from: p, reason: collision with root package name */
    private final wv1 f4338p;

    /* renamed from: q, reason: collision with root package name */
    private final xw2 f4339q;

    public dt1(ta1 ta1Var, dc1 dc1Var, rc1 rc1Var, dd1 dd1Var, xf1 xf1Var, Executor executor, ji1 ji1Var, b31 b31Var, y2.b bVar, ml0 ml0Var, gb gbVar, of1 of1Var, o42 o42Var, cy2 cy2Var, wv1 wv1Var, xw2 xw2Var, ni1 ni1Var) {
        this.f4323a = ta1Var;
        this.f4325c = dc1Var;
        this.f4326d = rc1Var;
        this.f4327e = dd1Var;
        this.f4328f = xf1Var;
        this.f4329g = executor;
        this.f4330h = ji1Var;
        this.f4331i = b31Var;
        this.f4332j = bVar;
        this.f4333k = ml0Var;
        this.f4334l = gbVar;
        this.f4335m = of1Var;
        this.f4336n = o42Var;
        this.f4337o = cy2Var;
        this.f4338p = wv1Var;
        this.f4339q = xw2Var;
        this.f4324b = ni1Var;
    }

    public static final cc3<?> j(eu0 eu0Var, String str, String str2) {
        final bp0 bp0Var = new bp0();
        eu0Var.E0().f1(new rv0() { // from class: com.google.android.gms.internal.ads.bt1
            @Override // com.google.android.gms.internal.ads.rv0
            public final void c(boolean z6) {
                bp0 bp0Var2 = bp0.this;
                if (z6) {
                    bp0Var2.e(null);
                } else {
                    bp0Var2.f(new Exception("Ad Web View failed to load."));
                }
            }
        });
        eu0Var.S(str, str2, null);
        return bp0Var;
    }

    final /* synthetic */ void c() {
        this.f4323a.M();
    }

    final /* synthetic */ void d(String str, String str2) {
        this.f4328f.Q(str, str2);
    }

    final /* synthetic */ void e() {
        this.f4325c.a();
    }

    final /* synthetic */ void f(View view) {
        this.f4332j.a();
    }

    final /* synthetic */ void g(eu0 eu0Var, eu0 eu0Var2, Map map) {
        this.f4331i.d(eu0Var);
    }

    final /* synthetic */ boolean h(View view, MotionEvent motionEvent) {
        this.f4332j.a();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(final eu0 eu0Var, boolean z6, w70 w70Var) {
        cb c7;
        eu0Var.E0().V(new yu() { // from class: com.google.android.gms.internal.ads.xs1
            @Override // com.google.android.gms.internal.ads.yu
            public final void M() {
                dt1.this.c();
            }
        }, this.f4326d, this.f4327e, new u60() { // from class: com.google.android.gms.internal.ads.ys1
            @Override // com.google.android.gms.internal.ads.u60
            public final void Q(String str, String str2) {
                dt1.this.d(str, str2);
            }
        }, new z2.y() { // from class: com.google.android.gms.internal.ads.at1
            @Override // z2.y
            public final void e() {
                dt1.this.e();
            }
        }, z6, w70Var, this.f4332j, new ct1(this), this.f4333k, this.f4336n, this.f4337o, this.f4338p, this.f4339q, null, this.f4324b);
        eu0Var.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.vs1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                dt1.this.h(view, motionEvent);
                return false;
            }
        });
        eu0Var.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.ts1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dt1.this.f(view);
            }
        });
        if (((Boolean) sw.c().b(m10.Q1)).booleanValue() && (c7 = this.f4334l.c()) != null) {
            c7.b((View) eu0Var);
        }
        this.f4330h.D0(eu0Var, this.f4329g);
        this.f4330h.D0(new zn() { // from class: com.google.android.gms.internal.ads.ws1
            @Override // com.google.android.gms.internal.ads.zn
            public final void o0(xn xnVar) {
                tv0 E0 = eu0.this.E0();
                Rect rect = xnVar.f14252d;
                E0.w0(rect.left, rect.top, false);
            }
        }, this.f4329g);
        this.f4330h.S0((View) eu0Var);
        eu0Var.G0("/trackActiveViewUnit", new t70() { // from class: com.google.android.gms.internal.ads.zs1
            @Override // com.google.android.gms.internal.ads.t70
            public final void a(Object obj, Map map) {
                dt1.this.g(eu0Var, (eu0) obj, map);
            }
        });
        this.f4331i.e(eu0Var);
    }
}
