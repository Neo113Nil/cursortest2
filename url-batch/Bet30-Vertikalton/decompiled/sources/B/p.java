package B;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42c;

    public /* synthetic */ p(Object obj, int i, int i2) {
        this.f40a = i2;
        this.f42c = obj;
        this.f41b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40a) {
            case 0:
                ((b) this.f42c).g(this.f41b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f42c;
                View view = (View) sideSheetBehavior.f1746p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f41b, false);
                    break;
                }
                break;
        }
    }
}
