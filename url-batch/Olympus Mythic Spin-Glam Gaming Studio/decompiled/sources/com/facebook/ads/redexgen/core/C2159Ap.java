package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ap, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2159Ap implements InterfaceC3822rI {
    public final /* synthetic */ C2158Ao A00;

    public C2159Ap(C2158Ao c2158Ao) {
        this.A00 = c2158Ao;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3822rI
    public final void AFq() {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        InterfaceC3822rI interfaceC3822rI;
        InterfaceC3822rI interfaceC3822rI2;
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
        interfaceC3822rI = this.A00.A01;
        if (interfaceC3822rI != null) {
            interfaceC3822rI2 = this.A00.A01;
            interfaceC3822rI2.AFq();
        }
    }
}
