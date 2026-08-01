package y;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3999a;

    /* renamed from: b, reason: collision with root package name */
    public int f4000b;

    /* renamed from: c, reason: collision with root package name */
    public int f4001c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4002e;

    /* renamed from: f, reason: collision with root package name */
    public int f4003f;

    /* renamed from: g, reason: collision with root package name */
    public int f4004g;
    public final /* synthetic */ ConstraintLayout h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f3999a = constraintLayout2;
    }

    public static boolean a(int i, int i4, int i5) {
        if (i == i4) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i5 == size;
        }
        return false;
    }

    public final void b(v.d dVar, w.b bVar) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        boolean z4;
        int measuredWidth;
        int baseline;
        int i;
        if (dVar == null) {
            return;
        }
        v.c cVar = dVar.K;
        v.c cVar2 = dVar.I;
        if (dVar.f3622g0 == 8) {
            bVar.f3738e = 0;
            bVar.f3739f = 0;
            bVar.f3740g = 0;
            return;
        }
        if (dVar.T == null) {
            return;
        }
        r rVar = ConstraintLayout.f367u;
        int i4 = bVar.f3735a;
        int i5 = bVar.f3736b;
        int i6 = bVar.f3737c;
        int i7 = bVar.d;
        int i8 = this.f4000b + this.f4001c;
        int i9 = this.d;
        View view = dVar.f3620f0;
        int a5 = t.e.a(i4);
        if (a5 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (a5 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4003f, i9, -2);
        } else if (a5 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4003f, i9, -2);
            boolean z5 = dVar.f3639r == 1;
            int i10 = bVar.f3741j;
            if (i10 == 1 || i10 == 2) {
                boolean z6 = view.getMeasuredHeight() == dVar.k();
                if (bVar.f3741j == 2 || !z5 || ((z5 && z6) || dVar.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                }
            }
        } else if (a5 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i11 = this.f4003f;
            int i12 = cVar2 != null ? cVar2.f3610g : 0;
            if (cVar != null) {
                i12 += cVar.f3610g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int a6 = t.e.a(i5);
        if (a6 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (a6 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4004g, i8, -2);
        } else if (a6 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4004g, i8, -2);
            boolean z7 = dVar.f3640s == 1;
            int i13 = bVar.f3741j;
            if (i13 == 1 || i13 == 2) {
                boolean z8 = view.getMeasuredWidth() == dVar.q();
                if (bVar.f3741j == 2 || !z7 || ((z7 && z8) || dVar.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                }
            }
        } else if (a6 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i14 = this.f4004g;
            int i15 = cVar2 != null ? dVar.J.f3610g : 0;
            if (cVar != null) {
                i15 += dVar.L.f3610g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        v.e eVar = (v.e) dVar.T;
        ConstraintLayout constraintLayout = this.h;
        if (eVar != null && v.j.c(constraintLayout.f374n, 256) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.f3612a0 && !dVar.z() && a(dVar.G, makeMeasureSpec, dVar.q()) && a(dVar.H, makeMeasureSpec2, dVar.k())) {
            bVar.f3738e = dVar.q();
            bVar.f3739f = dVar.k();
            bVar.f3740g = dVar.f3612a0;
            return;
        }
        boolean z9 = i4 == 3;
        boolean z10 = i5 == 3;
        boolean z11 = i5 == 4 || i5 == 1;
        boolean z12 = i4 == 4 || i4 == 1;
        boolean z13 = z9 && dVar.W > 0.0f;
        boolean z14 = z10 && dVar.W > 0.0f;
        if (view == null) {
            return;
        }
        e eVar2 = (e) view.getLayoutParams();
        int i16 = bVar.f3741j;
        if (i16 != 1 && i16 != 2 && z9 && dVar.f3639r == 0 && z10 && dVar.f3640s == 0) {
            z4 = false;
            measuredWidth = 0;
            baseline = 0;
            i = -1;
            max = 0;
        } else {
            if ((view instanceof s) && (dVar instanceof v.g)) {
                ((s) view).j((v.g) dVar, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            dVar.G = makeMeasureSpec;
            dVar.H = makeMeasureSpec2;
            dVar.f3621g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = dVar.f3642u;
            int max2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = dVar.f3643v;
            if (i18 > 0) {
                max2 = Math.min(i18, max2);
            }
            int i19 = dVar.f3645x;
            max = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = makeMeasureSpec2;
            int i21 = dVar.f3646y;
            if (i21 > 0) {
                max = Math.min(i21, max);
            }
            if (!v.j.c(constraintLayout.f374n, 1)) {
                if (z13 && z11) {
                    max2 = (int) ((max * dVar.W) + 0.5f);
                } else if (z14 && z12) {
                    max = (int) ((max2 / dVar.W) + 0.5f);
                }
            }
            if (measuredWidth2 == max2 && measuredHeight == max) {
                baseline = baseline2;
                measuredWidth = max2;
                z4 = false;
            } else {
                if (measuredWidth2 != max2) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                }
                int makeMeasureSpec3 = measuredHeight != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i20;
                view.measure(makeMeasureSpec, makeMeasureSpec3);
                dVar.G = makeMeasureSpec;
                dVar.H = makeMeasureSpec3;
                z4 = false;
                dVar.f3621g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i = -1;
        }
        boolean z15 = baseline != i ? true : z4;
        bVar.i = (measuredWidth == bVar.f3737c && max == bVar.d) ? z4 : true;
        boolean z16 = eVar2.f3967c0 ? true : z15;
        if (z16 && baseline != -1 && dVar.f3612a0 != baseline) {
            bVar.i = true;
        }
        bVar.f3738e = measuredWidth;
        bVar.f3739f = max;
        bVar.h = z16;
        bVar.f3740g = baseline;
    }
}
