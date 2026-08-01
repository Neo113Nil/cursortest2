package p2;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import b4.l;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c extends r1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0.c f3084b;

    public /* synthetic */ c(a0.c cVar, int i) {
        this.f3083a = i;
        this.f3084b = cVar;
    }

    @Override // r1.b
    public final boolean D(View view, int i) {
        WeakReference weakReference;
        switch (this.f3083a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3084b;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.f1189p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f3084b;
                int i4 = bottomSheetBehavior.P;
                if (i4 != 1 && !bottomSheetBehavior.f941f0) {
                    if (i4 == 3 && bottomSheetBehavior.f937c0 == i) {
                        View view2 = null;
                        if (bottomSheetBehavior.f938e) {
                            WeakReference weakReference2 = bottomSheetBehavior.f939e0;
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

    @Override // r1.b
    public final int e(View view, int i) {
        switch (this.f3083a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3084b;
                return l.i(i, sideSheetBehavior.f1177a.B(), sideSheetBehavior.f1177a.A());
            default:
                return view.getLeft();
        }
    }

    @Override // r1.b
    public final int f(View view, int i) {
        switch (this.f3083a) {
            case 0:
                return view.getTop();
            default:
                return l.i(i, ((BottomSheetBehavior) this.f3084b).y(), o());
        }
    }

    @Override // r1.b
    public int n(View view) {
        switch (this.f3083a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3084b;
                return sideSheetBehavior.f1185l + sideSheetBehavior.f1188o;
            default:
                return super.n(view);
        }
    }

    @Override // r1.b
    public int o() {
        switch (this.f3083a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f3084b;
                return bottomSheetBehavior.J ? bottomSheetBehavior.X : bottomSheetBehavior.H;
            default:
                return super.o();
        }
    }

    @Override // r1.b
    public final void r(int i) {
        switch (this.f3083a) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3084b;
                    if (sideSheetBehavior.f1182g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f3084b;
                    if (bottomSheetBehavior.L) {
                        bottomSheetBehavior.F(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // r1.b
    public final void s(View view, int i, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f3083a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3084b;
                WeakReference weakReference = sideSheetBehavior.f1190q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f1177a.j0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1194u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f1177a.e(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.f3084b).v(i4);
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
    
        if (r0.f1177a.N(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f1177a.w()) < java.lang.Math.abs(r7 - r0.f1177a.x())) goto L73;
     */
    @Override // r1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(View view, float f5, float f6) {
        int i;
        switch (this.f3083a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3084b;
                if (!sideSheetBehavior.f1177a.J(f5)) {
                    if (sideSheetBehavior.f1177a.g0(view, f5)) {
                        if (!sideSheetBehavior.f1177a.O(f5, f6)) {
                            break;
                        }
                        i = 5;
                    } else {
                        if (f5 == 0.0f || Math.abs(f5) <= Math.abs(f6)) {
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
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f3084b;
                int i4 = 6;
                if (f6 < 0.0f) {
                    if (!bottomSheetBehavior.f934b) {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i4 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.H(view, i4, true);
                    break;
                } else if (bottomSheetBehavior.J && bottomSheetBehavior.G(view, f6)) {
                    if (Math.abs(f5) >= Math.abs(f6) || f6 <= bottomSheetBehavior.d) {
                        if (view.getTop() <= (bottomSheetBehavior.y() + bottomSheetBehavior.X) / 2) {
                            if (!bottomSheetBehavior.f934b) {
                                break;
                            }
                            i4 = 3;
                            bottomSheetBehavior.getClass();
                            bottomSheetBehavior.H(view, i4, true);
                        }
                    }
                    i4 = 5;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.H(view, i4, true);
                } else {
                    if (f6 == 0.0f || Math.abs(f5) > Math.abs(f6)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.f934b) {
                            break;
                        } else {
                            int i5 = bottomSheetBehavior.F;
                            if (top2 < i5) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.H)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i4 = 3;
                            } else {
                                if (Math.abs(top2 - i5) < Math.abs(top2 - bottomSheetBehavior.H)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i4 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f934b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.F) < Math.abs(top3 - bottomSheetBehavior.H)) {
                                bottomSheetBehavior.getClass();
                            }
                        }
                        i4 = 4;
                    }
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.H(view, i4, true);
                }
                break;
        }
    }
}
