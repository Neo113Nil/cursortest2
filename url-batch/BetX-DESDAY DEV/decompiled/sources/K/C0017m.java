package K;

import a.C0039B;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0080m;
import androidx.lifecycle.InterfaceC0086t;

/* renamed from: K.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0017m implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f471b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f472c;

    public /* synthetic */ C0017m(Object obj, int i, Object obj2) {
        this.f470a = i;
        this.f471b = obj;
        this.f472c = obj2;
    }

    @Override // androidx.lifecycle.r
    public final void g(InterfaceC0086t interfaceC0086t, EnumC0080m enumC0080m) {
        switch (this.f470a) {
            case 0:
                EnumC0080m enumC0080m2 = EnumC0080m.ON_DESTROY;
                C0019o c0019o = (C0019o) this.f471b;
                if (enumC0080m != enumC0080m2) {
                    c0019o.getClass();
                    break;
                } else {
                    c0019o.b((InterfaceC0021q) this.f472c);
                    break;
                }
            default:
                C0039B c0039b = (C0039B) this.f471b;
                X0.f.e(c0039b, "$dispatcher");
                a.p pVar = (a.p) this.f472c;
                X0.f.e(pVar, "this$0");
                if (enumC0080m == EnumC0080m.ON_CREATE) {
                    OnBackInvokedDispatcher a2 = a.h.f912a.a(pVar);
                    X0.f.e(a2, "invoker");
                    c0039b.f897e = a2;
                    c0039b.c(c0039b.f899g);
                    break;
                }
                break;
        }
    }
}
