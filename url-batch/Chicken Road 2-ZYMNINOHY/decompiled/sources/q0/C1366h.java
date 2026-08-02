package q0;

import a.AbstractC0124a;
import java.util.ArrayList;

/* renamed from: q0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1366h extends l0 {

    /* renamed from: l, reason: collision with root package name */
    public final long f15017l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f15018m;
    public final ArrayList n;
    public final T.S o;

    /* renamed from: p, reason: collision with root package name */
    public C1364f f15019p;

    /* renamed from: q, reason: collision with root package name */
    public C1365g f15020q;

    /* renamed from: r, reason: collision with root package name */
    public long f15021r;

    /* renamed from: s, reason: collision with root package name */
    public long f15022s;

    public C1366h(C1363e c1363e) {
        super(c1363e.f14992a);
        this.f15017l = c1363e.f14993b;
        this.f15018m = c1363e.f14994c;
        this.n = new ArrayList();
        this.o = new T.S();
    }

    @Override // q0.l0
    public final void D(T.T t4) {
        if (this.f15020q != null) {
            return;
        }
        G(t4);
    }

    public final void G(T.T t4) {
        long j4;
        T.S s4 = this.o;
        t4.n(0, s4);
        long j5 = s4.f2703p;
        C1364f c1364f = this.f15019p;
        long j6 = this.f15017l;
        ArrayList arrayList = this.n;
        if (c1364f == null || arrayList.isEmpty()) {
            this.f15021r = j5;
            this.f15022s = j6 != Long.MIN_VALUE ? j5 + j6 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                C1362d c1362d = (C1362d) arrayList.get(i4);
                long j7 = this.f15021r;
                long j8 = this.f15022s;
                c1362d.f14989f = j7;
                c1362d.f14990g = j8;
            }
            j4 = 0;
        } else {
            j4 = this.f15021r - j5;
            j6 = j6 == Long.MIN_VALUE ? Long.MIN_VALUE : this.f15022s - j5;
        }
        try {
            C1364f c1364f2 = new C1364f(t4, j4, j6);
            this.f15019p = c1364f2;
            q(c1364f2);
        } catch (C1365g e4) {
            this.f15020q = e4;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((C1362d) arrayList.get(i5)).f14991h = this.f15020q;
            }
        }
    }

    @Override // q0.AbstractC1359a
    public final InterfaceC1383z b(C1353B c1353b, B1.j jVar, long j4) {
        C1362d c1362d = new C1362d(this.f15044k.b(c1353b, jVar, j4), this.f15018m, this.f15021r, this.f15022s);
        this.n.add(c1362d);
        return c1362d;
    }

    @Override // q0.AbstractC1370l, q0.AbstractC1359a
    public final void k() {
        C1365g c1365g = this.f15020q;
        if (c1365g != null) {
            throw c1365g;
        }
        super.k();
    }

    @Override // q0.AbstractC1359a
    public final void r(InterfaceC1383z interfaceC1383z) {
        ArrayList arrayList = this.n;
        AbstractC0124a.t(arrayList.remove(interfaceC1383z));
        this.f15044k.r(((C1362d) interfaceC1383z).f14984a);
        if (arrayList.isEmpty()) {
            C1364f c1364f = this.f15019p;
            c1364f.getClass();
            G(c1364f.f15061b);
        }
    }

    @Override // q0.AbstractC1370l, q0.AbstractC1359a
    public final void t() {
        super.t();
        this.f15020q = null;
        this.f15019p = null;
    }
}
