package r5;

import g3.k;
import i5.e;
import java.util.Iterator;
import l1.x;
import l5.f;
import m4.o;
import o5.j;
import q5.h;
import t5.l;
import t5.m;
import t5.q;
import t5.s;
import t5.t;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: f, reason: collision with root package name */
    public final k f7943f;

    /* renamed from: g, reason: collision with root package name */
    public final l f7944g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7945h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7946i;

    public a(h hVar) {
        this.f7943f = new k(hVar);
        this.f7944g = hVar.f7534e;
        throw new IllegalArgumentException("Cannot get limit if limit has not been set");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0154  */
    @Override // r5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m d(m mVar, t5.c cVar, s sVar, f fVar, b bVar, l5.a aVar) {
        q qVar;
        boolean s5;
        s sVar2 = sVar;
        q qVar2 = new q(cVar, sVar2);
        k kVar = this.f7943f;
        if (!kVar.u(qVar2)) {
            sVar2 = t5.k.f8908j;
        }
        s sVar3 = mVar.f8910f;
        if (!sVar3.d(cVar).equals(sVar2)) {
            int j8 = sVar3.j();
            int i7 = this.f7945h;
            if (j8 < i7) {
                return ((x) kVar.f4160g).d(mVar, cVar, sVar2, fVar, bVar, aVar);
            }
            s sVar4 = sVar2;
            j.c(sVar3.j() == i7);
            q qVar3 = new q(cVar, sVar4);
            boolean z8 = this.f7946i;
            if (z8) {
                if (sVar3 instanceof t5.f) {
                    mVar.a();
                    if (o.f(mVar.f8911g, m.f8909i)) {
                        t5.c cVar2 = (t5.c) ((t5.f) sVar3).f8894f.x();
                        qVar = new q(cVar2, sVar3.d(cVar2));
                    } else {
                        qVar = (q) mVar.f8911g.f4941f.x();
                    }
                    boolean u8 = kVar.u(qVar3);
                    s5 = sVar3.s(cVar);
                    t tVar = t.f8922a;
                    l lVar = this.f7944g;
                    if (!s5) {
                        s d8 = sVar3.d(cVar);
                        q c4 = bVar.c(lVar, qVar, z8);
                        while (c4 != null) {
                            t5.c cVar3 = c4.f8919a;
                            if (!cVar3.equals(cVar) && !sVar3.s(cVar3)) {
                                break;
                            }
                            c4 = bVar.c(lVar, c4, z8);
                        }
                        int compare = c4 == null ? 1 : z8 ? lVar.compare(qVar3, c4) : lVar.compare(c4, qVar3);
                        if (u8 && !sVar4.isEmpty() && compare >= 0) {
                            if (aVar != null) {
                                aVar.b(new q5.c(4, new m(sVar4, tVar), cVar, new m(d8, tVar)));
                            }
                            return mVar.g(cVar, sVar4);
                        }
                        if (aVar != null) {
                            aVar.b(new q5.c(1, new m(d8, tVar), cVar, null));
                        }
                        m g9 = mVar.g(cVar, t5.k.f8908j);
                        if (c4 == null) {
                            return g9;
                        }
                        s sVar5 = c4.f8920b;
                        t5.c cVar4 = c4.f8919a;
                        if (!kVar.u(c4)) {
                            return g9;
                        }
                        if (aVar != null) {
                            aVar.b(new q5.c(2, new m(sVar5, tVar), cVar4, null));
                        }
                        return g9.g(cVar4, sVar5);
                    }
                    if (!sVar4.isEmpty() && u8) {
                        if ((z8 ? lVar.compare(qVar3, qVar) : lVar.compare(qVar, qVar3)) >= 0) {
                            if (aVar != null) {
                                aVar.b(new q5.c(1, new m(qVar.f8920b, tVar), qVar.f8919a, null));
                                aVar.b(new q5.c(2, new m(sVar4, tVar), cVar, null));
                            }
                            return mVar.g(cVar, sVar4).g(qVar.f8919a, t5.k.f8908j);
                        }
                    }
                }
                qVar = null;
                boolean u82 = kVar.u(qVar3);
                s5 = sVar3.s(cVar);
                t tVar2 = t.f8922a;
                l lVar2 = this.f7944g;
                if (!s5) {
                }
            } else {
                if (sVar3 instanceof t5.f) {
                    mVar.a();
                    if (o.f(mVar.f8911g, m.f8909i)) {
                        t5.c cVar5 = (t5.c) ((t5.f) sVar3).f8894f.w();
                        qVar = new q(cVar5, sVar3.d(cVar5));
                    } else {
                        qVar = (q) mVar.f8911g.f4941f.w();
                    }
                    boolean u822 = kVar.u(qVar3);
                    s5 = sVar3.s(cVar);
                    t tVar22 = t.f8922a;
                    l lVar22 = this.f7944g;
                    if (!s5) {
                    }
                }
                qVar = null;
                boolean u8222 = kVar.u(qVar3);
                s5 = sVar3.s(cVar);
                t tVar222 = t.f8922a;
                l lVar222 = this.f7944g;
                if (!s5) {
                }
            }
        }
        return mVar;
    }

    @Override // r5.c
    public final x g() {
        return (x) this.f7943f.f4160g;
    }

    @Override // r5.c
    public final l getIndex() {
        return this.f7944g;
    }

    @Override // r5.c
    public final boolean h() {
        return true;
    }

    @Override // r5.c
    public final m i(m mVar, m mVar2, l5.a aVar) {
        m mVar3;
        Iterator it;
        q qVar;
        q qVar2;
        int i7;
        s sVar = mVar2.f8910f;
        boolean i8 = sVar.i();
        l lVar = this.f7944g;
        k kVar = this.f7943f;
        if (i8 || sVar.isEmpty()) {
            mVar3 = new m(t5.k.f8908j, lVar);
        } else {
            mVar3 = new m(mVar2.f8910f.n(t5.k.f8908j), mVar2.f8912h, mVar2.f8911g);
            if (this.f7946i) {
                mVar2.a();
                it = o.f(mVar2.f8911g, m.f8909i) ? sVar.t() : new e(mVar2.f8911g.f4941f.t(), 0);
                qVar = (q) kVar.f4163j;
                qVar2 = (q) kVar.f4162i;
                i7 = -1;
            } else {
                it = mVar2.iterator();
                qVar = (q) kVar.f4162i;
                qVar2 = (q) kVar.f4163j;
                i7 = 1;
            }
            boolean z8 = false;
            int i9 = 0;
            while (it.hasNext()) {
                q qVar3 = (q) it.next();
                if (!z8 && lVar.compare(qVar, qVar3) * i7 <= 0) {
                    z8 = true;
                }
                if (!z8 || i9 >= this.f7945h || lVar.compare(qVar3, qVar2) * i7 > 0) {
                    mVar3 = mVar3.g(qVar3.f8919a, t5.k.f8908j);
                } else {
                    i9++;
                }
            }
        }
        ((x) kVar.f4160g).i(mVar, mVar3, aVar);
        return mVar3;
    }

    @Override // r5.c
    public final m l(m mVar, s sVar) {
        return mVar;
    }
}
