package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class o implements i {

    /* renamed from: m, reason: collision with root package name */
    public static final o f1530m = new o();

    /* renamed from: e, reason: collision with root package name */
    public int f1531e;

    /* renamed from: f, reason: collision with root package name */
    public int f1532f;

    /* renamed from: i, reason: collision with root package name */
    public Handler f1535i;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1533g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1534h = true;

    /* renamed from: j, reason: collision with root package name */
    public final j f1536j = new j(this);

    /* renamed from: k, reason: collision with root package name */
    public final k f1537k = new k(0, this);

    /* renamed from: l, reason: collision with root package name */
    public final A.j f1538l = new A.j(13, this);

    @Override // androidx.lifecycle.i
    public final j a() {
        return this.f1536j;
    }

    public final void b() {
        int i2 = this.f1532f + 1;
        this.f1532f = i2;
        if (i2 == 1) {
            if (this.f1533g) {
                this.f1536j.a(d.ON_RESUME);
                this.f1533g = false;
            } else {
                Handler handler = this.f1535i;
                F0.i.b(handler);
                handler.removeCallbacks(this.f1537k);
            }
        }
    }
}
