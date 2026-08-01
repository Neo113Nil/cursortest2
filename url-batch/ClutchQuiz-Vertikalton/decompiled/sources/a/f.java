package a;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0071l;
import g.AbstractActivityC0136i;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f1183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0136i f1184b;

    public /* synthetic */ f(x xVar, AbstractActivityC0136i abstractActivityC0136i) {
        this.f1183a = xVar;
        this.f1184b = abstractActivityC0136i;
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, EnumC0071l enumC0071l) {
        x xVar = this.f1183a;
        AbstractActivityC0136i abstractActivityC0136i = this.f1184b;
        if (enumC0071l == EnumC0071l.ON_CREATE) {
            OnBackInvokedDispatcher a2 = g.f1185a.a(abstractActivityC0136i);
            g1.f.e(a2, "invoker");
            xVar.f1239e = a2;
            xVar.d(xVar.f1241g);
        }
    }
}
