package O0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import z.AbstractC0427a;

/* loaded from: classes.dex */
public final class d extends H1.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f979b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0427a f980c;

    public /* synthetic */ d(AbstractC0427a abstractC0427a, int i) {
        this.f979b = i;
        this.f980c = abstractC0427a;
    }

    @Override // H1.d
    public int I(View view) {
        switch (this.f979b) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f980c;
                return sideSheetBehavior.f2460l + sideSheetBehavior.f2463o;
            default:
                return super.I(view);
        }
    }

    @Override // H1.d
    public int J() {
        switch (this.f979b) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f980c;
                return bottomSheetBehavior.f2264I ? bottomSheetBehavior.f2275T : bottomSheetBehavior.f2263G;
            default:
                return super.J();
        }
    }

    @Override // H1.d
    public final void W(int i) {
        switch (this.f979b) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f980c;
                    if (sideSheetBehavior.f2457g) {
                        sideSheetBehavior.w(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f980c;
                    if (bottomSheetBehavior.f2266K) {
                        bottomSheetBehavior.I(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // H1.d
    public final void X(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f979b) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f980c;
                WeakReference weakReference = sideSheetBehavior.f2465q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f2452a.g0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f2470v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f2452a.f(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.f980c).y(i2);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r4.f2261E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.C()) < java.lang.Math.abs(r6.getTop() - r4.f2261E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f2260D) < java.lang.Math.abs(r7 - r4.f2263G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (r0.f2452a.I(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f2452a.v()) < java.lang.Math.abs(r7 - r0.f2452a.w())) goto L73;
     */
    @Override // H1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(View view, float f2, float f3) {
        switch (this.f979b) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f980c;
                int i = 3;
                if (!sideSheetBehavior.f2452a.H(f2)) {
                    if (sideSheetBehavior.f2452a.a0(view, f2)) {
                        if (!sideSheetBehavior.f2452a.J(f2, f3)) {
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
                sideSheetBehavior.y(view, i, true);
                break;
            default:
                int i2 = 6;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f980c;
                if (f3 < 0.0f) {
                    if (!bottomSheetBehavior.f2284b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i2 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.K(view, i2, true);
                    break;
                } else if (bottomSheetBehavior.f2264I && bottomSheetBehavior.J(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= bottomSheetBehavior.f2288d) {
                        if (view.getTop() <= (bottomSheetBehavior.C() + bottomSheetBehavior.f2275T) / 2) {
                            if (!bottomSheetBehavior.f2284b) {
                                break;
                            }
                            i2 = 3;
                            bottomSheetBehavior.getClass();
                            bottomSheetBehavior.K(view, i2, true);
                        }
                    }
                    i2 = 5;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.K(view, i2, true);
                } else {
                    if (f3 == 0.0f || Math.abs(f2) > Math.abs(f3)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.f2284b) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.f2261E;
                            if (top2 < i3) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f2263G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 3;
                            } else {
                                if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.f2263G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f2284b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f2261E) < Math.abs(top3 - bottomSheetBehavior.f2263G)) {
                                bottomSheetBehavior.getClass();
                            }
                        }
                        i2 = 4;
                    }
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.K(view, i2, true);
                }
                break;
        }
    }

    @Override // H1.d
    public final boolean k0(View view, int i) {
        WeakReference weakReference;
        switch (this.f979b) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f980c;
                if (sideSheetBehavior.f2458h != 1 && (weakReference = sideSheetBehavior.f2464p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f980c;
                int i2 = bottomSheetBehavior.f2267L;
                if (i2 != 1 && !bottomSheetBehavior.f2285b0) {
                    if (i2 == 3 && bottomSheetBehavior.f2281Z == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f2277V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f2276U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // H1.d
    public final int o(View view, int i) {
        switch (this.f979b) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f980c;
                return H1.d.n(i, sideSheetBehavior.f2452a.A(), sideSheetBehavior.f2452a.z());
            default:
                return view.getLeft();
        }
    }

    @Override // H1.d
    public final int p(View view, int i) {
        switch (this.f979b) {
            case 0:
                return view.getTop();
            default:
                return H1.d.n(i, ((BottomSheetBehavior) this.f980c).C(), J());
        }
    }
}
