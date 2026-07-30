package com.crrepa.band.my.health.heartrate.presenter;

import com.crrepa.band.my.health.heartrate.BaseHeartRateStatisticsFragment;
import com.crrepa.band.my.health.heartrate.HeartRateDayStatisticsFragment;
import com.crrepa.band.my.health.heartrate.HeartRateMonthStaisticsFragment;
import com.crrepa.band.my.health.heartrate.HeartRateWeekStatisticsFragment;
import com.crrepa.band.my.model.db.HeartRate;
import com.crrepa.band.my.model.db.proxy.HeartRateDaoProxy;
import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes2.dex */
public class a implements com.moyoung.dafit.module.common.baseui.f {
    private r2.a view;

    private void showRunHeartRateAnalysis(int... iArr) {
        this.view.renderHeartRateAnalysis(iArr);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public void getHrStatisticsData(Date date) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        HeartRate heartRate = new HeartRateDaoProxy().getHeartRate(date);
        if (heartRate != null) {
            i8 = q2.a.getHeartRateAnalysisData(heartRate.getLightCount());
            i10 = q2.a.getHeartRateAnalysisData(heartRate.getWightCount());
            i11 = q2.a.getHeartRateAnalysisData(heartRate.getAnaerobicCount());
            i12 = q2.a.getHeartRateAnalysisData(heartRate.getAerobicCount());
            i9 = q2.a.getHeartRateAnalysisData(heartRate.getMaxCount());
        } else {
            i8 = 0;
            i9 = 0;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        }
        showRunHeartRateAnalysis(i8, i10, i11, i12, i9);
    }

    public void getHrStatisticsFragment(Date date) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(HeartRateDayStatisticsFragment.newInstance(date));
        arrayList.add(BaseHeartRateStatisticsFragment.getInstance(new HeartRateWeekStatisticsFragment(), date));
        arrayList.add(BaseHeartRateStatisticsFragment.getInstance(new HeartRateMonthStaisticsFragment(), date));
        this.view.renderHrStatisticsFragment(arrayList);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(r2.a aVar) {
        this.view = aVar;
    }
}
