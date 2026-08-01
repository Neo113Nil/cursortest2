package a;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.InterfaceC0075p;
import g.AbstractActivityC0106i;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0075p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f1159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0106i f1160b;

    public /* synthetic */ f(x xVar, AbstractActivityC0106i abstractActivityC0106i) {
        this.f1159a = xVar;
        this.f1160b = abstractActivityC0106i;
    }

    @Override // androidx.lifecycle.InterfaceC0075p
    public final void g(androidx.lifecycle.r rVar, EnumC0071l enumC0071l) {
        x xVar = this.f1159a;
        AbstractActivityC0106i abstractActivityC0106i = this.f1160b;
        if (enumC0071l == EnumC0071l.ON_CREATE) {
            OnBackInvokedDispatcher a2 = g.f1161a.a(abstractActivityC0106i);
            d1.d.e(a2, "invoker");
            xVar.f1218e = a2;
            xVar.c(xVar.f1220g);
        }
    }
}
