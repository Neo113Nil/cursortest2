package a0;

/* renamed from: a0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139e {

    /* renamed from: a, reason: collision with root package name */
    public final long f4088a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4089b;

    /* renamed from: c, reason: collision with root package name */
    public long f4090c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public long f4091d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    public long f4093f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f4094g = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public float f4097j = 0.97f;

    /* renamed from: i, reason: collision with root package name */
    public float f4096i = 1.03f;

    /* renamed from: k, reason: collision with root package name */
    public float f4098k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public long f4099l = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public long f4092e = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f4095h = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public long f4100m = -9223372036854775807L;
    public long n = -9223372036854775807L;

    public C0139e(long j4, long j5) {
        this.f4088a = j4;
        this.f4089b = j5;
    }

    public final void a() {
        long j4;
        long j5 = this.f4090c;
        if (j5 != -9223372036854775807L) {
            j4 = this.f4091d;
            if (j4 == -9223372036854775807L) {
                long j6 = this.f4093f;
                if (j6 != -9223372036854775807L && j5 < j6) {
                    j5 = j6;
                }
                j4 = this.f4094g;
                if (j4 == -9223372036854775807L || j5 <= j4) {
                    j4 = j5;
                }
            }
        } else {
            j4 = -9223372036854775807L;
        }
        if (this.f4092e == j4) {
            return;
        }
        this.f4092e = j4;
        this.f4095h = j4;
        this.f4100m = -9223372036854775807L;
        this.n = -9223372036854775807L;
        this.f4099l = -9223372036854775807L;
    }
}
