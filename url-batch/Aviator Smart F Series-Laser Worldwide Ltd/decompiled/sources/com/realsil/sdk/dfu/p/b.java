package com.realsil.sdk.dfu.p;

import com.google.common.primitives.UnsignedBytes;
import com.realsil.sdk.core.logger.ZLogger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import y5.u;

/* loaded from: classes4.dex */
public final class b extends com.realsil.sdk.dfu.k.c {
    public int K = 0;
    public int L = 0;
    public boolean M;

    @Override // com.realsil.sdk.dfu.k.c
    public boolean a(byte[] bArr, int i8) {
        if (bArr == null) {
            return false;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        int remaining = wrap.remaining();
        if (remaining <= i8) {
            return false;
        }
        int i9 = remaining - i8;
        try {
            this.f15985c = wrap.get(i8) & 255;
            this.f15986d = (byte) (wrap.get(i8 + 1) & 15);
            if (i9 >= 3) {
                byte b8 = wrap.get(i8 + 2);
                this.f15988f = b8 & 255;
                this.f15989g = (b8 & 1) != 0;
                this.f15990h = ((b8 & 2) >> 1) != 0;
                this.f15991i = (b8 & 4) >> 2;
                this.f15993k = (b8 & 8) >> 3;
                this.f15995m = ((b8 & 16) >> 4) == 1;
                this.H = ((b8 & 32) >> 5) == 1;
                this.F = (b8 & 64) == 64;
                this.G = 1;
                this.J = ((b8 & UnsignedBytes.MAX_POWER_OF_TWO) >> 7) == 1;
            }
            if (i9 >= 4) {
                byte b9 = wrap.get(i8 + 3);
                int i10 = b9 & 3;
                this.K = i10;
                this.L = (b9 & 12) >> 2;
                this.M = i10 == 2;
            }
            if (i9 >= 6) {
                this.f15997o = wrap.getShort(i8 + 4) & u.MAX_VALUE;
            }
            if (i9 >= 7) {
                int i11 = wrap.get(i8 + 6) & 255;
                this.f16002t.setActiveBankNumberIndicator(i11);
                if (i11 == 0) {
                    this.f16001s = 0;
                    this.f15998p = 3;
                } else if (i11 == 1) {
                    this.f16001s = 2;
                    this.f15998p = 1;
                } else if (i11 == 2) {
                    this.f16001s = 1;
                    this.f15998p = 2;
                }
            }
            if (i9 >= 9) {
                this.f15999q = wrap.getShort(i8 + 7) & u.MAX_VALUE;
            }
            if (i9 >= 10) {
                this.f16003u.setActiveBankNumberIndicator(wrap.get(i8 + 9) & 255);
            }
            if (this.f16002t.isBankSupported()) {
                this.f16000r = true;
            } else {
                this.f16000r = false;
            }
            if (this.f15986d >= 4 && i9 >= 13) {
                this.f16006x = wrap.getShort(i8 + 10) & u.MAX_VALUE;
                this.f16007y = wrap.getShort(i8 + 12) & u.MAX_VALUE;
            }
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
        }
        k();
        return true;
    }
}
