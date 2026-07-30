package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class LI {
    public static String[] A00 = {"zHvJnNiJi0M", "FniiyLS950t5mTu4QlbfX1TrXuc", "I7PZw93cjLP5IpZ6BbWCD", "9iobBdNwIxtUK2g", "LhRCEY8vP1M7TerIjGAXS82kM3fiu", "vMv2t0fFsfhvwPnbOb52fPF3dg3aW", "XvTrrYiBPPp7CW1", "g12euaG6mbsrKt48m9yyXN0g2MG"};

    public static int A00(byte[] bArr, int i, int i4) {
        while (i < i4 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long A01(C06464v c06464v, int i, int i4) {
        c06464v.A0f(i);
        if (c06464v.A07() < 5) {
            return b.f6539b;
        }
        int pid = c06464v.A0C();
        int tsPacketHeader = 8388608 & pid;
        if (tsPacketHeader != 0) {
            return b.f6539b;
        }
        int tsPacketHeader2 = 2096896 & pid;
        if ((tsPacketHeader2 >> 8) != i4) {
            return b.f6539b;
        }
        int tsPacketHeader3 = pid & 32;
        int tsPacketHeader4 = tsPacketHeader3 != 0 ? 1 : 0;
        if (tsPacketHeader4 == 0) {
            return b.f6539b;
        }
        int tsPacketHeader5 = c06464v.A0I();
        if (tsPacketHeader5 >= 7) {
            int tsPacketHeader6 = c06464v.A07();
            if (tsPacketHeader6 >= 7) {
                int tsPacketHeader7 = c06464v.A0I();
                if ((tsPacketHeader7 & 16) == 16) {
                    byte[] bArr = new byte[6];
                    int tsPacketHeader8 = bArr.length;
                    c06464v.A0k(bArr, 0, tsPacketHeader8);
                    long A02 = A02(bArr);
                    String[] strArr = A00;
                    String str = strArr[4];
                    String str2 = strArr[5];
                    int pid2 = str.length();
                    int tsPacketHeader9 = str2.length();
                    if (pid2 != tsPacketHeader9) {
                        throw new RuntimeException();
                    }
                    A00[2] = "oAb2qjZGj";
                    return A02;
                }
            }
        }
        return b.f6539b;
    }

    public static long A02(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }

    public static boolean A03(byte[] bArr, int i, int i4, int i9) {
        int i10 = 0;
        for (int i11 = -4; i11 <= 4; i11++) {
            int i12 = i11 * 188;
            String[] strArr = A00;
            String str = strArr[3];
            String str2 = strArr[6];
            int i13 = str.length();
            int consecutiveSyncByteCount = str2.length();
            if (i13 != consecutiveSyncByteCount) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[3] = "Qn38sx03S77VT5y";
            strArr2[6] = "gfX0N6dqp84BCDo";
            int i14 = i12 + i9;
            if (i14 >= i && i14 < i4) {
                int i15 = bArr[i14];
                if (i15 == 71) {
                    i10++;
                    if (i10 == 5) {
                        return true;
                    }
                }
            }
            i10 = 0;
        }
        return false;
    }
}
