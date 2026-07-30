package com.crrepa.band.my.health.bloodpressure;

import com.crrepa.band.my.health.bloodpressure.model.BandBloodPressureChangeEvent;
import com.crrepa.band.my.model.db.BloodPressure;
import com.crrepa.band.my.model.db.proxy.BloodPressureDaoProxy;
import com.crrepa.ble.conn.bean.CRPBloodPressureInfo;
import com.crrepa.ble.conn.bean.CRPHistoryBloodPressureInfo;
import com.crrepa.ble.conn.listener.CRPBloodPressureChangeListener;
import com.orhanobut.logger.f;
import java.util.List;
import org.greenrobot.eventbus.c;

/* loaded from: classes2.dex */
public class a implements CRPBloodPressureChangeListener {
    @Override // com.crrepa.ble.conn.listener.CRPBloodPressureChangeListener
    public void onBloodPressureChange(int i8, int i9) {
        f.d("BloodPressure: " + i8 + "---" + i9);
        BloodPressure convert = j2.a.convert(i9, i8);
        c.getDefault().post(new BandBloodPressureChangeEvent(convert));
        if (convert != null) {
            new BloodPressureDaoProxy().insert(convert);
            com.crrepa.band.my.health.base.c.getInstance().uploadBandBloodPressure(convert);
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPBloodPressureChangeListener
    public void onContinueBloodPressure(CRPBloodPressureInfo cRPBloodPressureInfo) {
    }

    @Override // com.crrepa.ble.conn.listener.CRPBloodPressureChangeListener
    public void onContinueState(boolean z7) {
    }

    @Override // com.crrepa.ble.conn.listener.CRPBloodPressureChangeListener
    public void onHistoryBloodPressure(List<CRPHistoryBloodPressureInfo> list) {
        new BloodPressureDaoProxy().saveHistoryList(list);
        c.getDefault().post(new BandBloodPressureChangeEvent());
    }
}
