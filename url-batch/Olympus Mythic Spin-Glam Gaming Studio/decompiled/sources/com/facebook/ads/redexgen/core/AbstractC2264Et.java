package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Et, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2264Et {
    public static String[] A00 = {"94gd2lHaz6driogpt3Nl1tWsjXgriMxS", "VA5F17cuoV6wg6So0a0DluDefxsQAbFW", "BZfou2TK48MMfd1yJcRZTZ4JcnnWlmHT", "ilV1kn3efEuJyycOIV0UyN70TAMLymqY", "v19hT7CAJaCb1rntEZC2LQpyBVrX3IkZ", "rkpPVUKbY", "FKwb9S", "XsKsPoEAnPyrLBiotdeURrQ5Q46xoiIz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C3733pY A01(C2259Eo c2259Eo, List<? extends InterfaceC2261Eq>[] listArr) {
        C2K c2k = new C2K();
        int i = 0;
        loop0: while (true) {
            boolean z = false;
            if (i >= c2259Eo.A02()) {
                C3608nW A06 = c2259Eo.A06();
                for (int i2 = 0; i2 < A06.A01; i2++) {
                    C3741pg A05 = A06.A05(i2);
                    int[] iArr = new int[A05.A01];
                    Arrays.fill(iArr, 0);
                    c2k.A04(new C3734pZ(A05, false, iArr, new boolean[A05.A01]));
                }
                return new C3733pY(c2k.A05());
            }
            C3608nW A07 = c2259Eo.A07(i);
            List<? extends InterfaceC2261Eq> list = listArr[i];
            int i3 = 0;
            while (i3 < A07.A01) {
                C3741pg A052 = A07.A05(i3);
                int A053 = c2259Eo.A05(i, i3, z);
                String[] strArr = A00;
                if (strArr[7].charAt(11) != strArr[0].charAt(11)) {
                    break loop0;
                }
                String[] strArr2 = A00;
                strArr2[7] = "wVGS7RX5kLdrLFKtRIe7uQsNtd1z6IxW";
                strArr2[0] = "7aERijPLyLRrdgSw5lQfoyda5cW2h3c0";
                boolean z2 = A053 != 0;
                int[] iArr2 = new int[A052.A01];
                boolean[] zArr = new boolean[A052.A01];
                for (int i4 = 0; i4 < A052.A01; i4++) {
                    iArr2[i4] = c2259Eo.A04(i, i3, i4);
                    boolean z3 = false;
                    if (A00[5].length() != 9) {
                        break loop0;
                    }
                    String[] strArr3 = A00;
                    strArr3[2] = "3DHxmUKuGZITV4091m9MLUNqu1ZkNm0q";
                    strArr3[3] = "2BQZhu0LL1SbQMNt9wHOkoks63NLimX3";
                    int i5 = 0;
                    while (true) {
                        if (i5 < list.size()) {
                            InterfaceC2261Eq interfaceC2261Eq = list.get(i5);
                            if (interfaceC2261Eq.A9L().equals(A052) && interfaceC2261Eq.AA6(i4) != -1) {
                                z3 = true;
                                break;
                            }
                            i5++;
                        }
                    }
                    zArr[i4] = z3;
                }
                c2k.A04(new C3734pZ(A052, z2, iArr2, zArr));
                i3++;
                z = false;
            }
            i++;
        }
        throw new RuntimeException();
    }

    public static C3733pY A00(C2259Eo c2259Eo, InterfaceC2261Eq[] interfaceC2261EqArr) {
        List A01;
        List[] listArr = new List[interfaceC2261EqArr.length];
        for (int i = 0; i < interfaceC2261EqArr.length; i++) {
            InterfaceC2261Eq interfaceC2261Eq = interfaceC2261EqArr[i];
            if (interfaceC2261Eq != null) {
                A01 = BP.A04(interfaceC2261Eq);
            } else {
                A01 = MetaExoPlayerCustomizedCollections.A01();
            }
            listArr[i] = A01;
        }
        return A01(c2259Eo, listArr);
    }
}
