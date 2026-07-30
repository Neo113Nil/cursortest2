package com.crrepa.band.my.ble.band;

import com.crrepa.ble.CRPBleClient;
import com.moyoung.dafit.module.common.utils.d;

/* loaded from: classes2.dex */
public class a {
    private CRPBleClient bleClient;

    private static class b {
        private static final a INSTANCE = new a();

        private b() {
        }
    }

    public static CRPBleClient getBleClient() {
        return b.INSTANCE.bleClient;
    }

    private a() {
        this.bleClient = CRPBleClient.create(d.get());
    }
}
