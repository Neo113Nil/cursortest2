package f0;

import android.view.View;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public T.g f2147a;

    /* renamed from: b, reason: collision with root package name */
    public int f2148b;

    /* renamed from: c, reason: collision with root package name */
    public int f2149c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2150e;

    public r() {
        d();
    }

    public final void a() {
        this.f2149c = this.d ? this.f2147a.g() : this.f2147a.k();
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.f2149c = this.f2147a.m() + this.f2147a.b(view);
        } else {
            this.f2149c = this.f2147a.e(view);
        }
        this.f2148b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f2147a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f2148b = i;
        if (!this.d) {
            int e2 = this.f2147a.e(view);
            int k2 = e2 - this.f2147a.k();
            this.f2149c = e2;
            if (k2 > 0) {
                int g2 = (this.f2147a.g() - Math.min(0, (this.f2147a.g() - m2) - this.f2147a.b(view))) - (this.f2147a.c(view) + e2);
                if (g2 < 0) {
                    this.f2149c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f2147a.g() - m2) - this.f2147a.b(view);
        this.f2149c = this.f2147a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f2149c - this.f2147a.c(view);
            int k3 = this.f2147a.k();
            int min = c2 - (Math.min(this.f2147a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f2149c = Math.min(g3, -min) + this.f2149c;
            }
        }
    }

    public final void d() {
        this.f2148b = -1;
        this.f2149c = Integer.MIN_VALUE;
        this.d = false;
        this.f2150e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2148b + ", mCoordinate=" + this.f2149c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f2150e + '}';
    }
}
