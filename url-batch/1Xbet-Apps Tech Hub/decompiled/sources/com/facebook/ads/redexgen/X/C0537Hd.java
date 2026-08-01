package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0537Hd {
    public static byte[] A00;
    public static int[] A01;
    public static String[] A02 = {"NtIRWyZV8H4fZGcEpCmcKf3IqD05aRmR", "GeJrrdqpTOChTmOZ0a7zD9rW5xWuwwPC", "fB9woPX", "60Ey3AJYIgulbHGVt5ok32wwr6OtRAhs", "ywmal8sml3QBlriqnsJwUXbJL0wOA6tO", "h15JbuXclRunjao1u8Y3u6XMQgnEqNxE", "VnL2Csv3rCYD2ISe0PbhclEmcnjJ2Dil", "pqWxkCx1Owc6AlIW11IRV9LZfrwFezHs"};
    public static final byte[] A03;
    public static final float[] A04;
    public static final Object A05;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r7 != 118) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r7 == 128) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r7 != 138) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00bb, code lost:
    
        if (r7 != 118) goto L24;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0536Hc A06(byte[] bArr, int i, int i2) {
        int A042;
        boolean A0A;
        int A052;
        int i3;
        int i4;
        C0542Hi c0542Hi = new C0542Hi(bArr, i, i2);
        c0542Hi.A07(8);
        int A053 = c0542Hi.A05(8);
        c0542Hi.A07(16);
        int A043 = c0542Hi.A04();
        int i5 = 1;
        if (A053 != 100) {
            if (A02[4].charAt(6) == 's') {
                String[] strArr = A02;
                strArr[5] = "yVhhMtRnqXgY1Kb3O7KmUsZDbX87nSR0";
                strArr[0] = "CScaMkkS4ynj4HoVSfcs8Df7mB4vIw2E";
                if (A053 != 110 && A053 != 122 && A053 != 244 && A053 != 44 && A053 != 83 && A053 != 86) {
                    String[] strArr2 = A02;
                    if (strArr2[5].charAt(21) != strArr2[0].charAt(21)) {
                        A02[2] = "JhuiEkWh4gR2K7eJg";
                    }
                    int A044 = c0542Hi.A04() + 4;
                    A042 = c0542Hi.A04();
                    int i6 = 0;
                    boolean z = false;
                    if (A042 != 0) {
                        i6 = c0542Hi.A04() + 4;
                        if (A02[4].charAt(6) == 's') {
                            String[] strArr3 = A02;
                            strArr3[6] = "0FcrA39w8cpWUUBY0PhZdDl2WVIzmr3H";
                            strArr3[1] = "bEwoHyJue3o3gWd30VLAmFgh8fIWiG5R";
                        }
                    } else if (A042 == 1) {
                        z = c0542Hi.A0A();
                        c0542Hi.A03();
                        c0542Hi.A03();
                        long A045 = c0542Hi.A04();
                        for (int i7 = 0; i7 < A045; i7++) {
                            c0542Hi.A04();
                        }
                    }
                    c0542Hi.A04();
                    c0542Hi.A06();
                    int A046 = c0542Hi.A04() + 1;
                    int A047 = c0542Hi.A04() + 1;
                    A0A = c0542Hi.A0A();
                    int i8 = (2 - (A0A ? 1 : 0)) * A047;
                    if (!A0A) {
                        c0542Hi.A06();
                    }
                    c0542Hi.A06();
                    int i9 = A046 * 16;
                    int i10 = i8 * 16;
                    if (c0542Hi.A0A()) {
                        String[] strArr4 = A02;
                        if (strArr4[6].charAt(16) != strArr4[1].charAt(16)) {
                            String[] strArr5 = A02;
                            strArr5[6] = "rEmuJ6sFB5gWWdCI0T7L47ZB03FBkEHD";
                            strArr5[1] = "kUZJy2qQtWdVgeJj0t3oDkGmETEmhFuj";
                        } else {
                            String[] strArr6 = A02;
                            strArr6[5] = "DSl3hQKuabn38CmnzrECcwmRq5HwdYpG";
                            strArr6[0] = "fA6X51zRtxq1lySt2ARPPLPLlCaXaXco";
                        }
                    } else {
                        int A048 = c0542Hi.A04();
                        int A049 = c0542Hi.A04();
                        int A0410 = c0542Hi.A04();
                        int A0411 = c0542Hi.A04();
                        if (i5 == 0) {
                            i3 = 1;
                            i4 = 2 - (A0A ? 1 : 0);
                        } else {
                            i3 = i5 == 3 ? 1 : 2;
                            i4 = (2 - (A0A ? 1 : 0)) * (i5 == 1 ? 2 : 1);
                        }
                        int i11 = (A048 + A049) * i3;
                        if (A02[2].length() != 30) {
                            String[] strArr7 = A02;
                            strArr7[6] = "K9ZSRxGlh7Ws8i4c0lKuIdr8XNNG4vGX";
                            strArr7[1] = "z3Vhx6GLQ83q5V050JhbnsU4vD8C98vT";
                            i9 -= i11;
                            i10 -= (A0410 + A0411) * i4;
                        }
                    }
                    float f = 1.0f;
                    if (c0542Hi.A0A() && c0542Hi.A0A()) {
                        A052 = c0542Hi.A05(8);
                        if (A052 != 255) {
                            int A054 = c0542Hi.A05(16);
                            int A055 = c0542Hi.A05(16);
                            if (A054 != 0 && A055 != 0) {
                                f = A054 / A055;
                            }
                        } else {
                            float[] fArr = A04;
                            if (A052 < fArr.length) {
                                f = fArr[A052];
                            } else {
                                Log.w(A07(0, 11, 38), A07(11, 35, 89) + A052);
                            }
                        }
                    }
                    return new C0536Hc(A043, i9, i10, f, r16, A0A, A044, A042, i6, z);
                }
            }
            throw new RuntimeException();
        }
        i5 = c0542Hi.A04();
        r16 = i5 == 3 ? c0542Hi.A0A() : false;
        c0542Hi.A04();
        c0542Hi.A04();
        c0542Hi.A06();
        if (c0542Hi.A0A()) {
            int i12 = i5 != 3 ? 8 : 12;
            int i13 = 0;
            while (i13 < i12) {
                if (c0542Hi.A0A()) {
                    A09(c0542Hi, i13 < 6 ? 16 : 64);
                }
                i13++;
            }
        }
        int A0442 = c0542Hi.A04() + 4;
        A042 = c0542Hi.A04();
        int i62 = 0;
        boolean z2 = false;
        if (A042 != 0) {
        }
        c0542Hi.A04();
        c0542Hi.A06();
        int A0462 = c0542Hi.A04() + 1;
        int A0472 = c0542Hi.A04() + 1;
        A0A = c0542Hi.A0A();
        int i82 = (2 - (A0A ? 1 : 0)) * A0472;
        if (!A0A) {
        }
        c0542Hi.A06();
        int i92 = A0462 * 16;
        int i102 = i82 * 16;
        if (c0542Hi.A0A()) {
        }
        float f2 = 1.0f;
        if (c0542Hi.A0A()) {
            A052 = c0542Hi.A05(8);
            if (A052 != 255) {
            }
        }
        return new C0536Hc(A043, i92, i102, f2, r16, A0A, A0442, A042, i62, z2);
    }

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 29);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{117, 90, 87, 110, 85, 82, 79, 110, 79, 82, 87, 17, 42, 33, 60, 52, 33, 39, 48, 33, 32, 100, 37, 55, 52, 33, 39, 48, Ascii.ESC, 54, 37, 48, 45, 43, Ascii.ESC, 45, 32, 39, 100, 50, 37, 40, 49, 33, 126, 100, Ascii.RS, 1, Ascii.FF, Ascii.CR, 7, 71, 9, Ascii.RS, Ascii.VT, 85, 74, 71, 70, 76, Ascii.FF, 75, 70, 85, 64};
    }

    static {
        A08();
        A03 = new byte[]{0, 0, 0, 1};
        A04 = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
        A05 = new Object();
        A01 = new int[10];
    }

    public static int A00(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static int A01(byte[] bArr, int i) {
        return bArr[i + 3] & Ascii.US;
    }

    public static int A02(byte[] bArr, int i) {
        int i2;
        synchronized (A05) {
            int scratchEscapeCount = 0;
            int i3 = 0;
            while (scratchEscapeCount < i) {
                scratchEscapeCount = A03(bArr, scratchEscapeCount, i);
                if (scratchEscapeCount < i) {
                    int[] iArr = A01;
                    if (iArr.length <= i3) {
                        A01 = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    A01[i3] = scratchEscapeCount;
                    scratchEscapeCount += 3;
                    i3++;
                }
            }
            i2 = i - i3;
            int unescapedPosition = 0;
            int escapedPosition = 0;
            for (int unescapedLength = 0; unescapedLength < i3; unescapedLength++) {
                int scratchEscapeCount2 = A01[unescapedLength];
                int scratchEscapeCount3 = scratchEscapeCount2 - unescapedPosition;
                System.arraycopy(bArr, unescapedPosition, bArr, escapedPosition, scratchEscapeCount3);
                int escapedPosition2 = escapedPosition + scratchEscapeCount3;
                int position = escapedPosition2 + 1;
                bArr[escapedPosition2] = 0;
                escapedPosition = position + 1;
                bArr[position] = 0;
                unescapedPosition += scratchEscapeCount3 + 3;
            }
            System.arraycopy(bArr, unescapedPosition, bArr, escapedPosition, i2 - escapedPosition);
        }
        return i2;
    }

    /* JADX WARN: Incorrect condition in loop: B:2:0x0002 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A03(byte[] bArr, int i, int i2) {
        while (i < i) {
            int i3 = bArr[i];
            if (i3 == 0) {
                int i4 = i + 1;
                if (bArr[i4] == 0) {
                    int i5 = i + 2;
                    if (bArr[i5] == 3) {
                        return i;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
        return i2;
    }

    public static int A04(byte[] bArr, int i, int i2, boolean[] zArr) {
        boolean z;
        boolean z2;
        int i3 = i2 - i;
        HI.A04(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr != null) {
            if (zArr[0]) {
                A0B(zArr);
                int length = i - 3;
                return length;
            }
            if (i3 > 1 && zArr[1]) {
                int length2 = bArr[i];
                if (length2 == 1) {
                    A0B(zArr);
                    int length3 = i - 2;
                    return length3;
                }
            }
            if (i3 > 2 && zArr[2]) {
                int length4 = bArr[i];
                if (length4 == 0) {
                    int length5 = i + 1;
                    if (bArr[length5] == 1) {
                        A0B(zArr);
                        int length6 = i - 1;
                        return length6;
                    }
                }
            }
        }
        int limit = i2 - 1;
        int i4 = i + 2;
        while (true) {
            if (i4 < limit) {
                int length7 = bArr[i4];
                if ((length7 & 254) == 0) {
                    int length8 = i4 - 2;
                    if (bArr[length8] == 0) {
                        int length9 = i4 - 1;
                        if (bArr[length9] == 0) {
                            int length10 = bArr[i4];
                            if (length10 == 1) {
                                if (zArr != null) {
                                    A0B(zArr);
                                }
                                int i5 = i4 - 2;
                                if (A02[2].length() != 30) {
                                    String[] strArr = A02;
                                    strArr[5] = "cwZIqZ1AW63JkQ3pIqo9DKAUVDIU8B2n";
                                    strArr[0] = "C4ULzJ2O8tT1dK0koFoE4t7X4OAunQC5";
                                    return i5;
                                }
                            }
                        }
                    }
                    i4 -= 2;
                }
                i4 += 3;
            } else {
                if (zArr != null) {
                    if (i3 > 2) {
                        int length11 = i2 - 3;
                        if (bArr[length11] == 0) {
                            int length12 = i2 - 2;
                            byte b = bArr[length12];
                            String[] strArr2 = A02;
                            String str = strArr2[6];
                            String str2 = strArr2[1];
                            int charAt = str.charAt(16);
                            int length13 = str2.charAt(16);
                            if (charAt == length13) {
                                String[] strArr3 = A02;
                                strArr3[5] = "3nijOMlfzKgjywxgx1aIEuQEOVvcrnGF";
                                strArr3[0] = "mhxYTAHU7iRAJ8bI14cg8xnokscJO5gc";
                                if (b == 0) {
                                    int length14 = i2 - 1;
                                    byte b2 = bArr[length14];
                                    String[] strArr4 = A02;
                                    String str3 = strArr4[5];
                                    String str4 = strArr4[0];
                                    int charAt2 = str3.charAt(21);
                                    int length15 = str4.charAt(21);
                                    if (charAt2 == length15) {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr5 = A02;
                                    strArr5[3] = "9ZCFGjZIw1dXFFVp2oTHQfikOa97hWgs";
                                    strArr5[7] = "4W5bkIHCCYZDsaIH6FljQxOPKIhpSySs";
                                    if (b2 == 1) {
                                        z = true;
                                    }
                                }
                            }
                        }
                        z = false;
                    } else if (i3 == 2) {
                        if (zArr[2]) {
                            int length16 = i2 - 2;
                            if (bArr[length16] == 0) {
                                int length17 = i2 - 1;
                                if (bArr[length17] == 1) {
                                    z = true;
                                }
                            }
                        }
                        z = false;
                    } else {
                        if (zArr[1]) {
                            int length18 = i2 - 1;
                            if (bArr[length18] == 1) {
                                z = true;
                            }
                        }
                        z = false;
                    }
                    zArr[0] = z;
                    if (i3 > 1) {
                        int length19 = i2 - 2;
                        if (bArr[length19] == 0) {
                            int length20 = i2 - 1;
                            if (bArr[length20] == 0) {
                                z2 = true;
                            }
                        }
                        z2 = false;
                    } else {
                        if (zArr[2]) {
                            int length21 = i2 - 1;
                            if (bArr[length21] == 0) {
                                z2 = true;
                            }
                        }
                        z2 = false;
                    }
                    zArr[1] = z2;
                    int length22 = i2 - 1;
                    zArr[2] = bArr[length22] == 0;
                }
                return i2;
            }
        }
        throw new RuntimeException();
    }

    public static C0535Hb A05(byte[] bArr, int i, int i2) {
        C0542Hi c0542Hi = new C0542Hi(bArr, i, i2);
        c0542Hi.A07(8);
        int A042 = c0542Hi.A04();
        int seqParameterSetId = c0542Hi.A04();
        c0542Hi.A06();
        return new C0535Hb(A042, seqParameterSetId, c0542Hi.A0A());
    }

    public static void A09(C0542Hi c0542Hi, int i) {
        int i2 = 8;
        int deltaScale = 8;
        for (int i3 = 0; i3 < i; i3++) {
            if (deltaScale != 0) {
                int lastScale = c0542Hi.A03();
                deltaScale = ((lastScale + i2) + 256) % 256;
            }
            if (deltaScale != 0) {
                i2 = deltaScale;
            }
            String[] strArr = A02;
            String str = strArr[6];
            String str2 = strArr[1];
            int nextScale = str.charAt(16);
            int lastScale2 = str2.charAt(16);
            if (nextScale != lastScale2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "KXMRoqtdhshm8G74asFo5uqDFob0Iegs";
            strArr2[7] = "VTZDrARlCd8p2vM8k7YrNOP12vylJmks";
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0A(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (length < position) {
            int length = byteBuffer.get(i2);
            int value = length & 255;
            if (i == 3) {
                int consecutiveZeros = A02[4].charAt(6);
                if (consecutiveZeros != 115) {
                    throw new RuntimeException();
                }
                A02[2] = "cLm552F16buuPP9xMufxVHaN";
                if (value == 1) {
                    int length2 = i2 + 1;
                    int consecutiveZeros2 = byteBuffer.get(length2) & 31;
                    if (consecutiveZeros2 == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        int length3 = i2 - 3;
                        duplicate.position(length3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        int consecutiveZeros3 = A02[4].charAt(6);
                        if (consecutiveZeros3 != 115) {
                            String[] strArr = A02;
                            strArr[3] = "6nmXEFQWU8IXvuDOHtOk9CPNFswxHRRs";
                            strArr[7] = "sRzFReGlCKeKmBP91kaLZyOllIcQLpOs";
                            return;
                        } else {
                            String[] strArr2 = A02;
                            strArr2[5] = "MM5ABksrrLy98KCtfJajpuklss5i1OmF";
                            strArr2[0] = "sCLzk23Fd4ag3qXWex39LdUh6FJSiknG";
                            return;
                        }
                    }
                }
            } else if (value == 0) {
                i++;
            }
            if (value != 0) {
                i = 0;
            }
            i2++;
        }
        byteBuffer.clear();
    }

    public static void A0B(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean A0C(String str, byte b) {
        if (A07(46, 9, 117).equals(str) && (b & Ascii.US) == 6) {
            return true;
        }
        return A07(55, 10, 62).equals(str) && ((b & 126) >> 1) == 39;
    }
}
