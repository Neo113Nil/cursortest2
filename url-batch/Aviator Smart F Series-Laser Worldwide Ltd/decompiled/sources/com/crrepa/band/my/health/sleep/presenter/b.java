package com.crrepa.band.my.health.sleep.presenter;

import com.crrepa.band.my.health.widgets.i;
import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes2.dex */
public abstract class b implements com.moyoung.dafit.module.common.baseui.f {
    private i view;

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public abstract void getSleepStatisticsData(Date date);

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(i iVar) {
        this.view = iVar;
    }

    protected void showDate(Date date) {
        this.view.renderDate(date);
    }

    protected void showSleepTime(int i8) {
        this.view.renderSleepTime(i8);
    }

    protected void showSleepTimeChart(float[] fArr, float[] fArr2, float[] fArr3) {
        ArrayList arrayList = new ArrayList();
        for (float f8 : fArr) {
            arrayList.add(Float.valueOf(f8));
        }
        ArrayList arrayList2 = new ArrayList();
        for (float f9 : fArr2) {
            arrayList2.add(Float.valueOf(f9));
        }
        ArrayList arrayList3 = new ArrayList();
        for (float f10 : fArr3) {
            arrayList3.add(Float.valueOf(f10));
        }
        this.view.renderSleepTimeChart(arrayList, arrayList2, arrayList3);
    }
}
