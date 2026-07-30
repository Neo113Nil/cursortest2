package com.crrepa.band.my.ble.band.cmd.callback;

import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.setting.other.model.BandLanguageChangeEvent;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.provider.BandDisplayLanguageProvider;
import com.crrepa.band.my.model.db.BandLanguage;
import com.crrepa.band.my.model.db.proxy.BandLanguageDaoProxy;
import com.crrepa.ble.conn.callback.CRPDeviceLanguageCallback;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class i implements CRPDeviceLanguageCallback {
    private boolean queryLanguage = false;

    private void saveBandSupportLanguageArray(int[] iArr) {
        BaseBandModel connectBand;
        if (iArr == null || (connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand()) == null) {
            return;
        }
        BandLanguageDaoProxy bandLanguageDaoProxy = new BandLanguageDaoProxy();
        List<BandLanguage> list = bandLanguageDaoProxy.get(connectBand.getBandName());
        String bean2Json = com.moyoung.dafit.module.common.utils.s.bean2Json(iArr);
        if (list == null || list.isEmpty()) {
            BandLanguage bandLanguage = new BandLanguage();
            bandLanguage.setBandName(connectBand.getBandName());
            bandLanguage.setLanguages(bean2Json);
            bandLanguageDaoProxy.insert(bandLanguage);
            return;
        }
        for (BandLanguage bandLanguage2 : list) {
            bandLanguage2.setLanguages(bean2Json);
            bandLanguageDaoProxy.insert(bandLanguage2);
        }
    }

    @Override // com.crrepa.ble.conn.callback.CRPDeviceLanguageCallback
    public void onDeviceLanguage(int i8, int[] iArr) {
        com.orhanobut.logger.f.d("onDeviceLanguage = " + i8 + ", supportLanguageArray = " + Arrays.toString(iArr));
        saveBandSupportLanguageArray(iArr);
        if (this.queryLanguage) {
            i4.getInstance().sendBandLanguage();
            setQueryLanguage(false);
        } else {
            BandDisplayLanguageProvider.saveDisplayLanguage(i8);
            org.greenrobot.eventbus.c.getDefault().post(new BandLanguageChangeEvent(i8));
        }
    }

    public void setQueryLanguage(boolean z7) {
        this.queryLanguage = z7;
    }
}
