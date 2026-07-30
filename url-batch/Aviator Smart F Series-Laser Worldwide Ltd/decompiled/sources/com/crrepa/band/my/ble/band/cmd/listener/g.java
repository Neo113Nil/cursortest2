package com.crrepa.band.my.ble.band.cmd.listener;

import com.crrepa.band.my.device.customkey.model.BandCustomKeyFeatureSupportChangeEvent;
import com.crrepa.band.my.device.customkey.model.BandCustomKeySendResultChangeEvent;
import com.crrepa.ble.conn.bean.CRPCustomKeyInfo;
import com.crrepa.ble.conn.listener.CRPCustomKeyChangeListener;
import com.crrepa.ble.conn.type.CRPCustomKeyGameType;
import com.crrepa.ble.conn.type.CRPCustomKeyType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class g implements CRPCustomKeyChangeListener {
    @Override // com.crrepa.ble.conn.listener.CRPCustomKeyChangeListener
    public void onSendResult(boolean z7) {
        com.orhanobut.logger.f.d("onSendResult: " + z7);
        org.greenrobot.eventbus.c.getDefault().post(new BandCustomKeySendResultChangeEvent(z7));
    }

    @Override // com.crrepa.ble.conn.listener.CRPCustomKeyChangeListener
    public void onSupportFeatureList(CRPCustomKeyInfo cRPCustomKeyInfo, List<CRPCustomKeyType> list) {
        com.orhanobut.logger.f.d("onSupportFeatureList info: " + cRPCustomKeyInfo.toString());
        com.orhanobut.logger.f.d("onSupportFeatureList list: " + list.toString());
        com.crrepa.band.my.device.customkey.util.b.saveCustomKeyFeatureList(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cRPCustomKeyInfo);
        com.crrepa.band.my.device.customkey.util.b.saveCustomKeyFeature(arrayList);
        org.greenrobot.eventbus.c.getDefault().post(new BandCustomKeyFeatureSupportChangeEvent());
    }

    @Override // com.crrepa.ble.conn.listener.CRPCustomKeyChangeListener
    public void onSupportGameList(List<CRPCustomKeyGameType> list) {
        com.orhanobut.logger.f.d("onSupportGameList: " + list.toString());
        com.crrepa.band.my.device.customkey.util.b.saveCustomKeyGameList(list);
    }

    @Override // com.crrepa.ble.conn.listener.CRPCustomKeyChangeListener
    public void onSupportTrainingList(List<Integer> list) {
        com.orhanobut.logger.f.d("onSupportTrainingList: " + list.toString());
        com.crrepa.band.my.device.customkey.util.b.saveCustomKeyTrainingList(list);
    }
}
