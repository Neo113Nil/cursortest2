package B;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f56b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f57c;

    public /* synthetic */ p(Object obj, int i, int i2) {
        this.f55a = i2;
        this.f57c = obj;
        this.f56b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f55a) {
            case 0:
                ((b) this.f57c).g(this.f56b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f57c;
                View view = (View) sideSheetBehavior.f1901p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f56b, false);
                    break;
                }
                break;
        }
    }
}
