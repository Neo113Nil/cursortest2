package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.K;

/* renamed from: k.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1203c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f10549b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1203c(k kVar, int i2) {
        this.f10548a = i2;
        this.f10549b = kVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f10548a) {
            case 0:
                f fVar = (f) this.f10549b;
                if (fVar.k()) {
                    ArrayList arrayList = fVar.f10561h;
                    if (arrayList.size() > 0 && !((e) arrayList.get(0)).f10552a.f10790u) {
                        View view = fVar.f10568o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((e) it.next()).f10552a.d();
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
                r rVar = (r) this.f10549b;
                if (rVar.k()) {
                    K k3 = rVar.f10652h;
                    if (!k3.f10790u) {
                        View view2 = rVar.f10657m;
                        if (view2 != null && view2.isShown()) {
                            k3.d();
                            break;
                        } else {
                            rVar.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
