package g0;

import android.view.View;

/* renamed from: g0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133t {

    /* renamed from: a, reason: collision with root package name */
    public U.g f2478a;

    /* renamed from: b, reason: collision with root package name */
    public int f2479b;

    /* renamed from: c, reason: collision with root package name */
    public int f2480c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2481e;

    public C0133t() {
        d();
    }

    public final void a() {
        this.f2480c = this.d ? this.f2478a.g() : this.f2478a.k();
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.f2480c = this.f2478a.m() + this.f2478a.b(view);
        } else {
            this.f2480c = this.f2478a.e(view);
        }
        this.f2479b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f2478a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f2479b = i;
        if (!this.d) {
            int e2 = this.f2478a.e(view);
            int k2 = e2 - this.f2478a.k();
            this.f2480c = e2;
            if (k2 > 0) {
                int g2 = (this.f2478a.g() - Math.min(0, (this.f2478a.g() - m2) - this.f2478a.b(view))) - (this.f2478a.c(view) + e2);
                if (g2 < 0) {
                    this.f2480c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f2478a.g() - m2) - this.f2478a.b(view);
        this.f2480c = this.f2478a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f2480c - this.f2478a.c(view);
            int k3 = this.f2478a.k();
            int min = c2 - (Math.min(this.f2478a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f2480c = Math.min(g3, -min) + this.f2480c;
            }
        }
    }

    public final void d() {
        this.f2479b = -1;
        this.f2480c = Integer.MIN_VALUE;
        this.d = false;
        this.f2481e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2479b + ", mCoordinate=" + this.f2480c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f2481e + '}';
    }
}
