package r0;

import G.C0223t;
import Z.C0311h;
import Z.C0323u;
import a.AbstractC0345a;
import c0.C0531b;
import kotlin.jvm.functions.Function1;
import p0.AbstractC0954O;
import p0.C0976l;
import p0.InterfaceC0945F;
import s0.C1166s;

/* renamed from: r0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1078t extends a0 {

    /* renamed from: R, reason: collision with root package name */
    public static final C0311h f9840R;

    /* renamed from: P, reason: collision with root package name */
    public final o0 f9841P;

    /* renamed from: Q, reason: collision with root package name */
    public C1077s f9842Q;

    static {
        C0311h g4 = Z.K.g();
        int i2 = C0323u.f4548h;
        g4.e(C0323u.f4544d);
        g4.k(1.0f);
        g4.l(1);
        f9840R = g4;
    }

    public C1078t(E e4) {
        super(e4);
        o0 o0Var = new o0();
        o0Var.f3981j = 0;
        this.f9841P = o0Var;
        o0Var.f3985n = this;
        this.f9842Q = e4.f9596i != null ? new C1077s(this) : null;
    }

    @Override // r0.a0
    public final void J0() {
        if (this.f9842Q == null) {
            this.f9842Q = new C1077s(this);
        }
    }

    @Override // r0.a0
    public final P M0() {
        return this.f9842Q;
    }

    @Override // r0.a0
    public final S.n O0() {
        return this.f9841P;
    }

    @Override // p0.InterfaceC0944E
    public final int S(int i2) {
        l2.g r2 = this.f9762r.r();
        InterfaceC0945F j4 = r2.j();
        E e4 = (E) r2.f7976b;
        return j4.a((a0) e4.B.f2910d, e4.m(), i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // r0.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T0(C1063d c1063d, long j4, r rVar, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        int i2;
        r rVar2;
        Object[] objArr;
        boolean z8;
        f0 f0Var;
        r rVar3 = rVar;
        boolean z9 = false;
        boolean z10 = true;
        E e4 = this.f9762r;
        switch (c1063d.f9777d) {
            case 1:
                z6 = true;
                break;
            default:
                y0.i o4 = e4.o();
                z6 = !(o4 != null && o4.f11578i);
                break;
        }
        if (z6) {
            if (AbstractC0345a.y(j4) && ((f0Var = this.f9761J) == null || !this.f9766v || f0Var.k(j4))) {
                z7 = z5;
            } else if (z4) {
                float F02 = F0(j4, N0());
                if (!Float.isInfinite(F02) && !Float.isNaN(F02)) {
                    z7 = false;
                }
            }
            z9 = true;
            if (z9) {
                return;
            }
            int i4 = rVar3.f9837i;
            I.d u4 = e4.u();
            int i5 = u4.f3332i;
            if (i5 > 0) {
                Object[] objArr2 = u4.f3330d;
                int i6 = i5 - 1;
                while (true) {
                    E e5 = (E) objArr2[i6];
                    if (e5.E()) {
                        switch (c1063d.f9777d) {
                            case 1:
                                objArr = objArr2;
                                i2 = i4;
                                z8 = z10;
                                rVar2 = rVar3;
                                e5.w(j4, rVar, z4, z7);
                                break;
                            default:
                                C0223t c0223t = e5.B;
                                ((a0) c0223t.f2910d).S0(a0.f9752O, ((a0) c0223t.f2910d).L0(j4, z10), rVar, true, z7);
                                objArr = objArr2;
                                i2 = i4;
                                z8 = z10;
                                rVar2 = rVar3;
                                break;
                        }
                        long e6 = rVar.e();
                        if (Float.intBitsToFloat((int) (e6 >> 32)) < 0.0f && ((int) (e6 & 4294967295L)) != 0) {
                            if (rVar2.f9839k) {
                                rVar2.f9837i = rVar2.f9838j - (z8 ? 1 : 0);
                            }
                        }
                    } else {
                        objArr = objArr2;
                        i2 = i4;
                        z8 = z10;
                        rVar2 = rVar3;
                    }
                    i6--;
                    if (i6 >= 0) {
                        objArr2 = objArr;
                        i4 = i2;
                        z10 = z8;
                        rVar3 = rVar2;
                    }
                }
            } else {
                i2 = i4;
                rVar2 = rVar3;
            }
            rVar2.f9837i = i2;
            return;
        }
        z7 = z5;
        if (z9) {
        }
    }

    @Override // p0.InterfaceC0944E
    public final int X(int i2) {
        l2.g r2 = this.f9762r.r();
        InterfaceC0945F j4 = r2.j();
        E e4 = (E) r2.f7976b;
        return j4.h((a0) e4.B.f2910d, e4.m(), i2);
    }

    @Override // p0.InterfaceC0944E
    public final int Z(int i2) {
        l2.g r2 = this.f9762r.r();
        InterfaceC0945F j4 = r2.j();
        E e4 = (E) r2.f7976b;
        return j4.e((a0) e4.B.f2910d, e4.m(), i2);
    }

    @Override // p0.InterfaceC0944E
    public final AbstractC0954O a(long j4) {
        q0(j4);
        E e4 = this.f9762r;
        I.d v4 = e4.v();
        int i2 = v4.f3332i;
        if (i2 > 0) {
            Object[] objArr = v4.f3330d;
            int i4 = 0;
            do {
                ((E) objArr[i4]).f9584C.f9691r.f9664q = 3;
                i4++;
            } while (i4 < i2);
        }
        d1(e4.f9608u.f(this, e4.m(), j4));
        Y0();
        return this;
    }

    @Override // r0.a0
    public final void a1(Z.r rVar, C0531b c0531b) {
        E e4 = this.f9762r;
        g0 a4 = H.a(e4);
        I.d u4 = e4.u();
        int i2 = u4.f3332i;
        if (i2 > 0) {
            Object[] objArr = u4.f3330d;
            int i4 = 0;
            do {
                E e5 = (E) objArr[i4];
                if (e5.E()) {
                    e5.j(rVar, c0531b);
                }
                i4++;
            } while (i4 < i2);
        }
        if (((C1166s) a4).getShowLayoutBounds()) {
            H0(rVar, f9840R);
        }
    }

    @Override // p0.InterfaceC0944E
    public final int b(int i2) {
        l2.g r2 = this.f9762r.r();
        InterfaceC0945F j4 = r2.j();
        E e4 = (E) r2.f7976b;
        return j4.g((a0) e4.B.f2910d, e4.m(), i2);
    }

    @Override // p0.AbstractC0954O
    public final void n0(long j4, float f4, Function1 function1) {
        b1(j4, f4, function1);
        if (this.f9702m) {
            return;
        }
        Z0();
        this.f9762r.f9584C.f9691r.w0();
    }

    @Override // r0.O
    public final int r0(C0976l c0976l) {
        C1077s c1077s = this.f9842Q;
        if (c1077s != null) {
            return c1077s.r0(c0976l);
        }
        K k4 = this.f9762r.f9584C.f9691r;
        boolean z4 = k4.f9665r;
        F f4 = k4.f9673z;
        if (!z4) {
            L l4 = k4.f9658L;
            if (l4.f9676c == 1) {
                f4.f9619f = true;
                if (f4.f9615b) {
                    l4.f9678e = true;
                    l4.f9679f = true;
                }
            } else {
                f4.f9620g = true;
            }
        }
        k4.T().f9703n = true;
        k4.f();
        k4.T().f9703n = false;
        Integer num = (Integer) f4.f9622i.get(c0976l);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
