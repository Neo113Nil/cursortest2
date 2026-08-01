package a;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0072l;
import androidx.lifecycle.InterfaceC0076p;
import g.AbstractActivityC0108i;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC0076p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1188b;

    public /* synthetic */ e(int i, Object obj) {
        this.f1187a = i;
        this.f1188b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0076p
    public final void g(androidx.lifecycle.r rVar, EnumC0072l enumC0072l) {
        Window window;
        View peekDecorView;
        switch (this.f1187a) {
            case 0:
                AbstractActivityC0108i abstractActivityC0108i = (AbstractActivityC0108i) this.f1188b;
                if (enumC0072l == EnumC0072l.ON_STOP && (window = abstractActivityC0108i.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0108i abstractActivityC0108i2 = (AbstractActivityC0108i) this.f1188b;
                if (enumC0072l == EnumC0072l.ON_DESTROY) {
                    abstractActivityC0108i2.f1206b.f1659b = null;
                    if (!abstractActivityC0108i2.isChangingConfigurations()) {
                        abstractActivityC0108i2.c().a();
                    }
                    i iVar = abstractActivityC0108i2.f1209f;
                    AbstractActivityC0108i abstractActivityC0108i3 = iVar.d;
                    abstractActivityC0108i3.getWindow().getDecorView().removeCallbacks(iVar);
                    abstractActivityC0108i3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                    break;
                }
                break;
            default:
                i0.d dVar = (i0.d) this.f1188b;
                g1.d.e(dVar, "this$0");
                if (enumC0072l != EnumC0072l.ON_START) {
                    if (enumC0072l == EnumC0072l.ON_STOP) {
                        dVar.f2562c = false;
                        break;
                    }
                } else {
                    dVar.f2562c = true;
                    break;
                }
                break;
        }
    }
}
