package a;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0070l;
import androidx.lifecycle.InterfaceC0074p;
import g.AbstractActivityC0131i;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0074p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f1077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0131i f1078b;

    public /* synthetic */ f(x xVar, AbstractActivityC0131i abstractActivityC0131i) {
        this.f1077a = xVar;
        this.f1078b = abstractActivityC0131i;
    }

    @Override // androidx.lifecycle.InterfaceC0074p
    public final void f(androidx.lifecycle.r rVar, EnumC0070l enumC0070l) {
        x xVar = this.f1077a;
        AbstractActivityC0131i abstractActivityC0131i = this.f1078b;
        if (enumC0070l == EnumC0070l.ON_CREATE) {
            OnBackInvokedDispatcher a2 = g.f1079a.a(abstractActivityC0131i);
            Z0.d.e(a2, "invoker");
            xVar.f1136e = a2;
            xVar.c(xVar.f1138g);
        }
    }
}
