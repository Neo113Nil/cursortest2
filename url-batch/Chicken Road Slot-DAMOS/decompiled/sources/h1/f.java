package h1;

import a1.n;
import a2.f0;
import a2.g;
import a2.h0;
import a2.q;
import a2.r0;
import c2.i0;
import c2.l;
import c2.o0;
import c2.v;
import d1.k;
import k1.j;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends k implements v, l {
    public p1.b C;
    public boolean D;
    public d1.d E;
    public g F;
    public float G;
    public j H;

    public static boolean I(long j) {
        return !j1.e.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean J(long j) {
        return !j1.e.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // c2.l
    public final void f(i0 i0Var) {
        m1.b bVar = i0Var.f1585d;
        long d10 = this.C.d();
        long floatToRawIntBits = (Float.floatToRawIntBits(J(d10) ? Float.intBitsToFloat((int) (d10 >> 32)) : Float.intBitsToFloat((int) (bVar.u() >> 32))) << 32) | (Float.floatToRawIntBits(I(d10) ? Float.intBitsToFloat((int) (d10 & 4294967295L)) : Float.intBitsToFloat((int) (bVar.u() & 4294967295L))) & 4294967295L);
        long l10 = (Float.intBitsToFloat((int) (bVar.u() >> 32)) == 0.0f || Float.intBitsToFloat((int) (bVar.u() & 4294967295L)) == 0.0f) ? 0L : q.l(floatToRawIntBits, this.F.a(floatToRawIntBits, bVar.u()));
        long a9 = this.E.a((Math.round(Float.intBitsToFloat((int) (l10 >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (l10 & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (bVar.u() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (bVar.u() & 4294967295L))) & 4294967295L), i0Var.getLayoutDirection());
        float f3 = (int) (a9 >> 32);
        float f10 = (int) (a9 & 4294967295L);
        ((n) ((l.d) bVar.f6406e.f41i).f5643e).p().e(f3, f10);
        try {
            this.C.c(i0Var, l10, this.G, this.H);
            ((n) ((l.d) bVar.f6406e.f41i).f5643e).p().e(-f3, -f10);
            i0Var.a();
        } catch (Throwable th) {
            ((n) ((l.d) bVar.f6406e.f41i).f5643e).p().e(-f3, -f10);
            throw th;
        }
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.C + ", sizeToIntrinsics=" + this.D + ", alignment=" + this.E + ", alpha=" + this.G + ", colorFilter=" + this.H + ')';
    }

    @Override // c2.v
    public final h0 v(o0 o0Var, f0 f0Var, long j) {
        long a9;
        boolean z10 = false;
        boolean z11 = x2.a.d(j) && x2.a.c(j);
        if (x2.a.f(j) && x2.a.e(j)) {
            z10 = true;
        }
        if (((!this.D || this.C.d() == 9205357640488583168L) && z11) || z10) {
            a9 = x2.a.a(x2.a.h(j), x2.a.g(j), j);
        } else {
            long d10 = this.C.d();
            int round = J(d10) ? Math.round(Float.intBitsToFloat((int) (d10 >> 32))) : x2.a.j(j);
            int round2 = I(d10) ? Math.round(Float.intBitsToFloat((int) (d10 & 4294967295L))) : x2.a.i(j);
            long floatToRawIntBits = (Float.floatToRawIntBits(x2.b.f(round, j)) << 32) | (Float.floatToRawIntBits(x2.b.e(round2, j)) & 4294967295L);
            if (this.D && this.C.d() != 9205357640488583168L) {
                float intBitsToFloat = !J(this.C.d()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.C.d() >> 32));
                float intBitsToFloat2 = !I(this.C.d()) ? Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.C.d() & 4294967295L));
                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                floatToRawIntBits = (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : q.l(floatToRawIntBits2, this.F.a(floatToRawIntBits2, floatToRawIntBits));
            }
            a9 = x2.a.a(x2.b.f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j), x2.b.e(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j), j);
        }
        a2.o0 c10 = f0Var.c(a9);
        return a2.i0.V(o0Var, c10.f131d, c10.f132e, new r0(c10, 2));
    }

    @Override // d1.k
    public final boolean x() {
        return false;
    }
}
