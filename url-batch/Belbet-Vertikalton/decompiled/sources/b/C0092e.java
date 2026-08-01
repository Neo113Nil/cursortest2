package b;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0077l;
import h.AbstractActivityC0132i;

/* renamed from: b.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0092e implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2158a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2159b;

    public /* synthetic */ C0092e(int i, Object obj) {
        this.f2158a = i;
        this.f2159b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, EnumC0077l enumC0077l) {
        Window window;
        View peekDecorView;
        switch (this.f2158a) {
            case 0:
                AbstractActivityC0132i abstractActivityC0132i = (AbstractActivityC0132i) this.f2159b;
                if (enumC0077l == EnumC0077l.ON_STOP && (window = abstractActivityC0132i.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0132i abstractActivityC0132i2 = (AbstractActivityC0132i) this.f2159b;
                if (enumC0077l == EnumC0077l.ON_DESTROY) {
                    abstractActivityC0132i2.f2178b.f2226b = null;
                    if (!abstractActivityC0132i2.isChangingConfigurations()) {
                        abstractActivityC0132i2.c().a();
                    }
                    i iVar = abstractActivityC0132i2.f2181f;
                    AbstractActivityC0132i abstractActivityC0132i3 = iVar.f2167d;
                    abstractActivityC0132i3.getWindow().getDecorView().removeCallbacks(iVar);
                    abstractActivityC0132i3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                    break;
                }
                break;
            default:
                j0.d dVar = (j0.d) this.f2159b;
                j1.h.e(dVar, "this$0");
                if (enumC0077l != EnumC0077l.ON_START) {
                    if (enumC0077l == EnumC0077l.ON_STOP) {
                        dVar.f3163c = false;
                        break;
                    }
                } else {
                    dVar.f3163c = true;
                    break;
                }
                break;
        }
    }
}
