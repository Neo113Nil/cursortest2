package f0;

import android.view.View;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public T.g f2150a;

    /* renamed from: b, reason: collision with root package name */
    public int f2151b;

    /* renamed from: c, reason: collision with root package name */
    public int f2152c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2153e;

    public r() {
        d();
    }

    public final void a() {
        this.f2152c = this.d ? this.f2150a.g() : this.f2150a.k();
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.f2152c = this.f2150a.m() + this.f2150a.b(view);
        } else {
            this.f2152c = this.f2150a.e(view);
        }
        this.f2151b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f2150a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f2151b = i;
        if (!this.d) {
            int e2 = this.f2150a.e(view);
            int k2 = e2 - this.f2150a.k();
            this.f2152c = e2;
            if (k2 > 0) {
                int g2 = (this.f2150a.g() - Math.min(0, (this.f2150a.g() - m2) - this.f2150a.b(view))) - (this.f2150a.c(view) + e2);
                if (g2 < 0) {
                    this.f2152c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f2150a.g() - m2) - this.f2150a.b(view);
        this.f2152c = this.f2150a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f2152c - this.f2150a.c(view);
            int k3 = this.f2150a.k();
            int min = c2 - (Math.min(this.f2150a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f2152c = Math.min(g3, -min) + this.f2152c;
            }
        }
    }

    public final void d() {
        this.f2151b = -1;
        this.f2152c = Integer.MIN_VALUE;
        this.d = false;
        this.f2153e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2151b + ", mCoordinate=" + this.f2152c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f2153e + '}';
    }
}
