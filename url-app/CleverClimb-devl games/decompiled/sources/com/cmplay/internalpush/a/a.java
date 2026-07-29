package com.cmplay.internalpush.a;

import android.annotation.TargetApi;
import android.os.AsyncTask;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: AsyncTasks.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static Executor f4164a;

    static {
        a();
    }

    @TargetApi(11)
    private static void a() {
        if (Build.VERSION.SDK_INT >= 11) {
            f4164a = AsyncTask.THREAD_POOL_EXECUTOR;
        } else {
            f4164a = Executors.newSingleThreadExecutor();
        }
    }

    @TargetApi(11)
    public static void a(AsyncTask<String, Void, Integer> asyncTask, String... strArr) {
        if (asyncTask != null) {
            if (Build.VERSION.SDK_INT >= 11) {
                asyncTask.executeOnExecutor(f4164a, strArr);
            } else {
                asyncTask.execute(strArr);
            }
        }
    }
}
