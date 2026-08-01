package g0;

import android.view.View;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public U.g f2919a;

    /* renamed from: b, reason: collision with root package name */
    public int f2920b;

    /* renamed from: c, reason: collision with root package name */
    public int f2921c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2922e;

    public r() {
        d();
    }

    public final void a() {
        this.f2921c = this.d ? this.f2919a.g() : this.f2919a.k();
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.f2921c = this.f2919a.m() + this.f2919a.b(view);
        } else {
            this.f2921c = this.f2919a.e(view);
        }
        this.f2920b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f2919a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f2920b = i;
        if (!this.d) {
            int e2 = this.f2919a.e(view);
            int k2 = e2 - this.f2919a.k();
            this.f2921c = e2;
            if (k2 > 0) {
                int g2 = (this.f2919a.g() - Math.min(0, (this.f2919a.g() - m2) - this.f2919a.b(view))) - (this.f2919a.c(view) + e2);
                if (g2 < 0) {
                    this.f2921c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f2919a.g() - m2) - this.f2919a.b(view);
        this.f2921c = this.f2919a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f2921c - this.f2919a.c(view);
            int k3 = this.f2919a.k();
            int min = c2 - (Math.min(this.f2919a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f2921c = Math.min(g3, -min) + this.f2921c;
            }
        }
    }

    public final void d() {
        this.f2920b = -1;
        this.f2921c = Integer.MIN_VALUE;
        this.d = false;
        this.f2922e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2920b + ", mCoordinate=" + this.f2921c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f2922e + '}';
    }
}
