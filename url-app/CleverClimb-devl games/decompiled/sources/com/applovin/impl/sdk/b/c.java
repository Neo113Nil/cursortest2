package com.applovin.impl.sdk.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.e.i;
import com.applovin.impl.sdk.e.l;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkSettings;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected final j f3003a;

    /* renamed from: b, reason: collision with root package name */
    protected final p f3004b;

    /* renamed from: c, reason: collision with root package name */
    protected final Context f3005c;

    /* renamed from: d, reason: collision with root package name */
    protected final SharedPreferences f3006d;
    private final Map<String, Object> e = new HashMap();
    private Map<String, Object> f;

    public c(j jVar) {
        this.f3003a = jVar;
        this.f3004b = jVar.u();
        this.f3005c = jVar.w();
        this.f3006d = this.f3005c.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Field a2 = l.a(jVar.l().getClass(), "localSettings");
            a2.setAccessible(true);
            this.f = (HashMap) a2.get(jVar.l());
        } catch (Throwable unused) {
        }
    }

    private static Object a(String str, JSONObject jSONObject, Object obj) throws JSONException {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }

    private <T> T c(b<T> bVar) {
        try {
            return bVar.a(this.f.get(bVar.a()));
        } catch (Throwable unused) {
            return null;
        }
    }

    private String e() {
        return "com.applovin.sdk." + l.a(this.f3003a.s()) + ".";
    }

    public <ST> b<ST> a(String str, b<ST> bVar) {
        Iterator<b<?>> it = b.c().iterator();
        while (it.hasNext()) {
            b<ST> bVar2 = (b) it.next();
            if (bVar2.a().equals(str)) {
                return bVar2;
            }
        }
        return bVar;
    }

    public <T> T a(b<T> bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        synchronized (this.e) {
            try {
                try {
                    T t = (T) c(bVar);
                    if (t != null) {
                        return t;
                    }
                    Object obj = this.e.get(bVar.a());
                    if (obj != null) {
                        return bVar.a(obj);
                    }
                    return bVar.b();
                } catch (Throwable unused) {
                    this.f3003a.u().d("SettingsManager", "Unable to retrieve value for setting " + bVar.a() + "; using default...");
                    return bVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        if (this.f3005c == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f3004b.b("SettingsManager", "Saving settingsValues with the application...");
        String e = e();
        synchronized (this.e) {
            boolean booleanValue = ((Boolean) this.f3003a.a(b.fn)).booleanValue();
            SharedPreferences.Editor edit = this.f3006d.edit();
            for (b<?> bVar : b.c()) {
                Object obj = this.e.get(bVar.a());
                if (obj != null) {
                    String str = e + bVar.a();
                    if (booleanValue) {
                        this.f3003a.a(str, (String) obj, edit);
                    } else {
                        this.f3003a.a(str, (String) obj, this.f3006d);
                    }
                }
            }
            if (booleanValue) {
                edit.apply();
            }
        }
        this.f3004b.a("SettingsManager", "Settings saved with the application.");
    }

    public <T> void a(b<?> bVar, Object obj) {
        if (bVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj == null) {
            throw new IllegalArgumentException("No new value specified");
        }
        synchronized (this.e) {
            this.e.put(bVar.a(), obj);
        }
        this.f3004b.a("SettingsManager", "Setting update: " + bVar.a() + " set to \"" + obj + "\"");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008a A[Catch: all -> 0x015d, TryCatch #0 {, blocks: (B:8:0x000f, B:10:0x001f, B:11:0x0032, B:15:0x0042, B:16:0x0048, B:17:0x0063, B:18:0x007a, B:20:0x008a, B:23:0x0096, B:25:0x009e, B:26:0x00ac, B:27:0x00b7, B:29:0x00c7, B:32:0x00d3, B:34:0x00db, B:35:0x00e5, B:37:0x00eb, B:40:0x00ff, B:42:0x010b, B:44:0x0113, B:52:0x011c, B:65:0x0130, B:66:0x013d, B:68:0x015b, B:73:0x006d), top: B:7:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7 A[Catch: all -> 0x015d, TryCatch #0 {, blocks: (B:8:0x000f, B:10:0x001f, B:11:0x0032, B:15:0x0042, B:16:0x0048, B:17:0x0063, B:18:0x007a, B:20:0x008a, B:23:0x0096, B:25:0x009e, B:26:0x00ac, B:27:0x00b7, B:29:0x00c7, B:32:0x00d3, B:34:0x00db, B:35:0x00e5, B:37:0x00eb, B:40:0x00ff, B:42:0x010b, B:44:0x0113, B:52:0x011c, B:65:0x0130, B:66:0x013d, B:68:0x015b, B:73:0x006d), top: B:7:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(AppLovinSdkSettings appLovinSdkSettings) {
        Map<String, Object> map;
        String a2;
        boolean z;
        boolean z2;
        boolean z3;
        this.f3004b.b("SettingsManager", "Loading user-defined settings");
        if (appLovinSdkSettings == null) {
            return;
        }
        synchronized (this.e) {
            if (((Boolean) this.f3003a.a(b.P)).booleanValue()) {
                this.e.put(b.P.a(), Boolean.valueOf(appLovinSdkSettings.isVerboseLoggingEnabled()));
            }
            long bannerAdRefreshSeconds = appLovinSdkSettings.getBannerAdRefreshSeconds();
            boolean z4 = false;
            if (bannerAdRefreshSeconds >= 0) {
                this.e.put(b.ct.a(), Long.valueOf(bannerAdRefreshSeconds > 0 ? Math.max(30L, bannerAdRefreshSeconds) : 0L));
                map = this.e;
                a2 = b.cs.a();
                z = true;
            } else {
                if (bannerAdRefreshSeconds == -1) {
                    map = this.e;
                    a2 = b.cs.a();
                    z = false;
                }
                if (((Boolean) this.f3003a.a(b.bj)).booleanValue()) {
                    String autoPreloadSizes = appLovinSdkSettings.getAutoPreloadSizes();
                    if (!i.b(autoPreloadSizes)) {
                        autoPreloadSizes = "NONE";
                    }
                    if (autoPreloadSizes.equals("NONE")) {
                        this.e.put(b.aJ.a(), "");
                    } else {
                        this.e.put(b.aJ.a(), autoPreloadSizes);
                    }
                }
                if (((Boolean) this.f3003a.a(b.bk)).booleanValue()) {
                    String autoPreloadTypes = appLovinSdkSettings.getAutoPreloadTypes();
                    if (!i.b(autoPreloadTypes)) {
                        autoPreloadTypes = "NONE";
                    }
                    if ("NONE".equals(autoPreloadTypes)) {
                        z2 = false;
                        z3 = false;
                    } else {
                        z2 = false;
                        z3 = false;
                        for (String str : com.applovin.impl.sdk.e.c.a(autoPreloadTypes)) {
                            if (str.equals(AppLovinAdType.REGULAR.getLabel())) {
                                z4 = true;
                            } else {
                                if (!str.equals(AppLovinAdType.INCENTIVIZED.getLabel()) && !str.contains("INCENT") && !str.contains("REWARD")) {
                                    if (str.equals(AppLovinAdType.NATIVE.getLabel())) {
                                        z3 = true;
                                    }
                                }
                                z2 = true;
                            }
                        }
                    }
                    if (!z4) {
                        this.e.put(b.aJ.a(), "");
                    }
                    this.e.put(b.aK.a(), Boolean.valueOf(z2));
                    this.e.put(b.aL.a(), Boolean.valueOf(z3));
                }
            }
            map.put(a2, z);
            if (((Boolean) this.f3003a.a(b.bj)).booleanValue()) {
            }
            if (((Boolean) this.f3003a.a(b.bk)).booleanValue()) {
            }
        }
    }

    public void a(JSONObject jSONObject) {
        p pVar;
        String str;
        String str2;
        this.f3004b.a("SettingsManager", "Loading settingsValues from JSON array...");
        synchronized (this.e) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && next.length() > 0) {
                    try {
                        b<Long> a2 = a(next, (b) null);
                        if (a2 != null) {
                            Object a3 = a(next, jSONObject, a2.b());
                            this.e.put(a2.a(), a3);
                            if (a2 == b.eW) {
                                this.e.put(b.eX.a(), Long.valueOf(System.currentTimeMillis()));
                            }
                            this.f3004b.a("SettingsManager", "Setting update: " + a2.a() + " set to \"" + a3 + "\"");
                        } else {
                            this.f3004b.c("SettingsManager", "Unknown setting recieved: " + next);
                        }
                    } catch (JSONException e) {
                        e = e;
                        pVar = this.f3004b;
                        str = "SettingsManager";
                        str2 = "Unable to parse JSON settingsValues array";
                        pVar.b(str, str2, e);
                    } catch (Throwable th) {
                        e = th;
                        pVar = this.f3004b;
                        str = "SettingsManager";
                        str2 = "Unable to convert setting object ";
                        pVar.b(str, str2, e);
                    }
                }
            }
        }
    }

    public List<String> b(b<String> bVar) {
        return com.applovin.impl.sdk.e.c.a((String) a(bVar));
    }

    public void b() {
        if (this.f3005c == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f3004b.b("SettingsManager", "Loading settingsValues saved with the application...");
        String e = e();
        synchronized (this.e) {
            for (b<?> bVar : b.c()) {
                try {
                    Object a2 = this.f3003a.a(e + bVar.a(), null, bVar.b().getClass(), this.f3006d);
                    if (a2 != null) {
                        this.e.put(bVar.a(), a2);
                    }
                } catch (Exception e2) {
                    this.f3004b.b("SettingsManager", "Unable to load \"" + bVar.a() + "\"", e2);
                }
            }
        }
    }

    public void c() {
        synchronized (this.e) {
            this.e.clear();
        }
        this.f3003a.a(this.f3006d);
    }

    public boolean d() {
        return this.f3003a.l().isVerboseLoggingEnabled() || ((Boolean) a(b.P)).booleanValue();
    }
}
