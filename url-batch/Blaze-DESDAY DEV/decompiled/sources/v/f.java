package v;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import q.AbstractC0290e;
import t.C0299b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3869a;

    /* renamed from: b, reason: collision with root package name */
    public int f3870b;

    /* renamed from: c, reason: collision with root package name */
    public int f3871c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3872e;

    /* renamed from: f, reason: collision with root package name */
    public int f3873f;

    /* renamed from: g, reason: collision with root package name */
    public int f3874g;
    public final /* synthetic */ ConstraintLayout h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f3869a = constraintLayout2;
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

    public final void b(s.d dVar, C0299b c0299b) {
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
        if (dVar.f3612g0 == 8) {
            c0299b.f3730e = 0;
            c0299b.f3731f = 0;
            c0299b.f3732g = 0;
            return;
        }
        if (dVar.f3593T == null) {
            return;
        }
        int i4 = c0299b.f3727a;
        int i5 = c0299b.f3728b;
        int i6 = c0299b.f3729c;
        int i7 = c0299b.d;
        int i8 = this.f3870b + this.f3871c;
        int i9 = this.d;
        View view = dVar.f3610f0;
        int a2 = AbstractC0290e.a(i4);
        s.c cVar = dVar.f3584K;
        s.c cVar2 = dVar.f3582I;
        if (a2 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (a2 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3873f, i9, -2);
        } else if (a2 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3873f, i9, -2);
            boolean z3 = dVar.f3629r == 1;
            int i10 = c0299b.f3733j;
            if (i10 == 1 || i10 == 2) {
                boolean z4 = view.getMeasuredHeight() == dVar.k();
                if (c0299b.f3733j == 2 || !z3 || ((z3 && z4) || dVar.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                }
            }
        } else if (a2 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i11 = this.f3873f;
            int i12 = cVar2 != null ? cVar2.f3574g : 0;
            if (cVar != null) {
                i12 += cVar.f3574g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int a3 = AbstractC0290e.a(i5);
        if (a3 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (a3 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3874g, i8, -2);
        } else if (a3 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3874g, i8, -2);
            boolean z5 = dVar.f3630s == 1;
            int i13 = c0299b.f3733j;
            if (i13 == 1 || i13 == 2) {
                boolean z6 = view.getMeasuredWidth() == dVar.q();
                if (c0299b.f3733j == 2 || !z5 || ((z5 && z6) || dVar.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                }
            }
        } else if (a3 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i14 = this.f3874g;
            int i15 = cVar2 != null ? dVar.f3583J.f3574g : 0;
            if (cVar != null) {
                i15 += dVar.f3585L.f3574g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        s.e eVar = (s.e) dVar.f3593T;
        ConstraintLayout constraintLayout = this.h;
        if (eVar != null && s.j.c(constraintLayout.i, 256) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.f3601a0 && !dVar.z() && a(dVar.f3580G, makeMeasureSpec, dVar.q()) && a(dVar.f3581H, makeMeasureSpec2, dVar.k())) {
            c0299b.f3730e = dVar.q();
            c0299b.f3731f = dVar.k();
            c0299b.f3732g = dVar.f3601a0;
            return;
        }
        boolean z7 = i4 == 3;
        boolean z8 = i5 == 3;
        boolean z9 = i5 == 4 || i5 == 1;
        boolean z10 = i4 == 4 || i4 == 1;
        boolean z11 = z7 && dVar.f3596W > RecyclerView.f1559A0;
        boolean z12 = z8 && dVar.f3596W > RecyclerView.f1559A0;
        if (view == null) {
            return;
        }
        e eVar2 = (e) view.getLayoutParams();
        int i16 = c0299b.f3733j;
        if (i16 != 1 && i16 != 2 && z7 && dVar.f3629r == 0 && z8 && dVar.f3630s == 0) {
            z2 = false;
            measuredWidth = 0;
            i3 = -1;
            baseline = 0;
            max = 0;
        } else {
            if ((view instanceof u) && (dVar instanceof s.g)) {
                ((u) view).j((s.g) dVar, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            dVar.f3580G = makeMeasureSpec;
            dVar.f3581H = makeMeasureSpec2;
            dVar.f3611g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = dVar.f3632u;
            int max2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = dVar.f3633v;
            if (i18 > 0) {
                max2 = Math.min(i18, max2);
            }
            int i19 = dVar.f3635x;
            max = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = makeMeasureSpec;
            int i21 = dVar.f3636y;
            if (i21 > 0) {
                max = Math.min(i21, max);
            }
            if (!s.j.c(constraintLayout.i, 1)) {
                if (z11 && z9) {
                    max2 = (int) ((max * dVar.f3596W) + 0.5f);
                } else if (z12 && z10) {
                    max = (int) ((max2 / dVar.f3596W) + 0.5f);
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
                dVar.f3580G = i2;
                dVar.f3581H = makeMeasureSpec2;
                z2 = false;
                dVar.f3611g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i3 = -1;
        }
        boolean z13 = baseline != i3 ? true : z2;
        if (measuredWidth != c0299b.f3729c || max != c0299b.d) {
            z2 = true;
        }
        c0299b.i = z2;
        boolean z14 = eVar2.f3836c0 ? true : z13;
        if (z14 && baseline != -1 && dVar.f3601a0 != baseline) {
            c0299b.i = true;
        }
        c0299b.f3730e = measuredWidth;
        c0299b.f3731f = max;
        c0299b.h = z14;
        c0299b.f3732g = baseline;
    }
}
