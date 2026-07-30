package com.crrepa.band.my.ble.band.cmd.callback;

import com.crrepa.band.my.device.watchface.model.BandWatchFaceChangeEvent;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.db.WatchFace;
import com.crrepa.band.my.model.db.proxy.WatchFaceDaoProxy;
import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;
import com.crrepa.ble.conn.callback.CRPDeviceWatchFaceLayoutCallback;
import java.util.List;

/* loaded from: classes2.dex */
public class s implements CRPDeviceWatchFaceLayoutCallback {
    private WatchFace saveWatchFaceLayout(CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo, String str, int i8) {
        WatchFaceDaoProxy watchFaceDaoProxy = new WatchFaceDaoProxy();
        WatchFace watchFace = watchFaceDaoProxy.getWatchFace(str);
        WatchFace watchFace2 = w1.j.toWatchFace(cRPWatchFaceLayoutInfo);
        if (watchFace != null) {
            watchFace2.setId(watchFace.getId());
            Integer type = watchFace.getType();
            if (type == null) {
                watchFace2.setType(1);
            } else {
                watchFace2.setType(type);
            }
        }
        watchFace2.setBroadcastName(str);
        watchFace2.setIndex(Integer.valueOf(i8));
        watchFaceDaoProxy.insert(watchFace2);
        return watchFace2;
    }

    @Override // com.crrepa.ble.conn.callback.CRPDeviceWatchFaceLayoutCallback
    public void onWatchFaceLayoutChange(CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo) {
        List<Integer> watchFaceConfigList;
        com.orhanobut.logger.f.d("onWatchFaceLayoutChange: " + cRPWatchFaceLayoutInfo);
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand == null || (watchFaceConfigList = connectBand.getWatchFaceConfigList()) == null || watchFaceConfigList.size() <= 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= watchFaceConfigList.size()) {
                i8 = -1;
                break;
            } else if (watchFaceConfigList.get(i8).intValue() > 0) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 < 0) {
            return;
        }
        org.greenrobot.eventbus.c.getDefault().post(new BandWatchFaceChangeEvent(saveWatchFaceLayout(cRPWatchFaceLayoutInfo, connectBand.getBandName(), i8)));
    }
}
