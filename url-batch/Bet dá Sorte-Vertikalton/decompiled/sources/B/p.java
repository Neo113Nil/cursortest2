package B;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f64b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f65c;

    public /* synthetic */ p(Object obj, int i, int i2) {
        this.f63a = i2;
        this.f65c = obj;
        this.f64b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f63a) {
            case 0:
                ((b) this.f65c).g(this.f64b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f65c;
                View view = (View) sideSheetBehavior.f1874p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f64b, false);
                    break;
                }
                break;
        }
    }
}
