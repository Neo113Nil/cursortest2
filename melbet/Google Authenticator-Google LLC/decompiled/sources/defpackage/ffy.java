package defpackage;

import android.os.SystemClock;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ffy extends abr {
    final /* synthetic */ BottomSheetBehavior a;

    public ffy(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // defpackage.abr
    public final void d(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior.w) {
                bottomSheetBehavior.S(1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r7 > r2.q) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r2.J()) < java.lang.Math.abs(r6.getTop() - r2.q)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        if (java.lang.Math.abs(r7 - r2.q) < java.lang.Math.abs(r7 - r2.s)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
    
        if (java.lang.Math.abs(r7 - r2.p) < java.lang.Math.abs(r7 - r2.s)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
    
        if (r7 < java.lang.Math.abs(r7 - r2.s)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        if (java.lang.Math.abs(r7 - r8) < java.lang.Math.abs(r7 - r2.s)) goto L51;
     */
    @Override // defpackage.abr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(View view, float f, float f2) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        int i = 6;
        if (f2 < 0.0f) {
            if (!bottomSheetBehavior.a) {
                int top = view.getTop();
                SystemClock.uptimeMillis();
            }
            i = 3;
        } else if (bottomSheetBehavior.u && bottomSheetBehavior.Y(view, f2)) {
            if ((Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.b) && view.getTop() <= (bottomSheetBehavior.A + bottomSheetBehavior.J()) / 2) {
                if (!bottomSheetBehavior.a) {
                }
                i = 3;
            } else {
                i = 5;
            }
        } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
            int top2 = view.getTop();
            if (!bottomSheetBehavior.a) {
                int i2 = bottomSheetBehavior.q;
                if (top2 < i2) {
                }
            }
        } else {
            if (!bottomSheetBehavior.a) {
                int top3 = view.getTop();
            }
            i = 4;
        }
        this.a.U(view, i, true);
    }

    @Override // defpackage.abr
    public final boolean f(View view, int i) {
        View L;
        BottomSheetBehavior bottomSheetBehavior = this.a;
        int i2 = bottomSheetBehavior.x;
        if (i2 == 1 || bottomSheetBehavior.G) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.E == i) {
            if (bottomSheetBehavior.c) {
                WeakReference weakReference = bottomSheetBehavior.F;
                L = weakReference != null ? (View) weakReference.get() : null;
            } else {
                L = bottomSheetBehavior.L();
            }
            if (L != null && L.canScrollVertically(-1)) {
                return false;
            }
        }
        SystemClock.uptimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.B;
        return weakReference2 != null && weakReference2.get() == view;
    }

    @Override // defpackage.abr
    public final int g(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.abr
    public final int h(View view, int i) {
        return pj.j(i, this.a.J(), i());
    }

    @Override // defpackage.abr
    public final int i() {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        return bottomSheetBehavior.W() ? bottomSheetBehavior.A : bottomSheetBehavior.s;
    }

    @Override // defpackage.abr
    public final void l(View view, int i, int i2) {
        this.a.N(i2);
    }
}
