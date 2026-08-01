package v;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import q.AbstractC0319e;
import s.C0326c;
import s.C0327d;
import s.C0328e;
import t.C0331b;

/* renamed from: v.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0352f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4319a;

    /* renamed from: b, reason: collision with root package name */
    public int f4320b;

    /* renamed from: c, reason: collision with root package name */
    public int f4321c;

    /* renamed from: d, reason: collision with root package name */
    public int f4322d;

    /* renamed from: e, reason: collision with root package name */
    public int f4323e;

    /* renamed from: f, reason: collision with root package name */
    public int f4324f;

    /* renamed from: g, reason: collision with root package name */
    public int f4325g;
    public final /* synthetic */ ConstraintLayout h;

    public C0352f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f4319a = constraintLayout2;
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

    public final void b(C0327d c0327d, C0331b c0331b) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int i;
        int i2;
        boolean z2;
        int measuredWidth;
        int baseline;
        int i3;
        if (c0327d == null) {
            return;
        }
        if (c0327d.f4047g0 == 8) {
            c0331b.f4159e = 0;
            c0331b.f4160f = 0;
            c0331b.f4161g = 0;
            return;
        }
        if (c0327d.f4027T == null) {
            return;
        }
        int i4 = c0331b.f4155a;
        int i5 = c0331b.f4156b;
        int i6 = c0331b.f4157c;
        int i7 = c0331b.f4158d;
        int i8 = this.f4320b + this.f4321c;
        int i9 = this.f4322d;
        View view = c0327d.f4045f0;
        int a2 = AbstractC0319e.a(i4);
        C0326c c0326c = c0327d.f4018K;
        C0326c c0326c2 = c0327d.f4016I;
        if (a2 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (a2 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4324f, i9, -2);
        } else if (a2 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4324f, i9, -2);
            boolean z3 = c0327d.f4063r == 1;
            int i10 = c0331b.f4162j;
            if (i10 == 1 || i10 == 2) {
                boolean z4 = view.getMeasuredHeight() == c0327d.k();
                if (c0331b.f4162j == 2 || !z3 || ((z3 && z4) || c0327d.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0327d.q(), 1073741824);
                }
            }
        } else if (a2 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i11 = this.f4324f;
            int i12 = c0326c2 != null ? c0326c2.f4008g : 0;
            if (c0326c != null) {
                i12 += c0326c.f4008g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int a3 = AbstractC0319e.a(i5);
        if (a3 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (a3 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4325g, i8, -2);
        } else if (a3 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4325g, i8, -2);
            boolean z5 = c0327d.f4064s == 1;
            int i13 = c0331b.f4162j;
            if (i13 == 1 || i13 == 2) {
                boolean z6 = view.getMeasuredWidth() == c0327d.q();
                if (c0331b.f4162j == 2 || !z5 || ((z5 && z6) || c0327d.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0327d.k(), 1073741824);
                }
            }
        } else if (a3 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i14 = this.f4325g;
            int i15 = c0326c2 != null ? c0327d.f4017J.f4008g : 0;
            if (c0326c != null) {
                i15 += c0327d.f4019L.f4008g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        C0328e c0328e = (C0328e) c0327d.f4027T;
        ConstraintLayout constraintLayout = this.h;
        if (c0328e != null && s.j.c(constraintLayout.i, 256) && view.getMeasuredWidth() == c0327d.q() && view.getMeasuredWidth() < c0328e.q() && view.getMeasuredHeight() == c0327d.k() && view.getMeasuredHeight() < c0328e.k() && view.getBaseline() == c0327d.f4035a0 && !c0327d.z() && a(c0327d.f4014G, makeMeasureSpec, c0327d.q()) && a(c0327d.f4015H, makeMeasureSpec2, c0327d.k())) {
            c0331b.f4159e = c0327d.q();
            c0331b.f4160f = c0327d.k();
            c0331b.f4161g = c0327d.f4035a0;
            return;
        }
        boolean z7 = i4 == 3;
        boolean z8 = i5 == 3;
        boolean z9 = i5 == 4 || i5 == 1;
        boolean z10 = i4 == 4 || i4 == 1;
        boolean z11 = z7 && c0327d.f4030W > 0.0f;
        boolean z12 = z8 && c0327d.f4030W > 0.0f;
        if (view == null) {
            return;
        }
        C0351e c0351e = (C0351e) view.getLayoutParams();
        int i16 = c0331b.f4162j;
        if (i16 != 1 && i16 != 2 && z7 && c0327d.f4063r == 0 && z8 && c0327d.f4064s == 0) {
            z2 = false;
            measuredWidth = 0;
            i3 = -1;
            baseline = 0;
            max = 0;
        } else {
            if ((view instanceof t) && (c0327d instanceof s.g)) {
                ((t) view).j((s.g) c0327d, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            c0327d.f4014G = makeMeasureSpec;
            c0327d.f4015H = makeMeasureSpec2;
            c0327d.f4046g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = c0327d.f4066u;
            int max2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = c0327d.f4067v;
            if (i18 > 0) {
                max2 = Math.min(i18, max2);
            }
            int i19 = c0327d.f4069x;
            max = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = makeMeasureSpec;
            int i21 = c0327d.f4070y;
            if (i21 > 0) {
                max = Math.min(i21, max);
            }
            if (!s.j.c(constraintLayout.i, 1)) {
                if (z11 && z9) {
                    max2 = (int) ((max * c0327d.f4030W) + 0.5f);
                } else if (z12 && z10) {
                    max = (int) ((max2 / c0327d.f4030W) + 0.5f);
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
                c0327d.f4014G = i2;
                c0327d.f4015H = makeMeasureSpec2;
                z2 = false;
                c0327d.f4046g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i3 = -1;
        }
        boolean z13 = baseline != i3 ? true : z2;
        if (measuredWidth != c0331b.f4157c || max != c0331b.f4158d) {
            z2 = true;
        }
        c0331b.i = z2;
        boolean z14 = c0351e.f4286c0 ? true : z13;
        if (z14 && baseline != -1 && c0327d.f4035a0 != baseline) {
            c0331b.i = true;
        }
        c0331b.f4159e = measuredWidth;
        c0331b.f4160f = max;
        c0331b.h = z14;
        c0331b.f4161g = baseline;
    }
}
