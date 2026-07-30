package com.baidu.bdhttpdns;

import androidx.core.app.NotificationCompat;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private static volatile i f4239a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f4240b = true;

    /* renamed from: c, reason: collision with root package name */
    private static c f4241c;

    /* renamed from: e, reason: collision with root package name */
    private String f4243e;

    /* renamed from: g, reason: collision with root package name */
    private String f4245g;

    /* renamed from: q, reason: collision with root package name */
    private int f4255q;

    /* renamed from: r, reason: collision with root package name */
    private int f4256r;

    /* renamed from: d, reason: collision with root package name */
    private String f4242d = "180.76.76.200";

    /* renamed from: f, reason: collision with root package name */
    private String f4244f = "[240c:4006::6666]";

    /* renamed from: h, reason: collision with root package name */
    private boolean f4246h = true;

    /* renamed from: i, reason: collision with root package name */
    private long f4247i = 0;

    /* renamed from: l, reason: collision with root package name */
    private final Object f4250l = new Object();

    /* renamed from: m, reason: collision with root package name */
    private ArrayList<String> f4251m = new ArrayList<>();

    /* renamed from: n, reason: collision with root package name */
    private String f4252n = "";

    /* renamed from: o, reason: collision with root package name */
    private String f4253o = "";

    /* renamed from: p, reason: collision with root package name */
    private boolean f4254p = false;

    /* renamed from: s, reason: collision with root package name */
    private int f4257s = 10;

    /* renamed from: k, reason: collision with root package name */
    private final Object f4249k = new Object();

    /* renamed from: j, reason: collision with root package name */
    private final HashSet<String> f4248j = new HashSet<>();

    interface a {
        void a(int i8, d dVar, Map<String, e> map, String str);
    }

    private class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private String f4258a;

        /* renamed from: b, reason: collision with root package name */
        private d f4259b;

        /* renamed from: c, reason: collision with root package name */
        private a f4260c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f4261d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f4262e = false;

        public b(String str, d dVar, a aVar) {
            this.f4258a = str;
            this.f4259b = dVar;
            this.f4260c = aVar;
        }

        private String a(String str, int i8) {
            if (str == null || i8 >= 3) {
                return null;
            }
            this.f4262e = true;
            l.a("Using IDCServerIP(%s)", str);
            return str;
        }

        private void b() {
            String a8 = a(this.f4258a, this.f4259b);
            l.a("Request url is :%s", a8);
            if (a8 != null) {
                a(a8);
            } else {
                this.f4260c.a(-1, this.f4259b, null, this.f4258a);
                l.a("Httpdns request failed for  %s(%s), get url error", this.f4259b.toString(), this.f4258a);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            b();
            if (this.f4261d) {
                l.a("Retry for %s(%s).", this.f4259b.toString(), this.f4258a);
                b();
            }
            synchronized (i.this.f4249k) {
                try {
                    if (!this.f4259b.equals(d.TAG_OF_HOSTS)) {
                        for (String str : this.f4258a.split(SystemInfoUtil.COMMA)) {
                            i.this.f4248j.remove(str);
                        }
                    }
                } finally {
                }
            }
            synchronized (i.this.f4250l) {
                try {
                    if (this.f4259b.equals(d.DNLIST_HOSTS)) {
                        for (String str2 : this.f4258a.split(SystemInfoUtil.COMMA)) {
                            i.this.f4251m.remove(str2);
                        }
                    }
                } finally {
                }
            }
        }

        private String a(String str, d dVar) {
            String a8;
            String str2;
            long currentTimeMillis = (System.currentTimeMillis() / 1000) + 300 + i.this.f4247i;
            String a9 = i.this.a(str, currentTimeMillis);
            if (a9 == null) {
                return null;
            }
            if (BDNetworkStateChangeReceiver.isIPv4Reachable()) {
                a8 = a(i.this.f4243e, i.this.f4255q);
                if (a8 == null) {
                    a8 = i.this.f4242d;
                    this.f4262e = false;
                    l.a("Using BGPServerIp(%s)", i.this.f4242d);
                }
                str2 = BDNetworkStateChangeReceiver.isIPv6Reachable() ? "dual_stack" : "ipv4";
            } else {
                if (!BDNetworkStateChangeReceiver.isIPv6Reachable()) {
                    return null;
                }
                a8 = a(i.this.f4245g, i.this.f4256r);
                if (a8 == null) {
                    a8 = i.this.f4244f;
                    this.f4262e = false;
                    l.a("Using BGPServerIp(%s)", i.this.f4244f);
                }
                str2 = "ipv6";
            }
            String format = dVar.equals(d.TAG_OF_HOSTS) ? String.format("%s/v4/resolve?account_id=%s&tag=%s&sign=%s&t=%d&sdk_ver=%s&os_type=%s&alt_server_ip=true&type=%s", a8, i.this.f4252n, str, a9, Long.valueOf(currentTimeMillis), "1.3", HttpConstants.OS_TYPE_VALUE, str2) : String.format("%s/v4/resolve?account_id=%s&dn=%s&sign=%s&t=%d&sdk_ver=%s&os_type=%s&alt_server_ip=true&type=%s", a8, i.this.f4252n, str, a9, Long.valueOf(currentTimeMillis), "1.3", HttpConstants.OS_TYPE_VALUE, str2);
            return i.this.f4246h ? String.format("https://%s", format) : String.format("http://%s", format);
        }

        /* JADX WARN: Code restructure failed: missing block: B:70:0x01ee, code lost:
        
            if (r13 == null) goto L106;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01f5  */
        /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r13v16 */
        /* JADX WARN: Type inference failed for: r13v46 */
        /* JADX WARN: Type inference failed for: r13v47 */
        /* JADX WARN: Type inference failed for: r13v48 */
        /* JADX WARN: Type inference failed for: r13v49 */
        /* JADX WARN: Type inference failed for: r13v7, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r7v29, types: [com.baidu.bdhttpdns.i] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void a(String str) {
            Throwable th;
            HttpURLConnection httpURLConnection;
            ArrayIndexOutOfBoundsException e8;
            HttpURLConnection httpURLConnection2;
            IOException e9;
            HttpURLConnection httpURLConnection3;
            HttpURLConnection httpURLConnection4;
            HttpURLConnection httpURLConnection5;
            int responseCode;
            InputStream errorStream;
            a aVar;
            d dVar;
            Map<String, e> hashMap = new HashMap<>();
            Boolean bool = Boolean.TRUE;
            try {
                try {
                    URL url = new URL(str);
                    if (i.this.f4246h) {
                        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
                        httpsURLConnection.setRequestProperty("Host", "httpdns.baidubce.com");
                        httpsURLConnection.setHostnameVerifier(i.f4241c);
                        httpURLConnection5 = httpsURLConnection;
                    } else {
                        httpURLConnection5 = (HttpURLConnection) url.openConnection();
                    }
                    try {
                        httpURLConnection5.setRequestMethod(HttpManager.HTTP_GET);
                        httpURLConnection5.setReadTimeout(30000);
                        httpURLConnection5.setConnectTimeout(30000);
                        httpURLConnection5.setRequestProperty("connection", HttpHeaders.KEEP_ALIVE);
                        httpURLConnection5.setRequestProperty("Accept-Encoding", com.yanzhenjie.kalle.i.VALUE_ACCEPT_ENCODING);
                        httpURLConnection5.connect();
                        responseCode = httpURLConnection5.getResponseCode();
                        errorStream = responseCode >= 400 ? httpURLConnection5.getErrorStream() : httpURLConnection5.getInputStream();
                    } catch (IOException e10) {
                        e9 = e10;
                        httpURLConnection3 = httpURLConnection5;
                        e9.printStackTrace();
                        bool = Boolean.FALSE;
                        i.this.a(Boolean.valueOf(this.f4262e));
                        l.a("Httpdns request failed for %s(%s), caught network IOException", this.f4259b.toString(), this.f4258a);
                        this.f4260c.a(-1, this.f4259b, null, this.f4258a);
                        httpURLConnection4 = httpURLConnection3;
                        str = httpURLConnection3;
                    } catch (ArrayIndexOutOfBoundsException e11) {
                        e8 = e11;
                        httpURLConnection2 = httpURLConnection5;
                        e8.printStackTrace();
                        bool = Boolean.FALSE;
                        i.this.a(Boolean.valueOf(this.f4262e));
                        l.a("Httpdns request failed for %s(%s), caught ArrayIndexOutOfBoundsException", this.f4259b.toString(), this.f4258a);
                        this.f4260c.a(-1, this.f4259b, null, this.f4258a);
                        str = httpURLConnection2;
                        if (httpURLConnection2 != null) {
                            httpURLConnection4 = httpURLConnection2;
                            httpURLConnection4.disconnect();
                            str = httpURLConnection4;
                        }
                        if (hashMap != null) {
                        }
                        this.f4260c.a(-1, this.f4259b, null, this.f4258a);
                    } catch (Throwable th2) {
                        th = th2;
                        httpURLConnection = httpURLConnection5;
                        th.printStackTrace();
                        bool = Boolean.FALSE;
                        i.this.a(Boolean.valueOf(this.f4262e));
                        l.a("Httpdns request failed for %s(%s), caught Exception", this.f4259b.toString(), this.f4258a);
                        this.f4260c.a(-1, this.f4259b, null, this.f4258a);
                        str = httpURLConnection;
                        if (httpURLConnection != null) {
                            httpURLConnection4 = httpURLConnection;
                            httpURLConnection4.disconnect();
                            str = httpURLConnection4;
                        }
                        if (hashMap != null) {
                        }
                        this.f4260c.a(-1, this.f4259b, null, this.f4258a);
                    }
                } catch (Throwable th3) {
                    if (str != 0) {
                        str.disconnect();
                    }
                    if (bool.booleanValue() && this.f4262e) {
                        if (BDNetworkStateChangeReceiver.isIPv4Reachable()) {
                            i.this.f4255q = 0;
                        } else if (BDNetworkStateChangeReceiver.isIPv6Reachable()) {
                            i.this.f4256r = 0;
                        }
                    }
                    throw th3;
                }
            } catch (IOException e12) {
                e9 = e12;
                httpURLConnection3 = null;
            } catch (ArrayIndexOutOfBoundsException e13) {
                e8 = e13;
                httpURLConnection2 = null;
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = null;
            }
            if (errorStream != null) {
                String a8 = i.this.a(errorStream, httpURLConnection5);
                l.a("Response data is : %s", a8);
                if (a8 == null) {
                    Boolean bool2 = Boolean.FALSE;
                    i.this.a(Boolean.valueOf(this.f4262e));
                    l.a("Httpdns request failed for %s(%s), get empty response data", this.f4259b.toString(), this.f4258a);
                    this.f4260c.a(-1, this.f4259b, null, this.f4258a);
                    httpURLConnection5.disconnect();
                    return;
                }
                Map a9 = i.this.a(a8, this.f4258a, this.f4259b);
                if (a9.get("isSignExpired").equals(bool)) {
                    this.f4261d = true;
                    httpURLConnection5.disconnect();
                    if (this.f4262e) {
                        if (BDNetworkStateChangeReceiver.isIPv4Reachable()) {
                            i.this.f4255q = 0;
                            return;
                        } else {
                            if (BDNetworkStateChangeReceiver.isIPv6Reachable()) {
                                i.this.f4256r = 0;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (a9.get("isMsgOK").equals(bool) && responseCode == 200) {
                    hashMap = i.this.a(a8, this.f4258a);
                    httpURLConnection5.disconnect();
                    if (bool.booleanValue() && this.f4262e) {
                        if (!BDNetworkStateChangeReceiver.isIPv4Reachable()) {
                            i.this.f4255q = 0;
                        } else if (BDNetworkStateChangeReceiver.isIPv6Reachable()) {
                            i.this.f4256r = 0;
                        }
                    }
                    if (hashMap != null || hashMap.isEmpty()) {
                        this.f4260c.a(-1, this.f4259b, null, this.f4258a);
                    } else {
                        this.f4260c.a(0, this.f4259b, hashMap, this.f4258a);
                        return;
                    }
                }
                aVar = this.f4260c;
                dVar = this.f4259b;
            } else {
                bool = Boolean.FALSE;
                i.this.a(Boolean.valueOf(this.f4262e));
                l.a("Httpdns request failed for %s(%s), get null response stream", this.f4259b.toString(), this.f4258a);
                aVar = this.f4260c;
                dVar = this.f4259b;
            }
            aVar.a(-1, dVar, null, this.f4258a);
            httpURLConnection5.disconnect();
            if (bool.booleanValue()) {
                if (!BDNetworkStateChangeReceiver.isIPv4Reachable()) {
                }
            }
            if (hashMap != null) {
            }
            this.f4260c.a(-1, this.f4259b, null, this.f4258a);
        }
    }

    private class c implements HostnameVerifier {
        private c() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return HttpsURLConnection.getDefaultHostnameVerifier().verify("httpdns.baidubce.com", sSLSession);
        }
    }

    public enum d {
        DNLIST_HOSTS,
        TAG_OF_HOSTS
    }

    public class e {

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f4269b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList<String> f4270c;

        /* renamed from: d, reason: collision with root package name */
        private final long f4271d;

        public e(ArrayList<String> arrayList, ArrayList<String> arrayList2, long j8) {
            this.f4269b = arrayList;
            this.f4270c = arrayList2;
            this.f4271d = j8;
        }

        public ArrayList<String> a() {
            return this.f4269b;
        }

        public ArrayList<String> b() {
            return this.f4270c;
        }

        public long c() {
            return this.f4271d;
        }
    }

    private i() {
        f4241c = new c();
    }

    public int d() {
        return this.f4257s;
    }

    private long a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        long j8;
        if (jSONObject != null) {
            try {
                j8 = jSONObject.getLong("ttl");
            } catch (JSONException e8) {
                e8.printStackTrace();
                l.a("Httpdns request failed, host(%s), response has no ttl, will use defaults ttl(60s)", str);
                return -1L;
            }
        } else {
            j8 = -1;
        }
        long j9 = jSONObject2 != null ? jSONObject2.getLong("ttl") : -1L;
        if (j8 > 0 && j9 > 0) {
            return j8 < j9 ? j8 : j9;
        }
        if (j8 > 0) {
            return j8;
        }
        if (j9 > 0) {
            return j9;
        }
        return -1L;
    }

    private String b(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.getString(NotificationCompat.CATEGORY_MESSAGE);
        } catch (JSONException e8) {
            e8.printStackTrace();
            l.a("Httpdns request failed, host(%s), response has no msg in %s ", str2, str);
            return null;
        }
    }

    public ArrayList c() {
        return this.f4251m;
    }

    String e() {
        return !f4240b ? this.f4253o : com.baidu.bdhttpdns.e.g(this.f4253o);
    }

    boolean f() {
        return this.f4254p;
    }

    static i a() {
        if (f4239a == null) {
            synchronized (i.class) {
                try {
                    if (f4239a == null) {
                        f4239a = new i();
                    }
                } finally {
                }
            }
        }
        return f4239a;
    }

    void c(String str) {
        this.f4252n = str;
    }

    void d(String str) {
        String f8 = com.baidu.bdhttpdns.e.f(str);
        this.f4253o = f8;
        if (f8 == null) {
            this.f4253o = str;
            f4240b = false;
        }
    }

    public void b() {
        this.f4255q = 0;
        this.f4256r = 0;
        this.f4243e = null;
        this.f4245g = null;
    }

    public void b(boolean z7) {
        this.f4254p = z7;
    }

    public static boolean b(String str) {
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(InputStream inputStream, HttpURLConnection httpURLConnection) {
        String contentEncoding = httpURLConnection.getContentEncoding();
        if (contentEncoding != null) {
            try {
                if (contentEncoding.contains("gzip")) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    int contentLength = httpURLConnection.getContentLength();
                    if (contentLength <= 0) {
                        contentLength = 1024;
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (-1 == read) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    } else {
                        byte[] bArr2 = new byte[contentLength];
                        inputStream.read(bArr2);
                        byteArrayOutputStream.write(bArr2, 0, contentLength);
                    }
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                    return a(byteArrayOutputStream.toByteArray(), contentLength);
                }
            } catch (UnsupportedEncodingException e8) {
                e8.printStackTrace();
                return null;
            } catch (IOException e9) {
                e9.printStackTrace();
                return null;
            }
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, cn.hutool.core.util.l.UTF_8));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(readLine);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, long j8) {
        return com.baidu.bdhttpdns.e.e(String.format("%s-%s-%d", str, e(), Long.valueOf(j8)));
    }

    private String a(byte[] bArr, int i8) {
        byte[] bArr2 = new byte[i8];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr), i8);
            do {
                int read = gZIPInputStream.read(bArr2, 0, i8);
                byteArrayOutputStream.write(bArr2, 0, read);
                if (read == -1) {
                    break;
                }
            } while (!b(byteArrayOutputStream.toString()));
            gZIPInputStream.close();
            return byteArrayOutputStream.toString();
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    private ArrayList<String> a(String str, String str2, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("ip");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            l.a("Httpdns request warning, host(%s), response has no ip field in %s", str2, str);
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
            String optString = optJSONArray.optString(i8);
            if (optString == null || optString.isEmpty()) {
                l.a("Httpdns request warning, host(%s), response of data get ip error in %s", str2, str);
            } else if (com.baidu.bdhttpdns.e.a(optString) || com.baidu.bdhttpdns.e.b(optString)) {
                arrayList.add(optString);
            } else {
                l.a("Httpdns request warning, host(%s), response of data get invalid ip(%s) in %s", str2, optString, str);
            }
        }
        return arrayList;
    }

    Map a(String str, String str2) {
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        HashMap hashMap = new HashMap();
        Object obj = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("serverip")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("serverip");
                JSONArray optJSONArray = optJSONObject.optJSONArray("ipv4");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    this.f4243e = optJSONArray.optString(0);
                }
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("ipv6");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    this.f4245g = "[" + optJSONArray2.optString(0) + "]";
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
            if (optJSONObject2 == null) {
                l.a("Httpdns request failed, hostsOrTag(%s), response has empty data", str2);
                return null;
            }
            Iterator<String> keys = optJSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject(next);
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject("ipv4");
                JSONObject optJSONObject5 = optJSONObject3.optJSONObject("ipv6");
                long a8 = a(next, optJSONObject4, optJSONObject5);
                if (a8 < 0) {
                    hashMap.put(next, obj);
                } else {
                    String b8 = b("ipv4Obj", next, optJSONObject4);
                    String b9 = b("ipv6Obj", next, optJSONObject5);
                    if (b8 == null || b8.isEmpty()) {
                        l.a("Host(%s) ipv4Msg(%s), will deprecated the ipv4List result", next, b8);
                        arrayList = null;
                    } else {
                        arrayList = a("ipv4Obj", next, optJSONObject4);
                    }
                    if (b9 == null || b9.isEmpty()) {
                        l.a("Host(%s) ipv6Msg(%s), will deprecated the ipv6List result", next, b9);
                        arrayList2 = null;
                    } else {
                        arrayList2 = a("ipv6Obj", next, optJSONObject5);
                    }
                    if ((arrayList == null || arrayList.isEmpty()) && (arrayList2 == null || arrayList2.isEmpty())) {
                        l.a("Httpdns request failed, host(%s), response has no valid ip", next);
                        hashMap.put(next, null);
                        obj = null;
                    } else {
                        hashMap.put(next, new e(arrayList, arrayList2, a8));
                        obj = null;
                    }
                }
            }
            return hashMap;
        } catch (JSONException e8) {
            e8.printStackTrace();
            l.a("Httpdns request failed, hostsOrTag(%s), response parse data json error", str2);
            return null;
        }
    }

    Map a(String str, String str2, d dVar) {
        HashMap hashMap = new HashMap();
        Boolean bool = Boolean.FALSE;
        hashMap.put("isMsgOK", bool);
        hashMap.put("isSignExpired", bool);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
            if (optString == null || optString.isEmpty()) {
                l.a("Httpdns request failed for %s(%s), response lack of msg", dVar.toString(), str2);
                return hashMap;
            }
            if (!"SignatureExpired".equals(optString)) {
                if ("ok".equals(optString)) {
                    hashMap.put("isMsgOK", Boolean.TRUE);
                    return hashMap;
                }
                l.a("Httpdns request failed for %s(%s), response msg(%s) is not ok", dVar.toString(), str2, optString);
                return hashMap;
            }
            int optInt = jSONObject.optInt("timestamp");
            if (optInt == 0) {
                l.a("Httpdns request failed for %s(%s), response get invalid timestamp", dVar.toString(), str2);
            } else {
                this.f4247i = optInt - (System.currentTimeMillis() / 1000);
                hashMap.put("isSignExpired", Boolean.TRUE);
            }
            return hashMap;
        } catch (JSONException e8) {
            e8.printStackTrace();
            l.a("Httpdns request failed for %s(%s), response parse json error", dVar.toString(), str2);
            return hashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(Boolean bool) {
        try {
            if (bool.booleanValue()) {
                if (BDNetworkStateChangeReceiver.isIPv4Reachable()) {
                    int i8 = this.f4255q + 1;
                    this.f4255q = i8;
                    l.a("requestV4IDCFailNum: %s", Integer.valueOf(i8));
                } else if (BDNetworkStateChangeReceiver.isIPv6Reachable()) {
                    int i9 = this.f4256r + 1;
                    this.f4256r = i9;
                    l.a("requestV6IDCFailNum: %s", Integer.valueOf(i9));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a(String str) {
        synchronized (this.f4250l) {
            try {
                if (!this.f4251m.contains(str)) {
                    this.f4251m.add(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void a(String str, d dVar, a aVar) {
        if (str == null || str.isEmpty()) {
            return;
        }
        synchronized (this.f4249k) {
            if (dVar.equals(d.DNLIST_HOSTS)) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(Arrays.asList(str.split(SystemInfoUtil.COMMA)));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (this.f4248j.contains(str2)) {
                        l.a("Httpdns request request for host(%s) is in processing，will exclude it.", str2);
                        it.remove();
                    } else {
                        this.f4248j.add(str2);
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    sb.append((String) arrayList.get(i8));
                    sb.append(SystemInfoUtil.COMMA);
                }
                str = sb.toString().replaceAll("^,*|,*$", "");
            }
            if (str != null && !str.isEmpty()) {
                try {
                    m.a().b().execute(new b(str, dVar, aVar));
                } catch (RejectedExecutionException e8) {
                    e8.printStackTrace();
                    l.a("Httpdns request failed, host(%s), async tasks has exceed the maximum thread limit.", str);
                }
            }
        }
    }

    public void a(ArrayList<String> arrayList, a aVar) {
        ArrayList arrayList2 = new ArrayList(new HashSet(arrayList));
        int i8 = 0;
        int i9 = 0;
        while (i8 < arrayList2.size()) {
            String str = "";
            int i10 = 0;
            while (true) {
                int i11 = this.f4257s;
                if (i10 >= i11 || (i8 = i10 + (i11 * i9)) >= arrayList2.size()) {
                    break;
                }
                str = str + ((String) arrayList2.get(i8)) + SystemInfoUtil.COMMA;
                i10++;
            }
            i9++;
            if (str != null && !str.isEmpty()) {
                String substring = str.substring(0, str.length() - 1);
                l.a("Hosts for httpdns request is (%s) ", substring);
                a(substring, d.DNLIST_HOSTS, aVar);
            }
        }
    }

    void a(boolean z7) {
        this.f4246h = z7;
    }
}
