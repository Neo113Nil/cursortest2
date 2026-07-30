package com.instagram.common.viewpoint.core;

import android.media.MediaCodec;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class AY extends Exception {
    public static byte[] A05;
    public final AR A00;
    public final AY A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    static {
        A05();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ Opcodes.LREM);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{0, Ascii.FF, 49, 16, Ascii.SYN, Ascii.SUB, 17, 16, 7, 85, Ascii.FS, Ascii.ESC, Ascii.FS, 1, 85, 19, Ascii.DC4, Ascii.FS, Ascii.EM, 16, 17, 79, 85, 101, 68, 66, 78, 69, 68, 83, 1, 72, 79, 72, 85, 1, 71, 64, 72, 77, 68, 69, Ascii.ESC, 1, 122, Utf8.REPLACEMENT_BYTE, 78, 66, Ascii.GS, 17, 19, 80, Ascii.CAN, Ascii.US, Ascii.GS, Ascii.ESC, Ascii.FS, 17, 17, Ascii.NAK, 80, Ascii.US, Ascii.SUB, Ascii.CR, 80, Ascii.US, 16, Ascii.SUB, Ascii.FF, 17, Ascii.ETB, Ascii.SUB, 6, 80, 19, Ascii.ESC, Ascii.SUB, Ascii.ETB, Ascii.US, 77, 80, Ascii.ESC, 6, 17, Ascii.SO, Ascii.DC2, Ascii.US, 7, Ascii.ESC, Ascii.FF, 80, 19, Ascii.ESC, Ascii.SUB, Ascii.ETB, Ascii.US, Ascii.GS, 17, Ascii.SUB, Ascii.ESC, Ascii.GS, 80, 51, Ascii.ESC, Ascii.SUB, Ascii.ETB, Ascii.US, Base64.padSymbol, 17, Ascii.SUB, Ascii.ESC, Ascii.GS, 44, Ascii.ESC, 16, Ascii.SUB, Ascii.ESC, Ascii.FF, Ascii.ESC, Ascii.FF, 33, 36, 47, 45, Ascii.NAK};
    }

    public AY(C1836or c1836or, Throwable th, boolean z, int i) {
        this(A03(23, 22, 80) + i + A03(45, 3, 19) + c1836or, th, c1836or.A0W, z, null, A02(i), null);
    }

    public AY(C1836or c1836or, Throwable th, boolean z, AR ar) {
        this(A03(2, 21, 4) + ar.A03 + A03(0, 2, 93) + c1836or, th, c1836or.A0W, z, ar, AbstractC01484a.A02 >= 21 ? A04(th) : null, null);
    }

    public AY(String str, Throwable th, String str2, boolean z, AR ar, String str3, AY ay) {
        super(str, th);
        this.A03 = str2;
        this.A04 = z;
        this.A00 = ar;
        this.A02 = str3;
        this.A01 = ay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AY A00(AY ay) {
        return new AY(getMessage(), getCause(), this.A03, this.A04, this.A00, this.A02, ay);
    }

    public static String A02(int i) {
        String A03 = i < 0 ? A03(Opcodes.LSHL, 4, 59) : A03(0, 0, 98);
        StringBuilder sb = new StringBuilder();
        String sign = A03(48, 73, 15);
        return sb.append(sign).append(A03).append(Math.abs(i)).toString();
    }

    public static String A04(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
