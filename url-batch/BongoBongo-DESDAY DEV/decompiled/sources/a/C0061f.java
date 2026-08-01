package a;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0078l;
import androidx.lifecycle.InterfaceC0082p;
import g.AbstractActivityC0106i;

/* renamed from: a.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0061f implements InterfaceC0082p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f1234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0106i f1235b;

    public /* synthetic */ C0061f(x xVar, AbstractActivityC0106i abstractActivityC0106i) {
        this.f1234a = xVar;
        this.f1235b = abstractActivityC0106i;
    }

    @Override // androidx.lifecycle.InterfaceC0082p
    public final void g(androidx.lifecycle.r rVar, EnumC0078l enumC0078l) {
        x xVar = this.f1234a;
        AbstractActivityC0106i abstractActivityC0106i = this.f1235b;
        if (enumC0078l == EnumC0078l.ON_CREATE) {
            OnBackInvokedDispatcher a2 = C0062g.f1236a.a(abstractActivityC0106i);
            h1.d.e(a2, "invoker");
            xVar.f1294e = a2;
            xVar.c(xVar.f1296g);
        }
    }
}
