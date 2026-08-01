package n;

/* loaded from: classes.dex */
public final class R0 {

    /* renamed from: a, reason: collision with root package name */
    public int f3517a;

    /* renamed from: b, reason: collision with root package name */
    public int f3518b;

    /* renamed from: c, reason: collision with root package name */
    public int f3519c;

    /* renamed from: d, reason: collision with root package name */
    public int f3520d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f3521f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3522g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3523h;

    public final void a(int i, int i2) {
        this.f3519c = i;
        this.f3520d = i2;
        this.f3523h = true;
        if (this.f3522g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f3517a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f3518b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f3517a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3518b = i2;
        }
    }
}
