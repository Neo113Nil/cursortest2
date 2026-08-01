package com.bytedance.sdk.openadsdk.multipro.Jd;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.sUS.pvs.sUS;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.so;
import java.util.HashSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: SPMultiHelper.java */
/* loaded from: classes2.dex */
public class pvs {
    public static HashSet<String> pvs = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.multipro.Jd.pvs.1
        {
            add("did");
            add("app_id");
            add("global_coppa");
            add("tt_gdpr");
            add("global_ccpa");
            add("keywords");
            add("extra_data");
            add("gaid");
            add("sdk_app_sha1");
            add("uuid");
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };

    public static boolean pvs() {
        if (mnm.pvs() != null) {
            return true;
        }
        Ju.icD("The context of SPHelper is null, please initialize sdk in main process");
        return false;
    }

    private static sUS icD() {
        try {
            if (pvs()) {
                return com.bytedance.sdk.openadsdk.multipro.pvs.pvs.pvs(mnm.pvs());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Context vG() {
        return mnm.pvs();
    }

    private static String Jd() {
        return com.bytedance.sdk.openadsdk.multipro.Jd.icD + "/t_sp/";
    }

    private static String icD(String str) {
        return TextUtils.isEmpty(str) ? "" : "?sp_file_name=".concat(String.valueOf(str));
    }

    public static synchronized void pvs(String str, String str2, Boolean bool) {
        synchronized (pvs.class) {
            if (pvs()) {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                        icD.pvs(vG(), str, str2, bool);
                        return;
                    }
                    sUS icD = icD();
                    if (icD != null) {
                        Uri parse = Uri.parse(Jd() + "boolean/" + str2 + icD(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", bool);
                        icD.pvs(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void pvs(String str, String str2, String str3) {
        synchronized (pvs.class) {
            if (pvs()) {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                        icD.pvs(vG(), str, str2, str3);
                        return;
                    }
                    sUS icD = icD();
                    if (icD != null) {
                        Uri parse = Uri.parse(Jd() + "string/" + str2 + icD(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", str3);
                        icD.pvs(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void pvs(String str, String str2, Integer num) {
        synchronized (pvs.class) {
            if (pvs()) {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                        icD.pvs(vG(), str, str2, num);
                        return;
                    }
                    sUS icD = icD();
                    if (icD != null) {
                        Uri parse = Uri.parse(Jd() + "int/" + str2 + icD(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", num);
                        icD.pvs(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void pvs(String str, String str2, Long l) {
        synchronized (pvs.class) {
            if (pvs()) {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                        icD.pvs(vG(), str, str2, l);
                        return;
                    }
                    sUS icD = icD();
                    if (icD != null) {
                        Uri parse = Uri.parse(Jd() + "long/" + str2 + icD(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", l);
                        icD.pvs(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void pvs(String str, String str2, Float f) {
        synchronized (pvs.class) {
            if (pvs()) {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                        icD.pvs(vG(), str, str2, f);
                        return;
                    }
                    sUS icD = icD();
                    if (icD != null) {
                        Uri parse = Uri.parse(Jd() + "float/" + str2 + icD(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", f);
                        icD.pvs(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static String icD(String str, String str2, String str3) {
        String pvs2;
        if (!pvs()) {
            return str3;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            return pvs(vG(), str, str2, str3);
        }
        sUS icD = icD();
        return (icD == null || (pvs2 = icD.pvs(Uri.parse(new StringBuilder().append(Jd()).append("string/").append(str2).append(icD(str)).toString()))) == null || pvs2.equals(AbstractJsonLexerKt.NULL)) ? str3 : pvs2;
    }

    protected static String pvs(Context context, String str, String str2, String str3) {
        String pvs2 = pvs(str, str2);
        if (so.NB(pvs2)) {
            return com.bytedance.sdk.component.icD.pvs(context, pvs2).pvs(str2, str3);
        }
        SharedPreferences pvs3 = icD.pvs(context, pvs2);
        return pvs3 == null ? str3 : pvs3.getString(str2, str3);
    }

    public static String pvs(String str, String str2) {
        return pvs.contains(str2) ? "pag_sp_bad_par" : str;
    }

    public static int pvs(String str, String str2, int i) {
        String pvs2;
        if (!pvs()) {
            return i;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            return pvs(vG(), str, str2, i);
        }
        sUS icD = icD();
        if (icD != null && (pvs2 = icD.pvs(Uri.parse(Jd() + "int/" + str2 + icD(str)))) != null && !pvs2.equals(AbstractJsonLexerKt.NULL)) {
            return Integer.parseInt(pvs2);
        }
        return i;
    }

    protected static int pvs(Context context, String str, String str2, int i) {
        String pvs2 = pvs(str, str2);
        if (so.NB(pvs2)) {
            return com.bytedance.sdk.component.icD.pvs(context, pvs2).pvs(str2, i);
        }
        SharedPreferences pvs3 = icD.pvs(context, pvs2);
        return pvs3 == null ? i : pvs3.getInt(str2, i);
    }

    protected static float pvs(Context context, String str, String str2, float f) {
        String pvs2 = pvs(str, str2);
        if (so.NB(pvs2)) {
            return com.bytedance.sdk.component.icD.pvs(context, pvs2).pvs(str2, f);
        }
        SharedPreferences pvs3 = icD.pvs(context, pvs2);
        return pvs3 == null ? f : pvs3.getFloat(str2, f);
    }

    public static boolean pvs(String str, String str2, boolean z) {
        String pvs2;
        if (!pvs()) {
            return z;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            return pvs(vG(), str, str2, z);
        }
        sUS icD = icD();
        if (icD != null && (pvs2 = icD.pvs(Uri.parse(Jd() + "boolean/" + str2 + icD(str)))) != null && !pvs2.equals(AbstractJsonLexerKt.NULL)) {
            return Boolean.parseBoolean(pvs2);
        }
        return z;
    }

    protected static boolean pvs(Context context, String str, String str2, boolean z) {
        String pvs2 = pvs(str, str2);
        if (so.NB(pvs2)) {
            return com.bytedance.sdk.component.icD.pvs(context, pvs2).pvs(str2, z);
        }
        SharedPreferences pvs3 = icD.pvs(context, pvs2);
        return pvs3 == null ? z : pvs3.getBoolean(str2, z);
    }

    public static long pvs(String str, String str2, long j) {
        String pvs2;
        if (!pvs()) {
            return j;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            return pvs(vG(), str, str2, j);
        }
        sUS icD = icD();
        if (icD != null && (pvs2 = icD.pvs(Uri.parse(Jd() + "long/" + str2 + icD(str)))) != null && !pvs2.equals(AbstractJsonLexerKt.NULL)) {
            return Long.parseLong(pvs2);
        }
        return j;
    }

    protected static long pvs(Context context, String str, String str2, long j) {
        String pvs2 = pvs(str, str2);
        if (so.NB(pvs2)) {
            return com.bytedance.sdk.component.icD.pvs(context, pvs2).pvs(str2, j);
        }
        SharedPreferences pvs3 = icD.pvs(context, pvs2);
        return pvs3 == null ? j : pvs3.getLong(str2, j);
    }

    public static void icD(String str, String str2) {
        if (pvs()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                    icD.icD(vG(), str, str2);
                    return;
                }
                sUS icD = icD();
                if (icD != null) {
                    icD.pvs(Uri.parse(Jd() + "long/" + str2 + icD(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void pvs(String str) {
        if (pvs()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                    icD.icD(vG(), str);
                    return;
                }
                sUS icD = icD();
                if (icD != null) {
                    icD.pvs(Uri.parse(Jd() + "clean" + icD(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
