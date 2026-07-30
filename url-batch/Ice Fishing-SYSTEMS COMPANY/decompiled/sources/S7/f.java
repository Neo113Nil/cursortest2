package S7;

import D.H;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes2.dex */
public final class f extends x7.h implements E7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f2990n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f2991u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ H f2992v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(H h9, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f2992v = h9;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        f fVar = new f(this.f2992v, interfaceC5133d);
        fVar.f2991u = obj;
        return fVar;
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((R7.c) obj, (InterfaceC5133d) obj2)).invokeSuspend(q7.v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f2990n;
        if (i == 0) {
            com.bumptech.glide.f.r(obj);
            R7.c cVar = (R7.c) this.f2991u;
            this.f2990n = 1;
            if (this.f2992v.p(cVar, this) == enumC5179a) {
                return enumC5179a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
        }
        return q7.v.f40183a;
    }
}
