package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Po, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0688Po implements Runnable {
    public final /* synthetic */ C02096j A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC0688Po(C02096j c02096j, ArrayList arrayList) {
        this.A00 = c02096j;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C0695Pv change = (C0695Pv) it.next();
            this.A00.A0c(change);
        }
        this.A01.clear();
        this.A00.A03.remove(this.A01);
    }
}
