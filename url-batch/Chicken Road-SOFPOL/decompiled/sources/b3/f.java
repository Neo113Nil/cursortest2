package b3;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1121a;

    /* renamed from: b, reason: collision with root package name */
    public int f1122b;

    /* renamed from: c, reason: collision with root package name */
    public int f1123c;

    /* renamed from: d, reason: collision with root package name */
    public int f1124d;

    /* renamed from: e, reason: collision with root package name */
    public int f1125e;

    /* renamed from: f, reason: collision with root package name */
    public int f1126f;

    /* renamed from: g, reason: collision with root package name */
    public int f1127g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f1128h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f1128h = constraintLayout;
        this.f1121a = constraintLayout2;
    }

    public static boolean a(int i, int i8, int i9) {
        if (i == i8) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i9 == size;
        }
        return false;
    }

    public final void b(y2.d dVar, z2.b bVar) {
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
        y2.c cVar = dVar.K;
        y2.c cVar2 = dVar.I;
        if (dVar.f8760g0 == 8) {
            bVar.f9122e = 0;
            bVar.f9123f = 0;
            bVar.f9124g = 0;
            return;
        }
        if (dVar.T == null) {
            return;
        }
        t tVar = ConstraintLayout.f570s;
        int i8 = bVar.f9118a;
        int i9 = bVar.f9119b;
        int i10 = bVar.f9120c;
        int i11 = bVar.f9121d;
        int i12 = this.f1122b + this.f1123c;
        int i13 = this.f1124d;
        View view = dVar.f8758f0;
        int a8 = w2.e.a(i8);
        if (a8 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        } else if (a8 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1126f, i13, -2);
        } else if (a8 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1126f, i13, -2);
            boolean z7 = dVar.f8779r == 1;
            int i14 = bVar.f9126j;
            if (i14 == 1 || i14 == 2) {
                boolean z8 = view.getMeasuredHeight() == dVar.k();
                if (bVar.f9126j == 2 || !z7 || ((z7 && z8) || dVar.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                }
            }
        } else if (a8 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i15 = this.f1126f;
            int i16 = cVar2 != null ? cVar2.f8745g : 0;
            if (cVar != null) {
                i16 += cVar.f8745g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i15, i13 + i16, -1);
        }
        int a9 = w2.e.a(i9);
        if (a9 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        } else if (a9 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1127g, i12, -2);
        } else if (a9 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1127g, i12, -2);
            boolean z9 = dVar.f8780s == 1;
            int i17 = bVar.f9126j;
            if (i17 == 1 || i17 == 2) {
                boolean z10 = view.getMeasuredWidth() == dVar.q();
                if (bVar.f9126j == 2 || !z9 || ((z9 && z10) || dVar.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                }
            }
        } else if (a9 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i18 = this.f1127g;
            int i19 = cVar2 != null ? dVar.J.f8745g : 0;
            if (cVar != null) {
                i19 += dVar.L.f8745g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i18, i12 + i19, -1);
        }
        y2.e eVar = (y2.e) dVar.T;
        ConstraintLayout constraintLayout = this.f1128h;
        if (eVar != null && y2.j.c(constraintLayout.f578l, 256) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.f8748a0 && !dVar.z() && a(dVar.G, makeMeasureSpec, dVar.q()) && a(dVar.H, makeMeasureSpec2, dVar.k())) {
            bVar.f9122e = dVar.q();
            bVar.f9123f = dVar.k();
            bVar.f9124g = dVar.f8748a0;
            return;
        }
        boolean z11 = i8 == 3;
        boolean z12 = i9 == 3;
        boolean z13 = i9 == 4 || i9 == 1;
        boolean z14 = i8 == 4 || i8 == 1;
        boolean z15 = z11 && dVar.W > 0.0f;
        boolean z16 = z12 && dVar.W > 0.0f;
        if (view == null) {
            return;
        }
        e eVar2 = (e) view.getLayoutParams();
        int i20 = bVar.f9126j;
        if (i20 != 1 && i20 != 2 && z11 && dVar.f8779r == 0 && z12 && dVar.f8780s == 0) {
            z3 = false;
            measuredWidth = 0;
            baseline = 0;
            i = -1;
            max = 0;
        } else {
            if ((view instanceof u) && (dVar instanceof y2.g)) {
                ((u) view).j((y2.g) dVar, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            dVar.G = makeMeasureSpec;
            dVar.H = makeMeasureSpec2;
            dVar.f8759g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i21 = dVar.f8782u;
            int max2 = i21 > 0 ? Math.max(i21, measuredWidth2) : measuredWidth2;
            int i22 = dVar.f8783v;
            if (i22 > 0) {
                max2 = Math.min(i22, max2);
            }
            int i23 = dVar.f8785x;
            max = i23 > 0 ? Math.max(i23, measuredHeight) : measuredHeight;
            int i24 = makeMeasureSpec2;
            int i25 = dVar.f8786y;
            if (i25 > 0) {
                max = Math.min(i25, max);
            }
            if (!y2.j.c(constraintLayout.f578l, 1)) {
                if (z15 && z13) {
                    max2 = (int) ((max * dVar.W) + 0.5f);
                } else if (z16 && z14) {
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
                int makeMeasureSpec3 = measuredHeight != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i24;
                view.measure(makeMeasureSpec, makeMeasureSpec3);
                dVar.G = makeMeasureSpec;
                dVar.H = makeMeasureSpec3;
                z3 = false;
                dVar.f8759g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i = -1;
        }
        boolean z17 = baseline != i ? true : z3;
        bVar.i = (measuredWidth == bVar.f9120c && max == bVar.f9121d) ? z3 : true;
        boolean z18 = eVar2.f1085c0 ? true : z17;
        if (z18 && baseline != -1 && dVar.f8748a0 != baseline) {
            bVar.i = true;
        }
        bVar.f9122e = measuredWidth;
        bVar.f9123f = max;
        bVar.f9125h = z18;
        bVar.f9124g = baseline;
    }
}
