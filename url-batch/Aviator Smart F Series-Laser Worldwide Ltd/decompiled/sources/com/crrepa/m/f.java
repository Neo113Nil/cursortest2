package com.crrepa.m;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import com.crrepa.ble.conn.callback.CRPRemoveBondCallback;
import com.crrepa.ble.conn.listener.CRPBleSendStateListener;
import com.crrepa.ble.util.BleLog;
import com.crrepa.f.o1;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class f extends c {

    /* renamed from: g, reason: collision with root package name */
    private static final long f13343g = 50;

    /* renamed from: h, reason: collision with root package name */
    private static final long f13344h = 200;

    /* renamed from: i, reason: collision with root package name */
    private static final long f13345i = 500;

    /* renamed from: j, reason: collision with root package name */
    private static final long f13346j = 1000;

    /* renamed from: k, reason: collision with root package name */
    private static f f13347k;

    /* renamed from: a, reason: collision with root package name */
    private byte[] f13348a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13349b = true;

    /* renamed from: c, reason: collision with root package name */
    private int f13350c = 0;

    /* renamed from: d, reason: collision with root package name */
    private byte f13351d;

    /* renamed from: e, reason: collision with root package name */
    private CRPBleSendStateListener f13352e;

    /* renamed from: f, reason: collision with root package name */
    private CRPRemoveBondCallback f13353f;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.crrepa.p.c.d().h();
        }
    }

    private f() {
    }

    private void a(int i8, long j8) {
        CRPBleSendStateListener cRPBleSendStateListener;
        if (this.f13351d == 99 && (cRPBleSendStateListener = this.f13352e) != null) {
            cRPBleSendStateListener.onSendStateChange(i8);
        }
        d4.a.a(new a(), j8);
    }

    private void c() {
        long j8;
        g();
        byte b8 = this.f13351d;
        if (b8 == 1 || b8 == 2) {
            j8 = 0;
        } else if (b8 == 4 || b8 == 103) {
            j8 = f13343g;
        } else {
            if (b8 != 17 && b8 != 18 && b8 != 59 && b8 != 60) {
                switch (b8) {
                    case 50:
                        com.crrepa.o.b.a().e();
                        return;
                    case 51:
                        j8 = 1000;
                        break;
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                        break;
                    default:
                        j8 = f13344h;
                        break;
                }
            }
            j8 = 500;
        }
        a(1, j8);
    }

    public static f e() {
        if (f13347k == null) {
            f13347k = new f();
        }
        return f13347k;
    }

    private BluetoothGattCharacteristic f() {
        com.crrepa.q.b b8 = b();
        if (b8 == null) {
            return null;
        }
        byte b9 = this.f13351d;
        return b9 == 1 ? b8.l() : b9 == 2 ? b8.k() : b9 == 3 ? b8.m() : b9 == 4 ? b8.f() : b8.n();
    }

    @SuppressLint({"MissingPermission"})
    private synchronized void h() {
        int length = this.f13348a.length - this.f13350c;
        int a8 = com.crrepa.f.g.a();
        if (length > a8) {
            length = a8;
        } else if (length <= 0) {
            c();
            return;
        }
        BluetoothGattCharacteristic f8 = f();
        BluetoothGatt a9 = com.crrepa.l.a.b().a();
        if (f8 != null && a9 != null) {
            byte[] bArr = new byte[length];
            System.arraycopy(this.f13348a, this.f13350c, bArr, 0, length);
            f8.setValue(bArr);
            if (com.crrepa.l.a.b().g()) {
                f8.setWriteType(1);
            }
            BleLog.i("writeCharacteristic WriteType: " + f8.getWriteType());
            boolean writeCharacteristic = a9.writeCharacteristic(f8);
            BleLog.i("writeCharacteristic: " + writeCharacteristic);
            if (writeCharacteristic) {
                this.f13350c += length;
            } else {
                c.a();
            }
            return;
        }
        c.a();
    }

    public void b(byte[] bArr) {
        if (b().f() != null) {
            a(bArr, 39, false);
        } else {
            BleLog.e("hisilicon characteristic is null");
        }
    }

    public void d() {
        com.crrepa.p.c.d().c();
        com.crrepa.p.c.d().b();
    }

    public void g() {
        this.f13350c = 0;
        this.f13349b = true;
    }

    public void i(byte[] bArr) {
        a(bArr, bArr[4]);
    }

    public void j(byte[] bArr) {
        a(bArr, (byte) 4);
    }

    public void k(byte[] bArr) {
        a(bArr, (byte) 1);
    }

    public void l(byte[] bArr) {
        a(bArr, (byte) 3);
    }

    public void m(byte[] bArr) {
        a(bArr, (byte) 2);
    }

    public void a(CRPRemoveBondCallback cRPRemoveBondCallback) {
        this.f13353f = cRPRemoveBondCallback;
    }

    public void c(byte[] bArr) {
        a(bArr, 8, true);
    }

    public void d(byte[] bArr) {
        a(bArr, 2, true);
    }

    public void e(byte[] bArr) {
        a(bArr, 1, true);
    }

    public void f(byte[] bArr) {
        a(bArr, 38, false);
    }

    public void g(byte[] bArr) {
        a(bArr, 64, false);
    }

    public void h(byte[] bArr) {
        h();
        if (this.f13353f == null || !Arrays.equals(bArr, o1.a())) {
            return;
        }
        this.f13353f.onSuccess();
        this.f13353f = null;
    }

    public void a(CRPBleSendStateListener cRPBleSendStateListener) {
        this.f13352e = cRPBleSendStateListener;
    }

    public void a(byte[] bArr) {
        a(bArr, 0, false);
    }

    private synchronized void a(byte[] bArr, byte b8) {
        BleLog.d("writeCompleted: " + this.f13349b);
        if (this.f13349b) {
            this.f13351d = b8;
            BleLog.i("WriteCmd: " + ((int) this.f13351d));
            this.f13348a = bArr;
            this.f13349b = false;
            com.crrepa.o.b.a().d();
            h();
        }
    }

    private void a(byte[] bArr, int i8, boolean z7) {
        if (com.crrepa.g1.c.h(bArr)) {
            return;
        }
        com.crrepa.p.c.d().a(new com.crrepa.p.a(i8, bArr, z7));
    }
}
