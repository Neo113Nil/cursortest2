package m;

/* loaded from: classes.dex */
public final class K0 {

    /* renamed from: a, reason: collision with root package name */
    public int f39291a;

    /* renamed from: b, reason: collision with root package name */
    public int f39292b;

    /* renamed from: c, reason: collision with root package name */
    public int f39293c;

    /* renamed from: d, reason: collision with root package name */
    public int f39294d;

    /* renamed from: e, reason: collision with root package name */
    public int f39295e;

    /* renamed from: f, reason: collision with root package name */
    public int f39296f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39297g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f39298h;

    public final void a(int i, int i4) {
        this.f39293c = i;
        this.f39294d = i4;
        this.f39298h = true;
        if (this.f39297g) {
            if (i4 != Integer.MIN_VALUE) {
                this.f39291a = i4;
            }
            if (i != Integer.MIN_VALUE) {
                this.f39292b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f39291a = i;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f39292b = i4;
        }
    }
}
