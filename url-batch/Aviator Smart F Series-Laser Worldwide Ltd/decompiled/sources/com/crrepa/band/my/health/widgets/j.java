package com.crrepa.band.my.health.widgets;

import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public interface j {
    void hideStatisticsChart();

    void renderDate(Date date);

    void renderStepsChartMaxValue(float f8);

    void renderStepsList(List<Float> list, int i8);

    void renderTotalSteps(int i8);
}
