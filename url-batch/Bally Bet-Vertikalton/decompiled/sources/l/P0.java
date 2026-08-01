package l;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2898a;

    /* renamed from: b, reason: collision with root package name */
    public int f2899b;

    /* renamed from: c, reason: collision with root package name */
    public int f2900c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2901e;

    /* renamed from: f, reason: collision with root package name */
    public int f2902f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2903g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f2900c = i;
        this.d = i2;
        this.h = true;
        if (this.f2903g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2898a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2899b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2898a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2899b = i2;
        }
    }
}
