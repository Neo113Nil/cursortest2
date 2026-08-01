package P0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x.AbstractC0378b;

/* loaded from: classes.dex */
public final class c extends A.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0378b f602f;

    public /* synthetic */ c(AbstractC0378b abstractC0378b, int i) {
        this.f601e = i;
        this.f602f = abstractC0378b;
    }

    @Override // A.c
    public final boolean J0(View view, int i) {
        WeakReference weakReference;
        switch (this.f601e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f602f;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.f1953p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f602f;
                int i2 = bottomSheetBehavior.f1757L;
                if (i2 != 1 && !bottomSheetBehavior.f1773a0) {
                    if (i2 == 3 && bottomSheetBehavior.f1770Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f1767V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f1766U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // A.c
    public int W(View view) {
        switch (this.f601e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f602f;
                return sideSheetBehavior.f1949l + sideSheetBehavior.f1952o;
            default:
                return super.W(view);
        }
    }

    @Override // A.c
    public int X() {
        switch (this.f601e) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f602f;
                return bottomSheetBehavior.f1754I ? bottomSheetBehavior.f1765T : bottomSheetBehavior.f1752G;
            default:
                return super.X();
        }
    }

    @Override // A.c
    public final int n(View view, int i) {
        switch (this.f601e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f602f;
                return A.c.m(i, sideSheetBehavior.f1941a.Q(), sideSheetBehavior.f1941a.P());
            default:
                return view.getLeft();
        }
    }

    @Override // A.c
    public final int o(View view, int i) {
        switch (this.f601e) {
            case 0:
                return view.getTop();
            default:
                return A.c.m(i, ((BottomSheetBehavior) this.f602f).x(), X());
        }
    }

    @Override // A.c
    public final void q0(int i) {
        switch (this.f601e) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f602f;
                    if (sideSheetBehavior.f1946g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f602f;
                    if (bottomSheetBehavior.f1756K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // A.c
    public final void r0(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f601e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f602f;
                WeakReference weakReference = sideSheetBehavior.f1954q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f1941a.K0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1958u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f1941a.h(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.f602f).u(i2);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r4.f1751E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f1751E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f1750D) < java.lang.Math.abs(r7 - r4.f1752G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (r0.f1941a.f0(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f1941a.M()) < java.lang.Math.abs(r7 - r0.f1941a.N())) goto L73;
     */
    @Override // A.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0(View view, float f2, float f3) {
        switch (this.f601e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f602f;
                int i = 3;
                if (!sideSheetBehavior.f1941a.c0(f2)) {
                    if (sideSheetBehavior.f1941a.I0(view, f2)) {
                        if (!sideSheetBehavior.f1941a.g0(f2, f3)) {
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
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f602f;
                if (f3 < 0.0f) {
                    if (!bottomSheetBehavior.f1774b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i2 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i2, true);
                    break;
                } else if (bottomSheetBehavior.f1754I && bottomSheetBehavior.D(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= bottomSheetBehavior.d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f1765T) / 2) {
                            if (!bottomSheetBehavior.f1774b) {
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
                        if (bottomSheetBehavior.f1774b) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.f1751E;
                            if (top2 < i3) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f1752G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 3;
                            } else {
                                if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.f1752G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f1774b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f1751E) < Math.abs(top3 - bottomSheetBehavior.f1752G)) {
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
}
