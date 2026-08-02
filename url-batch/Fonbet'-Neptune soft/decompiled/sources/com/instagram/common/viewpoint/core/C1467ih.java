package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.ih, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1467ih extends AbstractRunnableC0840Vt {
    public static byte[] A02;
    public final /* synthetic */ MW A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{117, 97, 118, 98, 102, 118, 125, 112, 106, 76, 112, 114, 99, 99, 122, 125, 116};
    }

    public C1467ih(MW mw, JSONObject jSONObject) {
        this.A00 = mw;
        this.A01 = jSONObject;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        SQ sq;
        SQ sq2;
        CountDownLatch countDownLatch;
        MV mv;
        MV mv2;
        CountDownLatch countDownLatch2;
        try {
            countDownLatch = this.A00.A05;
            countDownLatch.await();
            mv = this.A00.A02;
            synchronized (mv) {
                mv2 = this.A00.A02;
                mv2.A0B(this.A01);
                countDownLatch2 = this.A00.A06;
                countDownLatch2.countDown();
            }
        } catch (InterruptedException e) {
            sq2 = this.A00.A03;
            sq2.A08().AAy(A00(0, 17, 25), AbstractC0766Sv.A1B, new C0767Sw(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            sq = this.A00.A03;
            sq.A08().AAy(A00(0, 17, 25), AbstractC0766Sv.A1A, new C0767Sw(e2));
        }
    }
}
