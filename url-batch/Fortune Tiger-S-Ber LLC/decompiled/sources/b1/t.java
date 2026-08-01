package b1;

import android.view.View;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public androidx.emoji2.text.g f913a;

    /* renamed from: b, reason: collision with root package name */
    public int f914b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f915d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f916e;

    public t() {
        d();
    }

    public final void a() {
        this.c = this.f915d ? this.f913a.g() : this.f913a.k();
    }

    public final void b(View view, int i4) {
        if (this.f915d) {
            int b2 = this.f913a.b(view);
            androidx.emoji2.text.g gVar = this.f913a;
            this.c = (Integer.MIN_VALUE == gVar.f336a ? 0 : gVar.l() - gVar.f336a) + b2;
        } else {
            this.c = this.f913a.e(view);
        }
        this.f914b = i4;
    }

    public final void c(View view, int i4) {
        androidx.emoji2.text.g gVar = this.f913a;
        int l4 = Integer.MIN_VALUE == gVar.f336a ? 0 : gVar.l() - gVar.f336a;
        if (l4 >= 0) {
            b(view, i4);
            return;
        }
        this.f914b = i4;
        if (!this.f915d) {
            int e4 = this.f913a.e(view);
            int k4 = e4 - this.f913a.k();
            this.c = e4;
            if (k4 > 0) {
                int g = (this.f913a.g() - Math.min(0, (this.f913a.g() - l4) - this.f913a.b(view))) - (this.f913a.c(view) + e4);
                if (g < 0) {
                    this.c -= Math.min(k4, -g);
                    return;
                }
                return;
            }
            return;
        }
        int g4 = (this.f913a.g() - l4) - this.f913a.b(view);
        this.c = this.f913a.g() - g4;
        if (g4 > 0) {
            int c = this.c - this.f913a.c(view);
            int k5 = this.f913a.k();
            int min = c - (Math.min(this.f913a.e(view) - k5, 0) + k5);
            if (min < 0) {
                this.c = Math.min(g4, -min) + this.c;
            }
        }
    }

    public final void d() {
        this.f914b = -1;
        this.c = Integer.MIN_VALUE;
        this.f915d = false;
        this.f916e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f914b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.f915d + ", mValid=" + this.f916e + '}';
    }
}
