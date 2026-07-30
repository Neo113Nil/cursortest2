package S7;

import D.H;
import O7.AbstractC0399y;
import O7.EnumC0398x;
import O7.InterfaceC0397w;
import v7.InterfaceC5133d;
import v7.InterfaceC5138i;
import w7.EnumC5179a;

/* loaded from: classes2.dex */
public final class d extends x7.h implements E7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f2983n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f2984u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ R7.c f2985v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ H f2986w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(H h9, R7.c cVar, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f2985v = cVar;
        this.f2986w = h9;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        d dVar = new d(this.f2986w, this.f2985v, interfaceC5133d);
        dVar.f2984u = obj;
        return dVar;
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((InterfaceC0397w) obj, (InterfaceC5133d) obj2)).invokeSuspend(q7.v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f2983n;
        q7.v vVar = q7.v.f40183a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            return vVar;
        }
        com.bumptech.glide.f.r(obj);
        InterfaceC0397w interfaceC0397w = (InterfaceC0397w) this.f2984u;
        H h9 = this.f2986w;
        int i4 = h9.f491u;
        if (i4 == -3) {
            i4 = -2;
        }
        EnumC0398x enumC0398x = EnumC0398x.f2639v;
        E7.p eVar = new e(h9, null);
        Q7.o oVar = new Q7.o(AbstractC0399y.p(interfaceC0397w, (InterfaceC5138i) h9.f492v), Q7.j.a(i4, (Q7.a) h9.f493w, 4));
        oVar.W(enumC0398x, oVar, eVar);
        this.f2983n = 1;
        Object a9 = R7.o.a(this.f2985v, oVar, true, this);
        if (a9 != enumC5179a) {
            a9 = vVar;
        }
        return a9 == enumC5179a ? enumC5179a : vVar;
    }
}
