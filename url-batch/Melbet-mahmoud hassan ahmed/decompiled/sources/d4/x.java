package d4;

/* loaded from: classes.dex */
abstract class x implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final long f15739f;

    /* renamed from: g, reason: collision with root package name */
    final long f15740g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f15741h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ g0 f15742i;

    x(g0 g0Var, boolean z6) {
        this.f15742i = g0Var;
        this.f15739f = g0Var.f15672b.b();
        this.f15740g = g0Var.f15672b.a();
        this.f15741h = z6;
    }

    abstract void a();

    protected void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        z6 = this.f15742i.f15677g;
        if (z6) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e7) {
            this.f15742i.p(e7, false, this.f15741h);
            b();
        }
    }
}
