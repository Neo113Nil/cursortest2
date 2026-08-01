package l;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2915a;

    /* renamed from: b, reason: collision with root package name */
    public int f2916b;

    /* renamed from: c, reason: collision with root package name */
    public int f2917c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2918e;

    /* renamed from: f, reason: collision with root package name */
    public int f2919f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2920g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f2917c = i;
        this.d = i2;
        this.h = true;
        if (this.f2920g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2915a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2916b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2915a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2916b = i2;
        }
    }
}
