package L5;

import J5.q;
import k5.v;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import u0.AbstractC0676f;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class d extends q5.g implements InterfaceC0747p {

    /* renamed from: f, reason: collision with root package name */
    public int f1491f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a f1493h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, InterfaceC0564d interfaceC0564d) {
        super(2, interfaceC0564d);
        this.f1493h = aVar;
    }

    @Override // q5.AbstractC0605a
    public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
        d dVar = new d(this.f1493h, interfaceC0564d);
        dVar.f1492g = obj;
        return dVar;
    }

    @Override // x5.InterfaceC0747p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((q) obj, (InterfaceC0564d) obj2)).invokeSuspend(v.f5219a);
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        EnumC0580a enumC0580a = EnumC0580a.f5697f;
        int i7 = this.f1491f;
        if (i7 == 0) {
            AbstractC0676f.w(obj);
            q qVar = (q) this.f1492g;
            this.f1491f = 1;
            if (this.f1493h.b(qVar, this) == enumC0580a) {
                return enumC0580a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
        }
        return v.f5219a;
    }
}
