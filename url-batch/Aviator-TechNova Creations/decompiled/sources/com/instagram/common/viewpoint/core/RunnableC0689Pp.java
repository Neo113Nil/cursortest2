package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Pp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0689Pp implements Runnable {
    public final /* synthetic */ C02096j A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC0689Pp(C02096j c02096j, ArrayList arrayList) {
        this.A00 = c02096j;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AbstractC0706Qg holder = (AbstractC0706Qg) it.next();
            this.A00.A0d(holder);
        }
        this.A01.clear();
        this.A00.A01.remove(this.A01);
    }
}
