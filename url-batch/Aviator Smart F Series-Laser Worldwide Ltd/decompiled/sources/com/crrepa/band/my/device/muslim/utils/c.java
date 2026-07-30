package com.crrepa.band.my.device.muslim.utils;

import android.text.TextUtils;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.muslim.model.AllahName;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.google.gson.Gson;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.s;
import com.orhanobut.logger.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class c {
    public static final int DEFAULT_ASR_METHOD_INDEX = 0;
    public static final int DEFAULT_PRAY_METHOD_INDEX = 2;
    public static final int DEFAULT_TASBIH_END_TIME_INDEX = 10;
    public static final int DEFAULT_TASBIH_INTERVAL_TIME = 30;
    public static final int DEFAULT_TASBIH_START_TIME_INDEX = 8;

    public static void delete() {
        g.getInstance().remove(BaseParamNames.MUSLIM_SUPPORT);
        g.getInstance().remove(BaseParamNames.MUSLIM_REMINDER_ASR_METHOD);
        g.getInstance().remove(BaseParamNames.MUSLIM_PRAYER_COMPENSATION);
        setSupportSIHATKEMENAG(false);
    }

    public static void deletePrayerCompensation() {
        g.getInstance().remove(BaseParamNames.MUSLIM_PRAYER_COMPENSATION);
    }

    public static List<AllahName> getAllahNameList() {
        String string = g.getInstance().getString(BaseParamNames.MUSLIM_ALLAH_NAME_LIST, null);
        return TextUtils.isEmpty(string) ? getDefaultAllahName() : s.json2List(string, AllahName[].class);
    }

    public static int getAsrJuristicMethod() {
        return g.getInstance().getInt(BaseParamNames.MUSLIM_REMINDER_ASR_METHOD, 0);
    }

    private static List<AllahName> getDefaultAllahName() {
        String[] stringArray = com.moyoung.dafit.module.common.utils.d.get().getResources().getStringArray(R.array.ar_names);
        String[] stringArray2 = com.moyoung.dafit.module.common.utils.d.get().getResources().getStringArray(R.array.en_names);
        ArrayList arrayList = new ArrayList(stringArray.length);
        int i8 = 0;
        while (i8 < stringArray.length) {
            AllahName allahName = new AllahName();
            allahName.setEnName(stringArray2[i8]);
            allahName.setArName(stringArray[i8]);
            i8++;
            allahName.setIndex(i8);
            arrayList.add(allahName);
        }
        return arrayList;
    }

    public static int getPrayMethod() {
        return g.getInstance().getInt(BaseParamNames.MUSLIM_REMINDER_METHOD, 2);
    }

    public static boolean getPraySwitchState() {
        return g.getInstance().getBoolean(BaseParamNames.MUSLIM_REMINDER_STATE, false);
    }

    public static boolean[] getPrayTimeSwitchArray(boolean z7) {
        String string = g.getInstance().getString(BaseParamNames.MUSLIM_REMINDER_STATE_ARRAY, null);
        return (z7 || TextUtils.isEmpty(string)) ? new boolean[]{true, false, true, true, true, true} : (boolean[]) new Gson().fromJson(string, boolean[].class);
    }

    public static int[] getPrayerCompensation() {
        String string = g.getInstance().getString(BaseParamNames.MUSLIM_PRAYER_COMPENSATION, null);
        return !TextUtils.isEmpty(string) ? (int[]) new Gson().fromJson(string, int[].class) : new int[7];
    }

    public static boolean getSupportSIHATKEMENAG() {
        return g.getInstance().getBoolean(BaseParamNames.SUPPORT_SIHAT_KEMENAG, false);
    }

    public static int[] getTasbihEndTime() {
        String string = g.getInstance().getString(BaseParamNames.TASBIH_END_TIME_STATE, null);
        return TextUtils.isEmpty(string) ? new int[]{10, 0} : (int[]) new Gson().fromJson(string, int[].class);
    }

    public static int getTasbihIntervalTime() {
        return g.getInstance().getInt(BaseParamNames.TASBIH_INTERVAL_TIME_STATE, 30);
    }

    public static int[] getTasbihStartTime() {
        String string = g.getInstance().getString(BaseParamNames.TASBIH_START_TIME_STATE, null);
        return TextUtils.isEmpty(string) ? new int[]{8, 0} : (int[]) new Gson().fromJson(string, int[].class);
    }

    public static boolean getTasbihSwitchState() {
        return g.getInstance().getBoolean(BaseParamNames.TASBIH_REMINDER_STATE, false);
    }

    public static boolean[] getTasbihWeekDateStateArray(boolean z7) {
        String string = g.getInstance().getString(BaseParamNames.TASBIH_WEEK_DATE_STATE_ARRAY, null);
        return (z7 || TextUtils.isEmpty(string)) ? new boolean[]{false, true, false, false, false, false, false} : (boolean[]) new Gson().fromJson(string, boolean[].class);
    }

    public static boolean isShowAsrMethod() {
        return g.getInstance().contains(BaseParamNames.MUSLIM_REMINDER_ASR_METHOD);
    }

    public static boolean isSupportMuslim() {
        return g.getInstance().contains(BaseParamNames.MUSLIM_SUPPORT);
    }

    public static boolean isSupportPrayerCompensation() {
        return g.getInstance().contains(BaseParamNames.MUSLIM_PRAYER_COMPENSATION);
    }

    public static void saveAllahNameList(List<AllahName> list) {
        String bean2Json = s.bean2Json(list);
        f.d("muslim ==> saveAllahNameList: " + bean2Json);
        g.getInstance().putString(BaseParamNames.MUSLIM_ALLAH_NAME_LIST, bean2Json);
    }

    public static void saveAsrJuristicMethod(int i8) {
        f.d("muslim ==> saveAsrJuristicMethod: " + i8 + "; type " + b.getInstance().getAsrCalculationType(i8));
        g.getInstance().putInt(BaseParamNames.MUSLIM_REMINDER_ASR_METHOD, i8);
    }

    public static void savePrayMethod(int i8) {
        f.d("muslim ==> savePrayMethod: " + i8 + "; type " + b.getInstance().getCalculationType(i8));
        g.getInstance().putInt(BaseParamNames.MUSLIM_REMINDER_METHOD, i8);
    }

    public static void savePraySwitchState(boolean z7) {
        f.d("muslim ==> savePraySwitchState: " + z7);
        g.getInstance().putBoolean(BaseParamNames.MUSLIM_REMINDER_STATE, z7);
    }

    public static void savePrayTimeSwitchArray(boolean[] zArr) {
        String bean2Json = s.bean2Json(zArr);
        f.d("muslim ==> savePrayTimeSwitchArray: " + bean2Json);
        g.getInstance().putString(BaseParamNames.MUSLIM_REMINDER_STATE_ARRAY, bean2Json);
    }

    public static void savePrayerCompensation(int[] iArr) {
        String bean2Json = s.bean2Json(iArr);
        f.d("muslim ==> saveManualCorrectionValueArray: " + bean2Json);
        g.getInstance().putString(BaseParamNames.MUSLIM_PRAYER_COMPENSATION, bean2Json);
    }

    public static void saveSupportMuslim(boolean z7) {
        f.d("muslim ==> saveSupportMuslim: " + z7);
        g.getInstance().putBoolean(BaseParamNames.MUSLIM_SUPPORT, z7);
    }

    public static void saveTasbihEndTime(int i8, int i9) {
        f.d("muslim ==> saveTasbihEndTime: " + i8 + " : " + i9);
        g.getInstance().putString(BaseParamNames.TASBIH_END_TIME_STATE, s.bean2Json(new int[]{i8, i9}));
    }

    public static void saveTasbihIntervalTime(int i8) {
        f.d("muslim ==> saveTasbihIntervalTime: " + i8);
        if (i8 < 0) {
            i8 &= 255;
            f.d("muslim ==> IntervalTime: " + i8);
        }
        g.getInstance().putInt(BaseParamNames.TASBIH_INTERVAL_TIME_STATE, i8);
    }

    public static void saveTasbihStartTime(int i8, int i9) {
        f.d("muslim ==> saveTasbihStartTime: " + i8 + " : " + i9);
        g.getInstance().putString(BaseParamNames.TASBIH_START_TIME_STATE, s.bean2Json(new int[]{i8, i9}));
    }

    public static void saveTasbihSwitchState(boolean z7) {
        f.d("muslim ==> saveTasbihSwitchState: " + z7);
        g.getInstance().putBoolean(BaseParamNames.TASBIH_REMINDER_STATE, z7);
    }

    public static void saveTasbihWeekDateStateArray(boolean[] zArr) {
        String bean2Json = s.bean2Json(zArr);
        f.d("muslim ==> saveTasbihWeekDateStateArray: " + bean2Json);
        g.getInstance().putString(BaseParamNames.TASBIH_WEEK_DATE_STATE_ARRAY, bean2Json);
    }

    public static void setSupportSIHATKEMENAG(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.SUPPORT_SIHAT_KEMENAG, z7);
    }
}
