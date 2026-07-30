package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n6.C0787u;
import n6.InterfaceC0789w;

/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251q extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f3914e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0251q(r rVar, V5.b bVar) {
        super(2, bVar);
        this.f3914e = rVar;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        C0251q c0251q = new C0251q(this.f3914e, bVar);
        c0251q.f3913d = obj;
        return c0251q;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0251q) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        V6.b.P(obj);
        InterfaceC0789w interfaceC0789w = (InterfaceC0789w) this.f3913d;
        r rVar = this.f3914e;
        AbstractC0250p abstractC0250p = rVar.f3915d;
        if (((C0258y) abstractC0250p).f3922d.compareTo(EnumC0249o.f3907e) >= 0) {
            abstractC0250p.a(rVar);
        } else {
            n6.X x7 = (n6.X) interfaceC0789w.h().g(C0787u.f7085e);
            if (x7 != null) {
                x7.d(null);
            }
        }
        return Unit.f6114a;
    }
}
