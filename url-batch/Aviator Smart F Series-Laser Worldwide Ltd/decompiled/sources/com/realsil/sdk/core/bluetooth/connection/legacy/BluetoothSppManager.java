package com.realsil.sdk.core.bluetooth.connection.legacy;

import android.bluetooth.BluetoothSocket;
import androidx.annotation.NonNull;
import com.realsil.sdk.core.bluetooth.connection.BluetoothClient;
import com.realsil.sdk.core.bluetooth.connection.legacy.SppConnParameters;
import com.realsil.sdk.core.c.c;
import com.realsil.sdk.core.logger.ZLogger;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class BluetoothSppManager {
    public static UUID UUID_SECURE = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    /* renamed from: f, reason: collision with root package name */
    public static volatile BluetoothSppManager f15512f;

    /* renamed from: b, reason: collision with root package name */
    public BluetoothSpp f15514b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f15515c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15516d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final c f15517e = new c(this);

    /* renamed from: a, reason: collision with root package name */
    public CopyOnWriteArrayList f15513a = new CopyOnWriteArrayList();

    public static BluetoothSppManager getInstance() {
        return f15512f;
    }

    public static synchronized void initialize() {
        synchronized (BluetoothSppManager.class) {
            if (f15512f == null) {
                synchronized (BluetoothSppManager.class) {
                    try {
                        if (f15512f == null) {
                            f15512f = new BluetoothSppManager();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    public final BluetoothSpp a() {
        if (this.f15514b == null) {
            this.f15514b = new BluetoothSpp(UUID_SECURE, this.f15517e);
        }
        return this.f15514b;
    }

    public synchronized boolean connect(@NonNull String str, BluetoothSocket bluetoothSocket, @NonNull BluetoothSppCallback bluetoothSppCallback) {
        register(bluetoothSppCallback);
        if (getConnectionState() == 2) {
            String deviceAddress = a().getDeviceAddress();
            if (deviceAddress != null && deviceAddress.equals(str)) {
                bluetoothSppCallback.onConnectionStateChanged((BluetoothClient) a(), true, 2);
                return true;
            }
            ZLogger.d("current connected device is conflict with the connecting device");
        }
        boolean connect = a().connect(new SppConnParameters.Builder(str).bluetoothSocket(bluetoothSocket).build());
        if (connect) {
            return connect;
        }
        unregister(bluetoothSppCallback);
        return connect;
    }

    public void destroy() {
        synchronized (this.f15513a) {
            try {
                CopyOnWriteArrayList copyOnWriteArrayList = this.f15513a;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        disconnect();
    }

    public void disconnect() {
        a().stop();
    }

    public int getConnectionState() {
        return a().getConnectionState();
    }

    public void notifyAck() {
        synchronized (this.f15516d) {
            this.f15515c = true;
            this.f15516d.notifyAll();
        }
    }

    public void register(BluetoothSppCallback bluetoothSppCallback) {
        synchronized (this.f15513a) {
            try {
                if (this.f15513a == null) {
                    this.f15513a = new CopyOnWriteArrayList();
                }
                if (!this.f15513a.contains(bluetoothSppCallback)) {
                    this.f15513a.add(bluetoothSppCallback);
                }
                ZLogger.v("callback's size=" + this.f15513a.size());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized boolean sendPacket(byte[] bArr, boolean z7) {
        if (bArr == null) {
            return false;
        }
        if (!z7) {
            try {
                this.f15515c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!a().write(bArr)) {
            ZLogger.w("send spp data failed");
            return false;
        }
        if (z7) {
            return true;
        }
        synchronized (this.f15516d) {
            if (this.f15515c) {
                return true;
            }
            try {
                this.f15516d.wait(5000L);
            } catch (InterruptedException e8) {
                e8.printStackTrace();
            }
            return this.f15515c;
        }
    }

    public void unregister(BluetoothSppCallback bluetoothSppCallback) {
        synchronized (this.f15513a) {
            try {
                CopyOnWriteArrayList copyOnWriteArrayList = this.f15513a;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.remove(bluetoothSppCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean write(byte[] bArr) {
        return a().write(bArr);
    }

    public synchronized boolean connect(@NonNull String str, @NonNull BluetoothSppCallback bluetoothSppCallback) {
        register(bluetoothSppCallback);
        if (getConnectionState() == 2) {
            String deviceAddress = a().getDeviceAddress();
            if (deviceAddress != null && deviceAddress.equals(str)) {
                ZLogger.d("connection already connected");
                bluetoothSppCallback.onConnectionStateChanged((BluetoothClient) a(), true, 2);
                return true;
            }
            ZLogger.d("current connected device is conflict with the connecting device");
        }
        boolean connect = a().connect(new SppConnParameters.Builder(str).build());
        if (connect) {
            return connect;
        }
        unregister(bluetoothSppCallback);
        return connect;
    }
}
