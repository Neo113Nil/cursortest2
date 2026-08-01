package androidx.activity;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.lifecycle.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f92b;

    public /* synthetic */ e(int i4, Object obj) {
        this.f91a = i4;
        this.f92b = obj;
    }

    @Override // androidx.lifecycle.p
    public final void a(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
        Window window;
        View peekDecorView;
        switch (this.f91a) {
            case 0:
                f.i iVar = (f.i) this.f92b;
                if (lVar == androidx.lifecycle.l.ON_STOP && (window = iVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                f.i iVar2 = (f.i) this.f92b;
                if (lVar == androidx.lifecycle.l.ON_DESTROY) {
                    iVar2.g.f1b = null;
                    if (!iVar2.isChangingConfigurations()) {
                        iVar2.e().a();
                    }
                    k kVar = iVar2.f129k;
                    f.i iVar3 = kVar.f117i;
                    iVar3.getWindow().getDecorView().removeCallbacks(kVar);
                    iVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
                    break;
                }
                break;
            default:
                c1.d dVar = (c1.d) this.f92b;
                u2.c.e(dVar, "this$0");
                if (lVar != androidx.lifecycle.l.ON_START) {
                    if (lVar == androidx.lifecycle.l.ON_STOP) {
                        dVar.c = false;
                        break;
                    }
                } else {
                    dVar.c = true;
                    break;
                }
                break;
        }
    }
}
