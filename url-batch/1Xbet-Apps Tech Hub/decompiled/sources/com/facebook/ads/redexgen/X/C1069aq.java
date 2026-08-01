package com.facebook.ads.redexgen.X;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.aq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1069aq extends K8 {
    public static byte[] A02;
    public static String[] A03 = {"oskFp91e5pmXbfqncEKHUOJlooKh56jY", "lReJ4EGI0ZfzcS4beAfFSCPJefxJWm51", "X9zy5AMUM8AKtatrcfePQZWL0uWUICrn", "wxwSRA3odXIdIsY7f5yZfv3v7", "O6Pxh8VVn00f1EJnP312TgPdEktEk3X8", "2QJh3yF6", "0YwPA87fpumxZ406JTpoKHsZ368w", "aJIZZEX98MAeULDgBorQq277OQTM9IaN"};
    public final /* synthetic */ C01500v A00;
    public final /* synthetic */ String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 67);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {Ascii.GS, 41, Ascii.FS, 40, 44, Ascii.FS, 37, Ascii.SUB, 48, Ascii.SYN, Ascii.SUB, Ascii.CAN, 39, 39, 32, 37, Ascii.RS};
        String[] strArr = A03;
        if (strArr[2].charAt(10) != strArr[7].charAt(10)) {
            throw new RuntimeException();
        }
        A03[5] = "QkfkB";
        A02 = bArr;
    }

    static {
        A02();
    }

    public C1069aq(C01500v c01500v, String str) {
        this.A00 = c01500v;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        C7S c7s;
        C7S c7s2;
        CountDownLatch countDownLatch;
        boolean A0J;
        C01490u c01490u;
        C01490u c01490u2;
        C01490u c01490u3;
        String A00 = A00(0, 17, 116);
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            A0J = this.A00.A0J(this.A01);
            if (A0J) {
                c01490u = this.A00.A02;
                ((C1Q) c01490u.A05().get(this.A01)).A04((int) (System.currentTimeMillis() / 1000));
                c01490u2 = this.A00.A02;
                c01490u2.A07(this.A01);
                c01490u3 = this.A00.A02;
                c01490u3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e) {
            c7s2 = this.A00.A03;
            c7s2.A07().A9M(A00, C03207x.A1B, new C03217y(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            c7s = this.A00.A03;
            c7s.A07().A9M(A00, C03207x.A1A, new C03217y(e2));
        }
    }
}
