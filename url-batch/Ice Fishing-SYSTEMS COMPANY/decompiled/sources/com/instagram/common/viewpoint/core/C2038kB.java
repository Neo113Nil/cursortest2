package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.kB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2038kB extends AbstractRunnableC1326Wc {
    public static byte[] A02;
    public final /* synthetic */ N8 A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 55);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-77, -65, -78, -66, -62, -78, -69, -80, -58, -84, -80, -82, -67, -67, -74, -69, -76};
    }

    public C2038kB(N8 n82, String str) {
        this.A00 = n82;
        this.A01 = str;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        T8 t82;
        T8 t83;
        CountDownLatch countDownLatch;
        N7 n72;
        N7 n73;
        N7 n74;
        boolean A0J;
        N7 n75;
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            n72 = this.A00.A02;
            synchronized (n72) {
                n73 = this.A00.A02;
                Iterator<String> keys = n73.A05().keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    A0J = this.A00.A0J(this.A01);
                    if (A0J) {
                        N8 n82 = this.A00;
                        n75 = this.A00.A02;
                        n82.A0E((C1102Nf) n75.A05().get(next), next, next.equals(this.A01));
                    }
                }
                n74 = this.A00.A02;
                n74.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e6) {
            t83 = this.A00.A03;
            InterfaceC1250Tc A08 = t83.A08();
            String encryptedId = A00(0, 17, 22);
            A08.ABC(encryptedId, AbstractC1251Td.A1B, new C1252Te(e6));
        } catch (JSONException e9) {
            this.A00.A0M();
            t82 = this.A00.A03;
            InterfaceC1250Tc A082 = t82.A08();
            String encryptedId2 = A00(0, 17, 22);
            A082.ABC(encryptedId2, AbstractC1251Td.A1A, new C1252Te(e9));
        }
    }
}
