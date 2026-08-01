package a;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.InterfaceC0075p;
import g.AbstractActivityC0128i;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC0075p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1115b;

    public /* synthetic */ e(int i, Object obj) {
        this.f1114a = i;
        this.f1115b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0075p
    public final void g(androidx.lifecycle.r rVar, EnumC0071l enumC0071l) {
        Window window;
        View peekDecorView;
        switch (this.f1114a) {
            case 0:
                AbstractActivityC0128i abstractActivityC0128i = (AbstractActivityC0128i) this.f1115b;
                if (enumC0071l == EnumC0071l.ON_STOP && (window = abstractActivityC0128i.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0128i abstractActivityC0128i2 = (AbstractActivityC0128i) this.f1115b;
                if (enumC0071l == EnumC0071l.ON_DESTROY) {
                    abstractActivityC0128i2.f1133b.f1576b = null;
                    if (!abstractActivityC0128i2.isChangingConfigurations()) {
                        abstractActivityC0128i2.c().a();
                    }
                    i iVar = abstractActivityC0128i2.f1136f;
                    AbstractActivityC0128i abstractActivityC0128i3 = iVar.d;
                    abstractActivityC0128i3.getWindow().getDecorView().removeCallbacks(iVar);
                    abstractActivityC0128i3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                    break;
                }
                break;
            default:
                h0.d dVar = (h0.d) this.f1115b;
                b1.d.e(dVar, "this$0");
                if (enumC0071l != EnumC0071l.ON_START) {
                    if (enumC0071l == EnumC0071l.ON_STOP) {
                        dVar.f2482c = false;
                        break;
                    }
                } else {
                    dVar.f2482c = true;
                    break;
                }
                break;
        }
    }
}
