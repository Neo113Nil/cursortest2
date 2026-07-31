package t0;

import I.C0174t;
import android.graphics.Paint;
import b0.C0339h;
import b0.C0352v;
import e0.C0416b;
import e2.InterfaceC0424c;
import r0.AbstractC0893O;
import r0.C0915l;
import r0.InterfaceC0885G;
import u0.C1123s;
import z.C1256t;

/* renamed from: t0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1006t extends b0 {

    /* renamed from: O, reason: collision with root package name */
    public static final C0339h f8788O;

    /* renamed from: M, reason: collision with root package name */
    public final p0 f8789M;

    /* renamed from: N, reason: collision with root package name */
    public C1005s f8790N;

    static {
        C0339h g3 = b0.M.g();
        g3.e(C0352v.f5436d);
        ((Paint) g3.f5415b).setStrokeWidth(1.0f);
        g3.i(1);
        f8788O = g3;
    }

    public C1006t(E e3) {
        super(e3);
        p0 p0Var = new p0();
        p0Var.f4492g = 0;
        this.f8789M = p0Var;
        p0Var.f4496k = this;
        this.f8790N = e3.f8542f != null ? new C1005s(this) : null;
    }

    @Override // t0.b0
    public final void F0() {
        if (this.f8790N == null) {
            this.f8790N = new C1005s(this);
        }
    }

    @Override // t0.b0
    public final Q I0() {
        return this.f8790N;
    }

    @Override // t0.b0
    public final U.p K0() {
        return this.f8789M;
    }

    @Override // r0.InterfaceC0884F
    public final int O(int i3) {
        C1256t r3 = this.f8711o.r();
        InterfaceC0885G n3 = r3.n();
        E e3 = (E) r3.f10466e;
        return n3.e((b0) e3.f8561y.f2913d, e3.m(), i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // t0.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P0(C0991d c0991d, long j3, r rVar, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        int i3;
        r rVar2;
        Object[] objArr;
        boolean z7;
        r rVar3 = rVar;
        boolean z8 = false;
        boolean z9 = true;
        E e3 = this.f8711o;
        switch (c0991d.f8727d) {
            case 1:
                z5 = true;
                break;
            default:
                A0.i o3 = e3.o();
                z5 = !(o3 != null && o3.f131f);
                break;
        }
        if (z5) {
            if (h1(j3)) {
                z6 = z4;
            } else if (z3) {
                float B02 = B0(j3, J0());
                if (!Float.isInfinite(B02) && !Float.isNaN(B02)) {
                    z6 = false;
                }
            }
            z8 = true;
            if (z8) {
                return;
            }
            int i4 = rVar3.f8785f;
            K.d u3 = e3.u();
            int i5 = u3.f3216f;
            if (i5 > 0) {
                Object[] objArr2 = u3.f3214d;
                int i6 = i5 - 1;
                while (true) {
                    E e4 = (E) objArr2[i6];
                    if (e4.E()) {
                        switch (c0991d.f8727d) {
                            case 1:
                                objArr = objArr2;
                                i3 = i4;
                                z7 = z9;
                                rVar2 = rVar3;
                                e4.w(j3, rVar, z3, z6);
                                break;
                            default:
                                C0174t c0174t = e4.f8561y;
                                ((b0) c0174t.f2913d).O0(b0.f8705L, ((b0) c0174t.f2913d).H0(j3, z9), rVar, true, z6);
                                objArr = objArr2;
                                i3 = i4;
                                z7 = z9;
                                rVar2 = rVar3;
                                break;
                        }
                        long b3 = rVar.b();
                        if (Float.intBitsToFloat((int) (b3 >> 32)) < 0.0f && ((int) (b3 & 4294967295L)) != 0) {
                            if (rVar2.f8787h) {
                                rVar2.f8785f = rVar2.f8786g - (z7 ? 1 : 0);
                            }
                        }
                    } else {
                        objArr = objArr2;
                        i3 = i4;
                        z7 = z9;
                        rVar2 = rVar3;
                    }
                    i6--;
                    if (i6 >= 0) {
                        objArr2 = objArr;
                        i4 = i3;
                        z9 = z7;
                        rVar3 = rVar2;
                    }
                }
            } else {
                i3 = i4;
                rVar2 = rVar3;
            }
            rVar2.f8785f = i3;
            return;
        }
        z6 = z4;
        if (z8) {
        }
    }

    @Override // r0.InterfaceC0884F
    public final int U(int i3) {
        C1256t r3 = this.f8711o.r();
        InterfaceC0885G n3 = r3.n();
        E e3 = (E) r3.f10466e;
        return n3.h((b0) e3.f8561y.f2913d, e3.m(), i3);
    }

    @Override // r0.InterfaceC0884F
    public final int V(int i3) {
        C1256t r3 = this.f8711o.r();
        InterfaceC0885G n3 = r3.n();
        E e3 = (E) r3.f10466e;
        return n3.b((b0) e3.f8561y.f2913d, e3.m(), i3);
    }

    @Override // t0.b0
    public final void W0(b0.r rVar, C0416b c0416b) {
        E e3 = this.f8711o;
        h0 a3 = H.a(e3);
        K.d u3 = e3.u();
        int i3 = u3.f3216f;
        if (i3 > 0) {
            Object[] objArr = u3.f3214d;
            int i4 = 0;
            do {
                E e4 = (E) objArr[i4];
                if (e4.E()) {
                    e4.j(rVar, c0416b);
                }
                i4++;
            } while (i4 < i3);
        }
        if (((C1123s) a3).getShowLayoutBounds()) {
            D0(rVar, f8788O);
        }
    }

    @Override // r0.InterfaceC0884F
    public final AbstractC0893O b(long j3) {
        m0(j3);
        E e3 = this.f8711o;
        K.d v3 = e3.v();
        int i3 = v3.f3216f;
        if (i3 > 0) {
            Object[] objArr = v3.f3214d;
            int i4 = 0;
            do {
                ((E) objArr[i4]).f8562z.f8642r.f8610n = 3;
                i4++;
            } while (i4 < i3);
        }
        Z0(e3.f8554r.f(this, e3.m(), j3));
        U0();
        return this;
    }

    @Override // r0.InterfaceC0884F
    public final int c(int i3) {
        C1256t r3 = this.f8711o.r();
        InterfaceC0885G n3 = r3.n();
        E e3 = (E) r3.f10466e;
        return n3.a((b0) e3.f8561y.f2913d, e3.m(), i3);
    }

    @Override // r0.AbstractC0893O
    public final void f0(long j3, float f3, InterfaceC0424c interfaceC0424c) {
        X0(j3, f3, interfaceC0424c);
        if (this.f8653j) {
            return;
        }
        V0();
        this.f8711o.f8562z.f8642r.s0();
    }

    @Override // t0.P
    public final int n0(C0915l c0915l) {
        C1005s c1005s = this.f8790N;
        if (c1005s != null) {
            return c1005s.n0(c0915l);
        }
        K k3 = this.f8711o.f8562z.f8642r;
        boolean z3 = k3.f8611o;
        F f3 = k3.f8619w;
        if (!z3) {
            M m3 = k3.f8604I;
            if (m3.f8627c == 1) {
                f3.f8568f = true;
                if (f3.f8564b) {
                    m3.f8629e = true;
                    m3.f8630f = true;
                }
            } else {
                f3.f8569g = true;
            }
        }
        k3.Q().f8654k = true;
        k3.h();
        k3.Q().f8654k = false;
        Integer num = (Integer) f3.f8571i.get(c0915l);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
