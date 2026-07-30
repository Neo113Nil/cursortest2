package com.crrepa.band.my.device.ai.helper;

import android.text.TextUtils;
import android.util.Log;
import com.artillery.ctc.base.LargeModel;
import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.my.lib.data.Agent;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class AIProvider {
    public static final String KEY_AFLASH_FETCH_LIST = "key_aflash_fetch_list";
    public static final String KEY_AI_WATCH_FACE_LAYOUT_INFO = "ai_watch_face_layout_info";
    public static final String KEY_FEATURE_ARRAY = "key_feature_array";
    public static final String KEY_HUAQIAO_LARGE_MODEL_LIST = "large_model_list";
    public static final String KEY_IS_STREAM_CHAT = "is_stream_chat";
    public static final String KEY_PROVIDER_TYPE = "key_provider_type";
    public static final String KEY_SELECTED_HUAQIAO_LARGE_MODEL = "selected_large_model";
    public static final String KEY_SELECTED_PICTURE_STYLE_CODE = "key_selected_picture_style_Code";
    public static final String KEY_SUPPORT_FETCH_ARRAY = "key_support_fetch_array";

    public static void delete() {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(KEY_IS_STREAM_CHAT);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(KEY_FEATURE_ARRAY);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(KEY_AI_WATCH_FACE_LAYOUT_INFO);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(KEY_PROVIDER_TYPE);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(g.KEY_IS_HUAQIAO_MAC_AUTHORIZED);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(KEY_SELECTED_HUAQIAO_LARGE_MODEL);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(KEY_SUPPORT_FETCH_ARRAY);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(KEY_AFLASH_FETCH_LIST);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(KEY_SELECTED_PICTURE_STYLE_CODE);
    }

    public static CRPWatchFaceLayoutInfo getAIWatchFaceLayoutInfo() {
        String string = com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(KEY_AI_WATCH_FACE_LAYOUT_INFO, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return (CRPWatchFaceLayoutInfo) new Gson().fromJson(string, new TypeToken<CRPWatchFaceLayoutInfo>() { // from class: com.crrepa.band.my.device.ai.helper.AIProvider.2
        }.getType());
    }

    public static List<Agent.Data.AiSmart> getAflashFetchList() {
        String string = com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(KEY_AFLASH_FETCH_LIST, "");
        if (string.isEmpty()) {
            return null;
        }
        return (List) new Gson().fromJson(string, new TypeToken<List<Agent.Data.AiSmart>>() { // from class: com.crrepa.band.my.device.ai.helper.AIProvider.1
        }.getType());
    }

    public static List<LargeModel> getLargeModelList() {
        String string = com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(KEY_HUAQIAO_LARGE_MODEL_LIST, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return (List) new Gson().fromJson(string, new TypeToken<List<LargeModel>>() { // from class: com.crrepa.band.my.device.ai.helper.AIProvider.3
        }.getType());
    }

    public static int getProviderType() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(KEY_PROVIDER_TYPE, 0);
    }

    public static LargeModel getSelectedLargeModel() {
        String string = com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(KEY_SELECTED_HUAQIAO_LARGE_MODEL, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return (LargeModel) new Gson().fromJson(string, new TypeToken<LargeModel>() { // from class: com.crrepa.band.my.device.ai.helper.AIProvider.4
        }.getType());
    }

    public static String getSelectedLargeModelType() {
        LargeModel selectedLargeModel = getSelectedLargeModel();
        return selectedLargeModel == null ? com.crrepa.band.my.device.ai.chat.delegate.child.d.DEFAULT_LARGE_MODEL_TYPE : selectedLargeModel.type;
    }

    public static String getSelectedPictureStyleCode() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(KEY_SELECTED_PICTURE_STYLE_CODE, "");
    }

    private static String getSupportAIFeatures() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(KEY_FEATURE_ARRAY, "");
    }

    public static byte[] getSupportFetchArray() {
        String string = com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(KEY_SUPPORT_FETCH_ARRAY, "");
        if (string.isEmpty()) {
            return null;
        }
        return (byte[]) new Gson().fromJson(string, byte[].class);
    }

    public static boolean isStreamChat() {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
            return true;
        }
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getBoolean(KEY_IS_STREAM_CHAT, false);
    }

    public static boolean isSupportAIAll() {
        return !notSupportAI() && isSupportAIGPT() && isSupportAIWatchFace() && isSupportFetchAgent() && isSupportAIHealthAnalysis();
    }

    public static boolean isSupportAIGPT() {
        if (notSupportAI()) {
            return false;
        }
        return getSupportAIFeatures().contains(String.valueOf(0));
    }

    public static boolean isSupportAIHealthAnalysis() {
        if (notSupportAI()) {
            return false;
        }
        return getSupportAIFeatures().contains(String.valueOf(3));
    }

    public static boolean isSupportAIWatchFace() {
        if (notSupportAI()) {
            return false;
        }
        return getSupportAIFeatures().contains(String.valueOf(1));
    }

    public static boolean isSupportFetchAgent() {
        if (notSupportAI()) {
            return false;
        }
        return getSupportAIFeatures().contains(String.valueOf(2));
    }

    public static boolean notSupportAI() {
        return TextUtils.isEmpty(getSupportAIFeatures());
    }

    public static void saveAIWatchFaceLayoutInfo(CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(KEY_AI_WATCH_FACE_LAYOUT_INFO, new Gson().toJson(cRPWatchFaceLayoutInfo));
        Log.d("saveAIWFLayoutInfo", "===" + cRPWatchFaceLayoutInfo.getTextColor());
    }

    public static void saveAflashFetchList(List<Agent.Data.AiSmart> list) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(KEY_AFLASH_FETCH_LIST, new Gson().toJson(list));
    }

    public static void saveIsStreamChat(boolean z7) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putBoolean(KEY_IS_STREAM_CHAT, z7);
    }

    public static void saveLargeModelList(List<LargeModel> list) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(KEY_HUAQIAO_LARGE_MODEL_LIST, new Gson().toJson(list));
    }

    public static void saveProviderType(int i8) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putInt(KEY_PROVIDER_TYPE, i8);
    }

    public static void saveSelectedLargeModel(LargeModel largeModel) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(KEY_SELECTED_HUAQIAO_LARGE_MODEL, new Gson().toJson(largeModel));
    }

    public static void saveSelectedPictureStyleCode(String str) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(KEY_SELECTED_PICTURE_STYLE_CODE, str);
    }

    public static void saveSupportAI(byte[] bArr) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(KEY_FEATURE_ARRAY, Arrays.toString(bArr));
    }

    public static void saveSupportFetchArray(byte[] bArr) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(KEY_SUPPORT_FETCH_ARRAY, Arrays.toString(bArr));
    }
}
