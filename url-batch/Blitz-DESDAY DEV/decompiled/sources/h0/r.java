package h0;

import android.view.View;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public V.g f2574a;

    /* renamed from: b, reason: collision with root package name */
    public int f2575b;

    /* renamed from: c, reason: collision with root package name */
    public int f2576c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2577e;

    public r() {
        d();
    }

    public final void a() {
        this.f2576c = this.d ? this.f2574a.g() : this.f2574a.k();
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.f2576c = this.f2574a.m() + this.f2574a.b(view);
        } else {
            this.f2576c = this.f2574a.e(view);
        }
        this.f2575b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f2574a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f2575b = i;
        if (!this.d) {
            int e2 = this.f2574a.e(view);
            int k2 = e2 - this.f2574a.k();
            this.f2576c = e2;
            if (k2 > 0) {
                int g2 = (this.f2574a.g() - Math.min(0, (this.f2574a.g() - m2) - this.f2574a.b(view))) - (this.f2574a.c(view) + e2);
                if (g2 < 0) {
                    this.f2576c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f2574a.g() - m2) - this.f2574a.b(view);
        this.f2576c = this.f2574a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f2576c - this.f2574a.c(view);
            int k3 = this.f2574a.k();
            int min = c2 - (Math.min(this.f2574a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f2576c = Math.min(g3, -min) + this.f2576c;
            }
        }
    }

    public final void d() {
        this.f2575b = -1;
        this.f2576c = Integer.MIN_VALUE;
        this.d = false;
        this.f2577e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2575b + ", mCoordinate=" + this.f2576c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f2577e + '}';
    }
}
