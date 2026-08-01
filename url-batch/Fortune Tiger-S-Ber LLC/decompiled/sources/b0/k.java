package b0;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f715f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ k(int i4, int i5, Object obj) {
        this.f715f = i5;
        this.h = obj;
        this.g = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f715f;
        int i5 = this.g;
        Object obj = this.h;
        switch (i4) {
            case 0:
                ((b) obj).g(i5);
                break;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.f1382p;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    sideSheetBehavior.t(view, i5, false);
                    break;
                }
                break;
            default:
                int[] iArr = MaterialButton.S;
                ((MaterialButton) obj).setIconSize(i5);
                break;
        }
    }
}
