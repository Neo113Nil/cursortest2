package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.aiming.mdt.utils.Constants;
import com.facebook.internal.ab;
import com.facebook.internal.ac;
import com.facebook.internal.r;
import com.facebook.p;
import com.google.android.gms.games.request.Requests;
import com.mopub.common.AdType;
import com.mopub.common.MoPubBrowser;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GraphRequest {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4699a = "GraphRequest";

    /* renamed from: b, reason: collision with root package name */
    private static String f4700b;

    /* renamed from: c, reason: collision with root package name */
    private static Pattern f4701c = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    private static volatile String q;

    /* renamed from: d, reason: collision with root package name */
    private AccessToken f4702d;
    private s e;
    private String f;
    private JSONObject g;
    private String h;
    private String i;
    private boolean j;
    private Bundle k;
    private b l;
    private String m;
    private Object n;
    private String o;
    private boolean p;

    public interface b {
        void a(q qVar);
    }

    public interface c {
        void a(JSONObject jSONObject, q qVar);
    }

    private interface d {
        void a(String str, String str2) throws IOException;
    }

    public interface e extends b {
        void a(long j, long j2);
    }

    public GraphRequest() {
        this(null, null, null, null, null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, s sVar, b bVar) {
        this(accessToken, str, bundle, sVar, bVar, null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, s sVar, b bVar, String str2) {
        this.j = true;
        this.p = false;
        this.f4702d = accessToken;
        this.f = str;
        this.o = str2;
        a(bVar);
        a(sVar);
        if (bundle != null) {
            this.k = new Bundle(bundle);
        } else {
            this.k = new Bundle();
        }
        if (this.o == null) {
            this.o = com.facebook.internal.z.d();
        }
    }

    public static GraphRequest a(AccessToken accessToken, final c cVar) {
        return new GraphRequest(accessToken, "me", null, null, new b() { // from class: com.facebook.GraphRequest.1
            @Override // com.facebook.GraphRequest.b
            public void a(q qVar) {
                if (c.this != null) {
                    c.this.a(qVar.b(), qVar);
                }
            }
        });
    }

    public static GraphRequest a(AccessToken accessToken, String str, JSONObject jSONObject, b bVar) {
        GraphRequest graphRequest = new GraphRequest(accessToken, str, null, s.POST, bVar);
        graphRequest.a(jSONObject);
        return graphRequest;
    }

    public static GraphRequest a(AccessToken accessToken, String str, b bVar) {
        return new GraphRequest(accessToken, str, null, null, bVar);
    }

    public final JSONObject a() {
        return this.g;
    }

    public final void a(JSONObject jSONObject) {
        this.g = jSONObject;
    }

    public final String b() {
        return this.f;
    }

    public final s c() {
        return this.e;
    }

    public final void a(s sVar) {
        if (this.m != null && sVar != s.GET) {
            throw new j("Can't change HTTP method on request with overridden URL.");
        }
        if (sVar == null) {
            sVar = s.GET;
        }
        this.e = sVar;
    }

    public final String d() {
        return this.o;
    }

    public final void a(boolean z) {
        this.p = z;
    }

    public final Bundle e() {
        return this.k;
    }

    public final void a(Bundle bundle) {
        this.k = bundle;
    }

    public final AccessToken f() {
        return this.f4702d;
    }

    public final b g() {
        return this.l;
    }

    public final void a(final b bVar) {
        if (l.a(u.GRAPH_API_DEBUG_INFO) || l.a(u.GRAPH_API_DEBUG_WARNING)) {
            this.l = new b() { // from class: com.facebook.GraphRequest.2
                @Override // com.facebook.GraphRequest.b
                public void a(q qVar) {
                    JSONObject b2 = qVar.b();
                    JSONObject optJSONObject = b2 != null ? b2.optJSONObject("__debug__") : null;
                    JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("messages") : null;
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                            String optString = optJSONObject2 != null ? optJSONObject2.optString(TJAdUnitConstants.String.MESSAGE) : null;
                            String optString2 = optJSONObject2 != null ? optJSONObject2.optString("type") : null;
                            String optString3 = optJSONObject2 != null ? optJSONObject2.optString("link") : null;
                            if (optString != null && optString2 != null) {
                                u uVar = u.GRAPH_API_DEBUG_INFO;
                                if (optString2.equals("warning")) {
                                    uVar = u.GRAPH_API_DEBUG_WARNING;
                                }
                                if (!ab.a(optString3)) {
                                    optString = optString + " Link: " + optString3;
                                }
                                com.facebook.internal.t.a(uVar, GraphRequest.f4699a, optString);
                            }
                        }
                    }
                    if (bVar != null) {
                        bVar.a(qVar);
                    }
                }
            };
        } else {
            this.l = bVar;
        }
    }

    public final void a(Object obj) {
        this.n = obj;
    }

    public final Object h() {
        return this.n;
    }

    public final q i() {
        return a(this);
    }

    public final o j() {
        return b(this);
    }

    public static HttpURLConnection a(p pVar) {
        URL url;
        d(pVar);
        try {
            if (pVar.size() == 1) {
                url = new URL(pVar.get(0).l());
            } else {
                url = new URL(com.facebook.internal.z.b());
            }
            HttpURLConnection httpURLConnection = null;
            try {
                HttpURLConnection a2 = a(url);
                try {
                    a(pVar, a2);
                    return a2;
                } catch (IOException | JSONException e2) {
                    e = e2;
                    httpURLConnection = a2;
                    ab.a(httpURLConnection);
                    throw new j("could not construct request body", e);
                }
            } catch (IOException | JSONException e3) {
                e = e3;
            }
        } catch (MalformedURLException e4) {
            throw new j("could not construct URL for request", e4);
        }
    }

    public static q a(GraphRequest graphRequest) {
        List<q> a2 = a(graphRequest);
        if (a2 == null || a2.size() != 1) {
            throw new j("invalid state: expected a single response");
        }
        return a2.get(0);
    }

    public static List<q> a(GraphRequest... graphRequestArr) {
        ac.a(graphRequestArr, Requests.EXTRA_REQUESTS);
        return a((Collection<GraphRequest>) Arrays.asList(graphRequestArr));
    }

    public static List<q> a(Collection<GraphRequest> collection) {
        return b(new p(collection));
    }

    public static List<q> b(p pVar) {
        ac.c(pVar, Requests.EXTRA_REQUESTS);
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection a2 = a(pVar);
                try {
                    List<q> a3 = a(a2, pVar);
                    ab.a(a2);
                    return a3;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = a2;
                    ab.a(httpURLConnection);
                    throw th;
                }
            } catch (Exception e2) {
                List<q> a4 = q.a(pVar.d(), (HttpURLConnection) null, new j(e2));
                a(pVar, a4);
                ab.a((URLConnection) null);
                return a4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static o b(GraphRequest... graphRequestArr) {
        ac.a(graphRequestArr, Requests.EXTRA_REQUESTS);
        return b((Collection<GraphRequest>) Arrays.asList(graphRequestArr));
    }

    public static o b(Collection<GraphRequest> collection) {
        return c(new p(collection));
    }

    public static o c(p pVar) {
        ac.c(pVar, Requests.EXTRA_REQUESTS);
        o oVar = new o(pVar);
        oVar.executeOnExecutor(l.d(), new Void[0]);
        return oVar;
    }

    public static List<q> a(HttpURLConnection httpURLConnection, p pVar) {
        List<q> a2 = q.a(httpURLConnection, pVar);
        ab.a(httpURLConnection);
        int size = pVar.size();
        if (size != a2.size()) {
            throw new j(String.format(Locale.US, "Received %d responses while expecting %d", Integer.valueOf(a2.size()), Integer.valueOf(size)));
        }
        a(pVar, a2);
        com.facebook.b.a().d();
        return a2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        sb.append(this.f4702d == null ? "null" : this.f4702d);
        sb.append(", graphPath: ");
        sb.append(this.f);
        sb.append(", graphObject: ");
        sb.append(this.g);
        sb.append(", httpMethod: ");
        sb.append(this.e);
        sb.append(", parameters: ");
        sb.append(this.k);
        sb.append("}");
        return sb.toString();
    }

    static void a(final p pVar, List<q> list) {
        int size = pVar.size();
        final ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            GraphRequest graphRequest = pVar.get(i);
            if (graphRequest.l != null) {
                arrayList.add(new Pair(graphRequest.l, list.get(i)));
            }
        }
        if (arrayList.size() > 0) {
            Runnable runnable = new Runnable() { // from class: com.facebook.GraphRequest.3
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ((b) pair.first).a((q) pair.second);
                    }
                    Iterator<p.a> it2 = pVar.e().iterator();
                    while (it2.hasNext()) {
                        it2.next().a(pVar);
                    }
                }
            };
            Handler c2 = pVar.c();
            if (c2 == null) {
                runnable.run();
            } else {
                c2.post(runnable);
            }
        }
    }

    private static HttpURLConnection a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty("User-Agent", p());
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    private void m() {
        if (this.f4702d != null) {
            if (!this.k.containsKey("access_token")) {
                String token = this.f4702d.getToken();
                com.facebook.internal.t.a(token);
                this.k.putString("access_token", token);
            }
        } else if (!this.p && !this.k.containsKey("access_token")) {
            String i = l.i();
            String k = l.k();
            if (!ab.a(i) && !ab.a(k)) {
                this.k.putString("access_token", i + "|" + k);
            } else {
                Log.d(f4699a, "Warning: Request without access token missing application ID or client token.");
            }
        }
        this.k.putString(TapjoyConstants.TJC_SDK_PLACEMENT, TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE);
        this.k.putString("format", AdType.STATIC_NATIVE);
        if (l.a(u.GRAPH_API_DEBUG_INFO)) {
            this.k.putString("debug", TJAdUnitConstants.String.VIDEO_INFO);
        } else if (l.a(u.GRAPH_API_DEBUG_WARNING)) {
            this.k.putString("debug", "warning");
        }
    }

    private String a(String str) {
        Uri.Builder encodedPath = new Uri.Builder().encodedPath(str);
        for (String str2 : this.k.keySet()) {
            Object obj = this.k.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (!e(obj)) {
                if (this.e == s.GET) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", obj.getClass().getSimpleName()));
                }
            } else {
                encodedPath.appendQueryParameter(str2, f(obj).toString());
            }
        }
        return encodedPath.toString();
    }

    final String k() {
        if (this.m != null) {
            throw new j("Can't override URL for a batch request");
        }
        String n = n();
        m();
        return a(n);
    }

    final String l() {
        String b2;
        if (this.m != null) {
            return this.m.toString();
        }
        if (c() == s.POST && this.f != null && this.f.endsWith("/videos")) {
            b2 = com.facebook.internal.z.c();
        } else {
            b2 = com.facebook.internal.z.b();
        }
        String format = String.format("%s/%s", b2, n());
        m();
        return a(format);
    }

    private String n() {
        return f4701c.matcher(this.f).matches() ? this.f : String.format("%s/%s", this.o, this.f);
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final GraphRequest f4710a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f4711b;

        public a(GraphRequest graphRequest, Object obj) {
            this.f4710a = graphRequest;
            this.f4711b = obj;
        }

        public GraphRequest a() {
            return this.f4710a;
        }

        public Object b() {
            return this.f4711b;
        }
    }

    private void a(JSONArray jSONArray, Map<String, a> map) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        if (this.h != null) {
            jSONObject.put("name", this.h);
            jSONObject.put("omit_response_on_success", this.j);
        }
        if (this.i != null) {
            jSONObject.put("depends_on", this.i);
        }
        String k = k();
        jSONObject.put("relative_url", k);
        jSONObject.put(TJAdUnitConstants.String.METHOD, this.e);
        if (this.f4702d != null) {
            com.facebook.internal.t.a(this.f4702d.getToken());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.k.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.k.get(it.next());
            if (d(obj)) {
                String format = String.format(Locale.ROOT, "%s%d", "file", Integer.valueOf(map.size()));
                arrayList.add(format);
                map.put(format, new a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        if (this.g != null) {
            final ArrayList arrayList2 = new ArrayList();
            a(this.g, k, new d() { // from class: com.facebook.GraphRequest.4
                @Override // com.facebook.GraphRequest.d
                public void a(String str, String str2) throws IOException {
                    arrayList2.add(String.format(Locale.US, "%s=%s", str, URLEncoder.encode(str2, "UTF-8")));
                }
            });
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    private static boolean e(p pVar) {
        Iterator<p.a> it = pVar.e().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof p.b) {
                return true;
            }
        }
        Iterator<GraphRequest> it2 = pVar.iterator();
        while (it2.hasNext()) {
            if (it2.next().g() instanceof e) {
                return true;
            }
        }
        return false;
    }

    private static void a(HttpURLConnection httpURLConnection, boolean z) {
        if (z) {
            httpURLConnection.setRequestProperty(Constants.KEY_CONTENT_TYPE, "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        } else {
            httpURLConnection.setRequestProperty(Constants.KEY_CONTENT_TYPE, o());
        }
    }

    private static boolean f(p pVar) {
        Iterator<GraphRequest> it = pVar.iterator();
        while (it.hasNext()) {
            GraphRequest next = it.next();
            Iterator<String> it2 = next.k.keySet().iterator();
            while (it2.hasNext()) {
                if (d(next.k.get(it2.next()))) {
                    return false;
                }
            }
        }
        return true;
    }

    static final boolean b(GraphRequest graphRequest) {
        String d2 = graphRequest.d();
        if (ab.a(d2)) {
            return true;
        }
        if (d2.startsWith("v")) {
            d2 = d2.substring(1);
        }
        String[] split = d2.split("\\.");
        if (split.length < 2 || Integer.parseInt(split[0]) <= 2) {
            return Integer.parseInt(split[0]) >= 2 && Integer.parseInt(split[1]) >= 4;
        }
        return true;
    }

    static final void d(p pVar) {
        Iterator<GraphRequest> it = pVar.iterator();
        while (it.hasNext()) {
            GraphRequest next = it.next();
            if (s.GET.equals(next.c()) && b(next)) {
                Bundle e2 = next.e();
                if (!e2.containsKey("fields") || ab.a(e2.getString("fields"))) {
                    com.facebook.internal.t.a(u.DEVELOPER_ERRORS, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", next.b());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static final void a(p pVar, HttpURLConnection httpURLConnection) throws IOException, JSONException {
        OutputStream outputStream;
        com.facebook.internal.t tVar = new com.facebook.internal.t(u.REQUESTS, "Request");
        int size = pVar.size();
        boolean f2 = f(pVar);
        s sVar = size == 1 ? pVar.get(0).e : s.POST;
        httpURLConnection.setRequestMethod(sVar.name());
        a(httpURLConnection, f2);
        URL url = httpURLConnection.getURL();
        tVar.c("Request:\n");
        tVar.a("Id", (Object) pVar.b());
        tVar.a(MoPubBrowser.DESTINATION_URL_KEY, url);
        tVar.a("Method", (Object) httpURLConnection.getRequestMethod());
        tVar.a("User-Agent", (Object) httpURLConnection.getRequestProperty("User-Agent"));
        tVar.a(Constants.KEY_CONTENT_TYPE, (Object) httpURLConnection.getRequestProperty(Constants.KEY_CONTENT_TYPE));
        httpURLConnection.setConnectTimeout(pVar.a());
        httpURLConnection.setReadTimeout(pVar.a());
        if (!(sVar == s.POST)) {
            tVar.a();
            return;
        }
        httpURLConnection.setDoOutput(true);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            if (f2) {
                try {
                    outputStream = new GZIPOutputStream(bufferedOutputStream);
                } catch (Throwable th) {
                    th = th;
                    outputStream = bufferedOutputStream;
                    if (outputStream != null) {
                    }
                    throw th;
                }
            } else {
                outputStream = bufferedOutputStream;
            }
            try {
                if (e(pVar)) {
                    x xVar = new x(pVar.c());
                    a(pVar, null, size, url, xVar, f2);
                    outputStream = new y(outputStream, pVar, xVar.b(), xVar.a());
                }
                a(pVar, tVar, size, url, outputStream, f2);
                outputStream.close();
                tVar.a();
            } catch (Throwable th2) {
                th = th2;
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
    }

    private static void a(p pVar, com.facebook.internal.t tVar, int i, URL url, OutputStream outputStream, boolean z) throws IOException, JSONException {
        f fVar = new f(outputStream, tVar, z);
        if (i == 1) {
            GraphRequest graphRequest = pVar.get(0);
            HashMap hashMap = new HashMap();
            for (String str : graphRequest.k.keySet()) {
                Object obj = graphRequest.k.get(str);
                if (d(obj)) {
                    hashMap.put(str, new a(graphRequest, obj));
                }
            }
            if (tVar != null) {
                tVar.c("  Parameters:\n");
            }
            a(graphRequest.k, fVar, graphRequest);
            if (tVar != null) {
                tVar.c("  Attachments:\n");
            }
            a(hashMap, fVar);
            if (graphRequest.g != null) {
                a(graphRequest.g, url.getPath(), fVar);
                return;
            }
            return;
        }
        String g = g(pVar);
        if (ab.a(g)) {
            throw new j("App ID was not specified at the request or Settings.");
        }
        fVar.a("batch_app_id", g);
        HashMap hashMap2 = new HashMap();
        a(fVar, pVar, hashMap2);
        if (tVar != null) {
            tVar.c("  Attachments:\n");
        }
        a(hashMap2, fVar);
    }

    private static boolean b(String str) {
        Matcher matcher = f4701c.matcher(str);
        if (matcher.matches()) {
            str = matcher.group(1);
        }
        return str.startsWith("me/") || str.startsWith("/me/");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(JSONObject jSONObject, String str, d dVar) throws IOException {
        boolean z;
        Iterator<String> keys;
        if (b(str)) {
            int indexOf = str.indexOf(":");
            int indexOf2 = str.indexOf("?");
            if (indexOf > 3 && (indexOf2 == -1 || indexOf < indexOf2)) {
                z = true;
                keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    a(next, jSONObject.opt(next), dVar, z && next.equalsIgnoreCase("image"));
                }
            }
        }
        z = false;
        keys = jSONObject.keys();
        while (keys.hasNext()) {
        }
    }

    private static void a(String str, Object obj, d dVar, boolean z) throws IOException {
        Class<?> cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    a(String.format("%s[%s]", str, next), jSONObject.opt(next), dVar, z);
                }
                return;
            }
            if (jSONObject.has("id")) {
                a(str, jSONObject.optString("id"), dVar, z);
                return;
            } else if (jSONObject.has("url")) {
                a(str, jSONObject.optString("url"), dVar, z);
                return;
            } else {
                if (jSONObject.has("fbsdk:create_object")) {
                    a(str, jSONObject.toString(), dVar, z);
                    return;
                }
                return;
            }
        }
        if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                a(String.format(Locale.ROOT, "%s[%d]", str, Integer.valueOf(i)), jSONArray.opt(i), dVar, z);
            }
            return;
        }
        if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
            dVar.a(str, obj.toString());
        } else if (Date.class.isAssignableFrom(cls)) {
            dVar.a(str, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj));
        }
    }

    private static void a(Bundle bundle, f fVar, GraphRequest graphRequest) throws IOException {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (e(obj)) {
                fVar.a(str, obj, graphRequest);
            }
        }
    }

    private static void a(Map<String, a> map, f fVar) throws IOException {
        for (String str : map.keySet()) {
            a aVar = map.get(str);
            if (d(aVar.b())) {
                fVar.a(str, aVar.b(), aVar.a());
            }
        }
    }

    private static void a(f fVar, Collection<GraphRequest> collection, Map<String, a> map) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        Iterator<GraphRequest> it = collection.iterator();
        while (it.hasNext()) {
            it.next().a(jSONArray, map);
        }
        fVar.a("batch", jSONArray, collection);
    }

    private static String o() {
        return String.format("multipart/form-data; boundary=%s", "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
    }

    private static String p() {
        if (q == null) {
            q = String.format("%s.%s", "FBAndroidSDK", "4.12.1");
            String a2 = r.a();
            if (!ab.a(a2)) {
                q = String.format(Locale.ROOT, "%s/%s", q, a2);
            }
        }
        return q;
    }

    private static String g(p pVar) {
        String applicationId;
        if (!ab.a(pVar.f())) {
            return pVar.f();
        }
        Iterator<GraphRequest> it = pVar.iterator();
        while (it.hasNext()) {
            AccessToken accessToken = it.next().f4702d;
            if (accessToken != null && (applicationId = accessToken.getApplicationId()) != null) {
                return applicationId;
            }
        }
        if (!ab.a(f4700b)) {
            return f4700b;
        }
        return l.i();
    }

    private static boolean d(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(obj);
        }
        throw new IllegalArgumentException("Unsupported parameter type.");
    }

    private static class f implements d {

        /* renamed from: a, reason: collision with root package name */
        private final OutputStream f4712a;

        /* renamed from: b, reason: collision with root package name */
        private final com.facebook.internal.t f4713b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f4714c = true;

        /* renamed from: d, reason: collision with root package name */
        private boolean f4715d;

        public f(OutputStream outputStream, com.facebook.internal.t tVar, boolean z) {
            this.f4715d = false;
            this.f4712a = outputStream;
            this.f4713b = tVar;
            this.f4715d = z;
        }

        public void a(String str, Object obj, GraphRequest graphRequest) throws IOException {
            if (this.f4712a instanceof z) {
                ((z) this.f4712a).a(graphRequest);
            }
            if (GraphRequest.e(obj)) {
                a(str, GraphRequest.f(obj));
                return;
            }
            if (obj instanceof Bitmap) {
                a(str, (Bitmap) obj);
                return;
            }
            if (obj instanceof byte[]) {
                a(str, (byte[]) obj);
                return;
            }
            if (obj instanceof Uri) {
                a(str, (Uri) obj, (String) null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                a(str, (ParcelFileDescriptor) obj, (String) null);
                return;
            }
            if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                Parcelable resource = parcelableResourceWithMimeType.getResource();
                String mimeType = parcelableResourceWithMimeType.getMimeType();
                if (resource instanceof ParcelFileDescriptor) {
                    a(str, (ParcelFileDescriptor) resource, mimeType);
                    return;
                } else {
                    if (resource instanceof Uri) {
                        a(str, (Uri) resource, mimeType);
                        return;
                    }
                    throw b();
                }
            }
            throw b();
        }

        private RuntimeException b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public void a(String str, JSONArray jSONArray, Collection<GraphRequest> collection) throws IOException, JSONException {
            if (!(this.f4712a instanceof z)) {
                a(str, jSONArray.toString());
                return;
            }
            z zVar = (z) this.f4712a;
            a(str, (String) null, (String) null);
            a("[", new Object[0]);
            int i = 0;
            for (GraphRequest graphRequest : collection) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                zVar.a(graphRequest);
                if (i > 0) {
                    a(",%s", jSONObject.toString());
                } else {
                    a("%s", jSONObject.toString());
                }
                i++;
            }
            a("]", new Object[0]);
            if (this.f4713b != null) {
                this.f4713b.a("    " + str, (Object) jSONArray.toString());
            }
        }

        @Override // com.facebook.GraphRequest.d
        public void a(String str, String str2) throws IOException {
            a(str, (String) null, (String) null);
            b("%s", str2);
            a();
            if (this.f4713b != null) {
                this.f4713b.a("    " + str, (Object) str2);
            }
        }

        public void a(String str, Bitmap bitmap) throws IOException {
            a(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f4712a);
            b("", new Object[0]);
            a();
            if (this.f4713b != null) {
                this.f4713b.a("    " + str, (Object) "<Image>");
            }
        }

        public void a(String str, byte[] bArr) throws IOException {
            a(str, str, "content/unknown");
            this.f4712a.write(bArr);
            b("", new Object[0]);
            a();
            if (this.f4713b != null) {
                this.f4713b.a("    " + str, (Object) String.format(Locale.ROOT, "<Data: %d>", Integer.valueOf(bArr.length)));
            }
        }

        public void a(String str, Uri uri, String str2) throws IOException {
            int a2;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            a(str, str, str2);
            if (this.f4712a instanceof x) {
                ((x) this.f4712a).a(ab.e(uri));
                a2 = 0;
            } else {
                a2 = ab.a(l.f().getContentResolver().openInputStream(uri), this.f4712a) + 0;
            }
            b("", new Object[0]);
            a();
            if (this.f4713b != null) {
                this.f4713b.a("    " + str, (Object) String.format(Locale.ROOT, "<Data: %d>", Integer.valueOf(a2)));
            }
        }

        public void a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws IOException {
            int a2;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            a(str, str, str2);
            if (this.f4712a instanceof x) {
                ((x) this.f4712a).a(parcelFileDescriptor.getStatSize());
                a2 = 0;
            } else {
                a2 = ab.a((InputStream) new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f4712a) + 0;
            }
            b("", new Object[0]);
            a();
            if (this.f4713b != null) {
                this.f4713b.a("    " + str, (Object) String.format(Locale.ROOT, "<Data: %d>", Integer.valueOf(a2)));
            }
        }

        public void a() throws IOException {
            if (!this.f4715d) {
                b("--%s", "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
            } else {
                this.f4712a.write("&".getBytes());
            }
        }

        public void a(String str, String str2, String str3) throws IOException {
            if (!this.f4715d) {
                a("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    a("; filename=\"%s\"", str2);
                }
                b("", new Object[0]);
                if (str3 != null) {
                    b("%s: %s", Constants.KEY_CONTENT_TYPE, str3);
                }
                b("", new Object[0]);
                return;
            }
            this.f4712a.write(String.format("%s=", str).getBytes());
        }

        public void a(String str, Object... objArr) throws IOException {
            if (!this.f4715d) {
                if (this.f4714c) {
                    this.f4712a.write("--".getBytes());
                    this.f4712a.write("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f".getBytes());
                    this.f4712a.write("\r\n".getBytes());
                    this.f4714c = false;
                }
                this.f4712a.write(String.format(str, objArr).getBytes());
                return;
            }
            this.f4712a.write(URLEncoder.encode(String.format(Locale.US, str, objArr), "UTF-8").getBytes());
        }

        public void b(String str, Object... objArr) throws IOException {
            a(str, objArr);
            if (this.f4715d) {
                return;
            }
            a("\r\n", new Object[0]);
        }
    }

    public static class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ParcelableResourceWithMimeType> CREATOR = new Parcelable.Creator<ParcelableResourceWithMimeType>() { // from class: com.facebook.GraphRequest.ParcelableResourceWithMimeType.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType createFromParcel(Parcel parcel) {
                return new ParcelableResourceWithMimeType(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType[] newArray(int i) {
                return new ParcelableResourceWithMimeType[i];
            }
        };
        private final String mimeType;
        private final RESOURCE resource;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        public String getMimeType() {
            return this.mimeType;
        }

        public RESOURCE getResource() {
            return this.resource;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mimeType);
            parcel.writeParcelable(this.resource, i);
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.mimeType = parcel.readString();
            this.resource = (RESOURCE) parcel.readParcelable(l.f().getClassLoader());
        }
    }
}
