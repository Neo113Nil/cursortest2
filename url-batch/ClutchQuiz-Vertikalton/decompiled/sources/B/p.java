package B;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f67b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f68c;

    public /* synthetic */ p(Object obj, int i, int i2) {
        this.f66a = i2;
        this.f68c = obj;
        this.f67b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f66a) {
            case 0:
                ((b) this.f68c).g(this.f67b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f68c;
                View view = (View) sideSheetBehavior.f1953p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f67b, false);
                    break;
                }
                break;
        }
    }
}
