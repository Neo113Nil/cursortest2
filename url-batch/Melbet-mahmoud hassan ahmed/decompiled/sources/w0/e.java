package w0;

import w0.b0;

/* loaded from: classes.dex */
public class e implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f22887a;

    /* renamed from: b, reason: collision with root package name */
    private final long f22888b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22889c;

    /* renamed from: d, reason: collision with root package name */
    private final long f22890d;

    /* renamed from: e, reason: collision with root package name */
    private final int f22891e;

    /* renamed from: f, reason: collision with root package name */
    private final long f22892f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f22893g;

    public e(long j7, long j8, int i7, int i8, boolean z6) {
        long d7;
        this.f22887a = j7;
        this.f22888b = j8;
        this.f22889c = i8 == -1 ? 1 : i8;
        this.f22891e = i7;
        this.f22893g = z6;
        if (j7 == -1) {
            this.f22890d = -1L;
            d7 = -9223372036854775807L;
        } else {
            this.f22890d = j7 - j8;
            d7 = d(j7, j8, i7);
        }
        this.f22892f = d7;
    }

    private long a(long j7) {
        int i7 = this.f22889c;
        long j8 = (((j7 * this.f22891e) / 8000000) / i7) * i7;
        long j9 = this.f22890d;
        if (j9 != -1) {
            j8 = Math.min(j8, j9 - i7);
        }
        return this.f22888b + Math.max(j8, 0L);
    }

    private static long d(long j7, long j8, int i7) {
        return ((Math.max(0L, j7 - j8) * 8) * 1000000) / i7;
    }

    public long b(long j7) {
        return d(j7, this.f22888b, this.f22891e);
    }

    @Override // w0.b0
    public boolean g() {
        return this.f22890d != -1 || this.f22893g;
    }

    @Override // w0.b0
    public b0.a i(long j7) {
        if (this.f22890d == -1 && !this.f22893g) {
            return new b0.a(new c0(0L, this.f22888b));
        }
        long a7 = a(j7);
        long b7 = b(a7);
        c0 c0Var = new c0(b7, a7);
        if (this.f22890d != -1 && b7 < j7) {
            int i7 = this.f22889c;
            if (i7 + a7 < this.f22887a) {
                long j8 = a7 + i7;
                return new b0.a(c0Var, new c0(b(j8), j8));
            }
        }
        return new b0.a(c0Var);
    }

    @Override // w0.b0
    public long j() {
        return this.f22892f;
    }
}
