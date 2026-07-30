package com.realsil.sdk.core.d;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.ParcelUuid;
import com.realsil.sdk.core.bluetooth.scanner.DispatcherFilter;
import com.realsil.sdk.core.bluetooth.scanner.ScannerCallback;
import com.realsil.sdk.core.bluetooth.scanner.ScannerParams;
import com.realsil.sdk.core.compat.RtkContextCompat;
import com.realsil.sdk.core.logger.ZLogger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class i extends f {

    /* renamed from: t, reason: collision with root package name */
    public final h f15672t;

    public i(Context context, Handler handler, ScannerParams scannerParams, ScannerCallback scannerCallback) {
        h hVar = new h(this);
        this.f15672t = hVar;
        this.f15656d = context.getApplicationContext();
        this.f15660h = handler;
        this.f15657e = scannerParams;
        this.f15658f = scannerCallback;
        if (super.a()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.device.action.FOUND");
            intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
            intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
            intentFilter.addAction("android.bluetooth.device.action.UUID");
            RtkContextCompat.registerReceiver(this.f15656d, hVar, intentFilter);
            ZLogger.v(this.f15654b, "scanner initialized");
        }
    }

    @Override // com.realsil.sdk.core.d.f
    public final boolean a(BluetoothDevice bluetoothDevice) {
        ZLogger.v(this.f15654b, "filterDevice: mScannerParams=" + this.f15657e.toString());
        int type = bluetoothDevice.getType();
        if (this.f15657e.getScanMode() == 33 && type != 1) {
            if (this.f15654b) {
                Locale locale = Locale.US;
                ZLogger.v("invalid type: " + type + ", expect type is 1");
            }
            return false;
        }
        List<DispatcherFilter> dispatchFilters = this.f15657e.getDispatchFilters();
        if (dispatchFilters != null && !dispatchFilters.isEmpty()) {
            ParcelUuid[] uuids = bluetoothDevice.getUuids();
            Iterator<DispatcherFilter> it = dispatchFilters.iterator();
            while (it.hasNext()) {
                if (!it.next().matchesSupportedUuids(uuids)) {
                    if (this.f15654b) {
                        ZLogger.v("supportedFeaturesUuids filter failed");
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.realsil.sdk.core.d.f
    public final boolean b() {
        if (this.f15661i.isDiscovering()) {
            ZLogger.v(this.f15654b, "cancelDiscovery");
            if (!this.f15661i.cancelDiscovery()) {
                ZLogger.d("cancelDiscovery failed");
                return false;
            }
        }
        a(0);
        return true;
    }

    @Override // com.realsil.sdk.core.d.f
    public void onDestroy() {
        Context context = this.f15656d;
        if (context != null) {
            try {
                context.unregisterReceiver(this.f15672t);
            } catch (Exception e8) {
                ZLogger.w(this.f15654b, e8.toString());
            }
        }
        super.onDestroy();
    }

    @Override // com.realsil.sdk.core.d.f
    public boolean startScanImpl() {
        if (this.f15661i.isDiscovering()) {
            this.f15661i.cancelDiscovery();
        }
        return this.f15661i.startDiscovery();
    }
}
