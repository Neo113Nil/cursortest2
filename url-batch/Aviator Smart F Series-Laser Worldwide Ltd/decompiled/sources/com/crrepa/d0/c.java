package com.crrepa.d0;

import com.crrepa.ble.conn.listener.CRPBleConnectionStateListener;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.trans.upgrade.bean.HSFirmwareInfo;

/* loaded from: classes3.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private d f12353a;

    /* renamed from: b, reason: collision with root package name */
    private i f12354b;

    public c(d dVar) {
        this.f12353a = dVar;
        this.f12354b = dVar.b();
    }

    @Override // com.crrepa.d0.b
    public void a(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener, HSFirmwareInfo hSFirmwareInfo) {
        this.f12354b.a();
        this.f12354b.a(cRPBleFirmwareUpgradeListener);
        this.f12354b.c(hSFirmwareInfo);
    }

    @Override // com.crrepa.d0.b
    public void b() {
        this.f12354b.e();
    }

    @Override // com.crrepa.d0.b
    public void setConnectionStateListener(CRPBleConnectionStateListener cRPBleConnectionStateListener) {
        this.f12353a.a(cRPBleConnectionStateListener);
    }

    @Override // com.crrepa.d0.b
    public boolean a() {
        return this.f12354b.b();
    }
}
