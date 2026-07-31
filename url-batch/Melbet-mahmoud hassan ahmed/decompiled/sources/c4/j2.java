package c4;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executor;
import k4.c;

/* loaded from: classes.dex */
final class j2 {

    /* renamed from: a, reason: collision with root package name */
    private final Application f1999a;

    /* renamed from: b, reason: collision with root package name */
    private final c f2000b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f2001c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f2002d;

    /* renamed from: e, reason: collision with root package name */
    private final m f2003e;

    /* renamed from: f, reason: collision with root package name */
    private final a0 f2004f;

    /* renamed from: g, reason: collision with root package name */
    private final h2 f2005g;

    /* renamed from: h, reason: collision with root package name */
    private final t2 f2006h;

    /* renamed from: i, reason: collision with root package name */
    private final y1 f2007i;

    j2(Application application, c cVar, Handler handler, Executor executor, m mVar, a0 a0Var, h2 h2Var, t2 t2Var, y1 y1Var) {
        this.f1999a = application;
        this.f2000b = cVar;
        this.f2001c = handler;
        this.f2002d = executor;
        this.f2003e = mVar;
        this.f2004f = a0Var;
        this.f2005g = h2Var;
        this.f2006h = t2Var;
        this.f2007i = y1Var;
    }

    private final a1 a(p0 p0Var) {
        try {
            return d(p0Var);
        } catch (SocketTimeoutException e7) {
            throw new e2(4, "The server timed out.", e7);
        } catch (IOException e8) {
            throw new e2(2, "Error making request.", e8);
        }
    }

    private final a1 d(p0 p0Var) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
        Application application = this.f1999a;
        httpURLConnection.setRequestProperty("User-Agent", Build.VERSION.SDK_INT >= 17 ? WebSettings.getDefaultUserAgent(application) : new WebView(application).getSettings().getUserAgentString());
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
        try {
            JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
            try {
                jsonWriter.beginObject();
                String str = p0Var.f2057a;
                if (str != null) {
                    jsonWriter.name("admob_app_id");
                    jsonWriter.value(str);
                }
                String str2 = p0Var.f2058b;
                if (str2 != null) {
                    jsonWriter.name("adid");
                    jsonWriter.value(str2);
                }
                t0 t0Var = p0Var.f2059c;
                if (t0Var != null) {
                    jsonWriter.name("device_info");
                    jsonWriter.beginObject();
                    int i7 = t0Var.f2103a;
                    if (i7 != w0.f2135a) {
                        jsonWriter.name("os_type");
                        w0.b(i7, jsonWriter);
                    }
                    String str3 = t0Var.f2104b;
                    if (str3 != null) {
                        jsonWriter.name("model");
                        jsonWriter.value(str3);
                    }
                    Integer num = t0Var.f2105c;
                    if (num != null) {
                        jsonWriter.name("android_api_level");
                        jsonWriter.value(num);
                    }
                    jsonWriter.endObject();
                }
                String str4 = p0Var.f2060d;
                if (str4 != null) {
                    jsonWriter.name("publisher_privacy_policy_url");
                    jsonWriter.value(str4);
                }
                String str5 = p0Var.f2061e;
                if (str5 != null) {
                    jsonWriter.name("language_code");
                    jsonWriter.value(str5);
                }
                String str6 = p0Var.f2062f;
                if (str6 != null) {
                    jsonWriter.name("country_code_if_unknown_region");
                    jsonWriter.value(str6);
                }
                Boolean bool = p0Var.f2063g;
                if (bool != null) {
                    jsonWriter.name("opt_out_if_unknown_region");
                    jsonWriter.value(bool.booleanValue());
                }
                Boolean bool2 = p0Var.f2064h;
                if (bool2 != null) {
                    jsonWriter.name("tag_for_under_age_of_consent");
                    jsonWriter.value(bool2.booleanValue());
                }
                Boolean bool3 = p0Var.f2065i;
                if (bool3 != null) {
                    jsonWriter.name("is_lat");
                    jsonWriter.value(bool3.booleanValue());
                }
                Map<String, String> map = p0Var.f2066j;
                if (!map.isEmpty()) {
                    jsonWriter.name("stored_infos_map");
                    jsonWriter.beginObject();
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        jsonWriter.name(entry.getKey());
                        jsonWriter.value(entry.getValue());
                    }
                    jsonWriter.endObject();
                }
                v0 v0Var = p0Var.f2067k;
                if (v0Var != null) {
                    jsonWriter.name("screen_info");
                    jsonWriter.beginObject();
                    Integer num2 = v0Var.f2131a;
                    if (num2 != null) {
                        jsonWriter.name("width");
                        jsonWriter.value(num2);
                    }
                    Integer num3 = v0Var.f2132b;
                    if (num3 != null) {
                        jsonWriter.name("height");
                        jsonWriter.value(num3);
                    }
                    Double d7 = v0Var.f2133c;
                    if (d7 != null) {
                        jsonWriter.name("density");
                        jsonWriter.value(d7);
                    }
                    List<y0> list = v0Var.f2134d;
                    if (!list.isEmpty()) {
                        jsonWriter.name("screen_insets");
                        jsonWriter.beginArray();
                        for (y0 y0Var : list) {
                            jsonWriter.beginObject();
                            Integer num4 = y0Var.f2157a;
                            if (num4 != null) {
                                jsonWriter.name("top");
                                jsonWriter.value(num4);
                            }
                            Integer num5 = y0Var.f2158b;
                            if (num5 != null) {
                                jsonWriter.name("left");
                                jsonWriter.value(num5);
                            }
                            Integer num6 = y0Var.f2159c;
                            if (num6 != null) {
                                jsonWriter.name("right");
                                jsonWriter.value(num6);
                            }
                            Integer num7 = y0Var.f2160d;
                            if (num7 != null) {
                                jsonWriter.name("bottom");
                                jsonWriter.value(num7);
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                }
                r0 r0Var = p0Var.f2068l;
                if (r0Var != null) {
                    jsonWriter.name("app_info");
                    jsonWriter.beginObject();
                    String str7 = r0Var.f2092a;
                    if (str7 != null) {
                        jsonWriter.name("package_name");
                        jsonWriter.value(str7);
                    }
                    String str8 = r0Var.f2093b;
                    if (str8 != null) {
                        jsonWriter.name("publisher_display_name");
                        jsonWriter.value(str8);
                    }
                    String str9 = r0Var.f2094c;
                    if (str9 != null) {
                        jsonWriter.name("version");
                        jsonWriter.value(str9);
                    }
                    jsonWriter.endObject();
                }
                x0 x0Var = p0Var.f2069m;
                if (x0Var != null) {
                    jsonWriter.name("sdk_info");
                    jsonWriter.beginObject();
                    String str10 = x0Var.f2153a;
                    if (str10 != null) {
                        jsonWriter.name("version");
                        jsonWriter.value(str10);
                    }
                    jsonWriter.endObject();
                }
                List<u0> list2 = p0Var.f2070n;
                if (!list2.isEmpty()) {
                    jsonWriter.name("debug_params");
                    jsonWriter.beginArray();
                    Iterator<u0> it = list2.iterator();
                    while (it.hasNext()) {
                        it.next().b(jsonWriter);
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
                jsonWriter.close();
                outputStreamWriter.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    String next = new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next();
                    StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 31);
                    sb.append("Http error code - ");
                    sb.append(responseCode);
                    sb.append(".\n");
                    sb.append(next);
                    throw new IOException(sb.toString());
                }
                String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                if (headerField != null) {
                    a1 a7 = a1.a(new JsonReader(new StringReader(headerField)));
                    a7.f1922b = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                    return a7;
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                try {
                    bufferedReader.readLine();
                    JsonReader jsonReader = new JsonReader(bufferedReader);
                    try {
                        a1 a8 = a1.a(jsonReader);
                        jsonReader.close();
                        bufferedReader.close();
                        return a8;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        m1.b(th, th2);
                    }
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th3) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th4) {
                m1.b(th3, th4);
            }
            throw th3;
        }
    }

    final void b(final Activity activity, final k4.d dVar, final c.b bVar, final c.a aVar) {
        this.f2002d.execute(new Runnable(this, activity, dVar, bVar, aVar) { // from class: c4.m2

            /* renamed from: f, reason: collision with root package name */
            private final j2 f2040f;

            /* renamed from: g, reason: collision with root package name */
            private final Activity f2041g;

            /* renamed from: h, reason: collision with root package name */
            private final k4.d f2042h;

            /* renamed from: i, reason: collision with root package name */
            private final c.b f2043i;

            /* renamed from: j, reason: collision with root package name */
            private final c.a f2044j;

            {
                this.f2040f = this;
                this.f2041g = activity;
                this.f2042h = dVar;
                this.f2043i = bVar;
                this.f2044j = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f2040f.e(this.f2041g, this.f2042h, this.f2043i, this.f2044j);
            }
        });
    }

    final /* synthetic */ void c(c.b bVar) {
        Handler handler = this.f2001c;
        bVar.getClass();
        handler.post(o2.a(bVar));
    }

    final /* synthetic */ void e(Activity activity, k4.d dVar, final c.b bVar, final c.a aVar) {
        try {
            k4.a a7 = dVar.a();
            if (a7 == null || !a7.b()) {
                String a8 = b1.a(this.f1999a);
                StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 95);
                sb.append("Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"");
                sb.append(a8);
                sb.append("\") to set this as a debug device.");
                Log.i("UserMessagingPlatform", sb.toString());
            }
            s2 a9 = new b(this.f2006h, a(this.f2005g.b(activity, dVar))).a();
            this.f2003e.b(a9.f2099a);
            this.f2003e.d(a9.f2100b);
            this.f2004f.a(a9.f2101c);
            this.f2007i.a().execute(new Runnable(this, bVar) { // from class: c4.l2

                /* renamed from: f, reason: collision with root package name */
                private final j2 f2032f;

                /* renamed from: g, reason: collision with root package name */
                private final c.b f2033g;

                {
                    this.f2032f = this;
                    this.f2033g = bVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f2032f.c(this.f2033g);
                }
            });
        } catch (e2 e7) {
            this.f2001c.post(new Runnable(aVar, e7) { // from class: c4.n2

                /* renamed from: f, reason: collision with root package name */
                private final c.a f2050f;

                /* renamed from: g, reason: collision with root package name */
                private final e2 f2051g;

                {
                    this.f2050f = aVar;
                    this.f2051g = e7;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f2050f.a(this.f2051g.a());
                }
            });
        } catch (RuntimeException e8) {
            String valueOf = String.valueOf(Log.getStackTraceString(e8));
            final e2 e2Var = new e2(1, valueOf.length() != 0 ? "Caught exception when trying to request consent info update: ".concat(valueOf) : new String("Caught exception when trying to request consent info update: "));
            this.f2001c.post(new Runnable(aVar, e2Var) { // from class: c4.q2

                /* renamed from: f, reason: collision with root package name */
                private final c.a f2089f;

                /* renamed from: g, reason: collision with root package name */
                private final e2 f2090g;

                {
                    this.f2089f = aVar;
                    this.f2090g = e2Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f2089f.a(this.f2090g.a());
                }
            });
        }
    }
}
