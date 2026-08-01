package a;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0069l;
import androidx.lifecycle.InterfaceC0073p;
import g.AbstractActivityC0132i;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0073p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f1146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0132i f1147b;

    public /* synthetic */ f(x xVar, AbstractActivityC0132i abstractActivityC0132i) {
        this.f1146a = xVar;
        this.f1147b = abstractActivityC0132i;
    }

    @Override // androidx.lifecycle.InterfaceC0073p
    public final void g(androidx.lifecycle.r rVar, EnumC0069l enumC0069l) {
        x xVar = this.f1146a;
        AbstractActivityC0132i abstractActivityC0132i = this.f1147b;
        if (enumC0069l == EnumC0069l.ON_CREATE) {
            OnBackInvokedDispatcher a2 = g.f1148a.a(abstractActivityC0132i);
            e1.d.e(a2, "invoker");
            xVar.f1205e = a2;
            xVar.c(xVar.f1207g);
        }
    }
}
