package C0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x.AbstractC0392a;

/* loaded from: classes.dex */
public final class e extends H1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f93e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0392a f94f;

    public /* synthetic */ e(AbstractC0392a abstractC0392a, int i) {
        this.f93e = i;
        this.f94f = abstractC0392a;
    }

    @Override // H1.d
    public int J(View view) {
        switch (this.f93e) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f94f;
                return sideSheetBehavior.f2346l + sideSheetBehavior.f2349o;
            default:
                return super.J(view);
        }
    }

    @Override // H1.d
    public int K() {
        switch (this.f93e) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f94f;
                return bottomSheetBehavior.f2152I ? bottomSheetBehavior.f2163T : bottomSheetBehavior.f2150G;
            default:
                return super.K();
        }
    }

    @Override // H1.d
    public final void X(int i) {
        switch (this.f93e) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f94f;
                    if (bottomSheetBehavior.f2154K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f94f;
                    if (sideSheetBehavior.f2343g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // H1.d
    public final void Y(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f93e) {
            case 0:
                ((BottomSheetBehavior) this.f94f).u(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f94f;
                WeakReference weakReference = sideSheetBehavior.f2351q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f2338a.w0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f2355u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f2338a.g(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r0.f2338a.O(r6) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f2338a.B()) < java.lang.Math.abs(r7 - r0.f2338a.C())) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r7 > r4.f2149E) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f2149E)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011b, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f2148D) < java.lang.Math.abs(r7 - r4.f2150G)) goto L27;
     */
    @Override // H1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(View view, float f2, float f3) {
        switch (this.f93e) {
            case 0:
                int i = 6;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f94f;
                if (f3 < RecyclerView.f1937A0) {
                    if (!bottomSheetBehavior.f2172b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i, true);
                    break;
                } else if (bottomSheetBehavior.f2152I && bottomSheetBehavior.D(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= bottomSheetBehavior.d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f2163T) / 2) {
                            if (!bottomSheetBehavior.f2172b) {
                                break;
                            }
                            i = 3;
                            bottomSheetBehavior.getClass();
                            bottomSheetBehavior.E(view, i, true);
                        }
                    }
                    i = 5;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i, true);
                } else {
                    if (f3 == RecyclerView.f1937A0 || Math.abs(f2) > Math.abs(f3)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.f2172b) {
                            break;
                        } else {
                            int i2 = bottomSheetBehavior.f2149E;
                            if (top2 < i2) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f2150G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i = 3;
                            } else {
                                if (Math.abs(top2 - i2) < Math.abs(top2 - bottomSheetBehavior.f2150G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f2172b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f2149E) < Math.abs(top3 - bottomSheetBehavior.f2150G)) {
                                bottomSheetBehavior.getClass();
                            }
                        }
                        i = 4;
                    }
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i, true);
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f94f;
                int i3 = 3;
                if (!sideSheetBehavior.f2338a.N(f2)) {
                    if (sideSheetBehavior.f2338a.q0(view, f2)) {
                        if (!sideSheetBehavior.f2338a.Q(f2, f3)) {
                            break;
                        }
                        i3 = 5;
                    } else {
                        if (f2 == RecyclerView.f1937A0 || Math.abs(f2) <= Math.abs(f3)) {
                            int left = view.getLeft();
                            break;
                        }
                        i3 = 5;
                    }
                }
                sideSheetBehavior.t(view, i3, true);
                break;
        }
    }

    @Override // H1.d
    public final int n(View view, int i) {
        switch (this.f93e) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f94f;
                return H1.d.m(i, sideSheetBehavior.f2338a.E(), sideSheetBehavior.f2338a.D());
        }
    }

    @Override // H1.d
    public final int o(View view, int i) {
        switch (this.f93e) {
            case 0:
                return H1.d.m(i, ((BottomSheetBehavior) this.f94f).x(), K());
            default:
                return view.getTop();
        }
    }

    @Override // H1.d
    public final boolean v0(View view, int i) {
        WeakReference weakReference;
        switch (this.f93e) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f94f;
                int i2 = bottomSheetBehavior.f2155L;
                if (i2 != 1 && !bottomSheetBehavior.f2171a0) {
                    if (i2 == 3 && bottomSheetBehavior.f2168Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f2165V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f2164U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f94f;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.f2350p) != null && weakReference.get() == view) {
                    break;
                }
                break;
        }
        return true;
    }
}
