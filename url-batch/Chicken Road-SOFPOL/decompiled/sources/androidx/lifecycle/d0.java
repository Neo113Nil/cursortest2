package androidx.lifecycle;

import android.os.Handler;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d0 implements u {

    /* renamed from: l, reason: collision with root package name */
    public static final d0 f815l = new d0();

    /* renamed from: d, reason: collision with root package name */
    public int f816d;

    /* renamed from: e, reason: collision with root package name */
    public int f817e;

    /* renamed from: h, reason: collision with root package name */
    public Handler f820h;

    /* renamed from: f, reason: collision with root package name */
    public boolean f818f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f819g = true;
    public final w i = new w(this, true);

    /* renamed from: j, reason: collision with root package name */
    public final a1.a f821j = new a1.a(1, this);

    /* renamed from: k, reason: collision with root package name */
    public final v0 f822k = new v0(this);

    public final void c() {
        int i = this.f817e + 1;
        this.f817e = i;
        if (i == 1) {
            if (this.f818f) {
                this.i.d(o.ON_RESUME);
                this.f818f = false;
            } else {
                Handler handler = this.f820h;
                q6.i.b(handler);
                handler.removeCallbacks(this.f821j);
            }
        }
    }

    @Override // androidx.lifecycle.u
    public final w g() {
        return this.i;
    }
}
