package com.realsil.sdk.core.bluetooth.connection.le;

import com.realsil.sdk.core.bluetooth.connection.BluetoothClientCallback;

/* loaded from: classes4.dex */
public abstract class BluetoothGattClientCallback extends BluetoothClientCallback {
    public static final int CONNECT_ERROR = 8;
    public static final int DEVICE_CONNECTED = 9;
    public static final int DISCOVERY_SERVICE_FAILED = 3;
    public static final int DISCOVERY_SERVICE_TIMEOUT = 4;
    public static final int ENABLE_CCCD_EXCEPTION = 6;
    public static final int ENABLE_CCCD_FAILED = 5;
    public static final int ENABLE_CCCD_TIMEOUT = 7;
}
