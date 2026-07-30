package defpackage;

import android.view.ViewParent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class n50 implements du0 {
    public l50 d;
    public final k50 e;
    public final d4 g;
    public Function2 h;
    public Function0 i;
    public boolean k;
    public float[] m;
    public boolean n;
    public int r;
    public ka0 t;
    public boolean u;
    public boolean v;
    public boolean x;
    public long j = 9223372034707292159L;
    public final float[] l = y90.m();
    public nr o = la0.i();
    public vc0 p = vc0.d;
    public final zf q = new zf();
    public long s = aj1.a;
    public boolean w = true;
    public final a3 y = new a3(14, this);

    public n50(l50 l50Var, k50 k50Var, d4 d4Var, Function2 function2, Function0 function0) {
        this.d = l50Var;
        this.e = k50Var;
        this.g = d4Var;
        this.h = function2;
        this.i = function0;
    }

    public final float[] a() {
        float[] fArr = this.m;
        if (fArr == null) {
            fArr = y90.m();
            this.m = fArr;
        }
        if (this.v) {
            this.v = false;
            float[] b = b();
            if (this.w) {
                return b;
            }
            if (!xa0.q(b, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    public final float[] b() {
        boolean z = this.u;
        float[] fArr = this.l;
        if (z) {
            l50 l50Var = this.d;
            long j = l50Var.v;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = t90.q(ca0.x(this.j));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            p50 p50Var = l50Var.a;
            float f = p50Var.j;
            float f2 = p50Var.k;
            float sin = (float) Math.sin(0.0d);
            float cos = (float) Math.cos(0.0d);
            float f3 = -sin;
            float f4 = 0.0f * cos;
            float f5 = 0.0f * sin;
            float f6 = f4 - f5;
            float f7 = f4 + f5;
            float sin2 = (float) Math.sin(0.0d);
            float cos2 = (float) Math.cos(0.0d);
            float f8 = -sin2;
            float f9 = sin * sin2;
            float f10 = sin * cos2;
            float f11 = cos * sin2;
            float f12 = cos * cos2;
            float f13 = (f7 * sin2) + (0.0f * cos2);
            float f14 = (f7 * cos2) + ((-0.0f) * sin2);
            float sin3 = (float) Math.sin(0.0d);
            float cos3 = (float) Math.cos(0.0d);
            float f15 = -sin3;
            float f16 = (cos3 * f9) + (f15 * cos2);
            float f17 = (f9 * sin3) + (cos2 * cos3);
            float f18 = sin3 * cos;
            float f19 = f17 * f;
            float f20 = f18 * f;
            float f21 = ((sin3 * f10) + (cos3 * f8)) * f;
            float f22 = f16 * f2;
            float f23 = cos * cos3 * f2;
            float f24 = ((cos3 * f10) + (f15 * f8)) * f2;
            float f25 = f11 * 1.0f;
            float f26 = f3 * 1.0f;
            float f27 = f12 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f19;
                fArr[1] = f20;
                fArr[2] = f21;
                fArr[3] = 0.0f;
                fArr[4] = f22;
                fArr[5] = f23;
                fArr[6] = f24;
                fArr[7] = 0.0f;
                fArr[8] = f25;
                fArr[9] = f26;
                fArr[10] = f27;
                fArr[11] = 0.0f;
                float f28 = -intBitsToFloat;
                fArr[12] = ((f19 * f28) - (f22 * intBitsToFloat2)) + f13 + intBitsToFloat;
                fArr[13] = ((f20 * f28) - (f23 * intBitsToFloat2)) + f6 + intBitsToFloat2;
                fArr[14] = ((f28 * f21) - (intBitsToFloat2 * f24)) + f14;
                fArr[15] = 1.0f;
            }
            this.u = false;
            this.w = ca0.q(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.n || this.k) {
            return;
        }
        this.g.invalidate();
        f(true);
    }

    public final void d(long j) {
        d4 d4Var = this.g;
        if (d4Var.p) {
            d4Var.K(-4.0f);
        }
        l50 l50Var = this.d;
        if (!s90.a(l50Var.t, j)) {
            l50Var.t = j;
            l50Var.g(j, l50Var.u);
        }
        ViewParent parent = d4Var.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(d4Var, d4Var);
        }
    }

    public final void e(long j) {
        if (ba0.a(j, this.j)) {
            return;
        }
        d4 d4Var = this.g;
        if (d4Var.p) {
            d4Var.K(-4.0f);
        }
        this.j = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.n) {
            this.n = z;
            d4 d4Var = this.g;
            mn0 mn0Var = d4Var.H;
            boolean z2 = d4Var.J;
            if (!z) {
                if (z2) {
                    return;
                }
                mn0Var.j(this);
                mn0 mn0Var2 = d4Var.I;
                if (mn0Var2 != null) {
                    mn0Var2.j(this);
                    return;
                }
                return;
            }
            if (!z2) {
                mn0Var.a(this);
                return;
            }
            mn0 mn0Var3 = d4Var.I;
            if (mn0Var3 == null) {
                mn0Var3 = new mn0();
                d4Var.I = mn0Var3;
            }
            mn0Var3.a(this);
        }
    }

    public final void g() {
        if (this.n) {
            if (this.s != aj1.a && !ba0.a(this.d.u, this.j)) {
                l50 l50Var = this.d;
                float intBitsToFloat = Float.intBitsToFloat((int) (this.s >> 32)) * ((int) (this.j >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (this.s & 4294967295L)) * ((int) (this.j & 4294967295L));
                l50Var.f((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
            }
            l50 l50Var2 = this.d;
            nr nrVar = this.o;
            vc0 vc0Var = this.p;
            long j = this.j;
            if (!ba0.a(l50Var2.u, j)) {
                l50Var2.u = j;
                l50Var2.g(l50Var2.t, j);
                if (l50Var2.i == 9205357640488583168L) {
                    l50Var2.g = true;
                    l50Var2.a();
                }
            }
            l50Var2.b = nrVar;
            l50Var2.c = vc0Var;
            l50Var2.d = this.y;
            l50Var2.e();
            f(false);
        }
    }
}
