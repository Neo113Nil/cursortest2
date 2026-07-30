package com.baidu.location.b;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;

/* loaded from: classes2.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private static final Lock f4881a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    private OkHttpClient f4882b;

    /* renamed from: c, reason: collision with root package name */
    private String f4883c = null;

    class a implements Authenticator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4884a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f4885b;

        a(String str, String str2) {
            this.f4884a = str;
            this.f4885b = str2;
        }

        @Override // okhttp3.Authenticator
        public Request authenticate(Route route, Response response) {
            return response.request().newBuilder().header(HttpHeaders.PROXY_AUTHORIZATION, Credentials.basic(this.f4884a, this.f4885b)).build();
        }
    }

    public interface b {
        void a(int i8, String str);

        void a(int i8, String str, byte[] bArr);
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private static final t f4887a = new t();
    }

    t() {
        b();
    }

    public static t a() {
        return c.f4887a;
    }

    private synchronized void b() {
        try {
            if (this.f4882b == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                try {
                    String str = com.baidu.location.e.i.f5280m0;
                    int i8 = com.baidu.location.e.i.f5282n0;
                    if (!TextUtils.isEmpty(str) && i8 != -1) {
                        builder.proxy(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(str, i8)));
                        String str2 = com.baidu.location.e.i.f5284o0;
                        String str3 = com.baidu.location.e.i.f5286p0;
                        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                            builder.authenticator(new a(str2, str3));
                        }
                    }
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    this.f4882b = builder.connectTimeout(12000L, timeUnit).readTimeout(12000L, timeUnit).writeTimeout(12000L, timeUnit).dns(n.a().c()).build();
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private Request.Builder c() {
        Request.Builder builder = new Request.Builder();
        builder.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        String str = com.baidu.location.e.i.J;
        if (str != null) {
            builder.addHeader("bd-loc-android", str);
        }
        return builder;
    }

    private RequestBody a(Map<String, Object> map) {
        f4881a.lock();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            sb.append("&");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        MediaType parse = MediaType.parse("application/json;charset=UTF-8");
        String sb2 = sb.toString();
        f4881a.unlock();
        return RequestBody.create(parse, sb2);
    }

    public void a(String str) {
        this.f4883c = str;
    }

    public void a(Map<String, Object> map, String str, b bVar) {
        StringBuilder sb;
        int code;
        String message;
        try {
            RequestBody a8 = a(map);
            Request.Builder c8 = c();
            String str2 = this.f4883c;
            if (str2 != null) {
                c8.addHeader("alwd", str2);
            }
            Response execute = this.f4882b.newCall(c8.url(str).post(a8).build()).execute();
            if (!execute.isSuccessful()) {
                code = execute.code();
                message = execute.message();
            } else if (execute.body() != null) {
                bVar.a(200, execute.body().string(), new byte[1]);
                return;
            } else {
                message = execute.message();
                code = 400;
            }
            bVar.a(code, message);
        } catch (IOException e8) {
            e = e8;
            e.printStackTrace();
            if (bVar != null) {
                sb = new StringBuilder();
                sb.append("e=");
                sb.append(e.getMessage());
                bVar.a(-100, sb.toString());
            }
        } catch (Exception e9) {
            e = e9;
            if (bVar != null) {
                sb = new StringBuilder();
                sb.append("e=");
                sb.append(e.getMessage());
                bVar.a(-100, sb.toString());
            }
        }
    }
}
