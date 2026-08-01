package a;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.InterfaceC0075p;
import g.AbstractActivityC0106i;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC0075p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1158b;

    public /* synthetic */ e(int i, Object obj) {
        this.f1157a = i;
        this.f1158b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0075p
    public final void g(androidx.lifecycle.r rVar, EnumC0071l enumC0071l) {
        Window window;
        View peekDecorView;
        switch (this.f1157a) {
            case 0:
                AbstractActivityC0106i abstractActivityC0106i = (AbstractActivityC0106i) this.f1158b;
                if (enumC0071l == EnumC0071l.ON_STOP && (window = abstractActivityC0106i.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0106i abstractActivityC0106i2 = (AbstractActivityC0106i) this.f1158b;
                if (enumC0071l == EnumC0071l.ON_DESTROY) {
                    abstractActivityC0106i2.f1176b.f1630b = null;
                    if (!abstractActivityC0106i2.isChangingConfigurations()) {
                        abstractActivityC0106i2.c().a();
                    }
                    i iVar = abstractActivityC0106i2.f1179f;
                    AbstractActivityC0106i abstractActivityC0106i3 = iVar.d;
                    abstractActivityC0106i3.getWindow().getDecorView().removeCallbacks(iVar);
                    abstractActivityC0106i3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                    break;
                }
                break;
            default:
                i0.d dVar = (i0.d) this.f1158b;
                d1.d.e(dVar, "this$0");
                if (enumC0071l != EnumC0071l.ON_START) {
                    if (enumC0071l == EnumC0071l.ON_STOP) {
                        dVar.f2531c = false;
                        break;
                    }
                } else {
                    dVar.f2531c = true;
                    break;
                }
                break;
        }
    }
}
