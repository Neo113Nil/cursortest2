package com.realsil.sdk.dfu.j;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.model.DfuBufferCheckConfig;

/* loaded from: classes4.dex */
public abstract class c {
    public static int a(int i8) {
        if (i8 - 3 > 16) {
            return (i8 / 16) * 16;
        }
        return 16;
    }

    public static int b(int i8) {
        if (i8 > 1048576) {
            return Math.max(((i8 / 1048576) + 1) * 4000, 10000);
        }
        return 10000;
    }

    public static long c(int i8) {
        if (i8 > 1048576) {
            return Math.max((((i8 / 1048576) + 1) * 4000) + 5000, 30000);
        }
        return 30000L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0020, code lost:
    
        if (r6 >= 32) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(int i8, int i9, int i10) {
        if (i8 == 2) {
            if (i9 > 16) {
                i10 = (i9 / 16) * 16;
            }
            i10 = 16;
        } else if (i8 == 1) {
            i10 = 256;
            if (i9 < 256) {
                i10 = 128;
                if (i9 < 128) {
                    i10 = 64;
                    if (i9 < 64) {
                        i10 = 32;
                    }
                }
            }
        }
        ZLogger.v(String.format("allocateBufferCheckPacketSize,mechanism=%d,mtuSize=%d/%d", Integer.valueOf(i8), Integer.valueOf(i10), Integer.valueOf(i9)));
        return i10;
    }

    public static int a(DfuBufferCheckConfig dfuBufferCheckConfig, int i8) {
        return a(dfuBufferCheckConfig.getMtuUpdateMechanism(), i8, dfuBufferCheckConfig.getPreferredMtuSize());
    }

    public static short a(byte[] bArr, int i8) {
        short s7 = 0;
        for (int i9 = 0; i9 < i8 / 2; i9++) {
            int i10 = i9 * 2;
            s7 = (short) (s7 ^ ((short) ((bArr[i10] & 255) | (bArr[i10 + 1] << 8))));
        }
        return (short) (((s7 & 255) << 8) | ((65280 & s7) >> 8));
    }
}
