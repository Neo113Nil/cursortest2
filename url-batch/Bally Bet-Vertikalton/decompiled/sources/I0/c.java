package I0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q1.l;
import x.AbstractC0336a;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0336a f346b;

    public /* synthetic */ c(AbstractC0336a abstractC0336a, int i) {
        this.f345a = i;
        this.f346b = abstractC0336a;
    }

    @Override // q1.l
    public int A(View view) {
        switch (this.f345a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f346b;
                return sideSheetBehavior.f1744l + sideSheetBehavior.f1747o;
            default:
                return super.A(view);
        }
    }

    @Override // q1.l
    public int B() {
        switch (this.f345a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f346b;
                return bottomSheetBehavior.f1550I ? bottomSheetBehavior.f1561T : bottomSheetBehavior.f1548G;
            default:
                return super.B();
        }
    }

    @Override // q1.l
    public final void J(int i) {
        switch (this.f345a) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f346b;
                    if (sideSheetBehavior.f1741g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f346b;
                    if (bottomSheetBehavior.f1552K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // q1.l
    public final void K(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f345a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f346b;
                WeakReference weakReference = sideSheetBehavior.f1749q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f1736a.v0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1753u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f1736a.i(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.f346b).u(i2);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r4.f1547E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f1547E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f1546D) < java.lang.Math.abs(r7 - r4.f1548G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (r0.f1736a.U(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f1736a.F()) < java.lang.Math.abs(r7 - r0.f1736a.G())) goto L73;
     */
    @Override // q1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(View view, float f2, float f3) {
        switch (this.f345a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f346b;
                int i = 3;
                if (!sideSheetBehavior.f1736a.S(f2)) {
                    if (sideSheetBehavior.f1736a.s0(view, f2)) {
                        if (!sideSheetBehavior.f1736a.W(f2, f3)) {
                            break;
                        }
                        i = 5;
                    } else {
                        if (f2 == 0.0f || Math.abs(f2) <= Math.abs(f3)) {
                            int left = view.getLeft();
                            break;
                        }
                        i = 5;
                    }
                }
                sideSheetBehavior.t(view, i, true);
                break;
            default:
                int i2 = 6;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f346b;
                if (f3 < 0.0f) {
                    if (!bottomSheetBehavior.f1570b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i2 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i2, true);
                    break;
                } else if (bottomSheetBehavior.f1550I && bottomSheetBehavior.D(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= bottomSheetBehavior.d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f1561T) / 2) {
                            if (!bottomSheetBehavior.f1570b) {
                                break;
                            }
                            i2 = 3;
                            bottomSheetBehavior.getClass();
                            bottomSheetBehavior.E(view, i2, true);
                        }
                    }
                    i2 = 5;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i2, true);
                } else {
                    if (f3 == 0.0f || Math.abs(f2) > Math.abs(f3)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.f1570b) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.f1547E;
                            if (top2 < i3) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f1548G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 3;
                            } else {
                                if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.f1548G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f1570b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f1547E) < Math.abs(top3 - bottomSheetBehavior.f1548G)) {
                                bottomSheetBehavior.getClass();
                            }
                        }
                        i2 = 4;
                    }
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i2, true);
                }
                break;
        }
    }

    @Override // q1.l
    public final boolean b0(View view, int i) {
        WeakReference weakReference;
        switch (this.f345a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f346b;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.f1748p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f346b;
                int i2 = bottomSheetBehavior.f1553L;
                if (i2 != 1 && !bottomSheetBehavior.f1569a0) {
                    if (i2 == 3 && bottomSheetBehavior.f1566Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f1563V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f1562U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // q1.l
    public final int m(View view, int i) {
        switch (this.f345a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f346b;
                return l.l(i, sideSheetBehavior.f1736a.K(), sideSheetBehavior.f1736a.J());
            default:
                return view.getLeft();
        }
    }

    @Override // q1.l
    public final int n(View view, int i) {
        switch (this.f345a) {
            case 0:
                return view.getTop();
            default:
                return l.l(i, ((BottomSheetBehavior) this.f346b).x(), B());
        }
    }
}
