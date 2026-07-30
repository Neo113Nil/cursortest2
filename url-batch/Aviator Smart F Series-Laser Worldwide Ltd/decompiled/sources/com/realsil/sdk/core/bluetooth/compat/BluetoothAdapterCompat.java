package com.realsil.sdk.core.bluetooth.compat;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.realsil.sdk.core.logger.ZLogger;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class BluetoothAdapterCompat {
    public static final String ACTION_BLE_ACL_CONNECTED = "android.bluetooth.adapter.action.BLE_ACL_CONNECTED";
    public static final String ACTION_BLE_ACL_DISCONNECTED = "android.bluetooth.adapter.action.BLE_ACL_DISCONNECTED";

    public static BluetoothAdapter getBluetoothAdapter(Context context) {
        if (context == null) {
            return BluetoothAdapter.getDefaultAdapter();
        }
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        if (bluetoothManager != null) {
            return bluetoothManager.getAdapter();
        }
        ZLogger.w("Unable to initialize BluetoothManager.");
        return BluetoothAdapter.getDefaultAdapter();
    }

    public static int getConnectionState(BluetoothAdapter bluetoothAdapter) {
        if (bluetoothAdapter == null) {
            ZLogger.w("BT is not enabled");
            return 0;
        }
        try {
            Method method = bluetoothAdapter.getClass().getMethod("getConnectionState", null);
            method.setAccessible(true);
            return ((Integer) method.invoke(bluetoothAdapter, null)).intValue();
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0;
        }
    }

    public static boolean isAddressRandomStatic(@NonNull String str) {
        Objects.requireNonNull(str);
        return BluetoothAdapter.checkBluetoothAddress(str) && (Integer.parseInt(str.split(":")[0], 16) & PsExtractor.AUDIO_STREAM) == 192;
    }
}
