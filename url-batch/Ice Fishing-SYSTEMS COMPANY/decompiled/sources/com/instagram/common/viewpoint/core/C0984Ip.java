package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.k.p;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ip, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0984Ip {
    public static String[] A02 = {"FbN3icTzKhcmmOzEdUfRhsUcZXOxDMx7", "gRO2jrgUj", "b8s", "WfQv3ylCa", "vfaK2gbRuWFTNhe4O3MK62WfTyU3BnZK", "pVe6dBWT2JPKzaWtvTS73YU0fEYT7kcM", "E55gBTZIZGS8er9hAJqyKM4XsX", "9GOGOeqncrOiIcn9"};
    public int A00;
    public final C06464v A01 = new C06464v(8);

    /* JADX WARN: Incorrect condition in loop: B:7:0x001f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long A00(InterfaceC2190ms interfaceC2190ms) throws IOException {
        interfaceC2190ms.AGt(this.A01.A0l(), 0, 1);
        int i = this.A01.A0l()[0] & 255;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int mask = 128;
        int length = 0;
        while (value == 0) {
            mask >>= 1;
            length++;
        }
        int value = ~mask;
        int i4 = i & value;
        interfaceC2190ms.AGt(this.A01.A0l(), 1, length);
        for (int i9 = 0; i9 < length; i9++) {
            int value2 = i9 + 1;
            i4 = (i4 << 8) + (this.A01.A0l()[value2] & p.f8630b);
        }
        int mask2 = this.A00;
        int value3 = length + 1;
        this.A00 = mask2 + value3;
        return i4;
    }

    public final boolean A01(InterfaceC2190ms interfaceC2190ms) throws IOException {
        long A8O = interfaceC2190ms.A8O();
        long j9 = 1024;
        if (A8O != -1 && A8O <= 1024) {
            j9 = A8O;
        }
        int i = (int) j9;
        boolean z8 = false;
        interfaceC2190ms.AGt(this.A01.A0l(), 0, 4);
        long A0Q = this.A01.A0Q();
        this.A00 = 4;
        while (A0Q != 440786851) {
            int i4 = this.A00 + 1;
            this.A00 = i4;
            if (i4 == i) {
                return false;
            }
            interfaceC2190ms.AGt(this.A01.A0l(), 0, 1);
            long j10 = A0Q << 8;
            if (A02[5].charAt(9) == 'Z') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[7] = "keWgERcis7TdroPm";
            strArr[2] = "OXY";
            A0Q = (j10 & (-256)) | (this.A01.A0l()[0] & 255);
        }
        long A00 = A00(interfaceC2190ms);
        int i9 = this.A00;
        String[] strArr2 = A02;
        if (strArr2[7].length() == strArr2[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr3 = A02;
        strArr3[0] = "8USntBNRnGq1k7YndUZ918x7mjNkxlAo";
        strArr3[4] = "NlU12704XsvvTftMDquGsme1zZ9M6Gib";
        long j11 = i9;
        if (A00 == Long.MIN_VALUE) {
            return false;
        }
        if (A8O != -1 && j11 + A00 >= A8O) {
            return false;
        }
        while (this.A00 < j11 + A00) {
            if (A00(interfaceC2190ms) == Long.MIN_VALUE) {
                return z8;
            }
            long A002 = A00(interfaceC2190ms);
            String[] strArr4 = A02;
            if (strArr4[0].charAt(12) != strArr4[4].charAt(12)) {
                String[] strArr5 = A02;
                strArr5[0] = "WOjoKoWSnEX2mR88EDllzX7MR8FXWjEu";
                strArr5[4] = "zFQ8S5RVgPrJFIVyTDDE2qr0iqJgcsXB";
                if (A002 < 0) {
                    return false;
                }
            } else {
                A02[6] = "uJmDg5c2xISP09FpPwUdNktwoy";
                if (A002 < 0) {
                    return false;
                }
            }
            if (A002 > 2147483647L) {
                return false;
            }
            if (A002 != 0) {
                int i10 = (int) A002;
                interfaceC2190ms.A47(i10);
                this.A00 += i10;
            }
            z8 = false;
        }
        return ((long) this.A00) == j11 + A00;
    }
}
