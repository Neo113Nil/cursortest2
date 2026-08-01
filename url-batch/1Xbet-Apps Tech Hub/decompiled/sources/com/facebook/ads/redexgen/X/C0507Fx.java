package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Fx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0507Fx implements InterfaceC1109bb {
    public final /* synthetic */ C1108ba A00;

    public C0507Fx(C1108ba c1108ba) {
        this.A00 = c1108ba;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1109bb
    public final void ACr() {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        InterfaceC1109bb interfaceC1109bb;
        InterfaceC1109bb interfaceC1109bb2;
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
        interfaceC1109bb = this.A00.A01;
        if (interfaceC1109bb == null) {
            return;
        }
        interfaceC1109bb2 = this.A00.A01;
        interfaceC1109bb2.ACr();
    }
}
