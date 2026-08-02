package x2;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final d2.h f10779a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10780b;

    /* renamed from: c, reason: collision with root package name */
    public final v2.a f10781c;

    public e(d2.h hVar, int i3, v2.a aVar) {
        this.f10779a = hVar;
        this.f10780b = i3;
        this.f10781c = aVar;
    }

    public abstract Object a(v2.p pVar, InterfaceC0300c interfaceC0300c);

    public abstract e b(d2.h hVar, int i3, v2.a aVar);

    @Override // x2.i
    public final w2.d i(d2.h hVar, int i3, v2.a aVar) {
        d2.h hVar2 = this.f10779a;
        d2.h i4 = hVar.i(hVar2);
        v2.a aVar2 = v2.a.f10571a;
        v2.a aVar3 = this.f10781c;
        int i5 = this.f10780b;
        if (aVar == aVar2) {
            if (i5 != -3) {
                if (i3 != -3) {
                    if (i5 != -2) {
                        if (i3 != -2) {
                            i3 += i5;
                            if (i3 < 0) {
                                i3 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i3 = i5;
            }
            aVar = aVar3;
        }
        return (kotlin.jvm.internal.j.a(i4, hVar2) && i3 == i5 && aVar == aVar3) ? this : b(i4, i3, aVar);
    }

    @Override // w2.d
    public Object n(w2.e eVar, InterfaceC0300c interfaceC0300c) {
        c cVar = new c(eVar, this, null);
        y2.s sVar = new y2.s(interfaceC0300c, interfaceC0300c.getContext());
        Object I2 = C2.b.I(sVar, sVar, cVar);
        return I2 == EnumC0317a.f4969a ? I2 : C0195i.f2555a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        d2.i iVar = d2.i.f4951a;
        d2.h hVar = this.f10779a;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i3 = this.f10780b;
        if (i3 != -3) {
            arrayList.add("capacity=" + i3);
        }
        v2.a aVar = v2.a.f10571a;
        v2.a aVar2 = this.f10781c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + c2.e.S(arrayList, ", ", null, null, null, 62) + ']';
    }
}
