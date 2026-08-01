package a;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.AbstractActivityC0064v;
import androidx.lifecycle.EnumC0080m;
import androidx.lifecycle.InterfaceC0086t;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f908b;

    public /* synthetic */ e(int i, Object obj) {
        this.f907a = i;
        this.f908b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void g(InterfaceC0086t interfaceC0086t, EnumC0080m enumC0080m) {
        Window window;
        View peekDecorView;
        switch (this.f907a) {
            case 0:
                AbstractActivityC0064v abstractActivityC0064v = (AbstractActivityC0064v) this.f908b;
                if (enumC0080m == EnumC0080m.ON_STOP && (window = abstractActivityC0064v.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                p.b((AbstractActivityC0064v) this.f908b, interfaceC0086t, enumC0080m);
                break;
            default:
                g0.d dVar = (g0.d) this.f908b;
                X0.f.e(dVar, "this$0");
                if (enumC0080m != EnumC0080m.ON_START) {
                    if (enumC0080m == EnumC0080m.ON_STOP) {
                        dVar.f2617f = false;
                        break;
                    }
                } else {
                    dVar.f2617f = true;
                    break;
                }
                break;
        }
    }
}
