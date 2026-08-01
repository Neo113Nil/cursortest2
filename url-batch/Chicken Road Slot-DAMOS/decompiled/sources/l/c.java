package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import m.h1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f5641e;

    public /* synthetic */ c(k kVar, int i3) {
        this.f5640d = i3;
        this.f5641e = kVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f5640d) {
            case 0:
                f fVar = (f) this.f5641e;
                ArrayList arrayList = fVar.f5653v;
                if (fVar.j() && arrayList.size() > 0) {
                    int i3 = 0;
                    if (!((e) arrayList.get(0)).f5644a.I) {
                        View view = fVar.C;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i3 < size) {
                                Object obj = arrayList.get(i3);
                                i3++;
                                ((e) obj).f5644a.a();
                            }
                            break;
                        } else {
                            fVar.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                r rVar = (r) this.f5641e;
                h1 h1Var = rVar.f5724v;
                if (rVar.j() && !h1Var.I) {
                    View view2 = rVar.A;
                    if (view2 != null && view2.isShown()) {
                        h1Var.a();
                        break;
                    } else {
                        rVar.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
