package com.bytedance.sdk.openadsdk.multipro.Jd;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.icD;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.core.so;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SPMultiHelperImpl.java */
/* loaded from: classes2.dex */
class icD {
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> pvs;

    public static SharedPreferences pvs(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(pvs(str), 0);
        } catch (Throwable th) {
            Ju.pvs("SPMultiHelperImpl", "getSharedPreferences error ", th.getMessage());
            return null;
        }
    }

    private static String pvs(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    private static Object pvs(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = pvs;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(pvs(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    private static void pvs(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = pvs;
        if (softReference == null || softReference.get() == null) {
            pvs = new SoftReference<>(new ConcurrentHashMap());
        }
        String pvs2 = pvs(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = pvs.get();
        if (concurrentHashMap.get(pvs2) == null) {
            concurrentHashMap.put(pvs2, new HashMap());
        }
        concurrentHashMap.get(pvs2).put(str2, obj);
    }

    private static void icD(String str) {
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = pvs;
        if (softReference == null || softReference.get() == null || (map = pvs.get().get(pvs(str))) == null) {
            return;
        }
        map.clear();
    }

    static synchronized <T> void pvs(Context context, String str, String str2, T t) {
        synchronized (icD.class) {
            String pvs2 = pvs.pvs(str, str2);
            if (so.NB(pvs2)) {
                com.bytedance.sdk.component.icD pvs3 = com.bytedance.sdk.component.icD.pvs(context, pvs2);
                if (t.equals(pvs(pvs2, str2))) {
                    return;
                }
                icD.vG icD = pvs3.icD();
                pvs(icD, str2, (Object) t);
                icD.apply();
                pvs(pvs2, str2, t);
                return;
            }
            SharedPreferences pvs4 = pvs(context, pvs2);
            if (pvs4 == null) {
                return;
            }
            if (t.equals(pvs(pvs2, str2))) {
                return;
            }
            SharedPreferences.Editor edit = pvs4.edit();
            pvs(edit, str2, t);
            edit.apply();
            pvs(pvs2, str2, t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static <T> void pvs(SharedPreferences.Editor editor, String str, T t) {
        if (t instanceof Integer) {
            editor.putInt(str, ((Integer) t).intValue());
        }
        if (t instanceof Long) {
            editor.putLong(str, ((Long) t).longValue());
        }
        if (t instanceof Float) {
            editor.putFloat(str, ((Float) t).floatValue());
        }
        if (t instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t).booleanValue());
        }
        if (t instanceof String) {
            editor.putString(str, (String) t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static <T> void pvs(icD.vG vGVar, String str, T t) {
        if (t instanceof Integer) {
            vGVar.putInt(str, ((Integer) t).intValue());
        }
        if (t instanceof Long) {
            vGVar.putLong(str, ((Long) t).longValue());
        }
        if (t instanceof Float) {
            vGVar.putFloat(str, ((Float) t).floatValue());
        }
        if (t instanceof Boolean) {
            vGVar.putBoolean(str, ((Boolean) t).booleanValue());
        }
        if (t instanceof String) {
            vGVar.putString(str, (String) t);
        }
    }

    static String pvs(Context context, String str, String str2, String str3) {
        Object pvs2 = pvs(str, str2);
        if (pvs2 != null) {
            return String.valueOf(pvs2);
        }
        Object icD = icD(context, str, str2, str3);
        pvs(str, str2, icD);
        return String.valueOf(icD);
    }

    private static Object icD(Context context, String str, String str2, String str3) {
        String pvs2 = pvs(str);
        if (!pvs(context, pvs2, str2)) {
            return null;
        }
        if (str3.equalsIgnoreCase(TypedValues.Custom.S_STRING)) {
            return pvs.pvs(context, pvs2, str2, (String) null);
        }
        if (str3.equalsIgnoreCase(TypedValues.Custom.S_BOOLEAN)) {
            return Boolean.valueOf(pvs.pvs(context, pvs2, str2, false));
        }
        if (str3.equalsIgnoreCase("int")) {
            return Integer.valueOf(pvs.pvs(context, pvs2, str2, 0));
        }
        if (str3.equalsIgnoreCase("long")) {
            return Long.valueOf(pvs.pvs(context, pvs2, str2, 0L));
        }
        if (str3.equalsIgnoreCase(TypedValues.Custom.S_FLOAT)) {
            return Float.valueOf(pvs.pvs(context, pvs2, str2, 0.0f));
        }
        if (str3.equalsIgnoreCase("string_set")) {
            return pvs.pvs(context, pvs2, str2, (String) null);
        }
        return null;
    }

    static boolean pvs(Context context, String str, String str2) {
        String pvs2 = pvs.pvs(str, str2);
        if (so.NB(pvs2)) {
            return com.bytedance.sdk.component.icD.pvs(context, pvs2).pvs(str2);
        }
        SharedPreferences pvs3 = pvs(context, pvs2);
        return pvs3 != null && pvs3.contains(str2);
    }

    public static void icD(Context context, String str, String str2) {
        try {
            String pvs2 = pvs.pvs(str, str2);
            if (so.NB(pvs2)) {
                com.bytedance.sdk.component.icD.pvs(context, pvs2).icD().remove(str2).apply();
                return;
            }
            SharedPreferences pvs3 = pvs(context, pvs2);
            if (pvs3 == null) {
                return;
            }
            SharedPreferences.Editor edit = pvs3.edit();
            edit.remove(str2);
            edit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = pvs;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            Map<String, Object> map = pvs.get().get(pvs(pvs2));
            if (map != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    static void icD(Context context, String str) {
        if (so.NB(str)) {
            com.bytedance.sdk.component.icD.pvs(context, str).icD().clear().apply();
            icD(str);
            return;
        }
        SharedPreferences pvs2 = pvs(context, str);
        if (pvs2 == null) {
            return;
        }
        SharedPreferences.Editor edit = pvs2.edit();
        edit.clear();
        edit.apply();
        icD(str);
    }

    static Map<String, ?> vG(Context context, String str) {
        SharedPreferences pvs2 = pvs(context, str);
        if (pvs2 == null) {
            return null;
        }
        return pvs2.getAll();
    }
}
