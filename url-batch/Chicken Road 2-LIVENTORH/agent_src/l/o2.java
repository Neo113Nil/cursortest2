package l;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2405a;

    /* renamed from: b, reason: collision with root package name */
    public int f2406b;

    /* renamed from: c, reason: collision with root package name */
    public int f2407c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2408e;

    /* renamed from: f, reason: collision with root package name */
    public int f2409f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2410g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2411h;

    public final void a(int i, int i4) {
        this.f2407c = i;
        this.d = i4;
        this.f2411h = true;
        if (this.f2410g) {
            if (i4 != Integer.MIN_VALUE) {
                this.f2405a = i4;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2406b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2405a = i;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f2406b = i4;
        }
    }
}
