package com.realsil.sdk.core.e;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Build;
import com.realsil.sdk.core.bluetooth.scanner.ScannerParams;
import com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter;
import com.realsil.sdk.core.d.j;
import com.realsil.sdk.core.logger.ZLogger;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class g extends a {

    /* renamed from: h, reason: collision with root package name */
    public BluetoothLeScanner f15685h;

    /* renamed from: i, reason: collision with root package name */
    public final f f15686i;

    public g(Context context) {
        super(context);
        this.f15686i = new f(this);
        ZLogger.v(this.f15675b, "LeScannerV21 init");
        BluetoothAdapter bluetoothAdapter = this.f15677d;
        if (bluetoothAdapter != null) {
            this.f15685h = bluetoothAdapter.getBluetoothLeScanner();
        }
        if (this.f15685h == null) {
            ZLogger.d("mBluetoothLeScanner == null");
        }
    }

    @Override // com.realsil.sdk.core.e.a
    public final boolean a(ScannerParams scannerParams) {
        ScanSettings.Builder phy;
        if (!a()) {
            ZLogger.w("BT Adapter is not turned ON");
            ZLogger.w("startScan failed");
            return false;
        }
        ZLogger.v(this.f15675b, "LeScanner--startScan");
        if (this.f15680g == null) {
            ZLogger.v(this.f15675b, "no listeners register");
        }
        this.f15678e = true;
        this.f15679f = scannerParams;
        if (this.f15685h == null) {
            ZLogger.d("getBluetoothLeScanner...");
            this.f15685h = this.f15677d.getBluetoothLeScanner();
        }
        if (this.f15685h == null) {
            ZLogger.w("mBluetoothLeScanner is null");
            b();
            return false;
        }
        ArrayList arrayList = new ArrayList();
        List<CompatScanFilter> scanFilters = scannerParams.getScanFilters();
        if (scanFilters != null && !scanFilters.isEmpty()) {
            ZLogger.v(this.f15675b, "contains " + scanFilters.size() + " filters");
            for (CompatScanFilter compatScanFilter : scanFilters) {
                ScanFilter.Builder builder = new ScanFilter.Builder();
                builder.setDeviceAddress(compatScanFilter.getDeviceAddress()).setDeviceName(compatScanFilter.getDeviceName()).setManufacturerData(compatScanFilter.getManufacturerId(), compatScanFilter.getManufacturerData(), compatScanFilter.getManufacturerDataMask());
                if (compatScanFilter.getServiceDataMask() != null) {
                    builder.setServiceUuid(compatScanFilter.getServiceUuid(), compatScanFilter.getServiceUuidMask());
                } else {
                    builder.setServiceUuid(compatScanFilter.getServiceUuid());
                }
                if (compatScanFilter.getServiceDataUuid() != null) {
                    builder.setServiceData(compatScanFilter.getServiceDataUuid(), compatScanFilter.getServiceData());
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    builder.setServiceSolicitationUuid(compatScanFilter.getServiceSolicitationUuid());
                }
                arrayList.add(builder.build());
                ZLogger.v(this.f15675b, compatScanFilter.toString());
            }
        }
        ScanSettings.Builder scanMode = new ScanSettings.Builder().setScanMode(2);
        if (Build.VERSION.SDK_INT >= 26) {
            phy = scanMode.setPhy(scannerParams.getPhy());
            phy.setLegacy(false);
        }
        try {
            this.f15685h.startScan(arrayList, scanMode.build(), this.f15686i);
            return true;
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
            return false;
        }
    }

    @Override // com.realsil.sdk.core.e.a
    public final boolean b() {
        String obj;
        j jVar = this.f15680g;
        if (jVar != null) {
            ZLogger.v(jVar.f15673a.f15654b, "onLeScanStop");
            jVar.f15673a.a(3);
        } else {
            ZLogger.v(this.f15675b, "no listeners register");
        }
        this.f15678e = false;
        if (!a()) {
            obj = "BT Adapter is not turned ON";
        } else if (this.f15685h == null) {
            obj = "BluetoothLeScanner has not been initialized";
        } else {
            try {
                ZLogger.v("stop LE Scan");
                this.f15685h.stopScan(this.f15686i);
                return true;
            } catch (Exception e8) {
                obj = e8.toString();
            }
        }
        ZLogger.w(obj);
        return false;
    }
}
