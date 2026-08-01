package m;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6126a;

    /* renamed from: b, reason: collision with root package name */
    public int f6127b;

    /* renamed from: c, reason: collision with root package name */
    public int f6128c;

    /* renamed from: d, reason: collision with root package name */
    public int f6129d;

    /* renamed from: e, reason: collision with root package name */
    public int f6130e;

    /* renamed from: f, reason: collision with root package name */
    public int f6131f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6132h;

    public final void a(int i3, int i10) {
        this.f6128c = i3;
        this.f6129d = i10;
        this.f6132h = true;
        if (this.g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f6126a = i10;
            }
            if (i3 != Integer.MIN_VALUE) {
                this.f6127b = i3;
                return;
            }
            return;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f6126a = i3;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f6127b = i10;
        }
    }
}
