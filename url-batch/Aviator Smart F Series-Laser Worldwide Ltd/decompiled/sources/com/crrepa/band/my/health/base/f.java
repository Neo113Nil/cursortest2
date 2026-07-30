package com.crrepa.band.my.health.base;

import android.text.TextUtils;
import com.crrepa.band.my.model.band.BaseBandModel;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class f {
    protected static final String BAND_ADDRESS = "mac";
    protected static final String BAND_VERSION = "ver";
    protected static final String CALORIE = "cal";
    protected static final String DBP = "dbp";
    protected static final String DEEP = "deep";
    protected static final String DISTANCE = "dis";
    protected static final String HR = "hr";
    protected static final String LIGHT = "light";
    protected static final String PHONE_IMEI = "imei";
    protected static final String SBP = "sbp";
    protected static final String SPO2 = "spo2";
    protected static final String STEPS = "steps";
    protected static final int UPLOAD_PERIOD = 600000;
    protected long lastUploadTime;

    protected Map<String, String> getBaseRequest() {
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand == null) {
            return null;
        }
        String address = connectBand.getAddress();
        String firmwareVersion = connectBand.getFirmwareVersion();
        if (TextUtils.isEmpty(address) || TextUtils.isEmpty(firmwareVersion)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(BAND_ADDRESS, address);
        hashMap.put(BAND_VERSION, firmwareVersion);
        return hashMap;
    }
}
