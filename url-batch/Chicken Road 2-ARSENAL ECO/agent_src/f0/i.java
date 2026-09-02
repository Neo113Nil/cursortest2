package f0;

import D3.p;
import J5.q;
import android.app.Activity;
import g0.InterfaceC0390a;
import k5.v;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import u0.AbstractC0676f;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class i extends q5.g implements InterfaceC0747p {

    /* renamed from: f, reason: collision with root package name */
    public int f4189f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4190g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0362b f4191h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Activity f4192i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C0362b c0362b, Activity activity, InterfaceC0564d interfaceC0564d) {
        super(2, interfaceC0564d);
        this.f4191h = c0362b;
        this.f4192i = activity;
    }

    @Override // q5.AbstractC0605a
    public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
        i iVar = new i(this.f4191h, this.f4192i, interfaceC0564d);
        iVar.f4190g = obj;
        return iVar;
    }

    @Override // x5.InterfaceC0747p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((q) obj, (InterfaceC0564d) obj2)).invokeSuspend(v.f5219a);
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        EnumC0580a enumC0580a = EnumC0580a.f5697f;
        int i7 = this.f4189f;
        if (i7 == 0) {
            AbstractC0676f.w(obj);
            q qVar = (q) this.f4190g;
            p pVar = new p(1, qVar);
            C0362b c0362b = this.f4191h;
            ((InterfaceC0390a) c0362b.f4175g).b(this.f4192i, new P.c(0), pVar);
            V5.m mVar = new V5.m(c0362b, 1, pVar);
            this.f4189f = 1;
            if (J5.i.b(qVar, mVar, this) == enumC0580a) {
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
