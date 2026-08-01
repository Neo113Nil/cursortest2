package K0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x.AbstractC0315a;
import z1.l;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0315a f542f;

    public /* synthetic */ c(AbstractC0315a abstractC0315a, int i) {
        this.f541e = i;
        this.f542f = abstractC0315a;
    }

    @Override // z1.l
    public int B(View view) {
        switch (this.f541e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f542f;
                return sideSheetBehavior.f1897l + sideSheetBehavior.f1900o;
            default:
                return super.B(view);
        }
    }

    @Override // z1.l
    public int C() {
        switch (this.f541e) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f542f;
                return bottomSheetBehavior.f1703I ? bottomSheetBehavior.f1714T : bottomSheetBehavior.f1701G;
            default:
                return super.C();
        }
    }

    @Override // z1.l
    public final void M(int i) {
        switch (this.f541e) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f542f;
                    if (sideSheetBehavior.f1894g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f542f;
                    if (bottomSheetBehavior.f1705K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // z1.l
    public final void N(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f541e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f542f;
                WeakReference weakReference = sideSheetBehavior.f1902q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f1889a.t0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1906u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f1889a.n(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.f542f).u(i2);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r4.f1700E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f1700E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f1699D) < java.lang.Math.abs(r7 - r4.f1701G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (r0.f1889a.V(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f1889a.F()) < java.lang.Math.abs(r7 - r0.f1889a.H())) goto L73;
     */
    @Override // z1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(View view, float f2, float f3) {
        switch (this.f541e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f542f;
                int i = 3;
                if (!sideSheetBehavior.f1889a.T(f2)) {
                    if (sideSheetBehavior.f1889a.s0(view, f2)) {
                        if (!sideSheetBehavior.f1889a.X(f2, f3)) {
                            break;
                        }
                        i = 5;
                    } else {
                        if (f2 == RecyclerView.f1559A0 || Math.abs(f2) <= Math.abs(f3)) {
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
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f542f;
                if (f3 < RecyclerView.f1559A0) {
                    if (!bottomSheetBehavior.f1723b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i2 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i2, true);
                    break;
                } else if (bottomSheetBehavior.f1703I && bottomSheetBehavior.D(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= bottomSheetBehavior.d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f1714T) / 2) {
                            if (!bottomSheetBehavior.f1723b) {
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
                    if (f3 == RecyclerView.f1559A0 || Math.abs(f2) > Math.abs(f3)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.f1723b) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.f1700E;
                            if (top2 < i3) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f1701G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 3;
                            } else {
                                if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.f1701G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f1723b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f1700E) < Math.abs(top3 - bottomSheetBehavior.f1701G)) {
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

    @Override // z1.l
    public final boolean c0(View view, int i) {
        WeakReference weakReference;
        switch (this.f541e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f542f;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.f1901p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f542f;
                int i2 = bottomSheetBehavior.f1706L;
                if (i2 != 1 && !bottomSheetBehavior.f1722a0) {
                    if (i2 == 3 && bottomSheetBehavior.f1719Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f1716V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f1715U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // z1.l
    public final int g(View view, int i) {
        switch (this.f541e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f542f;
                return l.f(i, sideSheetBehavior.f1889a.K(), sideSheetBehavior.f1889a.J());
            default:
                return view.getLeft();
        }
    }

    @Override // z1.l
    public final int h(View view, int i) {
        switch (this.f541e) {
            case 0:
                return view.getTop();
            default:
                return l.f(i, ((BottomSheetBehavior) this.f542f).x(), C());
        }
    }
}
