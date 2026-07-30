package com.crrepa.band.my.health.sleep;

import com.crrepa.band.my.health.sleep.model.BandSleepChangeEvent;
import com.crrepa.band.my.health.sleep.model.BandSleepNapChangeEvent;
import com.crrepa.band.my.model.band.provider.SleepNapProvider;
import com.crrepa.band.my.model.db.Sleep;
import com.crrepa.band.my.model.db.helper.SleepNapSaveHelper;
import com.crrepa.band.my.model.db.helper.SleepSaveHelper;
import com.crrepa.ble.conn.bean.CRPNapSleepInfo;
import com.crrepa.ble.conn.bean.CRPSleepInfo;
import com.crrepa.ble.conn.listener.CRPSleepChangeListener;
import com.crrepa.ble.conn.type.CRPHistoryDay;
import com.orhanobut.logger.f;
import java.util.List;

/* loaded from: classes2.dex */
public class a implements CRPSleepChangeListener {
    private final SleepSaveHelper sleepSaveHelper = new SleepSaveHelper();
    private final SleepNapSaveHelper sleepNapSaveHelper = new SleepNapSaveHelper();

    @Override // com.crrepa.ble.conn.listener.CRPSleepChangeListener
    public void onHistoryNapSleepChange(CRPHistoryDay cRPHistoryDay, List<CRPNapSleepInfo> list) {
        f.d("onHistoryNapSleepChange: " + cRPHistoryDay);
        com.crrepa.band.my.ble.band.cmd.d.getInstance().queryHistoryNapSleep(cRPHistoryDay.nextDay());
        SleepNapProvider.saveSupportSleepNap();
        this.sleepNapSaveHelper.saveSleepNap(-cRPHistoryDay.getValue(), list);
        if (cRPHistoryDay == CRPHistoryDay.TODAY) {
            org.greenrobot.eventbus.c.getDefault().post(new BandSleepNapChangeEvent());
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPSleepChangeListener
    public void onHistorySleepChange(CRPHistoryDay cRPHistoryDay, CRPSleepInfo cRPSleepInfo) {
        Sleep convert;
        f.d("onHistorySleepChange: " + cRPHistoryDay + "-" + cRPSleepInfo.toString());
        com.crrepa.band.my.ble.band.cmd.d.getInstance().queryHistorySleep(cRPHistoryDay.nextDay());
        if (cRPSleepInfo.getTotalTime() > 0 && (convert = z2.a.convert(cRPSleepInfo)) != null) {
            this.sleepSaveHelper.saveHistorySleep(-cRPHistoryDay.getValue(), convert);
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPSleepChangeListener
    public void onSleepChange(CRPSleepInfo cRPSleepInfo) {
        f.d("sleep: " + cRPSleepInfo.getTotalTime());
        Sleep convert = z2.a.convert(cRPSleepInfo);
        if (convert != null) {
            this.sleepSaveHelper.saveTodaySleep(convert);
            org.greenrobot.eventbus.c.getDefault().post(new BandSleepChangeEvent(convert));
            com.crrepa.band.my.health.base.c.getInstance().uploadBandSleep(convert);
        }
    }
}
