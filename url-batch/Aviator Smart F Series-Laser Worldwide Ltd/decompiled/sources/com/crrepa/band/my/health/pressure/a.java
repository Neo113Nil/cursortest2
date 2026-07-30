package com.crrepa.band.my.health.pressure;

import com.crrepa.band.my.ble.band.cmd.d;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.health.pressure.model.BandStressChangeEvent;
import com.crrepa.band.my.health.pressure.model.BandStressSupportStateEvent;
import com.crrepa.band.my.health.pressure.model.BandTimingStressChangeEvent;
import com.crrepa.band.my.model.band.provider.BandStressProvider;
import com.crrepa.band.my.model.db.Stress;
import com.crrepa.band.my.model.db.TimingStress;
import com.crrepa.band.my.model.db.proxy.StressDaoProxy;
import com.crrepa.band.my.model.db.proxy.TimingStressDaoProxy;
import com.crrepa.ble.conn.bean.CRPHistoryStressInfo;
import com.crrepa.ble.conn.bean.CRPTimingStressInfo;
import com.crrepa.ble.conn.listener.CRPStressListener;
import com.crrepa.ble.conn.type.CRPStressDate;
import com.orhanobut.logger.f;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class a implements CRPStressListener {
    private static final int MAX_STRESS = 100;
    private static final int MIN_STRESS = 0;
    private TimingStressDaoProxy timingStressDaoProxy = new TimingStressDaoProxy();

    @Override // com.crrepa.ble.conn.listener.CRPStressListener
    public void onHistoryStressChange(List<CRPHistoryStressInfo> list) {
        new StressDaoProxy().saveHistoryList(list);
        org.greenrobot.eventbus.c.getDefault().post(new BandStressChangeEvent());
    }

    @Override // com.crrepa.ble.conn.listener.CRPStressListener
    public void onStressChange(int i8) {
        BandStressChangeEvent bandStressChangeEvent = new BandStressChangeEvent();
        if (i8 > 0 && i8 < 100) {
            Stress stress = new Stress();
            stress.setDate(new Date());
            stress.setStress(Integer.valueOf(i8));
            new StressDaoProxy().insert(stress);
            bandStressChangeEvent.setStress(stress);
        }
        org.greenrobot.eventbus.c.getDefault().post(bandStressChangeEvent);
    }

    @Override // com.crrepa.ble.conn.listener.CRPStressListener
    public void onSupportStress(boolean z7) {
        BandStressProvider.saveSupportStress(z7);
        org.greenrobot.eventbus.c.getDefault().post(new BandStressSupportStateEvent(z7));
        if (z7) {
            d.getInstance().queryHistoryStress();
            i4.getInstance().queryTimingStressState();
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPStressListener
    public void onTimingStressChange(CRPTimingStressInfo cRPTimingStressInfo) {
        f.d("onTimingStressChange: " + cRPTimingStressInfo);
        if (cRPTimingStressInfo == null || cRPTimingStressInfo.getList() == null || cRPTimingStressInfo.getList().isEmpty()) {
            return;
        }
        List<Integer> list = cRPTimingStressInfo.getList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            int intValue = list.get(i8).intValue();
            if (intValue < 0 || 100 < intValue) {
                list.set(i8, 0);
            }
        }
        TimingStress insert = this.timingStressDaoProxy.insert(cRPTimingStressInfo);
        if (cRPTimingStressInfo.getDate() == CRPStressDate.TODAY) {
            org.greenrobot.eventbus.c.getDefault().post(new BandTimingStressChangeEvent(insert));
            d.getInstance().queryTimingStress(CRPStressDate.YESTERDAY);
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPStressListener
    public void onTimingStressStateChange(boolean z7) {
        f.d("onTimingStressStateChange: " + z7);
        BandStressProvider.saveTimingStressState(z7);
        d.getInstance().queryTimingStress(CRPStressDate.TODAY);
    }
}
