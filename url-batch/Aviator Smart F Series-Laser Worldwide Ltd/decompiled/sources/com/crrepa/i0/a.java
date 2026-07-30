package com.crrepa.i0;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.os.Handler;
import android.os.Looper;
import com.crrepa.ble.scan.bean.CRPScanDevice;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class a extends ScanCallback {

    /* renamed from: c, reason: collision with root package name */
    private static Handler f12954c = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    private long f12955a;

    /* renamed from: b, reason: collision with root package name */
    private e4.a f12956b;

    /* renamed from: com.crrepa.i0.a$a, reason: collision with other inner class name */
    class RunnableC0221a implements Runnable {
        RunnableC0221a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f12956b.a(a.this);
            a.this.f12956b.c();
        }
    }

    public a(long j8) {
        this.f12955a = j8;
    }

    public a a(long j8) {
        this.f12955a = j8;
        return this;
    }

    public e4.a b() {
        return this.f12956b;
    }

    public long c() {
        return this.f12955a;
    }

    public void d() {
        this.f12956b.a(this);
        this.f12956b.b();
    }

    public void e() {
        if (this.f12955a > 0) {
            a();
            f12954c.postDelayed(new RunnableC0221a(), this.f12955a);
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onBatchScanResults(List<ScanResult> list) {
        super.onBatchScanResults(list);
        Iterator<ScanResult> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanFailed(int i8) {
        super.onScanFailed(i8);
        d();
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanResult(int i8, ScanResult scanResult) {
        super.onScanResult(i8, scanResult);
        a(scanResult);
    }

    public a a(e4.a aVar) {
        this.f12956b = aVar;
        return this;
    }

    public void a() {
        f12954c.removeCallbacksAndMessages(null);
    }

    private void a(ScanResult scanResult) {
        BluetoothDevice device = scanResult.getDevice();
        this.f12956b.a(new CRPScanDevice(device, scanResult.getScanRecord().getBytes(), scanResult.getRssi(), device.getName()));
    }
}
