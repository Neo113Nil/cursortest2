package com.crrepa.band.my.ble.band.config;

import android.content.Context;
import android.text.TextUtils;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.CustomizeBandModel;
import com.crrepa.band.my.model.band.Fit740Model;
import com.crrepa.band.my.model.band.Fit750Model;
import com.crrepa.band.my.model.band.Fit751Model;
import com.crrepa.band.my.model.band.Fit752Model;
import com.crrepa.band.my.model.band.Fit753Model;
import com.crrepa.band.my.model.band.MYBandModel;
import com.crrepa.band.my.model.band.XYBandModel;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.band.util.BandFirmwareUtils;
import com.crrepa.band.my.model.db.BandConfig;
import com.crrepa.band.my.model.db.proxy.BandConfigDaoProxy;

/* loaded from: classes2.dex */
public class e {
    String fit740BandBroadcastName;
    String fit750BandBroadcastName;
    String fit751BandBroadcastName;
    String fit752BandBroadcastName;
    String fit753BandBroadcastName;
    String myBandBroadcastName;
    String myInternationalBandBroadcastName;
    String myYoung2BandBroadcastName;
    String slimBandBroadcastName;
    String xyBandBroadcastName;
    String xyInternationalBandBroadcastName;

    public e() {
        getLocalBandBroadcastName();
    }

    private void getLocalBandBroadcastName() {
        Context context = com.moyoung.dafit.module.common.utils.d.get();
        this.myBandBroadcastName = context.getString(R.string.band_my);
        this.myYoung2BandBroadcastName = context.getString(R.string.band_moyoung_2);
        this.myInternationalBandBroadcastName = context.getString(R.string.band_my_international);
        this.xyBandBroadcastName = context.getString(R.string.band_xy);
        this.slimBandBroadcastName = context.getString(R.string.band_slim);
        this.xyInternationalBandBroadcastName = context.getString(R.string.band_xy_international);
        this.fit740BandBroadcastName = context.getString(R.string.band_fit740);
        this.fit750BandBroadcastName = context.getString(R.string.band_fit750);
        this.fit751BandBroadcastName = context.getString(R.string.band_fit751);
        this.fit752BandBroadcastName = context.getString(R.string.band_fit752);
        this.fit753BandBroadcastName = context.getString(R.string.band_fit753);
    }

    public BaseBandModel convert(String str, String str2, String str3) {
        BaseBandModel mYBandModel;
        if (TextUtils.equals(this.myBandBroadcastName, str) || TextUtils.equals(this.myYoung2BandBroadcastName, str) || TextUtils.equals(this.myInternationalBandBroadcastName, str)) {
            mYBandModel = new MYBandModel(str, str2);
        } else if (TextUtils.equals(this.xyBandBroadcastName, str) || TextUtils.equals(this.slimBandBroadcastName, str) || TextUtils.equals(this.xyInternationalBandBroadcastName, str)) {
            mYBandModel = new XYBandModel(str, str2);
        } else if (TextUtils.equals(this.fit740BandBroadcastName, str)) {
            mYBandModel = new Fit740Model(str, str2);
        } else if (TextUtils.equals(this.fit750BandBroadcastName, str)) {
            mYBandModel = new Fit750Model(str, str2);
        } else if (TextUtils.equals(this.fit751BandBroadcastName, str)) {
            mYBandModel = new Fit751Model(str, str2);
        } else if (TextUtils.equals(this.fit752BandBroadcastName, str)) {
            mYBandModel = new Fit752Model(str, str2);
        } else if (TextUtils.equals(this.fit753BandBroadcastName, str)) {
            mYBandModel = new Fit753Model(str, str2);
        } else {
            BandConfigDaoProxy bandConfigDaoProxy = new BandConfigDaoProxy();
            BandConfig byFirmwareType = !TextUtils.isEmpty(str3) ? bandConfigDaoProxy.getByFirmwareType(str3) : !TextUtils.isEmpty(str) ? bandConfigDaoProxy.getByName(str) : null;
            mYBandModel = byFirmwareType != null ? new CustomizeBandModel(str, str2, byFirmwareType) : null;
        }
        if (mYBandModel != null) {
            mYBandModel.setFirmwareVersion(BandInfoManager.getFirmwareVersion());
        }
        return mYBandModel;
    }

    public BaseBandModel getBoundBand() {
        String name = BandInfoManager.getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        String firmwareVersion = BandInfoManager.getFirmwareVersion();
        return convert(name, BandInfoManager.getAddress(), TextUtils.isEmpty(firmwareVersion) ? BandInfoManager.getFirmwareType() : BandFirmwareUtils.getFirmwareType(firmwareVersion));
    }
}
