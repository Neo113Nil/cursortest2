package com.youappi.sdk.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.preference.PreferenceManager;
import com.youappi.sdk.YouAPPi;
import com.youappi.sdk.net.model.DeviceOrientation;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class g {
    public static Boolean a(Context context) {
        int e = e(context);
        if (e == 0) {
            return false;
        }
        Date d2 = d(context);
        if (d2 == null) {
            return true;
        }
        return Boolean.valueOf(new Date().getTime() - d2.getTime() >= ((long) ((e * 1000) * 60)));
    }

    public static String a(Class cls) {
        String simpleName = cls.getClass().getSimpleName();
        return simpleName.length() > 22 ? simpleName.substring(22) : simpleName;
    }

    public static String a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            sb.append(next.getKey());
            sb.append("=");
            sb.append(next.getValue());
            if (it.hasNext()) {
                sb.append("&");
            }
        }
        return sb.toString();
    }

    @SuppressLint({"ApplySharedPref"})
    public static void a(Context context, int i) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt("IntervalMinForSyncUserApps", i);
        edit.commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public static void a(Context context, Date date) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putLong("LastSyncAppsDate", date.getTime());
        edit.commit();
    }

    public static String b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static DeviceOrientation c(Context context) {
        return context.getResources().getConfiguration().orientation == 2 ? DeviceOrientation.Landscape : DeviceOrientation.Portrait;
    }

    private static Date d(Context context) {
        long j = PreferenceManager.getDefaultSharedPreferences(context).getLong("LastSyncAppsDate", 0L);
        if (j == 0) {
            return null;
        }
        return new Date(j);
    }

    private static int e(Context context) {
        int i = PreferenceManager.getDefaultSharedPreferences(context).getInt("IntervalMinForSyncUserApps", 0);
        if (YouAPPi.getInstance().isSendApps() && i == 0) {
            return 20160;
        }
        return i;
    }
}
