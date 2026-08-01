package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: GeckoConfig.java */
/* loaded from: classes.dex */
public class b {
    private static IThreadPoolCallback q;
    private static ThreadPoolExecutor r;
    public final Context a;
    final com.bykv.vk.openvk.preload.geckox.i.a b;
    public final IStatisticMonitor c;
    public final INetWork d;
    public final List<String> e;
    public final List<String> f;
    final com.bykv.vk.openvk.preload.geckox.a.a.a g;
    public final Long h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final File n;
    public final boolean o;
    public JSONObject p;

    /* synthetic */ b(a aVar, byte b) {
        this(aVar);
    }

    private b(a aVar) {
        Context context = aVar.d;
        this.a = context;
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        List<String> list = aVar.b;
        this.e = list;
        this.f = aVar.c;
        this.b = aVar.e;
        this.g = aVar.h;
        Long l = aVar.i;
        this.h = l;
        if (TextUtils.isEmpty(aVar.j)) {
            this.i = com.bykv.vk.openvk.preload.geckox.utils.a.a(context);
        } else {
            this.i = aVar.j;
        }
        String str = aVar.k;
        this.j = str;
        this.l = aVar.n;
        this.m = aVar.o;
        if (aVar.m == null) {
            this.n = new File(context.getFilesDir(), "gecko_offline_res_x");
        } else {
            this.n = aVar.m;
        }
        String str2 = aVar.l;
        this.k = str2;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("host == null");
        }
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        if (l == null) {
            throw new IllegalArgumentException("appId == null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("deviceId key empty");
        }
        this.d = aVar.a;
        this.c = aVar.f;
        this.o = aVar.g;
    }

    public static Executor a() {
        return c();
    }

    public static Executor b() {
        return c();
    }

    public static ExecutorService c() {
        IThreadPoolCallback iThreadPoolCallback = q;
        ExecutorService threadPool = iThreadPoolCallback != null ? iThreadPoolCallback.getThreadPool() : null;
        if (threadPool != null) {
            return threadPool;
        }
        if (r == null) {
            synchronized (b.class) {
                if (r == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    r = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return r;
    }

    public static void a(IThreadPoolCallback iThreadPoolCallback) {
        q = iThreadPoolCallback;
    }

    /* compiled from: GeckoConfig.java */
    public static class a {
        INetWork a;
        List<String> b;
        List<String> c;
        Context d;
        com.bykv.vk.openvk.preload.geckox.i.a e;
        IStatisticMonitor f;
        boolean g = true;
        com.bykv.vk.openvk.preload.geckox.a.a.a h;
        Long i;
        String j;
        String k;
        String l;
        File m;
        String n;
        String o;

        public a(Context context) {
            this.d = context.getApplicationContext();
        }
    }
}
