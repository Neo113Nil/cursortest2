package a;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0072l;
import androidx.lifecycle.InterfaceC0076p;
import g.AbstractActivityC0133i;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC0076p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1101b;

    public /* synthetic */ e(int i, Object obj) {
        this.f1100a = i;
        this.f1101b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0076p
    public final void g(androidx.lifecycle.r rVar, EnumC0072l enumC0072l) {
        Window window;
        View peekDecorView;
        switch (this.f1100a) {
            case 0:
                AbstractActivityC0133i abstractActivityC0133i = (AbstractActivityC0133i) this.f1101b;
                if (enumC0072l == EnumC0072l.ON_STOP && (window = abstractActivityC0133i.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0133i abstractActivityC0133i2 = (AbstractActivityC0133i) this.f1101b;
                if (enumC0072l == EnumC0072l.ON_DESTROY) {
                    abstractActivityC0133i2.f1119b.f1560b = null;
                    if (!abstractActivityC0133i2.isChangingConfigurations()) {
                        abstractActivityC0133i2.c().a();
                    }
                    i iVar = abstractActivityC0133i2.f1122f;
                    AbstractActivityC0133i abstractActivityC0133i3 = iVar.d;
                    abstractActivityC0133i3.getWindow().getDecorView().removeCallbacks(iVar);
                    abstractActivityC0133i3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                    break;
                }
                break;
            default:
                h0.d dVar = (h0.d) this.f1101b;
                b1.d.e(dVar, "this$0");
                if (enumC0072l != EnumC0072l.ON_START) {
                    if (enumC0072l == EnumC0072l.ON_STOP) {
                        dVar.f2443c = false;
                        break;
                    }
                } else {
                    dVar.f2443c = true;
                    break;
                }
                break;
        }
    }
}
