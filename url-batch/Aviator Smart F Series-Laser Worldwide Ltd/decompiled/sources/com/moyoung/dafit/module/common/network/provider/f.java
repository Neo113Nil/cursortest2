package com.moyoung.dafit.module.common.network.provider;

import android.content.Context;
import android.os.Environment;
import androidx.annotation.NonNull;
import com.moyoung.dafit.module.common.utils.ServerLanguageUtil;
import java.io.File;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public class f {
    public static final int CACHE_SIZE = 104857600;
    private static final long CONNECTION_TIME = 100;

    private f() {
    }

    public static void addCacheInterceptor(OkHttpClient.Builder builder) {
        Context context = com.moyoung.dafit.module.common.utils.d.get();
        if (context == null) {
            return;
        }
        builder.addInterceptor(c.REWRITE_RESPONSE_INTERCEPTOR_OFFLINE).addNetworkInterceptor(c.REWRITE_RESPONSE_INTERCEPTOR).cache(new Cache(getNetworkCacheDirFile(context), 104857600L));
    }

    public static void addHeaderInterceptor(OkHttpClient.Builder builder) {
        builder.addInterceptor(new Interceptor() { // from class: com.moyoung.dafit.module.common.network.provider.e
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Response lambda$addHeaderInterceptor$0;
                lambda$addHeaderInterceptor$0 = f.lambda$addHeaderInterceptor$0(chain);
                return lambda$addHeaderInterceptor$0;
            }
        });
    }

    private static File getNetworkCacheDirFile(Context context) {
        File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "NetworkCache");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    @NonNull
    public static OkHttpClient getOkHttpClient(String str) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(CONNECTION_TIME, timeUnit);
        builder.readTimeout(CONNECTION_TIME, timeUnit);
        builder.writeTimeout(CONNECTION_TIME, timeUnit);
        addHeaderInterceptor(builder, str);
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Response lambda$addHeaderInterceptor$0(Interceptor.Chain chain) {
        Request request = chain.request();
        return chain.proceed(request.newBuilder().addHeader("Accept-Language", ServerLanguageUtil.getRequestLanguage()).method(request.method(), request.body()).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Response lambda$addHeaderInterceptor$1(String str, Interceptor.Chain chain) {
        Request request = chain.request();
        return chain.proceed(request.newBuilder().addHeader("Authorization", str).addHeader("Accept-Language", ServerLanguageUtil.getRequestLanguage()).method(request.method(), request.body()).build());
    }

    public static void addHeaderInterceptor(OkHttpClient.Builder builder, final String str) {
        builder.addInterceptor(new Interceptor() { // from class: com.moyoung.dafit.module.common.network.provider.d
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Response lambda$addHeaderInterceptor$1;
                lambda$addHeaderInterceptor$1 = f.lambda$addHeaderInterceptor$1(str, chain);
                return lambda$addHeaderInterceptor$1;
            }
        });
    }

    @NonNull
    public static OkHttpClient getOkHttpClient() {
        return getOkHttpClient(false);
    }

    @NonNull
    public static OkHttpClient getOkHttpClient(boolean z7) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(CONNECTION_TIME, timeUnit);
        builder.readTimeout(CONNECTION_TIME, timeUnit);
        builder.writeTimeout(CONNECTION_TIME, timeUnit);
        addHeaderInterceptor(builder);
        if (z7) {
            addCacheInterceptor(builder);
        }
        return builder.build();
    }
}
