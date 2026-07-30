package h;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public int f2138a;

    /* renamed from: b, reason: collision with root package name */
    public int f2139b;

    /* renamed from: c, reason: collision with root package name */
    public int f2140c;

    /* renamed from: d, reason: collision with root package name */
    public int f2141d;

    /* renamed from: e, reason: collision with root package name */
    public int f2142e;

    /* renamed from: f, reason: collision with root package name */
    public int f2143f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2144g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2145h;

    public final void a(int i2, int i3) {
        this.f2140c = i2;
        this.f2141d = i3;
        this.f2145h = true;
        if (this.f2144g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f2138a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f2139b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2138a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f2139b = i3;
        }
    }
}
