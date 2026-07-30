package com.realsil.sdk.dfu.s;

import com.google.common.primitives.UnsignedBytes;
import com.realsil.sdk.core.logger.ZLogger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import y5.u;

/* loaded from: classes4.dex */
public class d extends com.realsil.sdk.dfu.k.c {
    public boolean K = false;
    public boolean L = false;

    @Override // com.realsil.sdk.dfu.k.c
    public boolean a(byte[] bArr, int i8) {
        boolean z7;
        if (bArr == null) {
            return false;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        int remaining = wrap.remaining();
        if (remaining <= i8) {
            ZLogger.w(String.format("len(%d) <= offset(%d)", Integer.valueOf(remaining), Integer.valueOf(i8)));
            return false;
        }
        int i9 = remaining - i8;
        try {
            this.f15985c = wrap.get(i8) & 255;
            byte b8 = (byte) (wrap.get(i8 + 1) & 15);
            this.f15986d = b8;
            if (b8 < 4) {
                if (i9 >= 3) {
                    this.f15987e = wrap.get(i8 + 2) & 255;
                }
                if (i9 >= 4) {
                    byte b9 = wrap.get(i8 + 3);
                    this.f15988f = b9 & 255;
                    this.f15989g = (b9 & 1) != 0;
                    this.f15990h = ((b9 & 2) >> 1) != 0;
                    this.f15991i = (b9 & 4) >> 2;
                    this.f15992j = ((b9 & 8) >> 3) != 0;
                    this.f15993k = (b9 & 16) >> 4;
                    this.f16008z = ((b9 & 32) >> 5) != 0;
                    this.B = (b9 & 64) >> 6;
                    this.C = (b9 & UnsignedBytes.MAX_POWER_OF_TWO) >> 7;
                }
                if (i9 >= 5) {
                    this.A = wrap.get(i8 + 4) & 1;
                }
                if (i9 >= 7) {
                    this.f15997o = wrap.get(i8 + 6) & 255;
                }
                if (i9 >= 12) {
                    this.f15998p = wrap.getInt(i8 + 8);
                }
            } else {
                if (i9 >= 3) {
                    byte b10 = wrap.get(i8 + 2);
                    this.f15988f = b10 & 255;
                    this.f15989g = (b10 & 1) != 0;
                    this.f15990h = ((b10 & 2) >> 1) != 0;
                    this.f15991i = (b10 & 4) >> 2;
                    this.f15993k = (b10 & 8) >> 3;
                    this.f15995m = ((b10 & 16) >> 4) == 1;
                    int i10 = (b10 & a4.a.W0) >> 5;
                    this.K = i10 == 1;
                    this.L = i10 == 2;
                    this.I = (b10 & UnsignedBytes.MAX_POWER_OF_TWO) == 128;
                }
                if (i9 >= 4) {
                    byte b11 = wrap.get(i8 + 3);
                    int i11 = b11 & 3;
                    this.A = i11;
                    this.B = (b11 & 12) >> 2;
                    this.f16008z = i11 == 2;
                    this.D = ((b11 & 16) >> 4) != 0;
                    this.E = ((b11 & 32) >> 5) == 0;
                }
                if (i9 >= 5) {
                    this.f15997o = wrap.get(i8 + 4) & 255;
                }
                if (i9 >= 6) {
                    int i12 = wrap.get(i8 + 5) & 255;
                    this.f16002t.setActiveBankNumberIndicator(i12);
                    if (i12 == 0) {
                        this.f16001s = 0;
                        this.f15998p = 3;
                    } else if (i12 == 1) {
                        this.f16001s = 2;
                        this.f15998p = 1;
                    } else if (i12 == 2) {
                        this.f16001s = 1;
                        this.f15998p = 2;
                    }
                }
                if (i9 >= 8) {
                    this.f15999q = wrap.getShort(i8 + 6) & u.MAX_VALUE;
                }
                if (i9 >= 9) {
                    this.f16003u.setActiveBankNumberIndicator(wrap.get(i8 + 8) & 255);
                }
                if (this.f16002t.isBankSupported()) {
                    this.f16000r = true;
                    z7 = false;
                } else {
                    z7 = false;
                    this.f16000r = false;
                }
                if (i9 >= 10) {
                    byte b12 = wrap.get(i8 + 9);
                    this.F = (b12 & 4) == 4;
                    this.G = 1;
                    if (this.f15986d >= 10) {
                        if ((b12 & 8) == 8) {
                            z7 = true;
                        }
                        this.J = z7;
                    }
                }
                if (i9 >= 14 && this.f15986d >= 9) {
                    this.f16006x = wrap.getShort(i8 + 10) & u.MAX_VALUE;
                    this.f16007y = wrap.getShort(i8 + 12) & u.MAX_VALUE;
                }
            }
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
        }
        j();
        k();
        return true;
    }
}
