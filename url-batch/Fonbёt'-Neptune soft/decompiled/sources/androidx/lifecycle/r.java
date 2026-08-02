package androidx.lifecycle;

import D0.RunnableC0043c;
import android.os.Handler;

/* loaded from: classes.dex */
public final class r implements l {

    /* renamed from: m, reason: collision with root package name */
    public static final r f1786m = new r();

    /* renamed from: e, reason: collision with root package name */
    public int f1787e;

    /* renamed from: f, reason: collision with root package name */
    public int f1788f;

    /* renamed from: i, reason: collision with root package name */
    public Handler f1791i;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1789g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1790h = true;

    /* renamed from: j, reason: collision with root package name */
    public final n f1792j = new n(this);

    /* renamed from: k, reason: collision with root package name */
    public final RunnableC0043c f1793k = new RunnableC0043c(1, this);

    /* renamed from: l, reason: collision with root package name */
    public final B.m f1794l = new B.m(16, this);

    @Override // androidx.lifecycle.l
    public final n a() {
        return this.f1792j;
    }

    public final void b() {
        int i2 = this.f1788f + 1;
        this.f1788f = i2;
        if (i2 == 1) {
            if (this.f1789g) {
                this.f1792j.c(f.ON_RESUME);
                this.f1789g = false;
            } else {
                Handler handler = this.f1791i;
                Q0.h.b(handler);
                handler.removeCallbacks(this.f1793k);
            }
        }
    }
}
