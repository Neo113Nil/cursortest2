package com.crrepa.y0;

import com.crrepa.ble.R;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.d;
import com.crrepa.l0.g;
import com.crrepa.l0.i;
import java.io.File;

/* loaded from: classes3.dex */
public class b extends g {

    /* renamed from: a, reason: collision with root package name */
    private CRPBleFirmwareUpgradeListener f14053a;

    /* renamed from: b, reason: collision with root package name */
    private File f14054b;

    /* renamed from: com.crrepa.y0.b$b, reason: collision with other inner class name */
    private static class C0252b {

        /* renamed from: a, reason: collision with root package name */
        private static b f14055a = new b();

        private C0252b() {
        }
    }

    private b() {
    }

    public static b a() {
        return C0252b.f14055a;
    }

    public void abort() {
        sendFileCheckResult(false);
        release();
    }

    public void b() {
        createFileManager(this.f14054b, 0);
        String c8 = d.c();
        BleLog.i("firmwareVersion: " + c8);
        setPacketLength(i.a(c8));
        if (this.mTransFileManager == null) {
            a(false);
            return;
        }
        this.f14053a.onUpgradeProgressStarting(true);
        startTrans();
        startTimer();
    }

    @Override // com.crrepa.l0.g
    public int getCmd() {
        return 99;
    }

    @Override // com.crrepa.l0.g
    protected void onCrcFail() {
        a(false);
    }

    @Override // com.crrepa.l0.g
    protected void onTimeoutError() {
        a(true);
    }

    @Override // com.crrepa.l0.g
    protected void onTransChanged(int i8) {
        CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener = this.f14053a;
        if (cRPBleFirmwareUpgradeListener != null) {
            cRPBleFirmwareUpgradeListener.onUpgradeProgressChanged(i8, 1.0f);
        }
    }

    @Override // com.crrepa.l0.g
    protected void onTransComplete() {
        CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener = this.f14053a;
        if (cRPBleFirmwareUpgradeListener != null) {
            cRPBleFirmwareUpgradeListener.onUpgradeCompleted();
        }
    }

    @Override // com.crrepa.l0.g
    protected void onTransFileError() {
        a(true);
    }

    @Override // com.crrepa.l0.g
    protected void onTransFileNull() {
        a(true);
    }

    @Override // com.crrepa.l0.g
    protected void onTransStarting() {
    }

    public void a(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        this.f14053a = cRPBleFirmwareUpgradeListener;
    }

    public void a(File file) {
        this.f14054b = file;
    }

    private void a(boolean z7) {
        CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener = this.f14053a;
        if (cRPBleFirmwareUpgradeListener != null) {
            cRPBleFirmwareUpgradeListener.onError(23, d.a().getString(R.string.dfu_status_error_msg));
        }
        if (z7) {
            sendFileCheckResult(false);
        }
        release();
    }
}
