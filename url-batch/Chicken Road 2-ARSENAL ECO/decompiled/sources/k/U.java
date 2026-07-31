package k;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f4970a;

    /* renamed from: b, reason: collision with root package name */
    public int f4971b;

    /* renamed from: c, reason: collision with root package name */
    public int f4972c;

    /* renamed from: d, reason: collision with root package name */
    public int f4973d;

    /* renamed from: e, reason: collision with root package name */
    public int f4974e;

    /* renamed from: f, reason: collision with root package name */
    public int f4975f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4976g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4977h;

    public final void a(int i7, int i8) {
        this.f4972c = i7;
        this.f4973d = i8;
        this.f4977h = true;
        if (this.f4976g) {
            if (i8 != Integer.MIN_VALUE) {
                this.f4970a = i8;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f4971b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f4970a = i7;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f4971b = i8;
        }
    }
}
