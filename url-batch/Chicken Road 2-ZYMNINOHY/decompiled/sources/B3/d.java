package B3;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;

/* loaded from: classes.dex */
public final class d extends h3.g implements o3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f226a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f227b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f228c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f228c = eVar;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        d dVar = new d(this.f228c, interfaceC0425c);
        dVar.f227b = obj;
        return dVar;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((z3.p) obj, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f226a;
        if (i4 == 0) {
            O3.l.w(obj);
            z3.p pVar = (z3.p) this.f227b;
            this.f226a = 1;
            if (this.f228c.a(pVar, this) == enumC0441a) {
                return enumC0441a;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            O3.l.w(obj);
        }
        return C0297i.f5732a;
    }
}
