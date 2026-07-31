package com.bytedance.sdk.openadsdk.kw.fb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.fs;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.phc;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.kgc;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public class zmn {
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> fs;
    public static HashSet<String> zmn = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.kw.fb.zmn.1
        {
            add("app_id");
            add("extra_data");
            add("sdk_app_sha1");
            add(CommonUrlParts.UUID);
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };

    private static String zmn(Context context, String str, String str2) {
        if (zmn.contains(str2)) {
            str = "pag_sp_bad_par";
        }
        if (phc.zmn(context)) {
            return str;
        }
        return str + "_" + phc.zn(context);
    }

    private static boolean zmn() {
        return kgc.zmn() == null;
    }

    private static String fs(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    public static void zmn(String str, String str2, Boolean bool) {
        if (zmn()) {
            return;
        }
        zmn(fs(str), str2, bool);
    }

    public static void zmn(String str, String str2, Long l) {
        if (zmn()) {
            return;
        }
        zmn(fs(str), str2, l);
    }

    public static void zmn(String str, String str2, String str3) {
        if (zmn()) {
            return;
        }
        zmn(fs(str), str2, str3);
    }

    public static void zmn(String str, String str2, Integer num) {
        if (zmn()) {
            return;
        }
        zmn(fs(str), str2, num);
    }

    public static int zmn(String str, String str2, int i) {
        return zmn() ? i : zmn(kgc.zmn(), fs(str), str2, i);
    }

    private static int zmn(Context context, String str, String str2, int i) {
        String zmn2 = zmn(context, str, str2);
        if (iv.nps(zmn2)) {
            return fs.zmn(context, zmn2).zmn(str2, i);
        }
        SharedPreferences zmn3 = zmn(context, zmn2);
        return zmn3 == null ? i : zmn3.getInt(str2, i);
    }

    public static boolean zmn(String str, String str2, boolean z) {
        return zmn() ? z : zmn(kgc.zmn(), fs(str), str2, z);
    }

    private static boolean zmn(Context context, String str, String str2, boolean z) {
        String zmn2 = zmn(context, str, str2);
        if (iv.nps(zmn2)) {
            return fs.zmn(context, zmn2).zmn(str2, z);
        }
        SharedPreferences zmn3 = zmn(context, zmn2);
        return zmn3 == null ? z : zmn3.getBoolean(str2, z);
    }

    public static long zmn(String str, String str2, long j) {
        return zmn() ? j : zmn(kgc.zmn(), fs(str), str2, j);
    }

    private static long zmn(Context context, String str, String str2, long j) {
        String zmn2 = zmn(context, str, str2);
        if (iv.nps(zmn2)) {
            return fs.zmn(context, zmn2).zmn(str2, j);
        }
        SharedPreferences zmn3 = zmn(context, zmn2);
        return zmn3 == null ? j : zmn3.getLong(str2, j);
    }

    public static String fs(String str, String str2, String str3) {
        return zmn() ? str3 : zmn(kgc.zmn(), fs(str), str2, str3);
    }

    private static String zmn(Context context, String str, String str2, String str3) {
        String zmn2 = zmn(context, str, str2);
        if (iv.nps(zmn2)) {
            return fs.zmn(context, zmn2).zmn(str2, str3);
        }
        SharedPreferences zmn3 = zmn(context, zmn2);
        return zmn3 == null ? str3 : zmn3.getString(str2, str3);
    }

    public static void zmn(String str, String str2) {
        if (zmn()) {
            return;
        }
        try {
            fs(kgc.zmn(), fs(str), str2);
        } catch (Throwable unused) {
        }
    }

    private static void fs(Context context, String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        try {
            String zmn2 = zmn(context, str, str2);
            if (iv.nps(zmn2)) {
                fs.zmn(context, zmn2).fs().remove(str2).apply();
                return;
            }
            SharedPreferences zmn3 = zmn(context, zmn2);
            if (zmn3 == null) {
                return;
            }
            SharedPreferences.Editor edit = zmn3.edit();
            edit.remove(str2);
            edit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = fs;
            if (softReference != null && (concurrentHashMap = softReference.get()) != null && (map = concurrentHashMap.get(fs(zmn2))) != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void zmn(String str) {
        if (zmn()) {
            return;
        }
        try {
            fs(kgc.zmn(), fs(str));
        } catch (Throwable unused) {
        }
    }

    private static void fs(Context context, String str) {
        String zmn2 = zmn(kgc.zmn(), str, "");
        if (iv.nps(zmn2)) {
            fs.zmn(context, zmn2).fs().clear().apply();
            zn(zmn2);
            return;
        }
        SharedPreferences zmn3 = zmn(context, zmn2);
        if (zmn3 == null) {
            return;
        }
        SharedPreferences.Editor edit = zmn3.edit();
        edit.clear();
        edit.apply();
        zn(zmn2);
    }

    private static <T> void zmn(String str, String str2, T t) {
        String zmn2 = zmn(kgc.zmn(), str, str2);
        if (iv.nps(zmn2)) {
            if (t.equals(fs(zmn2, str2))) {
                return;
            }
            fs.zn fs2 = fs.zmn(kgc.zmn(), fs(zmn2)).fs();
            zmn(fs2, str2, (Object) t);
            fs2.apply();
            fs(zmn2, str2, t);
            return;
        }
        SharedPreferences zmn3 = zmn(kgc.zmn(), fs(zmn2));
        if (zmn3 == null || t.equals(fs(zmn2, str2))) {
            return;
        }
        SharedPreferences.Editor edit = zmn3.edit();
        zmn(edit, str2, t);
        edit.apply();
        fs(zmn2, str2, t);
    }

    private static Object fs(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = fs;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(fs(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    private static void fs(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = fs;
        if (softReference == null || softReference.get() == null) {
            fs = new SoftReference<>(new ConcurrentHashMap());
        }
        String fs2 = fs(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = fs.get();
        if (concurrentHashMap == null) {
            return;
        }
        Map<String, Object> map = concurrentHashMap.get(fs2);
        if (map == null) {
            map = new HashMap<>();
            concurrentHashMap.put(fs2, map);
        }
        map.put(str2, obj);
    }

    private static void zn(String str) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = fs;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(fs(str))) == null) {
            return;
        }
        map.clear();
    }

    @Nullable
    public static SharedPreferences zmn(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(fs(str), 0);
        } catch (Throwable th) {
            iqz.zn("TTAD.TTSaveHelper", "getSharedPreferences error ", th.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void zmn(fs.zn znVar, String str, T t) {
        if (t instanceof Integer) {
            znVar.putInt(str, ((Integer) t).intValue());
        }
        if (t instanceof Long) {
            znVar.putLong(str, ((Long) t).longValue());
        }
        if (t instanceof Float) {
            znVar.putFloat(str, ((Float) t).floatValue());
        }
        if (t instanceof Boolean) {
            znVar.putBoolean(str, ((Boolean) t).booleanValue());
        }
        if (t instanceof String) {
            znVar.putString(str, (String) t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void zmn(SharedPreferences.Editor editor, String str, T t) {
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
}
