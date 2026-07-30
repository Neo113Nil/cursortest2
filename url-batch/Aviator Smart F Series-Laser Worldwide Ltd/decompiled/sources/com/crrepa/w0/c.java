package com.crrepa.w0;

import android.content.Context;
import android.text.TextUtils;
import com.crrepa.ble.CRPBleClient;
import com.crrepa.ble.conn.callback.CRPDeviceDfuTypeCallback;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.conn.listener.CRPBleSendStateListener;
import com.crrepa.ble.nrf.dfu.DfuProgressListener;
import com.crrepa.ble.nrf.dfu.DfuProgressListenerAdapter;
import com.crrepa.ble.nrf.dfu.DfuServiceController;
import com.crrepa.ble.nrf.dfu.DfuServiceInitiator;
import com.crrepa.ble.nrf.dfu.DfuServiceListenerHelper;
import com.crrepa.ble.scan.bean.CRPScanDevice;
import com.crrepa.ble.scan.callback.CRPScanCallback;
import com.crrepa.ble.trans.upgrade.DfuService;
import com.crrepa.ble.trans.upgrade.presenter.FirmwareUpgradePresenter;
import com.crrepa.ble.util.BleLog;
import com.crrepa.f.g;
import com.crrepa.g1.l;
import com.crrepa.g1.o;
import com.crrepa.m.f;
import com.google.android.exoplayer2.ExoPlayer;
import java.io.File;
import java.util.List;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: l, reason: collision with root package name */
    private static final int f13948l = 2000;

    /* renamed from: m, reason: collision with root package name */
    private static final int f13949m = 3;

    /* renamed from: n, reason: collision with root package name */
    private static final String f13950n = "gr-A";

    /* renamed from: o, reason: collision with root package name */
    private static final String f13951o = "gr-B";

    /* renamed from: a, reason: collision with root package name */
    private CRPBleFirmwareUpgradeListener f13952a;

    /* renamed from: b, reason: collision with root package name */
    private DfuServiceController f13953b;

    /* renamed from: c, reason: collision with root package name */
    private String f13954c;

    /* renamed from: d, reason: collision with root package name */
    private Context f13955d;

    /* renamed from: e, reason: collision with root package name */
    private CRPBleClient f13956e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13957f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13958g;

    /* renamed from: h, reason: collision with root package name */
    private int f13959h;

    /* renamed from: i, reason: collision with root package name */
    private String f13960i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13961j;

    /* renamed from: k, reason: collision with root package name */
    private final DfuProgressListener f13962k;

    class a implements CRPDeviceDfuTypeCallback {
        a() {
        }

        @Override // com.crrepa.ble.conn.callback.CRPDeviceDfuTypeCallback
        public void onDfuType(int i8) {
            c.this.a(i8);
        }
    }

    class b implements CRPBleSendStateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13964a;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f13958g = false;
                b bVar = b.this;
                c.this.b(bVar.f13964a);
            }
        }

        b(String str) {
            this.f13964a = str;
        }

        @Override // com.crrepa.ble.conn.listener.CRPBleSendStateListener
        public void onSendStateChange(int i8) {
            if (i8 == 1) {
                d4.a.a(new a(), ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
            }
        }
    }

    /* renamed from: com.crrepa.w0.c$c, reason: collision with other inner class name */
    class C0250c implements CRPScanCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13967a;

        /* renamed from: com.crrepa.w0.c$c$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f13956e.cancelScan();
            }
        }

        C0250c(String str) {
            this.f13967a = str;
        }

        @Override // com.crrepa.ble.scan.callback.CRPScanCallback
        public void onScanComplete(List<CRPScanDevice> list) {
            c.this.d(this.f13967a);
        }

        @Override // com.crrepa.ble.scan.callback.CRPScanCallback
        public void onScanning(CRPScanDevice cRPScanDevice) {
            if (c.this.f13958g) {
                return;
            }
            c.this.f13958g = true;
            String address = cRPScanDevice.getDevice().getAddress();
            BleLog.i("scan device: " + address);
            BleLog.i("scan device: " + this.f13967a);
            if (TextUtils.equals(address, this.f13967a)) {
                d4.a.a(new a(), 0L);
            }
        }
    }

    class d extends DfuProgressListenerAdapter {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.d(cVar.f13960i);
            }
        }

        d() {
        }

        @Override // com.crrepa.ble.nrf.dfu.DfuProgressListenerAdapter, com.crrepa.ble.nrf.dfu.DfuProgressListener
        public void onDfuAborted(String str) {
            super.onDfuAborted(str);
            c.this.f13952a.onUpgradeAborted();
        }

        @Override // com.crrepa.ble.nrf.dfu.DfuProgressListenerAdapter, com.crrepa.ble.nrf.dfu.DfuProgressListener
        public void onDfuCompleted(String str) {
            super.onDfuCompleted(str);
            c.this.f13952a.onUpgradeCompleted();
            DfuServiceListenerHelper.unregisterProgressListener(c.this.f13955d, c.this.f13962k);
        }

        @Override // com.crrepa.ble.nrf.dfu.DfuProgressListenerAdapter, com.crrepa.ble.nrf.dfu.DfuProgressListener
        public void onDfuProcessStarting(String str) {
            c.this.f13952a.onUpgradeProgressStarting(true);
        }

        @Override // com.crrepa.ble.nrf.dfu.DfuProgressListenerAdapter, com.crrepa.ble.nrf.dfu.DfuProgressListener
        public void onError(String str, int i8, int i9, String str2) {
            super.onError(str, i8, i9, str2);
            BleLog.i("error: " + i8);
            BleLog.i("message: " + str2);
            if (c.this.f13959h > 3) {
                c.this.f13952a.onError(i9, str2);
            } else {
                d4.a.a(new a(), 1000L);
            }
        }

        @Override // com.crrepa.ble.nrf.dfu.DfuProgressListenerAdapter, com.crrepa.ble.nrf.dfu.DfuProgressListener
        public void onProgressChanged(String str, int i8, float f8, float f9, int i9, int i10) {
            super.onProgressChanged(str, i8, f8, f9, i9, i10);
            c.this.f13952a.onUpgradeProgressChanged(i8, f8);
        }
    }

    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private static final c f13972a = new c(null);

        private e() {
        }
    }

    private c() {
        this.f13957f = false;
        this.f13958g = false;
        this.f13959h = 0;
        this.f13961j = false;
        this.f13962k = new d();
        Context a8 = com.crrepa.g1.d.a();
        this.f13955d = a8;
        this.f13956e = CRPBleClient.create(a8);
    }

    /* synthetic */ c(a aVar) {
        this();
    }

    private void b() {
        String b8 = com.crrepa.g1.d.b();
        if (d()) {
            d(b8);
        } else if (n4.a.b()) {
            f();
        } else {
            this.f13959h = 0;
            c(b8);
        }
    }

    public static c c() {
        return e.f13972a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        BleLog.i("start upgrade: " + str);
        if (TextUtils.isEmpty(str)) {
            this.f13952a.onError(18, "The device's Mac address is null!");
            return;
        }
        this.f13960i = str;
        this.f13959h++;
        DfuServiceListenerHelper.registerProgressListener(this.f13955d, this.f13962k);
        DfuServiceInitiator keepBond = new DfuServiceInitiator(str).setDeviceName("").setKeepBond(true);
        keepBond.setZip(null, this.f13954c);
        keepBond.setDisableNotification(true);
        this.f13953b = keepBond.start(com.crrepa.g1.d.a(), DfuService.class);
    }

    private void e() {
        com.crrepa.e.c.a().a(new a());
        f.e().a(com.crrepa.f.a.c());
    }

    private void f() {
        if (this.f13961j) {
            e();
        } else {
            a(new File(this.f13954c));
        }
    }

    public void a() {
        DfuServiceController dfuServiceController = this.f13953b;
        if (dfuServiceController == null || dfuServiceController.isAborted()) {
            com.crrepa.y0.b.a().abort();
        } else {
            this.f13953b.abort();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i8) {
        File file;
        BleLog.d("onDfuType: " + i8);
        String str = i8 == 1 ? f13951o : f13950n;
        try {
            file = o.a(new File(this.f13954c));
        } catch (Exception e8) {
            e8.printStackTrace();
            file = null;
        }
        if (file != null && file.listFiles() != null && 1 < file.listFiles().length) {
            for (File file2 : file.listFiles()) {
                if (file2.getName().contains(str)) {
                    a(file2);
                    return;
                }
            }
        }
        BleLog.e("file is error!");
        this.f13952a.onError(17, "Firmware is null!");
    }

    private void c(String str) {
        byte[] a8 = g.a(99, null);
        f e8 = f.e();
        e8.a(new b(str));
        e8.a(a8);
    }

    public boolean d() {
        return this.f13957f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        this.f13956e.scanDevice(new C0250c(l.a(str)), 10000L);
    }

    private void a(File file) {
        com.crrepa.y0.b a8 = com.crrepa.y0.b.a();
        a8.a(this.f13952a);
        a8.a(file);
        a8.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.f13954c = str;
        BleLog.i("onComplete：" + str);
        b();
    }

    public void a(boolean z7) {
        this.f13957f = z7;
    }

    public void a(boolean z7, CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        if (cRPBleFirmwareUpgradeListener == null) {
            return;
        }
        this.f13952a = cRPBleFirmwareUpgradeListener;
        this.f13961j = z7;
        FirmwareUpgradePresenter.getInstance().downloadNewFirmware(cRPBleFirmwareUpgradeListener, new m4.a() { // from class: com.crrepa.w0.b
            @Override // m4.a
            public final void onComplete(String str) {
                c.this.a(str);
            }
        });
    }
}
