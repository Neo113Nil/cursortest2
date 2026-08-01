package B;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53c;

    public /* synthetic */ o(Object obj, int i, int i2) {
        this.f51a = i2;
        this.f53c = obj;
        this.f52b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f51a) {
            case 0:
                ((b) this.f53c).g(this.f52b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f53c;
                View view = (View) sideSheetBehavior.f2350p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f52b, false);
                    break;
                }
                break;
        }
    }
}
