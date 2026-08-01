package e0;

import android.view.View;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public T.g f2331a;

    /* renamed from: b, reason: collision with root package name */
    public int f2332b;

    /* renamed from: c, reason: collision with root package name */
    public int f2333c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2334d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2335e;

    public r() {
        d();
    }

    public final void a() {
        this.f2333c = this.f2334d ? this.f2331a.g() : this.f2331a.k();
    }

    public final void b(View view, int i) {
        if (this.f2334d) {
            this.f2333c = this.f2331a.m() + this.f2331a.b(view);
        } else {
            this.f2333c = this.f2331a.e(view);
        }
        this.f2332b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f2331a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f2332b = i;
        if (!this.f2334d) {
            int e2 = this.f2331a.e(view);
            int k2 = e2 - this.f2331a.k();
            this.f2333c = e2;
            if (k2 > 0) {
                int g2 = (this.f2331a.g() - Math.min(0, (this.f2331a.g() - m2) - this.f2331a.b(view))) - (this.f2331a.c(view) + e2);
                if (g2 < 0) {
                    this.f2333c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f2331a.g() - m2) - this.f2331a.b(view);
        this.f2333c = this.f2331a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f2333c - this.f2331a.c(view);
            int k3 = this.f2331a.k();
            int min = c2 - (Math.min(this.f2331a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f2333c = Math.min(g3, -min) + this.f2333c;
            }
        }
    }

    public final void d() {
        this.f2332b = -1;
        this.f2333c = Integer.MIN_VALUE;
        this.f2334d = false;
        this.f2335e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2332b + ", mCoordinate=" + this.f2333c + ", mLayoutFromEnd=" + this.f2334d + ", mValid=" + this.f2335e + '}';
    }
}
