package n0;

import I.V;
import e2.InterfaceC0426e;
import java.util.ArrayList;
import q2.AbstractC0837y;
import q2.C0821h;
import q2.EnumC0836x;
import t0.AbstractC0993f;
import t0.m0;

/* renamed from: n0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0702C extends U.p implements O0.b, m0 {

    /* renamed from: q, reason: collision with root package name */
    public Object f7259q;

    /* renamed from: r, reason: collision with root package name */
    public Object f7260r;

    /* renamed from: s, reason: collision with root package name */
    public Object[] f7261s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0426e f7262t;

    /* renamed from: u, reason: collision with root package name */
    public q2.m0 f7263u;

    /* renamed from: y, reason: collision with root package name */
    public C0711i f7267y;

    /* renamed from: v, reason: collision with root package name */
    public C0711i f7264v = w.f7336a;

    /* renamed from: w, reason: collision with root package name */
    public final K.d f7265w = new K.d(new C0700A[16]);

    /* renamed from: x, reason: collision with root package name */
    public final K.d f7266x = new K.d(new C0700A[16]);

    /* renamed from: z, reason: collision with root package name */
    public long f7268z = 0;

    public C0702C(Object obj, Object obj2, Object[] objArr, InterfaceC0426e interfaceC0426e) {
        this.f7259q = obj;
        this.f7260r = obj2;
        this.f7261s = objArr;
        this.f7262t = interfaceC0426e;
    }

    public final void A0() {
        q2.m0 m0Var = this.f7263u;
        if (m0Var != null) {
            m0Var.F(new V("Pointer input was reset", 4));
            this.f7263u = null;
        }
    }

    @Override // t0.m0
    public final void I() {
        A0();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // t0.m0
    public final void N() {
        C0711i c0711i = this.f7267y;
        if (c0711i == null) {
            return;
        }
        ?? r12 = c0711i.f7292a;
        int size = r12.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((s) r12.get(i3)).f7311d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = r12.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    s sVar = (s) r12.get(i4);
                    long j3 = sVar.f7308a;
                    boolean z3 = sVar.f7311d;
                    long j4 = sVar.f7309b;
                    long j5 = sVar.f7310c;
                    arrayList.add(new s(j3, j4, j5, false, sVar.f7312e, j4, j5, z3, z3, 1, 0L));
                }
                C0711i c0711i2 = new C0711i(arrayList, null);
                this.f7264v = c0711i2;
                z0(c0711i2, EnumC0712j.f7295d);
                z0(c0711i2, EnumC0712j.f7296e);
                z0(c0711i2, EnumC0712j.f7297f);
                this.f7267y = null;
                return;
            }
        }
    }

    @Override // O0.b
    public final float a() {
        return AbstractC0993f.t(this).f8556t.a();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // t0.m0
    public final void g0(C0711i c0711i, EnumC0712j enumC0712j, long j3) {
        this.f7268z = j3;
        if (enumC0712j == EnumC0712j.f7295d) {
            this.f7264v = c0711i;
        }
        if (this.f7263u == null) {
            this.f7263u = AbstractC0837y.r(m0(), null, EnumC0836x.f7937g, new C0701B(this, null), 1);
        }
        z0(c0711i, enumC0712j);
        ?? r5 = c0711i.f7292a;
        int size = r5.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                c0711i = null;
                break;
            } else if (!q.c((s) r5.get(i3))) {
                break;
            } else {
                i3++;
            }
        }
        this.f7267y = c0711i;
    }

    @Override // t0.m0
    public final void n() {
        A0();
    }

    @Override // O0.b
    public final float r() {
        return AbstractC0993f.t(this).f8556t.r();
    }

    @Override // U.p
    public final void r0() {
        A0();
    }

    public final Object y0(InterfaceC0426e interfaceC0426e, V1.d dVar) {
        C0821h c0821h = new C0821h(1, l0.c.B(dVar));
        c0821h.r();
        C0700A c0700a = new C0700A(this, c0821h);
        synchronized (this.f7265w) {
            this.f7265w.b(c0700a);
            new V1.k(l0.c.B(l0.c.q(c0700a, c0700a, interfaceC0426e)), W1.a.f4608d).u(R1.y.f4171a);
        }
        c0821h.v(new A0.l(25, c0700a));
        return c0821h.q();
    }

    public final void z0(C0711i c0711i, EnumC0712j enumC0712j) {
        C0821h c0821h;
        C0821h c0821h2;
        synchronized (this.f7265w) {
            K.d dVar = this.f7266x;
            dVar.c(dVar.f3216f, this.f7265w);
        }
        try {
            int ordinal = enumC0712j.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    K.d dVar2 = this.f7266x;
                    int i3 = dVar2.f3216f;
                    if (i3 > 0) {
                        int i4 = i3 - 1;
                        Object[] objArr = dVar2.f3214d;
                        do {
                            C0700A c0700a = (C0700A) objArr[i4];
                            if (enumC0712j == c0700a.f7255g && (c0821h2 = c0700a.f7254f) != null) {
                                c0700a.f7254f = null;
                                c0821h2.u(c0711i);
                            }
                            i4--;
                        } while (i4 >= 0);
                    }
                } else if (ordinal != 2) {
                }
            }
            K.d dVar3 = this.f7266x;
            int i5 = dVar3.f3216f;
            if (i5 > 0) {
                Object[] objArr2 = dVar3.f3214d;
                int i6 = 0;
                do {
                    C0700A c0700a2 = (C0700A) objArr2[i6];
                    if (enumC0712j == c0700a2.f7255g && (c0821h = c0700a2.f7254f) != null) {
                        c0700a2.f7254f = null;
                        c0821h.u(c0711i);
                    }
                    i6++;
                } while (i6 < i5);
            }
        } finally {
            this.f7266x.h();
        }
    }
}
