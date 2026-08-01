package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class qd {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public qd(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
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

    public final void b(ae aeVar, i8 i8Var) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int max2;
        boolean z;
        int baseline;
        int i;
        if (aeVar == null) {
            return;
        }
        ld ldVar = aeVar.K;
        ld ldVar2 = aeVar.I;
        if (aeVar.g0 == 8) {
            i8Var.e = 0;
            i8Var.f = 0;
            i8Var.g = 0;
            return;
        }
        if (aeVar.T == null) {
            return;
        }
        r50 r50Var = ConstraintLayout.u;
        int i2 = i8Var.a;
        int i3 = i8Var.b;
        int i4 = i8Var.c;
        int i5 = i8Var.d;
        int i6 = this.b + this.c;
        int i7 = this.d;
        View view = aeVar.f0;
        int j = f60.j(i2);
        if (j == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (j == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
        } else if (j == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
            boolean z2 = aeVar.r == 1;
            int i8 = i8Var.j;
            if (i8 == 1 || i8 == 2) {
                boolean z3 = view.getMeasuredHeight() == aeVar.k();
                if (i8Var.j == 2 || !z2 || ((z2 && z3) || aeVar.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(aeVar.q(), 1073741824);
                }
            }
        } else if (j != 3) {
            makeMeasureSpec = 0;
        } else {
            int i9 = this.f;
            int i10 = ldVar2 != null ? ldVar2.g : 0;
            if (ldVar != null) {
                i10 += ldVar.g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
        }
        int j2 = f60.j(i3);
        if (j2 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (j2 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
        } else if (j2 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
            boolean z4 = aeVar.s == 1;
            int i11 = i8Var.j;
            if (i11 == 1 || i11 == 2) {
                boolean z5 = view.getMeasuredWidth() == aeVar.q();
                if (i8Var.j == 2 || !z4 || ((z4 && z5) || aeVar.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(aeVar.k(), 1073741824);
                }
            }
        } else if (j2 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i12 = this.g;
            int i13 = ldVar2 != null ? aeVar.J.g : 0;
            if (ldVar != null) {
                i13 += aeVar.L.g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i6 + i13, -1);
        }
        be beVar = (be) aeVar.T;
        ConstraintLayout constraintLayout = this.h;
        if (beVar != null && kr.s(constraintLayout.n, 256) && view.getMeasuredWidth() == aeVar.q() && view.getMeasuredWidth() < beVar.q() && view.getMeasuredHeight() == aeVar.k() && view.getMeasuredHeight() < beVar.k() && view.getBaseline() == aeVar.a0 && !aeVar.z() && a(aeVar.G, makeMeasureSpec, aeVar.q()) && a(aeVar.H, makeMeasureSpec2, aeVar.k())) {
            i8Var.e = aeVar.q();
            i8Var.f = aeVar.k();
            i8Var.g = aeVar.a0;
            return;
        }
        boolean z6 = i2 == 3;
        boolean z7 = i3 == 3;
        boolean z8 = i3 == 4 || i3 == 1;
        boolean z9 = i2 == 4 || i2 == 1;
        boolean z10 = z6 && aeVar.W > 0.0f;
        boolean z11 = z7 && aeVar.W > 0.0f;
        if (view == null) {
            return;
        }
        pd pdVar = (pd) view.getLayoutParams();
        int i14 = i8Var.j;
        if (i14 != 1 && i14 != 2 && z6 && aeVar.r == 0 && z7 && aeVar.s == 0) {
            i = -1;
            z = false;
            baseline = 0;
            max2 = 0;
            max = 0;
        } else {
            if ((view instanceof md0) && (aeVar instanceof ol)) {
                ((md0) view).j((ol) aeVar, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            aeVar.G = makeMeasureSpec;
            aeVar.H = makeMeasureSpec2;
            aeVar.g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i15 = aeVar.u;
            max = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
            int i16 = aeVar.v;
            if (i16 > 0) {
                max = Math.min(i16, max);
            }
            int i17 = aeVar.x;
            max2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = makeMeasureSpec2;
            int i19 = aeVar.y;
            if (i19 > 0) {
                max2 = Math.min(i19, max2);
            }
            if (!kr.s(constraintLayout.n, 1)) {
                if (z10 && z8) {
                    max = (int) ((max2 * aeVar.W) + 0.5f);
                } else if (z11 && z9) {
                    max2 = (int) ((max / aeVar.W) + 0.5f);
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
                aeVar.G = makeMeasureSpec;
                aeVar.H = makeMeasureSpec3;
                z = false;
                aeVar.g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredWidth2;
                max2 = measuredHeight2;
                i = -1;
            }
        }
        boolean z12 = baseline != i ? true : z;
        i8Var.i = (max == i8Var.c && max2 == i8Var.d) ? z : true;
        boolean z13 = pdVar.c0 ? true : z12;
        if (z13 && baseline != -1 && aeVar.a0 != baseline) {
            i8Var.i = true;
        }
        i8Var.e = max;
        i8Var.f = max2;
        i8Var.h = z13;
        i8Var.g = baseline;
    }
}
