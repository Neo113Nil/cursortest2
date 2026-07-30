package com.crrepa.band.my.ble.band.cmd.listener;

import com.crrepa.band.my.health.bloodoxygen.model.BandBloodOxygenChangeEvent;
import com.crrepa.band.my.health.bloodoxygen.model.BandTimingBloodOxygenChangeEvent;
import com.crrepa.band.my.health.bloodoxygen.model.BandTimingBloodOxygenStateChangeEvent;
import com.crrepa.band.my.model.band.provider.BandTimingBloodOxygenProvider;
import com.crrepa.band.my.model.db.BloodOxygen;
import com.crrepa.band.my.model.db.TimingBloodOxygen;
import com.crrepa.band.my.model.db.helper.TimingBloodOxygenSaveHelper;
import com.crrepa.band.my.model.db.proxy.BloodOxygenDaoProxy;
import com.crrepa.ble.conn.bean.CRPBloodOxygenInfo;
import com.crrepa.ble.conn.bean.CRPHistoryBloodOxygenInfo;
import com.crrepa.ble.conn.listener.CRPBloodOxygenChangeListener;
import com.crrepa.ble.conn.type.CRPBloodOxygenTimeType;
import java.util.List;

/* loaded from: classes2.dex */
public class d implements CRPBloodOxygenChangeListener {
    @Override // com.crrepa.ble.conn.listener.CRPBloodOxygenChangeListener
    public void onBloodOxygen(int i8) {
        com.orhanobut.logger.f.d("onBloodOxygenChange: " + i8);
        BloodOxygen convert = k0.a.convert(i8);
        org.greenrobot.eventbus.c.getDefault().post(new BandBloodOxygenChangeEvent(convert));
        if (convert != null) {
            new BloodOxygenDaoProxy().insert(convert);
            com.crrepa.band.my.health.base.c.getInstance().uploadBandBloodOxygen(convert);
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPBloodOxygenChangeListener
    public void onContinueBloodOxygen(CRPBloodOxygenInfo cRPBloodOxygenInfo) {
        TimingBloodOxygen convertTimingBloodOxygen = k0.b.convertTimingBloodOxygen(cRPBloodOxygenInfo);
        if (convertTimingBloodOxygen == null) {
            return;
        }
        new TimingBloodOxygenSaveHelper().saveBloodOxygen(convertTimingBloodOxygen);
        if (cRPBloodOxygenInfo.getType() == CRPBloodOxygenTimeType.TODAY) {
            org.greenrobot.eventbus.c.getDefault().post(new BandTimingBloodOxygenChangeEvent(convertTimingBloodOxygen));
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPBloodOxygenChangeListener
    public void onContinueState(boolean z7) {
    }

    @Override // com.crrepa.ble.conn.listener.CRPBloodOxygenChangeListener
    public void onHistoryBloodOxygen(List<CRPHistoryBloodOxygenInfo> list) {
        new BloodOxygenDaoProxy().saveHistoryList(list);
        org.greenrobot.eventbus.c.getDefault().post(new BandBloodOxygenChangeEvent());
    }

    @Override // com.crrepa.ble.conn.listener.CRPBloodOxygenChangeListener
    public void onTimingMeasure(int i8) {
        com.orhanobut.logger.f.d("onTimingMeasure: " + i8);
        BandTimingBloodOxygenProvider.saveTimingBloodOxygenInterval(i8);
        BandTimingBloodOxygenProvider.saveSupportTimingBloodOxygen(true);
        boolean z7 = i8 > 0;
        BandTimingBloodOxygenProvider.saveTimingBloodOxygenEnable(z7);
        org.greenrobot.eventbus.c.getDefault().post(new BandTimingBloodOxygenStateChangeEvent(z7));
        if (z7) {
            com.crrepa.band.my.ble.band.cmd.d dVar = com.crrepa.band.my.ble.band.cmd.d.getInstance();
            dVar.syncTodayBloodOxyge();
            dVar.syncYesterdayBloodOxyge();
        }
    }
}
