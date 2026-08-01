package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ef {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public ef(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
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

    public final void b(rf rfVar, t8 t8Var) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int baseline;
        int max;
        int max2;
        boolean z;
        int i;
        int childMeasureSpec;
        if (rfVar == null) {
            return;
        }
        xe xeVar = rfVar.K;
        xe xeVar2 = rfVar.I;
        if (rfVar.h0 == 8) {
            t8Var.e = 0;
            t8Var.f = 0;
            t8Var.g = 0;
            return;
        }
        if (rfVar.U == null) {
            return;
        }
        td0 td0Var = ConstraintLayout.u;
        qf qfVar = t8Var.a;
        qf qfVar2 = t8Var.b;
        int i2 = t8Var.c;
        int i3 = t8Var.d;
        int i4 = this.b + this.c;
        int i5 = this.d;
        View view = rfVar.g0;
        int[] iArr = bf.a;
        int i6 = iArr[qfVar.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
            } else if (i6 == 3) {
                int i7 = this.f;
                int i8 = xeVar2 != null ? xeVar2.g : 0;
                if (xeVar != null) {
                    i8 += xeVar.g;
                }
                childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i5 + i8, -1);
            } else if (i6 != 4) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
                boolean z2 = rfVar.r == 1;
                int i9 = t8Var.j;
                if (i9 == 1 || i9 == 2) {
                    boolean z3 = view.getMeasuredHeight() == rfVar.k();
                    if (t8Var.j == 2 || !z2 || ((z2 && z3) || rfVar.A())) {
                        childMeasureSpec = View.MeasureSpec.makeMeasureSpec(rfVar.q(), 1073741824);
                    }
                }
            }
            makeMeasureSpec = childMeasureSpec;
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        int i10 = iArr[qfVar2.ordinal()];
        if (i10 == 1) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        } else if (i10 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
        } else if (i10 == 3) {
            int i11 = this.g;
            int i12 = xeVar2 != null ? rfVar.J.g : 0;
            if (xeVar != null) {
                i12 += rfVar.L.g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, i4 + i12, -1);
        } else if (i10 != 4) {
            makeMeasureSpec2 = 0;
        } else {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
            boolean z4 = rfVar.s == 1;
            int i13 = t8Var.j;
            if (i13 == 1 || i13 == 2) {
                boolean z5 = view.getMeasuredWidth() == rfVar.q();
                if (t8Var.j == 2 || !z4 || ((z4 && z5) || rfVar.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(rfVar.k(), 1073741824);
                }
            }
        }
        sf sfVar = (sf) rfVar.U;
        ConstraintLayout constraintLayout = this.h;
        if (sfVar != null && bi.y(constraintLayout.n, 256) && view.getMeasuredWidth() == rfVar.q() && view.getMeasuredWidth() < sfVar.q() && view.getMeasuredHeight() == rfVar.k() && view.getMeasuredHeight() < sfVar.k() && view.getBaseline() == rfVar.b0 && !rfVar.z() && a(rfVar.G, makeMeasureSpec, rfVar.q()) && a(rfVar.H, makeMeasureSpec2, rfVar.k())) {
            t8Var.e = rfVar.q();
            t8Var.f = rfVar.k();
            t8Var.g = rfVar.b0;
            return;
        }
        qf qfVar3 = qf.MATCH_CONSTRAINT;
        boolean z6 = qfVar == qfVar3;
        boolean z7 = qfVar2 == qfVar3;
        qf qfVar4 = qf.MATCH_PARENT;
        boolean z8 = qfVar2 == qfVar4 || qfVar2 == qf.FIXED;
        boolean z9 = qfVar == qfVar4 || qfVar == qf.FIXED;
        boolean z10 = z6 && rfVar.X > 0.0f;
        boolean z11 = z7 && rfVar.X > 0.0f;
        if (view == null) {
            return;
        }
        df dfVar = (df) view.getLayoutParams();
        int i14 = t8Var.j;
        if (i14 != 1 && i14 != 2 && z6 && rfVar.r == 0 && z7 && rfVar.s == 0) {
            i = -1;
            z = false;
            baseline = 0;
            max = 0;
            max2 = 0;
        } else {
            if ((view instanceof ln0) && (rfVar instanceof uo)) {
                ((ln0) view).j((uo) rfVar, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            rfVar.G = makeMeasureSpec;
            rfVar.H = makeMeasureSpec2;
            rfVar.g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            baseline = view.getBaseline();
            int i15 = rfVar.u;
            max = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
            int i16 = rfVar.v;
            if (i16 > 0) {
                max = Math.min(i16, max);
            }
            int i17 = rfVar.x;
            max2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = makeMeasureSpec2;
            int i19 = rfVar.y;
            if (i19 > 0) {
                max2 = Math.min(i19, max2);
            }
            if (!bi.y(constraintLayout.n, 1)) {
                if (z10 && z8) {
                    max = (int) ((max2 * rfVar.X) + 0.5f);
                } else if (z11 && z9) {
                    max2 = (int) ((max / rfVar.X) + 0.5f);
                }
            }
            if (measuredWidth == max && measuredHeight == max2) {
                i = -1;
                z = false;
            } else {
                if (measuredWidth != max) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                }
                int makeMeasureSpec3 = measuredHeight != max2 ? View.MeasureSpec.makeMeasureSpec(max2, 1073741824) : i18;
                view.measure(makeMeasureSpec, makeMeasureSpec3);
                rfVar.G = makeMeasureSpec;
                rfVar.H = makeMeasureSpec3;
                z = false;
                rfVar.g = false;
                max = view.getMeasuredWidth();
                max2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                i = -1;
            }
        }
        boolean z12 = baseline != i ? true : z;
        t8Var.i = (max == t8Var.c && max2 == t8Var.d) ? z : true;
        if (dfVar.c0) {
            z12 = true;
        }
        if (z12 && baseline != -1 && rfVar.b0 != baseline) {
            t8Var.i = true;
        }
        t8Var.e = max;
        t8Var.f = max2;
        t8Var.h = z12;
        t8Var.g = baseline;
    }
}
