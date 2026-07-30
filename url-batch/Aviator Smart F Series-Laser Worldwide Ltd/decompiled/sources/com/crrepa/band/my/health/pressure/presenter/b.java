package com.crrepa.band.my.health.pressure.presenter;

import com.crrepa.band.my.health.widgets.l;
import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes2.dex */
public abstract class b implements com.moyoung.dafit.module.common.baseui.f {
    private l view;

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

    public void setView(l lVar) {
        this.view = lVar;
    }

    protected void showAverageStress(int i8) {
        this.view.renderAverageStress(i8);
    }

    protected void showDate(Date date) {
        this.view.renderDate(date);
    }

    protected void showStatisticsChart(float[] fArr) {
        ArrayList arrayList = new ArrayList();
        for (float f8 : fArr) {
            arrayList.add(Float.valueOf(f8));
        }
        this.view.renderAverageStressChart(arrayList);
    }
}
