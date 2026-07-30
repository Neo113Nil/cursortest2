package com.crrepa.band.my.ble.band.cmd.callback;

import com.crrepa.band.my.model.db.HandWashing;
import com.crrepa.band.my.model.db.proxy.HandWashingDaoProxy;
import com.crrepa.ble.conn.bean.CRPHandWashingPeriodInfo;
import com.crrepa.ble.conn.callback.CRPDeviceHandWashingPeriodCallback;

/* loaded from: classes2.dex */
public class g implements CRPDeviceHandWashingPeriodCallback {
    @Override // com.crrepa.ble.conn.callback.CRPDeviceHandWashingPeriodCallback
    public void onHandWashingPeriod(CRPHandWashingPeriodInfo cRPHandWashingPeriodInfo) {
        com.orhanobut.logger.f.d("onHandWashingPeriod: " + cRPHandWashingPeriodInfo.getPeriod());
        HandWashingDaoProxy handWashingDaoProxy = new HandWashingDaoProxy();
        HandWashing handWashing = handWashingDaoProxy.get();
        if (handWashing == null) {
            handWashing = new HandWashing();
        }
        handWashing.setEnable(Boolean.valueOf(cRPHandWashingPeriodInfo.isEnable()));
        handWashing.setStartHour(Integer.valueOf(cRPHandWashingPeriodInfo.getStartHour()));
        handWashing.setStartMinute(Integer.valueOf(cRPHandWashingPeriodInfo.getStartMinute()));
        handWashing.setCount(Integer.valueOf(cRPHandWashingPeriodInfo.getCount()));
        handWashing.setPeriod(Integer.valueOf(cRPHandWashingPeriodInfo.getPeriod()));
        handWashingDaoProxy.insert(handWashing);
    }
}
