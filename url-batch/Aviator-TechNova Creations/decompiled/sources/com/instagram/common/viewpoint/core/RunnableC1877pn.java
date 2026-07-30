package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.pn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1877pn implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1876pm A01;
    public final /* synthetic */ Exception A02;

    public RunnableC1877pn(C1876pm c1876pm, int i, Exception exc) {
        this.A01 = c1876pm;
        this.A00 = i;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        InterfaceC1341gK interfaceC1341gK;
        Handler handler;
        Runnable runnable;
        boolean A08;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            try {
                z = this.A01.A01;
                if (z) {
                    if (A8.A07) {
                        A08 = this.A01.A08();
                        if (A08) {
                            this.A01.A0C();
                            return;
                        }
                    }
                    C1876pm c1876pm = this.A01;
                    interfaceC1341gK = this.A01.A05;
                    c1876pm.A05(interfaceC1341gK.AC6());
                    handler = this.A01.A04;
                    runnable = this.A01.A0A;
                    handler.postDelayed(runnable, this.A00);
                }
            } catch (Exception ex) {
                ex.initCause(this.A02);
                throw ex;
            }
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
