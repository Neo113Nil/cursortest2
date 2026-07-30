package com.crrepa.band.my.health.bloodoxygen.presenter;

import com.crrepa.band.my.model.db.TimingBloodOxygen;
import com.crrepa.band.my.model.db.proxy.TimingBloodOxygenDaoProxy;
import com.moyoung.dafit.module.common.utils.s;
import java.util.Date;

/* loaded from: classes2.dex */
public class f implements com.moyoung.dafit.module.common.baseui.f {
    private h2.c view;

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public void getStatisticsData(Date date) {
        this.view.renderStatisticsDate(date);
        TimingBloodOxygen timingBloodOxygen = new TimingBloodOxygenDaoProxy().get(date);
        if (timingBloodOxygen == null) {
            return;
        }
        this.view.renderAverageBloodOxygen(timingBloodOxygen.getAverage());
        this.view.renderBloodOxygenList(s.json2List(timingBloodOxygen.getBloodOxygen(), Float[].class), date);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(h2.c cVar) {
        this.view = cVar;
    }
}
