package l;

/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    public int f3315a;

    /* renamed from: b, reason: collision with root package name */
    public int f3316b;

    /* renamed from: c, reason: collision with root package name */
    public int f3317c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3318e;

    /* renamed from: f, reason: collision with root package name */
    public int f3319f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3320g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f3317c = i;
        this.d = i2;
        this.h = true;
        if (this.f3320g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f3315a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f3316b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f3315a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3316b = i2;
        }
    }
}
