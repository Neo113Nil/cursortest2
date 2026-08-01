package a;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0071l;
import g.AbstractActivityC0136i;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1182b;

    public /* synthetic */ e(int i, Object obj) {
        this.f1181a = i;
        this.f1182b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, EnumC0071l enumC0071l) {
        Window window;
        View peekDecorView;
        switch (this.f1181a) {
            case 0:
                AbstractActivityC0136i abstractActivityC0136i = (AbstractActivityC0136i) this.f1182b;
                if (enumC0071l == EnumC0071l.ON_STOP && (window = abstractActivityC0136i.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0136i abstractActivityC0136i2 = (AbstractActivityC0136i) this.f1182b;
                if (enumC0071l == EnumC0071l.ON_DESTROY) {
                    abstractActivityC0136i2.f1200b.f1697b = null;
                    if (!abstractActivityC0136i2.isChangingConfigurations()) {
                        abstractActivityC0136i2.c().a();
                    }
                    i iVar = abstractActivityC0136i2.f1203f;
                    AbstractActivityC0136i abstractActivityC0136i3 = iVar.d;
                    abstractActivityC0136i3.getWindow().getDecorView().removeCallbacks(iVar);
                    abstractActivityC0136i3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                    break;
                }
                break;
            default:
                h0.d dVar = (h0.d) this.f1182b;
                g1.f.e(dVar, "this$0");
                if (enumC0071l != EnumC0071l.ON_START) {
                    if (enumC0071l == EnumC0071l.ON_STOP) {
                        dVar.f2576c = false;
                        break;
                    }
                } else {
                    dVar.f2576c = true;
                    break;
                }
                break;
        }
    }
}
