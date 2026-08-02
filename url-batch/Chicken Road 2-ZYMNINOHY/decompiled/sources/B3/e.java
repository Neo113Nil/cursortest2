package B3;

import a.AbstractC0124a;
import c3.C0297i;
import f3.C0431i;
import f3.InterfaceC0425c;
import f3.InterfaceC0430h;
import g3.EnumC0441a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0430h f229a;

    /* renamed from: b, reason: collision with root package name */
    public final int f230b;

    /* renamed from: c, reason: collision with root package name */
    public final z3.a f231c;

    public e(InterfaceC0430h interfaceC0430h, int i4, z3.a aVar) {
        this.f229a = interfaceC0430h;
        this.f230b = i4;
        this.f231c = aVar;
    }

    public abstract Object a(z3.p pVar, InterfaceC0425c interfaceC0425c);

    @Override // A3.d
    public Object collect(A3.e eVar, InterfaceC0425c interfaceC0425c) {
        c cVar = new c(eVar, this, null);
        C3.s sVar = new C3.s(interfaceC0425c, interfaceC0425c.getContext());
        Object P4 = AbstractC0124a.P(sVar, sVar, cVar);
        return P4 == EnumC0441a.f9038a ? P4 : C0297i.f5732a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        C0431i c0431i = C0431i.f8817a;
        InterfaceC0430h interfaceC0430h = this.f229a;
        if (interfaceC0430h != c0431i) {
            arrayList.add("context=" + interfaceC0430h);
        }
        int i4 = this.f230b;
        if (i4 != -3) {
            arrayList.add("capacity=" + i4);
        }
        z3.a aVar = z3.a.f16290a;
        z3.a aVar2 = this.f231c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + d3.i.g0(arrayList, ", ", null, null, null, 62) + ']';
    }
}
