package h3;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3149f;

    public /* synthetic */ j(int i, int i8, Object obj) {
        this.f3147d = i8;
        this.f3149f = obj;
        this.f3148e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3147d) {
            case 0:
                ((b) this.f3149f).d(this.f3148e);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3149f;
                View view = (View) sideSheetBehavior.f1950p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f3148e, false);
                    break;
                }
                break;
        }
    }
}
