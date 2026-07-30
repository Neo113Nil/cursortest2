package u1;

/* loaded from: classes.dex */
public final class w implements x, O1.b {

    /* renamed from: x, reason: collision with root package name */
    public static final Y2.e f41194x = O1.d.a(20, new W3.e(27));

    /* renamed from: n, reason: collision with root package name */
    public final O1.e f41195n = new O1.e();

    /* renamed from: u, reason: collision with root package name */
    public x f41196u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f41197v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f41198w;

    @Override // u1.x
    public final synchronized void a() {
        this.f41195n.a();
        this.f41198w = true;
        if (!this.f41197v) {
            this.f41196u.a();
            this.f41196u = null;
            f41194x.G(this);
        }
    }

    @Override // O1.b
    public final O1.e b() {
        return this.f41195n;
    }

    @Override // u1.x
    public final int c() {
        return this.f41196u.c();
    }

    @Override // u1.x
    public final Class d() {
        return this.f41196u.d();
    }

    public final synchronized void e() {
        this.f41195n.a();
        if (!this.f41197v) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f41197v = false;
        if (this.f41198w) {
            a();
        }
    }

    @Override // u1.x
    public final Object get() {
        return this.f41196u.get();
    }
}
