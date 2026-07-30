package com.crrepa.band.my.device.cricket.model.provider;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.ar.auth.FeatureCodes;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class CricketSettingProvider {
    private static final int[] DEFAULT_REMINDER_SECOND_ARRAY = {0, 300, TypedValues.Custom.TYPE_INT, FeatureCodes.HAIR_SEG, 3600};

    private CricketSettingProvider() {
    }

    public static List<String> getDefaultReminderTimeList(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(context.getString(R.string.cricket_remind_setting_begin));
        arrayList.add(context.getString(R.string.cricket_remind_setting_five_min));
        arrayList.add(context.getString(R.string.cricket_remind_setting_fifteen_min));
        arrayList.add(context.getString(R.string.cricket_remind_setting_thirty_min));
        arrayList.add(context.getString(R.string.cricket_remind_setting_one_hour));
        return arrayList;
    }

    public static int getReminderTime(int i8) {
        return DEFAULT_REMINDER_SECOND_ARRAY[i8];
    }

    public static String getReminderTimeStr(Context context, int i8) {
        return getDefaultReminderTimeList(context).get(getSelectedReminderIndex(i8));
    }

    public static boolean getScoreReminder() {
        return g.getInstance().getBoolean(BaseParamNames.CRICKET_SCORE_REMINDER, false);
    }

    public static int getSelectedReminderIndex(int i8) {
        int i9 = 0;
        while (true) {
            int[] iArr = DEFAULT_REMINDER_SECOND_ARRAY;
            if (i9 >= iArr.length) {
                return 0;
            }
            if (i8 == iArr[i9]) {
                return i9;
            }
            i9++;
        }
    }

    public static int getStartReminderTime() {
        return g.getInstance().getInt(BaseParamNames.CRICKET_START_REMINDER_TIME, 0);
    }

    public static void saveScoreReminder(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.CRICKET_SCORE_REMINDER, z7);
    }

    public static void saveStartReminderTime(int i8) {
        g.getInstance().putInt(BaseParamNames.CRICKET_START_REMINDER_TIME, i8);
    }
}
