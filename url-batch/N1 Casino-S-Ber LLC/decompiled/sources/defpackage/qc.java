package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class qc {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public qc(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void b(ad adVar, v7 v7Var) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int max2;
        boolean z;
        int baseline;
        int i;
        if (adVar == null) {
            return;
        }
        lc lcVar = adVar.K;
        lc lcVar2 = adVar.I;
        if (adVar.g0 == 8) {
            v7Var.e = 0;
            v7Var.f = 0;
            v7Var.g = 0;
            return;
        }
        if (adVar.T == null) {
            return;
        }
        p20 p20Var = ConstraintLayout.u;
        int i2 = v7Var.a;
        int i3 = v7Var.b;
        int i4 = v7Var.c;
        int i5 = v7Var.d;
        int i6 = this.b + this.c;
        int i7 = this.d;
        View view = adVar.f0;
        int h = d30.h(i2);
        if (h == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (h == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
        } else if (h == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
            boolean z2 = adVar.r == 1;
            int i8 = v7Var.j;
            if (i8 == 1 || i8 == 2) {
                boolean z3 = view.getMeasuredHeight() == adVar.k();
                if (v7Var.j == 2 || !z2 || ((z2 && z3) || adVar.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(adVar.q(), 1073741824);
                }
            }
        } else if (h != 3) {
            makeMeasureSpec = 0;
        } else {
            int i9 = this.f;
            int i10 = lcVar2 != null ? lcVar2.g : 0;
            if (lcVar != null) {
                i10 += lcVar.g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
        }
        int h2 = d30.h(i3);
        if (h2 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (h2 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
        } else if (h2 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
            boolean z4 = adVar.s == 1;
            int i11 = v7Var.j;
            if (i11 == 1 || i11 == 2) {
                boolean z5 = view.getMeasuredWidth() == adVar.q();
                if (v7Var.j == 2 || !z4 || ((z4 && z5) || adVar.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(adVar.k(), 1073741824);
                }
            }
        } else if (h2 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i12 = this.g;
            int i13 = lcVar2 != null ? adVar.J.g : 0;
            if (lcVar != null) {
                i13 += adVar.L.g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i6 + i13, -1);
        }
        bd bdVar = (bd) adVar.T;
        ConstraintLayout constraintLayout = this.h;
        if (bdVar != null && zo.p(constraintLayout.n, 256) && view.getMeasuredWidth() == adVar.q() && view.getMeasuredWidth() < bdVar.q() && view.getMeasuredHeight() == adVar.k() && view.getMeasuredHeight() < bdVar.k() && view.getBaseline() == adVar.a0 && !adVar.z() && a(adVar.G, makeMeasureSpec, adVar.q()) && a(adVar.H, makeMeasureSpec2, adVar.k())) {
            v7Var.e = adVar.q();
            v7Var.f = adVar.k();
            v7Var.g = adVar.a0;
            return;
        }
        boolean z6 = i2 == 3;
        boolean z7 = i3 == 3;
        boolean z8 = i3 == 4 || i3 == 1;
        boolean z9 = i2 == 4 || i2 == 1;
        boolean z10 = z6 && adVar.W > 0.0f;
        boolean z11 = z7 && adVar.W > 0.0f;
        if (view == null) {
            return;
        }
        pc pcVar = (pc) view.getLayoutParams();
        int i14 = v7Var.j;
        if (i14 != 1 && i14 != 2 && z6 && adVar.r == 0 && z7 && adVar.s == 0) {
            i = -1;
            z = false;
            baseline = 0;
            max2 = 0;
            max = 0;
        } else {
            if ((view instanceof ea0) && (adVar instanceof lj)) {
                ((ea0) view).j((lj) adVar, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            adVar.G = makeMeasureSpec;
            adVar.H = makeMeasureSpec2;
            adVar.g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i15 = adVar.u;
            max = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
            int i16 = adVar.v;
            if (i16 > 0) {
                max = Math.min(i16, max);
            }
            int i17 = adVar.x;
            max2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = makeMeasureSpec2;
            int i19 = adVar.y;
            if (i19 > 0) {
                max2 = Math.min(i19, max2);
            }
            if (!zo.p(constraintLayout.n, 1)) {
                if (z10 && z8) {
                    max = (int) ((max2 * adVar.W) + 0.5f);
                } else if (z11 && z9) {
                    max2 = (int) ((max / adVar.W) + 0.5f);
                }
            }
            if (measuredWidth == max && measuredHeight == max2) {
                baseline = baseline2;
                i = -1;
                z = false;
            } else {
                if (measuredWidth != max) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                }
                int makeMeasureSpec3 = measuredHeight != max2 ? View.MeasureSpec.makeMeasureSpec(max2, 1073741824) : i18;
                view.measure(makeMeasureSpec, makeMeasureSpec3);
                adVar.G = makeMeasureSpec;
                adVar.H = makeMeasureSpec3;
                z = false;
                adVar.g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredWidth2;
                max2 = measuredHeight2;
                i = -1;
            }
        }
        boolean z12 = baseline != i ? true : z;
        v7Var.i = (max == v7Var.c && max2 == v7Var.d) ? z : true;
        boolean z13 = pcVar.c0 ? true : z12;
        if (z13 && baseline != -1 && adVar.a0 != baseline) {
            v7Var.i = true;
        }
        v7Var.e = max;
        v7Var.f = max2;
        v7Var.h = z13;
        v7Var.g = baseline;
    }
}
