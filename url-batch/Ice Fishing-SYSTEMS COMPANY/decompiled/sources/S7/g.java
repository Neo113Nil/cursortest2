package S7;

import D.H;
import O7.InterfaceC0397w;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes2.dex */
public final class g extends x7.h implements E7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f2993n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ H f2994u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ R7.c f2995v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2996w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(H h9, R7.c cVar, Object obj, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f2994u = h9;
        this.f2995v = cVar;
        this.f2996w = obj;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        return new g(this.f2994u, this.f2995v, this.f2996w, interfaceC5133d);
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC0397w) obj, (InterfaceC5133d) obj2)).invokeSuspend(q7.v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f2993n;
        if (i == 0) {
            com.bumptech.glide.f.r(obj);
            R7.g gVar = (R7.g) this.f2994u.f495y;
            this.f2993n = 1;
            if (gVar.invoke(this.f2995v, this.f2996w, this) == enumC5179a) {
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
