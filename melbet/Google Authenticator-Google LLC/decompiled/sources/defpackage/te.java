package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class te {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    final /* synthetic */ ConstraintLayout h;

    public te(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    private static final boolean b(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void a(sd sdVar, sm smVar) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int baseline;
        int max;
        int max2;
        int i;
        int i2;
        if (sdVar == null) {
            return;
        }
        if (sdVar.ai == 8) {
            smVar.c = 0;
            smVar.d = 0;
            smVar.e = 0;
            return;
        }
        if (sdVar.V != null) {
            int i3 = smVar.i;
            int i4 = smVar.j;
            int i5 = smVar.a;
            int i6 = smVar.b;
            int i7 = this.b + this.c;
            int i8 = this.d;
            Object obj = sdVar.ah;
            int i9 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i9 == 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else if (i9 == 1) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
            } else if (i9 == 2) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
                int i10 = sdVar.t;
                int i11 = smVar.h;
                if (i11 == 1 || i11 == 2) {
                    int measuredHeight = ((View) obj).getMeasuredHeight();
                    int h = sdVar.h();
                    if (smVar.h == 2 || i10 != 1 || measuredHeight == h || (obj instanceof tp) || sdVar.e()) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(sdVar.j(), 1073741824);
                    }
                }
            } else if (i9 != 3) {
                makeMeasureSpec = 0;
            } else {
                int i12 = this.f;
                sc scVar = sdVar.K;
                int i13 = scVar != null ? scVar.f : 0;
                sc scVar2 = sdVar.M;
                if (scVar2 != null) {
                    i13 += scVar2.f;
                }
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(i12, i8 + i13, -1);
            }
            int i14 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i14 == 0) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            } else if (i14 == 1) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i7, -2);
            } else if (i14 == 2) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i7, -2);
                int i15 = sdVar.u;
                int i16 = smVar.h;
                if (i16 == 1 || i16 == 2) {
                    int measuredWidth = ((View) obj).getMeasuredWidth();
                    int j = sdVar.j();
                    if (smVar.h == 2 || i15 != 1 || measuredWidth == j || (obj instanceof tp) || sdVar.f()) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(sdVar.h(), 1073741824);
                    }
                }
            } else if (i14 != 3) {
                makeMeasureSpec2 = 0;
            } else {
                int i17 = this.g;
                int i18 = sdVar.K != null ? sdVar.L.f : 0;
                if (sdVar.M != null) {
                    i18 += sdVar.N.f;
                }
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, i7 + i18, -1);
            }
            sd sdVar2 = sdVar.V;
            if (sdVar2 != null && sj.b(this.h.f, 256)) {
                View view = (View) obj;
                if (view.getMeasuredWidth() == sdVar.j() && view.getMeasuredWidth() < sdVar2.j() && view.getMeasuredHeight() == sdVar.h() && view.getMeasuredHeight() < sdVar2.h() && view.getBaseline() == sdVar.ac && !sdVar.L() && b(sdVar.I, makeMeasureSpec, sdVar.j()) && b(sdVar.J, makeMeasureSpec2, sdVar.h())) {
                    smVar.c = sdVar.j();
                    smVar.d = sdVar.h();
                    smVar.e = sdVar.ac;
                    return;
                }
            }
            boolean z = i3 == 3;
            boolean z2 = i4 == 3;
            boolean z3 = i4 == 4 || i4 == 1;
            boolean z4 = i3 == 4 || i3 == 1;
            boolean z5 = z && sdVar.Y > 0.0f;
            boolean z6 = z2 && sdVar.Y > 0.0f;
            if (obj != null) {
                View view2 = (View) obj;
                td tdVar = (td) view2.getLayoutParams();
                boolean z7 = z4;
                int i19 = smVar.h;
                if (i19 != 1 && i19 != 2 && z && sdVar.t == 0 && z2 && sdVar.u == 0) {
                    i = -1;
                    baseline = 0;
                    max = 0;
                    max2 = 0;
                } else {
                    if ((obj instanceof ts) && (sdVar instanceof sk)) {
                        ((ts) obj).b((sk) sdVar, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view2.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    sdVar.B(makeMeasureSpec, makeMeasureSpec2);
                    int measuredWidth2 = view2.getMeasuredWidth();
                    int measuredHeight2 = view2.getMeasuredHeight();
                    baseline = view2.getBaseline();
                    int i20 = sdVar.w;
                    max = i20 > 0 ? Math.max(i20, measuredWidth2) : measuredWidth2;
                    int i21 = sdVar.x;
                    if (i21 > 0) {
                        max = Math.min(i21, max);
                    }
                    int i22 = sdVar.z;
                    max2 = i22 > 0 ? Math.max(i22, measuredHeight2) : measuredHeight2;
                    int i23 = sdVar.A;
                    if (i23 > 0) {
                        max2 = Math.min(i23, max2);
                    }
                    if (!sj.b(this.h.f, 1)) {
                        if (z5 && z3) {
                            max = (int) ((max2 * sdVar.Y) + 0.5f);
                        } else if (z6 && z7) {
                            max2 = (int) ((max / sdVar.Y) + 0.5f);
                        }
                    }
                    if (measuredWidth2 != max || measuredHeight2 != max2) {
                        if (measuredWidth2 != max) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                        }
                        if (measuredHeight2 != max2) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                        }
                        view2.measure(makeMeasureSpec, makeMeasureSpec2);
                        sdVar.B(makeMeasureSpec, makeMeasureSpec2);
                        max = view2.getMeasuredWidth();
                        max2 = view2.getMeasuredHeight();
                        baseline = view2.getBaseline();
                    }
                    i = -1;
                }
                boolean z8 = baseline != i;
                smVar.g = (max == smVar.a && max2 == smVar.b) ? false : true;
                boolean z9 = tdVar.ag | z8;
                if (z9) {
                    if (baseline == -1) {
                        i2 = -1;
                        smVar.c = max;
                        smVar.d = max2;
                        smVar.f = z9;
                        smVar.e = i2;
                    }
                    if (sdVar.ac != baseline) {
                        smVar.g = true;
                    }
                }
                i2 = baseline;
                smVar.c = max;
                smVar.d = max2;
                smVar.f = z9;
                smVar.e = i2;
            }
        }
    }
}
