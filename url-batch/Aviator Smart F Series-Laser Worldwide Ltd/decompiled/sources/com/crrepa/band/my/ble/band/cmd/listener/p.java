package com.crrepa.band.my.ble.band.cmd.listener;

import com.crrepa.ble.conn.bean.CRPConnectKitMessage;
import com.crrepa.ble.conn.listener.CRPConnectKitListener;

/* loaded from: classes2.dex */
public class p implements CRPConnectKitListener {
    @Override // com.crrepa.ble.conn.listener.CRPConnectKitListener
    public void onAppPingChanged(boolean z7, CRPConnectKitMessage cRPConnectKitMessage, int i8) {
        if (z7) {
            com.crrepa.band.my.ble.watchconnect.manager.j.getInstance().replyDevicePingApp(cRPConnectKitMessage);
        } else {
            com.crrepa.band.my.ble.watchconnect.manager.j.getInstance().onCallBack(cRPConnectKitMessage, i8);
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPConnectKitListener
    public void onAvailableStorageChanged(int i8) {
        com.crrepa.band.my.ble.watchconnect.manager.e.saveAvailableKbytes(i8);
    }

    @Override // com.crrepa.ble.conn.listener.CRPConnectKitListener
    public void onReceiveMessageChanged(CRPConnectKitMessage cRPConnectKitMessage) {
        com.crrepa.band.my.ble.watchconnect.manager.g.getInstance().onReceiveMessageChanged(cRPConnectKitMessage);
    }

    @Override // com.crrepa.ble.conn.listener.CRPConnectKitListener
    public void onSendMessageChanged(CRPConnectKitMessage cRPConnectKitMessage, int i8) {
        com.crrepa.band.my.ble.watchconnect.manager.c.getInstance().onCallBack(cRPConnectKitMessage, i8);
    }
}
