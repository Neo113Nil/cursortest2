package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.ble.band.utils.a;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import com.orhanobut.logger.f;

/* loaded from: classes2.dex */
public class BandStorageProvider {
    private static final int DEFAULT_WATCH_FACE_MAX_SIZE = 1048576;

    private BandStorageProvider() {
    }

    public static void delete() {
        g.getInstance().remove(BaseParamNames.BAND_AVAILABLE_STORAGE);
        g.getInstance().remove(BaseParamNames.BAND_MAX_STORAGE);
    }

    public static int getAvailableStorage() {
        return g.getInstance().getInt(BaseParamNames.BAND_AVAILABLE_STORAGE, 0);
    }

    public static int getMaxStorage() {
        int i8 = g.getInstance().getInt(BaseParamNames.BAND_MAX_STORAGE, 0);
        if (a.getInstance().isHisilicon()) {
            return i8;
        }
        if (i8 <= 0) {
            i8 = 1048576;
        }
        if (i8 < 524288) {
            i8 = 524288;
        }
        f.d("getMaxStorage: " + i8);
        return i8;
    }

    public static boolean hasAvailableStorage() {
        return getAvailableStorage() > 0;
    }

    public static void saveAvailableStorage(int i8) {
        f.d("saveAvailableStorage: " + i8);
        if (i8 == 0 && (a.getInstance().isSifli() || a.getInstance().isHisilicon())) {
            i8 = 1;
        }
        g.getInstance().putInt(BaseParamNames.BAND_AVAILABLE_STORAGE, i8);
        saveMaxStorage(i8);
    }

    public static void saveMaxStorage(int i8) {
        if (g.getInstance().getInt(BaseParamNames.BAND_MAX_STORAGE, 0) < i8) {
            f.d("saveMaxStorage: " + i8);
            g.getInstance().putInt(BaseParamNames.BAND_MAX_STORAGE, i8);
        }
    }
}
