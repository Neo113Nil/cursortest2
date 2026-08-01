package l;

/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2892a;

    /* renamed from: b, reason: collision with root package name */
    public int f2893b;

    /* renamed from: c, reason: collision with root package name */
    public int f2894c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2895e;

    /* renamed from: f, reason: collision with root package name */
    public int f2896f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2897g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f2894c = i;
        this.d = i2;
        this.h = true;
        if (this.f2897g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2892a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2893b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2892a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2893b = i2;
        }
    }
}
