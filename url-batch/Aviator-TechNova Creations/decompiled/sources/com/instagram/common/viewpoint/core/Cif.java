package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.if, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class Cif extends AbstractRunnableC0846Vt {
    public static byte[] A02;
    public final /* synthetic */ MW A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 55);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-77, -65, -78, -66, -62, -78, -69, -80, -58, -84, -80, -82, -67, -67, -74, -69, -76};
    }

    public Cif(MW mw, String str) {
        this.A00 = mw;
        this.A01 = str;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        SQ sq;
        SQ sq2;
        CountDownLatch countDownLatch;
        MV mv;
        MV mv2;
        MV mv3;
        boolean A0J;
        MV mv4;
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            mv = this.A00.A02;
            synchronized (mv) {
                mv2 = this.A00.A02;
                Iterator<String> keys = mv2.A05().keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    A0J = this.A00.A0J(this.A01);
                    if (A0J) {
                        MW mw = this.A00;
                        mv4 = this.A00.A02;
                        mw.A0E((N2) mv4.A05().get(next), next, next.equals(this.A01));
                    }
                }
                mv3 = this.A00.A02;
                mv3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e) {
            sq2 = this.A00.A03;
            InterfaceC0771Su A08 = sq2.A08();
            String encryptedId = A00(0, 17, 22);
            A08.AAy(encryptedId, AbstractC0772Sv.A1B, new C0773Sw(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            sq = this.A00.A03;
            InterfaceC0771Su A082 = sq.A08();
            String encryptedId2 = A00(0, 17, 22);
            A082.AAy(encryptedId2, AbstractC0772Sv.A1A, new C0773Sw(e2));
        }
    }
}
