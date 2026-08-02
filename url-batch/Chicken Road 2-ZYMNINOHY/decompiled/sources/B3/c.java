package B3;

import A3.w;
import c3.C0297i;
import f3.C0426d;
import f3.InterfaceC0425c;
import f3.InterfaceC0430h;
import g3.EnumC0441a;
import x3.AbstractC1528C;
import x3.AbstractC1562w;
import x3.EnumC1561v;
import x3.InterfaceC1560u;

/* loaded from: classes.dex */
public final class c extends h3.g implements o3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f222a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f223b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A3.e f224c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f225d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(A3.e eVar, e eVar2, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f224c = eVar;
        this.f225d = eVar2;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        c cVar = new c(this.f224c, this.f225d, interfaceC0425c);
        cVar.f223b = obj;
        return cVar;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((InterfaceC1560u) obj, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f222a;
        C0297i c0297i = C0297i.f5732a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            O3.l.w(obj);
            return c0297i;
        }
        O3.l.w(obj);
        InterfaceC1560u interfaceC1560u = (InterfaceC1560u) this.f223b;
        e eVar = this.f225d;
        InterfaceC0430h interfaceC0430h = eVar.f229a;
        int i5 = eVar.f230b;
        if (i5 == -3) {
            i5 = -2;
        }
        z3.a aVar = eVar.f231c;
        EnumC1561v enumC1561v = EnumC1561v.f16061b;
        o3.p dVar = new d(eVar, null);
        z3.c a3 = z3.j.a(i5, aVar, 4);
        InterfaceC0430h b4 = AbstractC1562w.b(interfaceC1560u.g(), interfaceC0430h, true);
        E3.e eVar2 = AbstractC1528C.f15989a;
        if (b4 != eVar2 && b4.n(C0426d.f8816a) == null) {
            b4 = b4.f(eVar2);
        }
        z3.o oVar = new z3.o(b4, a3);
        oVar.S(enumC1561v, oVar, dVar);
        this.f222a = 1;
        Object b5 = w.b(this.f224c, oVar, true, this);
        if (b5 != enumC0441a) {
            b5 = c0297i;
        }
        return b5 == enumC0441a ? enumC0441a : c0297i;
    }
}
