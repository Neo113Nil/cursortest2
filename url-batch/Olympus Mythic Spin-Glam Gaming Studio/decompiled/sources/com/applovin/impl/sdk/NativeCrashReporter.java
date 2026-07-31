package com.applovin.impl.sdk;

import com.applovin.impl.d2;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class NativeCrashReporter implements g.d {
    private static boolean b;
    private static boolean c;
    private static final NativeCrashReporter d = new NativeCrashReporter();
    private final HashMap a = new HashMap();

    private NativeCrashReporter() {
    }

    public static void a(k kVar) {
        if (kVar == null) {
            return;
        }
        if (!((Boolean) kVar.a(x4.q4)).booleanValue() && !n7.k(k.o())) {
            if (c) {
                try {
                    g l = kVar.l();
                    NativeCrashReporter nativeCrashReporter = d;
                    l.a(nativeCrashReporter);
                    nativeCrashReporter.disable();
                    return;
                } catch (Throwable th) {
                    kVar.O();
                    if (o.a()) {
                        kVar.O().a("NativeCrashReporter", "Failed to disable native crash reporter", th);
                    }
                    kVar.D().a("NativeCrashReporter", "disableInstance", th);
                    return;
                }
            }
            return;
        }
        if (a()) {
            List c2 = kVar.c(x4.r4);
            int[] iArr = new int[c2.size()];
            for (int i = 0; i < c2.size(); i++) {
                try {
                    iArr[i] = Integer.parseInt((String) c2.get(i));
                } catch (NumberFormatException unused) {
                }
            }
            File file = new File(k.o().getCacheDir(), "al-reports");
            if (file.exists()) {
                a(file, kVar);
            } else if (!file.mkdir()) {
                kVar.O();
                if (o.a()) {
                    kVar.O().b("NativeCrashReporter", "Failed to create reports directory");
                    return;
                }
                return;
            }
            try {
                NativeCrashReporter nativeCrashReporter2 = d;
                nativeCrashReporter2.enable(file.getAbsolutePath(), iArr, ((Boolean) kVar.a(x4.s4)).booleanValue());
                if (((Boolean) kVar.a(x4.t4)).booleanValue()) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(g.c.LOADING);
                    hashSet.add(g.c.LOAD);
                    hashSet.add(g.c.SHOW);
                    hashSet.add(g.c.CLICK);
                    hashSet.add(g.c.SHOW_ERROR);
                    hashSet.add(g.c.DESTROY);
                    kVar.l().a(nativeCrashReporter2, hashSet);
                }
            } catch (Throwable th2) {
                kVar.O();
                if (o.a()) {
                    kVar.O().a("NativeCrashReporter", "Failed to enable native crash reporter", th2);
                }
                kVar.D().a("NativeCrashReporter", "enableInstance", th2);
            }
        }
    }

    private native void disable();

    private native void enable(String str, int[] iArr, boolean z);

    private native void updateAdInfo(String str);

    private static boolean a() {
        if (!b) {
            b = true;
            try {
                System.loadLibrary("applovin-native-crash-reporter");
                c = true;
            } catch (Throwable th) {
                o.b("NativeCrashReporter", "Failed to load native crash reporter library", th);
            }
        }
        return c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:7|(2:9|(8:11|12|13|(1:15)(4:33|(4:36|(2:38|39)(2:41|42)|40|34)|43|44)|16|17|(2:19|(2:21|22)(1:24))(1:25)|23))|51|(1:53)|16|17|(0)(0)|23) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ec, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ed, code lost:
    
        r17.O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f4, code lost:
    
        if (com.applovin.impl.sdk.o.a() != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f6, code lost:
    
        r17.O().a("NativeCrashReporter", "Failed to delete native crash report: " + r6.getAbsolutePath(), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c8 A[Catch: all -> 0x00ec, TryCatch #0 {all -> 0x00ec, blocks: (B:17:0x00c2, B:19:0x00c8, B:21:0x00d1), top: B:16:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0110 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(File file, k kVar) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        int length = listFiles.length;
        for (int i = 0; i < length; i++) {
            File file2 = listFiles[i];
            String f = kVar.G().f(file2);
            if (StringUtils.isValidString(f)) {
                String[] split = f.split("@@@@@");
                if (split.length == 3) {
                    try {
                        String str = split[0];
                        String str2 = split[1];
                        JSONArray jSONArray = new JSONArray(split[2]);
                        if (jSONArray.length() == 0) {
                            kVar.D().a(d2.V0, str2, CollectionUtils.hashMap("error_message", str));
                        } else {
                            ArrayList arrayList = new ArrayList(jSONArray.length());
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
                                if (jSONObject != null) {
                                    HashMap<String, String> hashMap = CollectionUtils.hashMap("error_message", str);
                                    hashMap.put("source", str2);
                                    hashMap.putAll(JsonUtils.toStringMap(jSONObject));
                                    arrayList.add(hashMap);
                                }
                            }
                            kVar.D().a(d2.V0, arrayList, 0L);
                        }
                    } catch (Throwable th) {
                        kVar.O();
                        if (o.a()) {
                            kVar.O().a("NativeCrashReporter", "Failed to symbolicate native crash report", th);
                        }
                    }
                    if (file2.delete()) {
                        kVar.O();
                        if (o.a()) {
                            kVar.O().b("NativeCrashReporter", "Failed to delete native crash report: " + file2.getAbsolutePath());
                        }
                    }
                }
            }
            kVar.O();
            if (o.a()) {
                kVar.O().b("NativeCrashReporter", "Failed to read native crash error report: " + file2.getAbsolutePath());
            }
            if (file2.delete()) {
            }
        }
    }

    @Override // com.applovin.impl.sdk.g.d
    public void a(g.b bVar) {
        String h = bVar.h();
        if (bVar.i() == g.c.DESTROY) {
            this.a.remove(h);
        } else if (this.a.containsKey(h)) {
            JsonUtils.putString((JSONObject) this.a.get(h), "operation", bVar.i().toString());
        } else {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "ad_unit_id", bVar.a());
            JsonUtils.putString(jSONObject, "ad_format", bVar.g());
            JsonUtils.putString(jSONObject, BrandSafetyEvent.ad, bVar.c());
            JsonUtils.putString(jSONObject, "adapter_class", bVar.b());
            JsonUtils.putString(jSONObject, "adapter_version", bVar.d());
            JsonUtils.putString(jSONObject, "bcode", bVar.e());
            JsonUtils.putString(jSONObject, "creative_id", bVar.f());
            JsonUtils.putString(jSONObject, "operation", bVar.i().toString());
            this.a.put(h, jSONObject);
        }
        try {
            updateAdInfo(new JSONArray(this.a.values()).toString());
        } catch (Throwable unused) {
        }
    }
}
