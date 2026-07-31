package b;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0285n;
import androidx.lifecycle.InterfaceC0290t;
import androidx.lifecycle.InterfaceC0292v;

/* renamed from: b.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0310f implements InterfaceC0290t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0301E f5288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0319o f5289e;

    public /* synthetic */ C0310f(C0301E c0301e, AbstractActivityC0319o abstractActivityC0319o) {
        this.f5288d = c0301e;
        this.f5289e = abstractActivityC0319o;
    }

    @Override // androidx.lifecycle.InterfaceC0290t
    public final void b(InterfaceC0292v interfaceC0292v, EnumC0285n enumC0285n) {
        C0301E c0301e = this.f5288d;
        AbstractActivityC0319o abstractActivityC0319o = this.f5289e;
        f2.j.f(abstractActivityC0319o, "this$0");
        if (enumC0285n == EnumC0285n.ON_CREATE) {
            OnBackInvokedDispatcher a3 = C0311g.f5290a.a(abstractActivityC0319o);
            f2.j.f(a3, "invoker");
            c0301e.f5271e = a3;
            c0301e.d(c0301e.f5273g);
        }
    }
}
