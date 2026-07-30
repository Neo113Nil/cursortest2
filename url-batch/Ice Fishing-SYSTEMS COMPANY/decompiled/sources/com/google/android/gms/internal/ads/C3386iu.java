package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import q2.C4907p;

/* renamed from: com.google.android.gms.internal.ads.iu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3386iu {

    /* renamed from: a, reason: collision with root package name */
    public final Ut f32019a;

    /* renamed from: b, reason: collision with root package name */
    public final Wt f32020b;

    /* renamed from: c, reason: collision with root package name */
    public final Av f32021c;

    /* renamed from: d, reason: collision with root package name */
    public final C4250yv f32022d;

    /* renamed from: e, reason: collision with root package name */
    public final Yu f32023e;

    /* renamed from: f, reason: collision with root package name */
    public final C2657Li f32024f;

    public C3386iu(Av av, C4250yv c4250yv, Ut ut, Wt wt, C2657Li c2657Li, Yu yu) {
        this.f32019a = ut;
        this.f32020b = wt;
        this.f32021c = av;
        this.f32022d = c4250yv;
        this.f32024f = c2657Li;
        this.f32023e = yu;
    }

    public final void a(ArrayList arrayList, C2744Qk c2744Qk) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Ut ut = this.f32019a;
            if (ut.f28155i0) {
                String str2 = this.f32020b.f28491b;
                C4250yv c4250yv = this.f32022d;
                c4250yv.getClass();
                p2.j.f39798C.f39810k.getClass();
                C3614n5 c3614n5 = new C3614n5(str2, str, 2, System.currentTimeMillis());
                C2834Vp c2834Vp = c4250yv.f35424a;
                c2834Vp.getClass();
                c2834Vp.a(new C2593Hm(9, c2834Vp, c3614n5));
            } else {
                this.f32021c.b(str, ut.f28184x0, this.f32023e, c2744Qk);
            }
        }
    }

    public final void b(int i, ArrayList arrayList) {
        J3.a c4;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.vb)).booleanValue() && C2657Li.b(str)) {
                c4 = this.f32024f.a(str, C4907p.f40108g.f40113e);
            } else {
                c4 = C3686oN.c(str);
            }
            G1.a aVar = new G1.a(this, i);
            c4.c(new MD(0, c4, aVar), AbstractC3212fg.f30738a);
        }
    }
}
