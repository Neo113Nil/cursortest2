package com.realsil.sdk.core.c;

import android.bluetooth.BluetoothSocket;
import com.realsil.sdk.core.bluetooth.connection.BluetoothClient;
import com.realsil.sdk.core.bluetooth.connection.legacy.BluetoothSpp;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.DataConverter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final BluetoothSocket f15642a;

    /* renamed from: b, reason: collision with root package name */
    public final BufferedInputStream f15643b;

    /* renamed from: c, reason: collision with root package name */
    public final BufferedOutputStream f15644c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BluetoothSpp f15645d;

    public b(BluetoothSpp bluetoothSpp, BluetoothSocket bluetoothSocket) {
        BufferedInputStream bufferedInputStream;
        this.f15645d = bluetoothSpp;
        BufferedOutputStream bufferedOutputStream = null;
        this.f15643b = null;
        this.f15644c = null;
        ZLogger.d("create ConnectedThread");
        this.f15642a = bluetoothSocket;
        try {
            bufferedInputStream = new BufferedInputStream(bluetoothSocket.getInputStream());
        } catch (IOException e8) {
            e = e8;
            bufferedInputStream = null;
        }
        try {
            bufferedOutputStream = new BufferedOutputStream(bluetoothSocket.getOutputStream());
        } catch (IOException e9) {
            e = e9;
            ZLogger.w("temp sockets not created: " + e);
            this.f15643b = bufferedInputStream;
            this.f15644c = bufferedOutputStream;
        }
        this.f15643b = bufferedInputStream;
        this.f15644c = bufferedOutputStream;
    }

    public final void a() {
        BluetoothSocket bluetoothSocket = this.f15642a;
        if (bluetoothSocket == null) {
            return;
        }
        try {
            bluetoothSocket.close();
        } catch (IOException e8) {
            ZLogger.w("close socket failed: " + e8);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z7;
        byte[] bArr = new byte[1024];
        this.f15645d.updateConnectionState(2);
        synchronized (this.f15645d.f15510q) {
            this.f15645d.f15511r = Boolean.FALSE;
        }
        while (!Thread.currentThread().isInterrupted() && this.f15645d.f15451c == 2) {
            try {
                int read = this.f15643b.read(bArr);
                if (read > 0) {
                    byte[] bArr2 = new byte[read];
                    System.arraycopy(bArr, 0, bArr2, 0, read);
                    z7 = ((BluetoothClient) this.f15645d).VDBG;
                    if (z7) {
                        Locale locale = Locale.US;
                        ZLogger.v(">> (" + read + ") " + DataConverter.bytes2Hex(bArr2));
                    }
                    this.f15645d.dispatchDataReceived(bArr2);
                }
            } catch (IOException e8) {
                ZLogger.w("connectionLost: " + e8.toString());
                if (this.f15642a != null) {
                    ZLogger.v("isConnected:" + this.f15642a.isConnected());
                }
                BluetoothSpp.i(this.f15645d);
            }
        }
        if (this.f15645d.f15451c == 3) {
            a();
            BluetoothSpp.i(this.f15645d);
        }
    }
}
