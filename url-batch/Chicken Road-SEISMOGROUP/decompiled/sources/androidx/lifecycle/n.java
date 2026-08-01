package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class n implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final n f497i = new n();

    /* renamed from: a, reason: collision with root package name */
    public int f498a;

    /* renamed from: b, reason: collision with root package name */
    public int f499b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f502e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f500c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f501d = true;

    /* renamed from: f, reason: collision with root package name */
    public final j f503f = new j(this);

    /* renamed from: g, reason: collision with root package name */
    public final B.e f504g = new B.e(2, this);

    /* renamed from: h, reason: collision with root package name */
    public final B.k f505h = new B.k(29, this);

    @Override // androidx.lifecycle.i
    public final j a() {
        return this.f503f;
    }

    public final void b() {
        int i2 = this.f499b + 1;
        this.f499b = i2;
        if (i2 == 1) {
            if (this.f500c) {
                this.f503f.a(d.ON_RESUME);
                this.f500c = false;
            } else {
                Handler handler = this.f502e;
                e0.h.b(handler);
                handler.removeCallbacks(this.f504g);
            }
        }
    }
}
