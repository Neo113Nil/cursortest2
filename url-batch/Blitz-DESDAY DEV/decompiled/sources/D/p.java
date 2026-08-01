package D;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.winfour.neondrop.ui.GameActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f144b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f145c;

    public /* synthetic */ p(Object obj, int i, int i2) {
        this.f143a = i2;
        this.f145c = obj;
        this.f144b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f144b;
        Object obj = this.f145c;
        switch (this.f143a) {
            case 0:
                ((b) obj).g(i);
                break;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.f1957p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, i, false);
                    break;
                }
                break;
            default:
                int i2 = GameActivity.f2101G;
                ((GameActivity) obj).x(i, true);
                break;
        }
    }
}
