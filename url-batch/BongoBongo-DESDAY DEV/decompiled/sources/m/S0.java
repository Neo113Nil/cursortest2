package m;

/* loaded from: classes.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2988a;

    /* renamed from: b, reason: collision with root package name */
    public int f2989b;

    /* renamed from: c, reason: collision with root package name */
    public int f2990c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2991e;

    /* renamed from: f, reason: collision with root package name */
    public int f2992f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2993g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2994h;

    public final void a(int i, int i2) {
        this.f2990c = i;
        this.d = i2;
        this.f2994h = true;
        if (this.f2993g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2988a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2989b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2988a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2989b = i2;
        }
    }
}
