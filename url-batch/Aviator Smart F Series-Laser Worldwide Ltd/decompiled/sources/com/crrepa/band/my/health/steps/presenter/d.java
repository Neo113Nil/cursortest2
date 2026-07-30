package com.crrepa.band.my.health.steps.presenter;

import com.crrepa.band.my.model.db.Step;
import com.crrepa.band.my.model.db.proxy.StepsDaoProxy;
import com.moyoung.dafit.module.common.utils.s;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class d extends b {
    public d(int i8) {
        super(i8);
    }

    @Override // com.crrepa.band.my.health.steps.presenter.b
    public void getStepsDetail(Date date) {
        showDate(date);
        Step step = StepsDaoProxy.getInstance().getStep(date);
        if (step == null) {
            hideStatisticsChart();
            return;
        }
        showTotalSteps(step.getSteps().intValue());
        List<Float> json2List = s.json2List(step.getStepsCategory(), Float[].class);
        if (json2List == null || json2List.isEmpty()) {
            hideStatisticsChart();
            return;
        }
        float f8 = 200.0f;
        for (Float f9 : json2List) {
            if (f8 < f9.floatValue()) {
                f8 = f9.floatValue();
            }
        }
        int i8 = (int) (f8 / 10.0f);
        for (int i9 = 0; i9 < json2List.size(); i9++) {
            json2List.set(i9, Float.valueOf(json2List.get(i9).floatValue() + i8));
        }
        showStepsChartMaxValue(f8 + i8);
        showStatisticsChart(json2List, i8);
    }
}
