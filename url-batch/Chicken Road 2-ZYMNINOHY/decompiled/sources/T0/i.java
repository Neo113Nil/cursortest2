package T0;

import W.u;
import y0.F;
import y0.p;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public F f2935b;

    /* renamed from: c, reason: collision with root package name */
    public p f2936c;

    /* renamed from: d, reason: collision with root package name */
    public g f2937d;

    /* renamed from: e, reason: collision with root package name */
    public long f2938e;

    /* renamed from: f, reason: collision with root package name */
    public long f2939f;

    /* renamed from: g, reason: collision with root package name */
    public long f2940g;

    /* renamed from: h, reason: collision with root package name */
    public int f2941h;

    /* renamed from: i, reason: collision with root package name */
    public int f2942i;

    /* renamed from: k, reason: collision with root package name */
    public long f2944k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2945l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2946m;

    /* renamed from: a, reason: collision with root package name */
    public final e f2934a = new e();

    /* renamed from: j, reason: collision with root package name */
    public l2.e f2943j = new l2.e(15, false);

    public void a(long j4) {
        this.f2940g = j4;
    }

    public abstract long b(u uVar);

    public abstract boolean c(u uVar, long j4, l2.e eVar);

    public void d(boolean z) {
        if (z) {
            this.f2943j = new l2.e(15, false);
            this.f2939f = 0L;
            this.f2941h = 0;
        } else {
            this.f2941h = 1;
        }
        this.f2938e = -1L;
        this.f2940g = 0L;
    }
}
