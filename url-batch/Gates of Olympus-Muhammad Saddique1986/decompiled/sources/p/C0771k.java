package p;

import a.AbstractC0235a;
import a0.C0238c;
import a0.C0239d;
import a0.C0241f;
import n0.C0710h;
import q2.AbstractC0837y;
import q2.EnumC0836x;
import r0.InterfaceC0919p;
import t0.AbstractC0993f;
import t0.InterfaceC0998k;
import t0.InterfaceC1008v;

/* renamed from: p.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0771k extends U.p implements InterfaceC1008v, InterfaceC0998k {

    /* renamed from: q, reason: collision with root package name */
    public P f7692q;

    /* renamed from: r, reason: collision with root package name */
    public final C0793v0 f7693r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7694s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0757d f7695t;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0919p f7697v;

    /* renamed from: w, reason: collision with root package name */
    public C0239d f7698w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7699x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7701z;

    /* renamed from: u, reason: collision with root package name */
    public final C0710h f7696u = new C0710h(1);

    /* renamed from: y, reason: collision with root package name */
    public long f7700y = 0;

    public C0771k(P p3, C0793v0 c0793v0, boolean z3, InterfaceC0757d interfaceC0757d) {
        this.f7692q = p3;
        this.f7693r = c0793v0;
        this.f7694s = z3;
        this.f7695t = interfaceC0757d;
    }

    public static final float y0(C0771k c0771k, InterfaceC0757d interfaceC0757d) {
        C0239d c0239d;
        float a3;
        int compare;
        if (O0.j.a(c0771k.f7700y, 0L)) {
            return 0.0f;
        }
        K.d dVar = c0771k.f7696u.f7291a;
        int i3 = dVar.f3216f;
        if (i3 > 0) {
            int i4 = i3 - 1;
            Object[] objArr = dVar.f3214d;
            c0239d = null;
            while (true) {
                C0239d c0239d2 = (C0239d) ((C0765h) objArr[i4]).f7671a.b();
                if (c0239d2 != null) {
                    long e3 = AbstractC0235a.e(c0239d2.c(), c0239d2.b());
                    long f02 = O2.d.f0(c0771k.f7700y);
                    int ordinal = c0771k.f7692q.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(C0241f.b(e3), C0241f.b(f02));
                    } else {
                        if (ordinal != 1) {
                            throw new C1.c();
                        }
                        compare = Float.compare(C0241f.d(e3), C0241f.d(f02));
                    }
                    if (compare <= 0) {
                        c0239d = c0239d2;
                    } else if (c0239d == null) {
                        c0239d = c0239d2;
                    }
                }
                i4--;
                if (i4 < 0) {
                    break;
                }
            }
        } else {
            c0239d = null;
        }
        if (c0239d == null) {
            C0239d z02 = c0771k.f7699x ? c0771k.z0() : null;
            if (z02 == null) {
                return 0.0f;
            }
            c0239d = z02;
        }
        long f03 = O2.d.f0(c0771k.f7700y);
        int ordinal2 = c0771k.f7692q.ordinal();
        if (ordinal2 == 0) {
            float f3 = c0239d.f4727d;
            float f4 = c0239d.f4725b;
            a3 = interfaceC0757d.a(f4, f3 - f4, C0241f.b(f03));
        } else {
            if (ordinal2 != 1) {
                throw new C1.c();
            }
            float f5 = c0239d.f4726c;
            float f6 = c0239d.f4724a;
            a3 = interfaceC0757d.a(f6, f5 - f6, C0241f.d(f03));
        }
        return a3;
    }

    public final boolean A0(C0239d c0239d, long j3) {
        long C02 = C0(c0239d, j3);
        return Math.abs(C0238c.d(C02)) <= 0.5f && Math.abs(C0238c.e(C02)) <= 0.5f;
    }

    public final void B0() {
        InterfaceC0757d interfaceC0757d = this.f7695t;
        if (interfaceC0757d == null) {
            interfaceC0757d = (InterfaceC0757d) AbstractC0993f.i(this, AbstractC0763g.f7667a);
        }
        if (this.f7701z) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        AbstractC0837y.r(m0(), null, EnumC0836x.f7937g, new C0769j(this, new X0(interfaceC0757d.b()), interfaceC0757d, null), 1);
    }

    @Override // t0.InterfaceC1008v
    public final void C(long j3) {
        int g3;
        C0239d z02;
        long j4 = this.f7700y;
        this.f7700y = j3;
        int ordinal = this.f7692q.ordinal();
        if (ordinal == 0) {
            g3 = f2.j.g((int) (j3 & 4294967295L), (int) (4294967295L & j4));
        } else {
            if (ordinal != 1) {
                throw new C1.c();
            }
            g3 = f2.j.g((int) (j3 >> 32), (int) (j4 >> 32));
        }
        if (g3 < 0 && (z02 = z0()) != null) {
            C0239d c0239d = this.f7698w;
            if (c0239d == null) {
                c0239d = z02;
            }
            if (!this.f7701z && !this.f7699x && A0(c0239d, j4) && !A0(z02, j3)) {
                this.f7699x = true;
                B0();
            }
            this.f7698w = z02;
        }
    }

    public final long C0(C0239d c0239d, long j3) {
        long f02 = O2.d.f0(j3);
        int ordinal = this.f7692q.ordinal();
        if (ordinal == 0) {
            InterfaceC0757d interfaceC0757d = this.f7695t;
            if (interfaceC0757d == null) {
                interfaceC0757d = (InterfaceC0757d) AbstractC0993f.i(this, AbstractC0763g.f7667a);
            }
            float f3 = c0239d.f4727d;
            float f4 = c0239d.f4725b;
            return l0.c.e(0.0f, interfaceC0757d.a(f4, f3 - f4, C0241f.b(f02)));
        }
        if (ordinal != 1) {
            throw new C1.c();
        }
        InterfaceC0757d interfaceC0757d2 = this.f7695t;
        if (interfaceC0757d2 == null) {
            interfaceC0757d2 = (InterfaceC0757d) AbstractC0993f.i(this, AbstractC0763g.f7667a);
        }
        float f5 = c0239d.f4726c;
        float f6 = c0239d.f4724a;
        return l0.c.e(interfaceC0757d2.a(f6, f5 - f6, C0241f.d(f02)), 0.0f);
    }

    @Override // U.p
    public final boolean n0() {
        return false;
    }

    public final C0239d z0() {
        if (!this.f4501p) {
            return null;
        }
        t0.b0 s3 = AbstractC0993f.s(this);
        InterfaceC0919p interfaceC0919p = this.f7697v;
        if (interfaceC0919p != null) {
            if (!interfaceC0919p.o()) {
                interfaceC0919p = null;
            }
            if (interfaceC0919p != null) {
                return s3.B(interfaceC0919p, false);
            }
        }
        return null;
    }
}
