package v;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import q.AbstractC0317e;
import s.C0324c;
import s.C0325d;
import s.C0326e;
import t.C0329b;

/* renamed from: v.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0350f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4315a;

    /* renamed from: b, reason: collision with root package name */
    public int f4316b;

    /* renamed from: c, reason: collision with root package name */
    public int f4317c;

    /* renamed from: d, reason: collision with root package name */
    public int f4318d;

    /* renamed from: e, reason: collision with root package name */
    public int f4319e;

    /* renamed from: f, reason: collision with root package name */
    public int f4320f;

    /* renamed from: g, reason: collision with root package name */
    public int f4321g;
    public final /* synthetic */ ConstraintLayout h;

    public C0350f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f4315a = constraintLayout2;
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

    public final void b(C0325d c0325d, C0329b c0329b) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int i;
        int i2;
        boolean z2;
        int measuredWidth;
        int baseline;
        int i3;
        if (c0325d == null) {
            return;
        }
        if (c0325d.f4043g0 == 8) {
            c0329b.f4155e = 0;
            c0329b.f4156f = 0;
            c0329b.f4157g = 0;
            return;
        }
        if (c0325d.f4023T == null) {
            return;
        }
        int i4 = c0329b.f4151a;
        int i5 = c0329b.f4152b;
        int i6 = c0329b.f4153c;
        int i7 = c0329b.f4154d;
        int i8 = this.f4316b + this.f4317c;
        int i9 = this.f4318d;
        View view = c0325d.f4041f0;
        int a2 = AbstractC0317e.a(i4);
        C0324c c0324c = c0325d.f4014K;
        C0324c c0324c2 = c0325d.f4012I;
        if (a2 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (a2 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4320f, i9, -2);
        } else if (a2 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4320f, i9, -2);
            boolean z3 = c0325d.f4059r == 1;
            int i10 = c0329b.f4158j;
            if (i10 == 1 || i10 == 2) {
                boolean z4 = view.getMeasuredHeight() == c0325d.k();
                if (c0329b.f4158j == 2 || !z3 || ((z3 && z4) || c0325d.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0325d.q(), 1073741824);
                }
            }
        } else if (a2 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i11 = this.f4320f;
            int i12 = c0324c2 != null ? c0324c2.f4004g : 0;
            if (c0324c != null) {
                i12 += c0324c.f4004g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int a3 = AbstractC0317e.a(i5);
        if (a3 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (a3 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4321g, i8, -2);
        } else if (a3 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4321g, i8, -2);
            boolean z5 = c0325d.f4060s == 1;
            int i13 = c0329b.f4158j;
            if (i13 == 1 || i13 == 2) {
                boolean z6 = view.getMeasuredWidth() == c0325d.q();
                if (c0329b.f4158j == 2 || !z5 || ((z5 && z6) || c0325d.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0325d.k(), 1073741824);
                }
            }
        } else if (a3 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i14 = this.f4321g;
            int i15 = c0324c2 != null ? c0325d.f4013J.f4004g : 0;
            if (c0324c != null) {
                i15 += c0325d.f4015L.f4004g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        C0326e c0326e = (C0326e) c0325d.f4023T;
        ConstraintLayout constraintLayout = this.h;
        if (c0326e != null && s.j.c(constraintLayout.i, 256) && view.getMeasuredWidth() == c0325d.q() && view.getMeasuredWidth() < c0326e.q() && view.getMeasuredHeight() == c0325d.k() && view.getMeasuredHeight() < c0326e.k() && view.getBaseline() == c0325d.f4031a0 && !c0325d.z() && a(c0325d.f4010G, makeMeasureSpec, c0325d.q()) && a(c0325d.f4011H, makeMeasureSpec2, c0325d.k())) {
            c0329b.f4155e = c0325d.q();
            c0329b.f4156f = c0325d.k();
            c0329b.f4157g = c0325d.f4031a0;
            return;
        }
        boolean z7 = i4 == 3;
        boolean z8 = i5 == 3;
        boolean z9 = i5 == 4 || i5 == 1;
        boolean z10 = i4 == 4 || i4 == 1;
        boolean z11 = z7 && c0325d.f4026W > 0.0f;
        boolean z12 = z8 && c0325d.f4026W > 0.0f;
        if (view == null) {
            return;
        }
        C0349e c0349e = (C0349e) view.getLayoutParams();
        int i16 = c0329b.f4158j;
        if (i16 != 1 && i16 != 2 && z7 && c0325d.f4059r == 0 && z8 && c0325d.f4060s == 0) {
            z2 = false;
            measuredWidth = 0;
            i3 = -1;
            baseline = 0;
            max = 0;
        } else {
            if ((view instanceof t) && (c0325d instanceof s.g)) {
                ((t) view).j((s.g) c0325d, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            c0325d.f4010G = makeMeasureSpec;
            c0325d.f4011H = makeMeasureSpec2;
            c0325d.f4042g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = c0325d.f4062u;
            int max2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = c0325d.f4063v;
            if (i18 > 0) {
                max2 = Math.min(i18, max2);
            }
            int i19 = c0325d.f4065x;
            max = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = makeMeasureSpec;
            int i21 = c0325d.f4066y;
            if (i21 > 0) {
                max = Math.min(i21, max);
            }
            if (!s.j.c(constraintLayout.i, 1)) {
                if (z11 && z9) {
                    max2 = (int) ((max * c0325d.f4026W) + 0.5f);
                } else if (z12 && z10) {
                    max = (int) ((max2 / c0325d.f4026W) + 0.5f);
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
                c0325d.f4010G = i2;
                c0325d.f4011H = makeMeasureSpec2;
                z2 = false;
                c0325d.f4042g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i3 = -1;
        }
        boolean z13 = baseline != i3 ? true : z2;
        if (measuredWidth != c0329b.f4153c || max != c0329b.f4154d) {
            z2 = true;
        }
        c0329b.i = z2;
        boolean z14 = c0349e.f4282c0 ? true : z13;
        if (z14 && baseline != -1 && c0325d.f4031a0 != baseline) {
            c0329b.i = true;
        }
        c0329b.f4155e = measuredWidth;
        c0329b.f4156f = max;
        c0329b.h = z14;
        c0329b.f4157g = baseline;
    }
}
