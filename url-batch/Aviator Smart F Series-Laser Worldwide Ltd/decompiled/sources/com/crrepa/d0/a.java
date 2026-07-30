package com.crrepa.d0;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import com.crrepa.ble.util.BleLog;

/* loaded from: classes3.dex */
public class a extends g {

    /* renamed from: e, reason: collision with root package name */
    private static final int f12345e = 20;

    /* renamed from: f, reason: collision with root package name */
    private static final long f12346f = 50;

    /* renamed from: a, reason: collision with root package name */
    private byte[] f12347a;

    /* renamed from: b, reason: collision with root package name */
    private int f12348b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12349c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12350d;

    /* renamed from: com.crrepa.d0.a$a, reason: collision with other inner class name */
    class RunnableC0213a implements Runnable {
        RunnableC0213a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.e();
            com.crrepa.p.c.d().h();
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final a f12352a = new a(null);

        private b() {
        }
    }

    private a() {
        this.f12347a = null;
        this.f12348b = 0;
        this.f12349c = true;
        this.f12350d = false;
    }

    private BluetoothGattCharacteristic a(boolean z7) {
        f b8 = b();
        if (b8 == null) {
            return null;
        }
        return z7 ? b8.e() : b8.f();
    }

    private void c() {
        d4.a.a(new RunnableC0213a(), f12346f);
    }

    public static a d() {
        return b.f12352a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.f12348b = 0;
        this.f12349c = true;
    }

    private synchronized void h() {
        int length = this.f12347a.length - this.f12348b;
        if (length > 20) {
            length = 20;
        } else if (length <= 0) {
            c();
            return;
        }
        BluetoothGattCharacteristic a8 = a(this.f12350d);
        BleLog.i("characteristic uuid: " + a8.getUuid().toString());
        BluetoothGatt d8 = com.crrepa.l.a.b().d();
        if (d8 == null) {
            g.a();
            return;
        }
        byte[] bArr = new byte[length];
        System.arraycopy(this.f12347a, this.f12348b, bArr, 0, length);
        a8.setValue(bArr);
        a8.setWriteType(1);
        BleLog.i("characteristic write data: " + com.crrepa.g1.c.c(bArr));
        boolean writeCharacteristic = d8.writeCharacteristic(a8);
        BleLog.i("characteristic write success: " + writeCharacteristic);
        if (writeCharacteristic) {
            this.f12348b += length;
        }
    }

    public void b(byte[] bArr) {
        a(bArr, 7);
    }

    public void f() {
        h();
    }

    public void g() {
        e();
    }

    /* synthetic */ a(RunnableC0213a runnableC0213a) {
        this();
    }

    public void c(byte[] bArr) {
        a(bArr, true);
    }

    public void d(byte[] bArr) {
        a(bArr, false);
    }

    public void a(byte[] bArr) {
        a(bArr, 6);
    }

    private void a(byte[] bArr, int i8) {
        if (bArr == null) {
            return;
        }
        com.crrepa.p.c.d().a(new com.crrepa.p.a(i8, bArr));
    }

    private void a(byte[] bArr, boolean z7) {
        BleLog.i("sendBleMessage: " + this.f12349c);
        if (this.f12349c) {
            this.f12347a = bArr;
            this.f12349c = false;
            this.f12350d = z7;
            h();
        }
    }
}
