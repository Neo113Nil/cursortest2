package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ho0 {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f6360c = false;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f6361d = false;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f6364g = 0;

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f6365a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f6359b = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static final v3.d f6362e = v3.g.d();

    /* renamed from: f, reason: collision with root package name */
    private static final Set<String> f6363f = new HashSet(Arrays.asList(new String[0]));

    public ho0(String str) {
        List<String> asList;
        if (l()) {
            String[] strArr = new String[1];
            String valueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
            asList = Arrays.asList(strArr);
        } else {
            asList = new ArrayList<>();
        }
        this.f6365a = asList;
    }

    static /* synthetic */ void a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        s(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(v3.b.a(bArr));
        }
        jsonWriter.endObject();
    }

    static /* synthetic */ void b(int i7, Map map, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i7);
        jsonWriter.endObject();
        s(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void i() {
        synchronized (f6359b) {
            f6360c = false;
            f6361d = false;
            io0.g("Ad debug logging enablement is out of date.");
        }
    }

    public static void j(boolean z6) {
        synchronized (f6359b) {
            f6360c = true;
            f6361d = z6;
        }
    }

    public static boolean k(Context context) {
        if (Build.VERSION.SDK_INT < 17 || !y20.f14511a.e().booleanValue()) {
            return false;
        }
        try {
            return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
        } catch (Exception e7) {
            io0.h("Fail to determine debug setting.", e7);
            return false;
        }
    }

    public static boolean l() {
        boolean z6;
        synchronized (f6359b) {
            z6 = false;
            if (f6360c && f6361d) {
                z6 = true;
            }
        }
        return z6;
    }

    public static boolean m() {
        boolean z6;
        synchronized (f6359b) {
            z6 = f6360c;
        }
        return z6;
    }

    private static synchronized void n(String str) {
        synchronized (ho0.class) {
            io0.f("GMA Debug BEGIN");
            int i7 = 0;
            while (i7 < str.length()) {
                int i8 = i7 + 4000;
                String valueOf = String.valueOf(str.substring(i7, Math.min(i8, str.length())));
                io0.f(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i7 = i8;
            }
            io0.f("GMA Debug FINISH");
        }
    }

    private final void o(String str, go0 go0Var) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f6362e.b());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator<String> it = this.f6365a.iterator();
            while (it.hasNext()) {
                jsonWriter.value(it.next());
            }
            jsonWriter.endArray();
            go0Var.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e7) {
            io0.e("unable to log", e7);
        }
        n(stringWriter.toString());
    }

    private final void p(final String str) {
        o("onNetworkRequestError", new go0() { // from class: com.google.android.gms.internal.ads.do0
            @Override // com.google.android.gms.internal.ads.go0
            public final void a(JsonWriter jsonWriter) {
                String str2 = str;
                int i7 = ho0.f6364g;
                jsonWriter.name("params").beginObject();
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private final void q(final String str, final String str2, final Map<String, ?> map, final byte[] bArr) {
        o("onNetworkRequest", new go0() { // from class: com.google.android.gms.internal.ads.eo0
            @Override // com.google.android.gms.internal.ads.go0
            public final void a(JsonWriter jsonWriter) {
                ho0.a(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void r(final Map<String, ?> map, final int i7) {
        o("onNetworkResponse", new go0() { // from class: com.google.android.gms.internal.ads.co0
            @Override // com.google.android.gms.internal.ads.go0
            public final void a(JsonWriter jsonWriter) {
                ho0.b(i7, map, jsonWriter);
            }
        });
    }

    private static void s(JsonWriter jsonWriter, Map<String, ?> map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            if (!f6363f.contains(key)) {
                if (!(next.getValue() instanceof List)) {
                    if (!(next.getValue() instanceof String)) {
                        io0.d("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(key);
                    jsonWriter.name("value").value((String) next.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str : (List) next.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(key);
                        jsonWriter.name("value").value(str);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void c(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (l()) {
            q(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void d(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (l()) {
            q(str, "GET", map, bArr);
        }
    }

    public final void e(HttpURLConnection httpURLConnection, int i7) {
        if (l()) {
            String str = null;
            r(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i7);
            if (i7 < 200 || i7 >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e7) {
                    String valueOf = String.valueOf(e7.getMessage());
                    io0.g(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                p(str);
            }
        }
    }

    public final void f(Map<String, ?> map, int i7) {
        if (l()) {
            r(map, i7);
            if (i7 < 200 || i7 >= 300) {
                p(null);
            }
        }
    }

    public final void g(String str) {
        if (l() && str != null) {
            h(str.getBytes());
        }
    }

    public final void h(final byte[] bArr) {
        o("onNetworkResponseBody", new go0() { // from class: com.google.android.gms.internal.ads.fo0
            @Override // com.google.android.gms.internal.ads.go0
            public final void a(JsonWriter jsonWriter) {
                String str;
                byte[] bArr2 = bArr;
                int i7 = ho0.f6364g;
                jsonWriter.name("params").beginObject();
                int length = bArr2.length;
                String a7 = v3.b.a(bArr2);
                if (length >= 10000) {
                    a7 = bo0.e(a7);
                    str = a7 != null ? "bodydigest" : "body";
                    jsonWriter.name("bodylength").value(length);
                    jsonWriter.endObject();
                }
                jsonWriter.name(str).value(a7);
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }
}
