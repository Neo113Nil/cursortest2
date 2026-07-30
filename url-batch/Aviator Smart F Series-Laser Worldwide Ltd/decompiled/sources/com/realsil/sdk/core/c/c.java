package com.realsil.sdk.core.c;

import com.realsil.sdk.core.bluetooth.connection.BluetoothClient;
import com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppCallback;
import com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSppManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class c extends BluetoothSppCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BluetoothSppManager f15646a;

    public c(BluetoothSppManager bluetoothSppManager) {
        this.f15646a = bluetoothSppManager;
    }

    @Override // com.realsil.sdk.core.bluetooth.connection.BluetoothClientCallback
    public final void onConnectionStateChanged(BluetoothClient bluetoothClient, boolean z7, int i8) {
        super.onConnectionStateChanged(bluetoothClient, z7, i8);
        synchronized (this.f15646a.f15513a) {
            try {
                CopyOnWriteArrayList copyOnWriteArrayList = this.f15646a.f15513a;
                if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = this.f15646a.f15513a.iterator();
                    while (it.hasNext()) {
                        ((BluetoothSppCallback) it.next()).onConnectionStateChanged(bluetoothClient, z7, i8);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.realsil.sdk.core.bluetooth.connection.BluetoothClientCallback
    public final void onDataReceive(BluetoothClient bluetoothClient, byte[] bArr) {
        super.onDataReceive(bluetoothClient, bArr);
        synchronized (this.f15646a.f15513a) {
            try {
                CopyOnWriteArrayList copyOnWriteArrayList = this.f15646a.f15513a;
                if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = this.f15646a.f15513a.iterator();
                    while (it.hasNext()) {
                        ((BluetoothSppCallback) it.next()).onDataReceive(bluetoothClient, bArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
