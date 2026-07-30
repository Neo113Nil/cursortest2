package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Pn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0687Pn implements Runnable {
    public final /* synthetic */ C02096j A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC0687Pn(C02096j c02096j, ArrayList arrayList) {
        this.A00 = c02096j;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C0696Pw c0696Pw = (C0696Pw) it.next();
            this.A00.A0e(c0696Pw.A04, c0696Pw.A00, c0696Pw.A01, c0696Pw.A02, c0696Pw.A03);
        }
        this.A01.clear();
        this.A00.A05.remove(this.A01);
    }
}
