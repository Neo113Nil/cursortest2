package b;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0077l;
import h.AbstractActivityC0132i;

/* renamed from: b.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0093f implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f2160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0132i f2161b;

    public /* synthetic */ C0093f(w wVar, AbstractActivityC0132i abstractActivityC0132i) {
        this.f2160a = wVar;
        this.f2161b = abstractActivityC0132i;
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, EnumC0077l enumC0077l) {
        w wVar = this.f2160a;
        AbstractActivityC0132i abstractActivityC0132i = this.f2161b;
        if (enumC0077l == EnumC0077l.ON_CREATE) {
            OnBackInvokedDispatcher a2 = C0094g.f2162a.a(abstractActivityC0132i);
            j1.h.e(a2, "invoker");
            wVar.e = a2;
            wVar.c(wVar.f2218g);
        }
    }
}
