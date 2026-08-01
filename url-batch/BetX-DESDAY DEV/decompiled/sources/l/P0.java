package l;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public int f3286a;

    /* renamed from: b, reason: collision with root package name */
    public int f3287b;

    /* renamed from: c, reason: collision with root package name */
    public int f3288c;

    /* renamed from: d, reason: collision with root package name */
    public int f3289d;

    /* renamed from: e, reason: collision with root package name */
    public int f3290e;

    /* renamed from: f, reason: collision with root package name */
    public int f3291f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3292g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f3288c = i;
        this.f3289d = i2;
        this.h = true;
        if (this.f3292g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f3286a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f3287b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f3286a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3287b = i2;
        }
    }
}
