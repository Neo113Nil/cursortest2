package f0;

import android.view.View;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public T.g f2151a;

    /* renamed from: b, reason: collision with root package name */
    public int f2152b;

    /* renamed from: c, reason: collision with root package name */
    public int f2153c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2154e;

    public r() {
        d();
    }

    public final void a() {
        this.f2153c = this.d ? this.f2151a.g() : this.f2151a.k();
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.f2153c = this.f2151a.m() + this.f2151a.b(view);
        } else {
            this.f2153c = this.f2151a.e(view);
        }
        this.f2152b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f2151a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f2152b = i;
        if (!this.d) {
            int e2 = this.f2151a.e(view);
            int k2 = e2 - this.f2151a.k();
            this.f2153c = e2;
            if (k2 > 0) {
                int g2 = (this.f2151a.g() - Math.min(0, (this.f2151a.g() - m2) - this.f2151a.b(view))) - (this.f2151a.c(view) + e2);
                if (g2 < 0) {
                    this.f2153c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f2151a.g() - m2) - this.f2151a.b(view);
        this.f2153c = this.f2151a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f2153c - this.f2151a.c(view);
            int k3 = this.f2151a.k();
            int min = c2 - (Math.min(this.f2151a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f2153c = Math.min(g3, -min) + this.f2153c;
            }
        }
    }

    public final void d() {
        this.f2152b = -1;
        this.f2153c = Integer.MIN_VALUE;
        this.d = false;
        this.f2154e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2152b + ", mCoordinate=" + this.f2153c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f2154e + '}';
    }
}
