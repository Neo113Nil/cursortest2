package N;

import O3.l;
import c3.C0297i;
import d3.t;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import o3.p;

/* loaded from: classes.dex */
public final class h extends h3.g implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f1793a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1794b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h3.g f1795c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(p pVar, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f1795c = (h3.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [h3.g, o3.p] */
    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        h hVar = new h(this.f1795c, interfaceC0425c);
        hVar.f1794b = obj;
        return hVar;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((b) obj, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [h3.g, o3.p] */
    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f1793a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f1794b;
            l.w(obj);
            return bVar;
        }
        l.w(obj);
        b bVar2 = new b(t.H(((b) this.f1794b).a()), false);
        this.f1794b = bVar2;
        this.f1793a = 1;
        return this.f1795c.invoke(bVar2, this) == enumC0441a ? enumC0441a : bVar2;
    }
}
