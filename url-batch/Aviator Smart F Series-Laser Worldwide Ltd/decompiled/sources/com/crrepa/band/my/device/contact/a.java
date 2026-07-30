package com.crrepa.band.my.device.contact;

import com.crrepa.band.my.device.contact.model.BandQuickContartChangeEvent;
import com.crrepa.band.my.model.db.QuickContartConfig;
import com.crrepa.band.my.model.db.proxy.QuickContartConfigDaoProxy;
import com.crrepa.ble.conn.bean.CRPContactConfigInfo;
import com.crrepa.ble.conn.callback.CRPContactConfigCallback;

/* loaded from: classes2.dex */
public class a implements CRPContactConfigCallback {
    @Override // com.crrepa.ble.conn.callback.CRPContactConfigCallback
    public void onContactConfig(CRPContactConfigInfo cRPContactConfigInfo) {
        com.orhanobut.logger.f.d("onContactConfig: " + cRPContactConfigInfo);
        String name = com.crrepa.band.my.ble.band.utils.a.getInstance().getName();
        QuickContartConfig quickContartConfig = new QuickContartConfig();
        quickContartConfig.setName(name);
        boolean isSupported = cRPContactConfigInfo.isSupported();
        quickContartConfig.setSupported(Boolean.valueOf(isSupported));
        quickContartConfig.setCount(Integer.valueOf(cRPContactConfigInfo.getCount()));
        quickContartConfig.setWidth(Integer.valueOf(cRPContactConfigInfo.getWidth()));
        quickContartConfig.setHeight(Integer.valueOf(cRPContactConfigInfo.getHeight()));
        quickContartConfig.setMaxNameLength(Integer.valueOf(cRPContactConfigInfo.getNameLength()));
        new QuickContartConfigDaoProxy().insert(quickContartConfig);
        org.greenrobot.eventbus.c.getDefault().post(new BandQuickContartChangeEvent(isSupported));
    }
}
