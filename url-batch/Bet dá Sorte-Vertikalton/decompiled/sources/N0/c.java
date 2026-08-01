package N0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x.AbstractC0319a;

/* loaded from: classes.dex */
public final class c extends u1.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f567c;
    public final /* synthetic */ AbstractC0319a d;

    public /* synthetic */ c(AbstractC0319a abstractC0319a, int i) {
        this.f567c = i;
        this.d = abstractC0319a;
    }

    @Override // u1.d
    public int J(View view) {
        switch (this.f567c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.d;
                return sideSheetBehavior.f1870l + sideSheetBehavior.f1873o;
            default:
                return super.J(view);
        }
    }

    @Override // u1.d
    public int K() {
        switch (this.f567c) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.d;
                return bottomSheetBehavior.f1676I ? bottomSheetBehavior.f1687T : bottomSheetBehavior.f1674G;
            default:
                return super.K();
        }
    }

    @Override // u1.d
    public final void T(int i) {
        switch (this.f567c) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.d;
                    if (sideSheetBehavior.f1867g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.d;
                    if (bottomSheetBehavior.f1678K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // u1.d
    public final void U(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f567c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.d;
                WeakReference weakReference = sideSheetBehavior.f1875q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f1862a.q0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1879u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f1862a.j(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.d).u(i2);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r4.f1673E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f1673E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f1672D) < java.lang.Math.abs(r7 - r4.f1674G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (r0.f1862a.P(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f1862a.y()) < java.lang.Math.abs(r7 - r0.f1862a.z())) goto L73;
     */
    @Override // u1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(View view, float f2, float f3) {
        switch (this.f567c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.d;
                int i = 3;
                if (!sideSheetBehavior.f1862a.N(f2)) {
                    if (sideSheetBehavior.f1862a.n0(view, f2)) {
                        if (!sideSheetBehavior.f1862a.Q(f2, f3)) {
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
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.d;
                if (f3 < 0.0f) {
                    if (!bottomSheetBehavior.f1696b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i2 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i2, true);
                    break;
                } else if (bottomSheetBehavior.f1676I && bottomSheetBehavior.D(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= bottomSheetBehavior.d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f1687T) / 2) {
                            if (!bottomSheetBehavior.f1696b) {
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
                        if (bottomSheetBehavior.f1696b) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.f1673E;
                            if (top2 < i3) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f1674G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 3;
                            } else {
                                if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.f1674G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f1696b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f1673E) < Math.abs(top3 - bottomSheetBehavior.f1674G)) {
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

    @Override // u1.d
    public final boolean i0(View view, int i) {
        WeakReference weakReference;
        switch (this.f567c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.d;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.f1874p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.d;
                int i2 = bottomSheetBehavior.f1679L;
                if (i2 != 1 && !bottomSheetBehavior.f1695a0) {
                    if (i2 == 3 && bottomSheetBehavior.f1692Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f1689V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f1688U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // u1.d
    public final int k(View view, int i) {
        switch (this.f567c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.d;
                return u1.d.j(i, sideSheetBehavior.f1862a.E(), sideSheetBehavior.f1862a.D());
            default:
                return view.getLeft();
        }
    }

    @Override // u1.d
    public final int l(View view, int i) {
        switch (this.f567c) {
            case 0:
                return view.getTop();
            default:
                return u1.d.j(i, ((BottomSheetBehavior) this.d).x(), K());
        }
    }
}
