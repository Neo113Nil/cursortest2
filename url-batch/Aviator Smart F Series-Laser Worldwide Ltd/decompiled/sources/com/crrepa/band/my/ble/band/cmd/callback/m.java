package com.crrepa.band.my.ble.band.cmd.callback;

import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.band.provider.BandPhysiologcalPeriodProvider;
import com.crrepa.band.my.model.db.PhysiologicalPeriod;
import com.crrepa.band.my.model.db.PhysiologicalRemind;
import com.crrepa.band.my.model.db.proxy.PhysiologicalPeriodDaoProxy;
import com.crrepa.band.my.model.db.proxy.PhysiologicalRemindDaoProxy;
import com.crrepa.ble.conn.bean.CRPPhysiologcalPeriodInfo;
import com.crrepa.ble.conn.callback.CRPDevicePhysiologcalPeriodCallback;

/* loaded from: classes2.dex */
public class m implements CRPDevicePhysiologcalPeriodCallback {
    private void sendPhysiologcalPeriod() {
        PhysiologicalRemind physiologicalRemind = new PhysiologicalRemindDaoProxy().getPhysiologicalRemind();
        if (physiologicalRemind == null) {
            return;
        }
        PhysiologicalPeriodDaoProxy physiologicalPeriodDaoProxy = new PhysiologicalPeriodDaoProxy();
        PhysiologicalPeriod lastPhysiologcalPeriod = physiologicalPeriodDaoProxy.getLastPhysiologcalPeriod();
        if (physiologicalPeriodDaoProxy.isEmpty(lastPhysiologcalPeriod)) {
            return;
        }
        CRPPhysiologcalPeriodInfo cRPPhysiologcalPeriodInfo = new CRPPhysiologcalPeriodInfo();
        cRPPhysiologcalPeriodInfo.setReminderHour(physiologicalRemind.getHour().intValue());
        cRPPhysiologcalPeriodInfo.setReminderMinute(physiologicalRemind.getMinute().intValue());
        if (PhysiologicalRemindDaoProxy.isEnable(physiologicalRemind)) {
            cRPPhysiologcalPeriodInfo.setOvulationEndReminder(physiologicalRemind.getOvulationEnd().booleanValue());
            cRPPhysiologcalPeriodInfo.setOvulationDayReminder(physiologicalRemind.getOvulationDay().booleanValue());
            cRPPhysiologcalPeriodInfo.setOvulationReminder(physiologicalRemind.getOvulation().booleanValue());
            cRPPhysiologcalPeriodInfo.setMenstrualReminder(physiologicalRemind.getMenstrual().booleanValue());
        }
        cRPPhysiologcalPeriodInfo.setMenstrualPeriod(lastPhysiologcalPeriod.getMenstrualPeriod().intValue());
        cRPPhysiologcalPeriodInfo.setPhysiologcalPeriod(lastPhysiologcalPeriod.getPhysiologicalPeriod().intValue());
        cRPPhysiologcalPeriodInfo.setStartDate(lastPhysiologcalPeriod.getLastMenstrualDate());
        i4.getInstance().sendPhysiologcalPeriod(cRPPhysiologcalPeriodInfo);
    }

    @Override // com.crrepa.ble.conn.callback.CRPDevicePhysiologcalPeriodCallback
    public void onPhysiologcalPeriod(CRPPhysiologcalPeriodInfo cRPPhysiologcalPeriodInfo) {
        if (cRPPhysiologcalPeriodInfo == null) {
            return;
        }
        com.orhanobut.logger.f.d("onPhysiologcalPeriod: " + cRPPhysiologcalPeriodInfo);
        BandPhysiologcalPeriodProvider.saveSupportPhysiologcalPeriod(true);
        BandPhysiologcalPeriodProvider.saveAcrossYears(cRPPhysiologcalPeriodInfo.isAcrossYears());
        sendPhysiologcalPeriod();
        org.greenrobot.eventbus.c.getDefault().post(new v2.b(true));
    }
}
