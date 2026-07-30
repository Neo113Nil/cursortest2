package com.realsil.sdk.core.e;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.realsil.sdk.core.d.j;
import com.realsil.sdk.core.logger.ZLogger;

/* loaded from: classes4.dex */
public final class d implements BluetoothAdapter.LeScanCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f15682a;

    public d(e eVar) {
        this.f15682a = eVar;
    }

    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
    public final void onLeScan(BluetoothDevice bluetoothDevice, int i8, byte[] bArr) {
        e eVar = this.f15682a;
        j jVar = eVar.f15680g;
        if (jVar != null) {
            jVar.f15673a.a(bluetoothDevice, i8, bArr);
        } else {
            ZLogger.v(eVar.f15675b, "notifyLeScan, no listeners register");
        }
    }
}
