package e0;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1337f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1338g;
    public final /* synthetic */ Object h;

    public /* synthetic */ k(int i, int i4, Object obj) {
        this.f1337f = i4;
        this.h = obj;
        this.f1338g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1337f;
        int i4 = this.f1338g;
        Object obj = this.h;
        switch (i) {
            case 0:
                ((b) obj).g(i4);
                break;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.f1189p;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    sideSheetBehavior.t(view, i4, false);
                    break;
                }
                break;
            default:
                int[] iArr = MaterialButton.S;
                ((MaterialButton) obj).setIconSize(i4);
                break;
        }
    }
}
