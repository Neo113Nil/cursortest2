package x1;

import android.os.Build;
import android.view.ViewParent;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j1 implements w1.j1 {

    /* renamed from: d, reason: collision with root package name */
    public i1.b f8465d;

    /* renamed from: e, reason: collision with root package name */
    public final f1.x f8466e;

    /* renamed from: f, reason: collision with root package name */
    public final t f8467f;

    /* renamed from: g, reason: collision with root package name */
    public p6.e f8468g;

    /* renamed from: h, reason: collision with root package name */
    public p6.a f8469h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8470j;

    /* renamed from: l, reason: collision with root package name */
    public float[] f8472l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8473m;

    /* renamed from: q, reason: collision with root package name */
    public int f8477q;

    /* renamed from: s, reason: collision with root package name */
    public f1.p f8479s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8480t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8481u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8483w;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f8471k = f1.p.i();

    /* renamed from: n, reason: collision with root package name */
    public r2.c f8474n = h0.a.b();

    /* renamed from: o, reason: collision with root package name */
    public r2.l f8475o = r2.l.f6529d;

    /* renamed from: p, reason: collision with root package name */
    public final h1.b f8476p = new h1.b();

    /* renamed from: r, reason: collision with root package name */
    public long f8478r = f1.l0.f2683b;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8482v = true;

    /* renamed from: x, reason: collision with root package name */
    public final b1.e f8484x = new b1.e(19, this);

    public j1(i1.b bVar, f1.x xVar, t tVar, p6.e eVar, p6.a aVar) {
        this.f8465d = bVar;
        this.f8466e = xVar;
        this.f8467f = tVar;
        this.f8468g = eVar;
        this.f8469h = aVar;
        long j7 = Integer.MAX_VALUE;
        this.i = (j7 & 4294967295L) | (j7 << 32);
    }

    public final float[] a() {
        float[] fArr = this.f8472l;
        if (fArr == null) {
            fArr = f1.p.i();
            this.f8472l = fArr;
        }
        if (this.f8481u) {
            this.f8481u = false;
            float[] b8 = b();
            if (this.f8482v) {
                return b8;
            }
            if (!g0.n(b8, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    public final float[] b() {
        boolean z3 = this.f8480t;
        float[] fArr = this.f8471k;
        if (z3) {
            i1.b bVar = this.f8465d;
            long j7 = bVar.f3314v;
            i1.d dVar = bVar.f3294a;
            if ((9223372034707292159L & j7) == 9205357640488583168L) {
                j7 = a.a.k(m.a.R(this.i));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
            float r7 = dVar.r();
            float g3 = dVar.g();
            float v7 = dVar.v();
            float D = dVar.D();
            float J = dVar.J();
            float e8 = dVar.e();
            float I = dVar.I();
            double d8 = v7 * 0.017453292519943295d;
            float sin = (float) Math.sin(d8);
            float cos = (float) Math.cos(d8);
            float f6 = -sin;
            float f8 = (g3 * cos) - (1.0f * sin);
            float f9 = (1.0f * cos) + (g3 * sin);
            double d9 = D * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d9);
            float cos2 = (float) Math.cos(d9);
            float f10 = -sin2;
            float f11 = sin * sin2;
            float f12 = sin * cos2;
            float f13 = cos * sin2;
            float f14 = cos * cos2;
            float f15 = (f9 * sin2) + (r7 * cos2);
            float f16 = (f9 * cos2) + ((-r7) * sin2);
            double d10 = J * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d10);
            float cos3 = (float) Math.cos(d10);
            float f17 = -sin3;
            float f18 = (cos3 * f11) + (f17 * cos2);
            float f19 = ((f11 * sin3) + (cos2 * cos3)) * e8;
            float f20 = sin3 * cos * e8;
            float f21 = ((sin3 * f12) + (cos3 * f10)) * e8;
            float f22 = f18 * I;
            float f23 = cos * cos3 * I;
            float f24 = ((cos3 * f12) + (f17 * f10)) * I;
            float f25 = f13 * 1.0f;
            float f26 = f6 * 1.0f;
            float f27 = f14 * 1.0f;
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
                fArr[12] = ((f19 * f28) - (intBitsToFloat2 * f22)) + f15 + intBitsToFloat;
                fArr[13] = ((f20 * f28) - (intBitsToFloat2 * f23)) + f8 + intBitsToFloat2;
                fArr[14] = ((f28 * f21) - (intBitsToFloat2 * f24)) + f16;
                fArr[15] = 1.0f;
            }
            this.f8480t = false;
            this.f8482v = f1.p.l(fArr);
        }
        return fArr;
    }

    public final long c(long j7, boolean z3) {
        float[] b8;
        if (z3) {
            b8 = a();
            if (b8 == null) {
                return 9187343241974906880L;
            }
        } else {
            b8 = b();
        }
        return this.f8482v ? j7 : f1.p.m(b8, j7);
    }

    public final void d(long j7) {
        t tVar = this.f8467f;
        if (tVar.i) {
            tVar.I(-4.0f);
        }
        i1.b bVar = this.f8465d;
        if (!r2.i.a(bVar.f3312t, j7)) {
            bVar.f3312t = j7;
            bVar.f3294a.C((int) (j7 >> 32), (int) (j7 & 4294967295L), bVar.f3313u);
        }
        if (Build.VERSION.SDK_INT < 26) {
            tVar.invalidate();
            return;
        }
        ViewParent parent = tVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(tVar, tVar);
        }
    }

    public final void e(long j7) {
        if (r2.k.a(j7, this.i)) {
            return;
        }
        t tVar = this.f8467f;
        if (tVar.i) {
            tVar.I(-4.0f);
        }
        this.i = j7;
        if (this.f8473m || this.f8470j) {
            return;
        }
        tVar.invalidate();
        if (true != this.f8473m) {
            this.f8473m = true;
            tVar.u(this, true);
        }
    }

    public final void f() {
        if (this.f8473m) {
            if (!f1.l0.a(this.f8478r, f1.l0.f2683b) && !r2.k.a(this.f8465d.f3313u, this.i)) {
                i1.b bVar = this.f8465d;
                float b8 = f1.l0.b(this.f8478r) * ((int) (this.i >> 32));
                float c8 = f1.l0.c(this.f8478r) * ((int) (this.i & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(c8) & 4294967295L) | (Float.floatToRawIntBits(b8) << 32);
                if (!e1.b.b(bVar.f3314v, floatToRawIntBits)) {
                    bVar.f3314v = floatToRawIntBits;
                    bVar.f3294a.L(floatToRawIntBits);
                }
            }
            i1.b bVar2 = this.f8465d;
            r2.c cVar = this.f8474n;
            r2.l lVar = this.f8475o;
            long j7 = this.i;
            long j8 = bVar2.f3313u;
            i1.d dVar = bVar2.f3294a;
            if (!r2.k.a(j8, j7)) {
                bVar2.f3313u = j7;
                long j9 = bVar2.f3312t;
                dVar.C((int) (j9 >> 32), (int) (4294967295L & j9), j7);
                if (bVar2.i == 9205357640488583168L) {
                    bVar2.f3300g = true;
                    bVar2.a();
                }
            }
            bVar2.f3295b = cVar;
            bVar2.f3296c = lVar;
            bVar2.f3297d = this.f8484x;
            dVar.c(cVar, lVar, bVar2, bVar2.f3298e);
            if (this.f8473m) {
                this.f8473m = false;
                this.f8467f.u(this, false);
            }
        }
    }

    @Override // w1.j1
    public final void invalidate() {
        if (this.f8473m || this.f8470j) {
            return;
        }
        t tVar = this.f8467f;
        tVar.invalidate();
        if (true != this.f8473m) {
            this.f8473m = true;
            tVar.u(this, true);
        }
    }
}
