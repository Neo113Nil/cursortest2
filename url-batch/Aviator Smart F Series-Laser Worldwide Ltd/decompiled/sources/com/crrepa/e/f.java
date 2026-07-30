package com.crrepa.e;

import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import com.crrepa.ble.conn.listener.CRPBleConnectionStateListener;
import com.crrepa.ble.conn.type.CRPProtocolVersion;

/* loaded from: classes3.dex */
public class f implements b {

    /* renamed from: a, reason: collision with root package name */
    private CRPBleConnectionStateListener f12417a;

    public f(CRPBleConnectionStateListener cRPBleConnectionStateListener) {
        this.f12417a = cRPBleConnectionStateListener;
    }

    @RequiresApi(api = 21)
    @MainThread
    private void a() {
        com.crrepa.p.c.d().a(new com.crrepa.p.a(5, com.crrepa.g1.c.b(512)));
    }

    private void b() {
        CRPBleConnectionStateListener cRPBleConnectionStateListener = this.f12417a;
        if (cRPBleConnectionStateListener != null) {
            cRPBleConnectionStateListener.onConnectionStateChange(2);
        }
    }

    private boolean b(CRPProtocolVersion cRPProtocolVersion) {
        return cRPProtocolVersion != CRPProtocolVersion.V1;
    }

    @Override // com.crrepa.e.b
    public void a(CRPProtocolVersion cRPProtocolVersion) {
        com.crrepa.l.a.b().a(cRPProtocolVersion);
        if (b(cRPProtocolVersion)) {
            a();
        } else {
            com.crrepa.l.a.b().j();
            b();
        }
    }
}
