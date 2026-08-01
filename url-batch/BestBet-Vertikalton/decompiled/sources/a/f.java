package a;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0071l;
import g.AbstractActivityC0128i;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f1563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0128i f1564b;

    public /* synthetic */ f(x xVar, AbstractActivityC0128i abstractActivityC0128i) {
        this.f1563a = xVar;
        this.f1564b = abstractActivityC0128i;
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, EnumC0071l enumC0071l) {
        x xVar = this.f1563a;
        AbstractActivityC0128i abstractActivityC0128i = this.f1564b;
        if (enumC0071l == EnumC0071l.ON_CREATE) {
            OnBackInvokedDispatcher a2 = g.f1565a.a(abstractActivityC0128i);
            k1.e.e(a2, "invoker");
            xVar.f1619e = a2;
            xVar.c(xVar.f1621g);
        }
    }
}
