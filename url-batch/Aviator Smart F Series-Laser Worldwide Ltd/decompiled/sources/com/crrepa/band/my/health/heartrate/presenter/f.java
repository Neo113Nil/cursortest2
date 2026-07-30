package com.crrepa.band.my.health.heartrate.presenter;

import com.crrepa.band.my.model.db.HeartRate;
import com.crrepa.band.my.model.db.proxy.HeartRateDaoProxy;
import com.moyoung.dafit.module.common.utils.s;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class f implements com.moyoung.dafit.module.common.baseui.f {
    private com.crrepa.band.my.health.widgets.e view;

    private void showAverageHr(int i8) {
        this.view.renderAverageHr(i8);
    }

    private void showHeartRateList(List<Float> list, Date date) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.view.renderHeartRtaeList(list, date);
    }

    private void showStatisticsDate(Date date) {
        this.view.renderStatisticsDate(date);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public void getHeartRateStatisticsData(Date date) {
        showStatisticsDate(date);
        HeartRate heartRate = new HeartRateDaoProxy().getHeartRate(date);
        if (heartRate == null) {
            return;
        }
        showAverageHr(heartRate.getAverage().intValue());
        showHeartRateList(s.json2List(heartRate.getHeartRate(), Float[].class), date);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(com.crrepa.band.my.health.widgets.e eVar) {
        this.view = eVar;
    }
}
