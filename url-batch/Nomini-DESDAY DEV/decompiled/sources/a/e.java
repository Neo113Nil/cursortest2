package a;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0068l;
import androidx.lifecycle.InterfaceC0072p;
import g.AbstractActivityC0125i;
import h0.C0132d;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC0072p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1037b;

    public /* synthetic */ e(int i, Object obj) {
        this.f1036a = i;
        this.f1037b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0072p
    public final void e(androidx.lifecycle.r rVar, EnumC0068l enumC0068l) {
        Window window;
        View peekDecorView;
        switch (this.f1036a) {
            case 0:
                AbstractActivityC0125i abstractActivityC0125i = (AbstractActivityC0125i) this.f1037b;
                if (enumC0068l == EnumC0068l.ON_STOP && (window = abstractActivityC0125i.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0125i abstractActivityC0125i2 = (AbstractActivityC0125i) this.f1037b;
                if (enumC0068l == EnumC0068l.ON_DESTROY) {
                    abstractActivityC0125i2.f1055b.f1496b = null;
                    if (!abstractActivityC0125i2.isChangingConfigurations()) {
                        abstractActivityC0125i2.c().a();
                    }
                    i iVar = abstractActivityC0125i2.f1058f;
                    AbstractActivityC0125i abstractActivityC0125i3 = iVar.d;
                    abstractActivityC0125i3.getWindow().getDecorView().removeCallbacks(iVar);
                    abstractActivityC0125i3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                    break;
                }
                break;
            default:
                C0132d c0132d = (C0132d) this.f1037b;
                X0.e.e(c0132d, "this$0");
                if (enumC0068l != EnumC0068l.ON_START) {
                    if (enumC0068l == EnumC0068l.ON_STOP) {
                        c0132d.f2369c = false;
                        break;
                    }
                } else {
                    c0132d.f2369c = true;
                    break;
                }
                break;
        }
    }
}
