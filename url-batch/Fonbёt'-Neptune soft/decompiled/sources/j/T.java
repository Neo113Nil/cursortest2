package j;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public int f2914a;

    /* renamed from: b, reason: collision with root package name */
    public int f2915b;

    /* renamed from: c, reason: collision with root package name */
    public int f2916c;

    /* renamed from: d, reason: collision with root package name */
    public int f2917d;

    /* renamed from: e, reason: collision with root package name */
    public int f2918e;

    /* renamed from: f, reason: collision with root package name */
    public int f2919f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2920g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2921h;

    public final void a(int i2, int i3) {
        this.f2916c = i2;
        this.f2917d = i3;
        this.f2921h = true;
        if (this.f2920g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f2914a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f2915b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2914a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f2915b = i3;
        }
    }
}
