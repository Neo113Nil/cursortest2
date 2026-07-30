package com.crrepa.ble.trans.upgrade;

import android.app.Activity;
import com.crrepa.ble.nrf.dfu.DfuBaseService;

/* loaded from: classes3.dex */
public class DfuService extends DfuBaseService {
    @Override // com.crrepa.ble.nrf.dfu.DfuBaseService
    protected Class<? extends Activity> getNotificationTarget() {
        return NotificationActivity.class;
    }

    @Override // com.crrepa.ble.nrf.dfu.DfuBaseService
    protected boolean isDebug() {
        return false;
    }
}
