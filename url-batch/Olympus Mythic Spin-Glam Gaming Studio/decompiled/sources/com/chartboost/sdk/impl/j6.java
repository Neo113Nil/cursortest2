package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.impl.c4;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.database.DefaultDatabaseProvider;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.scheduler.PlatformScheduler;
import com.google.android.exoplayer2.scheduler.Scheduler;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheEvictor;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class j6 {
    public static final Cache a(g8 fileCaching, DatabaseProvider databaseProvider, lk cachePolicy, c4.b evictorCallback, CacheEvictor evictor) {
        Intrinsics.checkNotNullParameter(fileCaching, "fileCaching");
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        Intrinsics.checkNotNullParameter(cachePolicy, "cachePolicy");
        Intrinsics.checkNotNullParameter(evictorCallback, "evictorCallback");
        Intrinsics.checkNotNullParameter(evictor, "evictor");
        return new SimpleCache(fileCaching.b(), evictor, databaseProvider);
    }

    public static final File b(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        File precacheDir = new v8(context.getCacheDir()).h;
        Intrinsics.checkNotNullExpressionValue(precacheDir, "precacheDir");
        return precacheDir;
    }

    public static final File c(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        File precacheQueueDir = new v8(context.getCacheDir()).i;
        Intrinsics.checkNotNullExpressionValue(precacheQueueDir, "precacheQueueDir");
        return precacheQueueDir;
    }

    public static /* synthetic */ Cache a(g8 g8Var, DatabaseProvider databaseProvider, lk lkVar, c4.b bVar, CacheEvictor cacheEvictor, int i, Object obj) {
        if ((i & 16) != 0) {
            cacheEvictor = new c4(lkVar.b(), bVar, null, 4, null);
        }
        return a(g8Var, databaseProvider, lkVar, bVar, cacheEvictor);
    }

    public static final CacheDataSource.Factory a(Cache cache, HttpDataSource.Factory httpDataSourceFactory) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(httpDataSourceFactory, "httpDataSourceFactory");
        CacheDataSource.Factory cacheWriteDataSinkFactory = new CacheDataSource.Factory().setCache(cache).setUpstreamDataSourceFactory(httpDataSourceFactory).setCacheWriteDataSinkFactory(null);
        Intrinsics.checkNotNullExpressionValue(cacheWriteDataSinkFactory, "setCacheWriteDataSinkFactory(...)");
        return cacheWriteDataSinkFactory;
    }

    public static final DatabaseProvider a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new DefaultDatabaseProvider(new j8(context, null, null, 0, 14, null));
    }

    public static final DownloadManager a(Context context, DatabaseProvider databaseProvider, Cache cache, HttpDataSource.Factory httpDataSourceFactory, DownloadManager.Listener listener, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(httpDataSourceFactory, "httpDataSourceFactory");
        Intrinsics.checkNotNullParameter(listener, "listener");
        DownloadManager downloadManager = new DownloadManager(context, databaseProvider, cache, httpDataSourceFactory, Executors.newFixedThreadPool(i));
        downloadManager.setMaxParallelDownloads(i2);
        downloadManager.addListener(listener);
        return downloadManager;
    }

    public static /* synthetic */ DownloadManager a(Context context, DatabaseProvider databaseProvider, Cache cache, HttpDataSource.Factory factory, DownloadManager.Listener listener, int i, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i = 2;
        }
        int i4 = i;
        if ((i3 & 64) != 0) {
            i2 = 1;
        }
        return a(context, databaseProvider, cache, factory, listener, i4, i2);
    }

    public static /* synthetic */ LoadControl a(int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 500;
        }
        if ((i3 & 2) != 0) {
            i2 = 50000;
        }
        return a(i, i2);
    }

    public static final Scheduler a(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Util.SDK_INT >= 21) {
            return new PlatformScheduler(context, i);
        }
        return null;
    }

    public static /* synthetic */ Scheduler a(Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return a(context, i);
    }

    public static final MediaSource.Factory a(DataSource.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<this>");
        return new DefaultMediaSourceFactory(factory);
    }

    public static final void a() {
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
        CookieHandler.setDefault(cookieManager);
    }

    public static final LoadControl a(int i, int i2) {
        DefaultLoadControl build = new DefaultLoadControl.Builder().setBufferDurationsMs(i, i2, i, i).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
