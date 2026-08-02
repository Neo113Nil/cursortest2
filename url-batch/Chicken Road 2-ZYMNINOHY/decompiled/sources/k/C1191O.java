package k;

/* renamed from: k.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1191O {

    /* renamed from: a, reason: collision with root package name */
    public int f13953a;

    /* renamed from: b, reason: collision with root package name */
    public int f13954b;

    /* renamed from: c, reason: collision with root package name */
    public int f13955c;

    /* renamed from: d, reason: collision with root package name */
    public int f13956d;

    /* renamed from: e, reason: collision with root package name */
    public int f13957e;

    /* renamed from: f, reason: collision with root package name */
    public int f13958f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13959g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13960h;

    public final void a(int i4, int i5) {
        this.f13955c = i4;
        this.f13956d = i5;
        this.f13960h = true;
        if (this.f13959g) {
            if (i5 != Integer.MIN_VALUE) {
                this.f13953a = i5;
            }
            if (i4 != Integer.MIN_VALUE) {
                this.f13954b = i4;
                return;
            }
            return;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f13953a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f13954b = i5;
        }
    }
}
