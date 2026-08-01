package l;

/* loaded from: classes.dex */
public final class O0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2835a;

    /* renamed from: b, reason: collision with root package name */
    public int f2836b;

    /* renamed from: c, reason: collision with root package name */
    public int f2837c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2838e;

    /* renamed from: f, reason: collision with root package name */
    public int f2839f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2840g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f2837c = i;
        this.d = i2;
        this.h = true;
        if (this.f2840g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2835a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2836b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2835a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2836b = i2;
        }
    }
}
