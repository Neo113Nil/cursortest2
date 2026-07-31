package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.7g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C20887g extends AbstractC3353j0 {
    public static byte[] A00;
    public static String[] A01 = {"5V5lzA70kRKZvNcqBnXwT00Z041t6ONl", "kRuh8LYE7MIIox", "vbi5lrus1TtIcXopJBSqGum5Kl452Sg0", "JcNQ6WafPgnmx1aBDePIhrwzaceROyrU", "60x4BO5hhvvMWgz", "65jgyaanPJJ2TdYJaJc79ygQBnrUrWFq", "zOX7nuTxFizV3LeqTcyyEc2wd", "PvIxiwPRiyIOar7lINjn4bFuW"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{42, 47, 107, 34, 56, 107, 37, 36, 63, 107, 57, 46, 42, 47, 50, 107, 36, 57, 107, 42, 39, 57, 46, 42, 47, 50, 107, 47, 34, 56, 59, 39, 42, 50, 46, 47, 20, 21, 28, 17, 9};
    }

    static {
        A03();
    }

    public C20887g(C3218gi c3218gi, O7 o7) {
        super(c3218gi, o7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(36, 5, 12), String.valueOf(System.currentTimeMillis() - j));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> trackingUrls, Map<String, String> extraData) {
        if (trackingUrls != null) {
            boolean isEmpty = trackingUrls.isEmpty();
            if (A01[3].charAt(25) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "86KHDrV9NKgfIZAVdUdv4tP2w";
            strArr[7] = "hnWt117Y9rLxZfnYOmFuZ36IL";
            if (isEmpty) {
                return;
            }
            Iterator<String> it = trackingUrls.iterator();
            while (it.hasNext()) {
                new AsyncTaskC3189gF(this.A0B, extraData).execute(it.next());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3353j0
    public final void A0P() {
        C3400ju c3400ju = (C3400ju) this.A01;
        if (c3400ju.A0R()) {
            N2 n2 = this.A07;
            if (A01[3].charAt(25) != 'c') {
                throw new RuntimeException();
            }
            A01[4] = "SmlVqZ";
            if (n2 != null) {
                this.A07.A0B(c3400ju);
                return;
            }
            return;
        }
        throw new IllegalStateException(A00(0, 36, 55));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3353j0
    public final void A0R(N1 n1, C2649Tw c2649Tw, C2647Tu c2647Tu, O8 o8) {
        C3400ju c3400ju = (C3400ju) n1;
        long currentTimeMillis = System.currentTimeMillis();
        C3350ix c3350ix = new C3350ix(this, o8, c3400ju, currentTimeMillis, c2647Tu);
        A0H().postDelayed(c3350ix, c2649Tw.A05().A05());
        c3400ju.A0L(this.A0B, new C3349iw(this, c3350ix, currentTimeMillis, c2647Tu), this.A09, o8, UK.A0K());
    }
}
