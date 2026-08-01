package x;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import s.AbstractC0380e;
import u.C0386c;
import u.C0387d;
import u.C0388e;
import v.C0393b;

/* renamed from: x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0415f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4586a;

    /* renamed from: b, reason: collision with root package name */
    public int f4587b;

    /* renamed from: c, reason: collision with root package name */
    public int f4588c;

    /* renamed from: d, reason: collision with root package name */
    public int f4589d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f4590f;

    /* renamed from: g, reason: collision with root package name */
    public int f4591g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f4592h;

    public C0415f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f4592h = constraintLayout;
        this.f4586a = constraintLayout2;
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

    public final void b(C0387d c0387d, C0393b c0393b) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int i;
        int i2;
        boolean z2;
        int measuredWidth;
        int baseline;
        int i3;
        if (c0387d == null) {
            return;
        }
        if (c0387d.f4266g0 == 8) {
            c0393b.e = 0;
            c0393b.f4403f = 0;
            c0393b.f4404g = 0;
            return;
        }
        if (c0387d.f4247T == null) {
            return;
        }
        int i4 = c0393b.f4399a;
        int i5 = c0393b.f4400b;
        int i6 = c0393b.f4401c;
        int i7 = c0393b.f4402d;
        int i8 = this.f4587b + this.f4588c;
        int i9 = this.f4589d;
        View view = c0387d.f4264f0;
        int a2 = AbstractC0380e.a(i4);
        C0386c c0386c = c0387d.f4238K;
        C0386c c0386c2 = c0387d.f4236I;
        if (a2 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (a2 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4590f, i9, -2);
        } else if (a2 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4590f, i9, -2);
            boolean z3 = c0387d.f4283r == 1;
            int i10 = c0393b.j;
            if (i10 == 1 || i10 == 2) {
                boolean z4 = view.getMeasuredHeight() == c0387d.k();
                if (c0393b.j == 2 || !z3 || ((z3 && z4) || c0387d.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0387d.q(), 1073741824);
                }
            }
        } else if (a2 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i11 = this.f4590f;
            int i12 = c0386c2 != null ? c0386c2.f4227g : 0;
            if (c0386c != null) {
                i12 += c0386c.f4227g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int a3 = AbstractC0380e.a(i5);
        if (a3 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (a3 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4591g, i8, -2);
        } else if (a3 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4591g, i8, -2);
            boolean z5 = c0387d.f4284s == 1;
            int i13 = c0393b.j;
            if (i13 == 1 || i13 == 2) {
                boolean z6 = view.getMeasuredWidth() == c0387d.q();
                if (c0393b.j == 2 || !z5 || ((z5 && z6) || c0387d.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0387d.k(), 1073741824);
                }
            }
        } else if (a3 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i14 = this.f4591g;
            int i15 = c0386c2 != null ? c0387d.f4237J.f4227g : 0;
            if (c0386c != null) {
                i15 += c0387d.f4239L.f4227g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        C0388e c0388e = (C0388e) c0387d.f4247T;
        ConstraintLayout constraintLayout = this.f4592h;
        if (c0388e != null && u.j.c(constraintLayout.i, 256) && view.getMeasuredWidth() == c0387d.q() && view.getMeasuredWidth() < c0388e.q() && view.getMeasuredHeight() == c0387d.k() && view.getMeasuredHeight() < c0388e.k() && view.getBaseline() == c0387d.f4255a0 && !c0387d.z() && a(c0387d.f4235G, makeMeasureSpec, c0387d.q()) && a(c0387d.H, makeMeasureSpec2, c0387d.k())) {
            c0393b.e = c0387d.q();
            c0393b.f4403f = c0387d.k();
            c0393b.f4404g = c0387d.f4255a0;
            return;
        }
        boolean z7 = i4 == 3;
        boolean z8 = i5 == 3;
        boolean z9 = i5 == 4 || i5 == 1;
        boolean z10 = i4 == 4 || i4 == 1;
        boolean z11 = z7 && c0387d.f4250W > 0.0f;
        boolean z12 = z8 && c0387d.f4250W > 0.0f;
        if (view == null) {
            return;
        }
        C0414e c0414e = (C0414e) view.getLayoutParams();
        int i16 = c0393b.j;
        if (i16 != 1 && i16 != 2 && z7 && c0387d.f4283r == 0 && z8 && c0387d.f4284s == 0) {
            z2 = false;
            measuredWidth = 0;
            i3 = -1;
            baseline = 0;
            max = 0;
        } else {
            if ((view instanceof t) && (c0387d instanceof u.g)) {
                ((t) view).j((u.g) c0387d, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            c0387d.f4235G = makeMeasureSpec;
            c0387d.H = makeMeasureSpec2;
            c0387d.f4265g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = c0387d.f4286u;
            int max2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = c0387d.f4287v;
            if (i18 > 0) {
                max2 = Math.min(i18, max2);
            }
            int i19 = c0387d.f4289x;
            max = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = makeMeasureSpec;
            int i21 = c0387d.f4290y;
            if (i21 > 0) {
                max = Math.min(i21, max);
            }
            if (!u.j.c(constraintLayout.i, 1)) {
                if (z11 && z9) {
                    max2 = (int) ((max * c0387d.f4250W) + 0.5f);
                } else if (z12 && z10) {
                    max = (int) ((max2 / c0387d.f4250W) + 0.5f);
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
                c0387d.f4235G = i2;
                c0387d.H = makeMeasureSpec2;
                z2 = false;
                c0387d.f4265g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i3 = -1;
        }
        boolean z13 = baseline != i3 ? true : z2;
        if (measuredWidth != c0393b.f4401c || max != c0393b.f4402d) {
            z2 = true;
        }
        c0393b.i = z2;
        boolean z14 = c0414e.f4553c0 ? true : z13;
        if (z14 && baseline != -1 && c0387d.f4255a0 != baseline) {
            c0393b.i = true;
        }
        c0393b.e = measuredWidth;
        c0393b.f4403f = max;
        c0393b.f4405h = z14;
        c0393b.f4404g = baseline;
    }
}
