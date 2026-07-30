package androidx.lifecycle;

import android.os.Handler;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f0 implements v {

    /* renamed from: n, reason: collision with root package name */
    public static final f0 f963n = new f0();

    /* renamed from: f, reason: collision with root package name */
    public int f964f;

    /* renamed from: g, reason: collision with root package name */
    public int f965g;

    /* renamed from: j, reason: collision with root package name */
    public Handler f968j;

    /* renamed from: h, reason: collision with root package name */
    public boolean f966h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f967i = true;

    /* renamed from: k, reason: collision with root package name */
    public final x f969k = new x(this);

    /* renamed from: l, reason: collision with root package name */
    public final c0 f970l = new c0(0, this);

    /* renamed from: m, reason: collision with root package name */
    public final b6.c f971m = new b6.c(2, this);

    public final void c() {
        int i7 = this.f965g + 1;
        this.f965g = i7;
        if (i7 == 1) {
            if (this.f966h) {
                this.f969k.d(n.ON_RESUME);
                this.f966h = false;
            } else {
                Handler handler = this.f968j;
                r6.k.c(handler);
                handler.removeCallbacks(this.f970l);
            }
        }
    }

    @Override // androidx.lifecycle.v
    public final x f() {
        return this.f969k;
    }
}
