package J0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x.AbstractC0334a;
import x1.l;

/* loaded from: classes.dex */
public final class c extends x1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0334a f404f;

    public /* synthetic */ c(AbstractC0334a abstractC0334a, int i) {
        this.f403e = i;
        this.f404f = abstractC0334a;
    }

    @Override // x1.d
    public int F(View view) {
        switch (this.f403e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f404f;
                return sideSheetBehavior.f1841l + sideSheetBehavior.f1844o;
            default:
                return super.F(view);
        }
    }

    @Override // x1.d
    public int G() {
        switch (this.f403e) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f404f;
                return bottomSheetBehavior.f1647I ? bottomSheetBehavior.f1658T : bottomSheetBehavior.f1645G;
            default:
                return super.G();
        }
    }

    @Override // x1.d
    public final void T(int i) {
        switch (this.f403e) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f404f;
                    if (sideSheetBehavior.f1838g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f404f;
                    if (bottomSheetBehavior.f1649K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // x1.d
    public final void U(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f403e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f404f;
                WeakReference weakReference = sideSheetBehavior.f1846q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f1833a.k0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1850u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f1833a.i(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.f404f).u(i2);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r4.f1644E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f1644E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f1643D) < java.lang.Math.abs(r7 - r4.f1645G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (r0.f1833a.Q(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f1833a.C()) < java.lang.Math.abs(r7 - r0.f1833a.E())) goto L73;
     */
    @Override // x1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(View view, float f2, float f3) {
        switch (this.f403e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f404f;
                int i = 3;
                if (!sideSheetBehavior.f1833a.O(f2)) {
                    if (sideSheetBehavior.f1833a.e0(view, f2)) {
                        if (!sideSheetBehavior.f1833a.R(f2, f3)) {
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
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f404f;
                if (f3 < 0.0f) {
                    if (!bottomSheetBehavior.f1667b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i2 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i2, true);
                    break;
                } else if (bottomSheetBehavior.f1647I && bottomSheetBehavior.D(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= bottomSheetBehavior.d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f1658T) / 2) {
                            if (!bottomSheetBehavior.f1667b) {
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
                        if (bottomSheetBehavior.f1667b) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.f1644E;
                            if (top2 < i3) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f1645G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 3;
                            } else {
                                if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.f1645G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f1667b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f1644E) < Math.abs(top3 - bottomSheetBehavior.f1645G)) {
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

    @Override // x1.d
    public final int k(View view, int i) {
        switch (this.f403e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f404f;
                return l.m(i, sideSheetBehavior.f1833a.G(), sideSheetBehavior.f1833a.F());
            default:
                return view.getLeft();
        }
    }

    @Override // x1.d
    public final int l(View view, int i) {
        switch (this.f403e) {
            case 0:
                return view.getTop();
            default:
                return l.m(i, ((BottomSheetBehavior) this.f404f).x(), G());
        }
    }

    @Override // x1.d
    public final boolean m0(View view, int i) {
        WeakReference weakReference;
        switch (this.f403e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f404f;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.f1845p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f404f;
                int i2 = bottomSheetBehavior.f1650L;
                if (i2 != 1 && !bottomSheetBehavior.f1666a0) {
                    if (i2 == 3 && bottomSheetBehavior.f1663Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f1660V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f1659U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
