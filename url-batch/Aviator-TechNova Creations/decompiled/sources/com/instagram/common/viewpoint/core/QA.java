package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class QA implements Runnable {
    public final /* synthetic */ C02066g A00;

    public QA(C02066g c02066g) {
        this.A00 = c02066g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A00.A05 != null) {
            this.A00.A05.A0I();
        }
        this.A00.A0K = false;
    }
}
