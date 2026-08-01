package l;

/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2877a;

    /* renamed from: b, reason: collision with root package name */
    public int f2878b;

    /* renamed from: c, reason: collision with root package name */
    public int f2879c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2880e;

    /* renamed from: f, reason: collision with root package name */
    public int f2881f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2882g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f2879c = i;
        this.d = i2;
        this.h = true;
        if (this.f2882g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2877a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2878b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2877a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2878b = i2;
        }
    }
}
