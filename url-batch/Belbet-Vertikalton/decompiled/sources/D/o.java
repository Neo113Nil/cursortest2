package D;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f191c;

    public /* synthetic */ o(Object obj, int i, int i2) {
        this.f189a = i2;
        this.f191c = obj;
        this.f190b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f189a) {
            case 0:
                ((b) this.f191c).g(this.f190b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f191c;
                View view = (View) sideSheetBehavior.f2464p.get();
                if (view != null) {
                    sideSheetBehavior.y(view, this.f190b, false);
                    break;
                }
                break;
        }
    }
}
