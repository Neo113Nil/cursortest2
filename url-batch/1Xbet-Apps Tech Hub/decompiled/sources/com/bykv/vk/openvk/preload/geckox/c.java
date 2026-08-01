package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import java.io.File;
import java.io.InputStream;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: GeckoHubUtil.java */
/* loaded from: classes.dex */
public final class c {
    static File a;
    static Context b;
    static String c;
    private static final Set<String> g = new HashSet(Arrays.asList("js", "css", "html", "ico", "jpeg", "jpg", "png", "gif", "woff", "svg", "ttf", "woff2", "webp", "otf", "sfnt"));
    INetWork d;
    private Map.Entry<String, JSONObject> e;
    private Map.Entry<String, JSONObject> f;

    /* synthetic */ c(byte b2) {
        this();
    }

    /* compiled from: GeckoHubUtil.java */
    static class a {
        private static c a = new c(0);
    }

    public static c a(Context context) {
        b = context;
        if (a == null) {
            a = new File(b.getCacheDir() + File.separator + "gecko");
        }
        return a.a;
    }

    public static c a() {
        return a.a;
    }

    private c() {
    }

    public static void a(String str) {
        c = str;
    }

    private static String b(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf("?");
        return indexOf == -1 ? str : str.substring(0, indexOf);
    }

    private JSONObject a(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                Map.Entry<String, JSONObject> entry = this.e;
                if (entry == null || !str.equals(entry.getKey())) {
                    String a2 = com.bykv.vk.openvk.preload.geckox.utils.c.a(new com.bykv.vk.openvk.preload.falconx.loader.a(b, "cca47107bfcbdb211d88f3385aeede40", a).getInputStream(str + "/manifest.json"));
                    if (TextUtils.isEmpty(a2)) {
                        return null;
                    }
                    this.e = new AbstractMap.SimpleEntry(str, new JSONObject(a2));
                }
                Map.Entry<String, JSONObject> entry2 = this.f;
                if (entry2 == null || !str.equals(entry2.getKey())) {
                    String a3 = com.bykv.vk.openvk.preload.geckox.utils.c.a(new com.bykv.vk.openvk.preload.falconx.loader.a(b, "cca47107bfcbdb211d88f3385aeede40", a).getInputStream(str + "/md5_url_map.json"));
                    if (TextUtils.isEmpty(a3)) {
                        return null;
                    }
                    this.f = new AbstractMap.SimpleEntry(str, new JSONObject(a3));
                }
                JSONObject value = this.e.getValue();
                JSONObject value2 = this.f.getValue();
                String a4 = a(str2, value2);
                if (value.has(a4)) {
                    JSONObject jSONObject = value.getJSONObject(a4);
                    a(value, a4, str2);
                    return jSONObject;
                }
                String b2 = b(str2);
                if (b2 == null) {
                    return null;
                }
                String a5 = a(b2, value2);
                if (value.has(a5)) {
                    JSONObject jSONObject2 = value.getJSONObject(a5);
                    a(value, a5, str2);
                    return jSONObject2;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static String a(String str, JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject(str).getString("md5");
        } catch (Throwable unused) {
            return "";
        }
    }

    private void a(JSONObject jSONObject, String str, String str2) {
        try {
            if ("once".equals(jSONObject.getJSONObject(str).optJSONObject("cacheStrategy").optString("hitStrategy"))) {
                jSONObject.remove(str);
                c(str2);
            }
        } catch (Throwable unused) {
        }
    }

    private void c(String str) {
        try {
            if (this.d == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.d.syncDoGet(str);
        } catch (Throwable unused) {
        }
    }

    public static com.bykv.vk.openvk.preload.falconx.loader.a b() {
        try {
            return new com.bykv.vk.openvk.preload.falconx.loader.a(b, "cca47107bfcbdb211d88f3385aeede40", a);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(ILoader iLoader) {
        if (iLoader != null) {
            try {
                iLoader.release();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0076, code lost:
    
        return new com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel(1, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WebResourceResponseModel a(ILoader iLoader, String str, String str2) {
        try {
            if (iLoader == null) {
                return new WebResourceResponseModel(-1, null);
            }
            boolean z = false;
            if (!TextUtils.isEmpty(str2) && !str2.matches("^https?:\\/\\/www\\.google-analytics\\.com/(?:ga|urchin|analytics)\\.js") && !str2.matches("^https?:\\/\\/www\\.googletagmanager\\.com\\/(gtag\\/js|gtm\\.js)") && !str2.matches("^https?:\\/\\/analytics\\.tiktok\\.com\\/i18n\\/pixel") && !str2.matches("https?:\\/\\/connect\\.facebook\\.net\\/(.*)\\/fbevents\\.js") && !str2.matches("https?:\\/\\/mc\\.yandex\\.ru\\/") && !str2.contains("jsonp") && !str2.contains("Callback") && !str2.contains("analytics.tiktok.com/i18n/pixel") && !str2.contains("google-analytics.com/analytics") && !str2.contains("connect.facebook.net") && !str2.contains("www.googletagmanager.com")) {
                z = true;
            }
            JSONObject a2 = a(str, str2);
            Set<String> set = g;
            String b2 = b(str2);
            int lastIndexOf = b2.lastIndexOf(".");
            int i = set.contains(lastIndexOf == -1 ? "" : b2.substring(lastIndexOf + 1)) ? 2 : -1;
            if (a2 == null) {
                return new WebResourceResponseModel(i, null);
            }
            String optString = a2.optString("fileName", null);
            if (optString == null) {
                return new WebResourceResponseModel(i, null);
            }
            JSONObject jSONObject = a2.has("respHeader") ? a2.getJSONObject("respHeader") : null;
            if (jSONObject == null) {
                return new WebResourceResponseModel(i, null);
            }
            String str3 = str + File.separator + optString;
            InputStream inputStream = !iLoader.exist(str3) ? null : iLoader.getInputStream(str3);
            if (inputStream == null) {
                return new WebResourceResponseModel(i, null);
            }
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return new WebResourceResponseModel(i, com.bykv.vk.openvk.preload.falconx.a.a.a(inputStream, hashMap));
        } catch (Throwable unused) {
            return new WebResourceResponseModel(-1, null);
        }
    }

    public static int a(ILoader iLoader, String str) {
        if (iLoader == null || str == null) {
            return 0;
        }
        try {
            com.bykv.vk.openvk.preload.falconx.loader.a aVar = new com.bykv.vk.openvk.preload.falconx.loader.a(b, "cca47107bfcbdb211d88f3385aeede40", a);
            String str2 = str + File.separator;
            if (aVar.b.get()) {
                throw new RuntimeException("released!");
            }
            com.bykv.vk.openvk.preload.geckox.f.b bVar = aVar.a;
            if (bVar.b.get()) {
                throw new RuntimeException("released");
            }
            if (TextUtils.isEmpty(str2)) {
                throw new RuntimeException("relativePath empty");
            }
            return bVar.a(str2.trim()).b(str2);
        } catch (Throwable unused) {
            return 0;
        }
    }
}
