package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.ie, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1472ie extends AbstractRunnableC0846Vt {
    public static byte[] A02;
    public final /* synthetic */ MW A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{36, 48, 39, 51, 55, 39, 44, 33, 59, Ascii.GS, 33, 35, 50, 50, 43, 44, 37};
    }

    public C1472ie(MW mw, String str) {
        this.A00 = mw;
        this.A01 = str;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        SQ sq;
        SQ sq2;
        CountDownLatch countDownLatch;
        boolean A0J;
        MV mv;
        MV mv2;
        MV mv3;
        String A00 = A00(0, 17, 81);
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            A0J = this.A00.A0J(this.A01);
            if (A0J) {
                mv = this.A00.A02;
                ((N2) mv.A05().get(this.A01)).A04((int) (System.currentTimeMillis() / 1000));
                mv2 = this.A00.A02;
                mv2.A07(this.A01);
                mv3 = this.A00.A02;
                mv3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e) {
            sq2 = this.A00.A03;
            sq2.A08().AAy(A00, AbstractC0772Sv.A1B, new C0773Sw(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            sq = this.A00.A03;
            sq.A08().AAy(A00, AbstractC0772Sv.A1A, new C0773Sw(e2));
        }
    }
}
