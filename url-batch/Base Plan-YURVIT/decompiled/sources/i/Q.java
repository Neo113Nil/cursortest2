package i;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public int f2169a;

    /* renamed from: b, reason: collision with root package name */
    public int f2170b;

    /* renamed from: c, reason: collision with root package name */
    public int f2171c;

    /* renamed from: d, reason: collision with root package name */
    public int f2172d;

    /* renamed from: e, reason: collision with root package name */
    public int f2173e;

    /* renamed from: f, reason: collision with root package name */
    public int f2174f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2175g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2176h;

    public final void a(int i2, int i3) {
        this.f2171c = i2;
        this.f2172d = i3;
        this.f2176h = true;
        if (this.f2175g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f2169a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f2170b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2169a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f2170b = i3;
        }
    }
}
