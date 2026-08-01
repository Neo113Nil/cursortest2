package a;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0069l;
import androidx.lifecycle.InterfaceC0073p;
import g.AbstractActivityC0110i;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC0073p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1243b;

    public /* synthetic */ e(int i, Object obj) {
        this.f1242a = i;
        this.f1243b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0073p
    public final void g(androidx.lifecycle.r rVar, EnumC0069l enumC0069l) {
        Window window;
        View peekDecorView;
        switch (this.f1242a) {
            case 0:
                AbstractActivityC0110i abstractActivityC0110i = (AbstractActivityC0110i) this.f1243b;
                if (enumC0069l == EnumC0069l.ON_STOP && (window = abstractActivityC0110i.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0110i abstractActivityC0110i2 = (AbstractActivityC0110i) this.f1243b;
                if (enumC0069l == EnumC0069l.ON_DESTROY) {
                    abstractActivityC0110i2.f1261b.f1707b = null;
                    if (!abstractActivityC0110i2.isChangingConfigurations()) {
                        abstractActivityC0110i2.d().a();
                    }
                    i iVar = abstractActivityC0110i2.f1264f;
                    AbstractActivityC0110i abstractActivityC0110i3 = iVar.d;
                    abstractActivityC0110i3.getWindow().getDecorView().removeCallbacks(iVar);
                    abstractActivityC0110i3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                    break;
                }
                break;
            default:
                j0.d dVar = (j0.d) this.f1243b;
                g1.d.e(dVar, "this$0");
                if (enumC0069l != EnumC0069l.ON_START) {
                    if (enumC0069l == EnumC0069l.ON_STOP) {
                        dVar.f2682c = false;
                        break;
                    }
                } else {
                    dVar.f2682c = true;
                    break;
                }
                break;
        }
    }
}
