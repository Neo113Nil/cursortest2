package l;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2993a;

    /* renamed from: b, reason: collision with root package name */
    public int f2994b;

    /* renamed from: c, reason: collision with root package name */
    public int f2995c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2996e;

    /* renamed from: f, reason: collision with root package name */
    public int f2997f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2998g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f2995c = i;
        this.d = i2;
        this.h = true;
        if (this.f2998g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2993a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2994b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2993a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2994b = i2;
        }
    }
}
