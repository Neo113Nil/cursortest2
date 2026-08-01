package a;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0072l;
import androidx.lifecycle.InterfaceC0076p;
import g.AbstractActivityC0133i;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0076p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f1102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0133i f1103b;

    public /* synthetic */ f(x xVar, AbstractActivityC0133i abstractActivityC0133i) {
        this.f1102a = xVar;
        this.f1103b = abstractActivityC0133i;
    }

    @Override // androidx.lifecycle.InterfaceC0076p
    public final void g(androidx.lifecycle.r rVar, EnumC0072l enumC0072l) {
        x xVar = this.f1102a;
        AbstractActivityC0133i abstractActivityC0133i = this.f1103b;
        if (enumC0072l == EnumC0072l.ON_CREATE) {
            OnBackInvokedDispatcher a2 = g.f1104a.a(abstractActivityC0133i);
            b1.d.e(a2, "invoker");
            xVar.f1161e = a2;
            xVar.c(xVar.f1163g);
        }
    }
}
