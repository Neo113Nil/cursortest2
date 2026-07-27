package p0;

import java.util.ArrayList;
import java.util.List;
import z2.C1412P;

/* renamed from: p0.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0957S extends r0.C {

    /* renamed from: b, reason: collision with root package name */
    public static final C0957S f9015b = new C0957S("Undefined intrinsics block and it is required");

    @Override // p0.InterfaceC0945F
    public final InterfaceC0946G f(InterfaceC0947H interfaceC0947H, List list, long j4) {
        InterfaceC0946G t4;
        InterfaceC0946G t5;
        InterfaceC0946G t6;
        if (list.isEmpty()) {
            t6 = interfaceC0947H.t(M0.a.k(j4), M0.a.j(j4), C1412P.c(), C0955P.f9011i);
            return t6;
        }
        if (list.size() == 1) {
            AbstractC0954O a4 = ((InterfaceC0944E) list.get(0)).a(j4);
            t5 = interfaceC0947H.t(u3.d.s(j4, a4.f9005d), u3.d.r(j4, a4.f9006e), C1412P.c(), new P0.n(a4, 4));
            return t5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((InterfaceC0944E) list.get(i2)).a(j4));
        }
        int size2 = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < size2; i6++) {
            AbstractC0954O abstractC0954O = (AbstractC0954O) arrayList.get(i6);
            i4 = Math.max(abstractC0954O.f9005d, i4);
            i5 = Math.max(abstractC0954O.f9006e, i5);
        }
        t4 = interfaceC0947H.t(u3.d.s(j4, i4), u3.d.r(j4, i5), C1412P.c(), new A.S(7, arrayList));
        return t4;
    }
}
