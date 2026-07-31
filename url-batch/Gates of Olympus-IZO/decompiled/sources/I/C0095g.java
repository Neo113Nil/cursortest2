package I;

import java.util.ArrayList;
import k2.C0536h;

/* renamed from: I.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095g implements Y {

    /* renamed from: d, reason: collision with root package name */
    public final A2.l f2251d;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f2253f;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2252e = new Object();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2254g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f2255h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final C0091e f2256i = new C0091e(0);

    public C0095g(A2.l lVar) {
        this.f2251d = lVar;
    }

    public final void c(long j3) {
        Object t3;
        synchronized (this.f2252e) {
            try {
                ArrayList arrayList = this.f2254g;
                this.f2254g = this.f2255h;
                this.f2255h = arrayList;
                this.f2256i.set(0);
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C0093f c0093f = (C0093f) arrayList.get(i3);
                    c0093f.getClass();
                    try {
                        t3 = c0093f.f2248a.j(Long.valueOf(j3));
                    } catch (Throwable th) {
                        t3 = I2.l.t(th);
                    }
                    c0093f.f2249b.resumeWith(t3);
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // I.Y
    public final Object j(Y1.c cVar, R1.c cVar2) {
        C0536h c0536h = new C0536h(1, M1.B.G(cVar2));
        c0536h.q();
        C0093f c0093f = new C0093f(cVar, c0536h);
        synchronized (this.f2252e) {
            Throwable th = this.f2253f;
            if (th != null) {
                c0536h.resumeWith(I2.l.t(th));
            } else {
                boolean isEmpty = this.f2254g.isEmpty();
                this.f2254g.add(c0093f);
                if (isEmpty) {
                    this.f2256i.set(1);
                }
                c0536h.s(new F.D0(this, 2, c0093f));
                if (isEmpty) {
                    try {
                        this.f2251d.b();
                    } catch (Throwable th2) {
                        synchronized (this.f2252e) {
                            try {
                                if (this.f2253f == null) {
                                    this.f2253f = th2;
                                    ArrayList arrayList = this.f2254g;
                                    int size = arrayList.size();
                                    for (int i3 = 0; i3 < size; i3++) {
                                        ((C0093f) arrayList.get(i3)).f2249b.resumeWith(I2.l.t(th2));
                                    }
                                    this.f2254g.clear();
                                    this.f2256i.set(0);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        Object p = c0536h.p();
        Q1.a aVar = Q1.a.f3113d;
        return p;
    }

    @Override // P1.i
    public final P1.g k(P1.h hVar) {
        return I2.l.A(this, hVar);
    }

    @Override // P1.i
    public final P1.i o(P1.i iVar) {
        return I2.l.M(this, iVar);
    }

    @Override // P1.i
    public final Object r(Object obj, Y1.e eVar) {
        return eVar.g(obj, this);
    }

    @Override // P1.i
    public final P1.i x(P1.h hVar) {
        return I2.l.H(this, hVar);
    }
}
