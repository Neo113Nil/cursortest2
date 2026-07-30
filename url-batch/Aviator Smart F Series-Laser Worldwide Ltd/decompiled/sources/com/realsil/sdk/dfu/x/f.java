package com.realsil.sdk.dfu.x;

import com.google.common.primitives.UnsignedBytes;
import com.realsil.sdk.core.logger.ZLogger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import y5.u;

/* loaded from: classes4.dex */
public class f extends com.realsil.sdk.dfu.k.c {
    public boolean K = false;
    public boolean L = false;

    public final void a(int i8, ByteBuffer byteBuffer, int i9) {
        if (i8 >= 3) {
            byte b8 = byteBuffer.get(i9 + 2);
            this.f15988f = b8 & 255;
            this.f15989g = (b8 & 1) != 0;
            this.f15990h = ((b8 & 2) >> 1) != 0;
            this.f15991i = (b8 & 4) >> 2;
            this.f15993k = (b8 & 8) >> 3;
            int i10 = (b8 & 48) >> 4;
            this.K = i10 == 1;
            this.L = i10 == 2;
            this.I = (b8 & 64) == 64;
            this.F = (b8 & UnsignedBytes.MAX_POWER_OF_TWO) == 128;
            this.G = 1;
        }
        if (i8 >= 4) {
            byte b9 = byteBuffer.get(i9 + 3);
            int i11 = b9 & 3;
            this.A = i11;
            this.B = (b9 & 12) >> 2;
            this.f16008z = i11 == 2;
            this.D = ((b9 & 16) >> 4) != 0;
            this.E = ((b9 & 32) >> 5) == 0;
        }
        if (i8 >= 5) {
            this.f15997o = byteBuffer.get(i9 + 4) & 255;
        }
        if (i8 >= 6) {
            int i12 = byteBuffer.get(i9 + 5) & 255;
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
        if (i8 >= 8) {
            this.f15999q = byteBuffer.getShort(i9 + 6) & u.MAX_VALUE;
        }
        if (i8 >= 9) {
            this.f16003u.setActiveBankNumberIndicator(byteBuffer.get(i9 + 8) & 255);
        }
        if (this.f16002t.isBankSupported()) {
            this.f16000r = true;
        } else {
            this.f16000r = false;
        }
        if (this.f15986d >= 11 && i8 >= 13) {
            this.f16006x = byteBuffer.getShort(i9 + 9) & u.MAX_VALUE;
            this.f16007y = 65535 & byteBuffer.getShort(i9 + 11);
        }
        if (this.f15986d < 12 || i8 < 14) {
            return;
        }
        this.J = (byteBuffer.get(i9 + 13) & 1) != 0;
    }

    public final void b(int i8, ByteBuffer byteBuffer, int i9) {
        if (i8 >= 3) {
            this.f15987e = byteBuffer.get(i9 + 2);
        }
        if (i8 >= 4) {
            byte b8 = byteBuffer.get(i9 + 3);
            this.f15988f = b8 & 255;
            this.f15989g = (b8 & 1) != 0;
            this.f15990h = ((b8 & 2) >> 1) != 0;
            this.f15991i = (b8 & 4) >> 2;
            this.f15992j = ((b8 & 8) >> 3) != 0;
            this.f15993k = (b8 & 16) >> 4;
            this.f16008z = ((b8 & 32) >> 5) != 0;
            this.B = (b8 & 64) >> 6;
        }
        if (i8 >= 5) {
            this.A = byteBuffer.get(i9 + 4) & 1;
        }
        if (i8 >= 7) {
            this.f15997o = byteBuffer.get(i9 + 6) & 255;
        }
        if (i8 >= 12) {
            this.f15998p = byteBuffer.getInt(i9 + 8);
        }
        j();
    }

    @Override // com.realsil.sdk.dfu.k.c
    public boolean a(byte[] bArr, int i8) {
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
        if (i9 >= 1) {
            this.f15985c = wrap.get(i8) & 255;
        }
        if (i9 >= 2) {
            this.f15986d = (byte) (wrap.get(i8 + 1) & 15);
        }
        if (this.f15986d <= 5) {
            b(i9, wrap, i8);
        } else {
            a(i9, wrap, i8);
        }
        k();
        return true;
    }
}
