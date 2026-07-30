package com.crrepa.ble.ota.goodix;

import com.crrepa.l.a;
import com.crrepa.m.b;
import com.crrepa.q.c;

/* loaded from: classes3.dex */
public abstract class BleRestoreGattProxy {
    public static void disconnect() {
        b.c(a.b().f());
    }

    protected BleRestoreDeviceServices getDeviceServices() {
        return c.c().d();
    }
}
