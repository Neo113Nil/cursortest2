package a;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0068l;
import androidx.lifecycle.InterfaceC0072p;
import g.AbstractActivityC0125i;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0072p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f1042a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0125i f1043b;

    public /* synthetic */ f(x xVar, AbstractActivityC0125i abstractActivityC0125i) {
        this.f1042a = xVar;
        this.f1043b = abstractActivityC0125i;
    }

    @Override // androidx.lifecycle.InterfaceC0072p
    public final void e(androidx.lifecycle.r rVar, EnumC0068l enumC0068l) {
        x xVar = this.f1042a;
        AbstractActivityC0125i abstractActivityC0125i = this.f1043b;
        if (enumC0068l == EnumC0068l.ON_CREATE) {
            OnBackInvokedDispatcher a2 = g.f1044a.a(abstractActivityC0125i);
            X0.d.e(a2, "invoker");
            xVar.f1101e = a2;
            xVar.c(xVar.f1103g);
        }
    }
}
