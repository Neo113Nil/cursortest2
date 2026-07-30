package com.crrepa.band.my.health.steps.presenter;

import com.crrepa.band.my.health.widgets.j;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class b implements com.moyoung.dafit.module.common.baseui.f {
    protected int defaultSteps;
    private j stepsStatisticsView;

    public b(int i8) {
        this.defaultSteps = i8;
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.stepsStatisticsView = null;
    }

    public abstract void getStepsDetail(Date date);

    protected List<Float> getStepsList(float[] fArr) {
        ArrayList arrayList = new ArrayList();
        for (float f8 : fArr) {
            arrayList.add(Float.valueOf(f8 + this.defaultSteps));
        }
        return arrayList;
    }

    protected void hideStatisticsChart() {
        this.stepsStatisticsView.hideStatisticsChart();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(j jVar) {
        this.stepsStatisticsView = jVar;
    }

    protected void showDate(Date date) {
        this.stepsStatisticsView.renderDate(date);
    }

    protected void showStatisticsChart(List<Float> list, int i8) {
        this.stepsStatisticsView.renderStepsList(list, i8);
    }

    protected void showStepsChartMaxValue(float f8) {
        this.stepsStatisticsView.renderStepsChartMaxValue(f8);
    }

    protected void showTotalSteps(int i8) {
        this.stepsStatisticsView.renderTotalSteps(i8);
    }
}
