package v;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import q.AbstractC0288e;
import s.C0295c;
import s.C0296d;
import s.C0297e;
import t.C0300b;

/* renamed from: v.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3983a;

    /* renamed from: b, reason: collision with root package name */
    public int f3984b;

    /* renamed from: c, reason: collision with root package name */
    public int f3985c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3986e;

    /* renamed from: f, reason: collision with root package name */
    public int f3987f;

    /* renamed from: g, reason: collision with root package name */
    public int f3988g;
    public final /* synthetic */ ConstraintLayout h;

    public C0324f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f3983a = constraintLayout2;
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

    public final void b(C0296d c0296d, C0300b c0300b) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int i;
        int i2;
        boolean z2;
        int measuredWidth;
        int baseline;
        int i3;
        if (c0296d == null) {
            return;
        }
        if (c0296d.f3586g0 == 8) {
            c0300b.f3705e = 0;
            c0300b.f3706f = 0;
            c0300b.f3707g = 0;
            return;
        }
        if (c0296d.f3567T == null) {
            return;
        }
        int i4 = c0300b.f3702a;
        int i5 = c0300b.f3703b;
        int i6 = c0300b.f3704c;
        int i7 = c0300b.d;
        int i8 = this.f3984b + this.f3985c;
        int i9 = this.d;
        View view = c0296d.f3584f0;
        int a2 = AbstractC0288e.a(i4);
        C0295c c0295c = c0296d.f3558K;
        C0295c c0295c2 = c0296d.f3556I;
        if (a2 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (a2 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3987f, i9, -2);
        } else if (a2 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3987f, i9, -2);
            boolean z3 = c0296d.f3603r == 1;
            int i10 = c0300b.f3708j;
            if (i10 == 1 || i10 == 2) {
                boolean z4 = view.getMeasuredHeight() == c0296d.k();
                if (c0300b.f3708j == 2 || !z3 || ((z3 && z4) || c0296d.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0296d.q(), 1073741824);
                }
            }
        } else if (a2 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i11 = this.f3987f;
            int i12 = c0295c2 != null ? c0295c2.f3548g : 0;
            if (c0295c != null) {
                i12 += c0295c.f3548g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int a3 = AbstractC0288e.a(i5);
        if (a3 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (a3 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3988g, i8, -2);
        } else if (a3 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3988g, i8, -2);
            boolean z5 = c0296d.f3604s == 1;
            int i13 = c0300b.f3708j;
            if (i13 == 1 || i13 == 2) {
                boolean z6 = view.getMeasuredWidth() == c0296d.q();
                if (c0300b.f3708j == 2 || !z5 || ((z5 && z6) || c0296d.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0296d.k(), 1073741824);
                }
            }
        } else if (a3 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i14 = this.f3988g;
            int i15 = c0295c2 != null ? c0296d.f3557J.f3548g : 0;
            if (c0295c != null) {
                i15 += c0296d.f3559L.f3548g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        C0297e c0297e = (C0297e) c0296d.f3567T;
        ConstraintLayout constraintLayout = this.h;
        if (c0297e != null && s.j.c(constraintLayout.i, 256) && view.getMeasuredWidth() == c0296d.q() && view.getMeasuredWidth() < c0297e.q() && view.getMeasuredHeight() == c0296d.k() && view.getMeasuredHeight() < c0297e.k() && view.getBaseline() == c0296d.f3575a0 && !c0296d.z() && a(c0296d.f3554G, makeMeasureSpec, c0296d.q()) && a(c0296d.f3555H, makeMeasureSpec2, c0296d.k())) {
            c0300b.f3705e = c0296d.q();
            c0300b.f3706f = c0296d.k();
            c0300b.f3707g = c0296d.f3575a0;
            return;
        }
        boolean z7 = i4 == 3;
        boolean z8 = i5 == 3;
        boolean z9 = i5 == 4 || i5 == 1;
        boolean z10 = i4 == 4 || i4 == 1;
        boolean z11 = z7 && c0296d.f3570W > 0.0f;
        boolean z12 = z8 && c0296d.f3570W > 0.0f;
        if (view == null) {
            return;
        }
        C0323e c0323e = (C0323e) view.getLayoutParams();
        int i16 = c0300b.f3708j;
        if (i16 != 1 && i16 != 2 && z7 && c0296d.f3603r == 0 && z8 && c0296d.f3604s == 0) {
            z2 = false;
            measuredWidth = 0;
            i3 = -1;
            baseline = 0;
            max = 0;
        } else {
            if ((view instanceof t) && (c0296d instanceof s.g)) {
                ((t) view).j((s.g) c0296d, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            c0296d.f3554G = makeMeasureSpec;
            c0296d.f3555H = makeMeasureSpec2;
            c0296d.f3585g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = c0296d.f3606u;
            int max2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = c0296d.f3607v;
            if (i18 > 0) {
                max2 = Math.min(i18, max2);
            }
            int i19 = c0296d.f3609x;
            max = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = makeMeasureSpec;
            int i21 = c0296d.f3610y;
            if (i21 > 0) {
                max = Math.min(i21, max);
            }
            if (!s.j.c(constraintLayout.i, 1)) {
                if (z11 && z9) {
                    max2 = (int) ((max * c0296d.f3570W) + 0.5f);
                } else if (z12 && z10) {
                    max = (int) ((max2 / c0296d.f3570W) + 0.5f);
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
                c0296d.f3554G = i2;
                c0296d.f3555H = makeMeasureSpec2;
                z2 = false;
                c0296d.f3585g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i3 = -1;
        }
        boolean z13 = baseline != i3 ? true : z2;
        if (measuredWidth != c0300b.f3704c || max != c0300b.d) {
            z2 = true;
        }
        c0300b.i = z2;
        boolean z14 = c0323e.f3950c0 ? true : z13;
        if (z14 && baseline != -1 && c0296d.f3575a0 != baseline) {
            c0300b.i = true;
        }
        c0300b.f3705e = measuredWidth;
        c0300b.f3706f = max;
        c0300b.h = z14;
        c0300b.f3707g = baseline;
    }
}
