package com.realsil.sdk.dfu.e;

import com.realsil.sdk.core.bluetooth.connection.le.GattError;

/* loaded from: classes4.dex */
public abstract class a {
    public static int a(int i8) {
        switch (i8) {
            case 10128:
                return 0;
            case 10129:
                return 1;
            case 10130:
                return 2;
            case 10131:
                return 3;
            case 10132:
                return 4;
            case 10133:
                return 5;
            case 10134:
                return 6;
            case 10135:
                return 7;
            case 10136:
                return 8;
            default:
                return GattError.GATT_PRC_IN_PROGRESS;
        }
    }

    public static int a(long j8, long j9) {
        if (j8 > j9) {
            return 1;
        }
        return j8 == j9 ? 0 : -1;
    }
}
