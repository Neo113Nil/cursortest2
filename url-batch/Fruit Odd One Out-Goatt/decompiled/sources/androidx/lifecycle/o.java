package androidx.lifecycle;

import android.os.Handler;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class o implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final o f41i = new o();

    /* renamed from: a, reason: collision with root package name */
    public int f42a;

    /* renamed from: b, reason: collision with root package name */
    public int f43b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f46e;

    /* renamed from: g, reason: collision with root package name */
    public final k f48g;

    /* renamed from: h, reason: collision with root package name */
    public final n f49h;

    /* renamed from: c, reason: collision with root package name */
    public boolean f44c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f45d = true;

    /* renamed from: f, reason: collision with root package name */
    public final j f47f = new j(this);

    public o() {
        int i2 = 0;
        this.f48g = new k(i2, this);
        this.f49h = new n(i2, this);
    }

    @Override // androidx.lifecycle.i
    public final j a() {
        return this.f47f;
    }

    public final void b() {
        int i2 = this.f43b + 1;
        this.f43b = i2;
        if (i2 == 1) {
            if (this.f44c) {
                this.f47f.a(d.ON_RESUME);
                this.f44c = false;
            } else {
                Handler handler = this.f46e;
                handler.getClass();
                handler.removeCallbacks(this.f48g);
            }
        }
    }
}
