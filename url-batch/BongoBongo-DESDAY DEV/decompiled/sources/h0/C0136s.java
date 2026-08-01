package h0;

import android.view.View;

/* renamed from: h0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136s {

    /* renamed from: a, reason: collision with root package name */
    public V.g f2605a;

    /* renamed from: b, reason: collision with root package name */
    public int f2606b;

    /* renamed from: c, reason: collision with root package name */
    public int f2607c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2608e;

    public C0136s() {
        d();
    }

    public final void a() {
        this.f2607c = this.d ? this.f2605a.g() : this.f2605a.k();
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.f2607c = this.f2605a.m() + this.f2605a.b(view);
        } else {
            this.f2607c = this.f2605a.e(view);
        }
        this.f2606b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f2605a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f2606b = i;
        if (!this.d) {
            int e2 = this.f2605a.e(view);
            int k2 = e2 - this.f2605a.k();
            this.f2607c = e2;
            if (k2 > 0) {
                int g2 = (this.f2605a.g() - Math.min(0, (this.f2605a.g() - m2) - this.f2605a.b(view))) - (this.f2605a.c(view) + e2);
                if (g2 < 0) {
                    this.f2607c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f2605a.g() - m2) - this.f2605a.b(view);
        this.f2607c = this.f2605a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f2607c - this.f2605a.c(view);
            int k3 = this.f2605a.k();
            int min = c2 - (Math.min(this.f2605a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f2607c = Math.min(g3, -min) + this.f2607c;
            }
        }
    }

    public final void d() {
        this.f2606b = -1;
        this.f2607c = Integer.MIN_VALUE;
        this.d = false;
        this.f2608e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2606b + ", mCoordinate=" + this.f2607c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f2608e + '}';
    }
}
