package a;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0070l;
import androidx.lifecycle.InterfaceC0074p;
import g.AbstractActivityC0131i;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC0074p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1076b;

    public /* synthetic */ e(int i, Object obj) {
        this.f1075a = i;
        this.f1076b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0074p
    public final void f(androidx.lifecycle.r rVar, EnumC0070l enumC0070l) {
        Window window;
        View peekDecorView;
        switch (this.f1075a) {
            case 0:
                AbstractActivityC0131i abstractActivityC0131i = (AbstractActivityC0131i) this.f1076b;
                if (enumC0070l == EnumC0070l.ON_STOP && (window = abstractActivityC0131i.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0131i abstractActivityC0131i2 = (AbstractActivityC0131i) this.f1076b;
                if (enumC0070l == EnumC0070l.ON_DESTROY) {
                    abstractActivityC0131i2.f1094b.f1534b = null;
                    if (!abstractActivityC0131i2.isChangingConfigurations()) {
                        abstractActivityC0131i2.c().a();
                    }
                    i iVar = abstractActivityC0131i2.f1097f;
                    AbstractActivityC0131i abstractActivityC0131i3 = iVar.d;
                    abstractActivityC0131i3.getWindow().getDecorView().removeCallbacks(iVar);
                    abstractActivityC0131i3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                    break;
                }
                break;
            default:
                h0.d dVar = (h0.d) this.f1076b;
                Z0.d.e(dVar, "this$0");
                if (enumC0070l != EnumC0070l.ON_START) {
                    if (enumC0070l == EnumC0070l.ON_STOP) {
                        dVar.f2455c = false;
                        break;
                    }
                } else {
                    dVar.f2455c = true;
                    break;
                }
                break;
        }
    }
}
