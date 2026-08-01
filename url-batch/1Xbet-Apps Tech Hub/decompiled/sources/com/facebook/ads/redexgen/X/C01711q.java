package com.facebook.ads.redexgen.X;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.1q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01711q {
    public static byte[] A00;
    public static String[] A01 = {"SZD1gnuwYC0ZDT5XCpN5wGg04vpvlXtv", "38Pkme0hctlwOycqXgIFmSt4EwGMsPu", "PZ5YSJhnqoOlFoXIJ", "MKZOkal4amZt32sY0duMnYWyMVrdvNv7", "PmMqC", "MtvBWYcgrX5nN2Ecp9gb0xGXALHF8kJ8", "836OSMulKGxVhnpon", "Ud77gBKi5ZcurXFgX0oEk2YfAMQgAhDP"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Ascii.EM, 95, 67, 90, 91, 103, 96, 122, 107, 124, 125, 122, 103, 122, 103, 111, 98, 3, Ascii.DC4, 6, 16, 3, Ascii.NAK, Ascii.DC4, Ascii.NAK, 46, 7, Ascii.CAN, Ascii.NAK, Ascii.DC4, Ascii.RS};
    }

    static {
        A01();
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x00d7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A02(YA ya, C6Q c6q, C0482Ey c0482Ey) {
        c6q.A0c(new C6O(c0482Ey.A0z().A01(), PB.A04, PB.A04, c0482Ey.A0R(), A00(17, 14, 99)));
        boolean A0k = c0482Ey.A0k();
        if (A0k) {
            C6M c6m = new C6M(c0482Ey.A0L(), c0482Ey.A0R(), A00(17, 14, 99));
            c6m.A04 = true;
            c6m.A03 = A00(0, 5, 37);
            c6q.A0X(c6m);
        }
        boolean isDSL = QJ.A03();
        boolean A2N = IP.A2N(ya, isDSL);
        C6M c6m2 = new C6M(c0482Ey.A0v().A0D().A08(), c0482Ey.A0R(), A00(17, 14, 99), c0482Ey.A0v().A0D().A05());
        if (A0k && !A2N) {
            c6q.A0X(c6m2);
        } else {
            c6q.A0a(c6m2);
        }
        c6q.A0c(new C6O(c0482Ey.A0v().A0D().A07(), C01661l.A00(c0482Ey.A0v().A0D()), C01661l.A01(c0482Ey.A0v().A0D()), c0482Ey.A0R(), A00(17, 14, 99)));
        Iterator<String> it = c0482Ey.A0v().A0G().A01().iterator();
        while (isDSL) {
            String url = it.next();
            c6q.A0c(new C6O(url, -1, -1, c0482Ey.A0R(), A00(17, 14, 99)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a4, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.A0D().A08()) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a6, code lost:
    
        new com.facebook.ads.redexgen.X.C6M(r0.A0D().A08(), r15.A0R(), A00(5, 12, 28), r0.A0D().A05()).A04 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cb, code lost:
    
        r7 = r7 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A03(YA ya, C6Q c6q, C0482Ey c0482Ey) {
        int i = 0;
        Iterator<C1D> it = c0482Ey.A13().iterator();
        while (it.hasNext()) {
            C1D next = it.next();
            C6O c6o = new C6O(next.A0D().A07(), C01661l.A00(next.A0D()), C01661l.A01(next.A0D()), c0482Ey.A0R(), A00(5, 12, 28));
            if (i == 0) {
                c6q.A0b(c6o);
            } else {
                c6q.A0c(c6o);
            }
            Iterator<String> it2 = next.A0G().A01().iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                String[] strArr = A01;
                if (strArr[2].length() == strArr[6].length()) {
                    String[] strArr2 = A01;
                    strArr2[0] = "d4OGgqInyGax2uUwuJ6rocUy9OK0g6RJ";
                    strArr2[7] = "8ZRzgNChvbJeQD0ONiajCC1PQNrhJWUQ";
                    if (!hasNext) {
                        break;
                    } else {
                        c6q.A0c(new C6O(it2.next(), -1, -1, c0482Ey.A0R(), A00(5, 12, 28)));
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
    }
}
