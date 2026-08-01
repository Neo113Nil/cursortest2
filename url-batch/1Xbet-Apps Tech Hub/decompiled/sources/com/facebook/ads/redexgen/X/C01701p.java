package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01701p {
    public static byte[] A00;
    public static String[] A01 = {"kdNZsDbIr2FjUgQ6", "G4tbE8YXKkBHtbRzjHgF1iVs8BhQX3ki", "rgsd1nh14jUfY0oEDkCzVbJlkUwrdBXO", "6d8i19T6TQ9xRiUYh6SOmARBfT83lkdi", "2FsjHYpAfMpiihTdUse", "xtyrzkpFCSmXtl0pVvZtRxgukiiALNOU", "PnjWz3Ubzat8tEiN6RTB47L4MZQANY1H", "IONaBzwOxfylvpW8Ch"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[6].charAt(12) != strArr[5].charAt(12)) {
                break;
            }
            A01[2] = "wyIfRhN1EoOdsBbK5VRzuRP5Lc7uqmgb";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            byte b = (byte) ((copyOfRange[i4] - i3) - 100);
            if (A01[0].length() == 15) {
                break;
            }
            String[] strArr2 = A01;
            strArr2[3] = "fUzr4JaNgjTtoWHz8k6HkVts9HpSP1Qi";
            strArr2[1] = "zuQx1GaumRIGoFj6MrcQJkCLkICnzrhi";
            copyOfRange[i4] = b;
            i4++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A00 = new byte[]{-88, -30, -18, -25, -26};
    }

    static {
        A01();
    }

    public static void A02(YA ya, AbstractC1045aS abstractC1045aS, boolean z, InterfaceC01681n interfaceC01681n) {
        if (!IP.A1h(ya)) {
            C6Q c6q = new C6Q(ya);
            C1Z A06 = abstractC1045aS.A0v().A0D().A06();
            c6q.A0d(new C0573In(abstractC1045aS.A11(), ya.A09()));
            if (A06 == null) {
                interfaceC01681n.ACM(AdError.CACHE_ERROR);
                return;
            }
            if (A06.A0J()) {
                interfaceC01681n.ACN();
                if (A01[2].charAt(7) != '1') {
                    throw new RuntimeException();
                }
                A01[0] = "84TqyqDRqUmJCVM8";
                return;
            }
            C6M c6m = new C6M(A06.A0E(), abstractC1045aS.A0R(), abstractC1045aS.A0O());
            c6m.A04 = true;
            if (IP.A1a(ya)) {
                c6m.A03 = A00(0, 5, 22);
            }
            switch (C01671m.A00[A06.A09().ordinal()]) {
                case 1:
                case 2:
                    c6q.A0X(c6m);
                    break;
            }
            c6q.A0b(new C6O(abstractC1045aS.A0z().A01(), -1, -1, abstractC1045aS.A0R(), abstractC1045aS.A0O()));
            c6q.A0b(new C6O(A06.A0D(), -1, -1, abstractC1045aS.A0R(), abstractC1045aS.A0O()));
            c6q.A0W(new C1032aF(ya, interfaceC01681n, c6q, A06, z), new C6J(abstractC1045aS.A0R(), abstractC1045aS.A0O()));
            return;
        }
        interfaceC01681n.ACN();
    }
}
