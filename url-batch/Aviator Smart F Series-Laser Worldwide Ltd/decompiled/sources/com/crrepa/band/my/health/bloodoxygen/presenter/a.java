package com.crrepa.band.my.health.bloodoxygen.presenter;

import com.crrepa.band.my.health.bloodoxygen.model.BandBloodOxygenChangeEvent;
import com.crrepa.band.my.model.db.BloodOxygen;
import com.crrepa.band.my.model.db.proxy.BloodOxygenDaoProxy;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class a implements com.moyoung.dafit.module.common.baseui.f {
    private com.crrepa.band.my.health.widgets.b view;

    public a() {
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    private void showBloodOxygenDetail(BloodOxygen bloodOxygen) {
        if (bloodOxygen != null) {
            this.view.renderBo(bloodOxygen.getBloodOxygen().intValue());
            this.view.renderDate(bloodOxygen.getDate());
            showLast7TimesBloodOxygen(bloodOxygen.getDate());
        }
    }

    private void showLast7TimesBloodOxygen(Date date) {
        List<BloodOxygen> lastTimesBloodOxygen = new BloodOxygenDaoProxy().getLastTimesBloodOxygen(date, 7);
        if (lastTimesBloodOxygen == null || lastTimesBloodOxygen.isEmpty()) {
            return;
        }
        float[] fArr = new float[7];
        Date[] dateArr = new Date[7];
        for (int i8 = 0; i8 < lastTimesBloodOxygen.size(); i8++) {
            int i9 = 6 - i8;
            BloodOxygen bloodOxygen = lastTimesBloodOxygen.get(i8);
            fArr[i9] = bloodOxygen.getBloodOxygen().intValue();
            dateArr[i9] = bloodOxygen.getDate();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 7; i10++) {
            arrayList.add(Float.valueOf(fArr[i10]));
        }
        this.view.renderLast7TimesBloodOxygen(arrayList, dateArr);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    public void getBloodOxygenStatisticsData(long j8) {
        BloodOxygenDaoProxy bloodOxygenDaoProxy = new BloodOxygenDaoProxy();
        showBloodOxygenDetail(j8 == -1 ? bloodOxygenDaoProxy.getLastTimeBloodOxygen() : bloodOxygenDaoProxy.getBloodPressure(j8));
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBloodOxygenChangeEvent(BandBloodOxygenChangeEvent bandBloodOxygenChangeEvent) {
        this.view.measureComplete();
        showBloodOxygenDetail(bandBloodOxygenChangeEvent.getBloodOxygen());
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(com.crrepa.band.my.health.widgets.b bVar) {
        this.view = bVar;
    }
}
