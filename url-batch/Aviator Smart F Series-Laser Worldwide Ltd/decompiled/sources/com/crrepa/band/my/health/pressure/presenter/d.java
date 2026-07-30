package com.crrepa.band.my.health.pressure.presenter;

import com.crrepa.band.my.health.widgets.k;
import com.crrepa.band.my.model.db.TimingStress;
import com.crrepa.band.my.model.db.proxy.TimingStressDaoProxy;
import com.moyoung.dafit.module.common.utils.s;
import java.util.Date;

/* loaded from: classes2.dex */
public class d implements com.moyoung.dafit.module.common.baseui.f {
    private k view;

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public void getStatisticsData(Date date) {
        this.view.renderStatisticsDate(date);
        TimingStress timingStress = new TimingStressDaoProxy().get(date);
        if (timingStress == null) {
            return;
        }
        this.view.renderAverageStress(timingStress.getAverage().intValue());
        this.view.renderStressList(s.json2List(timingStress.getStress(), Float[].class), date);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(k kVar) {
        this.view = kVar;
    }
}
