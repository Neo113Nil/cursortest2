package com.crrepa.ble.trans.tp;

import com.crrepa.ble.conn.listener.CRPTransListener;

/* loaded from: classes3.dex */
public class CRPTpHelper {
    public void abort() {
        CRPTpTransInitiator.getInstance().abort();
    }

    public void start(String str, CRPTransListener cRPTransListener) {
        CRPTpTransInitiator.getInstance().start(str, cRPTransListener);
    }
}
