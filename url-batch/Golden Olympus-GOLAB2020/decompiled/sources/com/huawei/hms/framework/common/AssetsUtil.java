package com.huawei.hms.framework.common;

import android.content.Context;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class AssetsUtil {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f14120a = ExecutorsUtils.newSingleThreadExecutor("AssetsUtil_Operate");

    public static String[] list(final Context context, final String str) {
        if (context == null) {
            Logger.w("AssetsUtil", "context is null");
            return new String[0];
        }
        FutureTask futureTask = new FutureTask(new Callable<String[]>() { // from class: com.huawei.hms.framework.common.AssetsUtil.1
            @Override // java.util.concurrent.Callable
            public String[] call() {
                return context.getAssets().list(str);
            }
        });
        f14120a.execute(futureTask);
        try {
            return (String[]) futureTask.get(5L, TimeUnit.SECONDS);
        } catch (TimeoutException unused) {
            Logger.w("AssetsUtil", "get local config files from sp task timed out");
            return new String[0];
        } catch (Exception unused2) {
            Logger.w("AssetsUtil", "get local config files from sp task occur unknown Exception");
            return new String[0];
        } catch (InterruptedException e4) {
            Logger.w("AssetsUtil", "get local config files from sp task interrupted", e4);
            return new String[0];
        } catch (ExecutionException e5) {
            Logger.w("AssetsUtil", "get local config files from sp task failed", e5);
            return new String[0];
        } finally {
            futureTask.cancel(true);
        }
    }

    public static InputStream open(Context context, String str) {
        if (context == null) {
            Logger.w("AssetsUtil", "context is null");
            return null;
        }
        try {
            return context.getAssets().open(str);
        } catch (RuntimeException e4) {
            Logger.e("AssetsUtil", "AssetManager has been destroyed", e4);
            return null;
        }
    }
}
