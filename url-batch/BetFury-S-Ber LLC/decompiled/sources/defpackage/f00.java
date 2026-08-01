package defpackage;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class f00 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ f00(int i, int i2, Object obj) {
        this.f = i2;
        this.h = obj;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        int i2 = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                int[] iArr = MaterialButton.S;
                ((MaterialButton) obj).setIconSize(i2);
                break;
            case 1:
                ((bi) obj).N(i2);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.p;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    sideSheetBehavior.z(view, i2, false);
                    break;
                }
                break;
        }
    }
}
