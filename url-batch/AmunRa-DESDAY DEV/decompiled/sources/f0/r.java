package f0;

import android.view.View;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public T.g f2215a;

    /* renamed from: b, reason: collision with root package name */
    public int f2216b;

    /* renamed from: c, reason: collision with root package name */
    public int f2217c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2218e;

    public r() {
        d();
    }

    public final void a() {
        this.f2217c = this.d ? this.f2215a.g() : this.f2215a.k();
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.f2217c = this.f2215a.m() + this.f2215a.b(view);
        } else {
            this.f2217c = this.f2215a.e(view);
        }
        this.f2216b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f2215a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f2216b = i;
        if (!this.d) {
            int e2 = this.f2215a.e(view);
            int k2 = e2 - this.f2215a.k();
            this.f2217c = e2;
            if (k2 > 0) {
                int g2 = (this.f2215a.g() - Math.min(0, (this.f2215a.g() - m2) - this.f2215a.b(view))) - (this.f2215a.c(view) + e2);
                if (g2 < 0) {
                    this.f2217c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f2215a.g() - m2) - this.f2215a.b(view);
        this.f2217c = this.f2215a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f2217c - this.f2215a.c(view);
            int k3 = this.f2215a.k();
            int min = c2 - (Math.min(this.f2215a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f2217c = Math.min(g3, -min) + this.f2217c;
            }
        }
    }

    public final void d() {
        this.f2216b = -1;
        this.f2217c = Integer.MIN_VALUE;
        this.d = false;
        this.f2218e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2216b + ", mCoordinate=" + this.f2217c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f2218e + '}';
    }
}
