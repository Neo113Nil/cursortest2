package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: assets/audience_network.dex */
public class A9 implements InterfaceC1878pp {
    public final /* synthetic */ A8 A00;

    public A9(A8 a8) {
        this.A00 = a8;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1878pp
    public final void AF8() {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        InterfaceC1878pp interfaceC1878pp;
        InterfaceC1878pp interfaceC1878pp2;
        linkedHashMap = this.A00.A06;
        synchronized (linkedHashMap) {
            linkedHashMap2 = this.A00.A06;
            arrayList = new ArrayList(linkedHashMap2.size());
            linkedHashMap3 = this.A00.A06;
            for (Runnable runnable : linkedHashMap3.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            linkedHashMap4 = this.A00.A06;
            linkedHashMap4.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        interfaceC1878pp = this.A00.A01;
        if (interfaceC1878pp != null) {
            interfaceC1878pp2 = this.A00.A01;
            interfaceC1878pp2.AF8();
        }
    }
}
