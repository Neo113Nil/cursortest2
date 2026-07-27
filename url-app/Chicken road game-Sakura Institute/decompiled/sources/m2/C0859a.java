package m2;

import H1.o;
import d2.C0548e;
import f1.C0607a;
import g2.C0638a;
import g2.e;
import j2.AbstractC0720j;
import java.util.Iterator;
import l2.C0823c;
import l2.h;
import o2.C0924c;
import o2.f;
import o2.k;
import o2.l;
import o2.m;
import o2.q;
import o2.s;
import o2.t;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0859a implements InterfaceC0861c {

    /* renamed from: d, reason: collision with root package name */
    public final Y0.b f8302d;

    /* renamed from: e, reason: collision with root package name */
    public final l f8303e;

    /* renamed from: i, reason: collision with root package name */
    public final int f8304i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f8305j;

    public C0859a(h hVar) {
        this.f8302d = new Y0.b(hVar);
        this.f8303e = hVar.f7983e;
        throw new IllegalArgumentException("Cannot get limit if limit has not been set");
    }

    @Override // m2.InterfaceC0861c
    public final l getIndex() {
        return this.f8303e;
    }

    @Override // m2.InterfaceC0861c
    public final C0607a j() {
        return (C0607a) this.f8302d.f4390i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0159  */
    @Override // m2.InterfaceC0861c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m l(m mVar, C0924c c0924c, s sVar, e eVar, InterfaceC0860b interfaceC0860b, C0638a c0638a) {
        q qVar;
        boolean i2;
        s sVar2 = sVar;
        q qVar2 = new q(c0924c, sVar2);
        Y0.b bVar = this.f8302d;
        if (!bVar.u(qVar2)) {
            sVar2 = k.f8939k;
        }
        if (mVar.f8941d.b(c0924c).equals(sVar2)) {
            return mVar;
        }
        s sVar3 = mVar.f8941d;
        int z4 = sVar3.z();
        int i4 = this.f8304i;
        if (z4 < i4) {
            return ((C0607a) bVar.f4390i).l(mVar, c0924c, sVar2, eVar, interfaceC0860b, c0638a);
        }
        AbstractC0720j.c(sVar3.z() == i4);
        q qVar3 = new q(c0924c, sVar2);
        boolean z5 = this.f8305j;
        if (z5) {
            if (sVar3 instanceof f) {
                mVar.e();
                if (o.f(mVar.f8942e, m.f8940j)) {
                    C0924c c0924c2 = (C0924c) ((f) sVar3).f8925d.w();
                    qVar = new q(c0924c2, sVar3.b(c0924c2));
                } else {
                    qVar = (q) mVar.f8942e.f6075d.w();
                }
                boolean u4 = bVar.u(qVar3);
                i2 = sVar3.i(c0924c);
                t tVar = t.f8953a;
                l lVar = this.f8303e;
                if (i2) {
                    if (!sVar2.isEmpty() && u4) {
                        if ((z5 ? lVar.compare(qVar3, qVar) : lVar.compare(qVar, qVar3)) >= 0) {
                            if (c0638a != null) {
                                c0638a.a(new C0823c(1, new m(qVar.f8951b, tVar), qVar.f8950a, null));
                                c0638a.a(new C0823c(2, new m(sVar2, tVar), c0924c, null));
                            }
                            return mVar.h(c0924c, sVar2).h(qVar.f8950a, k.f8939k);
                        }
                    }
                    return mVar;
                }
                s b4 = sVar3.b(c0924c);
                q a4 = interfaceC0860b.a(lVar, qVar, z5);
                while (a4 != null) {
                    C0924c c0924c3 = a4.f8950a;
                    if (!c0924c3.equals(c0924c) && !sVar3.i(c0924c3)) {
                        break;
                    }
                    a4 = interfaceC0860b.a(lVar, a4, z5);
                }
                int compare = a4 == null ? 1 : z5 ? lVar.compare(qVar3, a4) : lVar.compare(a4, qVar3);
                if (u4 && !sVar2.isEmpty() && compare >= 0) {
                    if (c0638a != null) {
                        c0638a.a(new C0823c(4, new m(sVar2, tVar), c0924c, new m(b4, tVar)));
                    }
                    return mVar.h(c0924c, sVar2);
                }
                if (c0638a != null) {
                    c0638a.a(new C0823c(1, new m(b4, tVar), c0924c, null));
                }
                m h4 = mVar.h(c0924c, k.f8939k);
                if (a4 == null || !bVar.u(a4)) {
                    return h4;
                }
                s sVar4 = a4.f8951b;
                C0924c c0924c4 = a4.f8950a;
                if (c0638a != null) {
                    c0638a.a(new C0823c(2, new m(sVar4, tVar), c0924c4, null));
                }
                return h4.h(c0924c4, sVar4);
            }
            qVar = null;
            boolean u42 = bVar.u(qVar3);
            i2 = sVar3.i(c0924c);
            t tVar2 = t.f8953a;
            l lVar2 = this.f8303e;
            if (i2) {
            }
        } else {
            if (sVar3 instanceof f) {
                mVar.e();
                if (o.f(mVar.f8942e, m.f8940j)) {
                    C0924c c0924c5 = (C0924c) ((f) sVar3).f8925d.s();
                    qVar = new q(c0924c5, sVar3.b(c0924c5));
                } else {
                    qVar = (q) mVar.f8942e.f6075d.s();
                }
                boolean u422 = bVar.u(qVar3);
                i2 = sVar3.i(c0924c);
                t tVar22 = t.f8953a;
                l lVar22 = this.f8303e;
                if (i2) {
                }
            }
            qVar = null;
            boolean u4222 = bVar.u(qVar3);
            i2 = sVar3.i(c0924c);
            t tVar222 = t.f8953a;
            l lVar222 = this.f8303e;
            if (i2) {
            }
        }
    }

    @Override // m2.InterfaceC0861c
    public final m m(m mVar, m mVar2, C0638a c0638a) {
        m mVar3;
        Iterator it;
        q qVar;
        q qVar2;
        int i2;
        boolean y4 = mVar2.f8941d.y();
        l lVar = this.f8303e;
        Y0.b bVar = this.f8302d;
        if (!y4) {
            s sVar = mVar2.f8941d;
            if (!sVar.isEmpty()) {
                mVar3 = new m(sVar.f(k.f8939k), mVar2.f8943i, mVar2.f8942e);
                if (this.f8305j) {
                    mVar2.e();
                    it = o.f(mVar2.f8942e, m.f8940j) ? sVar.x() : new C0548e(mVar2.f8942e.f6075d.x(), 0);
                    qVar = (q) bVar.f4389e;
                    qVar2 = (q) bVar.f4392k;
                    i2 = -1;
                } else {
                    it = mVar2.iterator();
                    qVar = (q) bVar.f4392k;
                    qVar2 = (q) bVar.f4389e;
                    i2 = 1;
                }
                boolean z4 = false;
                int i4 = 0;
                while (it.hasNext()) {
                    q qVar3 = (q) it.next();
                    if (!z4 && lVar.compare(qVar, qVar3) * i2 <= 0) {
                        z4 = true;
                    }
                    if (!z4 || i4 >= this.f8304i || lVar.compare(qVar3, qVar2) * i2 > 0) {
                        mVar3 = mVar3.h(qVar3.f8950a, k.f8939k);
                    } else {
                        i4++;
                    }
                }
                ((C0607a) bVar.f4390i).m(mVar, mVar3, c0638a);
                return mVar3;
            }
        }
        mVar3 = new m(k.f8939k, lVar);
        ((C0607a) bVar.f4390i).m(mVar, mVar3, c0638a);
        return mVar3;
    }

    @Override // m2.InterfaceC0861c
    public final m o(m mVar, s sVar) {
        return mVar;
    }

    @Override // m2.InterfaceC0861c
    public final boolean p() {
        return true;
    }
}
