package com.realsil.sdk.dfu.q;

import com.realsil.sdk.core.logger.ZLogger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import y5.u;

/* loaded from: classes4.dex */
public class b extends com.realsil.sdk.dfu.k.c {
    @Override // com.realsil.sdk.dfu.k.c
    public boolean a(byte[] bArr, int i8) {
        String format;
        if (bArr == null) {
            return false;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        int remaining = wrap.remaining();
        if (remaining <= i8) {
            format = String.format("len(%d) <= offset(%d)", Integer.valueOf(remaining), Integer.valueOf(i8));
        } else {
            int i9 = remaining - i8;
            if (i9 >= 7) {
                try {
                    this.f15985c = wrap.get(i8) & 255;
                    this.f15986d = (byte) (wrap.get(i8 + 1) & 15);
                    byte b8 = wrap.get(i8 + 2);
                    this.f15988f = b8 & 255;
                    this.f15989g = (b8 & 1) != 0;
                    this.f15990h = ((b8 & 2) >> 1) != 0;
                    this.f15991i = (b8 & 4) >> 2;
                    this.f15993k = (b8 & 8) >> 3;
                    this.f15995m = ((b8 & 16) >> 4) == 1;
                    this.F = (b8 & 32) == 32;
                    this.G = 0;
                    this.f15997o = wrap.getShort(i8 + 4) & u.MAX_VALUE;
                    int i10 = wrap.get(i8 + 6) & 255;
                    this.f16002t.setActiveBankNumberIndicator(i10);
                    if (i10 == 0) {
                        this.f16001s = 0;
                        this.f15998p = 3;
                    } else if (i10 == 1) {
                        this.f16001s = 2;
                        this.f15998p = 1;
                    } else if (i10 == 2) {
                        this.f16001s = 1;
                        this.f15998p = 2;
                    }
                    if (i9 >= 8) {
                        this.f16003u.setActiveBankNumberIndicator(wrap.get(i8 + 7) & 255);
                    }
                    if (i9 >= 9) {
                        this.f16004v.setActiveBankNumberIndicator(wrap.get(i8 + 8) & 255);
                    }
                    if (this.f16002t.isBankSupported()) {
                        this.f16000r = true;
                    } else {
                        this.f16000r = false;
                    }
                    if (i9 >= 11) {
                        this.f16006x = wrap.getShort(i8 + 9) & u.MAX_VALUE;
                    }
                } catch (Exception e8) {
                    ZLogger.w(e8.toString());
                }
                k();
                return true;
            }
            format = String.format("len(%d) <= PAYLOAD_LENGTH(%d)", Integer.valueOf(i9), 7);
        }
        ZLogger.w(format);
        return false;
    }

    @Override // com.realsil.sdk.dfu.k.c
    public void k() {
        if (this.f16002t.isBankSupported()) {
            this.f16005w = 2;
            return;
        }
        if (this.f15993k != 1) {
            this.f16005w = 1;
        } else if (this.f15997o > 0) {
            this.f16005w = 3;
        } else {
            this.f16005w = 2;
        }
    }
}
