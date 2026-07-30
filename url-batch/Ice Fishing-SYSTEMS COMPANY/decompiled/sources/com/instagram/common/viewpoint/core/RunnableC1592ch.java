package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ch, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1592ch implements Runnable {
    public final /* synthetic */ C1002Ji A00;

    public RunnableC1592ch(C1002Ji c1002Ji) {
        this.A00 = c1002Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1516bT c1516bT;
        C1516bT c1516bT2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c1516bT = this.A00.A09;
            if (c1516bT != null && this.A00.getResources().getConfiguration().orientation == 1) {
                c1516bT2 = this.A00.A09;
                c1516bT2.A0A();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
