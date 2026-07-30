package com.crrepa.band.my.model.db.helper;

import com.crrepa.band.my.model.db.TimingTemp;
import com.crrepa.band.my.model.db.proxy.TimingTempDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;

/* loaded from: classes2.dex */
public class TimingTempSaveHelper {
    private TimingTempDaoProxy timingTempDaoProxy = new TimingTempDaoProxy();

    private void save(TimingTemp timingTemp, TimingTemp timingTemp2) {
        if (timingTemp2 == null) {
            this.timingTempDaoProxy.insert(timingTemp);
        } else {
            timingTemp.setId(timingTemp2.getId());
            this.timingTempDaoProxy.update(timingTemp);
        }
    }

    public void saveHistoryTemp(int i8, TimingTemp timingTemp) {
        Date dateOfOffsetDay = m.getDateOfOffsetDay(new Date(), i8);
        timingTemp.setDate(dateOfOffsetDay);
        save(timingTemp, this.timingTempDaoProxy.get(dateOfOffsetDay));
    }

    public void saveTodayTemp(TimingTemp timingTemp) {
        save(timingTemp, this.timingTempDaoProxy.get(new Date()));
    }
}
