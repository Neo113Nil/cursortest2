package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.c.g;
import com.applovin.impl.sdk.c.h;
import com.applovin.impl.sdk.e.i;
import com.applovin.impl.sdk.e.l;
import com.applovin.impl.sdk.e.m;
import com.applovin.impl.sdk.e.n;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinErrorCodes;
import com.mopub.common.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final j f3324a;

    /* renamed from: b, reason: collision with root package name */
    private final p f3325b;

    /* renamed from: com.applovin.impl.sdk.network.a$a, reason: collision with other inner class name */
    public static class C0312a {

        /* renamed from: a, reason: collision with root package name */
        private long f3326a;

        /* renamed from: b, reason: collision with root package name */
        private long f3327b;

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j) {
            this.f3326a = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j) {
            this.f3327b = j;
        }

        public long a() {
            return this.f3326a;
        }

        public long b() {
            return this.f3327b;
        }
    }

    public interface b<T> {
        void a(int i);

        void a(T t, int i);
    }

    public a(j jVar) {
        this.f3324a = jVar;
        this.f3325b = jVar.u();
    }

    private int a(Throwable th) {
        if (th instanceof UnknownHostException) {
            return AppLovinErrorCodes.NO_NETWORK;
        }
        if (th instanceof SocketTimeoutException) {
            return AppLovinErrorCodes.FETCH_AD_TIMEOUT;
        }
        if (!(th instanceof IOException)) {
            return th instanceof JSONException ? -104 : -1;
        }
        String message = th.getMessage();
        return (message == null || !message.toLowerCase(Locale.ENGLISH).contains("authentication challenge")) ? -100 : 401;
    }

    private HttpURLConnection a(String str, String str2, int i) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(i < 0 ? ((Integer) this.f3324a.a(com.applovin.impl.sdk.b.b.dH)).intValue() : i);
        if (i < 0) {
            i = ((Integer) this.f3324a.a(com.applovin.impl.sdk.b.b.dI)).intValue();
        }
        httpURLConnection.setReadTimeout(i);
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    private void a(int i, String str) {
        if (((Boolean) this.f3324a.a(com.applovin.impl.sdk.b.b.Y)).booleanValue()) {
            try {
                c.a(i, str, this.f3324a.w());
            } catch (Throwable th) {
                this.f3324a.u().b("ConnectionManager", "Failed to track response code for URL: " + str, th);
            }
        }
    }

    private static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    private void a(String str) {
        h D;
        g gVar;
        if (i.a(str, com.applovin.impl.sdk.e.e.e(this.f3324a)) || i.a(str, com.applovin.impl.sdk.e.e.f(this.f3324a))) {
            D = this.f3324a.D();
            gVar = g.h;
        } else if (i.a(str, com.applovin.impl.mediation.c.b.a(this.f3324a)) || i.a(str, com.applovin.impl.mediation.c.b.b(this.f3324a))) {
            D = this.f3324a.D();
            gVar = g.q;
        } else {
            D = this.f3324a.D();
            gVar = g.i;
        }
        D.a(gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void a(String str, int i, String str2, T t, boolean z, b<T> bVar) throws JSONException {
        p pVar;
        String str3;
        StringBuilder sb;
        String str4;
        this.f3325b.a("ConnectionManager", i + " received from \"" + str2 + "\": " + str);
        if (i >= 200) {
            String str5 = str;
            if (i < 300) {
                if (z) {
                    str5 = com.applovin.impl.sdk.e.h.a(str, this.f3324a.s());
                }
                boolean z2 = str5 != null && str5.length() > 2;
                if (i != 204 && z2) {
                    try {
                        Object obj = str5;
                        if (!(t instanceof String)) {
                            if (t instanceof m) {
                                obj = n.a(str5, this.f3324a);
                            } else if (t instanceof JSONObject) {
                                t = new JSONObject(str5);
                            } else {
                                this.f3325b.d("ConnectionManager", "Unable to handle '" + t.getClass().getName() + "'");
                            }
                        }
                        t = obj;
                    } catch (JSONException e) {
                        e = e;
                        a(str2);
                        pVar = this.f3325b;
                        str3 = "ConnectionManager";
                        sb = new StringBuilder();
                        str4 = "Invalid JSON returned from \"";
                        sb.append(str4);
                        sb.append(str2);
                        sb.append("\"");
                        pVar.b(str3, sb.toString(), e);
                        bVar.a(t, i);
                        return;
                    } catch (SAXException e2) {
                        e = e2;
                        a(str2);
                        pVar = this.f3325b;
                        str3 = "ConnectionManager";
                        sb = new StringBuilder();
                        str4 = "Invalid XML returned from \"";
                        sb.append(str4);
                        sb.append(str2);
                        sb.append("\"");
                        pVar.b(str3, sb.toString(), e);
                        bVar.a(t, i);
                        return;
                    }
                }
                bVar.a(t, i);
                return;
            }
        }
        this.f3325b.d("ConnectionManager", i + " error received from \"" + str2 + "\"");
        bVar.a(i);
    }

    private void a(String str, String str2, int i, long j) {
        this.f3325b.b("ConnectionManager", "Successful " + str + " returned " + i + " in " + ((System.currentTimeMillis() - j) / 1000.0f) + " s over " + com.applovin.impl.sdk.e.e.d(this.f3324a) + " to \"" + str2 + "\"");
    }

    private void a(String str, String str2, int i, long j, Throwable th) {
        this.f3325b.b("ConnectionManager", "Failed " + str + " returned " + i + " in " + ((System.currentTimeMillis() - j) / 1000.0f) + " s over " + com.applovin.impl.sdk.e.e.d(this.f3324a) + " to \"" + str2 + "\"", th);
    }

    private static void a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x021f A[Catch: Throwable -> 0x022b, all -> 0x0258, TryCatch #8 {Throwable -> 0x022b, blocks: (B:52:0x0216, B:54:0x021f, B:59:0x0223), top: B:51:0x0216 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0223 A[Catch: Throwable -> 0x022b, all -> 0x0258, TRY_LEAVE, TryCatch #8 {Throwable -> 0x022b, blocks: (B:52:0x0216, B:54:0x021f, B:59:0x0223), top: B:51:0x0216 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> void a(com.applovin.impl.sdk.network.b<T> bVar, C0312a c0312a, b<T> bVar2) {
        HttpURLConnection httpURLConnection;
        Throwable th;
        InputStream inputStream;
        HttpURLConnection httpURLConnection2;
        int responseCode;
        InputStream inputStream2;
        if (bVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        String a2 = bVar.a();
        String c2 = bVar.c();
        if (a2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        }
        if (c2 == null) {
            throw new IllegalArgumentException("No method specified");
        }
        if (bVar2 == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        if (!a2.toLowerCase().startsWith(Constants.HTTP)) {
            this.f3325b.e("ConnectionManager", "Requested postback submission to non HTTP endpoint " + a2 + "; skipping...");
            bVar2.a(AppLovinErrorCodes.INVALID_URL);
            return;
        }
        if (((Boolean) this.f3324a.a(com.applovin.impl.sdk.b.b.dJ)).booleanValue() && !a2.contains("https://")) {
            this.f3324a.u().c("ConnectionManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
            a2 = a2.replace("http://", "https://");
        }
        boolean l = bVar.l();
        long a3 = l.a(this.f3324a);
        if ((bVar.b() != null && !bVar.b().isEmpty()) || bVar.h() >= 0) {
            Map<String, String> b2 = bVar.b();
            if (bVar.h() >= 0) {
                b2.put("current_retry_attempt", String.valueOf(bVar.h()));
            }
            a2 = l ? i.a(a2, com.umeng.commonsdk.proguard.d.ao, com.applovin.impl.sdk.e.h.a(l.a(b2), this.f3324a.s(), a3)) : i.a(a2, b2);
        }
        String str = a2;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.f3325b.b("ConnectionManager", "Sending " + c2 + " request to \"" + str + "\"...");
            httpURLConnection = a(str, c2, bVar.j());
            try {
                if (bVar.d() != null) {
                    try {
                        String a4 = l ? com.applovin.impl.sdk.e.h.a(bVar.d().toString(), this.f3324a.s(), a3) : bVar.d().toString();
                        this.f3325b.a("ConnectionManager", "Request to \"" + str + "\" is " + a4);
                        httpURLConnection.setRequestProperty(com.aiming.mdt.utils.Constants.KEY_CONTENT_TYPE, "application/json; charset=utf-8");
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setFixedLengthStreamingMode(a4.getBytes(Charset.forName("UTF-8")).length);
                        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF8"));
                        printWriter.print(a4);
                        printWriter.close();
                    } catch (Throwable th2) {
                        th = th2;
                        httpURLConnection2 = httpURLConnection;
                        inputStream = null;
                        int a5 = a(th);
                        a(a5, str);
                        a(c2, str, a5, currentTimeMillis, th);
                        bVar2.a(a5);
                        a(inputStream);
                        a(httpURLConnection2);
                    }
                }
                try {
                    responseCode = httpURLConnection.getResponseCode();
                } catch (MalformedURLException unused) {
                    httpURLConnection2 = httpURLConnection;
                }
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection2 = httpURLConnection;
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
        try {
            if (responseCode > 0) {
                httpURLConnection2 = httpURLConnection;
                a(c2, str, responseCode, currentTimeMillis);
                InputStream inputStream3 = httpURLConnection2.getInputStream();
                try {
                    a(responseCode, str);
                } catch (MalformedURLException unused2) {
                } catch (Throwable th5) {
                    th = th5;
                }
                try {
                    if (bVar.g()) {
                        String a6 = com.applovin.impl.sdk.e.e.a(inputStream3, this.f3324a);
                        if (c0312a != null) {
                            if (a6 != null) {
                                try {
                                    c0312a.b(a6.length());
                                } catch (MalformedURLException unused3) {
                                    inputStream = inputStream3;
                                    try {
                                        try {
                                            a(-901, str);
                                            if (bVar.g()) {
                                                bVar2.a(-901);
                                            } else {
                                                bVar2.a(bVar.f(), -901);
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            int a52 = a(th);
                                            a(a52, str);
                                            a(c2, str, a52, currentTimeMillis, th);
                                            bVar2.a(a52);
                                            a(inputStream);
                                            a(httpURLConnection2);
                                        }
                                        a(inputStream);
                                        a(httpURLConnection2);
                                    } catch (Throwable th7) {
                                        th = th7;
                                        httpURLConnection = httpURLConnection2;
                                        a(inputStream);
                                        a(httpURLConnection);
                                        throw th;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    inputStream = inputStream3;
                                    httpURLConnection = httpURLConnection2;
                                    a(inputStream);
                                    a(httpURLConnection);
                                    throw th;
                                }
                            }
                            c0312a.a(System.currentTimeMillis() - currentTimeMillis);
                        }
                        inputStream2 = inputStream3;
                        a(a6, httpURLConnection2.getResponseCode(), str, bVar.f(), l, bVar2);
                    } else {
                        inputStream2 = inputStream3;
                        if (c0312a != null) {
                            c0312a.a(System.currentTimeMillis() - currentTimeMillis);
                        }
                        bVar2.a(bVar.f(), responseCode);
                    }
                } catch (MalformedURLException unused4) {
                    inputStream = inputStream3;
                    a(-901, str);
                    if (bVar.g()) {
                    }
                    a(inputStream);
                    a(httpURLConnection2);
                } catch (Throwable th9) {
                    th = th9;
                    th = th;
                    inputStream = inputStream3;
                    int a522 = a(th);
                    a(a522, str);
                    a(c2, str, a522, currentTimeMillis, th);
                    bVar2.a(a522);
                    a(inputStream);
                    a(httpURLConnection2);
                }
            } else {
                httpURLConnection2 = httpURLConnection;
                a(c2, str, responseCode, currentTimeMillis, null);
                bVar2.a(responseCode);
                inputStream2 = null;
            }
            inputStream = inputStream2;
        } catch (MalformedURLException unused5) {
            inputStream = null;
            a(-901, str);
            if (bVar.g()) {
            }
            a(inputStream);
            a(httpURLConnection2);
        } catch (Throwable th10) {
            th = th10;
            httpURLConnection = httpURLConnection2;
            inputStream = null;
            a(inputStream);
            a(httpURLConnection);
            throw th;
        }
        a(inputStream);
        a(httpURLConnection2);
    }
}
