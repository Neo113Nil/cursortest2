package h0;

import android.view.View;

/* renamed from: h0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167q {

    /* renamed from: a, reason: collision with root package name */
    public V.g f3097a;

    /* renamed from: b, reason: collision with root package name */
    public int f3098b;

    /* renamed from: c, reason: collision with root package name */
    public int f3099c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3100d;
    public boolean e;

    public C0167q() {
        d();
    }

    public final void a() {
        this.f3099c = this.f3100d ? this.f3097a.g() : this.f3097a.k();
    }

    public final void b(View view, int i) {
        if (this.f3100d) {
            this.f3099c = this.f3097a.m() + this.f3097a.b(view);
        } else {
            this.f3099c = this.f3097a.e(view);
        }
        this.f3098b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f3097a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f3098b = i;
        if (!this.f3100d) {
            int e = this.f3097a.e(view);
            int k2 = e - this.f3097a.k();
            this.f3099c = e;
            if (k2 > 0) {
                int g2 = (this.f3097a.g() - Math.min(0, (this.f3097a.g() - m2) - this.f3097a.b(view))) - (this.f3097a.c(view) + e);
                if (g2 < 0) {
                    this.f3099c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f3097a.g() - m2) - this.f3097a.b(view);
        this.f3099c = this.f3097a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f3099c - this.f3097a.c(view);
            int k3 = this.f3097a.k();
            int min = c2 - (Math.min(this.f3097a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f3099c = Math.min(g3, -min) + this.f3099c;
            }
        }
    }

    public final void d() {
        this.f3098b = -1;
        this.f3099c = Integer.MIN_VALUE;
        this.f3100d = false;
        this.e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f3098b + ", mCoordinate=" + this.f3099c + ", mLayoutFromEnd=" + this.f3100d + ", mValid=" + this.e + '}';
    }
}
