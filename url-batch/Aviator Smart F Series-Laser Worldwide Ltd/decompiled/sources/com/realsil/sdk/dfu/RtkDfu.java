package com.realsil.sdk.dfu;

import android.content.Context;
import com.realsil.sdk.core.bluetooth.BluetoothProfileManager;
import com.realsil.sdk.core.bluetooth.GlobalGatt;
import com.realsil.sdk.core.bluetooth.RtkBluetoothManager;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class RtkDfu {
    public static boolean DEBUG_ENABLE = true;
    public static boolean TDBG = false;
    public static boolean VDBG = false;

    public static void initialize(Context context) {
        initialize(context, false);
    }

    public static void initialize(Context context, boolean z7) {
        DEBUG_ENABLE = z7;
        VDBG = true;
        ZLogger.d(true, String.format(Locale.US, "{\nLIBRARY_PACKAGE_NAME=%s\n%s:%s:%s\nDEBUG=%b\nBUILD_TYPE=%s\nDEBUG_ENABLE=%b\n}", "com.realsil.sdk.dfu", "com.realsil.sdk", "rtk-dfu", "3.13.23", Boolean.FALSE, "release", Boolean.valueOf(DEBUG_ENABLE)));
        if (GlobalGatt.getInstance() == null) {
            GlobalGatt.initial(context);
        }
        BluetoothProfileManager.initial(context);
        RtkBluetoothManager.initial(context);
        BaseBinInputStream.MPHEADER_PARSE_FORMAT = BaseBinInputStream.MPHEADER_PARSE_MARK;
    }
}
