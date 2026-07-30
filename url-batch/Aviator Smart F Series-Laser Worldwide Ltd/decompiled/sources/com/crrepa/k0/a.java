package com.crrepa.k0;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import com.crrepa.ble.util.BleLog;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
class a implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    private static final UUID f13127n = UUID.fromString("FE010000-1234-5678-ABCD-00805F9B34FB");

    /* renamed from: o, reason: collision with root package name */
    private static final UUID f13128o = UUID.fromString("00001101-0000-1000-8000-00805f9b34fb");

    /* renamed from: h, reason: collision with root package name */
    private final BluetoothDevice f13129h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13130i;

    /* renamed from: j, reason: collision with root package name */
    private BluetoothSocket f13131j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13132k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13133l;

    /* renamed from: m, reason: collision with root package name */
    private b f13134m;

    a(BluetoothDevice bluetoothDevice) {
        this.f13129h = bluetoothDevice;
    }

    private void d() {
        this.f13132k = false;
        a(0);
        try {
            this.f13131j.close();
        } catch (Exception unused) {
        }
        this.f13131j = null;
    }

    private void e() {
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = this.f13131j.getInputStream().read(bArr);
                if (read > 0) {
                    byte[] copyOf = Arrays.copyOf(bArr, read);
                    BleLog.d(String.format("receive bytes: %s", com.crrepa.g1.c.c(copyOf)));
                    a(copyOf);
                }
            }
        } catch (Exception e8) {
            BleLog.e("socket read error");
            e8.printStackTrace();
            d();
        }
    }

    public void a() {
        BluetoothSocket bluetoothSocket = this.f13131j;
        if (bluetoothSocket != null) {
            try {
                bluetoothSocket.close();
            } catch (Exception unused) {
            }
            this.f13131j = null;
        }
    }

    public boolean b() {
        return this.f13132k;
    }

    public boolean c() {
        return this.f13133l;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"MissingPermission"})
    public void run() {
        this.f13133l = true;
        try {
            UUID uuid = f13127n;
            if (this.f13130i) {
                uuid = f13128o;
            }
            BleLog.d(String.format("spp connecting to %s", this.f13129h.getAddress()));
            BluetoothSocket createRfcommSocketToServiceRecord = this.f13129h.createRfcommSocketToServiceRecord(uuid);
            this.f13131j = createRfcommSocketToServiceRecord;
            createRfcommSocketToServiceRecord.connect();
            BleLog.d("spp connect success");
            this.f13132k = true;
            this.f13133l = false;
            a(2);
            if (this.f13130i) {
                e();
            }
        } catch (Exception e8) {
            BleLog.e("socket connect error");
            e8.printStackTrace();
            this.f13133l = false;
            d();
        }
    }

    private void a(int i8) {
        b bVar = this.f13134m;
        if (bVar != null) {
            bVar.onConnectionStateChanged(i8);
        }
    }

    public boolean b(byte[] bArr) {
        if (this.f13132k && this.f13131j != null) {
            try {
                BleLog.d(String.format("send bytes: %s", com.crrepa.g1.c.c(bArr)));
                this.f13131j.getOutputStream().write(bArr);
                return true;
            } catch (IOException e8) {
                BleLog.e("socket write error");
                e8.printStackTrace();
                d();
            }
        }
        return false;
    }

    public void a(b bVar) {
        BleLog.d("setSppChangeListener: " + bVar);
        this.f13134m = bVar;
    }

    public void a(boolean z7) {
        this.f13130i = z7;
        Executors.newSingleThreadExecutor().submit(this);
    }

    private void a(byte[] bArr) {
        BleLog.d("onReceiveData:" + this.f13134m);
        b bVar = this.f13134m;
        if (bVar != null) {
            bVar.onReceiveData(bArr);
        }
    }
}
