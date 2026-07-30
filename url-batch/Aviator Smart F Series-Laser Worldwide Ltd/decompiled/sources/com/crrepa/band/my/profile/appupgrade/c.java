package com.crrepa.band.my.profile.appupgrade;

import android.text.format.DateUtils;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class c {
    private static final long CHECK_PERIOD = 21600000;
    public static final int DEFAULT_VERSION = 0;

    public static void delete() {
        g gVar = g.getInstance();
        gVar.remove(BaseParamNames.NEW_APP_VERSION_CODE);
        gVar.remove(BaseParamNames.APP_IGNORE_VERSION);
        gVar.remove(BaseParamNames.NEW_APP_UPDATE_TYPE);
    }

    public static int getIgnoreVersion() {
        return g.getInstance().getInt(BaseParamNames.APP_IGNORE_VERSION, 0);
    }

    public static long getNewAppVersionCode() {
        return g.getInstance().getInt(BaseParamNames.NEW_APP_VERSION_CODE, 0);
    }

    public static boolean isCheckNewVersion() {
        return getNewAppVersionCode() == 0 ? CHECK_PERIOD < System.currentTimeMillis() - g.getInstance().getLong(BaseParamNames.CHECK_APP_VERSION_TIME, -1L) : !DateUtils.isToday(r0);
    }

    public static boolean isForceUpdateType() {
        return 1 == g.getInstance().getInt(BaseParamNames.NEW_APP_UPDATE_TYPE, 0);
    }

    public static void saveIgnoreVersion(int i8) {
        g.getInstance().putInt(BaseParamNames.APP_IGNORE_VERSION, i8);
    }

    public static void saveNewAppVersionCode(int i8) {
        g.getInstance().putInt(BaseParamNames.NEW_APP_VERSION_CODE, i8);
    }

    public static void saveUpdateType(int i8) {
        g.getInstance().putInt(BaseParamNames.NEW_APP_UPDATE_TYPE, i8);
    }
}
