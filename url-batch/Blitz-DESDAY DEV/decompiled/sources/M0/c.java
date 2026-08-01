package M0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import z.AbstractC0318a;
import z1.l;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0318a f611b;

    public /* synthetic */ c(AbstractC0318a abstractC0318a, int i) {
        this.f610a = i;
        this.f611b = abstractC0318a;
    }

    @Override // z1.l
    public int S(View view) {
        switch (this.f610a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f611b;
                return sideSheetBehavior.f1953l + sideSheetBehavior.f1956o;
            default:
                return super.S(view);
        }
    }

    @Override // z1.l
    public int T() {
        switch (this.f610a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f611b;
                return bottomSheetBehavior.f1751I ? bottomSheetBehavior.f1762T : bottomSheetBehavior.f1750G;
            default:
                return super.T();
        }
    }

    @Override // z1.l
    public final void h0(int i) {
        switch (this.f610a) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f611b;
                    if (sideSheetBehavior.f1950g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f611b;
                    if (bottomSheetBehavior.f1753K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // z1.l
    public final void i0(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f610a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f611b;
                WeakReference weakReference = sideSheetBehavior.f1958q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f1945a.w0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1962u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f1945a.n(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.f611b).u(i2);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r4.f1748E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f1748E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f1747D) < java.lang.Math.abs(r7 - r4.f1750G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (r0.f1945a.Y(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f1945a.H()) < java.lang.Math.abs(r7 - r0.f1945a.I())) goto L73;
     */
    @Override // z1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(View view, float f2, float f3) {
        switch (this.f610a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f611b;
                int i = 3;
                if (!sideSheetBehavior.f1945a.W(f2)) {
                    if (sideSheetBehavior.f1945a.u0(view, f2)) {
                        if (!sideSheetBehavior.f1945a.Z(f2, f3)) {
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
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f611b;
                if (f3 < 0.0f) {
                    if (!bottomSheetBehavior.f1771b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i2 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i2, true);
                    break;
                } else if (bottomSheetBehavior.f1751I && bottomSheetBehavior.D(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= bottomSheetBehavior.d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f1762T) / 2) {
                            if (!bottomSheetBehavior.f1771b) {
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
                        if (bottomSheetBehavior.f1771b) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.f1748E;
                            if (top2 < i3) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f1750G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 3;
                            } else {
                                if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.f1750G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f1771b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f1748E) < Math.abs(top3 - bottomSheetBehavior.f1750G)) {
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
    public final int s(View view, int i) {
        switch (this.f610a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f611b;
                return z1.d.g(i, sideSheetBehavior.f1945a.L(), sideSheetBehavior.f1945a.K());
            default:
                return view.getLeft();
        }
    }

    @Override // z1.l
    public final int t(View view, int i) {
        switch (this.f610a) {
            case 0:
                return view.getTop();
            default:
                return z1.d.g(i, ((BottomSheetBehavior) this.f611b).x(), T());
        }
    }

    @Override // z1.l
    public final boolean v0(View view, int i) {
        WeakReference weakReference;
        switch (this.f610a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f611b;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.f1957p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f611b;
                int i2 = bottomSheetBehavior.f1754L;
                if (i2 != 1 && !bottomSheetBehavior.f1770a0) {
                    if (i2 == 3 && bottomSheetBehavior.f1767Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f1764V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f1763U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
