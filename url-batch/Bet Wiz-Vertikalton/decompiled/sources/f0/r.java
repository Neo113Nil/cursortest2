package f0;

import android.view.View;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public T.g f2283a;

    /* renamed from: b, reason: collision with root package name */
    public int f2284b;

    /* renamed from: c, reason: collision with root package name */
    public int f2285c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2286e;

    public r() {
        d();
    }

    public final void a() {
        this.f2285c = this.d ? this.f2283a.g() : this.f2283a.k();
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.f2285c = this.f2283a.m() + this.f2283a.b(view);
        } else {
            this.f2285c = this.f2283a.e(view);
        }
        this.f2284b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f2283a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f2284b = i;
        if (!this.d) {
            int e2 = this.f2283a.e(view);
            int k2 = e2 - this.f2283a.k();
            this.f2285c = e2;
            if (k2 > 0) {
                int g2 = (this.f2283a.g() - Math.min(0, (this.f2283a.g() - m2) - this.f2283a.b(view))) - (this.f2283a.c(view) + e2);
                if (g2 < 0) {
                    this.f2285c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f2283a.g() - m2) - this.f2283a.b(view);
        this.f2285c = this.f2283a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f2285c - this.f2283a.c(view);
            int k3 = this.f2283a.k();
            int min = c2 - (Math.min(this.f2283a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f2285c = Math.min(g3, -min) + this.f2285c;
            }
        }
    }

    public final void d() {
        this.f2284b = -1;
        this.f2285c = Integer.MIN_VALUE;
        this.d = false;
        this.f2286e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2284b + ", mCoordinate=" + this.f2285c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f2286e + '}';
    }
}
