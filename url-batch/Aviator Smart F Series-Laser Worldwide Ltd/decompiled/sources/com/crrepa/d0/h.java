package com.crrepa.d0;

import android.text.TextUtils;
import com.crrepa.ble.CRPBleClient;
import com.crrepa.ble.conn.CRPBleDevice;
import com.crrepa.ble.conn.listener.CRPBleConnectionStateListener;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.scan.bean.CRPScanDevice;
import com.crrepa.ble.scan.callback.CRPScanCallback;
import com.crrepa.ble.trans.upgrade.bean.HSFirmwareInfo;
import com.crrepa.ble.trans.upgrade.presenter.FirmwareUpgradePresenter;
import com.crrepa.ble.util.BleLog;
import com.google.android.exoplayer2.C;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: m, reason: collision with root package name */
    private static final String f12366m = "HS-OTA";

    /* renamed from: n, reason: collision with root package name */
    private static final int f12367n = 20000;

    /* renamed from: o, reason: collision with root package name */
    private static final int f12368o = 3000;

    /* renamed from: p, reason: collision with root package name */
    private static final int f12369p = 5;

    /* renamed from: a, reason: collision with root package name */
    private String f12370a;

    /* renamed from: b, reason: collision with root package name */
    private HSFirmwareInfo f12371b;

    /* renamed from: c, reason: collision with root package name */
    private CRPBleFirmwareUpgradeListener f12372c;

    /* renamed from: d, reason: collision with root package name */
    private CRPScanCallback f12373d = new e(this);

    /* renamed from: e, reason: collision with root package name */
    private CRPBleConnectionStateListener f12374e = new d(this);

    /* renamed from: f, reason: collision with root package name */
    private boolean f12375f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12376g = false;

    /* renamed from: h, reason: collision with root package name */
    private int f12377h = 0;

    /* renamed from: i, reason: collision with root package name */
    private CRPBleClient f12378i = CRPBleClient.create(com.crrepa.g1.d.a());

    /* renamed from: j, reason: collision with root package name */
    private CRPBleDevice f12379j;

    /* renamed from: k, reason: collision with root package name */
    private com.crrepa.d0.b f12380k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f12381l;

    class a implements m4.a {
        a() {
        }

        @Override // m4.a
        public void onComplete(String str) {
            h.this.c(str);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.h();
        }
    }

    class c implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f12384h;

        c(String str) {
            this.f12384h = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.a(this.f12384h);
        }
    }

    static class d implements CRPBleConnectionStateListener {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<h> f12386a;

        public d(h hVar) {
            this.f12386a = new WeakReference<>(hVar);
        }

        @Override // com.crrepa.ble.conn.listener.CRPBleConnectionStateListener
        public void onConnectionStateChange(int i8) {
            BleLog.i("hs onConnectionStateChange: " + i8);
            h hVar = this.f12386a.get();
            if (hVar == null) {
                return;
            }
            if (i8 == 0) {
                hVar.d();
            } else {
                if (i8 != 2) {
                    return;
                }
                hVar.c();
            }
        }
    }

    static class e implements CRPScanCallback {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<h> f12387a;

        public e(h hVar) {
            this.f12387a = new WeakReference<>(hVar);
        }

        @Override // com.crrepa.ble.scan.callback.CRPScanCallback
        public void onScanComplete(List<CRPScanDevice> list) {
            h hVar = this.f12387a.get();
            if (hVar == null) {
                return;
            }
            hVar.i();
        }

        @Override // com.crrepa.ble.scan.callback.CRPScanCallback
        public void onScanning(CRPScanDevice cRPScanDevice) {
            h hVar = this.f12387a.get();
            if (hVar == null) {
                return;
            }
            hVar.a(cRPScanDevice);
        }
    }

    private void b() {
        this.f12375f = false;
        this.f12378i.cancelScan();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        HSFirmwareInfo hSFirmwareInfo = this.f12371b;
        if (hSFirmwareInfo == null) {
            d("file decompression failed");
        } else {
            this.f12380k.a(this.f12372c, hSFirmwareInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f12380k.a()) {
            return;
        }
        g();
    }

    private void e() {
        FirmwareUpgradePresenter.getInstance().downloadNewFirmware(this.f12372c, new a());
    }

    private void g() {
        if (this.f12377h < 5) {
            a(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        } else {
            d("Not connected to the target band");
        }
        this.f12377h++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f12376g) {
            return;
        }
        this.f12375f = true;
        this.f12378i.scanDevice(this.f12373d, 20000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f12375f) {
            g();
        }
    }

    public void a() {
        this.f12376g = true;
        com.crrepa.d0.b bVar = this.f12380k;
        if (bVar != null) {
            bVar.b();
        }
        CRPBleDevice cRPBleDevice = this.f12379j;
        if (cRPBleDevice != null) {
            cRPBleDevice.disconnect();
        }
    }

    public void f() {
        File a8 = n4.a.a();
        if (a8 == null || !a8.exists()) {
            d("firmware file not exist");
        } else {
            this.f12376g = false;
            c(a8.getPath());
        }
    }

    private void a(long j8) {
        d4.a.a(new b(), j8);
    }

    public void e(String str) {
        this.f12370a = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        BleLog.i("file path：" + str);
        this.f12371b = new c4.a().a(str, false, this.f12381l);
        a(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    private void d(String str) {
        BleLog.i(str);
        CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener = this.f12372c;
        if (cRPBleFirmwareUpgradeListener != null) {
            cRPBleFirmwareUpgradeListener.onError(23, str);
        }
    }

    public void a(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        this.f12372c = cRPBleFirmwareUpgradeListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(CRPScanDevice cRPScanDevice) {
        if (cRPScanDevice != null) {
            try {
                if (this.f12375f) {
                    String name = cRPScanDevice.getDevice().getName();
                    String address = cRPScanDevice.getDevice().getAddress();
                    BleLog.i("address: " + address);
                    if (!TextUtils.equals(this.f12370a, address)) {
                        if (TextUtils.equals(name, f12366m)) {
                        }
                    }
                    b();
                    b(address);
                }
            } finally {
            }
        }
    }

    private void b(String str) {
        d4.a.a(new c(str), C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f12376g) {
            return;
        }
        CRPBleDevice bleDevice = this.f12378i.getBleDevice(str);
        this.f12379j = bleDevice;
        com.crrepa.d0.b connectDfu = bleDevice.connectDfu();
        this.f12380k = connectDfu;
        connectDfu.setConnectionStateListener(this.f12374e);
    }

    public void a(boolean z7) {
        this.f12376g = false;
        this.f12381l = z7;
        e();
    }
}
