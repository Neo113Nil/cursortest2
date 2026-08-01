package l;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2916a;

    /* renamed from: b, reason: collision with root package name */
    public int f2917b;

    /* renamed from: c, reason: collision with root package name */
    public int f2918c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2919e;

    /* renamed from: f, reason: collision with root package name */
    public int f2920f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2921g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f2918c = i;
        this.d = i2;
        this.h = true;
        if (this.f2921g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2916a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2917b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2916a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2917b = i2;
        }
    }
}
