package com.crrepa.ble.conn.queue;

import com.crrepa.ble.util.BleLog;
import com.crrepa.p.c;

/* loaded from: classes3.dex */
public class CRPBleMessageManage {

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final CRPBleMessageManage f12292a = new CRPBleMessageManage();

        private b() {
        }
    }

    private CRPBleMessageManage() {
    }

    public static CRPBleMessageManage getInstance() {
        return b.f12292a;
    }

    public void start() {
        BleLog.d("ble cmd start");
        c.d().k();
    }

    public void stop() {
        BleLog.d("ble cmd stop");
        c.d().l();
    }
}
