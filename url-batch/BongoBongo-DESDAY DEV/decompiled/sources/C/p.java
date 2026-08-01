package C;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f98c;

    public /* synthetic */ p(Object obj, int i, int i2) {
        this.f96a = i2;
        this.f98c = obj;
        this.f97b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f96a) {
            case 0:
                ((b) this.f98c).g(this.f97b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f98c;
                View view = (View) sideSheetBehavior.f1970p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f97b, false);
                    break;
                }
                break;
        }
    }
}
