package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class uc {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public uc(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
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

    public final void b(ed edVar, b8 b8Var) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int max2;
        boolean z;
        int baseline;
        int i;
        if (edVar == null) {
            return;
        }
        pc pcVar = edVar.K;
        pc pcVar2 = edVar.I;
        if (edVar.g0 == 8) {
            b8Var.e = 0;
            b8Var.f = 0;
            b8Var.g = 0;
            return;
        }
        if (edVar.T == null) {
            return;
        }
        a30 a30Var = ConstraintLayout.u;
        int i2 = b8Var.a;
        int i3 = b8Var.b;
        int i4 = b8Var.c;
        int i5 = b8Var.d;
        int i6 = this.b + this.c;
        int i7 = this.d;
        View view = edVar.f0;
        int i8 = o30.i(i2);
        if (i8 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (i8 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
        } else if (i8 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
            boolean z2 = edVar.r == 1;
            int i9 = b8Var.j;
            if (i9 == 1 || i9 == 2) {
                boolean z3 = view.getMeasuredHeight() == edVar.k();
                if (b8Var.j == 2 || !z2 || ((z2 && z3) || edVar.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(edVar.q(), 1073741824);
                }
            }
        } else if (i8 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i10 = this.f;
            int i11 = pcVar2 != null ? pcVar2.g : 0;
            if (pcVar != null) {
                i11 += pcVar.g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i7 + i11, -1);
        }
        int i12 = o30.i(i3);
        if (i12 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (i12 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
        } else if (i12 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
            boolean z4 = edVar.s == 1;
            int i13 = b8Var.j;
            if (i13 == 1 || i13 == 2) {
                boolean z5 = view.getMeasuredWidth() == edVar.q();
                if (b8Var.j == 2 || !z4 || ((z4 && z5) || edVar.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(edVar.k(), 1073741824);
                }
            }
        } else if (i12 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i14 = this.g;
            int i15 = pcVar2 != null ? edVar.J.g : 0;
            if (pcVar != null) {
                i15 += edVar.L.g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i6 + i15, -1);
        }
        fd fdVar = (fd) edVar.T;
        ConstraintLayout constraintLayout = this.h;
        if (fdVar != null && l70.o(constraintLayout.n, 256) && view.getMeasuredWidth() == edVar.q() && view.getMeasuredWidth() < fdVar.q() && view.getMeasuredHeight() == edVar.k() && view.getMeasuredHeight() < fdVar.k() && view.getBaseline() == edVar.a0 && !edVar.z() && a(edVar.G, makeMeasureSpec, edVar.q()) && a(edVar.H, makeMeasureSpec2, edVar.k())) {
            b8Var.e = edVar.q();
            b8Var.f = edVar.k();
            b8Var.g = edVar.a0;
            return;
        }
        boolean z6 = i2 == 3;
        boolean z7 = i3 == 3;
        boolean z8 = i3 == 4 || i3 == 1;
        boolean z9 = i2 == 4 || i2 == 1;
        boolean z10 = z6 && edVar.W > 0.0f;
        boolean z11 = z7 && edVar.W > 0.0f;
        if (view == null) {
            return;
        }
        tc tcVar = (tc) view.getLayoutParams();
        int i16 = b8Var.j;
        if (i16 != 1 && i16 != 2 && z6 && edVar.r == 0 && z7 && edVar.s == 0) {
            i = -1;
            z = false;
            baseline = 0;
            max2 = 0;
            max = 0;
        } else {
            if ((view instanceof la0) && (edVar instanceof fj)) {
                ((la0) view).j((fj) edVar, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            edVar.G = makeMeasureSpec;
            edVar.H = makeMeasureSpec2;
            edVar.g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = edVar.u;
            max = i17 > 0 ? Math.max(i17, measuredWidth) : measuredWidth;
            int i18 = edVar.v;
            if (i18 > 0) {
                max = Math.min(i18, max);
            }
            int i19 = edVar.x;
            max2 = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = makeMeasureSpec2;
            int i21 = edVar.y;
            if (i21 > 0) {
                max2 = Math.min(i21, max2);
            }
            if (!l70.o(constraintLayout.n, 1)) {
                if (z10 && z8) {
                    max = (int) ((max2 * edVar.W) + 0.5f);
                } else if (z11 && z9) {
                    max2 = (int) ((max / edVar.W) + 0.5f);
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
                int makeMeasureSpec3 = measuredHeight != max2 ? View.MeasureSpec.makeMeasureSpec(max2, 1073741824) : i20;
                view.measure(makeMeasureSpec, makeMeasureSpec3);
                edVar.G = makeMeasureSpec;
                edVar.H = makeMeasureSpec3;
                z = false;
                edVar.g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredWidth2;
                max2 = measuredHeight2;
                i = -1;
            }
        }
        boolean z12 = baseline != i ? true : z;
        b8Var.i = (max == b8Var.c && max2 == b8Var.d) ? z : true;
        boolean z13 = tcVar.c0 ? true : z12;
        if (z13 && baseline != -1 && edVar.a0 != baseline) {
            b8Var.i = true;
        }
        b8Var.e = max;
        b8Var.f = max2;
        b8Var.h = z13;
        b8Var.g = baseline;
    }
}
