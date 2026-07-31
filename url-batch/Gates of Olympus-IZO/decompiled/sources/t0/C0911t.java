package t0;

import I.C0120t;
import android.graphics.Paint;
import b0.AbstractC0259J;
import b0.C0276i;
import b0.C0288u;
import b0.InterfaceC0285r;
import e0.C0336b;
import r0.C0837j;
import u0.C0997t;

/* renamed from: t0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0911t extends a0 {

    /* renamed from: N, reason: collision with root package name */
    public static final C0276i f7954N;

    /* renamed from: L, reason: collision with root package name */
    public final o0 f7955L;

    /* renamed from: M, reason: collision with root package name */
    public C0910s f7956M;

    static {
        C0276i f3 = AbstractC0259J.f();
        f3.e(C0288u.f4293c);
        ((Paint) f3.f4273b).setStrokeWidth(1.0f);
        f3.j(1);
        f7954N = f3;
    }

    public C0911t(D d3) {
        super(d3);
        o0 o0Var = new o0();
        o0Var.f3306g = 0;
        this.f7955L = o0Var;
        o0Var.f3310k = this;
        this.f7956M = d3.f7718f != null ? new C0910s(this) : null;
    }

    @Override // t0.a0
    public final U.k B0() {
        return this.f7955L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // t0.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G0(C0896d c0896d, long j3, r rVar, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        int i3;
        r rVar2;
        Object[] objArr;
        boolean z7;
        r rVar3 = rVar;
        boolean z8 = false;
        boolean z9 = true;
        D d3 = this.f7877o;
        switch (c0896d.f7894d) {
            case 1:
                z5 = true;
                break;
            default:
                z0.i n3 = d3.n();
                z5 = !(n3 != null && n3.f8984f);
                break;
        }
        if (z5) {
            if (W0(j3)) {
                z6 = z4;
            } else if (z3) {
                float s02 = s0(j3, A0());
                if (!Float.isInfinite(s02) && !Float.isNaN(s02)) {
                    z6 = false;
                }
            }
            z8 = true;
            if (z8) {
                return;
            }
            int i4 = rVar3.f7951f;
            K.d s3 = d3.s();
            int i5 = s3.f2642f;
            if (i5 > 0) {
                Object[] objArr2 = s3.f2640d;
                int i6 = i5 - 1;
                while (true) {
                    D d4 = (D) objArr2[i6];
                    if (d4.C()) {
                        switch (c0896d.f7894d) {
                            case 1:
                                objArr = objArr2;
                                i3 = i4;
                                z7 = z9;
                                rVar2 = rVar3;
                                d4.u(j3, rVar, z3, z6);
                                break;
                            default:
                                C0120t c0120t = d4.f7735x;
                                ((a0) c0120t.f2354d).F0(a0.f7872K, ((a0) c0120t.f2354d).y0(j3, z9), rVar, true, z6);
                                objArr = objArr2;
                                i3 = i4;
                                z7 = z9;
                                rVar2 = rVar3;
                                break;
                        }
                        long b2 = rVar.b();
                        if (Float.intBitsToFloat((int) (b2 >> 32)) < 0.0f && ((int) (b2 & 4294967295L)) != 0) {
                            if (rVar2.f7953h) {
                                rVar2.f7951f = rVar2.f7952g - (z7 ? 1 : 0);
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
            rVar2.f7951f = i3;
            return;
        }
        z6 = z4;
        if (z8) {
        }
    }

    @Override // t0.a0
    public final void O0(InterfaceC0285r interfaceC0285r, C0336b c0336b) {
        D d3 = this.f7877o;
        g0 a3 = G.a(d3);
        K.d s3 = d3.s();
        int i3 = s3.f2642f;
        if (i3 > 0) {
            Object[] objArr = s3.f2640d;
            int i4 = 0;
            do {
                D d4 = (D) objArr[i4];
                if (d4.C()) {
                    d4.j(interfaceC0285r, c0336b);
                }
                i4++;
            } while (i4 < i3);
        }
        if (((C0997t) a3).getShowLayoutBounds()) {
            u0(interfaceC0285r, f7954N);
        }
    }

    @Override // r0.H
    public final void Q(long j3, float f3, Y1.c cVar) {
        P0(j3, f3, cVar);
        if (this.f7824j) {
            return;
        }
        N0();
        this.f7877o.f7736y.f7813r.f0();
    }

    @Override // t0.O
    public final int W(C0837j c0837j) {
        C0910s c0910s = this.f7956M;
        if (c0910s != null) {
            return c0910s.W(c0837j);
        }
        J j3 = this.f7877o.f7736y.f7813r;
        boolean z3 = j3.f7784o;
        E e3 = j3.f7791w;
        if (!z3) {
            L l3 = j3.f7777I;
            if (l3.f7799c == 1) {
                e3.f7743f = true;
                if (e3.f7739b) {
                    l3.f7801e = true;
                    l3.f7802f = true;
                }
            } else {
                e3.f7744g = true;
            }
        }
        j3.A().f7825k = true;
        j3.e();
        j3.A().f7825k = false;
        Integer num = (Integer) e3.f7746i.get(c0837j);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // r0.z
    public final r0.H b(long j3) {
        U(j3);
        D d3 = this.f7877o;
        K.d t3 = d3.t();
        int i3 = t3.f2642f;
        if (i3 > 0) {
            Object[] objArr = t3.f2640d;
            int i4 = 0;
            do {
                ((D) objArr[i4]).f7736y.f7813r.f7783n = 3;
                i4++;
            } while (i4 < i3);
        }
        R0(d3.f7729r.f(this, d3.f7736y.f7813r.W(), j3));
        M0();
        return this;
    }

    @Override // t0.a0
    public final void w0() {
        if (this.f7956M == null) {
            this.f7956M = new C0910s(this);
        }
    }

    @Override // t0.a0
    public final P z0() {
        return this.f7956M;
    }
}
