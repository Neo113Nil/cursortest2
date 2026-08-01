package androidx.lifecycle;

import android.os.Handler;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b0 implements r {

    /* renamed from: n, reason: collision with root package name */
    public static final b0 f570n = new b0();

    /* renamed from: f, reason: collision with root package name */
    public int f571f;
    public int g;

    /* renamed from: j, reason: collision with root package name */
    public Handler f573j;
    public boolean h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f572i = true;

    /* renamed from: k, reason: collision with root package name */
    public final t f574k = new t(this);

    /* renamed from: l, reason: collision with root package name */
    public final a2.r f575l = new a2.r(4, this);

    /* renamed from: m, reason: collision with root package name */
    public final a2.e f576m = new a2.e(6, this);

    public final void b() {
        int i4 = this.g + 1;
        this.g = i4;
        if (i4 == 1) {
            if (this.h) {
                this.f574k.d(l.ON_RESUME);
                this.h = false;
            } else {
                Handler handler = this.f573j;
                u2.c.b(handler);
                handler.removeCallbacks(this.f575l);
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final t f() {
        return this.f574k;
    }
}
