package com.crrepa.band.my.model.db.helper;

import com.crrepa.band.my.model.db.TimingBloodOxygen;
import com.crrepa.band.my.model.db.proxy.TimingBloodOxygenDaoProxy;

/* loaded from: classes2.dex */
public class TimingBloodOxygenSaveHelper {
    private TimingBloodOxygenDaoProxy daoProxy = new TimingBloodOxygenDaoProxy();

    public void saveBloodOxygen(TimingBloodOxygen timingBloodOxygen) {
        TimingBloodOxygen timingBloodOxygen2 = this.daoProxy.get(timingBloodOxygen.getDate());
        if (timingBloodOxygen2 == null) {
            this.daoProxy.insert(timingBloodOxygen);
        } else {
            timingBloodOxygen.setId(timingBloodOxygen2.getId());
            this.daoProxy.update(timingBloodOxygen);
        }
    }
}
