package h2;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l0.g;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x.a f2012b;

    public /* synthetic */ c(x.a aVar, int i4) {
        this.f2011a = i4;
        this.f2012b = aVar;
    }

    @Override // l0.g
    public final int d(View view, int i4) {
        switch (this.f2011a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2012b;
                return k3.d.k(i4, sideSheetBehavior.f1370a.J(), sideSheetBehavior.f1370a.I());
            default:
                return view.getLeft();
        }
    }

    @Override // l0.g
    public final int e(View view, int i4) {
        switch (this.f2011a) {
            case 0:
                return view.getTop();
            default:
                return k3.d.k(i4, ((BottomSheetBehavior) this.f2012b).y(), m());
        }
    }

    @Override // l0.g
    public int l(View view) {
        switch (this.f2011a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2012b;
                return sideSheetBehavior.f1378l + sideSheetBehavior.f1381o;
            default:
                return super.l(view);
        }
    }

    @Override // l0.g
    public int m() {
        switch (this.f2011a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2012b;
                return bottomSheetBehavior.J ? bottomSheetBehavior.X : bottomSheetBehavior.H;
            default:
                return super.m();
        }
    }

    @Override // l0.g
    public final void q(int i4) {
        switch (this.f2011a) {
            case 0:
                if (i4 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2012b;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i4 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2012b;
                    if (bottomSheetBehavior.L) {
                        bottomSheetBehavior.F(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // l0.g
    public final void r(View view, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f2011a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2012b;
                WeakReference weakReference = sideSheetBehavior.f1383q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f1370a.j0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1387u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f1370a.d(i4);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.f2012b).v(i5);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r0.F) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r0.y()) < java.lang.Math.abs(r6.getTop() - r0.F)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r0.E) < java.lang.Math.abs(r7 - r0.H)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0113, code lost:
    
        if (r0.f1370a.O(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f1370a.G()) < java.lang.Math.abs(r7 - r0.f1370a.H())) goto L73;
     */
    @Override // l0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(View view, float f4, float f5) {
        int i4;
        switch (this.f2011a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2012b;
                if (!sideSheetBehavior.f1370a.N(f4)) {
                    if (sideSheetBehavior.f1370a.f0(view, f4)) {
                        if (!sideSheetBehavior.f1370a.P(f4, f5)) {
                            break;
                        }
                        i4 = 5;
                    } else {
                        if (f4 == 0.0f || Math.abs(f4) <= Math.abs(f5)) {
                            int left = view.getLeft();
                            break;
                        }
                        i4 = 5;
                    }
                    sideSheetBehavior.t(view, i4, true);
                    break;
                }
                i4 = 3;
                sideSheetBehavior.t(view, i4, true);
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2012b;
                int i5 = 6;
                if (f5 < 0.0f) {
                    if (!bottomSheetBehavior.f1195b) {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i5 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.H(view, i5, true);
                    break;
                } else if (bottomSheetBehavior.J && bottomSheetBehavior.G(view, f5)) {
                    if (Math.abs(f4) >= Math.abs(f5) || f5 <= bottomSheetBehavior.f1198d) {
                        if (view.getTop() <= (bottomSheetBehavior.y() + bottomSheetBehavior.X) / 2) {
                            if (!bottomSheetBehavior.f1195b) {
                                break;
                            }
                            i5 = 3;
                            bottomSheetBehavior.getClass();
                            bottomSheetBehavior.H(view, i5, true);
                        }
                    }
                    i5 = 5;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.H(view, i5, true);
                } else {
                    if (f5 == 0.0f || Math.abs(f4) > Math.abs(f5)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.f1195b) {
                            break;
                        } else {
                            int i6 = bottomSheetBehavior.F;
                            if (top2 < i6) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.H)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i5 = 3;
                            } else {
                                if (Math.abs(top2 - i6) < Math.abs(top2 - bottomSheetBehavior.H)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i5 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f1195b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.F) < Math.abs(top3 - bottomSheetBehavior.H)) {
                                bottomSheetBehavior.getClass();
                            }
                        }
                        i5 = 4;
                    }
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.H(view, i5, true);
                }
                break;
        }
    }

    @Override // l0.g
    public final boolean y(View view, int i4) {
        WeakReference weakReference;
        switch (this.f2011a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2012b;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.f1382p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2012b;
                int i5 = bottomSheetBehavior.P;
                if (i5 != 1 && !bottomSheetBehavior.f0) {
                    if (i5 == 3 && bottomSheetBehavior.f1197c0 == i4) {
                        View view2 = null;
                        if (bottomSheetBehavior.f1200e) {
                            WeakReference weakReference2 = bottomSheetBehavior.f1201e0;
                            if (weakReference2 != null) {
                                view2 = (View) weakReference2.get();
                            }
                        } else {
                            ArrayList arrayList = bottomSheetBehavior.Z;
                            if (!arrayList.isEmpty()) {
                                view2 = (View) ((WeakReference) arrayList.get(0)).get();
                            }
                        }
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    SystemClock.uptimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.Y;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
