package m2;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c extends t0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2689a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0.b f2690b;

    public /* synthetic */ c(a0.b bVar, int i) {
        this.f2689a = i;
        this.f2690b = bVar;
    }

    @Override // t0.d
    public final int c(View view, int i) {
        switch (this.f2689a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2690b;
                return h.a.n(i, sideSheetBehavior.f984a.C(), sideSheetBehavior.f984a.B());
            default:
                return view.getLeft();
        }
    }

    @Override // t0.d
    public final int d(View view, int i) {
        switch (this.f2689a) {
            case 0:
                return view.getTop();
            default:
                return h.a.n(i, ((BottomSheetBehavior) this.f2690b).x(), j());
        }
    }

    @Override // t0.d
    public int i(View view) {
        switch (this.f2689a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2690b;
                return sideSheetBehavior.f993l + sideSheetBehavior.f996o;
            default:
                return super.i(view);
        }
    }

    @Override // t0.d
    public int j() {
        switch (this.f2689a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2690b;
                return bottomSheetBehavior.I ? bottomSheetBehavior.V : bottomSheetBehavior.G;
            default:
                return super.j();
        }
    }

    @Override // t0.d
    public final void o(int i) {
        switch (this.f2689a) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2690b;
                    if (sideSheetBehavior.f989g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2690b;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // t0.d
    public final void p(View view, int i, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f2689a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2690b;
                WeakReference weakReference = sideSheetBehavior.f998q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f984a.r0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1002u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f984a.g(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.f2690b).u(i4);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r0.E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r0.x()) < java.lang.Math.abs(r6.getTop() - r0.E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r0.D) < java.lang.Math.abs(r7 - r0.G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0113, code lost:
    
        if (r0.f984a.Q(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f984a.z()) < java.lang.Math.abs(r7 - r0.f984a.A())) goto L73;
     */
    @Override // t0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(View view, float f2, float f4) {
        int i;
        switch (this.f2689a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2690b;
                if (!sideSheetBehavior.f984a.O(f2)) {
                    if (sideSheetBehavior.f984a.o0(view, f2)) {
                        if (!sideSheetBehavior.f984a.R(f2, f4)) {
                            break;
                        }
                        i = 5;
                    } else {
                        if (f2 == 0.0f || Math.abs(f2) <= Math.abs(f4)) {
                            int left = view.getLeft();
                            break;
                        }
                        i = 5;
                    }
                    sideSheetBehavior.t(view, i, true);
                    break;
                }
                i = 3;
                sideSheetBehavior.t(view, i, true);
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2690b;
                int i4 = 6;
                if (f4 < 0.0f) {
                    if (!bottomSheetBehavior.f821b) {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i4 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i4, true);
                    break;
                } else if (bottomSheetBehavior.I && bottomSheetBehavior.D(view, f4)) {
                    if (Math.abs(f2) >= Math.abs(f4) || f4 <= bottomSheetBehavior.d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.V) / 2) {
                            if (!bottomSheetBehavior.f821b) {
                                break;
                            }
                            i4 = 3;
                            bottomSheetBehavior.getClass();
                            bottomSheetBehavior.E(view, i4, true);
                        }
                    }
                    i4 = 5;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i4, true);
                } else {
                    if (f4 == 0.0f || Math.abs(f2) > Math.abs(f4)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.f821b) {
                            break;
                        } else {
                            int i5 = bottomSheetBehavior.E;
                            if (top2 < i5) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i4 = 3;
                            } else {
                                if (Math.abs(top2 - i5) < Math.abs(top2 - bottomSheetBehavior.G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i4 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f821b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.E) < Math.abs(top3 - bottomSheetBehavior.G)) {
                                bottomSheetBehavior.getClass();
                            }
                        }
                        i4 = 4;
                    }
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i4, true);
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r6.canScrollVertically(-1) != false) goto L27;
     */
    @Override // t0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(View view, int i) {
        WeakReference weakReference;
        switch (this.f2689a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2690b;
                if (sideSheetBehavior.f990h != 1 && (weakReference = sideSheetBehavior.f997p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2690b;
                int i4 = bottomSheetBehavior.N;
                if (i4 != 1 && !bottomSheetBehavior.f824c0) {
                    if (i4 == 3 && bottomSheetBehavior.f820a0 == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.X;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null) {
                            break;
                        }
                    }
                    SystemClock.uptimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.W;
                    if (weakReference3 == null || weakReference3.get() != view) {
                    }
                }
                break;
        }
        return true;
    }
}
