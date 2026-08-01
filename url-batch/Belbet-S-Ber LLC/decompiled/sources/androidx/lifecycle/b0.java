package androidx.lifecycle;

import android.os.Handler;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b0 implements r {

    /* renamed from: n, reason: collision with root package name */
    public static final b0 f697n = new b0();

    /* renamed from: f, reason: collision with root package name */
    public int f698f;

    /* renamed from: g, reason: collision with root package name */
    public int f699g;

    /* renamed from: j, reason: collision with root package name */
    public Handler f700j;
    public boolean h = true;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public final t f701k = new t(this);

    /* renamed from: l, reason: collision with root package name */
    public final a.j f702l = new a.j(3, this);

    /* renamed from: m, reason: collision with root package name */
    public final a0.a f703m = new a0.a(6, this);

    public final void b() {
        int i = this.f699g + 1;
        this.f699g = i;
        if (i == 1) {
            if (this.h) {
                this.f701k.d(l.ON_RESUME);
                this.h = false;
            } else {
                Handler handler = this.f700j;
                i3.d.b(handler);
                handler.removeCallbacks(this.f702l);
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final t f() {
        return this.f701k;
    }
}
