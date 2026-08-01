package com.facebook.ads.redexgen.X;

import android.media.MediaCodec;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class D0 extends Exception {
    public static byte[] A04;
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    static {
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{5, -7, -8, Ascii.EM, Ascii.ETB, 35, Ascii.CAN, Ascii.EM, 38, -44, Ascii.GS, 34, Ascii.GS, 40, -44, Ascii.SUB, Ascii.NAK, Ascii.GS, 32, Ascii.EM, Ascii.CAN, -18, -44, -21, Ascii.FF, 10, Ascii.SYN, Ascii.VT, Ascii.FF, Ascii.EM, -57, 16, Ascii.NAK, 16, Ascii.ESC, -57, Ascii.CR, 8, 16, 19, Ascii.FF, Ascii.VT, -31, -57, 2, -22, -71, -83, 35, 47, 45, -18, 39, 47, 47, 39, 44, 37, -18, 33, 46, 36, 50, 47, 41, 36, -18, 37, 56, 47, 48, 44, 33, 57, 37, 50, -18, Ascii.CR, 37, 36, 41, 33, 3, 47, 36, 37, 35, Ascii.DC4, 50, 33, 35, 43, Ascii.DC2, 37, 46, 36, 37, 50, 37, 50, Ascii.US, 92, 83, 85, 77};
    }

    public D0(Format format, Throwable th, boolean z, int i) {
        super(A01(23, 22, 54) + i + A01(45, 3, 28) + format, th);
        this.A02 = format.A0O;
        this.A03 = z;
        this.A00 = null;
        this.A01 = A00(i);
    }

    public D0(Format format, Throwable th, boolean z, String str) {
        super(A01(2, 21, 67) + str + A01(0, 2, 104) + format, th);
        this.A02 = format.A0O;
        this.A03 = z;
        this.A00 = str;
        this.A01 = C0557Hx.A02 >= 21 ? A02(th) : null;
    }

    public static String A00(int i) {
        String A01 = i < 0 ? A01(101, 4, 125) : A01(0, 0, 80);
        StringBuilder sb = new StringBuilder();
        String sign = A01(48, 53, 79);
        return sb.append(sign).append(A01).append(Math.abs(i)).toString();
    }

    public static String A02(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
