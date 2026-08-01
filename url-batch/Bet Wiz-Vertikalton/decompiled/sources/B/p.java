package B;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37c;

    public /* synthetic */ p(Object obj, int i, int i2) {
        this.f35a = i2;
        this.f37c = obj;
        this.f36b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35a) {
            case 0:
                ((b) this.f37c).g(this.f36b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f37c;
                View view = (View) sideSheetBehavior.f1845p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f36b, false);
                    break;
                }
                break;
        }
    }
}
