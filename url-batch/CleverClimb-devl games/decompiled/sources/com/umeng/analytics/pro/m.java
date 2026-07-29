package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.i;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: EventTracker.java */
/* loaded from: classes2.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8944a = "fs_lc_tl";
    private static final String f = "-1";
    private static Context g;

    /* renamed from: b, reason: collision with root package name */
    private final int f8945b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8946c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8947d;
    private final int e;
    private JSONObject h;

    private m() {
        this.f8945b = 128;
        this.f8946c = 256;
        this.f8947d = 1024;
        this.e = 10;
        this.h = null;
        try {
            if (this.h == null) {
                b(g);
            }
        } catch (Throwable unused) {
        }
    }

    /* compiled from: EventTracker.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final m f8948a = new m();

        private a() {
        }
    }

    public static m a(Context context) {
        if (g == null && context != null) {
            g = context.getApplicationContext();
        }
        return a.f8948a;
    }

    public void a(String str, Map<String, Object> map, long j) {
        try {
            if (!a(str)) {
                UMConfigure.umDebugLog.aq("A_10005", 0, "\\|");
                return;
            }
            if (b(map)) {
                if (Arrays.asList(b.as).contains(str)) {
                    MLog.e("the id is valid!");
                    UMConfigure.umDebugLog.aq("A_10001", 0, "\\|");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", System.currentTimeMillis());
                if (j > 0) {
                    jSONObject.put(b.R, j);
                }
                jSONObject.put("__t", g.f8906a);
                Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                for (int i = 0; i < 10 && it.hasNext(); i++) {
                    Map.Entry<String, Object> next = it.next();
                    if (!Arrays.asList(b.as).contains(next.getKey())) {
                        Object value = next.getValue();
                        if ((value instanceof String) || (value instanceof Integer) || (value instanceof Long)) {
                            jSONObject.put(next.getKey(), value);
                        }
                    } else {
                        MLog.e("the key in map is invalid.  ");
                        UMConfigure.umDebugLog.aq("A_10004", 0, "\\|");
                    }
                }
                String c2 = o.a().c();
                if (TextUtils.isEmpty(c2)) {
                    c2 = f;
                }
                jSONObject.put("__i", c2);
                UMWorkDispatch.sendEvent(g, 4097, CoreProtocol.getInstance(g), jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    public void a(String str, String str2, long j, int i) {
        try {
            if (a(str) && b(str2)) {
                if (Arrays.asList(b.as).contains(str)) {
                    MLog.e("the id is valid!");
                    UMConfigure.umDebugLog.aq("A_10022", 0, "\\|");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", System.currentTimeMillis());
                if (j > 0) {
                    jSONObject.put(b.R, j);
                }
                jSONObject.put("__t", g.f8906a);
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put(str, str2);
                String c2 = o.a().c();
                if (TextUtils.isEmpty(c2)) {
                    c2 = f;
                }
                jSONObject.put("__i", c2);
                UMWorkDispatch.sendEvent(g, 4097, CoreProtocol.getInstance(g), jSONObject);
                return;
            }
            UMConfigure.umDebugLog.aq("A_10021", 0, "\\|");
        } catch (Throwable unused) {
        }
    }

    public void a(Object obj) {
        try {
            i.d dVar = (i.d) obj;
            String c2 = dVar.c();
            Map<String, Object> a2 = dVar.a();
            String b2 = dVar.b();
            long d2 = dVar.d();
            if (TextUtils.isEmpty(c2)) {
                return;
            }
            String subStr = HelperUtils.subStr(c2, 128);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(b.aa, subStr);
            jSONObject.put("_$!ts", d2);
            String c3 = o.a().c();
            if (TextUtils.isEmpty(c3)) {
                c3 = f;
            }
            jSONObject.put("__ii", c3);
            if (!TextUtils.isEmpty(b2)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(b2);
                    if (jSONObject2.length() > 0) {
                        jSONObject.put(b.ab, jSONObject2);
                    }
                } catch (JSONException unused) {
                }
            }
            a();
            if (a2 != null) {
                JSONObject a3 = a(a2);
                if (a3.length() > 0) {
                    Iterator<String> keys = a3.keys();
                    while (keys.hasNext()) {
                        try {
                            String next = keys.next();
                            if (!Arrays.asList(b.at).contains(next)) {
                                jSONObject.put(next, a3.get(next));
                            } else {
                                MLog.e("the key in map about track interface is invalid.  ");
                            }
                        } catch (Throwable th) {
                            MLog.e(th);
                        }
                    }
                }
            }
            if (this.h != null && this.h.has(subStr) && !((Boolean) this.h.get(subStr)).booleanValue()) {
                jSONObject.put(b.T, 1);
                this.h.put(subStr, true);
                c(g);
            }
            i.a(g).a(jSONObject, 0, false);
        } catch (Throwable unused2) {
        }
    }

    public void a(String str, Map<String, Object> map) {
        try {
            if (a(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put(b.R, 0);
                jSONObject.put("__t", g.f8907b);
                Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                for (int i = 0; i < 10 && it.hasNext(); i++) {
                    Map.Entry<String, Object> next = it.next();
                    if (!b.T.equals(next.getKey()) && !b.R.equals(next.getKey()) && !"id".equals(next.getKey()) && !"ts".equals(next.getKey())) {
                        Object value = next.getValue();
                        if ((value instanceof String) || (value instanceof Integer) || (value instanceof Long)) {
                            jSONObject.put(next.getKey(), value);
                        }
                    }
                }
                String c2 = o.a().c();
                if (TextUtils.isEmpty(c2)) {
                    c2 = f;
                }
                jSONObject.put("__i", c2);
                UMWorkDispatch.sendEvent(g, 4098, CoreProtocol.getInstance(g), jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    private void b(Context context) {
        try {
            String string = PreferenceWrapper.getDefault(context).getString(f8944a, null);
            if (!TextUtils.isEmpty(string)) {
                this.h = new JSONObject(string);
            }
            a();
        } catch (Exception unused) {
        }
    }

    private void a() {
        try {
            String imprintProperty = UMEnvelopeBuild.imprintProperty(g, "track_list", "");
            if (TextUtils.isEmpty(imprintProperty)) {
                return;
            }
            String[] split = imprintProperty.split("!");
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            if (this.h != null) {
                for (String str : split) {
                    String subStr = HelperUtils.subStr(str, 128);
                    if (this.h.has(subStr)) {
                        jSONObject.put(subStr, this.h.get(subStr));
                    }
                }
            }
            this.h = new JSONObject();
            if (split.length >= 10) {
                while (i < 10) {
                    a(split[i], jSONObject);
                    i++;
                }
            } else {
                while (i < split.length) {
                    a(split[i], jSONObject);
                    i++;
                }
            }
            c(g);
        } catch (Exception unused) {
        }
    }

    private void a(String str, JSONObject jSONObject) throws JSONException {
        String subStr = HelperUtils.subStr(str, 128);
        if (jSONObject.has(subStr)) {
            a(subStr, ((Boolean) jSONObject.get(subStr)).booleanValue());
        } else {
            a(subStr, false);
        }
    }

    private void a(String str, boolean z) {
        try {
            if (b.T.equals(str) || b.R.equals(str) || "id".equals(str) || "ts".equals(str) || this.h.has(str)) {
                return;
            }
            this.h.put(str, z);
        } catch (Exception unused) {
        }
    }

    private void c(Context context) {
        try {
            if (this.h != null) {
                PreferenceWrapper.getDefault(g).edit().putString(f8944a, this.h.toString()).commit();
            }
        } catch (Throwable unused) {
        }
    }

    public void a(List<String> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    a();
                    if (this.h == null) {
                        this.h = new JSONObject();
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            if (this.h == null) {
                                this.h = new JSONObject();
                            } else if (this.h.length() >= 5) {
                                break;
                            }
                            String str = list.get(i);
                            if (!TextUtils.isEmpty(str)) {
                                a(HelperUtils.subStr(str, 128), false);
                            }
                        }
                        c(g);
                        return;
                    }
                    if (this.h.length() >= 5) {
                        MLog.d("already setFistLaunchEvent, igone.");
                        return;
                    }
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        if (this.h.length() >= 5) {
                            MLog.d(" add setFistLaunchEvent over.");
                            return;
                        }
                        a(HelperUtils.subStr(list.get(i2), 128), false);
                    }
                    c(g);
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        UMConfigure.umDebugLog.aq("A_15019", 0, "\\|");
    }

    private JSONObject a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    String key = entry.getKey();
                    if (key != null) {
                        String subStr = HelperUtils.subStr(key, 128);
                        Object value = entry.getValue();
                        if (value != null) {
                            int i = 0;
                            if (value.getClass().isArray()) {
                                if (value instanceof int[]) {
                                    int[] iArr = (int[]) value;
                                    JSONArray jSONArray = new JSONArray();
                                    while (i < iArr.length) {
                                        jSONArray.put(iArr[i]);
                                        i++;
                                    }
                                    jSONObject.put(subStr, jSONArray);
                                } else if (value instanceof double[]) {
                                    double[] dArr = (double[]) value;
                                    JSONArray jSONArray2 = new JSONArray();
                                    while (i < dArr.length) {
                                        jSONArray2.put(dArr[i]);
                                        i++;
                                    }
                                    jSONObject.put(subStr, jSONArray2);
                                } else if (value instanceof long[]) {
                                    long[] jArr = (long[]) value;
                                    JSONArray jSONArray3 = new JSONArray();
                                    while (i < jArr.length) {
                                        jSONArray3.put(jArr[i]);
                                        i++;
                                    }
                                    jSONObject.put(subStr, jSONArray3);
                                } else if (value instanceof float[]) {
                                    float[] fArr = (float[]) value;
                                    JSONArray jSONArray4 = new JSONArray();
                                    while (i < fArr.length) {
                                        jSONArray4.put(fArr[i]);
                                        i++;
                                    }
                                    jSONObject.put(subStr, jSONArray4);
                                } else if (value instanceof short[]) {
                                    short[] sArr = (short[]) value;
                                    JSONArray jSONArray5 = new JSONArray();
                                    while (i < sArr.length) {
                                        jSONArray5.put((int) sArr[i]);
                                        i++;
                                    }
                                    jSONObject.put(subStr, jSONArray5);
                                }
                            } else if (value instanceof List) {
                                List list = (List) value;
                                JSONArray jSONArray6 = new JSONArray();
                                while (i < list.size()) {
                                    Object obj = list.get(i);
                                    if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                                        jSONArray6.put(list.get(i));
                                    }
                                    i++;
                                }
                                if (jSONArray6.length() > 0) {
                                    jSONObject.put(subStr, jSONArray6);
                                }
                            } else if (value instanceof String) {
                                jSONObject.put(subStr, HelperUtils.subStr(value.toString(), 256));
                            } else {
                                if (!(value instanceof Long) && !(value instanceof Integer) && !(value instanceof Float) && !(value instanceof Double) && !(value instanceof Short)) {
                                    MLog.e("The param has not support type. please check !");
                                }
                                jSONObject.put(subStr, value);
                            }
                        }
                    }
                } catch (Exception e) {
                    MLog.e(e);
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private boolean a(String str) {
        if (str != null) {
            try {
                int length = str.trim().getBytes().length;
                if (length > 0 && length <= 128) {
                    return true;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        MLog.e("Event id is empty or too long in tracking Event");
        return false;
    }

    private boolean b(String str) {
        if (str == null) {
            return true;
        }
        try {
            if (str.trim().getBytes().length <= 256) {
                return true;
            }
            MLog.e("Event label or value is empty or too long in tracking Event");
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean c(String str) {
        if (str == null) {
            UMConfigure.umDebugLog.aq("A_10121", 0, "\\|");
            return true;
        }
        if (str.trim().getBytes().length <= 1024) {
            UMConfigure.umDebugLog.aq("A_10122", 0, "\\|");
            return true;
        }
        MLog.e("DeepLink value too long in tracking Event.");
        return false;
    }

    private boolean b(Map<String, Object> map) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (!a(entry.getKey())) {
                            MLog.e("map has NULL key. please check!");
                            UMConfigure.umDebugLog.aq("A_10007", 0, "\\|");
                            return false;
                        }
                        if (entry.getValue() == null) {
                            UMConfigure.umDebugLog.aq("A_10008", 0, "\\|");
                            return false;
                        }
                        if (entry.getValue() instanceof String) {
                            if (b.aq.equals(entry.getKey())) {
                                if (!c(entry.getValue().toString())) {
                                    return false;
                                }
                            } else if (!b(entry.getValue().toString())) {
                                UMConfigure.umDebugLog.aq("A_10009", 0, "\\|");
                                return false;
                            }
                        }
                    }
                    return true;
                }
            } catch (Exception unused) {
                return true;
            }
        }
        MLog.e("map is null or empty in onEvent");
        UMConfigure.umDebugLog.aq("A_10006", 0, "\\|");
        return false;
    }
}
