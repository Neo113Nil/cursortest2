package L0;

import A1.m;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import y.AbstractC0317a;

/* loaded from: classes.dex */
public final class c extends m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0317a f595b;

    public /* synthetic */ c(AbstractC0317a abstractC0317a, int i) {
        this.f594a = i;
        this.f595b = abstractC0317a;
    }

    @Override // A1.m
    public int F(View view) {
        switch (this.f594a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f595b;
                return sideSheetBehavior.f1966l + sideSheetBehavior.f1969o;
            default:
                return super.F(view);
        }
    }

    @Override // A1.m
    public int G() {
        switch (this.f594a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f595b;
                return bottomSheetBehavior.f1767I ? bottomSheetBehavior.f1778T : bottomSheetBehavior.G;
            default:
                return super.G();
        }
    }

    @Override // A1.m
    public final void S(int i) {
        switch (this.f594a) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f595b;
                    if (sideSheetBehavior.f1962g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f595b;
                    if (bottomSheetBehavior.f1769K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // A1.m
    public final void T(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f594a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f595b;
                WeakReference weakReference = sideSheetBehavior.f1971q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f1957a.o0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1975u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f1957a.g(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.f595b).u(i2);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r4.f1764E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f1764E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f1763D) < java.lang.Math.abs(r7 - r4.G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (r0.f1957a.L(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f1957a.u()) < java.lang.Math.abs(r7 - r0.f1957a.v())) goto L73;
     */
    @Override // A1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(View view, float f2, float f3) {
        switch (this.f594a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f595b;
                int i = 3;
                if (!sideSheetBehavior.f1957a.J(f2)) {
                    if (sideSheetBehavior.f1957a.j0(view, f2)) {
                        if (!sideSheetBehavior.f1957a.M(f2, f3)) {
                            break;
                        }
                        i = 5;
                    } else {
                        if (f2 == RecyclerView.A0 || Math.abs(f2) <= Math.abs(f3)) {
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
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f595b;
                if (f3 < RecyclerView.A0) {
                    if (!bottomSheetBehavior.f1787b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i2 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i2, true);
                    break;
                } else if (bottomSheetBehavior.f1767I && bottomSheetBehavior.D(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= bottomSheetBehavior.d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f1778T) / 2) {
                            if (!bottomSheetBehavior.f1787b) {
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
                    if (f3 == RecyclerView.A0 || Math.abs(f2) > Math.abs(f3)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.f1787b) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.f1764E;
                            if (top2 < i3) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 3;
                            } else {
                                if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f1787b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f1764E) < Math.abs(top3 - bottomSheetBehavior.G)) {
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

    @Override // A1.m
    public final int k(View view, int i) {
        switch (this.f594a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f595b;
                return A1.d.n(i, sideSheetBehavior.f1957a.A(), sideSheetBehavior.f1957a.z());
            default:
                return view.getLeft();
        }
    }

    @Override // A1.m
    public final int l(View view, int i) {
        switch (this.f594a) {
            case 0:
                return view.getTop();
            default:
                return A1.d.n(i, ((BottomSheetBehavior) this.f595b).x(), G());
        }
    }

    @Override // A1.m
    public final boolean m0(View view, int i) {
        WeakReference weakReference;
        switch (this.f594a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f595b;
                if (sideSheetBehavior.f1963h != 1 && (weakReference = sideSheetBehavior.f1970p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f595b;
                int i2 = bottomSheetBehavior.f1770L;
                if (i2 != 1 && !bottomSheetBehavior.f1786a0) {
                    if (i2 == 3 && bottomSheetBehavior.f1783Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f1780V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f1779U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
