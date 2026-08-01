package f0;

import android.view.View;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public T.h f2332a;

    /* renamed from: b, reason: collision with root package name */
    public int f2333b;

    /* renamed from: c, reason: collision with root package name */
    public int f2334c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2335e;

    public r() {
        d();
    }

    public final void a() {
        this.f2334c = this.d ? this.f2332a.g() : this.f2332a.k();
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.f2334c = this.f2332a.m() + this.f2332a.b(view);
        } else {
            this.f2334c = this.f2332a.e(view);
        }
        this.f2333b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f2332a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f2333b = i;
        if (!this.d) {
            int e2 = this.f2332a.e(view);
            int k2 = e2 - this.f2332a.k();
            this.f2334c = e2;
            if (k2 > 0) {
                int g2 = (this.f2332a.g() - Math.min(0, (this.f2332a.g() - m2) - this.f2332a.b(view))) - (this.f2332a.c(view) + e2);
                if (g2 < 0) {
                    this.f2334c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f2332a.g() - m2) - this.f2332a.b(view);
        this.f2334c = this.f2332a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f2334c - this.f2332a.c(view);
            int k3 = this.f2332a.k();
            int min = c2 - (Math.min(this.f2332a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f2334c = Math.min(g3, -min) + this.f2334c;
            }
        }
    }

    public final void d() {
        this.f2333b = -1;
        this.f2334c = Integer.MIN_VALUE;
        this.d = false;
        this.f2335e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2333b + ", mCoordinate=" + this.f2334c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f2335e + '}';
    }
}
