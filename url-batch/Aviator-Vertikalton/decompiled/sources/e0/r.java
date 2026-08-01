package e0;

import android.view.View;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public T.g f2327a;

    /* renamed from: b, reason: collision with root package name */
    public int f2328b;

    /* renamed from: c, reason: collision with root package name */
    public int f2329c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2330d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2331e;

    public r() {
        d();
    }

    public final void a() {
        this.f2329c = this.f2330d ? this.f2327a.g() : this.f2327a.k();
    }

    public final void b(View view, int i) {
        if (this.f2330d) {
            this.f2329c = this.f2327a.m() + this.f2327a.b(view);
        } else {
            this.f2329c = this.f2327a.e(view);
        }
        this.f2328b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f2327a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f2328b = i;
        if (!this.f2330d) {
            int e2 = this.f2327a.e(view);
            int k2 = e2 - this.f2327a.k();
            this.f2329c = e2;
            if (k2 > 0) {
                int g2 = (this.f2327a.g() - Math.min(0, (this.f2327a.g() - m2) - this.f2327a.b(view))) - (this.f2327a.c(view) + e2);
                if (g2 < 0) {
                    this.f2329c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f2327a.g() - m2) - this.f2327a.b(view);
        this.f2329c = this.f2327a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f2329c - this.f2327a.c(view);
            int k3 = this.f2327a.k();
            int min = c2 - (Math.min(this.f2327a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f2329c = Math.min(g3, -min) + this.f2329c;
            }
        }
    }

    public final void d() {
        this.f2328b = -1;
        this.f2329c = Integer.MIN_VALUE;
        this.f2330d = false;
        this.f2331e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2328b + ", mCoordinate=" + this.f2329c + ", mLayoutFromEnd=" + this.f2330d + ", mValid=" + this.f2331e + '}';
    }
}
