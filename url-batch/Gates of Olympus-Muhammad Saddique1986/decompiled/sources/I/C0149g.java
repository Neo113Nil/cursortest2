package I;

import B.C0022x;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import h2.AbstractC0508a;
import java.util.ArrayList;
import q2.C0821h;

/* renamed from: I.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149g implements X {

    /* renamed from: d, reason: collision with root package name */
    public final A.h f2808d;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f2810f;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2809e = new Object();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2811g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f2812h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final C0145e f2813i = new C0145e(0);

    public C0149g(A.h hVar) {
        this.f2808d = hVar;
    }

    public final void c(long j3) {
        Object b3;
        synchronized (this.f2809e) {
            try {
                ArrayList arrayList = this.f2811g;
                this.f2811g = this.f2812h;
                this.f2812h = arrayList;
                this.f2813i.set(0);
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C0147f c0147f = (C0147f) arrayList.get(i3);
                    c0147f.getClass();
                    try {
                        b3 = c0147f.f2805a.n(Long.valueOf(j3));
                    } catch (Throwable th) {
                        b3 = R1.a.b(th);
                    }
                    c0147f.f2806b.u(b3);
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // V1.i
    public final V1.i d(V1.i iVar) {
        return AbstractC0508a.L(this, iVar);
    }

    @Override // V1.i
    public final Object e(Object obj, InterfaceC0426e interfaceC0426e) {
        return interfaceC0426e.h(obj, this);
    }

    @Override // V1.i
    public final V1.i l(V1.h hVar) {
        return AbstractC0508a.K(this, hVar);
    }

    @Override // I.X
    public final Object n(InterfaceC0424c interfaceC0424c, V1.d dVar) {
        C0821h c0821h = new C0821h(1, l0.c.B(dVar));
        c0821h.r();
        C0147f c0147f = new C0147f(interfaceC0424c, c0821h);
        synchronized (this.f2809e) {
            Throwable th = this.f2810f;
            if (th != null) {
                c0821h.u(R1.a.b(th));
            } else {
                boolean isEmpty = this.f2811g.isEmpty();
                this.f2811g.add(c0147f);
                if (isEmpty) {
                    this.f2813i.set(1);
                }
                c0821h.v(new C0022x(this, 6, c0147f));
                if (isEmpty) {
                    try {
                        this.f2808d.b();
                    } catch (Throwable th2) {
                        synchronized (this.f2809e) {
                            try {
                                if (this.f2810f == null) {
                                    this.f2810f = th2;
                                    ArrayList arrayList = this.f2811g;
                                    int size = arrayList.size();
                                    for (int i3 = 0; i3 < size; i3++) {
                                        ((C0147f) arrayList.get(i3)).f2806b.u(R1.a.b(th2));
                                    }
                                    this.f2811g.clear();
                                    this.f2813i.set(0);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        return c0821h.q();
    }

    @Override // V1.i
    public final V1.g v(V1.h hVar) {
        return AbstractC0508a.C(this, hVar);
    }
}
