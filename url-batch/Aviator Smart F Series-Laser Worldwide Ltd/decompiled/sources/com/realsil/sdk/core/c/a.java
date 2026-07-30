package com.realsil.sdk.core.c;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.os.Build;
import com.realsil.sdk.core.bluetooth.connection.BluetoothClient;
import com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp;
import com.realsil.sdk.core.logger.ZLogger;
import java.io.IOException;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class a extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public BluetoothSocket f15639a;

    /* renamed from: b, reason: collision with root package name */
    public final BluetoothDevice f15640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BluetoothSpp f15641c;

    public a(BluetoothSpp bluetoothSpp, String str) {
        this.f15641c = bluetoothSpp;
        UUID uuid = BluetoothSpp.f15503s;
        BluetoothDevice a8 = bluetoothSpp.a(str);
        this.f15640b = a8;
        this.f15639a = a(a8, true);
    }

    public final BluetoothSocket a(BluetoothDevice bluetoothDevice, boolean z7) {
        boolean z8;
        BluetoothSocket bluetoothSocket;
        int connectionType;
        z8 = ((BluetoothClient) this.f15641c).VDBG;
        ZLogger.v(z8, "createBluetoothSocket:" + this.f15641c.f15506m);
        try {
            bluetoothSocket = z7 ? bluetoothDevice.createRfcommSocketToServiceRecord(this.f15641c.f15506m) : bluetoothDevice.createInsecureRfcommSocketToServiceRecord(this.f15641c.f15506m);
        } catch (IOException e8) {
            ZLogger.w("createBluetoothSocket failed: " + e8.toString());
            bluetoothSocket = null;
        }
        if (bluetoothSocket != null && Build.VERSION.SDK_INT >= 23) {
            BluetoothSpp bluetoothSpp = this.f15641c;
            connectionType = bluetoothSocket.getConnectionType();
            bluetoothSpp.f15509p = connectionType;
        }
        return bluetoothSocket;
    }

    public final void b() {
        boolean z7;
        boolean z8;
        if (this.f15640b.getBondState() == 12) {
            this.f15639a = a(this.f15640b, false);
        }
        BluetoothSocket bluetoothSocket = this.f15639a;
        if (bluetoothSocket == null) {
            ZLogger.d("create Insecure BluetoothSocket fail");
            this.f15641c.updateConnectionState(0);
            synchronized (this.f15641c.f15510q) {
                this.f15641c.f15511r = Boolean.FALSE;
            }
            return;
        }
        if (bluetoothSocket.isConnected()) {
            ZLogger.d("socket already connected");
            return;
        }
        this.f15641c.updateConnectionState(1);
        z7 = ((BluetoothClient) this.f15641c).VDBG;
        ZLogger.v(z7, "refused, connect socket ...");
        try {
            this.f15639a.connect();
        } catch (Exception e8) {
            ZLogger.d("connect socket failed, " + e8.toString());
            try {
                this.f15639a.close();
            } catch (IOException e9) {
                ZLogger.w("unable to close socket during connection failure: " + e9);
            }
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e10) {
                z8 = ((BluetoothClient) this.f15641c).VDBG;
                ZLogger.v(z8, e10.toString());
            }
            BluetoothSpp.l(this.f15641c);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z7;
        BluetoothAdapter bluetoothAdapter;
        boolean z8;
        boolean z9;
        boolean z10;
        BluetoothSpp bluetoothSpp;
        boolean z11;
        BluetoothAdapter bluetoothAdapter2;
        setName("ConnectThread:BluetoothSpp");
        z7 = ((BluetoothClient) this.f15641c).VDBG;
        if (z7) {
            ZLogger.v("SocketConnectionType: " + this.f15641c.f15509p);
        }
        bluetoothAdapter = ((BluetoothClient) this.f15641c).mBluetoothAdapter;
        if (bluetoothAdapter != null) {
            bluetoothAdapter2 = ((BluetoothClient) this.f15641c).mBluetoothAdapter;
            bluetoothAdapter2.cancelDiscovery();
        }
        BluetoothSocket bluetoothSocket = this.f15639a;
        if (bluetoothSocket == null) {
            ZLogger.w("create BluetoothSocket fail");
            this.f15641c.updateConnectionState(0);
            synchronized (this.f15641c.f15510q) {
                this.f15641c.f15511r = Boolean.FALSE;
            }
            return;
        }
        if (bluetoothSocket.isConnected()) {
            z11 = ((BluetoothClient) this.f15641c).DBG;
            ZLogger.d(z11, "socket already connected");
        } else {
            BluetoothSpp bluetoothSpp2 = this.f15641c;
            if (bluetoothSpp2.f15451c == 1) {
                z10 = ((BluetoothClient) bluetoothSpp2).DBG;
                ZLogger.i(z10, "is already in connecting, ignore connect req, and wait connect result");
                return;
            }
            bluetoothSpp2.updateConnectionState(1);
            z8 = ((BluetoothClient) this.f15641c).VDBG;
            ZLogger.v(z8, "connect socket ...");
            try {
                this.f15639a.connect();
            } catch (Exception e8) {
                ZLogger.w("connect socket failed, " + e8.toString());
                try {
                    this.f15639a.close();
                } catch (IOException e9) {
                    ZLogger.w("unable to close socket during connection failure: " + e9);
                }
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    z9 = ((BluetoothClient) this.f15641c).VDBG;
                    ZLogger.v(z9, e10.toString());
                }
                if ("Connect refused".equals(e8.getMessage())) {
                    b();
                    return;
                } else {
                    BluetoothSpp.l(this.f15641c);
                    return;
                }
            }
        }
        synchronized (this.f15641c) {
            bluetoothSpp = this.f15641c;
            bluetoothSpp.f15507n = null;
        }
        bluetoothSpp.connected(this.f15639a, this.f15640b.getAddress());
    }

    public final void a() {
        try {
            BluetoothSocket bluetoothSocket = this.f15639a;
            if (bluetoothSocket != null) {
                bluetoothSocket.close();
            }
        } catch (IOException e8) {
            ZLogger.w("close socket failed: " + e8);
        }
    }
}
