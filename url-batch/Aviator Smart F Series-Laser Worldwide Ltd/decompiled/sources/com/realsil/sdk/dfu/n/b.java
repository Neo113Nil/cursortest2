package com.realsil.sdk.dfu.n;

import com.realsil.sdk.core.logger.ZLogger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import y5.u;

/* loaded from: classes4.dex */
public final class b extends com.realsil.sdk.dfu.k.c {
    @Override // com.realsil.sdk.dfu.k.c
    public void a(int i8) {
        super.a(i8);
        this.f15989g = (i8 & 1) != 0;
        this.f15990h = ((i8 & 2) >> 1) != 0;
        this.f15991i = (i8 & 4) >> 2;
        this.f15992j = ((i8 & 8) >> 3) != 0;
        this.f15993k = (i8 & 16) >> 4;
        int i9 = this.f15986d;
        if (i9 >= 4) {
            this.f15994l = ((i8 & 32) >> 5) != 0;
        } else if (i9 == 3) {
            this.f15994l = true;
        } else {
            this.f15994l = false;
        }
        if (i9 >= 5) {
            this.F = (i8 & 64) == 64;
        } else {
            this.F = false;
        }
    }

    @Override // com.realsil.sdk.dfu.k.c
    public void k() {
        if (this.f16000r) {
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
                this.f15987e = wrap.get(i8 + 2) & 255;
            }
            if (i9 >= 4) {
                a(wrap.get(i8 + 3));
            }
            if (i9 >= 5) {
                this.f15996n = wrap.getShort(i8 + 4) & u.MAX_VALUE;
            }
            if (i9 >= 7) {
                this.f15997o = wrap.get(i8 + 6) & 255;
            }
            if (i9 >= 12) {
                this.f15998p = wrap.getInt(i8 + 8);
            }
            if (i9 >= 14 && this.f15986d >= 4) {
                this.f16006x = wrap.getShort(i8 + 12) & u.MAX_VALUE;
            }
            if (i9 >= 16 && this.f15986d >= 5) {
                this.f16007y = wrap.getShort(i8 + 14) & u.MAX_VALUE;
            }
            j();
            k();
            return true;
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
            return true;
        }
    }
}
