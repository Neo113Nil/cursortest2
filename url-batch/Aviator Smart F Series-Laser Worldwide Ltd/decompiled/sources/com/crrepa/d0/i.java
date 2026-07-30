package com.crrepa.d0;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.trans.upgrade.bean.HSFirmwareInfo;
import com.crrepa.ble.util.BleLog;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private CRPBleFirmwareUpgradeListener f12388a;

    /* renamed from: c, reason: collision with root package name */
    private Handler f12390c = new b(this);

    /* renamed from: d, reason: collision with root package name */
    private boolean f12391d = false;

    /* renamed from: b, reason: collision with root package name */
    private com.crrepa.j1.i f12389b = new com.crrepa.j1.i(com.crrepa.g1.d.a(), this.f12390c);

    class a implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ HSFirmwareInfo f12392h;

        a(HSFirmwareInfo hSFirmwareInfo) {
            this.f12392h = hSFirmwareInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean a8 = i.this.a(this.f12392h);
            i.this.e();
            i.this.a(true);
            if (a8) {
                i.this.c();
            }
        }
    }

    private static class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<i> f12394a;

        /* renamed from: b, reason: collision with root package name */
        private float f12395b = 100.0f;

        /* renamed from: c, reason: collision with root package name */
        private float f12396c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        private int f12397d = 0;

        public b(i iVar) {
            this.f12394a = new WeakReference<>(iVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i8 = message.what;
            int i9 = message.arg1;
            int i10 = message.arg2;
            BleLog.i("HS handleMessage what: " + i8);
            BleLog.i("HS handleMessage arg1 " + i9);
            BleLog.i("HS handleMessage arg2 " + i10);
            i iVar = this.f12394a.get();
            if (iVar == null) {
            }
            if (i9 == 1000) {
                iVar.b(message, i10);
                return;
            }
            if (i9 == 1008) {
                this.f12396c = ((Float) message.obj).floatValue();
                return;
            }
            switch (i9) {
                case 1002:
                    this.f12395b = i10;
                    break;
                case 1003:
                    int i11 = (int) ((i10 / this.f12395b) * 100.0f);
                    if (i11 != this.f12397d) {
                        iVar.a(i11, this.f12396c);
                        this.f12397d = i11;
                        break;
                    }
                    break;
                case 1004:
                    iVar.c(message, i10);
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message, int i8) {
        com.crrepa.d0.a.d().a(a(message, i8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener = this.f12388a;
        if (cRPBleFirmwareUpgradeListener != null) {
            cRPBleFirmwareUpgradeListener.onUpgradeCompleted();
        }
    }

    private void d() {
        CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener = this.f12388a;
        if (cRPBleFirmwareUpgradeListener != null) {
            cRPBleFirmwareUpgradeListener.onUpgradeProgressStarting(false);
        }
    }

    private void f() {
        this.f12389b.a(false);
    }

    public void a() {
        com.crrepa.d0.a.d().g();
        com.crrepa.p.c.d().a();
    }

    protected void e() {
        this.f12389b.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i8, float f8) {
        CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener = this.f12388a;
        if (cRPBleFirmwareUpgradeListener != null) {
            cRPBleFirmwareUpgradeListener.onUpgradeProgressChanged(i8, f8);
        }
    }

    private void b(HSFirmwareInfo hSFirmwareInfo) {
        d();
        f();
        new Thread(new a(hSFirmwareInfo)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message, int i8) {
        com.crrepa.d0.a.d().b(a(message, i8));
    }

    public void a(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        this.f12388a = cRPBleFirmwareUpgradeListener;
    }

    protected void c(HSFirmwareInfo hSFirmwareInfo) {
        a(false);
        b(hSFirmwareInfo);
    }

    public boolean b() {
        return this.f12391d;
    }

    private void a(String str) {
        CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener = this.f12388a;
        if (cRPBleFirmwareUpgradeListener != null) {
            cRPBleFirmwareUpgradeListener.onError(23, str);
        }
    }

    public void a(boolean z7) {
        this.f12391d = z7;
    }

    public void a(byte[] bArr, int i8) {
        BleLog.i("setBluetoothNotifyData type: " + i8);
        this.f12389b.b(bArr, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(HSFirmwareInfo hSFirmwareInfo) {
        String userFilePath = hSFirmwareInfo.getUserFilePath();
        String appFilePath = hSFirmwareInfo.getAppFilePath();
        String configFilePath = hSFirmwareInfo.getConfigFilePath();
        String patchFilePath = hSFirmwareInfo.getPatchFilePath();
        if (!TextUtils.isEmpty(userFilePath)) {
            byte[] a8 = com.crrepa.g1.h.a(userFilePath);
            if (a8 == null) {
                a("load user file error");
                return false;
            }
            BleLog.i("user file size: " + a8.length);
            String userStartAddress = hSFirmwareInfo.getUserStartAddress();
            BleLog.i("start address: " + userStartAddress);
            int a9 = this.f12389b.a(a8, userStartAddress);
            BleLog.i("WriteUserData success: " + a9);
            if (a9 < 0) {
                a("load user file error");
                return false;
            }
        }
        return a(appFilePath, 3, "load app file error") && a(configFilePath, 4, "load config file error") && a(patchFilePath, 5, "load patch file error");
    }

    private boolean a(String str, int i8, String str2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        byte[] a8 = com.crrepa.g1.h.a(str);
        BleLog.i("Binary file size: " + a8.length);
        int a9 = this.f12389b.a(a8, i8);
        BleLog.i("LoadBinary: " + a9);
        if (a9 >= 0) {
            return true;
        }
        a(str2);
        return false;
    }

    private byte[] a(Message message, int i8) {
        byte[] bArr = new byte[i8];
        System.arraycopy((byte[]) message.obj, 0, bArr, 0, i8);
        return bArr;
    }
}
