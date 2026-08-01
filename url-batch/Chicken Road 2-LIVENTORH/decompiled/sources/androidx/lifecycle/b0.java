package androidx.lifecycle;

import android.os.Handler;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b0 implements r {

    /* renamed from: n, reason: collision with root package name */
    public static final b0 f592n = new b0();

    /* renamed from: f, reason: collision with root package name */
    public int f593f;

    /* renamed from: g, reason: collision with root package name */
    public int f594g;

    /* renamed from: j, reason: collision with root package name */
    public Handler f596j;

    /* renamed from: h, reason: collision with root package name */
    public boolean f595h = true;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public final t f597k = new t(this);

    /* renamed from: l, reason: collision with root package name */
    public final a.j f598l = new a.j(3, this);

    /* renamed from: m, reason: collision with root package name */
    public final a0.a f599m = new a0.a(7, this);

    public final void a() {
        int i = this.f594g + 1;
        this.f594g = i;
        if (i == 1) {
            if (this.f595h) {
                this.f597k.d(l.ON_RESUME);
                this.f595h = false;
            } else {
                Handler handler = this.f596j;
                f3.d.b(handler);
                handler.removeCallbacks(this.f598l);
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final t e() {
        return this.f597k;
    }
}
