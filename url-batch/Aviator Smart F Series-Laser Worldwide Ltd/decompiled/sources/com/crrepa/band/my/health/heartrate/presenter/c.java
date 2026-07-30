package com.crrepa.band.my.health.heartrate.presenter;

import com.crrepa.band.my.health.heartrate.model.BandOnceHeartRateChangeEvent;
import com.crrepa.band.my.model.db.OnceHeartRate;
import com.crrepa.band.my.model.db.proxy.OnceHeartRateDaoProxy;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class c implements com.moyoung.dafit.module.common.baseui.f {
    private r2.b view;

    public c() {
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    private void showLast7TimesOnceHeartRate(Date date) {
        List<OnceHeartRate> historyList = new OnceHeartRateDaoProxy().getHistoryList(date, 7);
        float[] fArr = new float[7];
        Date[] dateArr = new Date[7];
        for (int i8 = 0; i8 < historyList.size(); i8++) {
            int i9 = 6 - i8;
            OnceHeartRate onceHeartRate = historyList.get(i8);
            fArr[i9] = onceHeartRate.getHeartRate().intValue();
            dateArr[i9] = onceHeartRate.getDate();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 7; i10++) {
            arrayList.add(Float.valueOf(fArr[i10]));
        }
        this.view.renderLast7TimesOnceHeartRate(arrayList, dateArr);
    }

    private void showOnceHeartRate(OnceHeartRate onceHeartRate) {
        this.view.renderOnceHeartRate(onceHeartRate);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    public void getOnceHeartRateData(long j8) {
        OnceHeartRateDaoProxy onceHeartRateDaoProxy = new OnceHeartRateDaoProxy();
        OnceHeartRate lastOnceHeartRate = j8 == -1 ? onceHeartRateDaoProxy.getLastOnceHeartRate() : onceHeartRateDaoProxy.get(j8);
        showOnceHeartRate(lastOnceHeartRate);
        if (lastOnceHeartRate == null) {
            return;
        }
        showLast7TimesOnceHeartRate(lastOnceHeartRate.getDate());
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandOnceHeartRateChanged(BandOnceHeartRateChangeEvent bandOnceHeartRateChangeEvent) {
        this.view.measureComplete();
        OnceHeartRate onceHeartRate = bandOnceHeartRateChangeEvent.getOnceHeartRate();
        if (onceHeartRate != null) {
            showOnceHeartRate(onceHeartRate);
            showLast7TimesOnceHeartRate(onceHeartRate.getDate());
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(r2.b bVar) {
        this.view = bVar;
    }
}
