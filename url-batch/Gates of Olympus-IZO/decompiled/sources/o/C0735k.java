package o;

import k2.AbstractC0552y;
import k2.EnumC0551x;
import r0.InterfaceC0838k;
import t0.AbstractC0898f;
import t0.InterfaceC0903k;
import t0.InterfaceC0913v;

/* renamed from: o.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0735k extends U.k implements InterfaceC0913v, InterfaceC0903k {

    /* renamed from: q, reason: collision with root package name */
    public J f6549q;

    /* renamed from: r, reason: collision with root package name */
    public final o0 f6550r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6551s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0728d f6552t;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0838k f6554v;

    /* renamed from: w, reason: collision with root package name */
    public a0.d f6555w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6556x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f6558z;

    /* renamed from: u, reason: collision with root package name */
    public final n0.f f6553u = new n0.f(1);

    /* renamed from: y, reason: collision with root package name */
    public long f6557y = 0;

    public C0735k(J j3, o0 o0Var, boolean z3, InterfaceC0728d interfaceC0728d) {
        this.f6549q = j3;
        this.f6550r = o0Var;
        this.f6551s = z3;
        this.f6552t = interfaceC0728d;
    }

    public static final float v0(C0735k c0735k, InterfaceC0728d interfaceC0728d) {
        a0.d dVar;
        float a3;
        int compare;
        if (M0.i.a(c0735k.f6557y, 0L)) {
            return 0.0f;
        }
        K.d dVar2 = c0735k.f6553u.f6213a;
        int i3 = dVar2.f2642f;
        if (i3 > 0) {
            int i4 = i3 - 1;
            Object[] objArr = dVar2.f2640d;
            dVar = null;
            while (true) {
                a0.d dVar3 = (a0.d) ((C0732h) objArr[i4]).f6530a.b();
                if (dVar3 != null) {
                    long h3 = I2.d.h(dVar3.c(), dVar3.b());
                    long R2 = I2.l.R(c0735k.f6557y);
                    int ordinal = c0735k.f6549q.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(a0.f.b(h3), a0.f.b(R2));
                    } else {
                        if (ordinal != 1) {
                            throw new L1.f();
                        }
                        compare = Float.compare(a0.f.d(h3), a0.f.d(R2));
                    }
                    if (compare <= 0) {
                        dVar = dVar3;
                    } else if (dVar == null) {
                        dVar = dVar3;
                    }
                }
                i4--;
                if (i4 < 0) {
                    break;
                }
            }
        } else {
            dVar = null;
        }
        if (dVar == null) {
            a0.d w02 = c0735k.f6556x ? c0735k.w0() : null;
            if (w02 == null) {
                return 0.0f;
            }
            dVar = w02;
        }
        long R3 = I2.l.R(c0735k.f6557y);
        int ordinal2 = c0735k.f6549q.ordinal();
        if (ordinal2 == 0) {
            float f3 = dVar.f3494d;
            float f4 = dVar.f3492b;
            a3 = interfaceC0728d.a(f4, f3 - f4, a0.f.b(R3));
        } else {
            if (ordinal2 != 1) {
                throw new L1.f();
            }
            float f5 = dVar.f3493c;
            float f6 = dVar.f3491a;
            a3 = interfaceC0728d.a(f6, f5 - f6, a0.f.d(R3));
        }
        return a3;
    }

    @Override // t0.InterfaceC0913v
    public final void A(long j3) {
        int g3;
        a0.d w02;
        long j4 = this.f6557y;
        this.f6557y = j3;
        int ordinal = this.f6549q.ordinal();
        if (ordinal == 0) {
            g3 = Z1.i.g((int) (j3 & 4294967295L), (int) (4294967295L & j4));
        } else {
            if (ordinal != 1) {
                throw new L1.f();
            }
            g3 = Z1.i.g((int) (j3 >> 32), (int) (j4 >> 32));
        }
        if (g3 < 0 && (w02 = w0()) != null) {
            a0.d dVar = this.f6555w;
            if (dVar == null) {
                dVar = w02;
            }
            if (!this.f6558z && !this.f6556x && x0(dVar, j4) && !x0(w02, j3)) {
                this.f6556x = true;
                y0();
            }
            this.f6555w = w02;
        }
    }

    @Override // U.k
    public final boolean k0() {
        return false;
    }

    public final a0.d w0() {
        if (!this.p) {
            return null;
        }
        t0.a0 s3 = AbstractC0898f.s(this);
        InterfaceC0838k interfaceC0838k = this.f6554v;
        if (interfaceC0838k != null) {
            if (!interfaceC0838k.n()) {
                interfaceC0838k = null;
            }
            if (interfaceC0838k != null) {
                return s3.u(interfaceC0838k, false);
            }
        }
        return null;
    }

    public final boolean x0(a0.d dVar, long j3) {
        long z02 = z0(dVar, j3);
        return Math.abs(a0.c.d(z02)) <= 0.5f && Math.abs(a0.c.e(z02)) <= 0.5f;
    }

    public final void y0() {
        InterfaceC0728d interfaceC0728d = this.f6552t;
        if (interfaceC0728d == null) {
            interfaceC0728d = (InterfaceC0728d) AbstractC0898f.i(this, AbstractC0731g.f6512a);
        }
        if (this.f6558z) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        AbstractC0552y.q(j0(), null, EnumC0551x.f5398g, new C0734j(this, new A0(interfaceC0728d.b()), interfaceC0728d, null), 1);
    }

    public final long z0(a0.d dVar, long j3) {
        long R2 = I2.l.R(j3);
        int ordinal = this.f6549q.ordinal();
        if (ordinal == 0) {
            InterfaceC0728d interfaceC0728d = this.f6552t;
            if (interfaceC0728d == null) {
                interfaceC0728d = (InterfaceC0728d) AbstractC0898f.i(this, AbstractC0731g.f6512a);
            }
            float f3 = dVar.f3494d;
            float f4 = dVar.f3492b;
            return I2.l.f(0.0f, interfaceC0728d.a(f4, f3 - f4, a0.f.b(R2)));
        }
        if (ordinal != 1) {
            throw new L1.f();
        }
        InterfaceC0728d interfaceC0728d2 = this.f6552t;
        if (interfaceC0728d2 == null) {
            interfaceC0728d2 = (InterfaceC0728d) AbstractC0898f.i(this, AbstractC0731g.f6512a);
        }
        float f5 = dVar.f3493c;
        float f6 = dVar.f3491a;
        return I2.l.f(interfaceC0728d2.a(f6, f5 - f6, a0.f.d(R2)), 0.0f);
    }
}
