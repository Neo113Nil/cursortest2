package a;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0078l;
import androidx.lifecycle.InterfaceC0082p;
import g.AbstractActivityC0106i;

/* renamed from: a.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0060e implements InterfaceC0082p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1233b;

    public /* synthetic */ C0060e(int i, Object obj) {
        this.f1232a = i;
        this.f1233b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0082p
    public final void g(androidx.lifecycle.r rVar, EnumC0078l enumC0078l) {
        Window window;
        View peekDecorView;
        switch (this.f1232a) {
            case 0:
                AbstractActivityC0106i abstractActivityC0106i = (AbstractActivityC0106i) this.f1233b;
                if (enumC0078l == EnumC0078l.ON_STOP && (window = abstractActivityC0106i.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0106i abstractActivityC0106i2 = (AbstractActivityC0106i) this.f1233b;
                if (enumC0078l == EnumC0078l.ON_DESTROY) {
                    abstractActivityC0106i2.f1251b.f1722b = null;
                    if (!abstractActivityC0106i2.isChangingConfigurations()) {
                        abstractActivityC0106i2.c().a();
                    }
                    ViewTreeObserverOnDrawListenerC0064i viewTreeObserverOnDrawListenerC0064i = abstractActivityC0106i2.f1254f;
                    AbstractActivityC0106i abstractActivityC0106i3 = viewTreeObserverOnDrawListenerC0064i.d;
                    abstractActivityC0106i3.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0064i);
                    abstractActivityC0106i3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0064i);
                    break;
                }
                break;
            default:
                j0.d dVar = (j0.d) this.f1233b;
                h1.d.e(dVar, "this$0");
                if (enumC0078l != EnumC0078l.ON_START) {
                    if (enumC0078l == EnumC0078l.ON_STOP) {
                        dVar.f2662c = false;
                        break;
                    }
                } else {
                    dVar.f2662c = true;
                    break;
                }
                break;
        }
    }
}
