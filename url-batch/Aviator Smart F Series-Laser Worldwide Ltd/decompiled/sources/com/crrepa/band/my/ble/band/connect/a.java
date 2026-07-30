package com.crrepa.band.my.ble.band.connect;

import android.text.TextUtils;
import com.crrepa.band.my.model.band.provider.BandInfoManager;

/* loaded from: classes2.dex */
public class a {
    private a() {
    }

    public static void connect() {
        if (f.getInstance().isStartDfu()) {
            return;
        }
        f.getInstance().establishConnection();
    }

    public static void disconnect(boolean z7) {
        f.getInstance().disconnect(z7);
    }

    public static void startConnectService() {
        if (TextUtils.isEmpty(BandInfoManager.getAddress())) {
            return;
        }
        com.orhanobut.logger.f.d("start BandConnectService");
        BandConnectService.start(com.moyoung.dafit.module.common.utils.d.get());
    }

    public static void stopConnectService() {
        BandConnectService.stop(com.moyoung.dafit.module.common.utils.d.get());
    }
}
