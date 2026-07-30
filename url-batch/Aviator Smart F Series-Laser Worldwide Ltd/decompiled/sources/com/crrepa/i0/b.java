package com.crrepa.i0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.crrepa.ble.scan.CRPScanRecordParser;
import com.crrepa.ble.scan.bean.CRPScanDevice;
import com.crrepa.ble.scan.bean.CRPScanRecordInfo;
import com.crrepa.ble.util.BleLog;

/* loaded from: classes3.dex */
public class b implements BluetoothAdapter.LeScanCallback {

    /* renamed from: c, reason: collision with root package name */
    private static Handler f12958c = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    private long f12959a;

    /* renamed from: b, reason: collision with root package name */
    private e4.a f12960b;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f12960b.a(b.this);
            b.this.f12960b.c();
        }
    }

    public b(long j8) {
        this.f12959a = j8;
    }

    public b a(long j8) {
        this.f12959a = j8;
        return this;
    }

    public e4.a b() {
        return this.f12960b;
    }

    public long c() {
        return this.f12959a;
    }

    public void d() {
        this.f12960b.a(this);
        this.f12960b.b();
    }

    public void e() {
        if (this.f12959a > 0) {
            a();
            f12958c.postDelayed(new a(), this.f12959a);
        }
    }

    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
    public void onLeScan(BluetoothDevice bluetoothDevice, int i8, byte[] bArr) {
        CRPScanRecordInfo parseScanRecord;
        if (bluetoothDevice != null) {
            String name = bluetoothDevice.getName();
            if (TextUtils.isEmpty(name) && (parseScanRecord = CRPScanRecordParser.parseScanRecord(bArr)) != null && !TextUtils.isEmpty(parseScanRecord.getName())) {
                name = parseScanRecord.getName();
            }
            BleLog.d("name: " + name);
            this.f12960b.a(new CRPScanDevice(bluetoothDevice, bArr, i8, name));
        }
    }

    public b a(e4.a aVar) {
        this.f12960b = aVar;
        return this;
    }

    public void a() {
        f12958c.removeCallbacksAndMessages(null);
    }
}
