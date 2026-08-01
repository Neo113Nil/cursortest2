package com.apm.insight.runtime;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.apm.insight.ICommonParams;
import com.apm.insight.l.v;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class d {
    private Context a;
    private ICommonParams b;
    private ICommonParams c;

    public d(Context context, ICommonParams iCommonParams) {
        this(context, iCommonParams, null);
    }

    public d(Context context, ICommonParams iCommonParams, d dVar) {
        this.a = context;
        this.b = iCommonParams;
        this.c = dVar == null ? null : dVar.b;
    }

    public static String a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || (obj = map.get(str)) == null) {
            return null;
        }
        return String.valueOf(obj);
    }

    public static boolean a(Map<String, Object> map) {
        return map == null || map.isEmpty() || !((map.containsKey("app_version") || map.containsKey("version_name")) && map.containsKey("version_code") && map.containsKey("update_version_code"));
    }

    public Map<String, Object> a() {
        Map<String, Object> b = b();
        if (a(b, "aid") == null) {
            b.put("aid", 4444);
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map<String, Object> b() {
        Map<String, Object> map;
        Throwable th;
        Map<String, Object> map2;
        try {
            ICommonParams iCommonParams = this.c;
            map2 = iCommonParams != null ? iCommonParams.getCommonParams() : new HashMap<>();
            try {
                map2.putAll(this.b.getCommonParams());
                th = null;
            } catch (Throwable th2) {
                map = map2;
                th = th2;
                Map<String, Object> map3 = map;
                th = th;
                map2 = map3;
                if (map2 == null) {
                }
                if (a(map2)) {
                }
                return map2;
            }
        } catch (Throwable th3) {
            th = th3;
            map = null;
        }
        if (map2 == null) {
            map2 = new HashMap<>(4);
            if (th != null) {
                try {
                    map2.put("err_info", v.a(th));
                } catch (Throwable unused) {
                }
            }
        }
        if (a(map2)) {
            try {
                String str = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 128).versionName;
                String str2 = (String) Class.forName(this.a.getPackageName() + ".BuildConfig").getDeclaredField("VERSION_NAME").get(null);
                if (str != null && !str.equals(str2)) {
                    map2.put("manifest_version", str);
                }
            } catch (Throwable unused2) {
            }
        } else {
            try {
                PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 128);
                map2.put("version_name", packageInfo.versionName);
                map2.put("version_code", Integer.valueOf(packageInfo.versionCode));
                if (map2.get("update_version_code") == null) {
                    Object obj = packageInfo.applicationInfo.metaData != null ? packageInfo.applicationInfo.metaData.get("UPDATE_VERSION_CODE") : null;
                    if (obj == null) {
                        obj = map2.get("version_code");
                    }
                    map2.put("update_version_code", obj);
                }
            } catch (Throwable unused3) {
                map2.put("version_name", com.apm.insight.l.a.d(this.a));
                map2.put("version_code", Integer.valueOf(com.apm.insight.l.a.e(this.a)));
                if (map2.get("update_version_code") == null) {
                    map2.put("update_version_code", map2.get("version_code"));
                }
            }
        }
        return map2;
    }

    public ICommonParams c() {
        return this.b;
    }

    public String d() {
        try {
            return this.b.getDeviceId();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String e() {
        try {
            return String.valueOf(this.b.getCommonParams().get("aid"));
        } catch (Throwable unused) {
            return "4444";
        }
    }

    public long f() {
        try {
            return this.b.getUserId();
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
