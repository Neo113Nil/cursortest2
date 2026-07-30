package com.crrepa.band.my.health.steps.presenter;

import com.crrepa.band.my.model.db.Step;
import com.crrepa.band.my.model.db.proxy.StepsDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class e extends b {
    public e(int i8) {
        super(i8);
    }

    private int getIndex(Date date) {
        return m.getDayOfMonth(date) - 1;
    }

    @Override // com.crrepa.band.my.health.steps.presenter.b
    public void getStepsDetail(Date date) {
        showDate(date);
        int monthCountDay = m.getMonthCountDay(date);
        float[] fArr = new float[monthCountDay];
        List<Step> monthStepList = StepsDaoProxy.getInstance().getMonthStepList(date);
        if (monthStepList != null) {
            Iterator<Step> it = monthStepList.iterator();
            while (it.hasNext()) {
                int index = getIndex(it.next().getDate());
                if (monthCountDay <= index) {
                    break;
                } else {
                    fArr[index] = r3.getSteps().intValue();
                }
            }
        }
        showStatisticsChart(getStepsList(fArr), this.defaultSteps);
        showTotalSteps((int) fArr[getIndex(date)]);
    }
}
