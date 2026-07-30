package com.drake.net;

import android.content.Context;
import com.drake.net.interfaces.b;
import f6.l;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.s;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpUtils;
import okhttp3.internal.cache.DiskLruCache;
import y5.w;

/* loaded from: classes3.dex */
public final class NetConfig {
    public static Context app;
    private static com.drake.net.cache.a forceCache;
    private static com.drake.net.interceptor.a requestInterceptor;
    public static final NetConfig INSTANCE = new NetConfig();
    private static String host = "";
    private static OkHttpClient okHttpClient = q4.a.toNetOkhttp(new OkHttpClient.Builder()).build();
    private static boolean debug = true;
    private static String TAG = "NET_LOG";
    private static ConcurrentLinkedQueue<WeakReference<Call>> runningCalls = new ConcurrentLinkedQueue<>();
    private static com.drake.net.convert.a converter = com.drake.net.convert.a.DEFAULT;
    private static b errorHandler = b.DEFAULT;
    private static com.drake.net.interfaces.a dialogFactory = com.drake.net.interfaces.a.DEFAULT;

    private NetConfig() {
    }

    public static /* synthetic */ void initialize$default(NetConfig netConfig, String str, Context context, l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = "";
        }
        if ((i8 & 2) != 0) {
            context = null;
        }
        if ((i8 & 4) != 0) {
            lVar = new l() { // from class: com.drake.net.NetConfig$initialize$1
                public final void invoke(OkHttpClient.Builder builder) {
                    s.checkNotNullParameter(builder, "$this$null");
                }

                @Override // f6.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((OkHttpClient.Builder) obj2);
                    return w.INSTANCE;
                }
            };
        }
        netConfig.initialize(str, context, lVar);
    }

    public final Context getApp() {
        Context context = app;
        if (context != null) {
            return context;
        }
        s.throwUninitializedPropertyAccessException("app");
        return null;
    }

    public final com.drake.net.convert.a getConverter() {
        return converter;
    }

    public final boolean getDebug() {
        return debug;
    }

    public final com.drake.net.interfaces.a getDialogFactory() {
        return dialogFactory;
    }

    public final b getErrorHandler() {
        return errorHandler;
    }

    public final com.drake.net.cache.a getForceCache$net_release() {
        return forceCache;
    }

    public final String getHost() {
        return host;
    }

    public final OkHttpClient getOkHttpClient() {
        return okHttpClient;
    }

    public final com.drake.net.interceptor.a getRequestInterceptor() {
        return null;
    }

    public final ConcurrentLinkedQueue<WeakReference<Call>> getRunningCalls() {
        return runningCalls;
    }

    public final String getTAG() {
        return TAG;
    }

    public final void initialize(String host2, Context context, l config) {
        s.checkNotNullParameter(host2, "host");
        s.checkNotNullParameter(config, "config");
        host = host2;
        if (context != null) {
            INSTANCE.setApp(context);
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        config.invoke(builder);
        setOkHttpClient(q4.a.toNetOkhttp(builder).build());
    }

    public final void setApp(Context context) {
        s.checkNotNullParameter(context, "<set-?>");
        app = context;
    }

    public final void setConverter(com.drake.net.convert.a aVar) {
        s.checkNotNullParameter(aVar, "<set-?>");
        converter = aVar;
    }

    public final void setDebug(boolean z7) {
        debug = z7;
    }

    public final void setDialogFactory(com.drake.net.interfaces.a aVar) {
        s.checkNotNullParameter(aVar, "<set-?>");
        dialogFactory = aVar;
    }

    public final void setErrorHandler(b bVar) {
        s.checkNotNullParameter(bVar, "<set-?>");
        errorHandler = bVar;
    }

    public final void setForceCache$net_release(com.drake.net.cache.a aVar) {
        forceCache = aVar;
    }

    public final void setHost(String str) {
        s.checkNotNullParameter(str, "<set-?>");
        host = str;
    }

    public final void setOkHttpClient(OkHttpClient value) {
        com.drake.net.cache.a aVar;
        s.checkNotNullParameter(value, "value");
        OkHttpClient netOkhttp = q4.b.toNetOkhttp(value);
        okHttpClient = netOkhttp;
        Cache cache = netOkhttp.cache();
        if (cache != null) {
            DiskLruCache diskLruCache = OkHttpUtils.diskLruCache(cache);
            s.checkNotNullExpressionValue(diskLruCache, "diskLruCache(it)");
            aVar = new com.drake.net.cache.a(diskLruCache);
        } else {
            aVar = null;
        }
        forceCache = aVar;
    }

    public final void setRequestInterceptor(com.drake.net.interceptor.a aVar) {
    }

    public final void setTAG(String str) {
        s.checkNotNullParameter(str, "<set-?>");
        TAG = str;
    }

    public static /* synthetic */ void initialize$default(NetConfig netConfig, String str, Context context, OkHttpClient.Builder builder, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = "";
        }
        if ((i8 & 2) != 0) {
            context = null;
        }
        netConfig.initialize(str, context, builder);
    }

    public final void initialize(String host2, Context context, OkHttpClient.Builder config) {
        s.checkNotNullParameter(host2, "host");
        s.checkNotNullParameter(config, "config");
        host = host2;
        if (context != null) {
            INSTANCE.setApp(context);
        }
        setOkHttpClient(q4.a.toNetOkhttp(config).build());
    }
}
