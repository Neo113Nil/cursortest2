package g1;

import android.view.View;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public androidx.emoji2.text.g f1630a;

    /* renamed from: b, reason: collision with root package name */
    public int f1631b;

    /* renamed from: c, reason: collision with root package name */
    public int f1632c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1633e;

    public d0() {
        d();
    }

    public final void a() {
        this.f1632c = this.d ? this.f1630a.g() : this.f1630a.k();
    }

    public final void b(View view, int i) {
        if (this.d) {
            int b2 = this.f1630a.b(view);
            androidx.emoji2.text.g gVar = this.f1630a;
            this.f1632c = (Integer.MIN_VALUE == gVar.f448a ? 0 : gVar.l() - gVar.f448a) + b2;
        } else {
            this.f1632c = this.f1630a.e(view);
        }
        this.f1631b = i;
    }

    public final void c(View view, int i) {
        androidx.emoji2.text.g gVar = this.f1630a;
        int l4 = Integer.MIN_VALUE == gVar.f448a ? 0 : gVar.l() - gVar.f448a;
        if (l4 >= 0) {
            b(view, i);
            return;
        }
        this.f1631b = i;
        if (!this.d) {
            int e4 = this.f1630a.e(view);
            int k4 = e4 - this.f1630a.k();
            this.f1632c = e4;
            if (k4 > 0) {
                int g3 = (this.f1630a.g() - Math.min(0, (this.f1630a.g() - l4) - this.f1630a.b(view))) - (this.f1630a.c(view) + e4);
                if (g3 < 0) {
                    this.f1632c -= Math.min(k4, -g3);
                    return;
                }
                return;
            }
            return;
        }
        int g5 = (this.f1630a.g() - l4) - this.f1630a.b(view);
        this.f1632c = this.f1630a.g() - g5;
        if (g5 > 0) {
            int c5 = this.f1632c - this.f1630a.c(view);
            int k5 = this.f1630a.k();
            int min = c5 - (Math.min(this.f1630a.e(view) - k5, 0) + k5);
            if (min < 0) {
                this.f1632c = Math.min(g5, -min) + this.f1632c;
            }
        }
    }

    public final void d() {
        this.f1631b = -1;
        this.f1632c = Integer.MIN_VALUE;
        this.d = false;
        this.f1633e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f1631b + ", mCoordinate=" + this.f1632c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f1633e + '}';
    }
}
