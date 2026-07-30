package com.crrepa.band.my.device.ecard;

import com.crrepa.band.my.device.ecard.model.BandECardCountEvent;
import com.crrepa.band.my.model.db.ECardConfig;
import com.crrepa.band.my.model.db.proxy.ECardConfigDaoProxy;
import com.crrepa.band.my.model.db.proxy.ECardDaoProxy;
import com.crrepa.ble.conn.bean.CRPElectronicCardCountInfo;
import com.crrepa.ble.conn.callback.CRPElectronicCardCountCallback;
import com.moyoung.dafit.module.common.utils.s;
import java.util.List;

/* loaded from: classes2.dex */
public class a implements CRPElectronicCardCountCallback {
    @Override // com.crrepa.ble.conn.callback.CRPElectronicCardCountCallback
    public void onElectronicCardCount(CRPElectronicCardCountInfo cRPElectronicCardCountInfo) {
        int count = cRPElectronicCardCountInfo.getCount();
        if (count <= 0) {
            return;
        }
        ECardConfig eCardConfig = new ECardConfig();
        eCardConfig.setName(com.crrepa.band.my.ble.band.utils.a.getInstance().getName());
        eCardConfig.setCount(Integer.valueOf(count));
        eCardConfig.setUrlLimit(Integer.valueOf(cRPElectronicCardCountInfo.getUrlBytesLimit()));
        List<Integer> savedIdList = cRPElectronicCardCountInfo.getSavedIdList();
        if (savedIdList == null || savedIdList.isEmpty()) {
            eCardConfig.setSavedIdList("");
            new ECardDaoProxy().deleteAll();
        } else {
            eCardConfig.setSavedIdList(s.bean2Json(savedIdList));
        }
        com.orhanobut.logger.f.d("savedIdList: " + eCardConfig.getSavedIdList());
        eCardConfig.setId(0L);
        new ECardConfigDaoProxy().insert(eCardConfig);
        org.greenrobot.eventbus.c.getDefault().post(new BandECardCountEvent(savedIdList));
    }
}
