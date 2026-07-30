package com.crrepa.band.my.ble.band.cmd.callback;

import com.crrepa.band.my.model.band.provider.BandNotificationListProvider;
import com.crrepa.ble.conn.callback.CRPMessageListCallback;
import java.util.List;

/* loaded from: classes2.dex */
public class l implements CRPMessageListCallback {
    @Override // com.crrepa.ble.conn.callback.CRPMessageListCallback
    public void onMessageList(List<Integer> list) {
        com.orhanobut.logger.f.d("onMessageList: " + list);
        BandNotificationListProvider.saveNotificationList(list);
    }
}
