package com.realsil.sdk.core.bluetooth.scanner;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public abstract class ScannerCallback {
    public void onAutoScanTrigger() {
    }

    public void onNewDevice(@NonNull ExtendedBluetoothDevice extendedBluetoothDevice) {
    }

    public void onScanStateChanged(int i8) {
    }
}
