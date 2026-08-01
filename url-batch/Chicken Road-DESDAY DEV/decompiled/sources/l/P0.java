package l;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2843a;

    /* renamed from: b, reason: collision with root package name */
    public int f2844b;

    /* renamed from: c, reason: collision with root package name */
    public int f2845c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2846e;

    /* renamed from: f, reason: collision with root package name */
    public int f2847f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2848g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f2845c = i;
        this.d = i2;
        this.h = true;
        if (this.f2848g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2843a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2844b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2843a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2844b = i2;
        }
    }
}
