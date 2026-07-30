package com.crrepa.band.my.health.steps.presenter;

import com.crrepa.band.my.model.db.Step;
import com.crrepa.band.my.model.db.proxy.StepsDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class f extends b {
    public f(int i8) {
        super(i8);
    }

    private int getIndex(Date date) {
        return m.getDayOfWeek(date) - 1;
    }

    @Override // com.crrepa.band.my.health.steps.presenter.b
    public void getStepsDetail(Date date) {
        showDate(date);
        float[] fArr = new float[7];
        List<Step> weekStepList = StepsDaoProxy.getInstance().getWeekStepList(date);
        if (weekStepList != null) {
            Iterator<Step> it = weekStepList.iterator();
            while (it.hasNext()) {
                int index = getIndex(it.next().getDate());
                if (7 <= index) {
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
