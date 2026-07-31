package com.bytedance.sdk.openadsdk.oem;

import org.chromium.net.NetError;

/* loaded from: classes6.dex */
public class fs {
    public static int fs(int i) {
        if (i == 8) {
            return -3;
        }
        if (i == 10) {
            return -100;
        }
        if (i != 11) {
            return 0;
        }
        return NetError.ERR_CONNECTION_RESET;
    }

    public static int zmn(int i) {
        if (i == 2) {
            return 7;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i != 5) {
            return i != 6 ? 0 : 4;
        }
        return 3;
    }
}
