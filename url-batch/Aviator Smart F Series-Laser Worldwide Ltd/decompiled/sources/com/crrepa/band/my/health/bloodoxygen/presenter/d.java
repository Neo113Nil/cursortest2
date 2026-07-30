package com.crrepa.band.my.health.bloodoxygen.presenter;

import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes2.dex */
public abstract class d implements com.moyoung.dafit.module.common.baseui.f {
    private com.crrepa.band.my.health.widgets.c view;

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public abstract void getStatisticsData(Date date);

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(com.crrepa.band.my.health.widgets.c cVar) {
        this.view = cVar;
    }

    protected void showAverageBloodOxygen(int i8) {
        this.view.renderAverageBloodOxygen(i8);
    }

    protected void showDate(Date date) {
        this.view.renderDate(date);
    }

    protected void showStatisticsChart(float[] fArr) {
        ArrayList arrayList = new ArrayList();
        for (float f8 : fArr) {
            arrayList.add(Float.valueOf(f8));
        }
        this.view.renderAverageBloodOxygenChart(arrayList);
    }
}
