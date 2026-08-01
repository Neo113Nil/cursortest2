package v;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import q.AbstractC0317e;
import s.C0339c;
import s.C0340d;
import s.C0341e;
import t.C0344b;

/* renamed from: v.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0367f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3860a;

    /* renamed from: b, reason: collision with root package name */
    public int f3861b;

    /* renamed from: c, reason: collision with root package name */
    public int f3862c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3863e;

    /* renamed from: f, reason: collision with root package name */
    public int f3864f;

    /* renamed from: g, reason: collision with root package name */
    public int f3865g;
    public final /* synthetic */ ConstraintLayout h;

    public C0367f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f3860a = constraintLayout2;
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

    public final void b(C0340d c0340d, C0344b c0344b) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int i;
        int i2;
        boolean z2;
        int measuredWidth;
        int baseline;
        int i3;
        if (c0340d == null) {
            return;
        }
        if (c0340d.f3534g0 == 8) {
            c0344b.f3678e = 0;
            c0344b.f3679f = 0;
            c0344b.f3680g = 0;
            return;
        }
        if (c0340d.f3515T == null) {
            return;
        }
        int i4 = c0344b.f3675a;
        int i5 = c0344b.f3676b;
        int i6 = c0344b.f3677c;
        int i7 = c0344b.d;
        int i8 = this.f3861b + this.f3862c;
        int i9 = this.d;
        View view = c0340d.f3532f0;
        int a2 = AbstractC0317e.a(i4);
        C0339c c0339c = c0340d.f3506K;
        C0339c c0339c2 = c0340d.f3504I;
        if (a2 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (a2 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3864f, i9, -2);
        } else if (a2 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3864f, i9, -2);
            boolean z3 = c0340d.f3551r == 1;
            int i10 = c0344b.f3681j;
            if (i10 == 1 || i10 == 2) {
                boolean z4 = view.getMeasuredHeight() == c0340d.k();
                if (c0344b.f3681j == 2 || !z3 || ((z3 && z4) || c0340d.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0340d.q(), 1073741824);
                }
            }
        } else if (a2 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i11 = this.f3864f;
            int i12 = c0339c2 != null ? c0339c2.f3496g : 0;
            if (c0339c != null) {
                i12 += c0339c.f3496g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int a3 = AbstractC0317e.a(i5);
        if (a3 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (a3 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3865g, i8, -2);
        } else if (a3 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3865g, i8, -2);
            boolean z5 = c0340d.f3552s == 1;
            int i13 = c0344b.f3681j;
            if (i13 == 1 || i13 == 2) {
                boolean z6 = view.getMeasuredWidth() == c0340d.q();
                if (c0344b.f3681j == 2 || !z5 || ((z5 && z6) || c0340d.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0340d.k(), 1073741824);
                }
            }
        } else if (a3 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i14 = this.f3865g;
            int i15 = c0339c2 != null ? c0340d.f3505J.f3496g : 0;
            if (c0339c != null) {
                i15 += c0340d.f3507L.f3496g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        C0341e c0341e = (C0341e) c0340d.f3515T;
        ConstraintLayout constraintLayout = this.h;
        if (c0341e != null && s.j.c(constraintLayout.i, 256) && view.getMeasuredWidth() == c0340d.q() && view.getMeasuredWidth() < c0341e.q() && view.getMeasuredHeight() == c0340d.k() && view.getMeasuredHeight() < c0341e.k() && view.getBaseline() == c0340d.f3523a0 && !c0340d.z() && a(c0340d.f3502G, makeMeasureSpec, c0340d.q()) && a(c0340d.f3503H, makeMeasureSpec2, c0340d.k())) {
            c0344b.f3678e = c0340d.q();
            c0344b.f3679f = c0340d.k();
            c0344b.f3680g = c0340d.f3523a0;
            return;
        }
        boolean z7 = i4 == 3;
        boolean z8 = i5 == 3;
        boolean z9 = i5 == 4 || i5 == 1;
        boolean z10 = i4 == 4 || i4 == 1;
        boolean z11 = z7 && c0340d.f3518W > 0.0f;
        boolean z12 = z8 && c0340d.f3518W > 0.0f;
        if (view == null) {
            return;
        }
        C0366e c0366e = (C0366e) view.getLayoutParams();
        int i16 = c0344b.f3681j;
        if (i16 != 1 && i16 != 2 && z7 && c0340d.f3551r == 0 && z8 && c0340d.f3552s == 0) {
            z2 = false;
            measuredWidth = 0;
            i3 = -1;
            baseline = 0;
            max = 0;
        } else {
            if ((view instanceof t) && (c0340d instanceof s.g)) {
                ((t) view).j((s.g) c0340d, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            c0340d.f3502G = makeMeasureSpec;
            c0340d.f3503H = makeMeasureSpec2;
            c0340d.f3533g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = c0340d.f3554u;
            int max2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = c0340d.f3555v;
            if (i18 > 0) {
                max2 = Math.min(i18, max2);
            }
            int i19 = c0340d.f3557x;
            max = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = makeMeasureSpec;
            int i21 = c0340d.f3558y;
            if (i21 > 0) {
                max = Math.min(i21, max);
            }
            if (!s.j.c(constraintLayout.i, 1)) {
                if (z11 && z9) {
                    max2 = (int) ((max * c0340d.f3518W) + 0.5f);
                } else if (z12 && z10) {
                    max = (int) ((max2 / c0340d.f3518W) + 0.5f);
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
                c0340d.f3502G = i2;
                c0340d.f3503H = makeMeasureSpec2;
                z2 = false;
                c0340d.f3533g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i3 = -1;
        }
        boolean z13 = baseline != i3 ? true : z2;
        if (measuredWidth != c0344b.f3677c || max != c0344b.d) {
            z2 = true;
        }
        c0344b.i = z2;
        boolean z14 = c0366e.f3827c0 ? true : z13;
        if (z14 && baseline != -1 && c0340d.f3523a0 != baseline) {
            c0344b.i = true;
        }
        c0344b.f3678e = measuredWidth;
        c0344b.f3679f = max;
        c0344b.h = z14;
        c0344b.f3680g = baseline;
    }
}
