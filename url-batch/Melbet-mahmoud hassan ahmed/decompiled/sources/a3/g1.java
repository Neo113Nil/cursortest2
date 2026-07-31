package a3;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    private long f69a;

    /* renamed from: b, reason: collision with root package name */
    private long f70b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private final Object f71c = new Object();

    public g1(long j7) {
        this.f69a = j7;
    }

    public final void a(long j7) {
        synchronized (this.f71c) {
            this.f69a = j7;
        }
    }

    public final boolean b() {
        synchronized (this.f71c) {
            long a7 = y2.t.a().a();
            if (this.f70b + this.f69a > a7) {
                return false;
            }
            this.f70b = a7;
            return true;
        }
    }
}
