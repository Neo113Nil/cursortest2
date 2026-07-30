package l;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import g0.m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5396g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5397h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5398i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5399j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f5400k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        super(1);
        this.f5396g = i7;
        this.f5397h = obj;
        this.f5398i = obj2;
        this.f5399j = obj3;
        this.f5400k = obj4;
    }

    /* JADX WARN: Type inference failed for: r14v21, types: [q6.a, r6.l] */
    /* JADX WARN: Type inference failed for: r14v3, types: [q6.a, r6.l] */
    @Override // q6.c
    public final Object f(Object obj) {
        boolean z8;
        switch (this.f5396g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j jVar = (j) obj;
                q6.c cVar = (q6.c) this.f5399j;
                d dVar = (d) this.f5397h;
                e.m(jVar, dVar.f5427c);
                g0.g1 g1Var = jVar.f5545e;
                Object a3 = d.a(dVar, g1Var.getValue());
                if (!r6.k.a(a3, g1Var.getValue())) {
                    dVar.f5427c.f5563g.setValue(a3);
                    ((l) this.f5398i).f5563g.setValue(a3);
                    if (cVar != null) {
                        cVar.f(dVar);
                    }
                    jVar.f5549i.setValue(Boolean.FALSE);
                    jVar.f5544d.a();
                    ((r6.r) this.f5400k).f7964f = true;
                } else if (cVar != null) {
                    cVar.f(dVar);
                }
                return d6.z.f2639a;
            case 1:
                long longValue = ((Number) obj).longValue();
                c7.x xVar = (c7.x) this.f5400k;
                r6.s sVar = (r6.s) this.f5399j;
                h0 h0Var = (h0) this.f5398i;
                m2 m2Var = (m2) ((g0.z0) this.f5397h).getValue();
                long longValue2 = m2Var != null ? ((Number) m2Var.getValue()).longValue() : longValue;
                long j8 = h0Var.f5502c;
                i0.d dVar2 = h0Var.f5500a;
                int i7 = 0;
                if (j8 == Long.MIN_VALUE || sVar.f7965f != e.i(xVar.k())) {
                    h0Var.f5502c = longValue;
                    int i8 = dVar2.f4842h;
                    if (i8 > 0) {
                        Object[] objArr = dVar2.f4840f;
                        int i9 = 0;
                        do {
                            ((f0) objArr[i9]).f5479l = true;
                            i9++;
                        } while (i9 < i8);
                    }
                    sVar.f7965f = e.i(xVar.k());
                }
                float f9 = sVar.f7965f;
                if (f9 == 0.0f) {
                    int i10 = dVar2.f4842h;
                    if (i10 > 0) {
                        Object[] objArr2 = dVar2.f4840f;
                        do {
                            f0 f0Var = (f0) objArr2[i7];
                            f0Var.f5476i.setValue(f0Var.f5477j.f5534c);
                            f0Var.f5479l = true;
                            i7++;
                        } while (i7 < i10);
                    }
                } else {
                    long j9 = (long) ((longValue2 - h0Var.f5502c) / f9);
                    int i11 = dVar2.f4842h;
                    if (i11 > 0) {
                        Object[] objArr3 = dVar2.f4840f;
                        int i12 = 0;
                        z8 = true;
                        do {
                            f0 f0Var2 = (f0) objArr3[i12];
                            if (!f0Var2.f5478k) {
                                f0Var2.f5481n.f5501b.setValue(Boolean.FALSE);
                                if (f0Var2.f5479l) {
                                    f0Var2.f5479l = false;
                                    f0Var2.f5480m = j9;
                                }
                                long j10 = j9 - f0Var2.f5480m;
                                f0Var2.f5476i.setValue(f0Var2.f5477j.b(j10));
                                f0Var2.f5478k = f0Var2.f5477j.g(j10);
                            }
                            if (!f0Var2.f5478k) {
                                z8 = false;
                            }
                            i12++;
                        } while (i12 < i11);
                    } else {
                        z8 = true;
                    }
                    h0Var.f5503d.setValue(Boolean.valueOf(!z8));
                }
                return d6.z.f2639a;
            case 2:
                j jVar2 = (j) obj;
                float floatValue = ((Number) jVar2.f5545e.getValue()).floatValue();
                r6.s sVar2 = (r6.s) this.f5397h;
                float f10 = floatValue - sVar2.f7965f;
                float a9 = ((o.b1) this.f5398i).a(f10);
                sVar2.f7965f = ((Number) jVar2.f5545e.getValue()).floatValue();
                ((r6.s) this.f5399j).f7965f = ((Number) jVar2.f5541a.f5703b.f(jVar2.f5546f)).floatValue();
                if (Math.abs(f10 - a9) > 0.5f) {
                    jVar2.f5549i.setValue(Boolean.FALSE);
                    jVar2.f5544d.a();
                }
                ((o.k) this.f5400k).getClass();
                return d6.z.f2639a;
            case 3:
                s.y yVar = (s.y) this.f5397h;
                yVar.f8072c = new b1.b((s.p) this.f5398i, (p1.v0) this.f5399j, (s.j0) this.f5400k, 21);
                return new c.g(4, yVar);
            case 4:
                t3.h hVar = (t3.h) obj;
                r6.k.f(hVar, "it");
                ((r6.r) this.f5400k).f7964f = true;
                ((t3.b0) this.f5397h).a((t3.v) this.f5398i, (Bundle) this.f5399j, hVar, e6.u.f2826f);
                return d6.z.f2639a;
            default:
                w.j0 j0Var = (w.j0) this.f5397h;
                if (j0Var.b()) {
                    g2.x xVar2 = (g2.x) this.f5398i;
                    g2.w wVar = (g2.w) this.f5399j;
                    androidx.room.c cVar2 = j0Var.f9258d;
                    g2.m mVar = (g2.m) this.f5400k;
                    w.p pVar = j0Var.f9274t;
                    w.p pVar2 = j0Var.f9275u;
                    r6.v vVar = new r6.v();
                    c.h hVar2 = new c.h(cVar2, pVar, vVar, 13);
                    g2.r rVar = xVar2.f4068a;
                    rVar.d(wVar, mVar, hVar2, pVar2);
                    g2.c0 c0Var = new g2.c0(xVar2, rVar);
                    xVar2.f4069b.set(c0Var);
                    vVar.f7968f = c0Var;
                    j0Var.f9259e = c0Var;
                }
                return new w.k();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r6.r rVar, t3.b0 b0Var, t3.v vVar, Bundle bundle) {
        super(1);
        this.f5396g = 4;
        this.f5400k = rVar;
        this.f5397h = b0Var;
        this.f5398i = vVar;
        this.f5399j = bundle;
    }
}
