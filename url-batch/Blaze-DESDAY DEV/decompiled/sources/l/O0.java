package l;

/* loaded from: classes.dex */
public final class O0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2862a;

    /* renamed from: b, reason: collision with root package name */
    public int f2863b;

    /* renamed from: c, reason: collision with root package name */
    public int f2864c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2865e;

    /* renamed from: f, reason: collision with root package name */
    public int f2866f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2867g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f2864c = i;
        this.d = i2;
        this.h = true;
        if (this.f2867g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2862a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2863b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2862a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2863b = i2;
        }
    }
}
