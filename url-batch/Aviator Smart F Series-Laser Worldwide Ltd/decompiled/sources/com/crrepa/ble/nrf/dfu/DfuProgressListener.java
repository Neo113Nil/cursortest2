package com.crrepa.ble.nrf.dfu;

/* loaded from: classes3.dex */
public interface DfuProgressListener {
    void onDeviceConnected(String str);

    void onDeviceConnecting(String str);

    void onDeviceDisconnected(String str);

    void onDeviceDisconnecting(String str);

    void onDfuAborted(String str);

    void onDfuCompleted(String str);

    void onDfuProcessStarted(String str);

    void onDfuProcessStarting(String str);

    void onEnablingDfuMode(String str);

    void onError(String str, int i8, int i9, String str2);

    void onFirmwareValidating(String str);

    void onProgressChanged(String str, int i8, float f8, float f9, int i9, int i10);
}
