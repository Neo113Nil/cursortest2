package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.k.p;
import com.anythink.core.common.s.a.c;
import com.facebook.ads.AdError;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Gu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0937Gu {
    public static byte[] A00;
    public static String[] A01 = {"xbfghvjfzJvhku5N8OELiq204nVuVPFf", "QHdNkhaNqF6P8ZoHbM5E7ac9pSEOFT0I", "gTrjGkh7SJSYjcOCOWWCub6Uckq9Yltj", "B1r", "bt5fTN19iCcMkB3LBJCDNqZ6iO4ZjItL", "3vLSrbB7SQdOWYeFWsx", "mXdQOoT87saNovPMynKxKkWZ", "FMZbalTyTizDclIiFtsmYNu0onhdvCq9"};
    public static final int[] A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C0936Gt A04(C06454u c06454u) {
        int A04 = c06454u.A04(16);
        int A042 = c06454u.A04(16);
        int i = 0 + 2 + 2;
        if (A042 == 65535) {
            A042 = c06454u.A04(24);
            i += 3;
        }
        int i4 = A042 + i;
        if (A04 == 44097) {
            i4 += 2;
        }
        int A043 = c06454u.A04(2);
        if (A043 == 3) {
            A043 += A00(c06454u, 2);
            String[] strArr = A01;
            if (strArr[1].charAt(27) != strArr[4].charAt(27)) {
                A01[3] = "JeV";
            }
            throw new RuntimeException();
        }
        int A044 = c06454u.A04(10);
        if (c06454u.A0H() && c06454u.A04(3) > 0) {
            c06454u.A09(2);
        }
        boolean A0H = c06454u.A0H();
        if (A01[5].length() != 0) {
            A01[7] = "lwIINFZkQEgov7IcPWK4ANnqSDhXt22f";
            int i9 = A0H ? 48000 : 44100;
            int A045 = c06454u.A04(4);
            int i10 = 0;
            if (i9 != 44100 || A045 != 13) {
                if (i9 == 48000 && A045 < A02.length) {
                    i10 = A02[A045];
                    switch (A044 % 5) {
                        case 1:
                        case 3:
                            if (A045 == 3 || A045 == 8) {
                                i10++;
                                break;
                            }
                        case 2:
                            if (A045 == 8 || A045 == 11) {
                                i10++;
                                break;
                            }
                        case 4:
                            if (A045 == 3 || A045 == 8 || A045 == 11) {
                                i10++;
                                break;
                            }
                    }
                }
            } else {
                i10 = A02[A045];
            }
            return new C0936Gt(A043, 2, i9, i4, i10);
        }
        throw new RuntimeException();
    }

    public static String A05(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            byte b9 = copyOfRange[i10];
            if (A01[7].charAt(26) == 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "ZZS15YLfqnGzRKQmbGGBAS62S7daT6Pr";
            strArr[0] = "wbQ3s0ZhLtikxP7PtpYOpvXFjSSpaatC";
            copyOfRange[i10] = (byte) ((b9 - i9) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{-121, -101, -118, -113, -107, 85, -121, -119, 90};
    }

    static {
        A06();
        A02 = new int[]{AdError.CACHE_ERROR_CODE, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    }

    public static int A00(C06454u c06454u, int i) {
        int i4 = 0;
        while (true) {
            int value = c06454u.A04(i);
            int i9 = i4 + value;
            if (!c06454u.A0H()) {
                return i9;
            }
            i4 = (i9 + 1) << i;
        }
    }

    public static int A01(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return A04(new C06454u(bArr)).A03;
    }

    public static int A02(byte[] bArr, int i) {
        if (bArr.length < 7) {
            return -1;
        }
        int headerSize = bArr[2];
        int i4 = (headerSize & p.f8630b) << 8;
        int headerSize2 = bArr[3];
        int i9 = i4 | (headerSize2 & p.f8630b);
        int frameSize = 2 + 2;
        if (i9 == 65535) {
            int headerSize3 = bArr[4];
            int i10 = (headerSize3 & p.f8630b) << 16;
            int headerSize4 = bArr[5];
            int i11 = i10 | ((headerSize4 & p.f8630b) << 8);
            int headerSize5 = bArr[6];
            i9 = i11 | (headerSize5 & p.f8630b);
            frameSize += 3;
        }
        if (i == 44097) {
            frameSize += 2;
        }
        int i12 = i9 + frameSize;
        String[] strArr = A01;
        String str = strArr[1];
        String str2 = strArr[4];
        int charAt = str.charAt(27);
        int headerSize6 = str2.charAt(27);
        if (charAt == headerSize6) {
            throw new RuntimeException();
        }
        A01[7] = "5dLepgbvmcODZNjBgadRz1gh8sb0vEN9";
        return i12;
    }

    public static C2399qI A03(C06464v c06464v, String str, String str2, DrmInitData drmInitData) {
        c06464v.A0g(1);
        return new C05902p().A0y(str).A11(A05(0, 9, 31)).A0b(2).A0m(((c06464v.A0I() & 32) >> 5) == 1 ? 48000 : 44100).A0u(drmInitData).A10(str2).A14();
    }

    public static void A07(int i, C06464v c06464v) {
        c06464v.A0d(7);
        byte[] A0l = c06464v.A0l();
        A0l[0] = -84;
        A0l[1] = c.f16475b;
        A0l[2] = -1;
        A0l[3] = -1;
        A0l[4] = (byte) ((i >> 16) & p.f8630b);
        A0l[5] = (byte) ((i >> 8) & p.f8630b);
        A0l[6] = (byte) (i & p.f8630b);
    }
}
