package l;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public int f9763a;

    /* renamed from: b, reason: collision with root package name */
    public int f9764b;

    /* renamed from: c, reason: collision with root package name */
    public int f9765c;

    /* renamed from: d, reason: collision with root package name */
    public int f9766d;

    /* renamed from: e, reason: collision with root package name */
    public int f9767e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9768g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9769h;

    public final void a(int i3, int i4) {
        this.f9765c = i3;
        this.f9766d = i4;
        this.f9769h = true;
        if (this.f9768g) {
            if (i4 != Integer.MIN_VALUE) {
                this.f9763a = i4;
            }
            if (i3 != Integer.MIN_VALUE) {
                this.f9764b = i3;
                return;
            }
            return;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f9763a = i3;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f9764b = i4;
        }
    }
}
