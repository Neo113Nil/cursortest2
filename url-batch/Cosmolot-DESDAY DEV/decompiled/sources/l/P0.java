package l;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2893a;

    /* renamed from: b, reason: collision with root package name */
    public int f2894b;

    /* renamed from: c, reason: collision with root package name */
    public int f2895c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2896e;

    /* renamed from: f, reason: collision with root package name */
    public int f2897f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2898g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f2895c = i;
        this.d = i2;
        this.h = true;
        if (this.f2898g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2893a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2894b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2893a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2894b = i2;
        }
    }
}
