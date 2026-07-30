package com.crrepa.band.my.health.heartrate.presenter;

import com.crrepa.band.my.health.bloodoxygen.model.BandHeartRateResultEvent;
import com.crrepa.band.my.model.db.ActiveHeartRate;
import com.crrepa.band.my.model.db.proxy.ActiveHeartRateDaoProxy;
import com.moyoung.dafit.module.common.utils.s;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class b implements com.moyoung.dafit.module.common.baseui.f {
    private com.crrepa.band.my.health.widgets.a bandActiveHeartRateStatisticsView;

    public b() {
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    private void showAverageHeartRate(int i8) {
        this.bandActiveHeartRateStatisticsView.renderAverageHeartRate(i8);
    }

    private void showHeartRateAnalysis(int... iArr) {
        this.bandActiveHeartRateStatisticsView.renderHeartRateAnalysis(iArr);
    }

    private void showHeartRateList(List<Float> list, Date date) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.bandActiveHeartRateStatisticsView.renderHeartRateList(list, date);
    }

    private void showHeartRateMeasureTime(Date date) {
        this.bandActiveHeartRateStatisticsView.renderTrainingDate(date);
    }

    private void showHeartRateResult(ActiveHeartRate activeHeartRate) {
        int i8;
        List<Float> list;
        Date date;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Date date2 = new Date();
        if (activeHeartRate != null) {
            i9 = q2.a.getHeartRateAnalysisData(activeHeartRate.getAverage());
            list = s.json2List(activeHeartRate.getData(), Float[].class);
            date = activeHeartRate.getStartDate();
            i10 = q2.a.getHeartRateAnalysisData(activeHeartRate.getLightCount());
            i11 = q2.a.getHeartRateAnalysisData(activeHeartRate.getWightCount());
            i12 = q2.a.getHeartRateAnalysisData(activeHeartRate.getAnaerobicCount());
            i13 = q2.a.getHeartRateAnalysisData(activeHeartRate.getAerobicCount());
            i8 = q2.a.getHeartRateAnalysisData(activeHeartRate.getMaxCount());
        } else {
            i8 = 0;
            list = null;
            date = date2;
            i9 = 0;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        showAverageHeartRate(i9);
        showHeartRateList(list, date);
        showHeartRateMeasureTime(date);
        showHeartRateAnalysis(i10, i11, i12, i13, i8);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.bandActiveHeartRateStatisticsView = null;
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    public void getActiveHeartRateStatisticsData(long j8) {
        ActiveHeartRateDaoProxy activeHeartRateDaoProxy = new ActiveHeartRateDaoProxy();
        showHeartRateResult(j8 == -1 ? activeHeartRateDaoProxy.getLastTimeHeartRate() : activeHeartRateDaoProxy.getHeartRate(j8));
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onHeartRateResultEvent(BandHeartRateResultEvent bandHeartRateResultEvent) {
        showHeartRateResult(bandHeartRateResultEvent.getActiveHeartRate());
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(com.crrepa.band.my.health.widgets.a aVar) {
        this.bandActiveHeartRateStatisticsView = aVar;
    }
}
