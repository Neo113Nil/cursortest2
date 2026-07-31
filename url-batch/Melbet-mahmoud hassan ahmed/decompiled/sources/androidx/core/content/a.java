package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.io.File;
import java.util.concurrent.Executor;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f503a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f504b = new Object();

    /* renamed from: androidx.core.content.a$a, reason: collision with other inner class name */
    static class C0010a {
        static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    static class b {
        static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    static class c {
        static ComponentName a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    static class d {
        static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    public static File[] a(Context context) {
        return Build.VERSION.SDK_INT >= 19 ? b.a(context) : new File[]{context.getExternalCacheDir()};
    }

    public static File[] b(Context context, String str) {
        return Build.VERSION.SDK_INT >= 19 ? b.b(context, str) : new File[]{context.getExternalFilesDir(str)};
    }

    public static Executor c(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? d.a(context) : p.c.a(new Handler(context.getMainLooper()));
    }

    public static void d(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0010a.b(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    public static void e(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.a(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
