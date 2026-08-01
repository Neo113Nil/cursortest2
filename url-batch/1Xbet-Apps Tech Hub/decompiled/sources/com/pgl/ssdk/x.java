package com.pgl.ssdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import org.objectweb.asm.Opcodes;

/* compiled from: AppInfo.java */
/* loaded from: classes3.dex */
public class x {
    private static int a = -1;
    private static int b = -1;

    private static boolean a(Context context) {
        List<ActivityManager.AppTask> appTasks;
        if (context != null && (appTasks = ((ActivityManager) context.getSystemService("activity")).getAppTasks()) != null && !appTasks.isEmpty()) {
            for (ActivityManager.AppTask appTask : appTasks) {
                if (appTask.getTaskInfo() != null && a(appTask.getTaskInfo().baseIntent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void b(Context context) {
        try {
            if (a == -1 || b == -1) {
                d(context);
            }
            if (a(context)) {
                a++;
            }
            b++;
            if (a != 0) {
                e(context);
                com.pgl.ssdk.ces.a.meta(Opcodes.IF_ICMPNE, null, new int[]{a, b});
            }
        } catch (Throwable unused) {
        }
    }

    public static int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static void d(Context context) {
        String a2 = L.a(context, "hac_date", null);
        if (!TextUtils.isEmpty(a2)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            if (a2.equals(simpleDateFormat.format(new Date()))) {
                SharedPreferences a3 = L.a(context);
                int i = a3 != null ? a3.getInt("hac", -1) : -1;
                SharedPreferences a4 = L.a(context);
                int i2 = a4 != null ? a4.getInt("tac", -1) : -1;
                if (i != -1 && i2 != -1) {
                    a = i;
                    b = i2;
                    return;
                }
            }
        }
        a = 0;
        b = 0;
    }

    private static void e(Context context) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        L.b(context, "hac_date", simpleDateFormat.format(new Date()));
        int i = a;
        SharedPreferences a2 = L.a(context);
        if (a2 != null) {
            a2.edit().putInt("hac", i).apply();
        }
        int i2 = b;
        SharedPreferences a3 = L.a(context);
        if (a3 != null) {
            a3.edit().putInt("tac", i2).apply();
        }
    }

    private static boolean a(Intent intent) {
        return (intent == null || (intent.getFlags() & 8388608) == 0) ? false : true;
    }
}
