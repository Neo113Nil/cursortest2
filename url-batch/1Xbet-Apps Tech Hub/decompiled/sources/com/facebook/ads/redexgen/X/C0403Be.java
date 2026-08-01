package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.InternalFrame;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.Be, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0403Be {
    public static byte[] A02;
    public static String[] A03 = {"I7u5SMwnia1LjR8q2dDSZ1ZxyvAUDNjZ", "lA52iG6YY0NJNsRtQCweAmt1bj2X", "2qXiYNq9KlAFUySgaSTQYzQ4aWQihc1C", "j3GaPat5F4JzB2k2u38FDmanRSccFQ7x", "Rgx4knYMi3WRjmVXMYvkXYj", "jdUpLioS3ej7GnR7zzwjeYlHhGFO", "z8YFUav71iIZ039OmPtsZmkN2j2dK8kW", "CjGTtkLliNi5lySdeHdx4jpczrbS9nvg"};
    public static final DQ A04;
    public static final Pattern A05;
    public int A00 = -1;
    public int A01 = -1;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 38);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{87, 41, 82, 57, 36, 48, 104, 36, 111, 72, 36, 79, 84, 114, 49, 116, 41, 33, 82, 57, 36, 48, 104, 36, 111, 72, 36, 79, 84, 114, 49, 116, 32, 41, 33, 82, 57, 36, 48, 104, 36, 111, 72, 36, 79, 84, 114, 49, 116, 32, 74, 70, 68, 7, 72, 89, 89, 69, 76, 7, 64, 125, 92, 71, 76, 90, 43, Ascii.SYN, 55, 44, 17, Ascii.SI, Ascii.DC2, 0};
    }

    static {
        A01();
        A04 = new X1();
        A05 = Pattern.compile(A00(0, 50, 47));
    }

    private boolean A02(String str) {
        Matcher matcher = A05.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.A00 = parseInt;
                    this.A01 = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean A03() {
        return (this.A00 == -1 || this.A01 == -1) ? false : true;
    }

    public final boolean A04(int i) {
        int encoderPadding = i >> 12;
        int encoderDelay = i & 4095;
        if (encoderPadding > 0 || encoderDelay > 0) {
            this.A00 = encoderPadding;
            this.A01 = encoderDelay;
            return true;
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A05(Metadata metadata) {
        for (int i = 0; i < i; i++) {
            Metadata.Entry A01 = metadata.A01(i);
            boolean z = A01 instanceof CommentFrame;
            String A00 = A00(66, 8, 100);
            if (z) {
                CommentFrame commentFrame = (CommentFrame) A01;
                String[] strArr = A03;
                String str = strArr[6];
                String str2 = strArr[3];
                int charAt = str.charAt(21);
                int i2 = str2.charAt(21);
                if (charAt != i2) {
                    throw new RuntimeException();
                }
                A03[2] = "qNstZA7UFnX3Ahz0Wj5J3oCW9XwBWpVm";
                if (A00.equals(commentFrame.A00) && A02(commentFrame.A02)) {
                    return true;
                }
            } else if (A01 instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) A01;
                if (A00(50, 16, 15).equals(internalFrame.A01) && A00.equals(internalFrame.A00) && A02(internalFrame.A02)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
