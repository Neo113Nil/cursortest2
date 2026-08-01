package l;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2501a;

    /* renamed from: b, reason: collision with root package name */
    public int f2502b;

    /* renamed from: c, reason: collision with root package name */
    public int f2503c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2504e;

    /* renamed from: f, reason: collision with root package name */
    public int f2505f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2506g;
    public boolean h;

    public final void a(int i, int i4) {
        this.f2503c = i;
        this.d = i4;
        this.h = true;
        if (this.f2506g) {
            if (i4 != Integer.MIN_VALUE) {
                this.f2501a = i4;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2502b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2501a = i;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f2502b = i4;
        }
    }
}
