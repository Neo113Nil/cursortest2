package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.k.p;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.video.module.a.a;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class HS {
    public static byte[] A00;
    public static int[] A01;
    public static String[] A02 = {"unNLyNh5FR3GyMG68d", "fnHIAbwwkFQ1ZGNlnsc", "DMpYp1jOlcNpO4pJgPWh22Zerf91QM8t", "RZoQ8h3", "L8G6Aqwau6BJqNFKfla", "ElXYWWCxJdBggdMs0Hio0yCYqdZAyfAp", "A3sl", "vST53OIiICW6hrmD3wtDRemD3zmWyZSx"};
    public static final byte[] A03;
    public static final float[] A04;
    public static final Object A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 24
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static HP A06(byte[] bArr, int i, int i4) {
        HU hu = new HU(bArr, i, i4);
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        hu.A07(4);
        int A052 = hu.A05(3);
        hu.A06();
        int A053 = hu.A05(2);
        boolean A0A = hu.A0A();
        int A054 = hu.A05(5);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (A02[0].length() == 10) {
                break;
            }
            String[] strArr = A02;
            strArr[2] = "xkwe1O9uU2dqAY7xWUY4fbTlKQKyvcwL";
            strArr[7] = "HeYhRuPqM40BhEn67WYdTTzYcbU6v3bu";
            if (i13 < 32) {
                if (hu.A0A()) {
                    i12 |= 1 << i13;
                }
                i13++;
            } else {
                int[] iArr = new int[6];
                for (int i14 = 0; i14 < iArr.length; i14++) {
                    iArr[i14] = hu.A05(8);
                }
                int A055 = hu.A05(8);
                int i15 = 0;
                for (int i16 = 0; i16 < A052; i16++) {
                    if (hu.A0A()) {
                        i15 += 89;
                    }
                    if (hu.A0A()) {
                        i15 += 8;
                    }
                }
                hu.A07(i15);
                if (A052 > 0) {
                    hu.A07((8 - A052) * 2);
                }
                int A042 = hu.A04();
                int A043 = hu.A04();
                if (A043 == 3) {
                    hu.A06();
                }
                int A044 = hu.A04();
                int A045 = hu.A04();
                if (hu.A0A()) {
                    int A046 = hu.A04();
                    int A047 = hu.A04();
                    int A048 = hu.A04();
                    int A049 = hu.A04();
                    A044 -= (A046 + A047) * ((A043 == 1 || A043 == 2) ? 2 : 1);
                    int i17 = (A048 + A049) * (A043 == 1 ? 2 : 1);
                    String[] strArr2 = A02;
                    if (strArr2[4].length() != strArr2[1].length()) {
                        A02[6] = "Hn3sdMz19WVmWCBK";
                        A045 -= i17;
                    } else {
                        A02[3] = "Jz4JSkPN0248kFDgiRzzjLGO7q";
                        A045 -= i17;
                    }
                }
                hu.A04();
                hu.A04();
                int A0410 = hu.A04();
                for (int i18 = hu.A0A() ? 0 : A052; i18 <= A052; i18++) {
                    hu.A04();
                    hu.A04();
                    hu.A04();
                }
                hu.A04();
                hu.A04();
                hu.A04();
                hu.A04();
                hu.A04();
                hu.A04();
                if (hu.A0A() && hu.A0A()) {
                    A0D(hu);
                }
                hu.A07(2);
                if (hu.A0A()) {
                    hu.A07(8);
                    hu.A04();
                    hu.A04();
                    hu.A06();
                }
                A0E(hu);
                if (hu.A0A()) {
                    for (int i19 = 0; i19 < hu.A04(); i19++) {
                        hu.A07(A0410 + 4 + 1);
                    }
                }
                hu.A07(2);
                float f6 = 1.0f;
                boolean A0A2 = hu.A0A();
                if (A02[0].length() != 10) {
                    String[] strArr3 = A02;
                    strArr3[2] = "CMlgeA8zQVByZrA2VMXzsS0jeMyo18qQ";
                    strArr3[7] = "QAK33uwHUZwexufQvU3o8DPmyRQmvUMz";
                    if (A0A2) {
                        if (hu.A0A()) {
                            int A056 = hu.A05(8);
                            if (A056 == 255) {
                                int A057 = hu.A05(16);
                                int A058 = hu.A05(16);
                                if (A057 != 0 && A058 != 0) {
                                    f6 = A057 / A058;
                                }
                            } else if (A056 < A04.length) {
                                f6 = A04[A056];
                            } else {
                                AbstractC06314g.A07(A0B(0, 11, 63), A0B(11, 35, a.f21885Q) + A056);
                            }
                        }
                        if (hu.A0A()) {
                            hu.A06();
                        }
                        if (hu.A0A()) {
                            hu.A07(3);
                            boolean A0A3 = hu.A0A();
                            if (hu.A0A()) {
                                int A059 = hu.A05(8);
                                int A0510 = hu.A05(8);
                                hu.A07(8);
                                i9 = ColorInfo.A00(A059);
                                i10 = A0A3 ? 1 : 2;
                                if (A02[6].length() != 3) {
                                    A02[0] = "HGrGkdvIc2AkT14Ejxxa4aXBUNVha";
                                    i11 = ColorInfo.A01(A0510);
                                } else {
                                    i11 = ColorInfo.A01(A0510);
                                }
                            }
                        }
                        if (hu.A0A()) {
                            hu.A04();
                            hu.A04();
                        }
                        hu.A06();
                        if (hu.A0A()) {
                            A045 *= 2;
                        }
                    }
                    return new HP(A053, A0A, A054, i12, iArr, A055, A042, A044, A045, f6, i9, i10, i11);
                }
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 26
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static HR A0A(byte[] bArr, int i, int i4) {
        int i9;
        int i10;
        HU hu = new HU(bArr, i, i4);
        int A052 = hu.A05(8);
        int A053 = hu.A05(8);
        int A054 = hu.A05(8);
        int A042 = hu.A04();
        int i11 = 1;
        if (A052 == 100 || A052 == 110 || A052 == 122 || A052 == 244 || A052 == 44 || A052 == 83 || A052 == 86 || A052 == 118 || A052 == 128 || A052 == 138) {
            i11 = hu.A04();
            r20 = i11 == 3 ? hu.A0A() : false;
            hu.A04();
            hu.A04();
            hu.A06();
            boolean A0A = hu.A0A();
            if (A02[0].length() != 10) {
                A02[0] = "qzm7RlaVhvQtMB0zhtauZ";
                if (A0A) {
                    int i12 = i11 != 3 ? 8 : 12;
                    int i13 = 0;
                    while (i13 < i12) {
                        if (hu.A0A()) {
                            A0F(hu, i13 < 6 ? 16 : 64);
                        }
                        i13++;
                    }
                }
            }
            throw new RuntimeException();
        }
        int A043 = hu.A04() + 4;
        int A044 = hu.A04();
        int i14 = 0;
        boolean z8 = false;
        if (A044 == 0) {
            i14 = hu.A04() + 4;
            if (A02[5].charAt(3) != 'Y') {
                A02[3] = "2NWfLRVEjhOO9";
            } else {
                A02[5] = "fn7YpbzvxXlInri96XbQTTrdseuocXrx";
            }
        } else {
            if (A044 == 1) {
                z8 = hu.A0A();
                hu.A03();
                hu.A03();
                long A045 = hu.A04();
                String[] strArr = A02;
                if (strArr[4].length() == strArr[1].length()) {
                    String[] strArr2 = A02;
                    strArr2[2] = "sL3yo27N596gnAOXUx3X3jVDrWZXEmHs";
                    strArr2[7] = "EWRRgQnwInix360952oSCS5kmFFjSZxj";
                    for (int i15 = 0; i15 < A045; i15++) {
                        hu.A04();
                    }
                }
                throw new RuntimeException();
            }
            String[] strArr3 = A02;
            if (strArr3[4].length() != strArr3[1].length()) {
                throw new RuntimeException();
            }
            A02[3] = "4FZcyZVF6YdFmLSwekyzJ";
        }
        int A046 = hu.A04();
        hu.A06();
        int A047 = hu.A04() + 1;
        int A048 = hu.A04() + 1;
        boolean A0A2 = hu.A0A();
        int i16 = (2 - (A0A2 ? 1 : 0)) * A048;
        if (!A0A2) {
            hu.A06();
        }
        hu.A06();
        int i17 = A047 * 16;
        int i18 = i16 * 16;
        if (hu.A0A()) {
            int A049 = hu.A04();
            int A0410 = hu.A04();
            int A0411 = hu.A04();
            int A0412 = hu.A04();
            if (i11 == 0) {
                i9 = 1;
                i10 = 2 - (A0A2 ? 1 : 0);
            } else {
                i9 = i11 == 3 ? 1 : 2;
                i10 = (2 - (A0A2 ? 1 : 0)) * (i11 == 1 ? 2 : 1);
            }
            i17 -= (A049 + A0410) * i9;
            i18 -= (A0411 + A0412) * i10;
        }
        float f6 = 1.0f;
        if (hu.A0A() && hu.A0A()) {
            int A055 = hu.A05(8);
            if (A055 == 255) {
                int A056 = hu.A05(16);
                int A057 = hu.A05(16);
                if (A056 != 0 && A057 != 0) {
                    f6 = A056 / A057;
                }
            } else if (A055 < A04.length) {
                f6 = A04[A055];
            } else {
                AbstractC06314g.A07(A0B(0, 11, 63), A0B(11, 35, a.f21885Q) + A055);
            }
        }
        return new HR(A052, A053, A054, A042, A046, i17, i18, f6, r20, A0A2, A043, A044, i14, z8);
    }

    public static String A0B(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 108);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A00 = new byte[]{-7, 12, 23, 0, 25, 20, 31, 0, 31, 20, 23, c.f16476c, 88, 79, 98, 90, 79, 77, 94, 79, 78, 10, 75, 93, 90, 79, 77, 94, 73, 92, 75, 94, 83, 89, 73, 83, 78, 77, 10, 96, 75, 86, 95, 79, 36, 10, 66, 53, 48, 49, 59, -5, 45, 66, 47, 23, 10, 5, 6, 16, -48, 9, 6, 23, 4};
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x010e, code lost:
    
        if (r13 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0110, code lost:
    
        r7[r5] = r17;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0133, code lost:
    
        if (r13 != false) goto L60;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0E(HU hu) {
        int A042;
        int A043;
        int[] iArr;
        int A044 = hu.A04();
        int i = -1;
        int i4 = -1;
        int[] iArr2 = new int[0];
        int[] iArr3 = new int[0];
        int i9 = 0;
        while (i9 < A044) {
            if (i9 != 0 && hu.A0A()) {
                int i10 = i + i4;
                int A045 = (1 - ((hu.A0A() ? 1 : 0) * 2)) * (hu.A04() + 1);
                boolean[] zArr = new boolean[i10 + 1];
                for (int i11 = 0; i11 <= i10; i11++) {
                    if (hu.A0A()) {
                        zArr[i11] = true;
                    } else {
                        zArr[i11] = hu.A0A();
                    }
                }
                A042 = 0;
                int[] iArr4 = new int[i10 + 1];
                int[] iArr5 = new int[i10 + 1];
                for (int i12 = i4 - 1; i12 >= 0; i12--) {
                    int i13 = iArr3[i12] + A045;
                    if (i13 < 0 && zArr[i + i12]) {
                        iArr4[A042] = i13;
                        A042++;
                    }
                }
                if (A045 < 0 && zArr[i10]) {
                    iArr4[A042] = A045;
                    A042++;
                }
                for (int i14 = 0; i14 < i; i14++) {
                    int i15 = iArr2[i14] + A045;
                    if (A02[0].length() == 10) {
                        throw new RuntimeException();
                    }
                    A02[0] = "0xLwbNcICqBOIGnxvrVU0VkzUAjp";
                    if (i15 < 0) {
                        boolean z8 = zArr[i14];
                        if (A02[6].length() != 3) {
                            String[] strArr = A02;
                            strArr[2] = "OJAEm2QqqrF2kr0XAoMunq3AjjwiYhOO";
                            strArr[7] = "NvnxbUpcm9NzKSDUaYgmh21cCcr7HCKV";
                            if (!z8) {
                            }
                            int i16 = A042 + 1;
                            iArr4[A042] = i15;
                            if (A02[0].length() == 10) {
                                A02[0] = "ZxDUqDztknTqk0noe7cSqrpf0";
                                A042 = i16;
                            } else {
                                A042 = i16;
                            }
                        } else {
                            String[] strArr2 = A02;
                            strArr2[2] = "O1Oy4mT2J3IqGA0cLz7TSW3zbNH41BLw";
                            strArr2[7] = "bMAFoAVZGrulVErqDQ8z4qjQetYlIImf";
                            if (!z8) {
                            }
                            int i162 = A042 + 1;
                            iArr4[A042] = i15;
                            if (A02[0].length() == 10) {
                            }
                        }
                    }
                }
                iArr = Arrays.copyOf(iArr4, A042);
                A043 = 0;
                for (int i17 = i - 1; i17 >= 0; i17--) {
                    int i18 = iArr2[i17] + A045;
                    if (i18 > 0 && zArr[i17]) {
                        iArr5[A043] = i18;
                        A043++;
                    }
                }
                if (A045 > 0) {
                    boolean z9 = zArr[i10];
                    String[] strArr3 = A02;
                    if (strArr3[4].length() != strArr3[1].length()) {
                        A02[6] = "tgnVuwGZauQZxVLXvW8ZTDaij";
                    } else {
                        A02[0] = "U";
                    }
                }
                for (int i19 = 0; i19 < i4; i19++) {
                    int i20 = iArr3[i19] + A045;
                    if (i20 > 0 && zArr[i + i19]) {
                        iArr5[A043] = i20;
                        A043++;
                    }
                }
                if (A02[5].charAt(3) != 'Y') {
                    A02[5] = "VNLYj4nIEG05kgLFUbTjhWBq9LKgRHZO";
                    iArr3 = Arrays.copyOf(iArr5, A043);
                } else {
                    String[] strArr4 = A02;
                    strArr4[2] = "zCcqrsPkSftUPRel4Z8ZE6iGY8rnHFMe";
                    strArr4[7] = "knHf2kXaFD2hm93xyPTTBZZ0wItiA7C5";
                    iArr3 = Arrays.copyOf(iArr5, A043);
                }
            } else {
                A042 = hu.A04();
                A043 = hu.A04();
                iArr = new int[A042];
                for (int i21 = 0; i21 < A042; i21++) {
                    iArr[i21] = hu.A04() + 1;
                    hu.A06();
                }
                iArr3 = new int[A043];
                for (int i22 = 0; i22 < A043; i22++) {
                    iArr3[i22] = hu.A04() + 1;
                    hu.A06();
                }
            }
            i = A042;
            i4 = A043;
            iArr2 = iArr;
            if (A02[0].length() != 10) {
                String[] strArr5 = A02;
                strArr5[4] = "MHTDjP3q9jqJvcAulQ6";
                strArr5[1] = "VeGKMo1LwbXx0TG7y0g";
                i9++;
            } else {
                i9++;
            }
        }
    }

    static {
        A0C();
        A03 = new byte[]{0, 0, 0, 1};
        A04 = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
        A05 = new Object();
        A01 = new int[10];
    }

    public static int A00(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static int A01(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static int A02(byte[] bArr, int i) {
        int i4;
        synchronized (A05) {
            int scratchEscapeCount = 0;
            int i9 = 0;
            while (scratchEscapeCount < i) {
                scratchEscapeCount = A03(bArr, scratchEscapeCount, i);
                if (scratchEscapeCount < i) {
                    if (A01.length <= i9) {
                        A01 = Arrays.copyOf(A01, A01.length * 2);
                    }
                    A01[i9] = scratchEscapeCount;
                    scratchEscapeCount += 3;
                    i9++;
                }
            }
            i4 = i - i9;
            int unescapedPosition = 0;
            int escapedPosition = 0;
            for (int unescapedLength = 0; unescapedLength < i9; unescapedLength++) {
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
            System.arraycopy(bArr, unescapedPosition, bArr, escapedPosition, i4 - escapedPosition);
        }
        return i4;
    }

    /* JADX WARN: Incorrect condition in loop: B:2:0x0002 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A03(byte[] bArr, int i, int i4) {
        while (i < i) {
            int i9 = bArr[i];
            if (i9 == 0) {
                int i10 = i + 1;
                if (bArr[i10] == 0) {
                    int i11 = i + 2;
                    if (bArr[i11] == 3) {
                        return i;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0136, code lost:
    
        if (r0 == 1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0138, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0144, code lost:
    
        if (r0 == 1) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A04(byte[] bArr, int i, int i4, boolean[] zArr) {
        boolean z8;
        boolean z9;
        int i9 = i4 - i;
        AbstractC06233y.A08(i9 >= 0);
        if (i9 == 0) {
            return i4;
        }
        if (zArr[0]) {
            A0H(zArr);
            int length = i - 3;
            return length;
        }
        if (i9 > 1 && zArr[1]) {
            int length2 = bArr[i];
            if (length2 == 1) {
                A0H(zArr);
                int length3 = i - 2;
                return length3;
            }
        }
        if (i9 > 2 && zArr[2]) {
            int length4 = bArr[i];
            if (length4 == 0) {
                int length5 = i + 1;
                byte b9 = bArr[length5];
                if (A02[0].length() == 10) {
                    throw new RuntimeException();
                }
                A02[6] = "PQW9C7kUOKDoPPw";
                if (b9 == 1) {
                    A0H(zArr);
                    int length6 = i - 1;
                    return length6;
                }
            }
        }
        int i10 = i4 - 1;
        int i11 = i + 2;
        while (i11 < i10) {
            int length7 = bArr[i11];
            if ((length7 & 254) == 0) {
                int length8 = i11 - 2;
                if (bArr[length8] == 0) {
                    int length9 = i11 - 1;
                    if (bArr[length9] == 0) {
                        int length10 = bArr[i11];
                        if (length10 == 1) {
                            A0H(zArr);
                            int length11 = i11 - 2;
                            return length11;
                        }
                    }
                }
                i11 -= 2;
            }
            i11 += 3;
        }
        if (i9 > 2) {
            int length12 = i4 - 3;
            if (bArr[length12] == 0) {
                int length13 = i4 - 2;
                byte b10 = bArr[length13];
                if (A02[6].length() == 3) {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[4] = "tLizWOaN0OsagnuSy28";
                strArr[1] = "ZOtg0UvXTXpiFnpoxfp";
                if (b10 == 0) {
                    int length14 = i4 - 1;
                    if (bArr[length14] == 1) {
                        z8 = true;
                    }
                }
            }
            z8 = false;
        } else if (i9 == 2) {
            boolean z10 = zArr[2];
            if (A02[5].charAt(3) != 'Y') {
                throw new RuntimeException();
            }
            A02[0] = "TtHOfwpayoR";
            if (z10) {
                int length15 = i4 - 2;
                if (bArr[length15] == 0) {
                    int length16 = i4 - 1;
                    if (bArr[length16] == 1) {
                        z8 = true;
                    }
                }
            }
            z8 = false;
        } else {
            if (zArr[1]) {
                int i12 = i4 - 1;
                String[] strArr2 = A02;
                String str = strArr2[2];
                String str2 = strArr2[7];
                int charAt = str.charAt(3);
                int length17 = str2.charAt(3);
                if (charAt != length17) {
                    String[] strArr3 = A02;
                    strArr3[2] = "UGNUjS5TseBxte9hZy6MdiMKKivw8YU8";
                    strArr3[7] = "gAwFNStsKHXv5jMh5dTnIzvsHbrqE6D6";
                    int length18 = bArr[i12];
                } else {
                    A02[5] = "MYPYXnk67e7ylj87wlpJJbRJ3uYkeY13";
                    int length19 = bArr[i12];
                }
            }
            z8 = false;
        }
        zArr[0] = z8;
        if (i9 > 1) {
            int length20 = i4 - 2;
            if (bArr[length20] == 0) {
                int length21 = i4 - 1;
                if (bArr[length21] == 0) {
                    z9 = true;
                }
            }
            z9 = false;
        } else {
            if (zArr[2]) {
                int length22 = i4 - 1;
                if (bArr[length22] == 0) {
                    z9 = true;
                }
            }
            z9 = false;
        }
        zArr[1] = z9;
        int length23 = i4 - 1;
        zArr[2] = bArr[length23] == 0;
        return i4;
    }

    public static HP A05(byte[] bArr, int i, int i4) {
        return A06(bArr, i + 2, i4);
    }

    public static HQ A07(byte[] bArr, int i, int i4) {
        return A08(bArr, i + 1, i4);
    }

    public static HQ A08(byte[] bArr, int i, int i4) {
        HU data = new HU(bArr, i, i4);
        int A042 = data.A04();
        int seqParameterSetId = data.A04();
        data.A06();
        return new HQ(A042, seqParameterSetId, data.A0A());
    }

    public static HR A09(byte[] bArr, int i, int i4) {
        return A0A(bArr, i + 1, i4);
    }

    public static void A0D(HU hu) {
        for (int i = 0; i < 4; i++) {
            int i4 = 0;
            while (i4 < 6) {
                int matrixId = 1;
                if (!hu.A0A()) {
                    hu.A04();
                } else {
                    int sizeId = i << 1;
                    int min = Math.min(64, 1 << (sizeId + 4));
                    if (i > 1) {
                        hu.A03();
                    }
                    for (int sizeId2 = 0; sizeId2 < min; sizeId2++) {
                        hu.A03();
                    }
                }
                if (i == 3) {
                    matrixId = 3;
                }
                i4 += matrixId;
            }
        }
    }

    public static void A0F(HU hu, int i) {
        int i4 = 8;
        int lastScale = 8;
        for (int nextScale = 0; nextScale < i; nextScale++) {
            if (lastScale != 0) {
                int lastScale2 = hu.A03();
                lastScale = ((lastScale2 + i4) + 256) % 256;
            }
            if (lastScale != 0) {
                i4 = lastScale;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0G(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int value = 0;
        while (length < position) {
            int length = byteBuffer.get(value);
            int offset = length & p.f8630b;
            if (i == 3) {
                if (offset == 1) {
                    int length2 = value + 1;
                    int consecutiveZeros = byteBuffer.get(length2) & 31;
                    if (consecutiveZeros == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        int length3 = value - 3;
                        duplicate.position(length3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                }
            } else if (offset == 0) {
                i++;
            }
            if (offset != 0) {
                i = 0;
            }
            value++;
        }
        byteBuffer.clear();
    }

    public static void A0H(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean A0I(String str, byte b9) {
        if (A0B(46, 9, 96).equals(str) && (b9 & 31) == 6) {
            return true;
        }
        return A0B(55, 10, 53).equals(str) && ((b9 & 126) >> 1) == 39;
    }
}
