package l;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2914a;

    /* renamed from: b, reason: collision with root package name */
    public int f2915b;

    /* renamed from: c, reason: collision with root package name */
    public int f2916c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2917e;

    /* renamed from: f, reason: collision with root package name */
    public int f2918f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2919g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f2916c = i;
        this.d = i2;
        this.h = true;
        if (this.f2919g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2914a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2915b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2914a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2915b = i2;
        }
    }
}
