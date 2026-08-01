package f0;

import android.view.View;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public T.g f2258a;

    /* renamed from: b, reason: collision with root package name */
    public int f2259b;

    /* renamed from: c, reason: collision with root package name */
    public int f2260c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2261e;

    public r() {
        d();
    }

    public final void a() {
        this.f2260c = this.d ? this.f2258a.g() : this.f2258a.k();
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.f2260c = this.f2258a.m() + this.f2258a.b(view);
        } else {
            this.f2260c = this.f2258a.e(view);
        }
        this.f2259b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f2258a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f2259b = i;
        if (!this.d) {
            int e2 = this.f2258a.e(view);
            int k2 = e2 - this.f2258a.k();
            this.f2260c = e2;
            if (k2 > 0) {
                int g2 = (this.f2258a.g() - Math.min(0, (this.f2258a.g() - m2) - this.f2258a.b(view))) - (this.f2258a.c(view) + e2);
                if (g2 < 0) {
                    this.f2260c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f2258a.g() - m2) - this.f2258a.b(view);
        this.f2260c = this.f2258a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f2260c - this.f2258a.c(view);
            int k3 = this.f2258a.k();
            int min = c2 - (Math.min(this.f2258a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f2260c = Math.min(g3, -min) + this.f2260c;
            }
        }
    }

    public final void d() {
        this.f2259b = -1;
        this.f2260c = Integer.MIN_VALUE;
        this.d = false;
        this.f2261e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2259b + ", mCoordinate=" + this.f2260c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f2261e + '}';
    }
}
