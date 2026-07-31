package J;

import H2.AbstractC0080b;
import I.C0089d;
import I.C0113p;
import I.O;
import java.util.ArrayList;

/* renamed from: J.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0135b {

    /* renamed from: a, reason: collision with root package name */
    public final C0113p f2538a;

    /* renamed from: b, reason: collision with root package name */
    public C0134a f2539b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2540c;

    /* renamed from: f, reason: collision with root package name */
    public int f2543f;

    /* renamed from: g, reason: collision with root package name */
    public int f2544g;

    /* renamed from: l, reason: collision with root package name */
    public int f2549l;

    /* renamed from: d, reason: collision with root package name */
    public final O f2541d = new O();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2542e = true;

    /* renamed from: h, reason: collision with root package name */
    public final A2.n f2545h = new A2.n(1);

    /* renamed from: i, reason: collision with root package name */
    public int f2546i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f2547j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f2548k = -1;

    public C0135b(C0113p c0113p, C0134a c0134a) {
        this.f2538a = c0113p;
        this.f2539b = c0134a;
    }

    public final void a() {
        c();
        A2.n nVar = this.f2545h;
        if (nVar.f118a.isEmpty()) {
            this.f2544g++;
        } else {
            nVar.f118a.remove(r0.size() - 1);
        }
    }

    public final void b() {
        C0135b c0135b = this;
        int i3 = c0135b.f2544g;
        int i4 = 0;
        if (i3 > 0) {
            C0134a c0134a = c0135b.f2539b;
            c0134a.getClass();
            A a3 = A.f2521c;
            E e3 = c0134a.f2537f;
            e3.a0(a3);
            I2.d.K(e3, 0, i3);
            int i5 = e3.f2535l;
            int i6 = a3.f2523a;
            int T2 = E.T(e3, i6);
            int i7 = a3.f2524b;
            if (i5 != T2 || e3.f2536m != E.T(e3, i7)) {
                StringBuilder sb = new StringBuilder();
                int i8 = 0;
                while (i8 < i6) {
                    int i9 = i6;
                    if (((1 << i8) & e3.f2535l) != 0) {
                        if (i4 > 0) {
                            sb.append(", ");
                        }
                        sb.append(a3.b(i8));
                        i4++;
                    }
                    i8++;
                    i6 = i9;
                }
                String sb2 = sb.toString();
                StringBuilder m3 = AbstractC0080b.m(sb2, "StringBuilder().apply(builderAction).toString()");
                int i10 = 0;
                int i11 = 0;
                while (i11 < i7) {
                    int i12 = i7;
                    if (((1 << i11) & e3.f2536m) != 0) {
                        if (i4 > 0) {
                            m3.append(", ");
                        }
                        m3.append(a3.c(i11));
                        i10++;
                    }
                    i11++;
                    i7 = i12;
                }
                String sb3 = m3.toString();
                Z1.i.e(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(a3);
                sb4.append(". Not all arguments were provided. Missing ");
                AbstractC0080b.t(sb4, i4, " int arguments (", sb2, ") and ");
                AbstractC0080b.u(sb4, i10, " object arguments (", sb3, ").");
                throw null;
            }
            c0135b.f2544g = 0;
        } else {
            c0135b = this;
        }
        A2.n nVar = c0135b.f2545h;
        if (nVar.f118a.isEmpty()) {
            return;
        }
        C0134a c0134a2 = c0135b.f2539b;
        ArrayList arrayList = nVar.f118a;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i13 = 0; i13 < size; i13++) {
            objArr[i13] = arrayList.get(i13);
        }
        c0134a2.getClass();
        if (size != 0) {
            g gVar = g.f2555c;
            E e4 = c0134a2.f2537f;
            e4.a0(gVar);
            I2.d.L(e4, 0, objArr);
            int i14 = e4.f2535l;
            int i15 = gVar.f2523a;
            int T3 = E.T(e4, i15);
            int i16 = gVar.f2524b;
            if (i14 != T3 || e4.f2536m != E.T(e4, i16)) {
                StringBuilder sb5 = new StringBuilder();
                int i17 = 0;
                for (int i18 = 0; i18 < i15; i18++) {
                    if (((1 << i18) & e4.f2535l) != 0) {
                        if (i17 > 0) {
                            sb5.append(", ");
                        }
                        sb5.append(gVar.b(i18));
                        i17++;
                    }
                }
                String sb6 = sb5.toString();
                StringBuilder m4 = AbstractC0080b.m(sb6, "StringBuilder().apply(builderAction).toString()");
                int i19 = 0;
                int i20 = 0;
                while (i19 < i16) {
                    int i21 = i16;
                    if (((1 << i19) & e4.f2536m) != 0) {
                        if (i17 > 0) {
                            m4.append(", ");
                        }
                        m4.append(gVar.c(i19));
                        i20++;
                    }
                    i19++;
                    i16 = i21;
                }
                String sb7 = m4.toString();
                Z1.i.e(sb7, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb8 = new StringBuilder("Error while pushing ");
                sb8.append(gVar);
                sb8.append(". Not all arguments were provided. Missing ");
                AbstractC0080b.t(sb8, i17, " int arguments (", sb6, ") and ");
                AbstractC0080b.u(sb8, i20, " object arguments (", sb7, ").");
                throw null;
            }
        }
        arrayList.clear();
    }

    public final void c() {
        int i3 = this.f2549l;
        if (i3 > 0) {
            int i4 = this.f2546i;
            if (i4 >= 0) {
                b();
                C0134a c0134a = this.f2539b;
                c0134a.getClass();
                t tVar = t.f2572c;
                E e3 = c0134a.f2537f;
                e3.a0(tVar);
                I2.d.K(e3, 0, i4);
                I2.d.K(e3, 1, i3);
                int i5 = e3.f2535l;
                int i6 = tVar.f2523a;
                int T2 = E.T(e3, i6);
                int i7 = tVar.f2524b;
                if (i5 != T2 || e3.f2536m != E.T(e3, i7)) {
                    StringBuilder sb = new StringBuilder();
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < i6) {
                        int i10 = i6;
                        if (((1 << i8) & e3.f2535l) != 0) {
                            if (i9 > 0) {
                                sb.append(", ");
                            }
                            sb.append(tVar.b(i8));
                            i9++;
                        }
                        i8++;
                        i6 = i10;
                    }
                    String sb2 = sb.toString();
                    StringBuilder m3 = AbstractC0080b.m(sb2, "StringBuilder().apply(builderAction).toString()");
                    int i11 = 0;
                    int i12 = 0;
                    while (i12 < i7) {
                        int i13 = i7;
                        if (((1 << i12) & e3.f2536m) != 0) {
                            if (i9 > 0) {
                                m3.append(", ");
                            }
                            m3.append(tVar.c(i12));
                            i11++;
                        }
                        i12++;
                        i7 = i13;
                    }
                    String sb3 = m3.toString();
                    Z1.i.e(sb3, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(tVar);
                    sb4.append(". Not all arguments were provided. Missing ");
                    AbstractC0080b.t(sb4, i9, " int arguments (", sb2, ") and ");
                    AbstractC0080b.u(sb4, i11, " object arguments (", sb3, ").");
                    throw null;
                }
                this.f2546i = -1;
            } else {
                int i14 = this.f2548k;
                int i15 = this.f2547j;
                b();
                C0134a c0134a2 = this.f2539b;
                c0134a2.getClass();
                q qVar = q.f2569c;
                E e4 = c0134a2.f2537f;
                e4.a0(qVar);
                I2.d.K(e4, 1, i14);
                I2.d.K(e4, 0, i15);
                I2.d.K(e4, 2, i3);
                int i16 = e4.f2535l;
                int i17 = qVar.f2523a;
                int T3 = E.T(e4, i17);
                int i18 = qVar.f2524b;
                if (i16 != T3 || e4.f2536m != E.T(e4, i18)) {
                    int i19 = 0;
                    StringBuilder sb5 = new StringBuilder();
                    for (int i20 = 0; i20 < i17; i20++) {
                        if (((1 << i20) & e4.f2535l) != 0) {
                            if (i19 > 0) {
                                sb5.append(", ");
                            }
                            sb5.append(qVar.b(i20));
                            i19++;
                        }
                    }
                    String sb6 = sb5.toString();
                    StringBuilder m4 = AbstractC0080b.m(sb6, "StringBuilder().apply(builderAction).toString()");
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < i18) {
                        int i23 = i18;
                        if (((1 << i21) & e4.f2536m) != 0) {
                            if (i19 > 0) {
                                m4.append(", ");
                            }
                            m4.append(qVar.c(i21));
                            i22++;
                        }
                        i21++;
                        i18 = i23;
                    }
                    String sb7 = m4.toString();
                    Z1.i.e(sb7, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb8 = new StringBuilder("Error while pushing ");
                    sb8.append(qVar);
                    sb8.append(". Not all arguments were provided. Missing ");
                    AbstractC0080b.t(sb8, i19, " int arguments (", sb6, ") and ");
                    AbstractC0080b.u(sb8, i22, " object arguments (", sb7, ").");
                    throw null;
                }
                this.f2547j = -1;
                this.f2548k = -1;
            }
            this.f2549l = 0;
        }
    }

    public final void d(boolean z3) {
        C0113p c0113p = this.f2538a;
        int i3 = z3 ? c0113p.f2296F.f2109i : c0113p.f2296F.f2107g;
        int i4 = i3 - this.f2543f;
        if (!(i4 >= 0)) {
            C0089d.w("Tried to seek backward");
            throw null;
        }
        if (i4 > 0) {
            C0134a c0134a = this.f2539b;
            c0134a.getClass();
            C0137d c0137d = C0137d.f2552c;
            E e3 = c0134a.f2537f;
            e3.a0(c0137d);
            I2.d.K(e3, 0, i4);
            int i5 = e3.f2535l;
            int i6 = c0137d.f2523a;
            int T2 = E.T(e3, i6);
            int i7 = c0137d.f2524b;
            if (i5 == T2 && e3.f2536m == E.T(e3, i7)) {
                this.f2543f = i3;
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i8 = 0;
            for (int i9 = 0; i9 < i6; i9++) {
                if (((1 << i9) & e3.f2535l) != 0) {
                    if (i8 > 0) {
                        sb.append(", ");
                    }
                    sb.append(c0137d.b(i9));
                    i8++;
                }
            }
            String sb2 = sb.toString();
            StringBuilder m3 = AbstractC0080b.m(sb2, "StringBuilder().apply(builderAction).toString()");
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                if (((1 << i11) & e3.f2536m) != 0) {
                    if (i8 > 0) {
                        m3.append(", ");
                    }
                    m3.append(c0137d.c(i11));
                    i10++;
                }
            }
            String sb3 = m3.toString();
            Z1.i.e(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(c0137d);
            sb4.append(". Not all arguments were provided. Missing ");
            AbstractC0080b.t(sb4, i8, " int arguments (", sb2, ") and ");
            AbstractC0080b.u(sb4, i10, " object arguments (", sb3, ").");
            throw null;
        }
    }

    public final void e(int i3, int i4) {
        if (i4 > 0) {
            if (!(i3 >= 0)) {
                C0089d.w("Invalid remove index " + i3);
                throw null;
            }
            if (this.f2546i == i3) {
                this.f2549l += i4;
                return;
            }
            c();
            this.f2546i = i3;
            this.f2549l = i4;
        }
    }
}
