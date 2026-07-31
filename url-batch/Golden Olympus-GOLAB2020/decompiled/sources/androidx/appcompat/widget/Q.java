package androidx.appcompat.widget;

/* loaded from: classes.dex */
class Q {

    /* renamed from: a, reason: collision with root package name */
    private int f10723a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f10724b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f10725c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f10726d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f10727e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f10728f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10729g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10730h = false;

    Q() {
    }

    public int a() {
        return this.f10729g ? this.f10723a : this.f10724b;
    }

    public int b() {
        return this.f10723a;
    }

    public int c() {
        return this.f10724b;
    }

    public int d() {
        return this.f10729g ? this.f10724b : this.f10723a;
    }

    public void e(int i4, int i5) {
        this.f10730h = false;
        if (i4 != Integer.MIN_VALUE) {
            this.f10727e = i4;
            this.f10723a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f10728f = i5;
            this.f10724b = i5;
        }
    }

    public void f(boolean z4) {
        if (z4 == this.f10729g) {
            return;
        }
        this.f10729g = z4;
        if (!this.f10730h) {
            this.f10723a = this.f10727e;
            this.f10724b = this.f10728f;
            return;
        }
        if (z4) {
            int i4 = this.f10726d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.f10727e;
            }
            this.f10723a = i4;
            int i5 = this.f10725c;
            if (i5 == Integer.MIN_VALUE) {
                i5 = this.f10728f;
            }
            this.f10724b = i5;
            return;
        }
        int i6 = this.f10725c;
        if (i6 == Integer.MIN_VALUE) {
            i6 = this.f10727e;
        }
        this.f10723a = i6;
        int i7 = this.f10726d;
        if (i7 == Integer.MIN_VALUE) {
            i7 = this.f10728f;
        }
        this.f10724b = i7;
    }

    public void g(int i4, int i5) {
        this.f10725c = i4;
        this.f10726d = i5;
        this.f10730h = true;
        if (this.f10729g) {
            if (i5 != Integer.MIN_VALUE) {
                this.f10723a = i5;
            }
            if (i4 != Integer.MIN_VALUE) {
                this.f10724b = i4;
                return;
            }
            return;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f10723a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f10724b = i5;
        }
    }
}
