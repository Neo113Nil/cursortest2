package c1;

import l1.a0;
import u1.d0;
import u1.f0;
import u1.h0;
import u1.l0;
import u1.s0;
import w1.m;
import w1.n0;
import w1.v;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h extends l implements v, m {

    /* renamed from: r, reason: collision with root package name */
    public a0 f1569r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1570s;

    /* renamed from: t, reason: collision with root package name */
    public y0.e f1571t;

    /* renamed from: u, reason: collision with root package name */
    public h0 f1572u;

    /* renamed from: v, reason: collision with root package name */
    public float f1573v;

    /* renamed from: w, reason: collision with root package name */
    public f1.m f1574w;

    public static boolean r0(long j7) {
        return !e1.e.a(j7, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean s0(long j7) {
        return !e1.e.a(j7, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // w1.m
    public final void A(w1.h0 h0Var) {
        h1.b bVar = h0Var.f7680d;
        long b8 = this.f1569r.b();
        long floatToRawIntBits = (Float.floatToRawIntBits(s0(b8) ? Float.intBitsToFloat((int) (b8 >> 32)) : Float.intBitsToFloat((int) (bVar.c() >> 32))) << 32) | (Float.floatToRawIntBits(r0(b8) ? Float.intBitsToFloat((int) (b8 & 4294967295L)) : Float.intBitsToFloat((int) (bVar.c() & 4294967295L))) & 4294967295L);
        long i = (Float.intBitsToFloat((int) (bVar.c() >> 32)) == 0.0f || Float.intBitsToFloat((int) (bVar.c() & 4294967295L)) == 0.0f) ? 0L : s0.i(floatToRawIntBits, this.f1572u.a(floatToRawIntBits, bVar.c()));
        long a8 = this.f1571t.a((Math.round(Float.intBitsToFloat((int) (i >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (i & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (bVar.c() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (bVar.c() & 4294967295L))) & 4294967295L), h0Var.getLayoutDirection());
        float f6 = (int) (a8 >> 32);
        float f8 = (int) (a8 & 4294967295L);
        ((b1.b) bVar.f3075e.f84b).x(f6, f8);
        try {
            this.f1569r.a(h0Var, i, this.f1573v, this.f1574w);
            ((b1.b) bVar.f3075e.f84b).x(-f6, -f8);
            h0Var.a();
        } catch (Throwable th) {
            ((b1.b) bVar.f3075e.f84b).x(-f6, -f8);
            throw th;
        }
    }

    @Override // w1.v
    public final f0 e(n0 n0Var, d0 d0Var, long j7) {
        long a8;
        boolean z3 = false;
        boolean z7 = r2.a.d(j7) && r2.a.c(j7);
        if (r2.a.f(j7) && r2.a.e(j7)) {
            z3 = true;
        }
        if (((!this.f1570s || this.f1569r.b() == 9205357640488583168L) && z7) || z3) {
            a8 = r2.a.a(j7, r2.a.h(j7), 0, r2.a.g(j7), 0, 10);
        } else {
            long b8 = this.f1569r.b();
            int round = s0(b8) ? Math.round(Float.intBitsToFloat((int) (b8 >> 32))) : r2.a.j(j7);
            int round2 = r0(b8) ? Math.round(Float.intBitsToFloat((int) (b8 & 4294967295L))) : r2.a.i(j7);
            long floatToRawIntBits = (Float.floatToRawIntBits(r2.b.f(round, j7)) << 32) | (Float.floatToRawIntBits(r2.b.e(round2, j7)) & 4294967295L);
            if (this.f1570s && this.f1569r.b() != 9205357640488583168L) {
                float intBitsToFloat = !s0(this.f1569r.b()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f1569r.b() >> 32));
                float intBitsToFloat2 = !r0(this.f1569r.b()) ? Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f1569r.b() & 4294967295L));
                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                floatToRawIntBits = (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : s0.i(floatToRawIntBits2, this.f1572u.a(floatToRawIntBits2, floatToRawIntBits));
            }
            a8 = r2.a.a(j7, r2.b.f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j7), 0, r2.b.e(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j7), 0, 10);
        }
        l0 e8 = d0Var.e(a8);
        return n0Var.e0(e8.f7230d, e8.f7231e, d6.v.f2327d, new g(e8, 0));
    }

    @Override // y0.l
    public final boolean g0() {
        return false;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f1569r + ", sizeToIntrinsics=" + this.f1570s + ", alignment=" + this.f1571t + ", alpha=" + this.f1573v + ", colorFilter=" + this.f1574w + ')';
    }
}
