package com.google.android.gms.internal.measurement;

import android.content.Context;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class e3 implements a8.d {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e3 f2248e = new e3(0);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ e3 f2249i = new e3(1);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ e3 f2250r = new e3(2);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ e3 f2251s = new e3(3);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2252d;

    public /* synthetic */ e3(int i3) {
        this.f2252d = i3;
    }

    @Override // a8.d
    public final Object apply(Object obj) {
        switch (this.f2252d) {
            case 0:
                Context context = (Context) obj;
                String str = f3.f2277b;
                if (str == null) {
                    synchronized (f3.class) {
                        try {
                            str = f3.f2277b;
                            if (str == null) {
                                String b10 = pa.b(context, "com.google.android.gms.measurement");
                                f3.f2277b = b10;
                                str = b10;
                            }
                        } finally {
                        }
                    }
                }
                return str;
            case 1:
                v5 v5Var = vc.f2884i;
                return "";
            case 2:
                eb ebVar = (eb) obj;
                nd z10 = od.z();
                if (ebVar == null) {
                    return (od) z10.d();
                }
                for (gb gbVar : ebVar.x()) {
                    pd z11 = qd.z();
                    String t6 = gbVar.t();
                    z11.b();
                    ((qd) z11.f2389e).A(t6);
                    int H = gbVar.H();
                    int i3 = H - 1;
                    if (H == 0) {
                        throw null;
                    }
                    if (i3 == 0) {
                        long u2 = gbVar.u();
                        z11.b();
                        ((qd) z11.f2389e).B(u2);
                    } else if (i3 == 1) {
                        boolean v10 = gbVar.v();
                        z11.b();
                        ((qd) z11.f2389e).C(v10);
                    } else if (i3 == 2) {
                        double w6 = gbVar.w();
                        z11.b();
                        ((qd) z11.f2389e).D(w6);
                    } else if (i3 == 3) {
                        String x10 = gbVar.x();
                        z11.b();
                        ((qd) z11.f2389e).E(x10);
                    } else {
                        if (i3 != 4) {
                            kotlin.collections.i0.l("No known flag type");
                            return null;
                        }
                        v0 y3 = gbVar.y();
                        z11.b();
                        ((qd) z11.f2389e).F(y3);
                    }
                    qd qdVar = (qd) z11.d();
                    z10.b();
                    ((od) z10.f2389e).F(qdVar);
                }
                String w10 = ebVar.w();
                z10.b();
                ((od) z10.f2389e).D(w10);
                String t10 = ebVar.t();
                z10.b();
                ((od) z10.f2389e).B(t10);
                long y10 = ebVar.y();
                z10.b();
                ((od) z10.f2389e).E(y10);
                if (ebVar.u()) {
                    v0 v11 = ebVar.v();
                    z10.b();
                    ((od) z10.f2389e).C(v11);
                }
                return (od) z10.d();
            default:
                hb hbVar = (hb) obj;
                if (hbVar.f2375d != 29514) {
                    throw hbVar;
                }
                yb w11 = zb.w();
                ub G = vb.G();
                long currentTimeMillis = System.currentTimeMillis();
                G.b();
                ((vb) G.f2389e).I(currentTimeMillis);
                w11.b();
                ((zb) w11.f2389e).x((vb) G.d());
                return (zb) w11.d();
        }
    }
}
