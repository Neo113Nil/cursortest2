package com.crrepa.c0;

import com.crrepa.ble.R;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.trans.upgrade.presenter.FirmwareUpgradePresenter;
import com.crrepa.ble.util.BleLog;
import java.io.File;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    private static final String f12327c = "/user/update.fwpkg";

    /* renamed from: a, reason: collision with root package name */
    private CRPBleFirmwareUpgradeListener f12328a;

    /* renamed from: b, reason: collision with root package name */
    private final com.crrepa.s0.c f12329b = com.crrepa.s0.d.a().a((byte) 8);

    class a implements CRPFileTransListener {
        a() {
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onError(int i8) {
            BleLog.d("hisilicon ota error: " + i8);
            d.this.d();
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransCompleted() {
            d.this.c();
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressChanged(int i8) {
            d.this.a(i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressStarting() {
        }
    }

    protected void c() {
        CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener = this.f12328a;
        if (cRPBleFirmwareUpgradeListener != null) {
            cRPBleFirmwareUpgradeListener.onUpgradeCompleted();
        }
    }

    protected void d() {
        CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener = this.f12328a;
        if (cRPBleFirmwareUpgradeListener != null) {
            cRPBleFirmwareUpgradeListener.onError(23, com.crrepa.g1.d.a().getString(R.string.dfu_status_error_msg));
        }
    }

    protected void e() {
        CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener = this.f12328a;
        if (cRPBleFirmwareUpgradeListener != null) {
            cRPBleFirmwareUpgradeListener.onUpgradeProgressStarting(true);
        }
    }

    public void f() {
        FirmwareUpgradePresenter.getInstance().downloadNewFirmware(this.f12328a, new m4.a() { // from class: com.crrepa.c0.c
            @Override // m4.a
            public final void onComplete(String str) {
                d.this.a(str);
            }
        });
    }

    private void b() {
        CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener = this.f12328a;
        if (cRPBleFirmwareUpgradeListener != null) {
            cRPBleFirmwareUpgradeListener.onError(24, com.crrepa.g1.d.a().getString(R.string.dfu_status_error_msg));
        }
    }

    public void a() {
        this.f12329b.abort();
    }

    protected void a(int i8) {
        CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener = this.f12328a;
        if (cRPBleFirmwareUpgradeListener != null) {
            cRPBleFirmwareUpgradeListener.onUpgradeProgressChanged(i8, 1.0f);
        }
    }

    public void a(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        this.f12328a = cRPBleFirmwareUpgradeListener;
        this.f12329b.a(new a());
    }

    public void a(final File file) {
        e.a().a(new com.crrepa.c0.a() { // from class: com.crrepa.c0.b
            @Override // com.crrepa.c0.a
            public final void onAvailableSize(int i8) {
                d.this.a(file, i8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(File file, int i8) {
        BleLog.d("hisilicon ota file size: " + file.length());
        if (file.length() >= i8 * 1024) {
            b();
        } else {
            e();
            this.f12329b.a(file, f12327c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        a(new File(str));
    }
}
