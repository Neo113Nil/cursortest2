package F;

import java.util.ArrayList;
import java.util.List;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0885G;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;

/* renamed from: F.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095g implements InterfaceC0885G {
    public static final void c(ArrayList arrayList, f2.s sVar, InterfaceC0887I interfaceC0887I, ArrayList arrayList2, ArrayList arrayList3, f2.s sVar2, ArrayList arrayList4, f2.s sVar3, f2.s sVar4) {
        float f3 = AbstractC0107m.f1661d;
        if (!arrayList.isEmpty()) {
            sVar.f5830d = interfaceC0887I.l(f3) + sVar.f5830d;
        }
        arrayList.add(0, S1.l.a1(arrayList2));
        arrayList3.add(Integer.valueOf(sVar2.f5830d));
        arrayList4.add(Integer.valueOf(sVar.f5830d));
        sVar.f5830d += sVar2.f5830d;
        sVar3.f5830d = Math.max(sVar3.f5830d, sVar4.f5830d);
        arrayList2.clear();
        sVar4.f5830d = 0;
        sVar2.f5830d = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6 A[SYNTHETIC] */
    @Override // r0.InterfaceC0885G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0886H f(InterfaceC0887I interfaceC0887I, List list, long j3) {
        int i3;
        int i4;
        f2.s sVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        AbstractC0893O abstractC0893O;
        f2.s sVar2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        f2.s sVar3 = new f2.s();
        f2.s sVar4 = new f2.s();
        ArrayList arrayList6 = new ArrayList();
        f2.s sVar5 = new f2.s();
        f2.s sVar6 = new f2.s();
        int size = list.size();
        int i5 = 0;
        while (i5 < size) {
            AbstractC0893O b3 = ((InterfaceC0884F) list.get(i5)).b(j3);
            boolean isEmpty = arrayList6.isEmpty();
            f2.s sVar7 = sVar3;
            float f3 = AbstractC0107m.f1660c;
            if (isEmpty) {
                i3 = i5;
                i4 = size;
                sVar = sVar5;
                arrayList = arrayList3;
                arrayList2 = arrayList5;
                abstractC0893O = b3;
            } else {
                if (interfaceC0887I.l(f3) + sVar5.f5830d + b3.f8126d <= O0.a.h(j3)) {
                    i4 = size;
                    sVar = sVar5;
                    arrayList = arrayList3;
                    arrayList2 = arrayList5;
                    abstractC0893O = b3;
                    i3 = i5;
                } else {
                    float f4 = AbstractC0107m.f1658a;
                    ArrayList arrayList7 = arrayList3;
                    arrayList = arrayList3;
                    abstractC0893O = b3;
                    i3 = i5;
                    i4 = size;
                    ArrayList arrayList8 = arrayList5;
                    arrayList2 = arrayList5;
                    sVar2 = sVar6;
                    sVar = sVar5;
                    c(arrayList7, sVar4, interfaceC0887I, arrayList6, arrayList4, sVar6, arrayList8, sVar7, sVar5);
                    sVar5 = sVar;
                    if (arrayList6.isEmpty()) {
                        sVar5.f5830d = interfaceC0887I.l(f3) + sVar5.f5830d;
                    }
                    arrayList6.add(abstractC0893O);
                    sVar5.f5830d += abstractC0893O.f8126d;
                    sVar2.f5830d = Math.max(sVar2.f5830d, abstractC0893O.f8127e);
                    i5 = i3 + 1;
                    sVar6 = sVar2;
                    sVar3 = sVar7;
                    arrayList3 = arrayList;
                    size = i4;
                    arrayList5 = arrayList2;
                }
            }
            sVar2 = sVar6;
            sVar5 = sVar;
            if (arrayList6.isEmpty()) {
            }
            arrayList6.add(abstractC0893O);
            sVar5.f5830d += abstractC0893O.f8126d;
            sVar2.f5830d = Math.max(sVar2.f5830d, abstractC0893O.f8127e);
            i5 = i3 + 1;
            sVar6 = sVar2;
            sVar3 = sVar7;
            arrayList3 = arrayList;
            size = i4;
            arrayList5 = arrayList2;
        }
        ArrayList arrayList9 = arrayList3;
        ArrayList arrayList10 = arrayList5;
        f2.s sVar8 = sVar3;
        f2.s sVar9 = sVar6;
        if (!arrayList6.isEmpty()) {
            float f5 = AbstractC0107m.f1658a;
            c(arrayList9, sVar4, interfaceC0887I, arrayList6, arrayList4, sVar9, arrayList10, sVar8, sVar5);
        }
        int max = Math.max(sVar8.f5830d, O0.a.j(j3));
        int max2 = Math.max(sVar4.f5830d, O0.a.i(j3));
        float f6 = AbstractC0107m.f1658a;
        return interfaceC0887I.i0(max, max2, S1.v.f4321d, new C0093f(arrayList9, interfaceC0887I, max, arrayList10));
    }
}
