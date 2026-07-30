package com.realsil.sdk.core;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import com.realsil.sdk.core.bluetooth.BluetoothProfileManager;
import com.realsil.sdk.core.bluetooth.GlobalGatt;
import com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattClientManagerImpl;
import com.realsil.sdk.core.logger.ZLogger;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class RtkCore {
    public static boolean DEBUG = false;
    public static boolean TDBG = false;
    public static boolean VDBG = false;

    /* renamed from: a, reason: collision with root package name */
    public static Context f15396a;

    public static String getVersion() {
        return "1.7.14";
    }

    public static synchronized void initialize(Context context, @NonNull RtkConfigure rtkConfigure) {
        synchronized (RtkCore.class) {
            try {
                if (f15396a == null) {
                    f15396a = context.getApplicationContext();
                }
                ZLogger.v(true, "com.realtek.sdk:rtk-core:1.7.14");
                DEBUG = rtkConfigure.isDebugEnabled();
                VDBG = rtkConfigure.isDevModeEnabled();
                TDBG = rtkConfigure.isDumpDataEnabled();
                ZLogger.initialize(rtkConfigure.getLogTag(), rtkConfigure.isPrintLog(), rtkConfigure.getGlobalLogLevel());
                ZLogger.d(rtkConfigure.toString());
                if (GlobalGatt.getInstance() == null) {
                    GlobalGatt.initial(f15396a);
                }
                if (BluetoothGattClientManagerImpl.getInstance() == null) {
                    BluetoothGattClientManagerImpl.initial(f15396a);
                }
                BluetoothProfileManager.initial(f15396a);
                StringBuilder sb = new StringBuilder("DeviceInfo{");
                sb.append("SDK_INT: " + Build.VERSION.SDK_INT);
                sb.append("\nDevice name: " + Build.DEVICE);
                sb.append("\nAndroid Version: " + Build.VERSION.RELEASE);
                sb.append("\nManufacture: " + Build.MANUFACTURER);
                sb.append("\nModel: " + Build.MODEL);
                sb.append("\nsupportedABIS: " + Arrays.toString(Build.SUPPORTED_ABIS));
                sb.append("}");
                ZLogger.d(sb.toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean isBluetoothSupported() {
        return BluetoothGattClientManagerImpl.getInstance().isBluetoothSupported();
    }
}
