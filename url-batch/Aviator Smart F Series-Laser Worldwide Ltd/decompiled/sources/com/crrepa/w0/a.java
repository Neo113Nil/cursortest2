package com.crrepa.w0;

import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import com.crrepa.ble.CRPBleClient;
import com.crrepa.ble.conn.bean.CRPFirmwareVersionInfo;
import com.crrepa.ble.conn.callback.CRPDeviceNewFirmwareVersionCallback;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.scan.bean.CRPScanDevice;
import com.crrepa.ble.scan.callback.CRPScanCallback;
import com.crrepa.ble.trans.upgrade.presenter.FirmwareUpgradePresenter;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.l;
import java.util.List;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private CRPBleFirmwareUpgradeListener f13938b;

    /* renamed from: c, reason: collision with root package name */
    private String f13939c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13940d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13941e = false;

    /* renamed from: a, reason: collision with root package name */
    private CRPBleClient f13937a = CRPBleClient.create(com.crrepa.g1.d.a());

    /* renamed from: com.crrepa.w0.a$a, reason: collision with other inner class name */
    class C0248a implements CRPScanCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13942a;

        /* renamed from: com.crrepa.w0.a$a$a, reason: collision with other inner class name */
        class RunnableC0249a implements Runnable {
            RunnableC0249a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f13937a.cancelScan();
            }
        }

        C0248a(String str) {
            this.f13942a = str;
        }

        @Override // com.crrepa.ble.scan.callback.CRPScanCallback
        public void onScanComplete(List<CRPScanDevice> list) {
            if (a.this.f13940d) {
                return;
            }
            a.this.f13938b.onError(19, "not found the need to fix the bracelet!");
        }

        @Override // com.crrepa.ble.scan.callback.CRPScanCallback
        public void onScanning(CRPScanDevice cRPScanDevice) {
            BleLog.i("scan device: " + cRPScanDevice.getDevice().getAddress());
            if (a.this.f13940d) {
                return;
            }
            a aVar = a.this;
            if (aVar.a(aVar.f13939c, cRPScanDevice)) {
                a.this.f13940d = true;
                d4.a.a(new RunnableC0249a(), 0L);
                BluetoothDevice device = cRPScanDevice.getDevice();
                a.this.a(this.f13942a, device.getName(), device.getAddress());
            }
        }
    }

    class b implements CRPDeviceNewFirmwareVersionCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13945a;

        b(String str) {
            this.f13945a = str;
        }

        @Override // com.crrepa.ble.conn.callback.CRPDeviceNewFirmwareVersionCallback
        public void onLatestVersion() {
            a.this.f13938b.onError(21, "Already the latest firmware version!");
        }

        @Override // com.crrepa.ble.conn.callback.CRPDeviceNewFirmwareVersionCallback
        public void onNewFirmwareVersion(CRPFirmwareVersionInfo cRPFirmwareVersionInfo) {
            a.this.a(this.f13945a);
        }
    }

    private String a(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : com.crrepa.g1.b.a(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        com.crrepa.g1.d.a(str);
        c.c().a(true);
        c.c().a(this.f13941e, this.f13938b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3) {
        String a8 = a(str, str2);
        if (TextUtils.isEmpty(a8)) {
            this.f13938b.onError(20, "Please provide the firmware version before the upgrade!");
        } else {
            FirmwareUpgradePresenter.getInstance().checkFirmwareVersion(a8, 0, new b(str3));
        }
    }

    public void a(String str, String str2, boolean z7, CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        this.f13938b = cRPBleFirmwareUpgradeListener;
        this.f13941e = z7;
        this.f13939c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f13939c = l.a(str);
        }
        this.f13940d = false;
        this.f13937a.scanDevice(new C0248a(str2), 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, CRPScanDevice cRPScanDevice) {
        BluetoothDevice device = cRPScanDevice.getDevice();
        if (com.crrepa.g1.b.b(device.getName())) {
            return TextUtils.isEmpty(str) || TextUtils.equals(str, device.getAddress());
        }
        return false;
    }
}
