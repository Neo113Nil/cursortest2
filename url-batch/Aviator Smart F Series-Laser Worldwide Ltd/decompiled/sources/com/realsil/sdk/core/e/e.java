package com.realsil.sdk.core.e;

import android.content.Context;
import android.os.ParcelUuid;
import com.realsil.sdk.core.bluetooth.scanner.ScannerParams;
import com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter;
import com.realsil.sdk.core.d.j;
import com.realsil.sdk.core.logger.ZLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class e extends a {

    /* renamed from: h, reason: collision with root package name */
    public final d f15683h;

    public e(Context context) {
        super(context);
        this.f15683h = new d(this);
        ZLogger.v(this.f15675b, "LeScannerV19 init");
    }

    @Override // com.realsil.sdk.core.e.a
    public final boolean a(ScannerParams scannerParams) {
        UUID[] uuidArr;
        String obj;
        if (a()) {
            ZLogger.v(this.f15675b, "LeScanner--startScan");
            if (this.f15680g == null) {
                ZLogger.v(this.f15675b, "no listeners register");
            }
            this.f15678e = true;
            this.f15679f = scannerParams;
            List<CompatScanFilter> scanFilters = scannerParams.getScanFilters();
            try {
                if (scanFilters != null && scanFilters.size() > 0) {
                    ZLogger.v(this.f15675b, "contains " + scanFilters.size() + " filters");
                    ArrayList arrayList = new ArrayList();
                    for (CompatScanFilter compatScanFilter : scanFilters) {
                        ZLogger.v(compatScanFilter.toString());
                        if (compatScanFilter.getServiceUuid() != null) {
                            arrayList.add(compatScanFilter.getServiceUuid());
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        uuidArr = new UUID[size];
                        for (int i8 = 0; i8 < size; i8++) {
                            if (arrayList.get(i8) != null) {
                                uuidArr[i8] = ((ParcelUuid) arrayList.get(i8)).getUuid();
                            }
                        }
                        return this.f15677d.startLeScan(uuidArr, this.f15683h);
                    }
                }
                return this.f15677d.startLeScan(uuidArr, this.f15683h);
            } catch (Exception e8) {
                obj = e8.toString();
            }
            uuidArr = null;
        } else {
            obj = "BT Adapter is not turned ON";
        }
        ZLogger.w(obj);
        return false;
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
        if (a()) {
            try {
                this.f15677d.stopLeScan(this.f15683h);
                return true;
            } catch (Exception e8) {
                obj = e8.toString();
            }
        } else {
            obj = "BT Adapter is not turned ON";
        }
        ZLogger.w(obj);
        return false;
    }
}
