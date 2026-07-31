package L5;

import H5.AbstractC0165z;
import H5.F;
import H5.InterfaceC0163x;
import k5.v;
import o5.C0565e;
import o5.InterfaceC0564d;
import o5.InterfaceC0569i;
import p5.EnumC0580a;
import u0.AbstractC0676f;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class c extends q5.g implements InterfaceC0747p {

    /* renamed from: f, reason: collision with root package name */
    public int f1487f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1488g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ K5.d f1489h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a f1490i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(K5.d dVar, a aVar, InterfaceC0564d interfaceC0564d) {
        super(2, interfaceC0564d);
        this.f1489h = dVar;
        this.f1490i = aVar;
    }

    @Override // q5.AbstractC0605a
    public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
        c cVar = new c(this.f1489h, this.f1490i, interfaceC0564d);
        cVar.f1488g = obj;
        return cVar;
    }

    @Override // x5.InterfaceC0747p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((InterfaceC0163x) obj, (InterfaceC0564d) obj2)).invokeSuspend(v.f5219a);
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        EnumC0580a enumC0580a = EnumC0580a.f5697f;
        int i7 = this.f1487f;
        v vVar = v.f5219a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            return vVar;
        }
        AbstractC0676f.w(obj);
        InterfaceC0163x interfaceC0163x = (InterfaceC0163x) this.f1488g;
        a aVar = this.f1490i;
        InterfaceC0569i interfaceC0569i = (InterfaceC0569i) aVar.f1486i;
        int i8 = aVar.f1484g;
        if (i8 == -3) {
            i8 = -2;
        }
        int i9 = aVar.f1485h;
        InterfaceC0747p dVar = new d(aVar, null);
        J5.b a7 = J5.i.a(i8, i9, 4);
        InterfaceC0569i e4 = AbstractC0165z.e(interfaceC0163x.e(), interfaceC0569i, true);
        O5.d dVar2 = F.f1027a;
        if (e4 != dVar2 && e4.m(C0565e.f5619f) == null) {
            e4 = e4.v(dVar2);
        }
        J5.p pVar = new J5.p(e4, a7);
        pVar.V(3, pVar, dVar);
        this.f1487f = 1;
        Object a8 = K5.l.a(this.f1489h, pVar, true, this);
        if (a8 != enumC0580a) {
            a8 = vVar;
        }
        return a8 == enumC0580a ? enumC0580a : vVar;
    }
}
