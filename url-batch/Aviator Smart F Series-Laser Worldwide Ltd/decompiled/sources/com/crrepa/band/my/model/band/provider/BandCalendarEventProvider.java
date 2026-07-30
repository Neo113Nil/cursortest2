package com.crrepa.band.my.model.band.provider;

import android.content.Context;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.utils.a;
import com.crrepa.band.my.device.appmarket.AppMarketProvider;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.crrepa.ble.conn.bean.CRPAppInfo;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class BandCalendarEventProvider {
    public static final int DEFAULT_EVENT_MAX_COUNT = 0;
    public static final int DEFAULT_EVENT_TIME = 0;
    private static int[] EVENT_REMIND_TIME_ARRAY = {0, 5, 15, 30};
    public static final int LOWER_EVENT_TIME = 5;
    private static final int MAX_EVENT_TIME = 30;
    private static final int MIDDLE_EVENT_TIME = 15;

    private BandCalendarEventProvider() {
    }

    public static void close() {
        g.getInstance().remove(BaseParamNames.CALENDAR_EVENT_TIME);
        g.getInstance().remove(BaseParamNames.CALENDAR_EVENT_STATE);
    }

    public static void delete() {
        g.getInstance().remove(BaseParamNames.CALENDAR_EVENT_MAX_COUNT);
        g.getInstance().remove(BaseParamNames.CALENDAR_EVENT_TIME);
        g.getInstance().remove(BaseParamNames.CALENDAR_EVENT_STATE);
    }

    public static boolean getCalendarEventState() {
        return g.getInstance().contains(BaseParamNames.CALENDAR_EVENT_STATE);
    }

    public static int getEventTime() {
        return g.getInstance().getInt(BaseParamNames.CALENDAR_EVENT_TIME, 0);
    }

    public static List<String> getEventTimeList(Context context) {
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (true) {
            int[] iArr = EVENT_REMIND_TIME_ARRAY;
            if (i8 >= iArr.length) {
                return arrayList;
            }
            if (i8 == 0) {
                arrayList.add(context.getString(R.string.calendar_at_the_beginning));
            } else {
                arrayList.add(context.getString(R.string.calendar_minutes_in_advance, Integer.valueOf(iArr[i8])));
            }
            i8++;
        }
    }

    public static int getEventTimeOfPosition(int i8) {
        return EVENT_REMIND_TIME_ARRAY[i8];
    }

    public static int getEventTimePosition(int i8) {
        if (i8 < 0) {
            i8 = 0;
        }
        if (i8 > 30) {
            i8 = 30;
        }
        int i9 = 0;
        while (true) {
            int[] iArr = EVENT_REMIND_TIME_ARRAY;
            if (i9 >= iArr.length) {
                return 0;
            }
            if (i8 == iArr[i9]) {
                return i9;
            }
            i9++;
        }
    }

    public static int getMaxEventCount() {
        return g.getInstance().getInt(BaseParamNames.CALENDAR_EVENT_MAX_COUNT, 0);
    }

    public static boolean getReminderState() {
        return g.getInstance().getBoolean(BaseParamNames.CALENDAR_EVENT_STATE, false);
    }

    public static boolean isSupportCalendarEvent() {
        if (!a.getInstance().isHisilicon()) {
            return g.getInstance().contains(BaseParamNames.CALENDAR_EVENT_MAX_COUNT);
        }
        List<CRPAppInfo> installedAppList = AppMarketProvider.getInstalledAppList();
        if (x0.isEmpty(installedAppList)) {
            return false;
        }
        Iterator<CRPAppInfo> it = installedAppList.iterator();
        while (it.hasNext()) {
            if ("com.moyoung.calendar".equals(it.next().getPackageName())) {
                return true;
            }
        }
        return false;
    }

    public static void saveEventTime(int i8) {
        g.getInstance().putInt(BaseParamNames.CALENDAR_EVENT_TIME, i8);
    }

    public static void saveMaxEventCount(int i8) {
        g.getInstance().putInt(BaseParamNames.CALENDAR_EVENT_MAX_COUNT, i8);
    }

    public static void saveReminderState(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.CALENDAR_EVENT_STATE, z7);
    }
}
