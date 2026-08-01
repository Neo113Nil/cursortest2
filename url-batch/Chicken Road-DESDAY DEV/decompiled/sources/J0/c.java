package J0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x.AbstractC0332a;

/* loaded from: classes.dex */
public final class c extends u1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0332a f351b;

    public /* synthetic */ c(AbstractC0332a abstractC0332a, int i) {
        this.f350a = i;
        this.f351b = abstractC0332a;
    }

    @Override // u1.d
    public int R(View view) {
        switch (this.f350a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f351b;
                return sideSheetBehavior.f1804l + sideSheetBehavior.f1807o;
            default:
                return super.R(view);
        }
    }

    @Override // u1.d
    public int S() {
        switch (this.f350a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f351b;
                return bottomSheetBehavior.f1610I ? bottomSheetBehavior.f1621T : bottomSheetBehavior.f1608G;
            default:
                return super.S();
        }
    }

    @Override // u1.d
    public final void e0(int i) {
        switch (this.f350a) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f351b;
                    if (sideSheetBehavior.f1801g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f351b;
                    if (bottomSheetBehavior.f1612K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // u1.d
    public final void f0(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f350a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f351b;
                WeakReference weakReference = sideSheetBehavior.f1809q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f1796a.t0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1813u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f1796a.j(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.f351b).u(i2);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r4.f1607E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f1607E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f1606D) < java.lang.Math.abs(r7 - r4.f1608G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (r0.f1796a.W(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f1796a.J()) < java.lang.Math.abs(r7 - r0.f1796a.L())) goto L73;
     */
    @Override // u1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0(View view, float f2, float f3) {
        switch (this.f350a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f351b;
                int i = 3;
                if (!sideSheetBehavior.f1796a.U(f2)) {
                    if (sideSheetBehavior.f1796a.q0(view, f2)) {
                        if (!sideSheetBehavior.f1796a.Y(f2, f3)) {
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
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f351b;
                if (f3 < 0.0f) {
                    if (!bottomSheetBehavior.f1630b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i2 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i2, true);
                    break;
                } else if (bottomSheetBehavior.f1610I && bottomSheetBehavior.D(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= bottomSheetBehavior.d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f1621T) / 2) {
                            if (!bottomSheetBehavior.f1630b) {
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
                        if (bottomSheetBehavior.f1630b) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.f1607E;
                            if (top2 < i3) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f1608G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 3;
                            } else {
                                if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.f1608G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f1630b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f1607E) < Math.abs(top3 - bottomSheetBehavior.f1608G)) {
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
    public final int n(View view, int i) {
        switch (this.f350a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f351b;
                return u1.d.m(i, sideSheetBehavior.f1796a.N(), sideSheetBehavior.f1796a.M());
            default:
                return view.getLeft();
        }
    }

    @Override // u1.d
    public final int o(View view, int i) {
        switch (this.f350a) {
            case 0:
                return view.getTop();
            default:
                return u1.d.m(i, ((BottomSheetBehavior) this.f351b).x(), S());
        }
    }

    @Override // u1.d
    public final boolean s0(View view, int i) {
        WeakReference weakReference;
        switch (this.f350a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f351b;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.f1808p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f351b;
                int i2 = bottomSheetBehavior.f1613L;
                if (i2 != 1 && !bottomSheetBehavior.f1629a0) {
                    if (i2 == 3 && bottomSheetBehavior.f1626Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f1623V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f1622U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
