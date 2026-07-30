package com.realsil.sdk.core.d;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import cn.hutool.core.text.l;
import com.realsil.sdk.core.logger.ZLogger;

/* loaded from: classes4.dex */
public final class h extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f15671a;

    public h(i iVar) {
        this.f15671a = iVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.bluetooth.device.action.FOUND".equals(action) || "android.bluetooth.device.action.CLASS_CHANGED".equals(action)) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) com.realsil.sdk.core.f.a.a(intent, BluetoothDevice.class);
            short shortExtra = intent.getShortExtra("android.bluetooth.device.extra.RSSI", Short.MIN_VALUE);
            if (bluetoothDevice == null) {
                if (this.f15671a.f15654b) {
                    ZLogger.v(action);
                    return;
                }
                return;
            }
            if (this.f15671a.f15654b) {
                ZLogger.v(action + l.SPACE + bluetoothDevice.toString());
            }
            this.f15671a.a(bluetoothDevice, shortExtra, null);
            return;
        }
        if (!"android.bluetooth.device.action.NAME_CHANGED".equals(action) && !"android.bluetooth.device.action.UUID".equals(action)) {
            if ("android.bluetooth.adapter.action.DISCOVERY_STARTED".equals(action)) {
                this.f15671a.a(2);
                return;
            } else {
                if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(action)) {
                    this.f15671a.a(3);
                    return;
                }
                return;
            }
        }
        BluetoothDevice bluetoothDevice2 = (BluetoothDevice) com.realsil.sdk.core.f.a.a(intent, BluetoothDevice.class);
        short shortExtra2 = intent.getShortExtra("android.bluetooth.device.extra.RSSI", (short) 0);
        if (bluetoothDevice2 == null) {
            if (this.f15671a.f15654b) {
                ZLogger.v(action);
                return;
            }
            return;
        }
        if (this.f15671a.f15654b) {
            ZLogger.v(action + l.SPACE + bluetoothDevice2.toString());
        }
        i iVar = this.f15671a;
        if (iVar.f15662j == 2) {
            iVar.a(bluetoothDevice2, shortExtra2, null);
        }
    }
}
