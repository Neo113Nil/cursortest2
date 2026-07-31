package t;

import a0.z0;
import w1.f1;
import w1.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n extends y0.l implements w1.m, f1, s1 {

    /* renamed from: r, reason: collision with root package name */
    public long f6813r;

    /* renamed from: s, reason: collision with root package name */
    public f1.p f6814s;

    /* renamed from: t, reason: collision with root package name */
    public float f6815t;

    /* renamed from: u, reason: collision with root package name */
    public f1.i0 f6816u;

    /* renamed from: v, reason: collision with root package name */
    public long f6817v;

    /* renamed from: w, reason: collision with root package name */
    public r2.l f6818w;

    /* renamed from: x, reason: collision with root package name */
    public f1.p f6819x;

    /* renamed from: y, reason: collision with root package name */
    public f1.i0 f6820y;

    /* renamed from: z, reason: collision with root package name */
    public f1.p f6821z;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0188  */
    @Override // w1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(w1.h0 h0Var) {
        f1.p pVar;
        h1.f fVar;
        long j7;
        char c8;
        f1.p pVar2;
        f1.p pVar3;
        f1.p pVar4;
        h1.f fVar2;
        f1.j jVar;
        w1.h0 h0Var2;
        h1.b bVar = h0Var.f7680d;
        if (this.f6816u == f1.p.f2693a) {
            if (!f1.s.c(this.f6813r, f1.s.f2704h)) {
                h1.d.r(h0Var, this.f6813r, 0L, 0L, 126);
            }
            f1.p pVar5 = this.f6814s;
            if (pVar5 != null) {
                h1.d.j(h0Var, pVar5, 0L, 0L, this.f6815t, null, 118);
            }
        } else {
            if (e1.e.a(bVar.c(), this.f6817v) && h0Var.getLayoutDirection() == this.f6818w && q6.i.a(this.f6820y, this.f6816u)) {
                pVar = this.f6819x;
                q6.i.b(pVar);
            } else {
                w1.f.r(this, new z0(8, this, h0Var));
                pVar = this.f6821z;
                this.f6821z = null;
            }
            f1.p pVar6 = pVar;
            this.f6819x = pVar6;
            this.f6817v = bVar.c();
            this.f6818w = h0Var.getLayoutDirection();
            this.f6820y = this.f6816u;
            q6.i.b(pVar6);
            boolean c9 = f1.s.c(this.f6813r, f1.s.f2704h);
            h1.f fVar3 = h1.f.f3080b;
            if (c9) {
                fVar = fVar3;
            } else {
                long j8 = this.f6813r;
                if (pVar6 instanceof f1.d0) {
                    e1.c cVar = ((f1.d0) pVar6).f2632e;
                    float f6 = cVar.f2457a;
                    float f8 = cVar.f2458b;
                    fVar = fVar3;
                    h0Var.Y(j8, (Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32), f1.p.q(cVar), fVar, 3);
                } else {
                    fVar = fVar3;
                    if (pVar6 instanceof f1.e0) {
                        f1.e0 e0Var = (f1.e0) pVar6;
                        f1.j jVar2 = e0Var.f2636f;
                        if (jVar2 != null) {
                            h0Var.e(jVar2, j8, fVar);
                        } else {
                            e1.d dVar = e0Var.f2635e;
                            float intBitsToFloat = Float.intBitsToFloat((int) (dVar.f2468h >> 32));
                            float f9 = dVar.f2461a;
                            float f10 = dVar.f2462b;
                            j7 = 4294967295L;
                            long floatToRawIntBits = (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32);
                            float b8 = dVar.b();
                            float a8 = dVar.a();
                            long floatToRawIntBits2 = Float.floatToRawIntBits(b8);
                            c8 = ' ';
                            pVar2 = pVar6;
                            long floatToRawIntBits3 = (Float.floatToRawIntBits(a8) & 4294967295L) | (floatToRawIntBits2 << 32);
                            long floatToRawIntBits4 = (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                            int i = (int) (floatToRawIntBits >> 32);
                            int i8 = (int) (floatToRawIntBits & 4294967295L);
                            bVar.f3074d.f3072c.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (floatToRawIntBits3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (floatToRawIntBits3 & 4294967295L)) + Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (floatToRawIntBits4 >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits4 & 4294967295L)), h1.b.a(bVar, j8, fVar, 3));
                        }
                    } else {
                        pVar2 = pVar6;
                        c8 = ' ';
                        j7 = 4294967295L;
                        if (!(pVar2 instanceof f1.c0)) {
                            throw new a5.c();
                        }
                        h0Var.e(((f1.c0) pVar2).f2630e, j8, fVar);
                    }
                    pVar3 = this.f6814s;
                    if (pVar3 != null) {
                        float f11 = this.f6815t;
                        if (pVar2 instanceof f1.d0) {
                            e1.c cVar2 = ((f1.d0) pVar2).f2632e;
                            float f12 = cVar2.f2457a;
                            float f13 = cVar2.f2458b;
                            h0Var.f(pVar3, (Float.floatToRawIntBits(f13) & j7) | (Float.floatToRawIntBits(f12) << c8), f1.p.q(cVar2), f11, fVar);
                        } else {
                            if (pVar2 instanceof f1.e0) {
                                f1.e0 e0Var2 = (f1.e0) pVar2;
                                pVar4 = pVar3;
                                jVar = e0Var2.f2636f;
                                if (jVar != null) {
                                    h0Var2 = h0Var;
                                    fVar2 = fVar;
                                } else {
                                    e1.d dVar2 = e0Var2.f2635e;
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar2.f2468h >> c8));
                                    float f14 = dVar2.f2461a;
                                    float f15 = dVar2.f2462b;
                                    long floatToRawIntBits5 = (Float.floatToRawIntBits(f15) & j7) | (Float.floatToRawIntBits(f14) << c8);
                                    float b9 = dVar2.b();
                                    float a9 = dVar2.a();
                                    h0Var.g(pVar4, floatToRawIntBits5, (Float.floatToRawIntBits(b9) << c8) | (Float.floatToRawIntBits(a9) & j7), (Float.floatToRawIntBits(intBitsToFloat2) << c8) | (Float.floatToRawIntBits(intBitsToFloat2) & j7), f11, fVar);
                                }
                            } else {
                                if (!(pVar2 instanceof f1.c0)) {
                                    throw new a5.c();
                                }
                                pVar4 = pVar3;
                                fVar2 = fVar;
                                jVar = ((f1.c0) pVar2).f2630e;
                                h0Var2 = h0Var;
                            }
                            h0Var2.I(jVar, pVar4, f11, fVar2, 3);
                        }
                    }
                }
            }
            pVar2 = pVar6;
            c8 = ' ';
            j7 = 4294967295L;
            pVar3 = this.f6814s;
            if (pVar3 != null) {
            }
        }
        h0Var.a();
    }

    @Override // w1.f1
    public final void F() {
        this.f6817v = 9205357640488583168L;
        this.f6818w = null;
        this.f6819x = null;
        this.f6820y = null;
        w1.f.l(this);
    }

    @Override // w1.s1
    public final boolean f() {
        return false;
    }

    @Override // w1.s1
    public final void q(d2.j jVar) {
    }
}
