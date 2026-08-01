package B;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f48c;

    public /* synthetic */ p(Object obj, int i, int i2) {
        this.f46a = i2;
        this.f48c = obj;
        this.f47b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46a) {
            case 0:
                ((b) this.f48c).g(this.f47b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f48c;
                View view = (View) sideSheetBehavior.f1967p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f47b, false);
                    break;
                }
                break;
        }
    }
}
