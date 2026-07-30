package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ou0 extends zl0 implements ad0, gu {
    public mu0 s;
    public boolean t;
    public kd u;
    public ym v;
    public float w;

    public static boolean A0(long j) {
        return !va1.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean z0(long j) {
        return !va1.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // defpackage.gu
    public final void F(ld0 ld0Var) {
        zf zfVar = ld0Var.d;
        long c = this.s.c();
        long floatToRawIntBits = (Float.floatToRawIntBits(A0(c) ? Float.intBitsToFloat((int) (c >> 32)) : Float.intBitsToFloat((int) (zfVar.x() >> 32))) << 32) | (Float.floatToRawIntBits(z0(c) ? Float.intBitsToFloat((int) (c & 4294967295L)) : Float.intBitsToFloat((int) (zfVar.x() & 4294967295L))) & 4294967295L);
        long y = (Float.intBitsToFloat((int) (zfVar.x() >> 32)) == 0.0f || Float.intBitsToFloat((int) (zfVar.x() & 4294967295L)) == 0.0f) ? 0L : xa0.y(floatToRawIntBits, this.v.d(floatToRawIntBits, zfVar.x()));
        long a = this.u.a((Math.round(Float.intBitsToFloat((int) (y >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (y & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (zfVar.x() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (zfVar.x() & 4294967295L))) & 4294967295L), ld0Var.getLayoutDirection());
        float f = (int) (a >> 32);
        float f2 = (int) (a & 4294967295L);
        ((s40) zfVar.e.e).A(f, f2);
        try {
            this.s.b(ld0Var, y, this.w);
            ((s40) zfVar.e.e).A(-f, -f2);
            ld0Var.a();
        } catch (Throwable th) {
            ((s40) zfVar.e.e).A(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.ad0
    public final wk0 P(ej0 ej0Var, qk0 qk0Var, long j) {
        long a;
        boolean z = false;
        boolean z2 = mm.d(j) && mm.c(j);
        if (mm.f(j) && mm.e(j)) {
            z = true;
        }
        if (((!this.t || this.s.c() == 9205357640488583168L) && z2) || z) {
            a = mm.a(j, mm.h(j), 0, mm.g(j), 0, 10);
        } else {
            long c = this.s.c();
            int round = A0(c) ? Math.round(Float.intBitsToFloat((int) (c >> 32))) : mm.j(j);
            int round2 = z0(c) ? Math.round(Float.intBitsToFloat((int) (c & 4294967295L))) : mm.i(j);
            long floatToRawIntBits = (Float.floatToRawIntBits(nm.f(round, j)) << 32) | (Float.floatToRawIntBits(nm.e(round2, j)) & 4294967295L);
            if (this.t && this.s.c() != 9205357640488583168L) {
                long floatToRawIntBits2 = (Float.floatToRawIntBits(!A0(this.s.c()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.s.c() >> 32))) << 32) | (Float.floatToRawIntBits(!z0(this.s.c()) ? Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.s.c() & 4294967295L))) & 4294967295L);
                floatToRawIntBits = (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : xa0.y(floatToRawIntBits2, this.v.d(floatToRawIntBits2, floatToRawIntBits));
            }
            a = mm.a(j, nm.f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j), 0, nm.e(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j), 0, 10);
        }
        zw0 c2 = qk0Var.c(a);
        return xk0.q(ej0Var, c2.d, c2.e, new q3(c2, 1));
    }

    @Override // defpackage.zl0
    public final boolean o0() {
        return false;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.s + ", sizeToIntrinsics=" + this.t + ", alignment=" + this.u + ", alpha=" + this.w + ", colorFilter=null)";
    }
}
