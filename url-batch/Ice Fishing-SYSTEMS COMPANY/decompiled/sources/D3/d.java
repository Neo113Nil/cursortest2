package D3;

import D.y;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class d extends W.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B.b f693b;

    public /* synthetic */ d(B.b bVar, int i) {
        this.f692a = i;
        this.f693b = bVar;
    }

    @Override // W.d
    public final int clampViewPositionHorizontal(View view, int i, int i4) {
        switch (this.f692a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f693b;
                return U2.a.b(i, sideSheetBehavior.f36203a.j(), sideSheetBehavior.f36203a.i());
            default:
                return view.getLeft();
        }
    }

    @Override // W.d
    public final int clampViewPositionVertical(View view, int i, int i4) {
        switch (this.f692a) {
            case 0:
                return view.getTop();
            default:
                return U2.a.b(i, ((BottomSheetBehavior) this.f693b).x(), getViewVerticalDragRange(view));
        }
    }

    @Override // W.d
    public int getViewHorizontalDragRange(View view) {
        switch (this.f692a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f693b;
                return sideSheetBehavior.f36213l + sideSheetBehavior.f36216o;
            default:
                return super.getViewHorizontalDragRange(view);
        }
    }

    @Override // W.d
    public int getViewVerticalDragRange(View view) {
        switch (this.f692a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f693b;
                return bottomSheetBehavior.f36001I ? bottomSheetBehavior.f36011T : bottomSheetBehavior.f35999G;
            default:
                return super.getViewVerticalDragRange(view);
        }
    }

    @Override // W.d
    public final void onViewDragStateChanged(int i) {
        switch (this.f692a) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f693b;
                    if (sideSheetBehavior.f36209g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f693b;
                    if (bottomSheetBehavior.f36002K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // W.d
    public final void onViewPositionChanged(View view, int i, int i4, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f692a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f693b;
                WeakReference weakReference = sideSheetBehavior.f36218q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f36203a.C(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f36222u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f36203a.e(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw y.h(it);
                }
                return;
            default:
                ((BottomSheetBehavior) this.f693b).u(i4);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r4.f35997E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f35997E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f35996D) < java.lang.Math.abs(r7 - r4.f35999G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0113, code lost:
    
        if (r0.f36203a.t(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f36203a.g()) < java.lang.Math.abs(r7 - r0.f36203a.h())) goto L73;
     */
    @Override // W.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewReleased(View view, float f6, float f9) {
        int i;
        switch (this.f692a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f693b;
                if (!sideSheetBehavior.f36203a.r(f6)) {
                    if (sideSheetBehavior.f36203a.B(view, f6)) {
                        if (!sideSheetBehavior.f36203a.u(f6, f9)) {
                            break;
                        }
                        i = 5;
                    } else {
                        if (f6 == 0.0f || Math.abs(f6) <= Math.abs(f9)) {
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
                int i4 = 6;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f693b;
                if (f9 < 0.0f) {
                    if (!bottomSheetBehavior.f36019b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i4 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i4, true);
                    break;
                } else if (bottomSheetBehavior.f36001I && bottomSheetBehavior.D(view, f9)) {
                    if (Math.abs(f6) >= Math.abs(f9) || f9 <= bottomSheetBehavior.f36023d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f36011T) / 2) {
                            if (!bottomSheetBehavior.f36019b) {
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
                    if (f9 == 0.0f || Math.abs(f6) > Math.abs(f9)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.f36019b) {
                            break;
                        } else {
                            int i9 = bottomSheetBehavior.f35997E;
                            if (top2 < i9) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f35999G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i4 = 3;
                            } else {
                                if (Math.abs(top2 - i9) < Math.abs(top2 - bottomSheetBehavior.f35999G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i4 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f36019b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f35997E) < Math.abs(top3 - bottomSheetBehavior.f35999G)) {
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
    @Override // W.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean tryCaptureView(View view, int i) {
        WeakReference weakReference;
        switch (this.f692a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f693b;
                if (sideSheetBehavior.f36210h != 1 && (weakReference = sideSheetBehavior.f36217p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f693b;
                int i4 = bottomSheetBehavior.f36003L;
                if (i4 != 1 && !bottomSheetBehavior.f36018a0) {
                    if (i4 == 3 && bottomSheetBehavior.Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f36013V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null) {
                            break;
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f36012U;
                    if (weakReference3 == null || weakReference3.get() != view) {
                    }
                }
                break;
        }
        return true;
    }
}
