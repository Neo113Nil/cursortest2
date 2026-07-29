package com.xsj.crasheye.pushstrategy;

import android.content.Context;
import android.content.SharedPreferences;
import com.xsj.crasheye.Properties;
import com.xsj.crasheye.log.Logger;
import com.xsj.crasheye.util.Utils;
import java.text.SimpleDateFormat;

/* loaded from: classes2.dex */
public class DateRefreshStrategy {
    private static final long MILLIS_IN_HOUR = 3600000;
    private static long lastReportTime = -1;
    private static DateRefreshStrategy m_instance = null;
    private static long recordStartDate = -1;

    public static DateRefreshStrategy getInstance() {
        if (m_instance == null) {
            synchronized (DateRefreshStrategy.class) {
                if (m_instance == null) {
                    m_instance = new DateRefreshStrategy();
                }
            }
        }
        return m_instance;
    }

    public void load(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("DATAREFRESHSTRATEGY", 0);
        if (sharedPreferences == null) {
            return;
        }
        try {
            recordStartDate = Long.valueOf(sharedPreferences.getLong("recordStartDate", -1L)).longValue();
            lastReportTime = Long.valueOf(sharedPreferences.getLong("lastReportTime", -1L)).longValue();
        } catch (Exception unused) {
            Logger.logWarning("load DateRefreshStrategy error.");
        }
    }

    public void saveAll(Context context) {
        saveRecordStartDate(context);
        saveLastReportTime(context);
    }

    public void updataRecordStartDate(long j) {
        if (j <= 0) {
            Logger.logWarning("StartDate time is illegal.");
        }
        recordStartDate = j;
    }

    public void saveRecordStartDate(Context context) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = context.getSharedPreferences("DATAREFRESHSTRATEGY", 0);
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        try {
            if (recordStartDate >= 0) {
                edit.putLong("recordStartDate", recordStartDate);
                if (edit.commit()) {
                    Logger.logInfo("saveRecordStartDate commit success.");
                } else {
                    Logger.logWarning("saveRecordStartDate commit error.");
                }
            }
        } catch (Exception unused) {
            Logger.logWarning("saveRecordStartDate save error.");
        }
    }

    public void updataLastReportTime(long j) {
        if (j <= 0) {
            Logger.logWarning("ReportDate time is illegal.");
        }
        lastReportTime = j;
    }

    public void saveLastReportTime(Context context) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = context.getSharedPreferences("DATAREFRESHSTRATEGY", 0);
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        try {
            if (recordStartDate >= 0) {
                edit.putLong("lastReportTime", lastReportTime);
                if (edit.commit()) {
                    Logger.logInfo("saveLastReportTime commit success.");
                } else {
                    Logger.logWarning("saveLastReportTime commit error.");
                }
            }
        } catch (Exception unused) {
            Logger.logWarning("saveLastReportTime save error.");
        }
    }

    public boolean checkCanRefresh() {
        int i = (recordStartDate > 0L ? 1 : (recordStartDate == 0L ? 0 : -1));
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            if (!simpleDateFormat.format(Long.valueOf(recordStartDate)).equals(simpleDateFormat.format(Long.valueOf(Utils.getTimeForLong())))) {
                return true;
            }
            Logger.logInfo("today has sent a request to the server, no need to send");
            return false;
        } catch (Exception unused) {
            Logger.logWarning("DateRefreshStrategy check Exception.");
            return true;
        }
    }

    public boolean checkCanReportBySpanTime() {
        int intValue = Properties.RemoteSettingsProps.actionSpan.intValue();
        if (intValue == -1) {
            return true;
        }
        if (intValue <= 0 || intValue >= 24) {
            Logger.logWarning("actionSpan Don't take effect");
            return false;
        }
        if (lastReportTime <= 0) {
            Logger.logWarning("lastReportTime is not exist, so can report");
            return true;
        }
        if (Utils.getTimeForLong() - lastReportTime < 0) {
            Logger.logWarning("lastReportTime Don't take effect, so can report");
            return true;
        }
        if (Utils.getTimeForLong() - lastReportTime > intValue * MILLIS_IN_HOUR) {
            return true;
        }
        Logger.logInfo("set session report send span time " + intValue + " hour.");
        return false;
    }

    public boolean checkCanReportByFileCount(int i) {
        return i > 0 && i >= Properties.RemoteSettingsProps.actionCounts.intValue();
    }
}
