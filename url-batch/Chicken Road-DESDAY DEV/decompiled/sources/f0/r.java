package f0;

import android.view.View;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public T.g f2216a;

    /* renamed from: b, reason: collision with root package name */
    public int f2217b;

    /* renamed from: c, reason: collision with root package name */
    public int f2218c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2219e;

    public r() {
        d();
    }

    public final void a() {
        this.f2218c = this.d ? this.f2216a.g() : this.f2216a.k();
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.f2218c = this.f2216a.m() + this.f2216a.b(view);
        } else {
            this.f2218c = this.f2216a.e(view);
        }
        this.f2217b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f2216a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f2217b = i;
        if (!this.d) {
            int e2 = this.f2216a.e(view);
            int k2 = e2 - this.f2216a.k();
            this.f2218c = e2;
            if (k2 > 0) {
                int g2 = (this.f2216a.g() - Math.min(0, (this.f2216a.g() - m2) - this.f2216a.b(view))) - (this.f2216a.c(view) + e2);
                if (g2 < 0) {
                    this.f2218c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f2216a.g() - m2) - this.f2216a.b(view);
        this.f2218c = this.f2216a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f2218c - this.f2216a.c(view);
            int k3 = this.f2216a.k();
            int min = c2 - (Math.min(this.f2216a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f2218c = Math.min(g3, -min) + this.f2218c;
            }
        }
    }

    public final void d() {
        this.f2217b = -1;
        this.f2218c = Integer.MIN_VALUE;
        this.d = false;
        this.f2219e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2217b + ", mCoordinate=" + this.f2218c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f2219e + '}';
    }
}
