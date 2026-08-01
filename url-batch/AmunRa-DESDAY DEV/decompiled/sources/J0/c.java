package J0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x.AbstractC0328a;

/* loaded from: classes.dex */
public final class c extends s1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0328a f344b;

    public /* synthetic */ c(AbstractC0328a abstractC0328a, int i) {
        this.f343a = i;
        this.f344b = abstractC0328a;
    }

    @Override // s1.d
    public int K(View view) {
        switch (this.f343a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f344b;
                return sideSheetBehavior.f1773l + sideSheetBehavior.f1776o;
            default:
                return super.K(view);
        }
    }

    @Override // s1.d
    public int L() {
        switch (this.f343a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f344b;
                return bottomSheetBehavior.f1580I ? bottomSheetBehavior.f1591T : bottomSheetBehavior.f1578G;
            default:
                return super.L();
        }
    }

    @Override // s1.d
    public final void X(int i) {
        switch (this.f343a) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f344b;
                    if (sideSheetBehavior.f1770g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f344b;
                    if (bottomSheetBehavior.f1582K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // s1.d
    public final void Y(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f343a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f344b;
                WeakReference weakReference = sideSheetBehavior.f1778q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f1765a.m0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1782u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f1765a.h(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.f344b).u(i2);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r4.f1577E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f1577E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f1576D) < java.lang.Math.abs(r7 - r4.f1578G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (r0.f1765a.P(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f1765a.A()) < java.lang.Math.abs(r7 - r0.f1765a.C())) goto L73;
     */
    @Override // s1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(View view, float f2, float f3) {
        switch (this.f343a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f344b;
                int i = 3;
                if (!sideSheetBehavior.f1765a.N(f2)) {
                    if (sideSheetBehavior.f1765a.j0(view, f2)) {
                        if (!sideSheetBehavior.f1765a.R(f2, f3)) {
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
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f344b;
                if (f3 < 0.0f) {
                    if (!bottomSheetBehavior.f1600b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i2 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i2, true);
                    break;
                } else if (bottomSheetBehavior.f1580I && bottomSheetBehavior.D(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= bottomSheetBehavior.d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f1591T) / 2) {
                            if (!bottomSheetBehavior.f1600b) {
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
                        if (bottomSheetBehavior.f1600b) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.f1577E;
                            if (top2 < i3) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f1578G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 3;
                            } else {
                                if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.f1578G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f1600b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f1577E) < Math.abs(top3 - bottomSheetBehavior.f1578G)) {
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

    @Override // s1.d
    public final int j(View view, int i) {
        switch (this.f343a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f344b;
                return s1.d.i(i, sideSheetBehavior.f1765a.G(), sideSheetBehavior.f1765a.F());
            default:
                return view.getLeft();
        }
    }

    @Override // s1.d
    public final int k(View view, int i) {
        switch (this.f343a) {
            case 0:
                return view.getTop();
            default:
                return s1.d.i(i, ((BottomSheetBehavior) this.f344b).x(), L());
        }
    }

    @Override // s1.d
    public final boolean l0(View view, int i) {
        WeakReference weakReference;
        switch (this.f343a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f344b;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.f1777p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f344b;
                int i2 = bottomSheetBehavior.f1583L;
                if (i2 != 1 && !bottomSheetBehavior.f1599a0) {
                    if (i2 == 3 && bottomSheetBehavior.f1596Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f1593V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f1592U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
