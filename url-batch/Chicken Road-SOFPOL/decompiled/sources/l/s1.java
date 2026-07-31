package l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public int f4404a;

    /* renamed from: b, reason: collision with root package name */
    public int f4405b;

    /* renamed from: c, reason: collision with root package name */
    public int f4406c;

    /* renamed from: d, reason: collision with root package name */
    public int f4407d;

    /* renamed from: e, reason: collision with root package name */
    public int f4408e;

    /* renamed from: f, reason: collision with root package name */
    public int f4409f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4410g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4411h;

    public final void a(int i, int i8) {
        this.f4406c = i;
        this.f4407d = i8;
        this.f4411h = true;
        if (this.f4410g) {
            if (i8 != Integer.MIN_VALUE) {
                this.f4404a = i8;
            }
            if (i != Integer.MIN_VALUE) {
                this.f4405b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f4404a = i;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f4405b = i8;
        }
    }
}
