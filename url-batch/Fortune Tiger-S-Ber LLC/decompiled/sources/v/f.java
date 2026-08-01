package v;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3482a;

    /* renamed from: b, reason: collision with root package name */
    public int f3483b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f3484d;

    /* renamed from: e, reason: collision with root package name */
    public int f3485e;

    /* renamed from: f, reason: collision with root package name */
    public int f3486f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f3482a = constraintLayout2;
    }

    public static boolean a(int i4, int i5, int i6) {
        if (i4 == i5) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i6 == size;
        }
        return false;
    }

    public final void b(s.d dVar, t.b bVar) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        boolean z3;
        int measuredWidth;
        int baseline;
        int i4;
        if (dVar == null) {
            return;
        }
        s.c cVar = dVar.K;
        s.c cVar2 = dVar.I;
        if (dVar.f3242g0 == 8) {
            bVar.f3322e = 0;
            bVar.f3323f = 0;
            bVar.g = 0;
            return;
        }
        if (dVar.T == null) {
            return;
        }
        r rVar = ConstraintLayout.f258u;
        int i5 = bVar.f3319a;
        int i6 = bVar.f3320b;
        int i7 = bVar.c;
        int i8 = bVar.f3321d;
        int i9 = this.f3483b + this.c;
        int i10 = this.f3484d;
        View view = dVar.f0;
        int a4 = q.e.a(i5);
        if (a4 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (a4 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3486f, i10, -2);
        } else if (a4 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3486f, i10, -2);
            boolean z4 = dVar.f3261r == 1;
            int i11 = bVar.f3325j;
            if (i11 == 1 || i11 == 2) {
                boolean z5 = view.getMeasuredHeight() == dVar.k();
                if (bVar.f3325j == 2 || !z4 || ((z4 && z5) || dVar.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                }
            }
        } else if (a4 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i12 = this.f3486f;
            int i13 = cVar2 != null ? cVar2.g : 0;
            if (cVar != null) {
                i13 += cVar.g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i12, i10 + i13, -1);
        }
        int a5 = q.e.a(i6);
        if (a5 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        } else if (a5 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i9, -2);
        } else if (a5 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i9, -2);
            boolean z6 = dVar.f3262s == 1;
            int i14 = bVar.f3325j;
            if (i14 == 1 || i14 == 2) {
                boolean z7 = view.getMeasuredWidth() == dVar.q();
                if (bVar.f3325j == 2 || !z6 || ((z6 && z7) || dVar.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                }
            }
        } else if (a5 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i15 = this.g;
            int i16 = cVar2 != null ? dVar.J.g : 0;
            if (cVar != null) {
                i16 += dVar.L.g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i15, i9 + i16, -1);
        }
        s.e eVar = (s.e) dVar.T;
        ConstraintLayout constraintLayout = this.h;
        if (eVar != null && s.j.c(constraintLayout.f265n, 256) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.a0 && !dVar.z() && a(dVar.G, makeMeasureSpec, dVar.q()) && a(dVar.H, makeMeasureSpec2, dVar.k())) {
            bVar.f3322e = dVar.q();
            bVar.f3323f = dVar.k();
            bVar.g = dVar.a0;
            return;
        }
        boolean z8 = i5 == 3;
        boolean z9 = i6 == 3;
        boolean z10 = i6 == 4 || i6 == 1;
        boolean z11 = i5 == 4 || i5 == 1;
        boolean z12 = z8 && dVar.W > 0.0f;
        boolean z13 = z9 && dVar.W > 0.0f;
        if (view == null) {
            return;
        }
        e eVar2 = (e) view.getLayoutParams();
        int i17 = bVar.f3325j;
        if (i17 != 1 && i17 != 2 && z8 && dVar.f3261r == 0 && z9 && dVar.f3262s == 0) {
            z3 = false;
            measuredWidth = 0;
            baseline = 0;
            i4 = -1;
            max = 0;
        } else {
            if ((view instanceof s) && (dVar instanceof s.g)) {
                ((s) view).j((s.g) dVar, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            dVar.G = makeMeasureSpec;
            dVar.H = makeMeasureSpec2;
            dVar.g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i18 = dVar.f3264u;
            int max2 = i18 > 0 ? Math.max(i18, measuredWidth2) : measuredWidth2;
            int i19 = dVar.f3265v;
            if (i19 > 0) {
                max2 = Math.min(i19, max2);
            }
            int i20 = dVar.f3267x;
            max = i20 > 0 ? Math.max(i20, measuredHeight) : measuredHeight;
            int i21 = makeMeasureSpec2;
            int i22 = dVar.f3268y;
            if (i22 > 0) {
                max = Math.min(i22, max);
            }
            if (!s.j.c(constraintLayout.f265n, 1)) {
                if (z12 && z10) {
                    max2 = (int) ((max * dVar.W) + 0.5f);
                } else if (z13 && z11) {
                    max = (int) ((max2 / dVar.W) + 0.5f);
                }
            }
            if (measuredWidth2 == max2 && measuredHeight == max) {
                baseline = baseline2;
                measuredWidth = max2;
                z3 = false;
            } else {
                if (measuredWidth2 != max2) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                }
                int makeMeasureSpec3 = measuredHeight != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i21;
                view.measure(makeMeasureSpec, makeMeasureSpec3);
                dVar.G = makeMeasureSpec;
                dVar.H = makeMeasureSpec3;
                z3 = false;
                dVar.g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i4 = -1;
        }
        boolean z14 = baseline != i4 ? true : z3;
        bVar.f3324i = (measuredWidth == bVar.c && max == bVar.f3321d) ? z3 : true;
        boolean z15 = eVar2.f3448c0 ? true : z14;
        if (z15 && baseline != -1 && dVar.a0 != baseline) {
            bVar.f3324i = true;
        }
        bVar.f3322e = measuredWidth;
        bVar.f3323f = max;
        bVar.h = z15;
        bVar.g = baseline;
    }
}
