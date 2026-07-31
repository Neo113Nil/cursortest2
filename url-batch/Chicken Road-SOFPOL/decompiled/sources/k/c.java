package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import l.o1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f4033e;

    public /* synthetic */ c(k kVar, int i) {
        this.f4032d = i;
        this.f4033e = kVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f4032d) {
            case 0:
                f fVar = (f) this.f4033e;
                ArrayList arrayList = fVar.f4047k;
                if (fVar.k() && arrayList.size() > 0) {
                    int i = 0;
                    if (!((e) arrayList.get(0)).f4039a.f4316x) {
                        View view = fVar.f4054r;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                ((e) obj).f4039a.d();
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
                r rVar = (r) this.f4033e;
                o1 o1Var = rVar.f4131k;
                if (rVar.k() && !o1Var.f4316x) {
                    View view2 = rVar.f4136p;
                    if (view2 != null && view2.isShown()) {
                        o1Var.d();
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
