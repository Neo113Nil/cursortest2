package com.crrepa.band.my.device.customkey.util;

import android.text.TextUtils;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.crrepa.ble.conn.bean.CRPCustomKeyInfo;
import com.crrepa.ble.conn.type.CRPCustomKeyGameType;
import com.crrepa.ble.conn.type.CRPCustomKeyType;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.s;
import com.orhanobut.logger.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class b {
    private static final int TRAINING_SIZE = 128;

    public static void delete() {
        g.getInstance().remove(BaseParamNames.CUSTOM_KEY_GAME_LIST);
        g.getInstance().remove(BaseParamNames.CUSTOM_KEY_CURRENT_FEATURE);
        g.getInstance().remove(BaseParamNames.CUSTOM_KEY_TRAINING_LIST);
        g.getInstance().remove(BaseParamNames.CUSTOM_KEY_FEATURE_LIST);
    }

    public static CRPCustomKeyInfo getCustomKeyFeature() {
        String string = g.getInstance().getString(BaseParamNames.CUSTOM_KEY_CURRENT_FEATURE, null);
        CRPCustomKeyInfo cRPCustomKeyInfo = new CRPCustomKeyInfo(CRPCustomKeyType.KEY_NONE, (byte) 0);
        if (TextUtils.isEmpty(string)) {
            return cRPCustomKeyInfo;
        }
        List json2List = s.json2List(string, CRPCustomKeyInfo[].class);
        return (json2List == null || json2List.isEmpty()) ? cRPCustomKeyInfo : (CRPCustomKeyInfo) json2List.get(0);
    }

    public static List<CRPCustomKeyType> getCustomKeyFeatureList() {
        String string = g.getInstance().getString(BaseParamNames.CUSTOM_KEY_FEATURE_LIST, null);
        return TextUtils.isEmpty(string) ? new ArrayList() : s.json2List(string, CRPCustomKeyType[].class);
    }

    public static List<CRPCustomKeyGameType> getCustomKeyGameList() {
        String string = g.getInstance().getString(BaseParamNames.CUSTOM_KEY_GAME_LIST, null);
        return TextUtils.isEmpty(string) ? new ArrayList() : s.json2List(string, CRPCustomKeyGameType[].class);
    }

    public static List<Integer> getCustomKeyTrainingList() {
        String string = g.getInstance().getString(BaseParamNames.CUSTOM_KEY_TRAINING_LIST, null);
        return TextUtils.isEmpty(string) ? new ArrayList() : s.json2List(string, Integer[].class);
    }

    public static List<CRPCustomKeyType> getDefaultCustomKeyFeatureList() {
        return Arrays.asList(CRPCustomKeyType.values());
    }

    public static List<CRPCustomKeyGameType> getDefaultCustomKeyGameList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CRPCustomKeyGameType.GAME_2048);
        arrayList.add(CRPCustomKeyGameType.GAME_BATTLESHIP);
        arrayList.add(CRPCustomKeyGameType.GAME_HAMSTER);
        arrayList.add(CRPCustomKeyGameType.GAME_BIRD);
        return arrayList;
    }

    public static List<Integer> getDefaultCustomKeyTrainingList() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < 128; i8++) {
            arrayList.add(Integer.valueOf(i8));
        }
        return arrayList;
    }

    public static boolean isSupportCustomKey() {
        return g.getInstance().contains(BaseParamNames.CUSTOM_KEY_FEATURE_LIST);
    }

    public static void saveCustomKeyFeature(List<CRPCustomKeyInfo> list) {
        f.d("saveCustomKeyFeatureList: " + s.bean2Json(list));
        g.getInstance().putString(BaseParamNames.CUSTOM_KEY_CURRENT_FEATURE, s.bean2Json(list));
    }

    public static void saveCustomKeyFeatureList(List<CRPCustomKeyType> list) {
        f.d("saveCustomKeyFeatureList: " + s.bean2Json(list));
        g.getInstance().putString(BaseParamNames.CUSTOM_KEY_FEATURE_LIST, s.bean2Json(list));
    }

    public static void saveCustomKeyGameList(List<CRPCustomKeyGameType> list) {
        f.d("saveCustomKeyGameList: " + s.bean2Json(list));
        g.getInstance().putString(BaseParamNames.CUSTOM_KEY_GAME_LIST, s.bean2Json(list));
    }

    public static void saveCustomKeyTrainingList(List<Integer> list) {
        f.d("saveCustomKeyTrainingList: " + s.bean2Json(list));
        g.getInstance().putString(BaseParamNames.CUSTOM_KEY_TRAINING_LIST, s.bean2Json(list));
    }
}
