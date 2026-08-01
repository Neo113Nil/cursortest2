package K0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import w1.l;
import x.AbstractC0313a;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0313a f525f;

    public /* synthetic */ c(AbstractC0313a abstractC0313a, int i) {
        this.f524e = i;
        this.f525f = abstractC0313a;
    }

    @Override // w1.l
    public int C(View view) {
        switch (this.f524e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f525f;
                return sideSheetBehavior.f1865l + sideSheetBehavior.f1868o;
            default:
                return super.C(view);
        }
    }

    @Override // w1.l
    public int D() {
        switch (this.f524e) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f525f;
                return bottomSheetBehavior.f1672I ? bottomSheetBehavior.f1683T : bottomSheetBehavior.f1670G;
            default:
                return super.D();
        }
    }

    @Override // w1.l
    public final void N(int i) {
        switch (this.f524e) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f525f;
                    if (sideSheetBehavior.f1862g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f525f;
                    if (bottomSheetBehavior.f1674K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // w1.l
    public final void O(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f524e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f525f;
                WeakReference weakReference = sideSheetBehavior.f1870q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f1857a.v0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1874u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f1857a.i(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.f525f).u(i2);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r4.f1669E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f1669E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f1668D) < java.lang.Math.abs(r7 - r4.f1670G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (r0.f1857a.V(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f1857a.C()) < java.lang.Math.abs(r7 - r0.f1857a.E())) goto L73;
     */
    @Override // w1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(View view, float f2, float f3) {
        switch (this.f524e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f525f;
                int i = 3;
                if (!sideSheetBehavior.f1857a.T(f2)) {
                    if (sideSheetBehavior.f1857a.r0(view, f2)) {
                        if (!sideSheetBehavior.f1857a.X(f2, f3)) {
                            break;
                        }
                        i = 5;
                    } else {
                        if (f2 == RecyclerView.f1530C0 || Math.abs(f2) <= Math.abs(f3)) {
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
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f525f;
                if (f3 < RecyclerView.f1530C0) {
                    if (!bottomSheetBehavior.f1692b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i2 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i2, true);
                    break;
                } else if (bottomSheetBehavior.f1672I && bottomSheetBehavior.D(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= bottomSheetBehavior.d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f1683T) / 2) {
                            if (!bottomSheetBehavior.f1692b) {
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
                    if (f3 == RecyclerView.f1530C0 || Math.abs(f2) > Math.abs(f3)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.f1692b) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.f1669E;
                            if (top2 < i3) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f1670G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 3;
                            } else {
                                if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.f1670G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f1692b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f1669E) < Math.abs(top3 - bottomSheetBehavior.f1670G)) {
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

    @Override // w1.l
    public final boolean a0(View view, int i) {
        WeakReference weakReference;
        switch (this.f524e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f525f;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.f1869p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f525f;
                int i2 = bottomSheetBehavior.f1675L;
                if (i2 != 1 && !bottomSheetBehavior.f1691a0) {
                    if (i2 == 3 && bottomSheetBehavior.f1688Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f1685V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f1684U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // w1.l
    public final int k(View view, int i) {
        switch (this.f524e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f525f;
                return l.j(i, sideSheetBehavior.f1857a.J(), sideSheetBehavior.f1857a.I());
            default:
                return view.getLeft();
        }
    }

    @Override // w1.l
    public final int l(View view, int i) {
        switch (this.f524e) {
            case 0:
                return view.getTop();
            default:
                return l.j(i, ((BottomSheetBehavior) this.f525f).x(), D());
        }
    }
}
