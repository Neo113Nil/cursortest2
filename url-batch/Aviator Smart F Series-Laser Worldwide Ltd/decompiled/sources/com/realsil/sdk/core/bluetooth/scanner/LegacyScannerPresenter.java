package com.realsil.sdk.core.bluetooth.scanner;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import com.realsil.sdk.core.d.i;
import com.realsil.sdk.core.logger.ZLogger;
import java.util.List;

/* loaded from: classes4.dex */
public final class LegacyScannerPresenter extends i {
    public LegacyScannerPresenter(Context context) {
        super(context, null, null, null);
    }

    public BluetoothAdapter getBluetoothAdapter() {
        return this.f15661i;
    }

    @Override // com.realsil.sdk.core.d.f
    public /* bridge */ /* synthetic */ BluetoothDevice getPairedDevice(String str) {
        return super.getPairedDevice(str);
    }

    @Override // com.realsil.sdk.core.d.f
    public /* bridge */ /* synthetic */ List getPairedDevices() {
        return super.getPairedDevices();
    }

    @Override // com.realsil.sdk.core.d.f
    public /* bridge */ /* synthetic */ List getPairedDevicesByProfile(int i8) {
        return super.getPairedDevicesByProfile(i8);
    }

    public int getState() {
        return this.f15662j;
    }

    @Override // com.realsil.sdk.core.d.f
    public /* bridge */ /* synthetic */ boolean isBluetoothEnabled() {
        return super.isBluetoothEnabled();
    }

    public boolean isBluetoothSupported() {
        return this.f15661i != null;
    }

    @Override // com.realsil.sdk.core.d.f
    public boolean isScanning() {
        int i8 = this.f15662j;
        return i8 == 2 || i8 == 1;
    }

    @Override // com.realsil.sdk.core.d.i, com.realsil.sdk.core.d.f
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public boolean scanDevice(boolean z7) {
        synchronized (this) {
            try {
                if (z7) {
                    return startScan();
                }
                return stopScan();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setScanMode(int i8) {
        ScannerParams scannerParams = this.f15657e;
        if (scannerParams != null) {
            scannerParams.setScanMode(i8);
        }
    }

    public void setScannerCallback(ScannerCallback scannerCallback) {
        this.f15658f = scannerCallback;
        if (scannerCallback == null) {
            ZLogger.v(this.f15654b, "callback is null");
        }
    }

    public void setScannerParams(ScannerParams scannerParams) {
        this.f15657e = scannerParams;
    }

    @Override // com.realsil.sdk.core.d.f
    public /* bridge */ /* synthetic */ boolean startScan() {
        return super.startScan();
    }

    @Override // com.realsil.sdk.core.d.i, com.realsil.sdk.core.d.f
    public /* bridge */ /* synthetic */ boolean startScanImpl() {
        return super.startScanImpl();
    }

    @Override // com.realsil.sdk.core.d.f
    public boolean stopScan() {
        synchronized (this) {
            this.f15669q = false;
            if (!this.f15663k) {
                ZLogger.w("presenter not initialized");
                return false;
            }
            Handler handler = this.f15660h;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            return b();
        }
    }

    public LegacyScannerPresenter(Context context, Handler handler, ScannerParams scannerParams, ScannerCallback scannerCallback) {
        super(context, handler, scannerParams, scannerCallback);
    }

    @Override // com.realsil.sdk.core.d.f
    public /* bridge */ /* synthetic */ List getPairedDevices(int i8) {
        return super.getPairedDevices(i8);
    }

    public boolean scanDevice(boolean z7, boolean z8) {
        synchronized (this) {
            try {
                if (z7) {
                    return startScan();
                }
                return stopScan();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public LegacyScannerPresenter(Context context, ScannerParams scannerParams, ScannerCallback scannerCallback) {
        super(context, null, scannerParams, scannerCallback);
    }
}
