package a;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0072l;
import androidx.lifecycle.InterfaceC0076p;
import g.AbstractActivityC0108i;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0076p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f1189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0108i f1190b;

    public /* synthetic */ f(x xVar, AbstractActivityC0108i abstractActivityC0108i) {
        this.f1189a = xVar;
        this.f1190b = abstractActivityC0108i;
    }

    @Override // androidx.lifecycle.InterfaceC0076p
    public final void g(androidx.lifecycle.r rVar, EnumC0072l enumC0072l) {
        x xVar = this.f1189a;
        AbstractActivityC0108i abstractActivityC0108i = this.f1190b;
        if (enumC0072l == EnumC0072l.ON_CREATE) {
            OnBackInvokedDispatcher a2 = g.f1191a.a(abstractActivityC0108i);
            g1.d.e(a2, "invoker");
            xVar.f1248e = a2;
            xVar.c(xVar.f1250g);
        }
    }
}
