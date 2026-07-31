package L5;

import k5.v;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import u0.AbstractC0676f;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class o extends q5.g implements InterfaceC0747p {

    /* renamed from: f, reason: collision with root package name */
    public int f1519f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1520g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ K5.d f1521h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(K5.d dVar, InterfaceC0564d interfaceC0564d) {
        super(2, interfaceC0564d);
        this.f1521h = dVar;
    }

    @Override // q5.AbstractC0605a
    public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
        o oVar = new o(this.f1521h, interfaceC0564d);
        oVar.f1520g = obj;
        return oVar;
    }

    @Override // x5.InterfaceC0747p
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create(obj, (InterfaceC0564d) obj2)).invokeSuspend(v.f5219a);
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        EnumC0580a enumC0580a = EnumC0580a.f5697f;
        int i7 = this.f1519f;
        if (i7 == 0) {
            AbstractC0676f.w(obj);
            Object obj2 = this.f1520g;
            this.f1519f = 1;
            if (this.f1521h.a(obj2, this) == enumC0580a) {
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
