package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class e30 extends g90 {
    public final /* synthetic */ SideSheetBehavior a;

    public e30(SideSheetBehavior sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // defpackage.g90
    public final int clampViewPositionHorizontal(View view, int i, int i2) {
        SideSheetBehavior sideSheetBehavior = this.a;
        return l70.i(i, sideSheetBehavior.a.G(), sideSheetBehavior.a.F());
    }

    @Override // defpackage.g90
    public final int clampViewPositionVertical(View view, int i, int i2) {
        return view.getTop();
    }

    @Override // defpackage.g90
    public final int getViewHorizontalDragRange(View view) {
        SideSheetBehavior sideSheetBehavior = this.a;
        return sideSheetBehavior.l + sideSheetBehavior.o;
    }

    @Override // defpackage.g90
    public final void onViewDragStateChanged(int i) {
        if (i == 1) {
            SideSheetBehavior sideSheetBehavior = this.a;
            if (sideSheetBehavior.g) {
                sideSheetBehavior.setStateInternal(1);
            }
        }
    }

    @Override // defpackage.g90
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SideSheetBehavior sideSheetBehavior = this.a;
        WeakReference weakReference = sideSheetBehavior.q;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
            sideSheetBehavior.a.q0(marginLayoutParams, view.getLeft(), view.getRight());
            view2.setLayoutParams(marginLayoutParams);
        }
        LinkedHashSet linkedHashSet = sideSheetBehavior.v;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        sideSheetBehavior.a.j(i);
        Iterator it = linkedHashSet.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            o8.c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (java.lang.Math.abs(r3 - r1.a.A()) < java.lang.Math.abs(r3 - r1.a.C())) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1.a.T(r2) == false) goto L19;
     */
    @Override // defpackage.g90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewReleased(View view, float f, float f2) {
        int i;
        SideSheetBehavior sideSheetBehavior = this.a;
        if (!sideSheetBehavior.a.R(f)) {
            if (sideSheetBehavior.a.k0(view, f)) {
                if (!sideSheetBehavior.a.U(f, f2)) {
                }
                i = 5;
            } else {
                if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                    int left = view.getLeft();
                }
                i = 5;
            }
            sideSheetBehavior.startSettling(view, i, true);
        }
        i = 3;
        sideSheetBehavior.startSettling(view, i, true);
    }

    @Override // defpackage.g90
    public final boolean tryCaptureView(View view, int i) {
        WeakReference weakReference;
        SideSheetBehavior sideSheetBehavior = this.a;
        return (sideSheetBehavior.h == 1 || (weakReference = sideSheetBehavior.p) == null || weakReference.get() != view) ? false : true;
    }
}
