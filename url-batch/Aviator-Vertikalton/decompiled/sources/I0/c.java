package I0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q1.l;
import x.AbstractC0361a;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f373g;
    public final /* synthetic */ AbstractC0361a h;

    public /* synthetic */ c(AbstractC0361a abstractC0361a, int i) {
        this.f373g = i;
        this.h = abstractC0361a;
    }

    @Override // q1.l
    public int H(View view) {
        switch (this.f373g) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.h;
                return sideSheetBehavior.f1963l + sideSheetBehavior.f1966o;
            default:
                return super.H(view);
        }
    }

    @Override // q1.l
    public int I() {
        switch (this.f373g) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.h;
                return bottomSheetBehavior.f1761I ? bottomSheetBehavior.f1772T : bottomSheetBehavior.f1759G;
            default:
                return super.I();
        }
    }

    @Override // q1.l
    public final void X(int i) {
        switch (this.f373g) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.h;
                    if (sideSheetBehavior.f1960g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.h;
                    if (bottomSheetBehavior.f1763K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // q1.l
    public final void Y(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f373g) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.h;
                WeakReference weakReference = sideSheetBehavior.f1968q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f1954a.t0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1972u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f1954a.f(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.h).u(i2);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r4.f1758E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f1758E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f1757D) < java.lang.Math.abs(r7 - r4.f1759G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (r0.f1954a.N(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f1954a.x()) < java.lang.Math.abs(r7 - r0.f1954a.z())) goto L73;
     */
    @Override // q1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(View view, float f2, float f3) {
        switch (this.f373g) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.h;
                int i = 3;
                if (!sideSheetBehavior.f1954a.L(f2)) {
                    if (sideSheetBehavior.f1954a.r0(view, f2)) {
                        if (!sideSheetBehavior.f1954a.O(f2, f3)) {
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
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.h;
                if (f3 < 0.0f) {
                    if (!bottomSheetBehavior.f1781b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i2 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i2, true);
                    break;
                } else if (bottomSheetBehavior.f1761I && bottomSheetBehavior.D(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= bottomSheetBehavior.f1785d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f1772T) / 2) {
                            if (!bottomSheetBehavior.f1781b) {
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
                        if (bottomSheetBehavior.f1781b) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.f1758E;
                            if (top2 < i3) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f1759G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 3;
                            } else {
                                if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.f1759G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f1781b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f1758E) < Math.abs(top3 - bottomSheetBehavior.f1759G)) {
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
    public final int i(View view, int i) {
        switch (this.f373g) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.h;
                return l.h(i, sideSheetBehavior.f1954a.C(), sideSheetBehavior.f1954a.B());
            default:
                return view.getLeft();
        }
    }

    @Override // q1.l
    public final int j(View view, int i) {
        switch (this.f373g) {
            case 0:
                return view.getTop();
            default:
                return l.h(i, ((BottomSheetBehavior) this.h).x(), I());
        }
    }

    @Override // q1.l
    public final boolean s0(View view, int i) {
        WeakReference weakReference;
        switch (this.f373g) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.h;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.f1967p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.h;
                int i2 = bottomSheetBehavior.f1764L;
                if (i2 != 1 && !bottomSheetBehavior.f1780a0) {
                    if (i2 == 3 && bottomSheetBehavior.f1777Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f1774V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f1773U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
