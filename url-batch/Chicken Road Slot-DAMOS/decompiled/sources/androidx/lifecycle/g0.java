package androidx.lifecycle;

import android.os.Handler;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g0 implements u {

    /* renamed from: w, reason: collision with root package name */
    public static final g0 f683w = new g0();

    /* renamed from: d, reason: collision with root package name */
    public int f684d;

    /* renamed from: e, reason: collision with root package name */
    public int f685e;

    /* renamed from: s, reason: collision with root package name */
    public Handler f688s;

    /* renamed from: i, reason: collision with root package name */
    public boolean f686i = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f687r = true;

    /* renamed from: t, reason: collision with root package name */
    public final w f689t = new w(this, true);

    /* renamed from: u, reason: collision with root package name */
    public final d0 f690u = new d0(0, this);

    /* renamed from: v, reason: collision with root package name */
    public final y0 f691v = new y0(this);

    public final void c() {
        int i3 = this.f685e + 1;
        this.f685e = i3;
        if (i3 == 1) {
            if (this.f686i) {
                this.f689t.d(o.ON_RESUME);
                this.f686i = false;
            } else {
                Handler handler = this.f688s;
                handler.getClass();
                handler.removeCallbacks(this.f690u);
            }
        }
    }

    @Override // androidx.lifecycle.u
    public final w g() {
        return this.f689t;
    }
}
