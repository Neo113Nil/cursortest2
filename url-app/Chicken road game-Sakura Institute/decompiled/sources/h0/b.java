package h0;

import g0.m0;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final g0.p f4589a;

    /* renamed from: b, reason: collision with root package name */
    public a f4590b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4591c;

    /* renamed from: f, reason: collision with root package name */
    public int f4594f;

    /* renamed from: g, reason: collision with root package name */
    public int f4595g;

    /* renamed from: l, reason: collision with root package name */
    public int f4600l;

    /* renamed from: d, reason: collision with root package name */
    public final m0 f4592d = new m0();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4593e = true;

    /* renamed from: h, reason: collision with root package name */
    public final f1.g f4596h = new f1.g(2);

    /* renamed from: i, reason: collision with root package name */
    public int f4597i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f4598j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f4599k = -1;

    public b(g0.p pVar, a aVar) {
        this.f4589a = pVar;
        this.f4590b = aVar;
    }

    public final void a() {
        c();
        f1.g gVar = this.f4596h;
        if (gVar.f3153f.isEmpty()) {
            this.f4595g++;
        } else {
            gVar.f3153f.remove(r0.size() - 1);
        }
    }

    public final void b() {
        Throwable th;
        int i7;
        b bVar = this;
        int i8 = bVar.f4595g;
        int i9 = 0;
        if (i8 > 0) {
            d0 d0Var = bVar.f4590b.f4587g;
            a0 a0Var = a0.f4588c;
            int i10 = a0Var.f4605b;
            d0Var.a0(a0Var);
            j1.c.k0(d0Var, 0, i8);
            int i11 = d0Var.f4613m;
            th = null;
            int i12 = a0Var.f4604a;
            i7 = 1;
            if (i11 != d0.T(d0Var, i12) || d0Var.f4614n != d0.T(d0Var, i10)) {
                StringBuilder sb = new StringBuilder();
                int i13 = 0;
                while (i13 < i12) {
                    int i14 = i12;
                    if (((1 << i13) & d0Var.f4613m) != 0) {
                        if (i9 > 0) {
                            sb.append(", ");
                        }
                        sb.append(a0Var.b(i13));
                        i9++;
                    }
                    i13++;
                    i12 = i14;
                }
                String sb2 = sb.toString();
                StringBuilder o2 = a0.m.o(sb2, "StringBuilder().apply(builderAction).toString()");
                int i15 = 0;
                int i16 = 0;
                while (i16 < i10) {
                    int i17 = i10;
                    if (((1 << i16) & d0Var.f4614n) != 0) {
                        if (i9 > 0) {
                            o2.append(", ");
                        }
                        o2.append(a0Var.c(i16));
                        i15++;
                    }
                    i16++;
                    i10 = i17;
                }
                String sb3 = o2.toString();
                r6.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(a0Var);
                sb4.append(". Not all arguments were provided. Missing ");
                a0.m.t(sb4, i9, " int arguments (", sb2, ") and ");
                a0.m.u(sb4, i15, " object arguments (", sb3, ").");
                throw null;
            }
            bVar.f4595g = 0;
        } else {
            th = null;
            i7 = 1;
            bVar = this;
        }
        f1.g gVar = bVar.f4596h;
        ArrayList arrayList = gVar.f3153f;
        ArrayList arrayList2 = gVar.f3153f;
        if (arrayList.isEmpty()) {
            return;
        }
        a aVar = bVar.f4590b;
        int size = arrayList2.size();
        Object[] objArr = new Object[size];
        for (int i18 = 0; i18 < size; i18++) {
            objArr[i18] = arrayList2.get(i18);
        }
        aVar.getClass();
        if (size != 0) {
            d0 d0Var2 = aVar.f4587g;
            g gVar2 = g.f4617c;
            int i19 = gVar2.f4605b;
            int i20 = gVar2.f4604a;
            d0Var2.a0(gVar2);
            j1.c.l0(d0Var2, 0, objArr);
            if (d0Var2.f4613m != d0.T(d0Var2, i20) || d0Var2.f4614n != d0.T(d0Var2, i19)) {
                StringBuilder sb5 = new StringBuilder();
                int i21 = 0;
                for (int i22 = 0; i22 < i20; i22++) {
                    if (((i7 << i22) & d0Var2.f4613m) != 0) {
                        if (i21 > 0) {
                            sb5.append(", ");
                        }
                        sb5.append(gVar2.b(i22));
                        i21++;
                    }
                }
                String sb6 = sb5.toString();
                StringBuilder o6 = a0.m.o(sb6, "StringBuilder().apply(builderAction).toString()");
                int i23 = 0;
                int i24 = 0;
                while (i23 < i19) {
                    int i25 = i19;
                    if (((i7 << i23) & d0Var2.f4614n) != 0) {
                        if (i21 > 0) {
                            o6.append(", ");
                        }
                        o6.append(gVar2.c(i23));
                        i24++;
                    }
                    i23++;
                    i19 = i25;
                }
                String sb7 = o6.toString();
                r6.k.e(sb7, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb8 = new StringBuilder("Error while pushing ");
                sb8.append(gVar2);
                sb8.append(". Not all arguments were provided. Missing ");
                a0.m.t(sb8, i21, " int arguments (", sb6, ") and ");
                a0.m.u(sb8, i24, " object arguments (", sb7, ").");
                throw th;
            }
        }
        arrayList2.clear();
    }

    public final void c() {
        int i7 = this.f4600l;
        if (i7 > 0) {
            int i8 = this.f4597i;
            if (i8 >= 0) {
                b();
                d0 d0Var = this.f4590b.f4587g;
                t tVar = t.f4634c;
                int i9 = tVar.f4605b;
                d0Var.a0(tVar);
                j1.c.k0(d0Var, 0, i8);
                j1.c.k0(d0Var, 1, i7);
                int i10 = d0Var.f4613m;
                int i11 = tVar.f4604a;
                if (i10 != d0.T(d0Var, i11) || d0Var.f4614n != d0.T(d0Var, i9)) {
                    StringBuilder sb = new StringBuilder();
                    int i12 = 0;
                    int i13 = 0;
                    while (i13 < i11) {
                        int i14 = i11;
                        if (((1 << i13) & d0Var.f4613m) != 0) {
                            if (i12 > 0) {
                                sb.append(", ");
                            }
                            sb.append(tVar.b(i13));
                            i12++;
                        }
                        i13++;
                        i11 = i14;
                    }
                    String sb2 = sb.toString();
                    StringBuilder o2 = a0.m.o(sb2, "StringBuilder().apply(builderAction).toString()");
                    int i15 = 0;
                    int i16 = 0;
                    while (i16 < i9) {
                        int i17 = i9;
                        if (((1 << i16) & d0Var.f4614n) != 0) {
                            if (i12 > 0) {
                                o2.append(", ");
                            }
                            o2.append(tVar.c(i16));
                            i15++;
                        }
                        i16++;
                        i9 = i17;
                    }
                    String sb3 = o2.toString();
                    r6.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(tVar);
                    sb4.append(". Not all arguments were provided. Missing ");
                    a0.m.t(sb4, i12, " int arguments (", sb2, ") and ");
                    a0.m.u(sb4, i15, " object arguments (", sb3, ").");
                    throw null;
                }
                this.f4597i = -1;
            } else {
                int i18 = this.f4599k;
                int i19 = this.f4598j;
                b();
                d0 d0Var2 = this.f4590b.f4587g;
                q qVar = q.f4631c;
                int i20 = qVar.f4605b;
                d0Var2.a0(qVar);
                j1.c.k0(d0Var2, 1, i18);
                j1.c.k0(d0Var2, 0, i19);
                j1.c.k0(d0Var2, 2, i7);
                int i21 = d0Var2.f4613m;
                int i22 = qVar.f4604a;
                if (i21 != d0.T(d0Var2, i22) || d0Var2.f4614n != d0.T(d0Var2, i20)) {
                    int i23 = 0;
                    StringBuilder sb5 = new StringBuilder();
                    for (int i24 = 0; i24 < i22; i24++) {
                        if (((1 << i24) & d0Var2.f4613m) != 0) {
                            if (i23 > 0) {
                                sb5.append(", ");
                            }
                            sb5.append(qVar.b(i24));
                            i23++;
                        }
                    }
                    String sb6 = sb5.toString();
                    StringBuilder o6 = a0.m.o(sb6, "StringBuilder().apply(builderAction).toString()");
                    int i25 = 0;
                    int i26 = 0;
                    while (i25 < i20) {
                        int i27 = i20;
                        if (((1 << i25) & d0Var2.f4614n) != 0) {
                            if (i23 > 0) {
                                o6.append(", ");
                            }
                            o6.append(qVar.c(i25));
                            i26++;
                        }
                        i25++;
                        i20 = i27;
                    }
                    String sb7 = o6.toString();
                    r6.k.e(sb7, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb8 = new StringBuilder("Error while pushing ");
                    sb8.append(qVar);
                    sb8.append(". Not all arguments were provided. Missing ");
                    a0.m.t(sb8, i23, " int arguments (", sb6, ") and ");
                    a0.m.u(sb8, i26, " object arguments (", sb7, ").");
                    throw null;
                }
                this.f4598j = -1;
                this.f4599k = -1;
            }
            this.f4600l = 0;
        }
    }

    public final void d(boolean z8) {
        g0.p pVar = this.f4589a;
        int i7 = z8 ? pVar.F.f3966i : pVar.F.f3964g;
        int i8 = i7 - this.f4594f;
        if (i8 < 0) {
            g0.d.w("Tried to seek backward");
            throw null;
        }
        if (i8 > 0) {
            d0 d0Var = this.f4590b.f4587g;
            d dVar = d.f4606c;
            int i9 = dVar.f4605b;
            d0Var.a0(dVar);
            j1.c.k0(d0Var, 0, i8);
            int i10 = d0Var.f4613m;
            int i11 = dVar.f4604a;
            if (i10 == d0.T(d0Var, i11) && d0Var.f4614n == d0.T(d0Var, i9)) {
                this.f4594f = i7;
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                if (((1 << i13) & d0Var.f4613m) != 0) {
                    if (i12 > 0) {
                        sb.append(", ");
                    }
                    sb.append(dVar.b(i13));
                    i12++;
                }
            }
            String sb2 = sb.toString();
            StringBuilder o2 = a0.m.o(sb2, "StringBuilder().apply(builderAction).toString()");
            int i14 = 0;
            for (int i15 = 0; i15 < i9; i15++) {
                if (((1 << i15) & d0Var.f4614n) != 0) {
                    if (i12 > 0) {
                        o2.append(", ");
                    }
                    o2.append(dVar.c(i15));
                    i14++;
                }
            }
            String sb3 = o2.toString();
            r6.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(dVar);
            sb4.append(". Not all arguments were provided. Missing ");
            a0.m.t(sb4, i12, " int arguments (", sb2, ") and ");
            a0.m.u(sb4, i14, " object arguments (", sb3, ").");
            throw null;
        }
    }

    public final void e(int i7, int i8) {
        if (i8 > 0) {
            if (!(i7 >= 0)) {
                g0.d.w("Invalid remove index " + i7);
                throw null;
            }
            if (this.f4597i == i7) {
                this.f4600l += i8;
                return;
            }
            c();
            this.f4597i = i7;
            this.f4600l = i8;
        }
    }
}
