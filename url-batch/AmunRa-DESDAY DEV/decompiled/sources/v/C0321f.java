package v;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import q.AbstractC0285e;
import s.C0294c;
import s.C0295d;
import s.C0296e;
import t.C0299b;

/* renamed from: v.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3988a;

    /* renamed from: b, reason: collision with root package name */
    public int f3989b;

    /* renamed from: c, reason: collision with root package name */
    public int f3990c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3991e;

    /* renamed from: f, reason: collision with root package name */
    public int f3992f;

    /* renamed from: g, reason: collision with root package name */
    public int f3993g;
    public final /* synthetic */ ConstraintLayout h;

    public C0321f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f3988a = constraintLayout2;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void b(C0295d c0295d, C0299b c0299b) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int i;
        int i2;
        boolean z2;
        int measuredWidth;
        int baseline;
        int i3;
        if (c0295d == null) {
            return;
        }
        if (c0295d.f3700g0 == 8) {
            c0299b.f3830e = 0;
            c0299b.f3831f = 0;
            c0299b.f3832g = 0;
            return;
        }
        if (c0295d.f3681T == null) {
            return;
        }
        int i4 = c0299b.f3827a;
        int i5 = c0299b.f3828b;
        int i6 = c0299b.f3829c;
        int i7 = c0299b.d;
        int i8 = this.f3989b + this.f3990c;
        int i9 = this.d;
        View view = c0295d.f3698f0;
        int a2 = AbstractC0285e.a(i4);
        C0294c c0294c = c0295d.f3672K;
        C0294c c0294c2 = c0295d.f3670I;
        if (a2 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (a2 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3992f, i9, -2);
        } else if (a2 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3992f, i9, -2);
            boolean z3 = c0295d.f3716r == 1;
            int i10 = c0299b.f3833j;
            if (i10 == 1 || i10 == 2) {
                boolean z4 = view.getMeasuredHeight() == c0295d.k();
                if (c0299b.f3833j == 2 || !z3 || ((z3 && z4) || c0295d.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0295d.q(), 1073741824);
                }
            }
        } else if (a2 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i11 = this.f3992f;
            int i12 = c0294c2 != null ? c0294c2.f3662g : 0;
            if (c0294c != null) {
                i12 += c0294c.f3662g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int a3 = AbstractC0285e.a(i5);
        if (a3 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (a3 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3993g, i8, -2);
        } else if (a3 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3993g, i8, -2);
            boolean z5 = c0295d.f3717s == 1;
            int i13 = c0299b.f3833j;
            if (i13 == 1 || i13 == 2) {
                boolean z6 = view.getMeasuredWidth() == c0295d.q();
                if (c0299b.f3833j == 2 || !z5 || ((z5 && z6) || c0295d.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0295d.k(), 1073741824);
                }
            }
        } else if (a3 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i14 = this.f3993g;
            int i15 = c0294c2 != null ? c0295d.f3671J.f3662g : 0;
            if (c0294c != null) {
                i15 += c0295d.f3673L.f3662g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        C0296e c0296e = (C0296e) c0295d.f3681T;
        ConstraintLayout constraintLayout = this.h;
        if (c0296e != null && s.j.c(constraintLayout.i, 256) && view.getMeasuredWidth() == c0295d.q() && view.getMeasuredWidth() < c0296e.q() && view.getMeasuredHeight() == c0295d.k() && view.getMeasuredHeight() < c0296e.k() && view.getBaseline() == c0295d.f3689a0 && !c0295d.z() && a(c0295d.f3668G, makeMeasureSpec, c0295d.q()) && a(c0295d.f3669H, makeMeasureSpec2, c0295d.k())) {
            c0299b.f3830e = c0295d.q();
            c0299b.f3831f = c0295d.k();
            c0299b.f3832g = c0295d.f3689a0;
            return;
        }
        boolean z7 = i4 == 3;
        boolean z8 = i5 == 3;
        boolean z9 = i5 == 4 || i5 == 1;
        boolean z10 = i4 == 4 || i4 == 1;
        boolean z11 = z7 && c0295d.f3684W > 0.0f;
        boolean z12 = z8 && c0295d.f3684W > 0.0f;
        if (view == null) {
            return;
        }
        C0320e c0320e = (C0320e) view.getLayoutParams();
        int i16 = c0299b.f3833j;
        if (i16 != 1 && i16 != 2 && z7 && c0295d.f3716r == 0 && z8 && c0295d.f3717s == 0) {
            z2 = false;
            measuredWidth = 0;
            i3 = -1;
            baseline = 0;
            max = 0;
        } else {
            if ((view instanceof t) && (c0295d instanceof s.g)) {
                ((t) view).j((s.g) c0295d, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            c0295d.f3668G = makeMeasureSpec;
            c0295d.f3669H = makeMeasureSpec2;
            c0295d.f3699g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = c0295d.f3719u;
            int max2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = c0295d.f3720v;
            if (i18 > 0) {
                max2 = Math.min(i18, max2);
            }
            int i19 = c0295d.f3722x;
            max = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = makeMeasureSpec;
            int i21 = c0295d.f3723y;
            if (i21 > 0) {
                max = Math.min(i21, max);
            }
            if (!s.j.c(constraintLayout.i, 1)) {
                if (z11 && z9) {
                    max2 = (int) ((max * c0295d.f3684W) + 0.5f);
                } else if (z12 && z10) {
                    max = (int) ((max2 / c0295d.f3684W) + 0.5f);
                }
            }
            if (measuredWidth2 == max2 && measuredHeight == max) {
                baseline = baseline2;
                measuredWidth = max2;
                z2 = false;
            } else {
                if (measuredWidth2 != max2) {
                    i = 1073741824;
                    i2 = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                } else {
                    i = 1073741824;
                    i2 = i20;
                }
                if (measuredHeight != max) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max, i);
                }
                view.measure(i2, makeMeasureSpec2);
                c0295d.f3668G = i2;
                c0295d.f3669H = makeMeasureSpec2;
                z2 = false;
                c0295d.f3699g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i3 = -1;
        }
        boolean z13 = baseline != i3 ? true : z2;
        if (measuredWidth != c0299b.f3829c || max != c0299b.d) {
            z2 = true;
        }
        c0299b.i = z2;
        boolean z14 = c0320e.f3956c0 ? true : z13;
        if (z14 && baseline != -1 && c0295d.f3689a0 != baseline) {
            c0299b.i = true;
        }
        c0299b.f3830e = measuredWidth;
        c0299b.f3831f = max;
        c0299b.h = z14;
        c0299b.f3832g = baseline;
    }
}
