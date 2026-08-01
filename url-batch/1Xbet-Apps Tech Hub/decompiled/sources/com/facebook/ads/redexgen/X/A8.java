package com.facebook.ads.redexgen.X;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class A8 {
    public static byte[] A00;
    public static String[] A01 = {"sCxx5L5gWudXPe4xp1ThsNryHSmynjHF", "9Nf9uybzHO2S6jQpjiGasa9ZwcLHyUhN", "2aneS77IEDbgq", "fX6HyBPcmxgssJA51nXZ3qA", "", "AlikR2RGcjs8IOnjMv6bsO9qZZebDHqD", "DHEXyDlkH8L0aTNQHdBgfWGXbAOYtdTx", "PJLs5pK7Ccf4tt9LWMwQ38VoV6l96kFD"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;
    public static final int[] A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static Format A07(C0541Hh c0541Hh, String str, String str2, DrmInitData drmInitData) {
        int i = A05[(c0541Hh.A0E() & Opcodes.CHECKCAST) >> 6];
        int A0E = c0541Hh.A0E();
        int i2 = A04[(A0E & 56) >> 3];
        if ((A0E & 4) != 0) {
            i2++;
        }
        return Format.A07(str, A0A(0, 9, 26), null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static Format A08(C0541Hh c0541Hh, String str, String str2, DrmInitData drmInitData) {
        c0541Hh.A0Z(2);
        int i = A05[(c0541Hh.A0E() & Opcodes.CHECKCAST) >> 6];
        int A0E = c0541Hh.A0E();
        int i2 = A04[(A0E & 14) >> 1];
        if ((A0E & 1) != 0) {
            i2++;
        }
        if (((c0541Hh.A0E() & 30) >> 1) > 0 && (c0541Hh.A0E() & 2) != 0) {
            i2 += 2;
        }
        String A0A = A0A(9, 10, 48);
        if (c0541Hh.A04() > 0 && (c0541Hh.A0E() & 1) != 0) {
            A0A = A0A(19, 14, 124);
        }
        return Format.A07(str, A0A, null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0222, code lost:
    
        r18.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0229, code lost:
    
        if (r18.A0F() == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022b, code lost:
    
        r18.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0232, code lost:
    
        if (r18.A0F() == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0238, code lost:
    
        if (r18.A0F() == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x023a, code lost:
    
        r18.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0241, code lost:
    
        if (r18.A0F() == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0243, code lost:
    
        r18.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02bb, code lost:
    
        if (r7 != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0271, code lost:
    
        if (r18.A0F() != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0273, code lost:
    
        r18.A08(7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x027b, code lost:
    
        if (r18.A0F() == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x028c, code lost:
    
        if (com.facebook.ads.redexgen.X.A8.A01[6].charAt(31) == 'Q') goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x028e, code lost:
    
        r7 = com.facebook.ads.redexgen.X.A8.A01;
        r7[3] = "efqTs5tkRdGBLzL99Y2zBy0";
        r7[4] = "";
        r18.A08(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a9, code lost:
    
        r18.A08(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b1, code lost:
    
        if (r18.A0F() != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0205, code lost:
    
        if (r7 != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0207, code lost:
    
        r18.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x020e, code lost:
    
        if (r18.A0F() == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0210, code lost:
    
        r18.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0217, code lost:
    
        if (r18.A0F() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0219, code lost:
    
        r18.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0220, code lost:
    
        if (r18.A0F() == false) goto L143;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static A7 A09(C0540Hg c0540Hg) {
        String A0A;
        int A012;
        int i;
        int i2;
        int i3;
        int i4;
        int A042;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int A032 = c0540Hg.A03();
        c0540Hg.A08(40);
        boolean z = c0540Hg.A04(5) == 16;
        c0540Hg.A07(A032);
        int i11 = -1;
        if (!z) {
            A0A = A0A(0, 9, 26);
            c0540Hg.A08(32);
            int A043 = c0540Hg.A04(2);
            A012 = A01(A043, c0540Hg.A04(6));
            c0540Hg.A08(8);
            int A044 = c0540Hg.A04(3);
            if ((A044 & 1) == 0 || A044 == 1) {
                i = 2;
            } else {
                i = 2;
                c0540Hg.A08(2);
            }
            if ((A044 & 4) != 0) {
                c0540Hg.A08(i);
            }
            if (A044 == i) {
                c0540Hg.A08(i);
            }
            i2 = A05[A043];
            i3 = 1536;
            boolean A0F = c0540Hg.A0F();
            int[] iArr = A04;
            if (A01[6].charAt(31) != 'Q') {
                A01[2] = "4KahRN";
                i4 = iArr[A044] + (A0F ? 1 : 0);
                return new A7(A0A, i11, i4, i2, A012, i3);
            }
            throw new RuntimeException();
        }
        c0540Hg.A08(16);
        switch (c0540Hg.A04(2)) {
            case 0:
                i11 = 0;
                break;
            case 1:
                i11 = 1;
                break;
            case 2:
                i11 = 2;
                break;
            default:
                i11 = -1;
                break;
        }
        c0540Hg.A08(3);
        A012 = (c0540Hg.A04(11) + 1) * 2;
        int A045 = c0540Hg.A04(2);
        if (A045 == 3) {
            A042 = 3;
            i2 = A06[c0540Hg.A04(2)];
            i5 = 6;
        } else {
            A042 = c0540Hg.A04(2);
            String[] strArr = A01;
            if (strArr[3].length() != strArr[4].length()) {
                String[] strArr2 = A01;
                strArr2[7] = "8hYjpgfNHnAwS9QM7NBT3rLslQs0BeQi";
                strArr2[5] = "JdPcmmaJKVXmYa4gXJhhMISDBvQK9V8e";
                i5 = A03[A042];
                i2 = A05[A045];
            } else {
                i5 = A03[A042];
                i2 = A05[A045];
            }
        }
        i3 = i5 * 256;
        int A046 = c0540Hg.A04(3);
        boolean A0F2 = c0540Hg.A0F();
        i4 = A04[A046] + (A0F2 ? 1 : 0);
        c0540Hg.A08(10);
        if (c0540Hg.A0F()) {
            c0540Hg.A08(8);
        }
        if (A046 == 0) {
            c0540Hg.A08(5);
            if (c0540Hg.A0F()) {
                c0540Hg.A08(8);
            }
        }
        if (i11 == 1 && c0540Hg.A0F()) {
            c0540Hg.A08(16);
        }
        if (c0540Hg.A0F()) {
            if (A046 > 2) {
                c0540Hg.A08(2);
            }
            if ((A046 & 1) == 0 || A046 <= 2) {
                i9 = 6;
            } else {
                i9 = 6;
                c0540Hg.A08(6);
            }
            if ((A046 & 4) != 0) {
                c0540Hg.A08(i9);
            }
            if (A0F2 && c0540Hg.A0F()) {
                c0540Hg.A08(5);
            }
            if (i11 == 0) {
                if (c0540Hg.A0F()) {
                    i10 = 6;
                    c0540Hg.A08(6);
                } else {
                    i10 = 6;
                }
                if (A046 == 0 && c0540Hg.A0F()) {
                    c0540Hg.A08(i10);
                }
                if (c0540Hg.A0F()) {
                    c0540Hg.A08(i10);
                }
                int A047 = c0540Hg.A04(2);
                if (A047 == 1) {
                    c0540Hg.A08(5);
                } else if (A047 == 2) {
                    c0540Hg.A08(12);
                } else if (A047 == 3) {
                    int A048 = c0540Hg.A04(5);
                    if (c0540Hg.A0F()) {
                        c0540Hg.A08(5);
                        if (c0540Hg.A0F()) {
                            c0540Hg.A08(4);
                        }
                        if (c0540Hg.A0F()) {
                            c0540Hg.A08(4);
                        }
                        boolean A0F3 = c0540Hg.A0F();
                        String[] strArr3 = A01;
                        if (strArr3[1].charAt(20) != strArr3[0].charAt(20)) {
                            A01[2] = "kC";
                        } else {
                            A01[2] = "vcp8LN0Hh9uJKmo";
                        }
                    }
                    if (c0540Hg.A0F()) {
                        c0540Hg.A08(5);
                        String[] strArr4 = A01;
                        if (strArr4[3].length() != strArr4[4].length()) {
                            String[] strArr5 = A01;
                            strArr5[1] = "LWpchFhzl4zZLaolhYStszHUjMzJpa2W";
                            strArr5[0] = "6uYdOttcy9rqBmgvIK07scrDJCGtgIZT";
                        }
                    }
                    c0540Hg.A08((A048 + 2) * 8);
                    c0540Hg.A05();
                }
                if (A046 < 2) {
                    if (c0540Hg.A0F()) {
                        c0540Hg.A08(14);
                    }
                    if (A046 == 0 && c0540Hg.A0F()) {
                        c0540Hg.A08(14);
                    }
                }
                if (c0540Hg.A0F()) {
                    if (A042 == 0) {
                        c0540Hg.A08(5);
                    } else {
                        for (int i12 = 0; i12 < i5; i12++) {
                            if (c0540Hg.A0F()) {
                                c0540Hg.A08(5);
                            }
                        }
                    }
                }
            }
        }
        if (c0540Hg.A0F()) {
            c0540Hg.A08(5);
            if (A046 == 2) {
                c0540Hg.A08(4);
            }
            if (A046 >= 6) {
                c0540Hg.A08(2);
            }
            boolean A0F4 = c0540Hg.A0F();
            if (A01[6].charAt(31) != 'Q') {
                A01[6] = "dl0wWt6J8L8AikPCmNhR7kaZE8RAZ0S5";
                if (A0F4) {
                    i8 = 8;
                    c0540Hg.A08(8);
                } else {
                    i8 = 8;
                }
                if (A046 == 0 && c0540Hg.A0F()) {
                    c0540Hg.A08(i8);
                }
                i6 = 3;
                if (A045 < 3) {
                    c0540Hg.A06();
                }
            }
            throw new RuntimeException();
        }
        i6 = 3;
        if (i11 == 0 && A042 != i6) {
            c0540Hg.A06();
        }
        if (i11 != 2) {
            i7 = 6;
        } else if (A042 == i6 || c0540Hg.A0F()) {
            i7 = 6;
            c0540Hg.A08(6);
        } else {
            i7 = 6;
        }
        A0A = A0A(9, 10, 48);
        if (c0540Hg.A0F()) {
            int A049 = c0540Hg.A04(i7);
            String[] strArr6 = A01;
            if (strArr6[3].length() == strArr6[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr7 = A01;
            strArr7[1] = "3ApKKtyzWMiiSaP5bzYqsGtpnyYQD1rl";
            strArr7[0] = "8bIrpLiP8D9Hp4mjJ2yCsEloJ1XyNCEo";
            if (A049 == 1 && c0540Hg.A04(8) == 1) {
                A0A = A0A(19, 14, 124);
            }
        }
        return new A7(A0A, i11, i4, i2, A012, i3);
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{-69, -49, -66, -61, -55, -119, -69, -67, -115, -47, -27, -44, -39, -33, -97, -43, -47, -45, -93, Ascii.GS, 49, 32, 37, 43, -21, 33, Ascii.GS, Ascii.US, -17, -23, 38, 43, Ascii.US};
    }

    static {
        A0B();
        A03 = new int[]{1, 2, 3, 6};
        A05 = new int[]{48000, 44100, 32000};
        A06 = new int[]{24000, 22050, 16000};
        A04 = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
        A02 = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, Opcodes.IF_ICMPNE, Opcodes.CHECKCAST, 224, 256, 320, 384, 448, 512, 576, 640};
        A07 = new int[]{69, 87, 104, 121, Opcodes.F2I, Opcodes.FRETURN, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    }

    public static int A00() {
        return 1536;
    }

    public static int A01(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = A05;
        int halfFrmsizecod = iArr.length;
        if (i >= halfFrmsizecod || i2 < 0) {
            return -1;
        }
        int[] iArr2 = A07;
        int halfFrmsizecod2 = iArr2.length;
        if (i3 >= halfFrmsizecod2) {
            return -1;
        }
        int bitrate = iArr[i];
        if (bitrate == 44100) {
            int halfFrmsizecod3 = i2 % 2;
            return (iArr2[i3] + halfFrmsizecod3) * 2;
        }
        int sampleRate = A02[i3];
        if (bitrate == 32000) {
            int i4 = sampleRate * 6;
            if (A01[6].charAt(31) == 81) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "qimZQilZsB2lt3Dt1pYE9Xl";
            strArr[4] = "";
            return i4;
        }
        int halfFrmsizecod4 = sampleRate * 4;
        return halfFrmsizecod4;
    }

    public static int A02(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int startIndex = byteBuffer.limit();
        int i = startIndex - 10;
        for (int i2 = position; i2 <= i; i2++) {
            int startIndex2 = i2 + 4;
            int endIndex = byteBuffer.getInt(startIndex2);
            if ((endIndex & (-16777217)) == -1167101192) {
                return i2 - position;
            }
        }
        String[] strArr = A01;
        String str = strArr[7];
        String str2 = strArr[5];
        int endIndex2 = str.charAt(29);
        int startIndex3 = str2.charAt(29);
        if (endIndex2 == startIndex3) {
            throw new RuntimeException();
        }
        A01[2] = "FkGXqBuH9rf";
        return -1;
    }

    public static int A03(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            int[] iArr = A03;
            int fscod = byteBuffer.position();
            i = iArr[(byteBuffer.get(fscod + 4) & 48) >> 4];
        }
        int fscod2 = i * 256;
        return fscod2;
    }

    public static int A04(ByteBuffer byteBuffer, int i) {
        boolean isMlp = (byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187;
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + (isMlp ? 9 : 8)) >> 4) & 7);
    }

    public static int A05(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        int fscod = (bArr[4] & 192) >> 6;
        int frmsizecod = bArr[4] & 63;
        return A01(fscod, frmsizecod);
    }

    public static int A06(byte[] bArr) {
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111 || (bArr[7] & 254) != 186) {
            return 0;
        }
        boolean isMlp = (bArr[7] & 255) == 187;
        byte b = bArr[isMlp ? '\t' : '\b'];
        String[] strArr = A01;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "Qkic1459317rghhXW1uTsPZAwlwTKIiV";
        strArr2[0] = "TPYz26W0Cq4ZALktt0QhsmVlkvC9xybr";
        return 40 << ((b >> 4) & 7);
    }
}
