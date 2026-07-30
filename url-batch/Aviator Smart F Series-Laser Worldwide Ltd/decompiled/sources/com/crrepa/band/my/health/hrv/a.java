package com.crrepa.band.my.health.hrv;

import com.crrepa.band.my.ble.band.cmd.d;
import com.crrepa.band.my.health.hrv.model.BandHrvChangeEvent;
import com.crrepa.band.my.health.hrv.model.BandHrvSupportStateEvent;
import com.crrepa.band.my.model.band.provider.BandHrvProvider;
import com.crrepa.band.my.model.db.Hrv;
import com.crrepa.band.my.model.db.proxy.HrvDaoProxy;
import com.crrepa.ble.conn.bean.CRPHistoryHrvInfo;
import com.crrepa.ble.conn.listener.CRPNewHrvChangeListener;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.c;

/* loaded from: classes2.dex */
public class a implements CRPNewHrvChangeListener {
    private static final int MAX_HRV = 250;
    private static final int MIN_HRV = 0;

    @Override // com.crrepa.ble.conn.listener.CRPNewHrvChangeListener
    public void onHistoryHrv(List<CRPHistoryHrvInfo> list) {
        new HrvDaoProxy().saveHistoryList(list);
        c.getDefault().post(new BandHrvChangeEvent());
    }

    @Override // com.crrepa.ble.conn.listener.CRPNewHrvChangeListener
    public void onHrv(int i8) {
        BandHrvChangeEvent bandHrvChangeEvent = new BandHrvChangeEvent();
        if (i8 > 0 && i8 < 250) {
            Hrv hrv = new Hrv();
            hrv.setDate(new Date());
            hrv.setHrv(Integer.valueOf(i8));
            new HrvDaoProxy().insert(hrv);
            bandHrvChangeEvent.setHrv(hrv);
        }
        c.getDefault().post(bandHrvChangeEvent);
    }

    @Override // com.crrepa.ble.conn.listener.CRPNewHrvChangeListener
    public void onSupportHrv(boolean z7) {
        BandHrvProvider.saveSupportHrv(z7);
        c.getDefault().post(new BandHrvSupportStateEvent(z7));
        if (z7) {
            d.getInstance().queryHistoryHrv();
        }
    }
}
