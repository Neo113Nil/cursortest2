package n;

/* loaded from: classes.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    public int f6707a;

    /* renamed from: b, reason: collision with root package name */
    public int f6708b;

    /* renamed from: c, reason: collision with root package name */
    public int f6709c;

    /* renamed from: d, reason: collision with root package name */
    public int f6710d;

    /* renamed from: e, reason: collision with root package name */
    public int f6711e;

    /* renamed from: f, reason: collision with root package name */
    public int f6712f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6713g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6714h;

    public final void a(int i2, int i5) {
        this.f6709c = i2;
        this.f6710d = i5;
        this.f6714h = true;
        if (this.f6713g) {
            if (i5 != Integer.MIN_VALUE) {
                this.f6707a = i5;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f6708b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f6707a = i2;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f6708b = i5;
        }
    }
}
