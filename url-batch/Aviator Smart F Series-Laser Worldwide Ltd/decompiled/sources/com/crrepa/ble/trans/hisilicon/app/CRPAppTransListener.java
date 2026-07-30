package com.crrepa.ble.trans.hisilicon.app;

import com.crrepa.ble.conn.listener.CRPFileTransListener;

/* loaded from: classes3.dex */
public interface CRPAppTransListener extends CRPFileTransListener {
    void onInstallFail(int i8);

    void onInstallSuccess();
}
