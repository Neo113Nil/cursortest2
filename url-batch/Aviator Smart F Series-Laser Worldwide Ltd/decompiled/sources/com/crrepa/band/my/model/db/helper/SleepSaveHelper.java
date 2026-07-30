package com.crrepa.band.my.model.db.helper;

import com.crrepa.band.my.model.db.Sleep;
import com.crrepa.band.my.model.db.proxy.SleepDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;

/* loaded from: classes2.dex */
public class SleepSaveHelper {
    private SleepDaoProxy sleepDaoProxy = SleepDaoProxy.getInstance();

    private int getSleepTime(Sleep sleep) {
        if (sleep == null) {
            return 0;
        }
        return sleep.getDeep().intValue() + sleep.getShallow().intValue();
    }

    private void saveSleep(Sleep sleep, Sleep sleep2, boolean z7) {
        if (sleep2 == null) {
            this.sleepDaoProxy.insert(sleep);
        } else if (z7 || getSleepTime(sleep) > 0) {
            sleep.setId(sleep2.getId());
            sleep.setDate(sleep2.getDate());
            this.sleepDaoProxy.update(sleep);
        }
    }

    public void saveHistorySleep(int i8, Sleep sleep) {
        Date dateOfOffsetDay = m.getDateOfOffsetDay(sleep.getDate(), i8);
        sleep.setDate(dateOfOffsetDay);
        saveSleep(sleep, this.sleepDaoProxy.getSleep(dateOfOffsetDay), false);
    }

    public void saveTodaySleep(Sleep sleep) {
        saveSleep(sleep, this.sleepDaoProxy.getSleep(sleep.getDate()), true);
    }
}
