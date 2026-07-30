package X;

import O7.InterfaceC0397w;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes.dex */
public final class B extends x7.h implements E7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3526n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x7.h f3527u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3528v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public B(E7.p pVar, Object obj, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f3527u = (x7.h) pVar;
        this.f3528v = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E7.p, x7.h] */
    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        return new B(this.f3527u, this.f3528v, interfaceC5133d);
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((InterfaceC0397w) obj, (InterfaceC5133d) obj2)).invokeSuspend(q7.v.f40183a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [E7.p, x7.h] */
    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f3526n;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            return obj;
        }
        com.bumptech.glide.f.r(obj);
        this.f3526n = 1;
        Object invoke = this.f3527u.invoke(this.f3528v, this);
        return invoke == enumC5179a ? enumC5179a : invoke;
    }
}
