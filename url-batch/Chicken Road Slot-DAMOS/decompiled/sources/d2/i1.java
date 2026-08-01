package d2;

import android.os.Build;
import android.view.ViewParent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i1 implements c2.o1 {
    public int B;
    public k1.v D;
    public boolean E;
    public boolean F;

    /* renamed from: d, reason: collision with root package name */
    public n1.b f3431d;

    /* renamed from: e, reason: collision with root package name */
    public final k1.t f3432e;

    /* renamed from: i, reason: collision with root package name */
    public final v f3433i;

    /* renamed from: r, reason: collision with root package name */
    public Function2 f3434r;

    /* renamed from: s, reason: collision with root package name */
    public Function0 f3435s;

    /* renamed from: t, reason: collision with root package name */
    public long f3436t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3437u;

    /* renamed from: w, reason: collision with root package name */
    public float[] f3439w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3440x;

    /* renamed from: v, reason: collision with root package name */
    public final float[] f3438v = k1.v.g();

    /* renamed from: y, reason: collision with root package name */
    public x2.c f3441y = z4.w.a();

    /* renamed from: z, reason: collision with root package name */
    public x2.l f3442z = x2.l.f10330d;
    public final m1.b A = new m1.b();
    public long C = k1.i0.f5326b;
    public boolean G = true;
    public final a3.e H = new a3.e(10, this);

    public i1(n1.b bVar, k1.t tVar, v vVar, Function2 function2, Function0 function0) {
        this.f3431d = bVar;
        this.f3432e = tVar;
        this.f3433i = vVar;
        this.f3434r = function2;
        this.f3435s = function0;
        long j = Integer.MAX_VALUE;
        this.f3436t = (j & 4294967295L) | (j << 32);
    }

    public final float[] a() {
        float[] fArr = this.f3439w;
        if (fArr == null) {
            fArr = k1.v.g();
            this.f3439w = fArr;
        }
        if (this.F) {
            this.F = false;
            float[] b10 = b();
            if (this.G) {
                return b10;
            }
            if (!h0.o(b10, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    public final float[] b() {
        boolean z10 = this.E;
        float[] fArr = this.f3438v;
        if (z10) {
            n1.b bVar = this.f3431d;
            long j = bVar.f6919v;
            n1.d dVar = bVar.f6900a;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = i7.a.N(z4.m.b(this.f3436t));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float r9 = dVar.r();
            float f3 = dVar.f();
            float w6 = dVar.w();
            float E = dVar.E();
            float J = dVar.J();
            float d10 = dVar.d();
            float I = dVar.I();
            double d11 = w6 * 0.017453292519943295d;
            float sin = (float) Math.sin(d11);
            float cos = (float) Math.cos(d11);
            float f10 = -sin;
            float f11 = (f3 * cos) - (0.0f * sin);
            float f12 = (0.0f * cos) + (f3 * sin);
            double d12 = E * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d12);
            float cos2 = (float) Math.cos(d12);
            float f13 = -sin2;
            float f14 = sin * sin2;
            float f15 = sin * cos2;
            float f16 = cos * sin2;
            float f17 = cos * cos2;
            float f18 = (f12 * sin2) + (r9 * cos2);
            float f19 = (f12 * cos2) + ((-r9) * sin2);
            double d13 = J * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d13);
            float cos3 = (float) Math.cos(d13);
            float f20 = -sin3;
            float f21 = (cos3 * f14) + (f20 * cos2);
            float f22 = ((f14 * sin3) + (cos2 * cos3)) * d10;
            float f23 = sin3 * cos * d10;
            float f24 = ((sin3 * f15) + (cos3 * f13)) * d10;
            float f25 = f21 * I;
            float f26 = cos * cos3 * I;
            float f27 = ((cos3 * f15) + (f20 * f13)) * I;
            float f28 = f16 * 1.0f;
            float f29 = f10 * 1.0f;
            float f30 = f17 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f22;
                fArr[1] = f23;
                fArr[2] = f24;
                fArr[3] = 0.0f;
                fArr[4] = f25;
                fArr[5] = f26;
                fArr[6] = f27;
                fArr[7] = 0.0f;
                fArr[8] = f28;
                fArr[9] = f29;
                fArr[10] = f30;
                fArr[11] = 0.0f;
                float f31 = -intBitsToFloat;
                fArr[12] = ((f22 * f31) - (intBitsToFloat2 * f25)) + f18 + intBitsToFloat;
                fArr[13] = ((f23 * f31) - (intBitsToFloat2 * f26)) + f11 + intBitsToFloat2;
                fArr[14] = ((f31 * f24) - (intBitsToFloat2 * f27)) + f19;
                fArr[15] = 1.0f;
            }
            this.E = false;
            this.G = k1.v.l(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.f3440x || this.f3437u) {
            return;
        }
        this.f3433i.invalidate();
        f(true);
    }

    public final void d(long j) {
        boolean r9 = v.r();
        v vVar = this.f3433i;
        if (r9) {
            vVar.M(-4.0f);
        }
        n1.b bVar = this.f3431d;
        if (!x2.i.a(bVar.f6917t, j)) {
            bVar.f6917t = j;
            bVar.f6900a.D((int) (j >> 32), (int) (j & 4294967295L), bVar.f6918u);
        }
        if (Build.VERSION.SDK_INT < 26) {
            vVar.invalidate();
            return;
        }
        ViewParent parent = vVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(vVar, vVar);
        }
    }

    public final void e(long j) {
        if (x2.k.a(j, this.f3436t)) {
            return;
        }
        if (v.r()) {
            this.f3433i.M(-4.0f);
        }
        this.f3436t = j;
        c();
    }

    public final void f(boolean z10) {
        if (z10 != this.f3440x) {
            this.f3440x = z10;
            v vVar = this.f3433i;
            s.d0 d0Var = vVar.R;
            boolean z11 = vVar.T;
            if (!z10) {
                if (z11) {
                    return;
                }
                d0Var.j(this);
                s.d0 d0Var2 = vVar.S;
                if (d0Var2 != null) {
                    d0Var2.j(this);
                    return;
                }
                return;
            }
            if (!z11) {
                d0Var.a(this);
                return;
            }
            s.d0 d0Var3 = vVar.S;
            if (d0Var3 == null) {
                d0Var3 = new s.d0();
                vVar.S = d0Var3;
            }
            d0Var3.a(this);
        }
    }

    public final void g() {
        v.r();
        if (this.f3440x) {
            if (!k1.i0.a(this.C, k1.i0.f5326b) && !x2.k.a(this.f3431d.f6918u, this.f3436t)) {
                n1.b bVar = this.f3431d;
                float intBitsToFloat = Float.intBitsToFloat((int) (this.C >> 32)) * ((int) (this.f3436t >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (this.C & 4294967295L)) * ((int) (this.f3436t & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                if (!j1.b.a(bVar.f6919v, floatToRawIntBits)) {
                    bVar.f6919v = floatToRawIntBits;
                    bVar.f6900a.L(floatToRawIntBits);
                }
            }
            n1.b bVar2 = this.f3431d;
            x2.c cVar = this.f3441y;
            x2.l lVar = this.f3442z;
            long j = this.f3436t;
            long j3 = bVar2.f6918u;
            n1.d dVar = bVar2.f6900a;
            if (!x2.k.a(j3, j)) {
                bVar2.f6918u = j;
                long j10 = bVar2.f6917t;
                dVar.D((int) (j10 >> 32), (int) (4294967295L & j10), j);
                if (bVar2.f6907i == 9205357640488583168L) {
                    bVar2.g = true;
                    bVar2.a();
                }
            }
            bVar2.f6901b = cVar;
            bVar2.f6902c = lVar;
            bVar2.f6903d = this.H;
            dVar.s(cVar, lVar, bVar2, bVar2.f6904e);
            f(false);
        }
    }
}
