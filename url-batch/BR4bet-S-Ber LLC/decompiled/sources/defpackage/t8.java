package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class t8 extends b9 {
    public final /* synthetic */ int x;
    public final /* synthetic */ oe y;

    public /* synthetic */ t8(oe oeVar, int i) {
        this.x = i;
        this.y = oeVar;
    }

    @Override // defpackage.b9
    public final void E(int i) {
        int i2 = this.x;
        oe oeVar = this.y;
        switch (i2) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) oeVar;
                    if (bottomSheetBehavior.L) {
                        bottomSheetBehavior.M(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) oeVar;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.x(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.b9
    public final void F(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3 = this.x;
        oe oeVar = this.y;
        switch (i3) {
            case 0:
                ((BottomSheetBehavior) oeVar).A(i2);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) oeVar;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.a.h0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.v;
                if (!linkedHashSet.isEmpty()) {
                    sideSheetBehavior.a.i(i);
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        g9.b();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r6.a.L(r7) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (java.lang.Math.abs(r8 - r6.a.z()) < java.lang.Math.abs(r8 - r6.a.A())) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r8 > r6.F) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
    
        if (java.lang.Math.abs(r7.getTop() - r6.E()) < java.lang.Math.abs(r7.getTop() - r6.F)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fb, code lost:
    
        if (java.lang.Math.abs(r8 - r6.F) < java.lang.Math.abs(r8 - r6.H)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (java.lang.Math.abs(r8 - r6.E) < java.lang.Math.abs(r8 - r6.H)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0124, code lost:
    
        if (r8 < java.lang.Math.abs(r8 - r6.H)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0134, code lost:
    
        if (java.lang.Math.abs(r8 - r9) < java.lang.Math.abs(r8 - r6.H)) goto L50;
     */
    @Override // defpackage.b9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(View view, float f, float f2) {
        int i = this.x;
        int i2 = 3;
        oe oeVar = this.y;
        switch (i) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) oeVar;
                if (f2 < 0.0f) {
                    if (!bottomSheetBehavior.b) {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        break;
                    }
                    bottomSheetBehavior.O(view, i2, true);
                    break;
                } else if (bottomSheetBehavior.J && bottomSheetBehavior.N(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.d) {
                        if (view.getTop() <= (bottomSheetBehavior.E() + bottomSheetBehavior.X) / 2) {
                            if (!bottomSheetBehavior.b) {
                                break;
                            }
                            bottomSheetBehavior.O(view, i2, true);
                        }
                    }
                    i2 = 5;
                    bottomSheetBehavior.O(view, i2, true);
                } else {
                    if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.b) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.F;
                            if (top2 >= i3) {
                                break;
                            } else {
                                break;
                            }
                            i2 = 6;
                        }
                    } else {
                        if (!bottomSheetBehavior.b) {
                            int top3 = view.getTop();
                            break;
                        }
                        i2 = 4;
                    }
                    bottomSheetBehavior.O(view, i2, true);
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) oeVar;
                if (!sideSheetBehavior.a.J(f)) {
                    if (sideSheetBehavior.a.c0(view, f)) {
                        if (!sideSheetBehavior.a.M(f, f2)) {
                            break;
                        }
                        i2 = 5;
                    } else {
                        if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                            int left = view.getLeft();
                            break;
                        }
                        i2 = 5;
                    }
                }
                sideSheetBehavior.z(view, i2, true);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        if (r0.canScrollVertically(-1) != false) goto L41;
     */
    @Override // defpackage.b9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean U(View view, int i) {
        WeakReference weakReference;
        int i2 = this.x;
        oe oeVar = this.y;
        switch (i2) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) oeVar;
                int i3 = bottomSheetBehavior.P;
                if (i3 != 1 && !bottomSheetBehavior.g0) {
                    if (i3 == 3 && bottomSheetBehavior.d0 == i) {
                        View view2 = null;
                        if (bottomSheetBehavior.e) {
                            WeakReference weakReference2 = bottomSheetBehavior.f0;
                            if (weakReference2 != null) {
                                view2 = (View) weakReference2.get();
                            }
                        } else {
                            ArrayList arrayList = bottomSheetBehavior.Z;
                            if (!arrayList.isEmpty()) {
                                view2 = (View) ((WeakReference) arrayList.get(0)).get();
                            }
                        }
                        if (view2 != null) {
                            break;
                        }
                    }
                    SystemClock.uptimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.Y;
                    if (weakReference3 != null && weakReference3.get() == view) {
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) oeVar;
                if (sideSheetBehavior.h == 1 || (weakReference = sideSheetBehavior.p) == null || weakReference.get() != view) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // defpackage.b9
    public final int h(View view, int i) {
        switch (this.x) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.y;
                return la0.o(i, sideSheetBehavior.a.D(), sideSheetBehavior.a.C());
        }
    }

    @Override // defpackage.b9
    public final int i(View view, int i) {
        switch (this.x) {
            case 0:
                return la0.o(i, ((BottomSheetBehavior) this.y).E(), u());
            default:
                return view.getTop();
        }
    }

    @Override // defpackage.b9
    public int t(View view) {
        switch (this.x) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.y;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            default:
                return super.t(view);
        }
    }

    @Override // defpackage.b9
    public int u() {
        switch (this.x) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.y;
                return bottomSheetBehavior.J ? bottomSheetBehavior.X : bottomSheetBehavior.H;
            default:
                return super.u();
        }
    }
}
