package f1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final y0.F f8694a;

    /* renamed from: b, reason: collision with root package name */
    public long f8695b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8696c;

    /* renamed from: d, reason: collision with root package name */
    public int f8697d;

    /* renamed from: e, reason: collision with root package name */
    public long f8698e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8699f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8700g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8701h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8702i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8703j;

    /* renamed from: k, reason: collision with root package name */
    public long f8704k;

    /* renamed from: l, reason: collision with root package name */
    public long f8705l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8706m;

    public q(y0.F f4) {
        this.f8694a = f4;
    }

    public final void a(int i4) {
        long j4 = this.f8705l;
        if (j4 != -9223372036854775807L) {
            long j5 = this.f8695b;
            long j6 = this.f8704k;
            if (j5 == j6) {
                return;
            }
            int i5 = (int) (j5 - j6);
            this.f8694a.e(j4, this.f8706m ? 1 : 0, i5, i4, null);
        }
    }
}
