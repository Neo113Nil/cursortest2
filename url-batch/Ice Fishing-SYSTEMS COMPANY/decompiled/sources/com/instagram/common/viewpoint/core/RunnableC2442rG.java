package com.instagram.common.viewpoint.core;

import android.os.Handler;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.rG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2442rG implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2441rF A01;
    public final /* synthetic */ Exception A02;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{58, 56, 41, 25, 56, 49, 60, 36};
    }

    public RunnableC2442rG(C2441rF c2441rF, int i, Exception exc) {
        this.A01 = c2441rF;
        this.A00 = i;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        InterfaceC1895hc interfaceC1895hc;
        Handler handler;
        Runnable runnable;
        boolean A0B;
        if (WU.A02(this)) {
            return;
        }
        try {
            try {
                z8 = this.A01.A01;
                if (z8) {
                    if (C0779Ao.A07) {
                        A0B = this.A01.A0B();
                        if (A0B) {
                            this.A01.A0F();
                            return;
                        }
                    }
                    C2441rF c2441rF = this.A01;
                    interfaceC1895hc = this.A01.A05;
                    c2441rF.A08(interfaceC1895hc.ACf());
                    C2441rF.A03(this.A01);
                    if (0 == 0) {
                        int delay = this.A00;
                        handler = this.A01.A04;
                        runnable = this.A01.A0C;
                        handler.postDelayed(runnable, delay);
                        return;
                    }
                    C2441rF.A03(this.A01);
                    throw new NullPointerException(A00(0, 8, 12));
                }
            } catch (Exception ex) {
                ex.initCause(this.A02);
                throw ex;
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
