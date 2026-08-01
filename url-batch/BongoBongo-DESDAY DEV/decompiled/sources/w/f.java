package w;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import r.AbstractC0290e;
import u.C0301b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4052a;

    /* renamed from: b, reason: collision with root package name */
    public int f4053b;

    /* renamed from: c, reason: collision with root package name */
    public int f4054c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4055e;

    /* renamed from: f, reason: collision with root package name */
    public int f4056f;

    /* renamed from: g, reason: collision with root package name */
    public int f4057g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f4058h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f4058h = constraintLayout;
        this.f4052a = constraintLayout2;
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

    public final void b(t.d dVar, C0301b c0301b) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int i;
        int i2;
        boolean z2;
        int measuredWidth;
        int baseline;
        int i3;
        if (dVar == null) {
            return;
        }
        if (dVar.f3788g0 == 8) {
            c0301b.f3907e = 0;
            c0301b.f3908f = 0;
            c0301b.f3909g = 0;
            return;
        }
        if (dVar.f3769T == null) {
            return;
        }
        int i4 = c0301b.f3904a;
        int i5 = c0301b.f3905b;
        int i6 = c0301b.f3906c;
        int i7 = c0301b.d;
        int i8 = this.f4053b + this.f4054c;
        int i9 = this.d;
        View view = dVar.f3786f0;
        int a2 = AbstractC0290e.a(i4);
        t.c cVar = dVar.f3760K;
        t.c cVar2 = dVar.f3758I;
        if (a2 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (a2 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4056f, i9, -2);
        } else if (a2 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4056f, i9, -2);
            boolean z3 = dVar.f3805r == 1;
            int i10 = c0301b.f3911j;
            if (i10 == 1 || i10 == 2) {
                boolean z4 = view.getMeasuredHeight() == dVar.k();
                if (c0301b.f3911j == 2 || !z3 || ((z3 && z4) || dVar.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                }
            }
        } else if (a2 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i11 = this.f4056f;
            int i12 = cVar2 != null ? cVar2.f3749g : 0;
            if (cVar != null) {
                i12 += cVar.f3749g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int a3 = AbstractC0290e.a(i5);
        if (a3 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (a3 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4057g, i8, -2);
        } else if (a3 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4057g, i8, -2);
            boolean z5 = dVar.f3806s == 1;
            int i13 = c0301b.f3911j;
            if (i13 == 1 || i13 == 2) {
                boolean z6 = view.getMeasuredWidth() == dVar.q();
                if (c0301b.f3911j == 2 || !z5 || ((z5 && z6) || dVar.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                }
            }
        } else if (a3 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i14 = this.f4057g;
            int i15 = cVar2 != null ? dVar.f3759J.f3749g : 0;
            if (cVar != null) {
                i15 += dVar.f3761L.f3749g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        t.e eVar = (t.e) dVar.f3769T;
        ConstraintLayout constraintLayout = this.f4058h;
        if (eVar != null && t.j.c(constraintLayout.i, 256) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.f3777a0 && !dVar.z() && a(dVar.G, makeMeasureSpec, dVar.q()) && a(dVar.f3757H, makeMeasureSpec2, dVar.k())) {
            c0301b.f3907e = dVar.q();
            c0301b.f3908f = dVar.k();
            c0301b.f3909g = dVar.f3777a0;
            return;
        }
        boolean z7 = i4 == 3;
        boolean z8 = i5 == 3;
        boolean z9 = i5 == 4 || i5 == 1;
        boolean z10 = i4 == 4 || i4 == 1;
        boolean z11 = z7 && dVar.f3772W > RecyclerView.A0;
        boolean z12 = z8 && dVar.f3772W > RecyclerView.A0;
        if (view == null) {
            return;
        }
        e eVar2 = (e) view.getLayoutParams();
        int i16 = c0301b.f3911j;
        if (i16 != 1 && i16 != 2 && z7 && dVar.f3805r == 0 && z8 && dVar.f3806s == 0) {
            z2 = false;
            measuredWidth = 0;
            i3 = -1;
            baseline = 0;
            max = 0;
        } else {
            if ((view instanceof u) && (dVar instanceof t.g)) {
                ((u) view).j((t.g) dVar, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            dVar.G = makeMeasureSpec;
            dVar.f3757H = makeMeasureSpec2;
            dVar.f3787g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = dVar.f3808u;
            int max2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = dVar.f3809v;
            if (i18 > 0) {
                max2 = Math.min(i18, max2);
            }
            int i19 = dVar.f3811x;
            max = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = makeMeasureSpec;
            int i21 = dVar.f3812y;
            if (i21 > 0) {
                max = Math.min(i21, max);
            }
            if (!t.j.c(constraintLayout.i, 1)) {
                if (z11 && z9) {
                    max2 = (int) ((max * dVar.f3772W) + 0.5f);
                } else if (z12 && z10) {
                    max = (int) ((max2 / dVar.f3772W) + 0.5f);
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
                dVar.G = i2;
                dVar.f3757H = makeMeasureSpec2;
                z2 = false;
                dVar.f3787g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i3 = -1;
        }
        boolean z13 = baseline != i3 ? true : z2;
        if (measuredWidth != c0301b.f3906c || max != c0301b.d) {
            z2 = true;
        }
        c0301b.i = z2;
        boolean z14 = eVar2.f4019c0 ? true : z13;
        if (z14 && baseline != -1 && dVar.f3777a0 != baseline) {
            c0301b.i = true;
        }
        c0301b.f3907e = measuredWidth;
        c0301b.f3908f = max;
        c0301b.f3910h = z14;
        c0301b.f3909g = baseline;
    }
}
