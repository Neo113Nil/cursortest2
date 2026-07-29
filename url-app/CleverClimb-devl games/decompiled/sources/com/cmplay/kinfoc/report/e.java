package com.cmplay.kinfoc.report;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;

/* compiled from: UnityInfocUtil.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f4415a;

    /* JADX WARN: Removed duplicated region for block: B:14:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, String str5, String str6) {
        String string;
        String string2;
        int i5;
        int i6;
        String string3;
        String str7;
        int i7;
        int i8;
        String str8;
        String str9 = str3;
        try {
            f4415a = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("SET_PROMOTION_LOG");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (f4415a) {
            Log.d("zzb_infoc", "调用了：initInfoc, context=" + context + "   UnityInfocUtil.isLog:" + f4415a);
        }
        if (str9 != null && !str3.isEmpty()) {
            b(context, str, str2, str3, str4, i, i2, i3, i4, str5, str6);
        } else {
            SharedPreferences sharedPreferences = context.getSharedPreferences("infoconfig", 0);
            if (sharedPreferences != null) {
                string = sharedPreferences.getString("channel", str);
                String string4 = sharedPreferences.getString("childChannel", str2);
                str9 = sharedPreferences.getString("fmtPath", str9);
                int i9 = sharedPreferences.getInt("nCommonID", i);
                int i10 = sharedPreferences.getInt("nMyID", i3);
                String string5 = sharedPreferences.getString("rptUrl", str5);
                string2 = sharedPreferences.getString("innerfmtPath", str4);
                i5 = sharedPreferences.getInt("innernCommonID", i2);
                i6 = sharedPreferences.getInt("innernMyID", i4);
                string3 = sharedPreferences.getString("innerrptUrl", str6);
                str7 = string5;
                i7 = i10;
                i8 = i9;
                str8 = string4;
                KInfocReportManager.setmChannel(string);
                KInfocReportManager.setmChildChannel(str8);
                KInfocReportManager.initReport(context, str9, string2, true, i8, i5, i7, i6, str7, string3);
                if (f4415a) {
                    return;
                }
                Log.d("zzb_infoc", "调用了：initInfoc----");
                return;
            }
        }
        str8 = str2;
        i8 = i;
        i7 = i3;
        string3 = str6;
        string = str;
        str7 = str5;
        string2 = str4;
        i5 = i2;
        i6 = i4;
        KInfocReportManager.setmChannel(string);
        KInfocReportManager.setmChildChannel(str8);
        KInfocReportManager.initReport(context, str9, string2, true, i8, i5, i7, i6, str7, string3);
        if (f4415a) {
        }
    }

    private static void b(Context context, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, String str5, String str6) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("infoconfig", 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("channel", str);
            edit.putString("childChannel", str2);
            edit.putString("fmtPath", str3);
            edit.putString("innerfmtPath", str4);
            edit.putInt("nCommonID", i);
            edit.putInt("innernCommonID", i2);
            edit.putInt("nMyID", i3);
            edit.putInt("innernMyID", i4);
            edit.putString("rptUrl", str5);
            edit.putString("innerrptUrl", str6);
            a(edit);
        }
    }

    private static void a(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            editor.commit();
        }
    }
}
