package u;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import s.C3404d;
import t.C3422d;
import t.C3423e;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3447b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f46299a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private a f46300b = new a();

    /* renamed from: c, reason: collision with root package name */
    private t.f f46301c;

    /* renamed from: u.b$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public C3423e.b f46302a;

        /* renamed from: b, reason: collision with root package name */
        public C3423e.b f46303b;

        /* renamed from: c, reason: collision with root package name */
        public int f46304c;

        /* renamed from: d, reason: collision with root package name */
        public int f46305d;

        /* renamed from: e, reason: collision with root package name */
        public int f46306e;

        /* renamed from: f, reason: collision with root package name */
        public int f46307f;

        /* renamed from: g, reason: collision with root package name */
        public int f46308g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f46309h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f46310i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f46311j;
    }

    /* renamed from: u.b$b, reason: collision with other inner class name */
    public interface InterfaceC0282b {
        void a(C3423e c3423e, a aVar);

        void b();
    }

    public C3447b(t.f fVar) {
        this.f46301c = fVar;
    }

    private boolean a(InterfaceC0282b interfaceC0282b, C3423e c3423e, boolean z4) {
        this.f46300b.f46302a = c3423e.w();
        this.f46300b.f46303b = c3423e.K();
        this.f46300b.f46304c = c3423e.N();
        this.f46300b.f46305d = c3423e.t();
        a aVar = this.f46300b;
        aVar.f46310i = false;
        aVar.f46311j = z4;
        C3423e.b bVar = aVar.f46302a;
        C3423e.b bVar2 = C3423e.b.MATCH_CONSTRAINT;
        boolean z5 = bVar == bVar2;
        boolean z6 = aVar.f46303b == bVar2;
        boolean z7 = z5 && c3423e.f46100Q > 0.0f;
        boolean z8 = z6 && c3423e.f46100Q > 0.0f;
        if (z7 && c3423e.f46136n[0] == 4) {
            aVar.f46302a = C3423e.b.FIXED;
        }
        if (z8 && c3423e.f46136n[1] == 4) {
            aVar.f46303b = C3423e.b.FIXED;
        }
        interfaceC0282b.a(c3423e, aVar);
        c3423e.A0(this.f46300b.f46306e);
        c3423e.e0(this.f46300b.f46307f);
        c3423e.d0(this.f46300b.f46309h);
        c3423e.Y(this.f46300b.f46308g);
        a aVar2 = this.f46300b;
        aVar2.f46311j = false;
        return aVar2.f46310i;
    }

    private void b(t.f fVar) {
        int size = fVar.f46197w0.size();
        InterfaceC0282b R02 = fVar.R0();
        for (int i4 = 0; i4 < size; i4++) {
            C3423e c3423e = (C3423e) fVar.f46197w0.get(i4);
            if (!(c3423e instanceof t.g) && (!c3423e.f46118e.f46362e.f46332j || !c3423e.f46120f.f46362e.f46332j)) {
                C3423e.b q4 = c3423e.q(0);
                C3423e.b q5 = c3423e.q(1);
                C3423e.b bVar = C3423e.b.MATCH_CONSTRAINT;
                if (q4 != bVar || c3423e.f46132l == 1 || q5 != bVar || c3423e.f46134m == 1) {
                    a(R02, c3423e, false);
                }
            }
        }
        R02.b();
    }

    private void c(t.f fVar, String str, int i4, int i5) {
        int C4 = fVar.C();
        int B4 = fVar.B();
        fVar.q0(0);
        fVar.p0(0);
        fVar.A0(i4);
        fVar.e0(i5);
        fVar.q0(C4);
        fVar.p0(B4);
        this.f46301c.G0();
    }

    public long d(t.f fVar, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        int i13;
        boolean z4;
        int i14;
        long j4;
        boolean z5;
        boolean z6;
        int i15;
        boolean z7;
        InterfaceC0282b interfaceC0282b;
        boolean z8;
        boolean z9;
        int i16;
        InterfaceC0282b R02 = fVar.R0();
        int size = fVar.f46197w0.size();
        int N3 = fVar.N();
        int t4 = fVar.t();
        boolean b4 = t.j.b(i4, UserVerificationMethods.USER_VERIFY_PATTERN);
        int i17 = 0;
        int i18 = (b4 || t.j.b(i4, 64)) ? 1 : 0;
        if (i18 != 0) {
            for (int i19 = 0; i19 < size; i19++) {
                C3423e c3423e = (C3423e) fVar.f46197w0.get(i19);
                C3423e.b w4 = c3423e.w();
                C3423e.b bVar = C3423e.b.MATCH_CONSTRAINT;
                i13 = 1;
                boolean z10 = (w4 == bVar) && (c3423e.K() == bVar) && c3423e.r() > 0.0f;
                if ((c3423e.T() && z10) || ((c3423e.V() && z10) || c3423e.T() || c3423e.V())) {
                    i18 = 0;
                    break;
                }
            }
        }
        i13 = 1;
        if (i18 != 0) {
            boolean z11 = C3404d.f45886r;
        }
        if ((i18 & (((i7 == 1073741824 && i9 == 1073741824) || b4) ? i13 : 0)) != 0) {
            int min = Math.min(fVar.A(), i8);
            int min2 = Math.min(fVar.z(), i10);
            if (i7 == 1073741824 && fVar.N() != min) {
                fVar.A0(min);
                fVar.T0();
            }
            if (i9 == 1073741824 && fVar.t() != min2) {
                fVar.e0(min2);
                fVar.T0();
            }
            if (i7 == 1073741824 && i9 == 1073741824) {
                z4 = fVar.N0(b4);
                i14 = 2;
            } else {
                boolean O02 = fVar.O0(b4);
                if (i7 == 1073741824) {
                    z9 = O02 & fVar.P0(b4, 0);
                    i16 = i13;
                } else {
                    z9 = O02;
                    i16 = 0;
                }
                if (i9 == 1073741824) {
                    int i20 = i13;
                    boolean P02 = fVar.P0(b4, i20) & z9;
                    i14 = i16 + i20;
                    z4 = P02;
                } else {
                    i14 = i16;
                    z4 = z9;
                }
            }
            if (z4) {
                fVar.E0(i7 == 1073741824, i9 == 1073741824);
            }
        } else {
            z4 = false;
            i14 = 0;
        }
        long j5 = 0;
        if (z4 && i14 == 2) {
            return 0L;
        }
        if (size > 0) {
            b(fVar);
        }
        int S02 = fVar.S0();
        int size2 = this.f46299a.size();
        if (size > 0) {
            c(fVar, "First pass", N3, t4);
        }
        if (size2 > 0) {
            C3423e.b w5 = fVar.w();
            C3423e.b bVar2 = C3423e.b.WRAP_CONTENT;
            boolean z12 = w5 == bVar2;
            boolean z13 = fVar.K() == bVar2;
            int max = Math.max(fVar.N(), this.f46301c.C());
            int max2 = Math.max(fVar.t(), this.f46301c.B());
            int i21 = 0;
            while (i21 < size2) {
                long j6 = j5;
                i21++;
                j5 = j6;
            }
            j4 = j5;
            int i22 = 0;
            boolean z14 = false;
            for (int i23 = 2; i22 < i23; i23 = 2) {
                int i24 = i17;
                while (i24 < size2) {
                    C3423e c3423e2 = (C3423e) this.f46299a.get(i24);
                    if ((c3423e2 instanceof t.h) || (c3423e2 instanceof t.g)) {
                        i15 = i22;
                    } else {
                        i15 = i22;
                        if (c3423e2.M() != 8 && (!c3423e2.f46118e.f46362e.f46332j || !c3423e2.f46120f.f46362e.f46332j)) {
                            int N4 = c3423e2.N();
                            int t5 = c3423e2.t();
                            boolean z15 = z14;
                            int l4 = c3423e2.l();
                            z7 = z13;
                            boolean a4 = z15 | a(R02, c3423e2, true);
                            interfaceC0282b = R02;
                            int N5 = c3423e2.N();
                            int t6 = c3423e2.t();
                            if (N5 != N4) {
                                c3423e2.A0(N5);
                                if (z12 && c3423e2.G() > max) {
                                    max = Math.max(max, c3423e2.G() + c3423e2.k(C3422d.b.RIGHT).b());
                                }
                                z8 = true;
                            } else {
                                z8 = a4;
                            }
                            if (t6 != t5) {
                                c3423e2.e0(t6);
                                if (z7 && c3423e2.n() > max2) {
                                    max2 = Math.max(max2, c3423e2.n() + c3423e2.k(C3422d.b.BOTTOM).b());
                                }
                                z8 = true;
                            }
                            z14 = (!c3423e2.Q() || l4 == c3423e2.l()) ? z8 : true;
                            i24++;
                            i22 = i15;
                            z13 = z7;
                            R02 = interfaceC0282b;
                        }
                    }
                    interfaceC0282b = R02;
                    z7 = z13;
                    i24++;
                    i22 = i15;
                    z13 = z7;
                    R02 = interfaceC0282b;
                }
                int i25 = i22;
                boolean z16 = z14;
                InterfaceC0282b interfaceC0282b2 = R02;
                boolean z17 = z13;
                if (z16) {
                    c(fVar, "intermediate pass", N3, t4);
                    z14 = false;
                } else {
                    z14 = z16;
                }
                i22 = i25 + 1;
                z13 = z17;
                R02 = interfaceC0282b2;
                i17 = 0;
            }
            if (z14) {
                c(fVar, "2nd pass", N3, t4);
                if (fVar.N() < max) {
                    fVar.A0(max);
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (fVar.t() < max2) {
                    fVar.e0(max2);
                    z6 = true;
                } else {
                    z6 = z5;
                }
                if (z6) {
                    c(fVar, "3rd pass", N3, t4);
                }
            }
        } else {
            j4 = 0;
        }
        fVar.c1(S02);
        return j4;
    }

    public void e(t.f fVar) {
        int i4;
        this.f46299a.clear();
        int size = fVar.f46197w0.size();
        while (i4 < size) {
            C3423e c3423e = (C3423e) fVar.f46197w0.get(i4);
            C3423e.b w4 = c3423e.w();
            C3423e.b bVar = C3423e.b.MATCH_CONSTRAINT;
            if (w4 != bVar) {
                C3423e.b w5 = c3423e.w();
                C3423e.b bVar2 = C3423e.b.MATCH_PARENT;
                i4 = (w5 == bVar2 || c3423e.K() == bVar || c3423e.K() == bVar2) ? 0 : i4 + 1;
            }
            this.f46299a.add(c3423e);
        }
        fVar.T0();
    }
}
