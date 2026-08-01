package B;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f43c;

    public /* synthetic */ p(int i, int i2, Object obj) {
        this.f41a = i2;
        this.f43c = obj;
        this.f42b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41a) {
            case 0:
                ((b) this.f43c).g(this.f42b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f43c;
                View view = (View) sideSheetBehavior.f1869p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f42b, false);
                    break;
                }
                break;
        }
    }
}
