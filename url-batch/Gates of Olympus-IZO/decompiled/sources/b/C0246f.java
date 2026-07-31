package b;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0229n;
import androidx.lifecycle.InterfaceC0234t;
import androidx.lifecycle.InterfaceC0236v;

/* renamed from: b.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0246f implements InterfaceC0234t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F f4153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f4154e;

    public /* synthetic */ C0246f(F f3, o oVar) {
        this.f4153d = f3;
        this.f4154e = oVar;
    }

    @Override // androidx.lifecycle.InterfaceC0234t
    public final void b(InterfaceC0236v interfaceC0236v, EnumC0229n enumC0229n) {
        F f3 = this.f4153d;
        o oVar = this.f4154e;
        Z1.i.f(oVar, "this$0");
        if (enumC0229n == EnumC0229n.ON_CREATE) {
            OnBackInvokedDispatcher a3 = C0247g.f4155a.a(oVar);
            Z1.i.f(a3, "invoker");
            f3.f4136e = a3;
            f3.d(f3.f4138g);
        }
    }
}
