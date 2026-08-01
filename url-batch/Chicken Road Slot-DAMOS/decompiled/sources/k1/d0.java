package k1;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d0 implements x2.c {
    public x2.l A;
    public int B;
    public v C;

    /* renamed from: d, reason: collision with root package name */
    public int f5302d;

    /* renamed from: e, reason: collision with root package name */
    public float f5303e = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f5304i = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public float f5305r = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    public long f5306s;

    /* renamed from: t, reason: collision with root package name */
    public long f5307t;

    /* renamed from: u, reason: collision with root package name */
    public float f5308u;

    /* renamed from: v, reason: collision with root package name */
    public long f5309v;

    /* renamed from: w, reason: collision with root package name */
    public f0 f5310w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5311x;

    /* renamed from: y, reason: collision with root package name */
    public long f5312y;

    /* renamed from: z, reason: collision with root package name */
    public x2.c f5313z;

    public d0() {
        long j = w.f5355a;
        this.f5306s = j;
        this.f5307t = j;
        this.f5308u = 8.0f;
        this.f5309v = i0.f5326b;
        this.f5310w = v.f5351b;
        this.f5312y = 9205357640488583168L;
        this.f5313z = z4.w.a();
        this.A = x2.l.f10330d;
        this.B = 3;
    }

    public final void a() {
        c(1.0f);
        e(1.0f);
        b(1.0f);
        long j = w.f5355a;
        if (!p.c(this.f5306s, j)) {
            this.f5302d |= 64;
            this.f5306s = j;
        }
        if (!p.c(this.f5307t, j)) {
            this.f5302d |= 128;
            this.f5307t = j;
        }
        if (this.f5308u != 8.0f) {
            this.f5302d |= 2048;
            this.f5308u = 8.0f;
        }
        h(i0.f5326b);
        f0 f0Var = this.f5310w;
        c0 c0Var = v.f5351b;
        if (!Intrinsics.a(f0Var, c0Var)) {
            this.f5302d |= 8192;
            this.f5310w = c0Var;
        }
        if (this.f5311x) {
            this.f5302d |= 16384;
            this.f5311x = false;
        }
        if (this.B != 3) {
            this.f5302d |= 524288;
            this.B = 3;
        }
        this.f5312y = 9205357640488583168L;
        this.C = null;
        this.f5302d = 0;
    }

    public final void b(float f3) {
        if (this.f5305r == f3) {
            return;
        }
        this.f5302d |= 4;
        this.f5305r = f3;
    }

    public final void c(float f3) {
        if (this.f5303e == f3) {
            return;
        }
        this.f5302d |= 1;
        this.f5303e = f3;
    }

    @Override // x2.c
    public final float d() {
        return this.f5313z.d();
    }

    public final void e(float f3) {
        if (this.f5304i == f3) {
            return;
        }
        this.f5302d |= 2;
        this.f5304i = f3;
    }

    @Override // x2.c
    public final float g() {
        return this.f5313z.g();
    }

    public final void h(long j) {
        if (i0.a(this.f5309v, j)) {
            return;
        }
        this.f5302d |= 4096;
        this.f5309v = j;
    }
}
