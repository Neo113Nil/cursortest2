package x;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import s.AbstractC0267e;
import u.C0274c;
import u.C0275d;
import u.C0276e;
import v.C0279b;

/* renamed from: x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4025a;

    /* renamed from: b, reason: collision with root package name */
    public int f4026b;

    /* renamed from: c, reason: collision with root package name */
    public int f4027c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4028e;

    /* renamed from: f, reason: collision with root package name */
    public int f4029f;

    /* renamed from: g, reason: collision with root package name */
    public int f4030g;
    public final /* synthetic */ ConstraintLayout h;

    public C0305f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f4025a = constraintLayout2;
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

    public final void b(C0275d c0275d, C0279b c0279b) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int i;
        int i2;
        boolean z2;
        int measuredWidth;
        int baseline;
        int i3;
        if (c0275d == null) {
            return;
        }
        if (c0275d.f3678g0 == 8) {
            c0279b.f3802e = 0;
            c0279b.f3803f = 0;
            c0279b.f3804g = 0;
            return;
        }
        if (c0275d.f3659T == null) {
            return;
        }
        int i4 = c0279b.f3799a;
        int i5 = c0279b.f3800b;
        int i6 = c0279b.f3801c;
        int i7 = c0279b.d;
        int i8 = this.f4026b + this.f4027c;
        int i9 = this.d;
        View view = c0275d.f3676f0;
        int a2 = AbstractC0267e.a(i4);
        C0274c c0274c = c0275d.f3650K;
        C0274c c0274c2 = c0275d.f3648I;
        if (a2 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (a2 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4029f, i9, -2);
        } else if (a2 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4029f, i9, -2);
            boolean z3 = c0275d.f3695r == 1;
            int i10 = c0279b.f3805j;
            if (i10 == 1 || i10 == 2) {
                boolean z4 = view.getMeasuredHeight() == c0275d.k();
                if (c0279b.f3805j == 2 || !z3 || ((z3 && z4) || c0275d.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0275d.q(), 1073741824);
                }
            }
        } else if (a2 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i11 = this.f4029f;
            int i12 = c0274c2 != null ? c0274c2.f3640g : 0;
            if (c0274c != null) {
                i12 += c0274c.f3640g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int a3 = AbstractC0267e.a(i5);
        if (a3 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (a3 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4030g, i8, -2);
        } else if (a3 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4030g, i8, -2);
            boolean z5 = c0275d.f3696s == 1;
            int i13 = c0279b.f3805j;
            if (i13 == 1 || i13 == 2) {
                boolean z6 = view.getMeasuredWidth() == c0275d.q();
                if (c0279b.f3805j == 2 || !z5 || ((z5 && z6) || c0275d.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0275d.k(), 1073741824);
                }
            }
        } else if (a3 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i14 = this.f4030g;
            int i15 = c0274c2 != null ? c0275d.f3649J.f3640g : 0;
            if (c0274c != null) {
                i15 += c0275d.f3651L.f3640g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        C0276e c0276e = (C0276e) c0275d.f3659T;
        ConstraintLayout constraintLayout = this.h;
        if (c0276e != null && u.j.c(constraintLayout.i, 256) && view.getMeasuredWidth() == c0275d.q() && view.getMeasuredWidth() < c0276e.q() && view.getMeasuredHeight() == c0275d.k() && view.getMeasuredHeight() < c0276e.k() && view.getBaseline() == c0275d.f3667a0 && !c0275d.z() && a(c0275d.f3647G, makeMeasureSpec, c0275d.q()) && a(c0275d.H, makeMeasureSpec2, c0275d.k())) {
            c0279b.f3802e = c0275d.q();
            c0279b.f3803f = c0275d.k();
            c0279b.f3804g = c0275d.f3667a0;
            return;
        }
        boolean z7 = i4 == 3;
        boolean z8 = i5 == 3;
        boolean z9 = i5 == 4 || i5 == 1;
        boolean z10 = i4 == 4 || i4 == 1;
        boolean z11 = z7 && c0275d.f3662W > 0.0f;
        boolean z12 = z8 && c0275d.f3662W > 0.0f;
        if (view == null) {
            return;
        }
        C0304e c0304e = (C0304e) view.getLayoutParams();
        int i16 = c0279b.f3805j;
        if (i16 != 1 && i16 != 2 && z7 && c0275d.f3695r == 0 && z8 && c0275d.f3696s == 0) {
            z2 = false;
            measuredWidth = 0;
            i3 = -1;
            baseline = 0;
            max = 0;
        } else {
            if ((view instanceof u) && (c0275d instanceof u.g)) {
                ((u) view).j((u.g) c0275d, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            c0275d.f3647G = makeMeasureSpec;
            c0275d.H = makeMeasureSpec2;
            c0275d.f3677g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = c0275d.f3698u;
            int max2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = c0275d.f3699v;
            if (i18 > 0) {
                max2 = Math.min(i18, max2);
            }
            int i19 = c0275d.f3701x;
            max = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = makeMeasureSpec;
            int i21 = c0275d.f3702y;
            if (i21 > 0) {
                max = Math.min(i21, max);
            }
            if (!u.j.c(constraintLayout.i, 1)) {
                if (z11 && z9) {
                    max2 = (int) ((max * c0275d.f3662W) + 0.5f);
                } else if (z12 && z10) {
                    max = (int) ((max2 / c0275d.f3662W) + 0.5f);
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
                c0275d.f3647G = i2;
                c0275d.H = makeMeasureSpec2;
                z2 = false;
                c0275d.f3677g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i3 = -1;
        }
        boolean z13 = baseline != i3 ? true : z2;
        if (measuredWidth != c0279b.f3801c || max != c0279b.d) {
            z2 = true;
        }
        c0279b.i = z2;
        boolean z14 = c0304e.f3992c0 ? true : z13;
        if (z14 && baseline != -1 && c0275d.f3667a0 != baseline) {
            c0279b.i = true;
        }
        c0279b.f3802e = measuredWidth;
        c0279b.f3803f = max;
        c0279b.h = z14;
        c0279b.f3804g = baseline;
    }
}
