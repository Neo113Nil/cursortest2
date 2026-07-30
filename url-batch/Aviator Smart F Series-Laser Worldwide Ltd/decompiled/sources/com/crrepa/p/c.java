package com.crrepa.p;

import android.annotation.SuppressLint;
import com.crrepa.ble.ota.goodix.BleRestoreWriteCharacteristicProxy;
import com.crrepa.ble.util.BleLog;
import com.crrepa.m.d;
import com.crrepa.m.e;
import com.crrepa.m.f;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    private static final long f13605e = 5000;

    /* renamed from: a, reason: collision with root package name */
    private com.crrepa.p.b f13606a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13607b;

    /* renamed from: c, reason: collision with root package name */
    private long f13608c;

    /* renamed from: d, reason: collision with root package name */
    private e f13609d;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final c f13610a = new c();

        private b() {
        }
    }

    private c() {
        this.f13606a = new com.crrepa.p.b();
        this.f13607b = true;
        this.f13608c = 0L;
    }

    public static c d() {
        return b.f13610a;
    }

    private synchronized void e() {
        if (!this.f13606a.e()) {
            BleLog.i("message queue is null");
            return;
        }
        BleLog.i("isMessageHandleComplete: " + f());
        if (!f()) {
            if (g()) {
                i();
                h();
            }
            return;
        }
        com.crrepa.p.a d8 = this.f13606a.d();
        if (d8 == null) {
            BleLog.i("ble message is null");
            return;
        }
        a(false);
        int b8 = d8.b();
        byte[] a8 = d8.a();
        BleLog.i("message type: " + b8);
        BleLog.i("message content: " + com.crrepa.g1.c.c(a8));
        if (b8 == 38) {
            f.e().l(a8);
        } else if (b8 == 39) {
            f.e().j(a8);
        } else if (b8 != 48) {
            if (b8 != 64) {
                switch (b8) {
                    case 1:
                        f.e().k(a8);
                        break;
                    case 2:
                        f.e().m(a8);
                        break;
                    case 3:
                        this.f13609d.a((int) a8[0]);
                        break;
                    case 4:
                        d.c().a(a8[0]);
                        break;
                    case 5:
                        a(a8);
                        break;
                    case 6:
                        com.crrepa.d0.a.d().c(a8);
                        break;
                    case 7:
                        com.crrepa.d0.a.d().d(a8);
                        break;
                }
            }
            f.e().i(a8);
        } else {
            BleRestoreWriteCharacteristicProxy.getInstance().sendBleMessage(a8);
        }
        j();
    }

    private boolean g() {
        long currentTimeMillis = System.currentTimeMillis() - this.f13608c;
        BleLog.i("period: " + currentTimeMillis);
        return currentTimeMillis >= 5000;
    }

    private void j() {
        this.f13608c = System.currentTimeMillis();
    }

    public void a() {
        a(true);
        this.f13606a.a();
    }

    public void b() {
        this.f13606a.b();
    }

    public void c() {
        this.f13606a.c();
    }

    public boolean f() {
        return this.f13607b;
    }

    public void h() {
        a(true);
        e();
    }

    public void i() {
        f.e().g();
    }

    public void k() {
        this.f13606a.a(false);
        e();
    }

    public void l() {
        this.f13606a.a(true);
    }

    public void a(e eVar) {
        this.f13609d = eVar;
    }

    public void a(com.crrepa.p.a aVar) {
        this.f13606a.a(aVar);
        e();
    }

    public void a(boolean z7) {
        BleLog.i("setMessageHandleComplete: " + z7);
        this.f13607b = z7;
    }

    @SuppressLint({"MissingPermission"})
    private void a(byte[] bArr) {
        int b8 = com.crrepa.g1.c.b(bArr[0], bArr[1]);
        BleLog.d("requestMtu: " + b8);
        com.crrepa.l.a.b().a().requestMtu(b8);
    }
}
