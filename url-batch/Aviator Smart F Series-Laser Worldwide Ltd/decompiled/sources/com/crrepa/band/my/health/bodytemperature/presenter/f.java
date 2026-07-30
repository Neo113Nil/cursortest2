package com.crrepa.band.my.health.bodytemperature.presenter;

import com.crrepa.band.my.health.widgets.m;
import com.crrepa.band.my.model.db.TimingTemp;
import com.crrepa.band.my.model.db.proxy.TimingTempDaoProxy;
import com.moyoung.dafit.module.common.utils.s;
import java.util.Date;

/* loaded from: classes2.dex */
public class f implements com.moyoung.dafit.module.common.baseui.f {
    private m view;

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public void getDayStatisticsData(Date date) {
        this.view.renderStatisticsDate(date);
        TimingTemp timingTemp = new TimingTempDaoProxy().get(date);
        if (timingTemp == null) {
            return;
        }
        this.view.renderAverageTemp(timingTemp.getAverage().floatValue());
        this.view.renderTempList(s.json2List(timingTemp.getTempStr(), Float[].class), date);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(m mVar) {
        this.view = mVar;
    }
}
