package r0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: r0.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0896S extends t0.B {

    /* renamed from: b, reason: collision with root package name */
    public static final C0896S f8136b = new C0896S("Undefined intrinsics block and it is required");

    @Override // r0.InterfaceC0885G
    public final InterfaceC0886H f(InterfaceC0887I interfaceC0887I, List list, long j3) {
        boolean isEmpty = list.isEmpty();
        S1.v vVar = S1.v.f4321d;
        if (isEmpty) {
            return interfaceC0887I.i0(O0.a.j(j3), O0.a.i(j3), vVar, C0894P.f8132g);
        }
        if (list.size() == 1) {
            AbstractC0893O b3 = ((InterfaceC0884F) list.get(0)).b(j3);
            return interfaceC0887I.i0(O2.d.D(j3, b3.f8126d), O2.d.C(j3, b3.f8127e), vVar, new A.i(b3, 11));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((InterfaceC0884F) list.get(i3)).b(j3));
        }
        int size2 = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < size2; i6++) {
            AbstractC0893O abstractC0893O = (AbstractC0893O) arrayList.get(i6);
            i4 = Math.max(abstractC0893O.f8126d, i4);
            i5 = Math.max(abstractC0893O.f8127e, i5);
        }
        return interfaceC0887I.i0(O2.d.D(j3, i4), O2.d.C(j3, i5), vVar, new B.Q(4, arrayList));
    }
}
