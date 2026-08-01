package a;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0069l;
import androidx.lifecycle.InterfaceC0073p;
import g.AbstractActivityC0132i;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC0073p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1145b;

    public /* synthetic */ e(int i, Object obj) {
        this.f1144a = i;
        this.f1145b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0073p
    public final void g(androidx.lifecycle.r rVar, EnumC0069l enumC0069l) {
        Window window;
        View peekDecorView;
        switch (this.f1144a) {
            case 0:
                AbstractActivityC0132i abstractActivityC0132i = (AbstractActivityC0132i) this.f1145b;
                if (enumC0069l == EnumC0069l.ON_STOP && (window = abstractActivityC0132i.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0132i abstractActivityC0132i2 = (AbstractActivityC0132i) this.f1145b;
                if (enumC0069l == EnumC0069l.ON_DESTROY) {
                    abstractActivityC0132i2.f1163b.f1605b = null;
                    if (!abstractActivityC0132i2.isChangingConfigurations()) {
                        abstractActivityC0132i2.c().a();
                    }
                    i iVar = abstractActivityC0132i2.f1166f;
                    AbstractActivityC0132i abstractActivityC0132i3 = iVar.d;
                    abstractActivityC0132i3.getWindow().getDecorView().removeCallbacks(iVar);
                    abstractActivityC0132i3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                    break;
                }
                break;
            default:
                h0.d dVar = (h0.d) this.f1145b;
                e1.d.e(dVar, "this$0");
                if (enumC0069l != EnumC0069l.ON_START) {
                    if (enumC0069l == EnumC0069l.ON_STOP) {
                        dVar.f2508c = false;
                        break;
                    }
                } else {
                    dVar.f2508c = true;
                    break;
                }
                break;
        }
    }
}
