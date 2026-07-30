package com.baidu.mapapi.http;

import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.baidu.mapsdkplatform.comapi.util.PermissionCheck;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class AsyncHttpClient {

    /* renamed from: a, reason: collision with root package name */
    private int f5448a = 10000;

    /* renamed from: b, reason: collision with root package name */
    private int f5449b = 10000;

    /* renamed from: c, reason: collision with root package name */
    private ExecutorService f5450c = Executors.newCachedThreadPool();

    class a extends b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HttpClient.ProtoResultCallback f5451a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f5452b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(HttpClient.ProtoResultCallback protoResultCallback, String str) {
            super(null);
            this.f5451a = protoResultCallback;
            this.f5452b = str;
        }

        @Override // com.baidu.mapapi.http.AsyncHttpClient.b
        public void b() {
            HttpClient httpClient = new HttpClient(HttpManager.HTTP_GET, this.f5451a);
            httpClient.setMaxTimeOut(AsyncHttpClient.this.f5448a);
            httpClient.setReadTimeOut(AsyncHttpClient.this.f5449b);
            httpClient.request(this.f5452b);
        }
    }

    private static abstract class b implements Runnable {
        private b() {
        }

        public abstract void b();

        @Override // java.lang.Runnable
        public void run() {
            b();
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public void get(String str, HttpClient.ProtoResultCallback protoResultCallback) {
        if (str == null) {
            throw new IllegalArgumentException("URI cannot be null");
        }
        this.f5450c.submit(new a(protoResultCallback, str));
    }

    protected boolean isAuthorized() {
        int permissionCheck = PermissionCheck.permissionCheck();
        return permissionCheck == 0 || permissionCheck == 602 || permissionCheck == 601;
    }
}
