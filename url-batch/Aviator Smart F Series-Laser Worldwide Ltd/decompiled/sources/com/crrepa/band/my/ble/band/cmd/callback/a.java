package com.crrepa.band.my.ble.band.cmd.callback;

import com.crrepa.band.my.model.band.provider.BandStorageProvider;
import com.crrepa.ble.conn.callback.CRPAvailableStorageCallback;

/* loaded from: classes2.dex */
public class a implements CRPAvailableStorageCallback {
    @Override // com.crrepa.ble.conn.callback.CRPAvailableStorageCallback
    public void onAvailableSize(int i8) {
        com.orhanobut.logger.f.d("onAvailableSize: " + i8);
        if (i8 == 0 && com.crrepa.band.my.ble.band.utils.a.getInstance().isSifli()) {
            i8 = 1;
        }
        BandStorageProvider.saveAvailableStorage(i8 * 1024);
    }
}
