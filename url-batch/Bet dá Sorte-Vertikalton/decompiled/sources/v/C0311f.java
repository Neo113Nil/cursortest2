package v;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import q.AbstractC0273e;
import s.C0280c;
import s.C0281d;
import s.C0282e;
import t.C0285b;

/* renamed from: v.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4044a;

    /* renamed from: b, reason: collision with root package name */
    public int f4045b;

    /* renamed from: c, reason: collision with root package name */
    public int f4046c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4047e;

    /* renamed from: f, reason: collision with root package name */
    public int f4048f;

    /* renamed from: g, reason: collision with root package name */
    public int f4049g;
    public final /* synthetic */ ConstraintLayout h;

    public C0311f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f4044a = constraintLayout2;
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

    public final void b(C0281d c0281d, C0285b c0285b) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int i;
        int i2;
        boolean z2;
        int measuredWidth;
        int baseline;
        int i3;
        if (c0281d == null) {
            return;
        }
        if (c0281d.f3640g0 == 8) {
            c0285b.f3782e = 0;
            c0285b.f3783f = 0;
            c0285b.f3784g = 0;
            return;
        }
        if (c0281d.f3621T == null) {
            return;
        }
        int i4 = c0285b.f3779a;
        int i5 = c0285b.f3780b;
        int i6 = c0285b.f3781c;
        int i7 = c0285b.d;
        int i8 = this.f4045b + this.f4046c;
        int i9 = this.d;
        View view = c0281d.f3638f0;
        int a2 = AbstractC0273e.a(i4);
        C0280c c0280c = c0281d.f3612K;
        C0280c c0280c2 = c0281d.f3610I;
        if (a2 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (a2 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4048f, i9, -2);
        } else if (a2 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4048f, i9, -2);
            boolean z3 = c0281d.f3656r == 1;
            int i10 = c0285b.f3785j;
            if (i10 == 1 || i10 == 2) {
                boolean z4 = view.getMeasuredHeight() == c0281d.k();
                if (c0285b.f3785j == 2 || !z3 || ((z3 && z4) || c0281d.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0281d.q(), 1073741824);
                }
            }
        } else if (a2 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i11 = this.f4048f;
            int i12 = c0280c2 != null ? c0280c2.f3602g : 0;
            if (c0280c != null) {
                i12 += c0280c.f3602g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int a3 = AbstractC0273e.a(i5);
        if (a3 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (a3 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4049g, i8, -2);
        } else if (a3 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4049g, i8, -2);
            boolean z5 = c0281d.f3657s == 1;
            int i13 = c0285b.f3785j;
            if (i13 == 1 || i13 == 2) {
                boolean z6 = view.getMeasuredWidth() == c0281d.q();
                if (c0285b.f3785j == 2 || !z5 || ((z5 && z6) || c0281d.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0281d.k(), 1073741824);
                }
            }
        } else if (a3 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i14 = this.f4049g;
            int i15 = c0280c2 != null ? c0281d.f3611J.f3602g : 0;
            if (c0280c != null) {
                i15 += c0281d.f3613L.f3602g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        C0282e c0282e = (C0282e) c0281d.f3621T;
        ConstraintLayout constraintLayout = this.h;
        if (c0282e != null && s.j.c(constraintLayout.i, 256) && view.getMeasuredWidth() == c0281d.q() && view.getMeasuredWidth() < c0282e.q() && view.getMeasuredHeight() == c0281d.k() && view.getMeasuredHeight() < c0282e.k() && view.getBaseline() == c0281d.f3629a0 && !c0281d.z() && a(c0281d.f3608G, makeMeasureSpec, c0281d.q()) && a(c0281d.f3609H, makeMeasureSpec2, c0281d.k())) {
            c0285b.f3782e = c0281d.q();
            c0285b.f3783f = c0281d.k();
            c0285b.f3784g = c0281d.f3629a0;
            return;
        }
        boolean z7 = i4 == 3;
        boolean z8 = i5 == 3;
        boolean z9 = i5 == 4 || i5 == 1;
        boolean z10 = i4 == 4 || i4 == 1;
        boolean z11 = z7 && c0281d.f3624W > 0.0f;
        boolean z12 = z8 && c0281d.f3624W > 0.0f;
        if (view == null) {
            return;
        }
        C0310e c0310e = (C0310e) view.getLayoutParams();
        int i16 = c0285b.f3785j;
        if (i16 != 1 && i16 != 2 && z7 && c0281d.f3656r == 0 && z8 && c0281d.f3657s == 0) {
            z2 = false;
            measuredWidth = 0;
            i3 = -1;
            baseline = 0;
            max = 0;
        } else {
            if ((view instanceof t) && (c0281d instanceof s.g)) {
                ((t) view).j((s.g) c0281d, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            c0281d.f3608G = makeMeasureSpec;
            c0281d.f3609H = makeMeasureSpec2;
            c0281d.f3639g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = c0281d.f3659u;
            int max2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = c0281d.f3660v;
            if (i18 > 0) {
                max2 = Math.min(i18, max2);
            }
            int i19 = c0281d.f3662x;
            max = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = makeMeasureSpec;
            int i21 = c0281d.f3663y;
            if (i21 > 0) {
                max = Math.min(i21, max);
            }
            if (!s.j.c(constraintLayout.i, 1)) {
                if (z11 && z9) {
                    max2 = (int) ((max * c0281d.f3624W) + 0.5f);
                } else if (z12 && z10) {
                    max = (int) ((max2 / c0281d.f3624W) + 0.5f);
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
                c0281d.f3608G = i2;
                c0281d.f3609H = makeMeasureSpec2;
                z2 = false;
                c0281d.f3639g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i3 = -1;
        }
        boolean z13 = baseline != i3 ? true : z2;
        if (measuredWidth != c0285b.f3781c || max != c0285b.d) {
            z2 = true;
        }
        c0285b.i = z2;
        boolean z14 = c0310e.f4012c0 ? true : z13;
        if (z14 && baseline != -1 && c0281d.f3629a0 != baseline) {
            c0285b.i = true;
        }
        c0285b.f3782e = measuredWidth;
        c0285b.f3783f = max;
        c0285b.h = z14;
        c0285b.f3784g = baseline;
    }
}
