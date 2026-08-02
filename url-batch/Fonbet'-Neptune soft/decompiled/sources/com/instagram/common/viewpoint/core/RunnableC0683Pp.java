package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Pp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0683Pp implements Runnable {
    public final /* synthetic */ C02036j A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC0683Pp(C02036j c02036j, ArrayList arrayList) {
        this.A00 = c02036j;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AbstractC0700Qg holder = (AbstractC0700Qg) it.next();
            this.A00.A0d(holder);
        }
        this.A01.clear();
        this.A00.A01.remove(this.A01);
    }
}
