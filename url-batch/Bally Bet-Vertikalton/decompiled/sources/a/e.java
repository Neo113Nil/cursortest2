package a;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0069l;
import androidx.lifecycle.InterfaceC0073p;
import g.AbstractActivityC0126i;
import h0.C0133d;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC0073p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1042a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1043b;

    public /* synthetic */ e(int i, Object obj) {
        this.f1042a = i;
        this.f1043b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0073p
    public final void e(androidx.lifecycle.r rVar, EnumC0069l enumC0069l) {
        Window window;
        View peekDecorView;
        switch (this.f1042a) {
            case 0:
                AbstractActivityC0126i abstractActivityC0126i = (AbstractActivityC0126i) this.f1043b;
                if (enumC0069l == EnumC0069l.ON_STOP && (window = abstractActivityC0126i.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0126i abstractActivityC0126i2 = (AbstractActivityC0126i) this.f1043b;
                if (enumC0069l == EnumC0069l.ON_DESTROY) {
                    abstractActivityC0126i2.f1061b.f1502b = null;
                    if (!abstractActivityC0126i2.isChangingConfigurations()) {
                        abstractActivityC0126i2.c().a();
                    }
                    i iVar = abstractActivityC0126i2.f1064f;
                    AbstractActivityC0126i abstractActivityC0126i3 = iVar.d;
                    abstractActivityC0126i3.getWindow().getDecorView().removeCallbacks(iVar);
                    abstractActivityC0126i3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                    break;
                }
                break;
            default:
                C0133d c0133d = (C0133d) this.f1043b;
                X0.d.e(c0133d, "this$0");
                if (enumC0069l != EnumC0069l.ON_START) {
                    if (enumC0069l == EnumC0069l.ON_STOP) {
                        c0133d.f2375c = false;
                        break;
                    }
                } else {
                    c0133d.f2375c = true;
                    break;
                }
                break;
        }
    }
}
