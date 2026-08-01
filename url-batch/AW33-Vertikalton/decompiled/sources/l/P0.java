package l;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2910a;

    /* renamed from: b, reason: collision with root package name */
    public int f2911b;

    /* renamed from: c, reason: collision with root package name */
    public int f2912c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2913e;

    /* renamed from: f, reason: collision with root package name */
    public int f2914f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2915g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f2912c = i;
        this.d = i2;
        this.h = true;
        if (this.f2915g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2910a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2911b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2910a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2911b = i2;
        }
    }
}
