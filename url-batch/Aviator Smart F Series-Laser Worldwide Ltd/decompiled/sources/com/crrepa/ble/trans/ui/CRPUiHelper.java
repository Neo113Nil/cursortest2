package com.crrepa.ble.trans.ui;

import com.crrepa.ble.conn.listener.CRPTransListener;
import java.io.File;

/* loaded from: classes3.dex */
public class CRPUiHelper {
    public void abort() {
        CRPUiTransInitiator.getInstance().abort();
    }

    public void start(File file, int i8, String str, CRPTransListener cRPTransListener) {
        CRPUiTransInitiator cRPUiTransInitiator = CRPUiTransInitiator.getInstance();
        cRPUiTransInitiator.setListener(cRPTransListener);
        cRPUiTransInitiator.start(file, i8, str);
    }
}
