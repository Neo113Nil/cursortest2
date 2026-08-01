package v;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import q.AbstractC0285e;
import s.C0292c;
import s.C0293d;
import s.C0294e;
import t.C0297b;

/* renamed from: v.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0319f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3908a;

    /* renamed from: b, reason: collision with root package name */
    public int f3909b;

    /* renamed from: c, reason: collision with root package name */
    public int f3910c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3911e;

    /* renamed from: f, reason: collision with root package name */
    public int f3912f;

    /* renamed from: g, reason: collision with root package name */
    public int f3913g;
    public final /* synthetic */ ConstraintLayout h;

    public C0319f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f3908a = constraintLayout2;
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

    public final void b(C0293d c0293d, C0297b c0297b) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int i;
        int i2;
        boolean z2;
        int measuredWidth;
        int baseline;
        int i3;
        if (c0293d == null) {
            return;
        }
        if (c0293d.f3562g0 == 8) {
            c0297b.f3685e = 0;
            c0297b.f3686f = 0;
            c0297b.f3687g = 0;
            return;
        }
        if (c0293d.f3543T == null) {
            return;
        }
        int i4 = c0297b.f3682a;
        int i5 = c0297b.f3683b;
        int i6 = c0297b.f3684c;
        int i7 = c0297b.d;
        int i8 = this.f3909b + this.f3910c;
        int i9 = this.d;
        View view = c0293d.f3560f0;
        int a2 = AbstractC0285e.a(i4);
        C0292c c0292c = c0293d.f3534K;
        C0292c c0292c2 = c0293d.f3532I;
        if (a2 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (a2 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3912f, i9, -2);
        } else if (a2 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3912f, i9, -2);
            boolean z3 = c0293d.f3579r == 1;
            int i10 = c0297b.f3688j;
            if (i10 == 1 || i10 == 2) {
                boolean z4 = view.getMeasuredHeight() == c0293d.k();
                if (c0297b.f3688j == 2 || !z3 || ((z3 && z4) || c0293d.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0293d.q(), 1073741824);
                }
            }
        } else if (a2 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i11 = this.f3912f;
            int i12 = c0292c2 != null ? c0292c2.f3524g : 0;
            if (c0292c != null) {
                i12 += c0292c.f3524g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int a3 = AbstractC0285e.a(i5);
        if (a3 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (a3 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3913g, i8, -2);
        } else if (a3 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3913g, i8, -2);
            boolean z5 = c0293d.f3580s == 1;
            int i13 = c0297b.f3688j;
            if (i13 == 1 || i13 == 2) {
                boolean z6 = view.getMeasuredWidth() == c0293d.q();
                if (c0297b.f3688j == 2 || !z5 || ((z5 && z6) || c0293d.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0293d.k(), 1073741824);
                }
            }
        } else if (a3 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i14 = this.f3913g;
            int i15 = c0292c2 != null ? c0293d.f3533J.f3524g : 0;
            if (c0292c != null) {
                i15 += c0293d.f3535L.f3524g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        C0294e c0294e = (C0294e) c0293d.f3543T;
        ConstraintLayout constraintLayout = this.h;
        if (c0294e != null && s.j.c(constraintLayout.i, 256) && view.getMeasuredWidth() == c0293d.q() && view.getMeasuredWidth() < c0294e.q() && view.getMeasuredHeight() == c0293d.k() && view.getMeasuredHeight() < c0294e.k() && view.getBaseline() == c0293d.f3551a0 && !c0293d.z() && a(c0293d.f3530G, makeMeasureSpec, c0293d.q()) && a(c0293d.f3531H, makeMeasureSpec2, c0293d.k())) {
            c0297b.f3685e = c0293d.q();
            c0297b.f3686f = c0293d.k();
            c0297b.f3687g = c0293d.f3551a0;
            return;
        }
        boolean z7 = i4 == 3;
        boolean z8 = i5 == 3;
        boolean z9 = i5 == 4 || i5 == 1;
        boolean z10 = i4 == 4 || i4 == 1;
        boolean z11 = z7 && c0293d.f3546W > 0.0f;
        boolean z12 = z8 && c0293d.f3546W > 0.0f;
        if (view == null) {
            return;
        }
        C0318e c0318e = (C0318e) view.getLayoutParams();
        int i16 = c0297b.f3688j;
        if (i16 != 1 && i16 != 2 && z7 && c0293d.f3579r == 0 && z8 && c0293d.f3580s == 0) {
            z2 = false;
            measuredWidth = 0;
            i3 = -1;
            baseline = 0;
            max = 0;
        } else {
            if ((view instanceof u) && (c0293d instanceof s.g)) {
                ((u) view).j((s.g) c0293d, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            c0293d.f3530G = makeMeasureSpec;
            c0293d.f3531H = makeMeasureSpec2;
            c0293d.f3561g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = c0293d.f3582u;
            int max2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = c0293d.f3583v;
            if (i18 > 0) {
                max2 = Math.min(i18, max2);
            }
            int i19 = c0293d.f3585x;
            max = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = makeMeasureSpec;
            int i21 = c0293d.f3586y;
            if (i21 > 0) {
                max = Math.min(i21, max);
            }
            if (!s.j.c(constraintLayout.i, 1)) {
                if (z11 && z9) {
                    max2 = (int) ((max * c0293d.f3546W) + 0.5f);
                } else if (z12 && z10) {
                    max = (int) ((max2 / c0293d.f3546W) + 0.5f);
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
                c0293d.f3530G = i2;
                c0293d.f3531H = makeMeasureSpec2;
                z2 = false;
                c0293d.f3561g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i3 = -1;
        }
        boolean z13 = baseline != i3 ? true : z2;
        if (measuredWidth != c0297b.f3684c || max != c0297b.d) {
            z2 = true;
        }
        c0297b.i = z2;
        boolean z14 = c0318e.f3875c0 ? true : z13;
        if (z14 && baseline != -1 && c0293d.f3551a0 != baseline) {
            c0297b.i = true;
        }
        c0297b.f3685e = measuredWidth;
        c0297b.f3686f = max;
        c0297b.h = z14;
        c0297b.f3687g = baseline;
    }
}
