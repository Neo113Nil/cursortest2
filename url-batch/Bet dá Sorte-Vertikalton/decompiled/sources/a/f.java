package a;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.InterfaceC0075p;
import g.AbstractActivityC0128i;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0075p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f1116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0128i f1117b;

    public /* synthetic */ f(x xVar, AbstractActivityC0128i abstractActivityC0128i) {
        this.f1116a = xVar;
        this.f1117b = abstractActivityC0128i;
    }

    @Override // androidx.lifecycle.InterfaceC0075p
    public final void g(androidx.lifecycle.r rVar, EnumC0071l enumC0071l) {
        x xVar = this.f1116a;
        AbstractActivityC0128i abstractActivityC0128i = this.f1117b;
        if (enumC0071l == EnumC0071l.ON_CREATE) {
            OnBackInvokedDispatcher a2 = g.f1118a.a(abstractActivityC0128i);
            b1.d.e(a2, "invoker");
            xVar.f1175e = a2;
            xVar.c(xVar.f1177g);
        }
    }
}
