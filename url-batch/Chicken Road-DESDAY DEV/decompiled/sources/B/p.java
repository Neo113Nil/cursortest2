package B;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39c;

    public /* synthetic */ p(Object obj, int i, int i2) {
        this.f37a = i2;
        this.f39c = obj;
        this.f38b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37a) {
            case 0:
                ((b) this.f39c).g(this.f38b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f39c;
                View view = (View) sideSheetBehavior.f1808p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f38b, false);
                    break;
                }
                break;
        }
    }
}
