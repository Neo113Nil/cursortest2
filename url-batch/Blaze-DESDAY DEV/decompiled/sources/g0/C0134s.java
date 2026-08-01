package g0;

import android.view.View;

/* renamed from: g0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134s {

    /* renamed from: a, reason: collision with root package name */
    public U.g f2508a;

    /* renamed from: b, reason: collision with root package name */
    public int f2509b;

    /* renamed from: c, reason: collision with root package name */
    public int f2510c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2511e;

    public C0134s() {
        d();
    }

    public final void a() {
        this.f2510c = this.d ? this.f2508a.g() : this.f2508a.k();
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.f2510c = this.f2508a.m() + this.f2508a.b(view);
        } else {
            this.f2510c = this.f2508a.e(view);
        }
        this.f2509b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f2508a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f2509b = i;
        if (!this.d) {
            int e2 = this.f2508a.e(view);
            int k2 = e2 - this.f2508a.k();
            this.f2510c = e2;
            if (k2 > 0) {
                int g2 = (this.f2508a.g() - Math.min(0, (this.f2508a.g() - m2) - this.f2508a.b(view))) - (this.f2508a.c(view) + e2);
                if (g2 < 0) {
                    this.f2510c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f2508a.g() - m2) - this.f2508a.b(view);
        this.f2510c = this.f2508a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f2510c - this.f2508a.c(view);
            int k3 = this.f2508a.k();
            int min = c2 - (Math.min(this.f2508a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f2510c = Math.min(g3, -min) + this.f2510c;
            }
        }
    }

    public final void d() {
        this.f2509b = -1;
        this.f2510c = Integer.MIN_VALUE;
        this.d = false;
        this.f2511e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2509b + ", mCoordinate=" + this.f2510c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f2511e + '}';
    }
}
