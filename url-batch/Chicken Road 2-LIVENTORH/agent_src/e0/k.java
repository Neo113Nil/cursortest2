package e0;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1155f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1156g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1157h;

    public /* synthetic */ k(int i, int i4, Object obj) {
        this.f1155f = i4;
        this.f1157h = obj;
        this.f1156g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1155f) {
            case 0:
                ((b) this.f1157h).g(this.f1156g);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1157h;
                View view = (View) sideSheetBehavior.f997p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f1156g, false);
                    break;
                }
                break;
        }
    }
}
