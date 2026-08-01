package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.ar, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1070ar extends K8 {
    public static byte[] A02;
    public static String[] A03 = {"CdCLIQRd", "Gozok8EGiq89CC7S8QZsNr", "pl5lQHAXyLio1ost", "M44cRouQCRL7K0vypo2P04DU", "Y2GzUIW8g3L", "Bs9wehYqNd3BdGUVOwkaAN", "ajmsB695tQiR2xtfKUGvlSwazulcZzs7", "Sy9bhDNhoUd7kDt0yrvFBLns12VVbk64"};
    public final /* synthetic */ C01500v A00;
    public final /* synthetic */ String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 47;
            if (A03[6].charAt(27) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "CuQnTMvQt2iEBPylhK7T15";
            strArr[1] = "FSZFy24WJ9CShZHmahty6u";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        if (A03[6].charAt(27) != 'c') {
            throw new RuntimeException();
        }
        A03[3] = "LuOw";
        A02 = new byte[]{-99, -87, -100, -88, -84, -100, -91, -102, -80, -106, -102, -104, -89, -89, -96, -91, -98};
    }

    static {
        A02();
    }

    public C1070ar(C01500v c01500v, String str) {
        this.A00 = c01500v;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        C7S c7s;
        C7S c7s2;
        CountDownLatch countDownLatch;
        C01490u c01490u;
        C01490u c01490u2;
        C01490u c01490u3;
        boolean A0J;
        C01490u c01490u4;
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            c01490u = this.A00.A02;
            synchronized (c01490u) {
                c01490u2 = this.A00.A02;
                Iterator<String> keys = c01490u2.A05().keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    A0J = this.A00.A0J(this.A01);
                    if (A0J) {
                        C01500v c01500v = this.A00;
                        c01490u4 = c01500v.A02;
                        c01500v.A0E((C1Q) c01490u4.A05().get(next), next, next.equals(this.A01));
                    }
                }
                c01490u3 = this.A00.A02;
                c01490u3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e) {
            c7s2 = this.A00.A03;
            InterfaceC03197w A07 = c7s2.A07();
            String encryptedId = A00(0, 17, 8);
            A07.A9M(encryptedId, C03207x.A1B, new C03217y(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            c7s = this.A00.A03;
            InterfaceC03197w A072 = c7s.A07();
            String encryptedId2 = A00(0, 17, 8);
            A072.A9M(encryptedId2, C03207x.A1A, new C03217y(e2));
        }
    }
}
