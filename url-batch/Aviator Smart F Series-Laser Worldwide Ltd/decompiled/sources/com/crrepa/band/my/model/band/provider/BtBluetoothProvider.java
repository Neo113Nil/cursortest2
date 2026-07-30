package com.crrepa.band.my.model.band.provider;

import android.text.TextUtils;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BtBluetoothProvider {
    private BtBluetoothProvider() {
    }

    public static void delete() {
        g.getInstance().remove(BaseParamNames.BT_NAME);
        g.getInstance().remove(BaseParamNames.BT_ADDRESS);
    }

    public static String getAddress() {
        return g.getInstance().getString(BaseParamNames.BT_ADDRESS, "");
    }

    public static String getName() {
        String string = g.getInstance().getString(BaseParamNames.BT_NAME, null);
        return TextUtils.isEmpty(string) ? getAddress() : string;
    }

    public static void saveAddress(String str) {
        g.getInstance().putString(BaseParamNames.BT_ADDRESS, str);
    }

    public static void saveName(String str) {
        g.getInstance().putString(BaseParamNames.BT_NAME, str);
    }
}
