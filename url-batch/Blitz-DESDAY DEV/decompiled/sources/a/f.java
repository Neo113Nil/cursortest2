package a;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0069l;
import androidx.lifecycle.InterfaceC0073p;
import g.AbstractActivityC0110i;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0073p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f1244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0110i f1245b;

    public /* synthetic */ f(x xVar, AbstractActivityC0110i abstractActivityC0110i) {
        this.f1244a = xVar;
        this.f1245b = abstractActivityC0110i;
    }

    @Override // androidx.lifecycle.InterfaceC0073p
    public final void g(androidx.lifecycle.r rVar, EnumC0069l enumC0069l) {
        x xVar = this.f1244a;
        AbstractActivityC0110i abstractActivityC0110i = this.f1245b;
        if (enumC0069l == EnumC0069l.ON_CREATE) {
            OnBackInvokedDispatcher a2 = g.f1246a.a(abstractActivityC0110i);
            g1.d.e(a2, "invoker");
            xVar.f1303e = a2;
            xVar.c(xVar.f1305g);
        }
    }
}
