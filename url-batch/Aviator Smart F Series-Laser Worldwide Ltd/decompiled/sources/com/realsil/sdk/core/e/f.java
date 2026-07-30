package com.realsil.sdk.core.e;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.Build;
import com.realsil.sdk.core.bluetooth.scanner.ScannerParams;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.d.j;
import com.realsil.sdk.core.logger.ZLogger;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class f extends ScanCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f15684a;

    public f(g gVar) {
        this.f15684a = gVar;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanFailed(int i8) {
        super.onScanFailed(i8);
        ZLogger.w(this.f15684a.f15674a, "scan failed with " + i8);
        g gVar = this.f15684a;
        j jVar = gVar.f15680g;
        if (jVar == null) {
            ZLogger.v(gVar.f15675b, "no listeners register");
            return;
        }
        ZLogger.v(jVar.f15673a.f15654b, "onLeScanFailed:" + i8);
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i8, ScanResult scanResult) {
        boolean isConnectable;
        boolean isLegacy;
        int primaryPhy;
        int secondaryPhy;
        int advertisingSid;
        int txPower;
        int periodicAdvertisingInterval;
        boolean isConnectable2;
        super.onScanResult(i8, scanResult);
        g gVar = this.f15684a;
        if (gVar.f15678e) {
            ScannerParams scannerParams = gVar.f15679f;
            if (scannerParams != null && scannerParams.isConnectable() && Build.VERSION.SDK_INT >= 26) {
                isConnectable2 = scanResult.isConnectable();
                if (!isConnectable2) {
                    return;
                }
            }
            if (this.f15684a.f15676c) {
                StringBuilder sb = new StringBuilder("ScanResult {");
                BluetoothDevice device = scanResult.getDevice();
                if (device != null) {
                    sb.append("\n\t" + BluetoothHelper.dumpBluetoothDevice(device));
                }
                if (scanResult.getScanRecord() != null) {
                    sb.append("\n\t");
                    sb.append(b.a(scanResult.getScanRecord()));
                }
                sb.append("\n\trssi=");
                sb.append(scanResult.getRssi());
                sb.append("\t,timestampNanos=");
                sb.append(scanResult.getTimestampNanos());
                if (Build.VERSION.SDK_INT >= 26) {
                    isConnectable = scanResult.isConnectable();
                    sb.append("\n\tconnectable=" + isConnectable);
                    sb.append(", isLegacy=");
                    isLegacy = scanResult.isLegacy();
                    sb.append(isLegacy);
                    Locale locale = Locale.US;
                    primaryPhy = scanResult.getPrimaryPhy();
                    secondaryPhy = scanResult.getSecondaryPhy();
                    sb.append(", primaryPhy=" + primaryPhy + ",secondaryPhy=" + secondaryPhy);
                    sb.append("\t,advertisingSid=");
                    advertisingSid = scanResult.getAdvertisingSid();
                    sb.append(advertisingSid);
                    sb.append("\t,txPower=");
                    txPower = scanResult.getTxPower();
                    sb.append(txPower);
                    sb.append("\t,periodicAdvertisingInterval=");
                    periodicAdvertisingInterval = scanResult.getPeriodicAdvertisingInterval();
                    sb.append(periodicAdvertisingInterval);
                }
                sb.append("\n}");
                ZLogger.v(sb.toString());
            }
            ScanRecord scanRecord = scanResult.getScanRecord();
            g gVar2 = this.f15684a;
            BluetoothDevice device2 = scanResult.getDevice();
            int rssi = scanResult.getRssi();
            byte[] bytes = scanRecord != null ? scanRecord.getBytes() : new byte[0];
            j jVar = gVar2.f15680g;
            if (jVar != null) {
                jVar.f15673a.a(device2, rssi, bytes);
            } else {
                ZLogger.v(gVar2.f15675b, "notifyLeScan, no listeners register");
            }
        }
    }
}
