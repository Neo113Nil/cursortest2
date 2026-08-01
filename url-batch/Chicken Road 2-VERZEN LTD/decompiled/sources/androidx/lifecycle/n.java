package androidx.lifecycle;

import D.u;
import android.os.Handler;

/* loaded from: classes.dex */
public final class n implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final n f441i = new n();

    /* renamed from: a, reason: collision with root package name */
    public int f442a;

    /* renamed from: b, reason: collision with root package name */
    public int f443b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f446e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f444c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f445d = true;

    /* renamed from: f, reason: collision with root package name */
    public final j f447f = new j(this);

    /* renamed from: g, reason: collision with root package name */
    public final F.h f448g = new F.h(2, this);

    /* renamed from: h, reason: collision with root package name */
    public final u f449h = new u(28, this);

    @Override // androidx.lifecycle.i
    public final j a() {
        return this.f447f;
    }

    public final void b() {
        int i2 = this.f443b + 1;
        this.f443b = i2;
        if (i2 == 1) {
            if (this.f444c) {
                this.f447f.a(d.ON_RESUME);
                this.f444c = false;
            } else {
                Handler handler = this.f446e;
                e0.h.b(handler);
                handler.removeCallbacks(this.f448g);
            }
        }
    }
}
