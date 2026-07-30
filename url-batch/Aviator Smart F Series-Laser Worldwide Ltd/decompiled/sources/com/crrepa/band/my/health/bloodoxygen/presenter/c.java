package com.crrepa.band.my.health.bloodoxygen.presenter;

import com.crrepa.band.my.health.bloodoxygen.BaseBloodOxygenStatisticsFragment;
import com.crrepa.band.my.health.bloodoxygen.BloodOxygenDayStatisticsFragment;
import com.crrepa.band.my.health.bloodoxygen.BloodOxygenMonthStaisticsFragment;
import com.crrepa.band.my.health.bloodoxygen.BloodOxygenWeekStatisticsFragment;
import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes2.dex */
public class c implements com.moyoung.dafit.module.common.baseui.f {
    private h2.b view;

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public void getStatisticsFragment(Date date) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BloodOxygenDayStatisticsFragment.newInstance(date));
        arrayList.add(BaseBloodOxygenStatisticsFragment.getInstance(new BloodOxygenWeekStatisticsFragment(), date));
        arrayList.add(BaseBloodOxygenStatisticsFragment.getInstance(new BloodOxygenMonthStaisticsFragment(), date));
        this.view.renderStatisticsFragment(arrayList);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(h2.b bVar) {
        this.view = bVar;
    }
}
