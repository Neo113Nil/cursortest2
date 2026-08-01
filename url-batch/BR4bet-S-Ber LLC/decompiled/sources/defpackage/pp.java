package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class pp extends mz {
    public final /* synthetic */ int j;

    @Override // defpackage.mz
    public final int q(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i;
        switch (this.j) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // defpackage.mz
    public final int r() {
        switch (this.j) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // defpackage.mz
    public final ViewPropertyAnimator s(View view, int i) {
        switch (this.j) {
            case 0:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }
}
