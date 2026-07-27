package o;

import W2.EnumC0303z;
import a.AbstractC0345a;
import kotlin.jvm.internal.Intrinsics;
import l0.C0810h;
import p0.InterfaceC0980p;
import r0.AbstractC1065f;
import r0.InterfaceC1071l;
import r0.InterfaceC1080v;
import y2.C1338m;

/* renamed from: o.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0894k extends S.n implements InterfaceC1080v, InterfaceC1071l {

    /* renamed from: A, reason: collision with root package name */
    public boolean f8807A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f8808C;

    /* renamed from: t, reason: collision with root package name */
    public N f8809t;

    /* renamed from: u, reason: collision with root package name */
    public final C0908r0 f8810u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8811v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0880d f8812w;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC0980p f8814y;

    /* renamed from: z, reason: collision with root package name */
    public Y.d f8815z;

    /* renamed from: x, reason: collision with root package name */
    public final C0810h f8813x = new C0810h(1);
    public long B = 0;

    public C0894k(N n2, C0908r0 c0908r0, boolean z4, InterfaceC0880d interfaceC0880d) {
        this.f8809t = n2;
        this.f8810u = c0908r0;
        this.f8811v = z4;
        this.f8812w = interfaceC0880d;
    }

    public static final float B0(C0894k c0894k, InterfaceC0880d interfaceC0880d) {
        Y.d dVar;
        float a4;
        int compare;
        if (M0.j.a(c0894k.B, 0L)) {
            return 0.0f;
        }
        I.d dVar2 = c0894k.f8813x.f7906a;
        int i2 = dVar2.f3332i;
        if (i2 > 0) {
            int i4 = i2 - 1;
            Object[] objArr = dVar2.f3330d;
            dVar = null;
            while (true) {
                Y.d dVar3 = (Y.d) ((C0888h) objArr[i4]).f8773a.invoke();
                if (dVar3 != null) {
                    long N3 = u3.l.N(dVar3.c(), dVar3.b());
                    long U3 = u3.d.U(c0894k.B);
                    int ordinal = c0894k.f8809t.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(Y.f.b(N3), Y.f.b(U3));
                    } else {
                        if (ordinal != 1) {
                            throw new C1338m();
                        }
                        compare = Float.compare(Y.f.d(N3), Y.f.d(U3));
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
            Y.d C02 = c0894k.f8807A ? c0894k.C0() : null;
            if (C02 == null) {
                return 0.0f;
            }
            dVar = C02;
        }
        long U4 = u3.d.U(c0894k.B);
        int ordinal2 = c0894k.f8809t.ordinal();
        if (ordinal2 == 0) {
            float f4 = dVar.f4377d;
            float f5 = dVar.f4375b;
            a4 = interfaceC0880d.a(f5, f4 - f5, Y.f.b(U4));
        } else {
            if (ordinal2 != 1) {
                throw new C1338m();
            }
            float f6 = dVar.f4376c;
            float f7 = dVar.f4374a;
            a4 = interfaceC0880d.a(f7, f6 - f7, Y.f.d(U4));
        }
        return a4;
    }

    public final Y.d C0() {
        if (!this.f3990s) {
            return null;
        }
        r0.a0 u4 = AbstractC1065f.u(this);
        InterfaceC0980p interfaceC0980p = this.f8814y;
        if (interfaceC0980p != null) {
            if (!interfaceC0980p.p()) {
                interfaceC0980p = null;
            }
            if (interfaceC0980p != null) {
                return u4.n(interfaceC0980p, false);
            }
        }
        return null;
    }

    public final boolean D0(Y.d dVar, long j4) {
        long F02 = F0(dVar, j4);
        return Math.abs(Y.c.d(F02)) <= 0.5f && Math.abs(Y.c.e(F02)) <= 0.5f;
    }

    public final void E0() {
        InterfaceC0880d interfaceC0880d = this.f8812w;
        if (interfaceC0880d == null) {
            interfaceC0880d = (InterfaceC0880d) AbstractC1065f.i(this, AbstractC0886g.f8767a);
        }
        if (this.f8808C) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        W2.B.m(p0(), null, EnumC0303z.f4307j, new C0892j(this, new U0(interfaceC0880d.b()), interfaceC0880d, null), 1);
    }

    public final long F0(Y.d dVar, long j4) {
        long U3 = u3.d.U(j4);
        int ordinal = this.f8809t.ordinal();
        if (ordinal == 0) {
            InterfaceC0880d interfaceC0880d = this.f8812w;
            if (interfaceC0880d == null) {
                interfaceC0880d = (InterfaceC0880d) AbstractC1065f.i(this, AbstractC0886g.f8767a);
            }
            float f4 = dVar.f4377d;
            float f5 = dVar.f4375b;
            return AbstractC0345a.c(0.0f, interfaceC0880d.a(f5, f4 - f5, Y.f.b(U3)));
        }
        if (ordinal != 1) {
            throw new C1338m();
        }
        InterfaceC0880d interfaceC0880d2 = this.f8812w;
        if (interfaceC0880d2 == null) {
            interfaceC0880d2 = (InterfaceC0880d) AbstractC1065f.i(this, AbstractC0886g.f8767a);
        }
        float f6 = dVar.f4376c;
        float f7 = dVar.f4374a;
        return AbstractC0345a.c(interfaceC0880d2.a(f7, f6 - f7, Y.f.d(U3)), 0.0f);
    }

    @Override // S.n
    public final boolean q0() {
        return false;
    }

    @Override // r0.InterfaceC1080v
    public final void z(long j4) {
        int e4;
        Y.d C02;
        long j5 = this.B;
        this.B = j4;
        int ordinal = this.f8809t.ordinal();
        if (ordinal == 0) {
            e4 = Intrinsics.e((int) (j4 & 4294967295L), (int) (4294967295L & j5));
        } else {
            if (ordinal != 1) {
                throw new C1338m();
            }
            e4 = Intrinsics.e((int) (j4 >> 32), (int) (j5 >> 32));
        }
        if (e4 < 0 && (C02 = C0()) != null) {
            Y.d dVar = this.f8815z;
            if (dVar == null) {
                dVar = C02;
            }
            if (!this.f8808C && !this.f8807A && D0(dVar, j5) && !D0(C02, j4)) {
                this.f8807A = true;
                E0();
            }
            this.f8815z = C02;
        }
    }
}
