package k5;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import r2.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d3.a f4188b;

    public /* synthetic */ d(d3.a aVar, int i) {
        this.f4187a = i;
        this.f4188b = aVar;
    }

    @Override // r2.r
    public int B(View view) {
        switch (this.f4187a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f4188b;
                return sideSheetBehavior.f1946l + sideSheetBehavior.f1949o;
            default:
                return super.B(view);
        }
    }

    @Override // r2.r
    public int C() {
        switch (this.f4187a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f4188b;
                return bottomSheetBehavior.I ? bottomSheetBehavior.V : bottomSheetBehavior.G;
            default:
                return super.C();
        }
    }

    @Override // r2.r
    public final void K(int i) {
        switch (this.f4187a) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f4188b;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f4188b;
                    if (sideSheetBehavior.f1942g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // r2.r
    public final void L(View view, int i, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f4187a) {
            case 0:
                ((BottomSheetBehavior) this.f4188b).u(i8);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f4188b;
                WeakReference weakReference = sideSheetBehavior.f1951q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f1936a.w0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1955u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f1936a.l(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r0.f1936a.V(r6) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f1936a.F()) < java.lang.Math.abs(r7 - r0.f1936a.G())) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r7 > r0.E) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r0.x()) < java.lang.Math.abs(r6.getTop() - r0.E)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011b, code lost:
    
        if (java.lang.Math.abs(r7 - r0.D) < java.lang.Math.abs(r7 - r0.G)) goto L29;
     */
    @Override // r2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(View view, float f6, float f8) {
        int i;
        switch (this.f4187a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f4188b;
                int i8 = 6;
                if (f8 < 0.0f) {
                    if (!bottomSheetBehavior.f1842b) {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i8 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i8, true);
                    break;
                } else if (bottomSheetBehavior.I && bottomSheetBehavior.D(view, f8)) {
                    if (Math.abs(f6) >= Math.abs(f8) || f8 <= bottomSheetBehavior.f1846d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.V) / 2) {
                            if (!bottomSheetBehavior.f1842b) {
                                break;
                            }
                            i8 = 3;
                            bottomSheetBehavior.getClass();
                            bottomSheetBehavior.E(view, i8, true);
                        }
                    }
                    i8 = 5;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i8, true);
                } else {
                    if (f8 == 0.0f || Math.abs(f6) > Math.abs(f8)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.f1842b) {
                            break;
                        } else {
                            int i9 = bottomSheetBehavior.E;
                            if (top2 < i9) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i8 = 3;
                            } else {
                                if (Math.abs(top2 - i9) < Math.abs(top2 - bottomSheetBehavior.G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i8 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f1842b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.E) < Math.abs(top3 - bottomSheetBehavior.G)) {
                                bottomSheetBehavior.getClass();
                            }
                        }
                        i8 = 4;
                    }
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i8, true);
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f4188b;
                if (!sideSheetBehavior.f1936a.T(f6)) {
                    if (sideSheetBehavior.f1936a.o0(view, f6)) {
                        if (!sideSheetBehavior.f1936a.W(f6, f8)) {
                            break;
                        }
                        i = 5;
                    } else {
                        if (f6 == 0.0f || Math.abs(f6) <= Math.abs(f8)) {
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
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        if (r6.canScrollVertically(-1) != false) goto L36;
     */
    @Override // r2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y(View view, int i) {
        WeakReference weakReference;
        switch (this.f4187a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f4188b;
                int i8 = bottomSheetBehavior.N;
                if (i8 != 1 && !bottomSheetBehavior.f1845c0) {
                    if (i8 == 3 && bottomSheetBehavior.f1841a0 == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.X;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null) {
                            break;
                        }
                    }
                    SystemClock.uptimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.W;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        return true;
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f4188b;
                return (sideSheetBehavior.f1943h == 1 || (weakReference = sideSheetBehavior.f1950p) == null || weakReference.get() != view) ? false : true;
        }
    }

    @Override // r2.r
    public final int o(View view, int i) {
        switch (this.f4187a) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f4188b;
                return h0.a.p(i, sideSheetBehavior.f1936a.I(), sideSheetBehavior.f1936a.H());
        }
    }

    @Override // r2.r
    public final int p(View view, int i) {
        switch (this.f4187a) {
            case 0:
                return h0.a.p(i, ((BottomSheetBehavior) this.f4188b).x(), C());
            default:
                return view.getTop();
        }
    }
}
