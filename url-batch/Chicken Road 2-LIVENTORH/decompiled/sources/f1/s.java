package f1;

import android.view.View;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public androidx.emoji2.text.g f1486a;

    /* renamed from: b, reason: collision with root package name */
    public int f1487b;

    /* renamed from: c, reason: collision with root package name */
    public int f1488c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1489e;

    public s() {
        d();
    }

    public final void a() {
        this.f1488c = this.d ? this.f1486a.g() : this.f1486a.k();
    }

    public final void b(View view, int i) {
        if (this.d) {
            int b4 = this.f1486a.b(view);
            androidx.emoji2.text.g gVar = this.f1486a;
            this.f1488c = (Integer.MIN_VALUE == gVar.f325a ? 0 : gVar.l() - gVar.f325a) + b4;
        } else {
            this.f1488c = this.f1486a.e(view);
        }
        this.f1487b = i;
    }

    public final void c(View view, int i) {
        androidx.emoji2.text.g gVar = this.f1486a;
        int l4 = Integer.MIN_VALUE == gVar.f325a ? 0 : gVar.l() - gVar.f325a;
        if (l4 >= 0) {
            b(view, i);
            return;
        }
        this.f1487b = i;
        if (!this.d) {
            int e4 = this.f1486a.e(view);
            int k4 = e4 - this.f1486a.k();
            this.f1488c = e4;
            if (k4 > 0) {
                int g4 = (this.f1486a.g() - Math.min(0, (this.f1486a.g() - l4) - this.f1486a.b(view))) - (this.f1486a.c(view) + e4);
                if (g4 < 0) {
                    this.f1488c -= Math.min(k4, -g4);
                    return;
                }
                return;
            }
            return;
        }
        int g5 = (this.f1486a.g() - l4) - this.f1486a.b(view);
        this.f1488c = this.f1486a.g() - g5;
        if (g5 > 0) {
            int c4 = this.f1488c - this.f1486a.c(view);
            int k5 = this.f1486a.k();
            int min = c4 - (Math.min(this.f1486a.e(view) - k5, 0) + k5);
            if (min < 0) {
                this.f1488c = Math.min(g5, -min) + this.f1488c;
            }
        }
    }

    public final void d() {
        this.f1487b = -1;
        this.f1488c = Integer.MIN_VALUE;
        this.d = false;
        this.f1489e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f1487b + ", mCoordinate=" + this.f1488c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f1489e + '}';
    }
}
