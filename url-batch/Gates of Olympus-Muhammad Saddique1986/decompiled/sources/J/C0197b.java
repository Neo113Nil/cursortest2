package J;

import I.C0143d;
import I.C0167p;
import I.N;
import java.util.ArrayList;

/* renamed from: J.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197b {

    /* renamed from: a, reason: collision with root package name */
    public final C0167p f3113a;

    /* renamed from: b, reason: collision with root package name */
    public C0196a f3114b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3115c;

    /* renamed from: f, reason: collision with root package name */
    public int f3118f;

    /* renamed from: g, reason: collision with root package name */
    public int f3119g;

    /* renamed from: l, reason: collision with root package name */
    public int f3124l;

    /* renamed from: d, reason: collision with root package name */
    public final N f3116d = new N();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3117e = true;

    /* renamed from: h, reason: collision with root package name */
    public final G2.k f3120h = new G2.k(1);

    /* renamed from: i, reason: collision with root package name */
    public int f3121i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f3122j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f3123k = -1;

    public C0197b(C0167p c0167p, C0196a c0196a) {
        this.f3113a = c0167p;
        this.f3114b = c0196a;
    }

    public final void a() {
        c();
        G2.k kVar = this.f3120h;
        if (kVar.f2203d.isEmpty()) {
            this.f3119g++;
        } else {
            kVar.f2203d.remove(r0.size() - 1);
        }
    }

    public final void b() {
        C0197b c0197b = this;
        int i3 = c0197b.f3119g;
        int i4 = 0;
        if (i3 > 0) {
            C0196a c0196a = c0197b.f3114b;
            c0196a.getClass();
            A a3 = A.f3100c;
            D d3 = c0196a.f3112b;
            d3.o0(a3);
            l0.c.N(d3, 0, i3);
            int i5 = d3.f3110h;
            int i6 = a3.f3102a;
            int h02 = D.h0(d3, i6);
            int i7 = a3.f3103b;
            if (i5 != h02 || d3.f3111i != D.h0(d3, i7)) {
                StringBuilder sb = new StringBuilder();
                int i8 = 0;
                while (i8 < i6) {
                    int i9 = i6;
                    if (((1 << i8) & d3.f3110h) != 0) {
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
                StringBuilder l3 = A.k.l(sb2, "StringBuilder().apply(builderAction).toString()");
                int i10 = 0;
                int i11 = 0;
                while (i11 < i7) {
                    int i12 = i7;
                    if (((1 << i11) & d3.f3111i) != 0) {
                        if (i4 > 0) {
                            l3.append(", ");
                        }
                        l3.append(a3.c(i11));
                        i10++;
                    }
                    i11++;
                    i7 = i12;
                }
                String sb3 = l3.toString();
                f2.j.e(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(a3);
                sb4.append(". Not all arguments were provided. Missing ");
                A.k.t(sb4, i4, " int arguments (", sb2, ") and ");
                A.k.u(sb4, i10, " object arguments (", sb3, ").");
                throw null;
            }
            c0197b.f3119g = 0;
        } else {
            c0197b = this;
        }
        G2.k kVar = c0197b.f3120h;
        if (kVar.f2203d.isEmpty()) {
            return;
        }
        C0196a c0196a2 = c0197b.f3114b;
        ArrayList arrayList = kVar.f2203d;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i13 = 0; i13 < size; i13++) {
            objArr[i13] = arrayList.get(i13);
        }
        c0196a2.getClass();
        if (size != 0) {
            g gVar = g.f3130c;
            D d4 = c0196a2.f3112b;
            d4.o0(gVar);
            l0.c.O(d4, 0, objArr);
            int i14 = d4.f3110h;
            int i15 = gVar.f3102a;
            int h03 = D.h0(d4, i15);
            int i16 = gVar.f3103b;
            if (i14 != h03 || d4.f3111i != D.h0(d4, i16)) {
                StringBuilder sb5 = new StringBuilder();
                int i17 = 0;
                for (int i18 = 0; i18 < i15; i18++) {
                    if (((1 << i18) & d4.f3110h) != 0) {
                        if (i17 > 0) {
                            sb5.append(", ");
                        }
                        sb5.append(gVar.b(i18));
                        i17++;
                    }
                }
                String sb6 = sb5.toString();
                StringBuilder l4 = A.k.l(sb6, "StringBuilder().apply(builderAction).toString()");
                int i19 = 0;
                int i20 = 0;
                while (i19 < i16) {
                    int i21 = i16;
                    if (((1 << i19) & d4.f3111i) != 0) {
                        if (i17 > 0) {
                            l4.append(", ");
                        }
                        l4.append(gVar.c(i19));
                        i20++;
                    }
                    i19++;
                    i16 = i21;
                }
                String sb7 = l4.toString();
                f2.j.e(sb7, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb8 = new StringBuilder("Error while pushing ");
                sb8.append(gVar);
                sb8.append(". Not all arguments were provided. Missing ");
                A.k.t(sb8, i17, " int arguments (", sb6, ") and ");
                A.k.u(sb8, i20, " object arguments (", sb7, ").");
                throw null;
            }
        }
        arrayList.clear();
    }

    public final void c() {
        int i3 = this.f3124l;
        if (i3 > 0) {
            int i4 = this.f3121i;
            if (i4 >= 0) {
                b();
                C0196a c0196a = this.f3114b;
                c0196a.getClass();
                t tVar = t.f3147c;
                D d3 = c0196a.f3112b;
                d3.o0(tVar);
                l0.c.N(d3, 0, i4);
                l0.c.N(d3, 1, i3);
                int i5 = d3.f3110h;
                int i6 = tVar.f3102a;
                int h02 = D.h0(d3, i6);
                int i7 = tVar.f3103b;
                if (i5 != h02 || d3.f3111i != D.h0(d3, i7)) {
                    StringBuilder sb = new StringBuilder();
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < i6) {
                        int i10 = i6;
                        if (((1 << i8) & d3.f3110h) != 0) {
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
                    StringBuilder l3 = A.k.l(sb2, "StringBuilder().apply(builderAction).toString()");
                    int i11 = 0;
                    int i12 = 0;
                    while (i12 < i7) {
                        int i13 = i7;
                        if (((1 << i12) & d3.f3111i) != 0) {
                            if (i9 > 0) {
                                l3.append(", ");
                            }
                            l3.append(tVar.c(i12));
                            i11++;
                        }
                        i12++;
                        i7 = i13;
                    }
                    String sb3 = l3.toString();
                    f2.j.e(sb3, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(tVar);
                    sb4.append(". Not all arguments were provided. Missing ");
                    A.k.t(sb4, i9, " int arguments (", sb2, ") and ");
                    A.k.u(sb4, i11, " object arguments (", sb3, ").");
                    throw null;
                }
                this.f3121i = -1;
            } else {
                int i14 = this.f3123k;
                int i15 = this.f3122j;
                b();
                C0196a c0196a2 = this.f3114b;
                c0196a2.getClass();
                q qVar = q.f3144c;
                D d4 = c0196a2.f3112b;
                d4.o0(qVar);
                l0.c.N(d4, 1, i14);
                l0.c.N(d4, 0, i15);
                l0.c.N(d4, 2, i3);
                int i16 = d4.f3110h;
                int i17 = qVar.f3102a;
                int h03 = D.h0(d4, i17);
                int i18 = qVar.f3103b;
                if (i16 != h03 || d4.f3111i != D.h0(d4, i18)) {
                    int i19 = 0;
                    StringBuilder sb5 = new StringBuilder();
                    for (int i20 = 0; i20 < i17; i20++) {
                        if (((1 << i20) & d4.f3110h) != 0) {
                            if (i19 > 0) {
                                sb5.append(", ");
                            }
                            sb5.append(qVar.b(i20));
                            i19++;
                        }
                    }
                    String sb6 = sb5.toString();
                    StringBuilder l4 = A.k.l(sb6, "StringBuilder().apply(builderAction).toString()");
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < i18) {
                        int i23 = i18;
                        if (((1 << i21) & d4.f3111i) != 0) {
                            if (i19 > 0) {
                                l4.append(", ");
                            }
                            l4.append(qVar.c(i21));
                            i22++;
                        }
                        i21++;
                        i18 = i23;
                    }
                    String sb7 = l4.toString();
                    f2.j.e(sb7, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb8 = new StringBuilder("Error while pushing ");
                    sb8.append(qVar);
                    sb8.append(". Not all arguments were provided. Missing ");
                    A.k.t(sb8, i19, " int arguments (", sb6, ") and ");
                    A.k.u(sb8, i22, " object arguments (", sb7, ").");
                    throw null;
                }
                this.f3122j = -1;
                this.f3123k = -1;
            }
            this.f3124l = 0;
        }
    }

    public final void d(boolean z3) {
        C0167p c0167p = this.f3113a;
        int i3 = z3 ? c0167p.f2854F.f2663i : c0167p.f2854F.f2661g;
        int i4 = i3 - this.f3118f;
        if (!(i4 >= 0)) {
            C0143d.w("Tried to seek backward");
            throw null;
        }
        if (i4 > 0) {
            C0196a c0196a = this.f3114b;
            c0196a.getClass();
            C0199d c0199d = C0199d.f3127c;
            D d3 = c0196a.f3112b;
            d3.o0(c0199d);
            l0.c.N(d3, 0, i4);
            int i5 = d3.f3110h;
            int i6 = c0199d.f3102a;
            int h02 = D.h0(d3, i6);
            int i7 = c0199d.f3103b;
            if (i5 == h02 && d3.f3111i == D.h0(d3, i7)) {
                this.f3118f = i3;
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i8 = 0;
            for (int i9 = 0; i9 < i6; i9++) {
                if (((1 << i9) & d3.f3110h) != 0) {
                    if (i8 > 0) {
                        sb.append(", ");
                    }
                    sb.append(c0199d.b(i9));
                    i8++;
                }
            }
            String sb2 = sb.toString();
            StringBuilder l3 = A.k.l(sb2, "StringBuilder().apply(builderAction).toString()");
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                if (((1 << i11) & d3.f3111i) != 0) {
                    if (i8 > 0) {
                        l3.append(", ");
                    }
                    l3.append(c0199d.c(i11));
                    i10++;
                }
            }
            String sb3 = l3.toString();
            f2.j.e(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(c0199d);
            sb4.append(". Not all arguments were provided. Missing ");
            A.k.t(sb4, i8, " int arguments (", sb2, ") and ");
            A.k.u(sb4, i10, " object arguments (", sb3, ").");
            throw null;
        }
    }

    public final void e(int i3, int i4) {
        if (i4 > 0) {
            if (!(i3 >= 0)) {
                C0143d.w("Invalid remove index " + i3);
                throw null;
            }
            if (this.f3121i == i3) {
                this.f3124l += i4;
                return;
            }
            c();
            this.f3121i = i3;
            this.f3124l = i4;
        }
    }
}
