package com.crrepa.band.my.health.bodytemperature.presenter;

import com.crrepa.band.my.health.bodytemperature.model.BandOnceTempChangeEvent;
import com.crrepa.band.my.model.db.OnceTemp;
import com.crrepa.band.my.model.db.proxy.OnceTempDaoProxy;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class a implements com.moyoung.dafit.module.common.baseui.f {
    OnceTempDaoProxy onceTempDaoProxy = new OnceTempDaoProxy();
    private m2.a view;

    public a() {
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    private void showLast7TimesOnceTemp(Date date) {
        List<OnceTemp> history = this.onceTempDaoProxy.getHistory(date, 7);
        float[] fArr = new float[7];
        Date[] dateArr = new Date[7];
        for (int i8 = 0; i8 < history.size(); i8++) {
            int i9 = 6 - i8;
            OnceTemp onceTemp = history.get(i8);
            fArr[i9] = onceTemp.getTemp().floatValue();
            dateArr[i9] = onceTemp.getDate();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 7; i10++) {
            arrayList.add(Float.valueOf(fArr[i10]));
        }
        this.view.renderLast7TimesOnceTemp(arrayList, dateArr);
    }

    private void showOnceTemp(OnceTemp onceTemp) {
        this.view.renderOnceTemp(onceTemp);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    public void getOnceTemp(long j8) {
        OnceTemp lastOnceTemp = j8 == -1 ? this.onceTempDaoProxy.getLastOnceTemp() : this.onceTempDaoProxy.get(j8);
        showOnceTemp(lastOnceTemp);
        if (lastOnceTemp == null) {
            return;
        }
        showLast7TimesOnceTemp(lastOnceTemp.getDate());
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandOnceTempChangeEvent(BandOnceTempChangeEvent bandOnceTempChangeEvent) {
        this.view.measureComplete();
        OnceTemp onceTemp = bandOnceTempChangeEvent.getOnceTemp();
        if (onceTemp.getTemp() != null) {
            showOnceTemp(onceTemp);
            showLast7TimesOnceTemp(onceTemp.getDate());
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(m2.a aVar) {
        this.view = aVar;
    }

    public void startMeasureTemp() {
        com.crrepa.band.my.ble.band.cmd.d.getInstance().startMeasureTemp();
    }
}
