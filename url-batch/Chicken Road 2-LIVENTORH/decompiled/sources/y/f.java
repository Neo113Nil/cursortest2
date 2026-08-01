package y;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3674a;

    /* renamed from: b, reason: collision with root package name */
    public int f3675b;

    /* renamed from: c, reason: collision with root package name */
    public int f3676c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3677e;

    /* renamed from: f, reason: collision with root package name */
    public int f3678f;

    /* renamed from: g, reason: collision with root package name */
    public int f3679g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f3680h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f3680h = constraintLayout;
        this.f3674a = constraintLayout2;
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
        boolean z3;
        int measuredWidth;
        int baseline;
        int i;
        if (dVar == null) {
            return;
        }
        v.c cVar = dVar.K;
        v.c cVar2 = dVar.I;
        if (dVar.f3402g0 == 8) {
            bVar.f3513e = 0;
            bVar.f3514f = 0;
            bVar.f3515g = 0;
            return;
        }
        if (dVar.T == null) {
            return;
        }
        s sVar = ConstraintLayout.f242u;
        int i4 = bVar.f3510a;
        int i5 = bVar.f3511b;
        int i6 = bVar.f3512c;
        int i7 = bVar.d;
        int i8 = this.f3675b + this.f3676c;
        int i9 = this.d;
        View view = dVar.f3400f0;
        int a2 = t.e.a(i4);
        if (a2 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (a2 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3678f, i9, -2);
        } else if (a2 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3678f, i9, -2);
            boolean z4 = dVar.f3420r == 1;
            int i10 = bVar.f3517j;
            if (i10 == 1 || i10 == 2) {
                boolean z5 = view.getMeasuredHeight() == dVar.k();
                if (bVar.f3517j == 2 || !z4 || ((z4 && z5) || dVar.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                }
            }
        } else if (a2 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i11 = this.f3678f;
            int i12 = cVar2 != null ? cVar2.f3389g : 0;
            if (cVar != null) {
                i12 += cVar.f3389g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int a4 = t.e.a(i5);
        if (a4 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (a4 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3679g, i8, -2);
        } else if (a4 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3679g, i8, -2);
            boolean z6 = dVar.f3421s == 1;
            int i13 = bVar.f3517j;
            if (i13 == 1 || i13 == 2) {
                boolean z7 = view.getMeasuredWidth() == dVar.q();
                if (bVar.f3517j == 2 || !z6 || ((z6 && z7) || dVar.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                }
            }
        } else if (a4 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i14 = this.f3679g;
            int i15 = cVar2 != null ? dVar.J.f3389g : 0;
            if (cVar != null) {
                i15 += dVar.L.f3389g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        v.e eVar = (v.e) dVar.T;
        ConstraintLayout constraintLayout = this.f3680h;
        if (eVar != null && v.j.c(constraintLayout.f250n, 256) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.f3392a0 && !dVar.z() && a(dVar.G, makeMeasureSpec, dVar.q()) && a(dVar.H, makeMeasureSpec2, dVar.k())) {
            bVar.f3513e = dVar.q();
            bVar.f3514f = dVar.k();
            bVar.f3515g = dVar.f3392a0;
            return;
        }
        boolean z8 = i4 == 3;
        boolean z9 = i5 == 3;
        boolean z10 = i5 == 4 || i5 == 1;
        boolean z11 = i4 == 4 || i4 == 1;
        boolean z12 = z8 && dVar.W > 0.0f;
        boolean z13 = z9 && dVar.W > 0.0f;
        if (view == null) {
            return;
        }
        e eVar2 = (e) view.getLayoutParams();
        int i16 = bVar.f3517j;
        if (i16 != 1 && i16 != 2 && z8 && dVar.f3420r == 0 && z9 && dVar.f3421s == 0) {
            z3 = false;
            measuredWidth = 0;
            baseline = 0;
            i = -1;
            max = 0;
        } else {
            if ((view instanceof t) && (dVar instanceof v.g)) {
                ((t) view).j((v.g) dVar, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            dVar.G = makeMeasureSpec;
            dVar.H = makeMeasureSpec2;
            dVar.f3401g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = dVar.f3423u;
            int max2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = dVar.f3424v;
            if (i18 > 0) {
                max2 = Math.min(i18, max2);
            }
            int i19 = dVar.f3426x;
            max = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = makeMeasureSpec2;
            int i21 = dVar.f3427y;
            if (i21 > 0) {
                max = Math.min(i21, max);
            }
            if (!v.j.c(constraintLayout.f250n, 1)) {
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
                int makeMeasureSpec3 = measuredHeight != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i20;
                view.measure(makeMeasureSpec, makeMeasureSpec3);
                dVar.G = makeMeasureSpec;
                dVar.H = makeMeasureSpec3;
                z3 = false;
                dVar.f3401g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i = -1;
        }
        boolean z14 = baseline != i ? true : z3;
        bVar.i = (measuredWidth == bVar.f3512c && max == bVar.d) ? z3 : true;
        boolean z15 = eVar2.f3641c0 ? true : z14;
        if (z15 && baseline != -1 && dVar.f3392a0 != baseline) {
            bVar.i = true;
        }
        bVar.f3513e = measuredWidth;
        bVar.f3514f = max;
        bVar.f3516h = z15;
        bVar.f3515g = baseline;
    }
}
