package com.crrepa.band.my.health.bodytemperature;

import com.crrepa.band.my.ble.band.cmd.d;
import com.crrepa.band.my.health.bodytemperature.model.BandTimingTempStateChangeEvent;
import com.crrepa.band.my.model.band.provider.BandTimingTempProvider;
import com.crrepa.ble.conn.callback.CRPTimingTempStateCallback;
import com.crrepa.ble.conn.type.CRPTimingTempState;
import com.orhanobut.logger.f;
import org.greenrobot.eventbus.c;

/* loaded from: classes2.dex */
public class b implements CRPTimingTempStateCallback {
    @Override // com.crrepa.ble.conn.callback.CRPTimingTempStateCallback
    public void onTimingState(CRPTimingTempState cRPTimingTempState) {
        f.d("onTimingState: " + cRPTimingTempState);
        BandTimingTempProvider.saveTimingTempState(cRPTimingTempState);
        boolean z7 = cRPTimingTempState == CRPTimingTempState.ENABLE;
        c.getDefault().post(new BandTimingTempStateChangeEvent(z7));
        if (z7) {
            d.getInstance().syncTodayTemp();
        }
    }
}
