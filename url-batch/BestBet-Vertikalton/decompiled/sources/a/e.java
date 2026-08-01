package a;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0071l;
import g.AbstractActivityC0128i;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1562b;

    public /* synthetic */ e(int i, Object obj) {
        this.f1561a = i;
        this.f1562b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, EnumC0071l enumC0071l) {
        Window window;
        View peekDecorView;
        switch (this.f1561a) {
            case 0:
                AbstractActivityC0128i abstractActivityC0128i = (AbstractActivityC0128i) this.f1562b;
                if (enumC0071l == EnumC0071l.ON_STOP && (window = abstractActivityC0128i.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0128i abstractActivityC0128i2 = (AbstractActivityC0128i) this.f1562b;
                if (enumC0071l == EnumC0071l.ON_DESTROY) {
                    abstractActivityC0128i2.f1580b.f2038b = null;
                    if (!abstractActivityC0128i2.isChangingConfigurations()) {
                        abstractActivityC0128i2.c().a();
                    }
                    i iVar = abstractActivityC0128i2.f1583f;
                    AbstractActivityC0128i abstractActivityC0128i3 = iVar.d;
                    abstractActivityC0128i3.getWindow().getDecorView().removeCallbacks(iVar);
                    abstractActivityC0128i3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                    break;
                }
                break;
            default:
                j0.d dVar = (j0.d) this.f1562b;
                k1.e.e(dVar, "this$0");
                if (enumC0071l != EnumC0071l.ON_START) {
                    if (enumC0071l == EnumC0071l.ON_STOP) {
                        dVar.f3080c = false;
                        break;
                    }
                } else {
                    dVar.f3080c = true;
                    break;
                }
                break;
        }
    }
}
