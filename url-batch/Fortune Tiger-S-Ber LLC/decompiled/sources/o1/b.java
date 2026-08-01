package o1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b extends m0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2988a;

    @Override // m0.a
    public final int l(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i4;
        switch (this.f2988a) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i4 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i4 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i4 = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i4;
    }

    @Override // m0.a
    public final int n() {
        switch (this.f2988a) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // m0.a
    public final ViewPropertyAnimator o(View view, int i4) {
        switch (this.f2988a) {
            case 0:
                return view.animate().translationY(i4);
            case 1:
                return view.animate().translationX(-i4);
            default:
                return view.animate().translationX(i4);
        }
    }
}
