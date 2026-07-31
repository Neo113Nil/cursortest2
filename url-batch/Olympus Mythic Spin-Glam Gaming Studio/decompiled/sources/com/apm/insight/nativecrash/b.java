package com.apm.insight.nativecrash;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.apm.insight.ICommonParams;
import com.apm.insight.l.m;
import com.apm.insight.runtime.j;
import com.ironsource.C4913ua;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.t;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: NativeFileParser.java */
/* loaded from: classes13.dex */
public final class b {
    private Context a;
    private ICommonParams b;
    private ICommonParams c;

    /* compiled from: NativeFileParser.java */
    public static class c {
        protected File a;
        protected String b;
        protected String c;
        protected int d;

        public c(File file) {
            this.a = file;
        }

        public final int a() {
            int i;
            Throwable th;
            if (!this.a.exists() || !this.a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.a));
                int i2 = -1;
                do {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        i2 = a(readLine);
                    } catch (Throwable th2) {
                        th = th2;
                        i = i2;
                        bufferedReader = bufferedReader2;
                        try {
                            com.apm.insight.c.a();
                            j.a(th, "NPTH_CATCH");
                            return i;
                        } finally {
                            if (bufferedReader != null) {
                                com.apm.insight.a.a((Closeable) bufferedReader);
                            }
                        }
                    }
                } while (i2 == -1);
                com.apm.insight.a.a((Closeable) bufferedReader2);
                return i2;
            } catch (Throwable th3) {
                i = -1;
                th = th3;
            }
        }

        private int a(String str) {
            int i = this.d;
            if (!str.startsWith(this.b)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.c)[1].trim());
            } catch (NumberFormatException e) {
                com.apm.insight.c.a();
                j.a(e, "NPTH_CATCH");
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    /* compiled from: NativeFileParser.java */
    /* renamed from: com.apm.insight.nativecrash.b$b, reason: collision with other inner class name */
    public static class C0068b extends c {
        C0068b(File file) {
            super(file);
            this.b = "VmSize:";
            this.c = "\\s+";
            this.d = -1;
        }
    }

    /* compiled from: NativeFileParser.java */
    public static class f extends c {
        f(File file) {
            super(file);
            this.b = "Total Threads Count:";
            this.c = ":";
            this.d = -2;
        }
    }

    /* compiled from: NativeFileParser.java */
    public static class a extends c {
        a(File file) {
            super(file);
            this.b = "Total FD Count:";
            this.c = ":";
            this.d = -2;
        }
    }

    /* compiled from: NativeFileParser.java */
    public static class d extends c {
        d(File file) {
            super(file);
        }

        @NonNull
        public final HashMap<String, List<String>> b() {
            JSONArray a;
            String str;
            HashMap<String, List<String>> hashMap = new HashMap<>();
            try {
                a = com.apm.insight.l.f.a(this.a.getAbsolutePath());
            } catch (IOException unused) {
            } catch (Throwable th) {
                com.apm.insight.c.a();
                j.a(th, "NPTH_CATCH");
            }
            if (a == null) {
                return hashMap;
            }
            for (int i = 0; i < a.length(); i++) {
                String optString = a.optString(i);
                if (!TextUtils.isEmpty(optString) && optString.startsWith("[tid:0") && optString.endsWith("sigstack:0x0]")) {
                    int indexOf = optString.indexOf("[routine:0x");
                    int i2 = indexOf + 11;
                    int indexOf2 = optString.indexOf(93, i2);
                    if (indexOf > 0) {
                        str = optString.substring(i2, indexOf2);
                    } else {
                        str = "unknown addr";
                    }
                    List<String> list = hashMap.get(str);
                    if (list == null) {
                        list = new ArrayList<>();
                        hashMap.put(str, list);
                    }
                    list.add(optString);
                }
            }
            return hashMap;
        }
    }

    /* compiled from: NativeFileParser.java */
    public static class e extends c {
        e(File file) {
            super(file);
        }

        @NonNull
        public final JSONArray a(HashMap<String, List<String>> hashMap) {
            JSONArray a;
            int indexOf;
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (hashMap.isEmpty()) {
                return jSONArray;
            }
            try {
                a = com.apm.insight.l.f.a(this.a.getAbsolutePath());
            } catch (IOException unused) {
            } catch (Throwable th) {
                com.apm.insight.c.a();
                j.a(th, "NPTH_CATCH");
            }
            if (a == null) {
                return jSONArray;
            }
            for (int i = 0; i < a.length(); i++) {
                String optString = a.optString(i);
                if (!TextUtils.isEmpty(optString) && (indexOf = optString.indexOf(":")) > 2) {
                    String substring = optString.substring(2, indexOf);
                    if (hashMap.containsKey(substring) && (list = hashMap.get(substring)) != null) {
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            jSONArray.put(it.next() + " " + optString);
                        }
                        hashMap.remove(substring);
                    }
                }
            }
            Iterator<List<String>> it2 = hashMap.values().iterator();
            while (it2.hasNext()) {
                Iterator<String> it3 = it2.next().iterator();
                while (it3.hasNext()) {
                    jSONArray.put(it3.next() + "  0x000000:unknown");
                }
            }
            return jSONArray;
        }
    }

    @NonNull
    public static JSONArray a(File file, File file2) {
        return new e(file2).a(new d(file).b());
    }

    public static int a(String str) {
        return new a(com.apm.insight.l.j.b(str)).a();
    }

    public static int b(String str) {
        return new f(com.apm.insight.l.j.c(str)).a();
    }

    public static int c(String str) {
        return new C0068b(com.apm.insight.l.j.d(str)).a();
    }

    public b(Context context, ICommonParams iCommonParams) {
        this(context, iCommonParams, null);
    }

    public b(Context context, ICommonParams iCommonParams, b bVar) {
        this.a = context;
        this.b = iCommonParams;
        this.c = bVar == null ? null : bVar.b;
    }

    public final Map<String, Object> a() {
        Object obj;
        Map<String, Object> b = b();
        if (((b == null || (obj = b.get(C4913ua.b)) == null) ? null : String.valueOf(obj)) == null) {
            b.put(C4913ua.b, 4444);
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, Object> b() {
        Map<String, Object> map;
        Throwable th;
        Map<String, Object> map2;
        try {
            ICommonParams iCommonParams = this.c;
            if (iCommonParams != null) {
                map2 = iCommonParams.getCommonParams();
            } else {
                map2 = new HashMap<>();
            }
        } catch (Throwable th2) {
            th = th2;
            map = null;
        }
        try {
            map2.putAll(this.b.getCommonParams());
            th = null;
        } catch (Throwable th3) {
            map = map2;
            th = th3;
            Map<String, Object> map3 = map;
            th = th;
            map2 = map3;
            if (map2 == null) {
            }
            if (!a(map2)) {
            }
            return map2;
        }
        if (map2 == null) {
            map2 = new HashMap<>(4);
            if (th != null) {
                try {
                    map2.put("err_info", m.a(th));
                } catch (Throwable unused) {
                }
            }
        }
        if (!a(map2)) {
            try {
                PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 128);
                map2.put("version_name", packageInfo.versionName);
                map2.put("version_code", Integer.valueOf(packageInfo.versionCode));
                if (map2.get("update_version_code") == null) {
                    Bundle bundle = packageInfo.applicationInfo.metaData;
                    Object obj = bundle != null ? bundle.get("UPDATE_VERSION_CODE") : null;
                    if (obj == null) {
                        obj = map2.get("version_code");
                    }
                    map2.put("update_version_code", obj);
                }
            } catch (Throwable unused2) {
                map2.put("version_name", com.apm.insight.l.a.c(this.a));
                map2.put("version_code", Integer.valueOf(com.apm.insight.l.a.d(this.a)));
                if (map2.get("update_version_code") == null) {
                    map2.put("update_version_code", map2.get("version_code"));
                }
            }
        } else {
            try {
                String str = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 128).versionName;
                String str2 = (String) Class.forName(this.a.getPackageName() + ".BuildConfig").getDeclaredField(t.f).get(null);
                if (str != null && !str.equals(str2)) {
                    map2.put("manifest_version", str);
                }
            } catch (Throwable unused3) {
            }
        }
        return map2;
    }

    public static boolean a(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return ((map.containsKey("app_version") || map.containsKey("version_name")) && map.containsKey("version_code") && map.containsKey("update_version_code")) ? false : true;
    }

    @NonNull
    public final ICommonParams c() {
        return this.b;
    }

    public final String d() {
        try {
            return this.b.getDeviceId();
        } catch (Throwable unused) {
            return "";
        }
    }

    public final String e() {
        try {
            return String.valueOf(this.b.getCommonParams().get(C4913ua.b));
        } catch (Throwable unused) {
            return "4444";
        }
    }

    public final long f() {
        try {
            return this.b.getUserId();
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
