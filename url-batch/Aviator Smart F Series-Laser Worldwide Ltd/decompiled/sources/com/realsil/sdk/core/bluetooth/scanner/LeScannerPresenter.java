package com.realsil.sdk.core.bluetooth.scanner;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.realsil.sdk.core.d.f;
import com.realsil.sdk.core.d.j;
import com.realsil.sdk.core.e.c;
import com.realsil.sdk.core.logger.ZLogger;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class LeScannerPresenter extends f {

    /* renamed from: t, reason: collision with root package name */
    public final c f15582t;

    /* renamed from: u, reason: collision with root package name */
    public final j f15583u;

    public LeScannerPresenter(Context context) {
        this(context, null, null, null);
    }

    @Override // com.realsil.sdk.core.d.f
    public final boolean a(BluetoothDevice bluetoothDevice) {
        int type = bluetoothDevice.getType();
        if (this.f15657e.getScanMode() != 18 || type == 2) {
            return true;
        }
        if (!this.f15654b) {
            return false;
        }
        Locale locale = Locale.US;
        ZLogger.v("filter, invalid type: " + type + ", expect type is 2");
        return false;
    }

    @Override // com.realsil.sdk.core.d.f
    public final boolean b() {
        c cVar = this.f15582t;
        synchronized (cVar) {
            com.realsil.sdk.core.e.a aVar = cVar.f15681a;
            if (aVar != null) {
                aVar.f15680g = null;
            }
        }
        if (this.f15582t.f15681a.f15678e) {
            ZLogger.v(this.f15654b, "stop the le scan process");
            if (!this.f15582t.f15681a.b()) {
                ZLogger.w("scanLeDevice failed");
                return false;
            }
        }
        a(0);
        return true;
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

    @Override // com.realsil.sdk.core.d.f
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

    @Override // com.realsil.sdk.core.d.f
    public boolean startScanImpl() {
        c cVar = this.f15582t;
        j jVar = this.f15583u;
        synchronized (cVar) {
            com.realsil.sdk.core.e.a aVar = cVar.f15681a;
            if (aVar != null) {
                aVar.f15680g = jVar;
            }
        }
        c cVar2 = this.f15582t;
        ScannerParams scannerParams = this.f15657e;
        com.realsil.sdk.core.e.a aVar2 = cVar2.f15681a;
        if (aVar2.a()) {
            return aVar2.a(scannerParams);
        }
        ZLogger.d("BT Adapter is not enable");
        return false;
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

    public LeScannerPresenter(Context context, Handler handler, ScannerParams scannerParams, ScannerCallback scannerCallback) {
        this.f15583u = new j(this);
        this.f15656d = context.getApplicationContext();
        this.f15660h = handler;
        this.f15657e = scannerParams;
        this.f15658f = scannerCallback;
        if (super.a()) {
            this.f15582t = new c(this.f15656d, Build.VERSION.SDK_INT);
        }
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

    public LeScannerPresenter(Context context, ScannerParams scannerParams, ScannerCallback scannerCallback) {
        this(context, null, scannerParams, scannerCallback);
    }
}
