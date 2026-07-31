package com.squareup.picasso;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
abstract class y {

    /* renamed from: a, reason: collision with root package name */
    static final StringBuilder f21877a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    private static final okio.h f21878b = okio.h.f("RIFF");

    /* renamed from: c, reason: collision with root package name */
    private static final okio.h f21879c = okio.h.f("WEBP");

    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    private static class b extends Thread {
        b(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    static class c implements ThreadFactory {
        c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new b(runnable);
        }
    }

    static long a(File file) {
        long j4;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j4 = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j4 = 5242880;
        }
        return Math.max(Math.min(j4, 52428800L), 5242880L);
    }

    static int b(Context context) {
        ActivityManager activityManager = (ActivityManager) n(context, "activity");
        return (int) ((((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * 1048576) / 7);
    }

    static void c() {
        if (!q()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    static Object d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    static File e(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static String f(t tVar) {
        StringBuilder sb = f21877a;
        String g4 = g(tVar, sb);
        sb.setLength(0);
        return g4;
    }

    static String g(t tVar, StringBuilder sb) {
        String str = tVar.f21810f;
        if (str != null) {
            sb.ensureCapacity(str.length() + 50);
            sb.append(tVar.f21810f);
        } else {
            Uri uri = tVar.f21808d;
            if (uri != null) {
                String uri2 = uri.toString();
                sb.ensureCapacity(uri2.length() + 50);
                sb.append(uri2);
            } else {
                sb.ensureCapacity(50);
                sb.append(tVar.f21809e);
            }
        }
        sb.append('\n');
        if (tVar.f21818n != 0.0f) {
            sb.append("rotation:");
            sb.append(tVar.f21818n);
            if (tVar.f21821q) {
                sb.append('@');
                sb.append(tVar.f21819o);
                sb.append('x');
                sb.append(tVar.f21820p);
            }
            sb.append('\n');
        }
        if (tVar.c()) {
            sb.append("resize:");
            sb.append(tVar.f21812h);
            sb.append('x');
            sb.append(tVar.f21813i);
            sb.append('\n');
        }
        if (tVar.f21814j) {
            sb.append("centerCrop:");
            sb.append(tVar.f21815k);
            sb.append('\n');
        } else if (tVar.f21816l) {
            sb.append("centerInside");
            sb.append('\n');
        }
        List list = tVar.f21811g;
        if (list == null || list.size() <= 0) {
            return sb.toString();
        }
        android.support.v4.media.session.b.a(tVar.f21811g.get(0));
        throw null;
    }

    static void h(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    static int i(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    static String j(com.squareup.picasso.c cVar) {
        return k(cVar, "");
    }

    static String k(com.squareup.picasso.c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        com.squareup.picasso.a h4 = cVar.h();
        if (h4 != null) {
            sb.append(h4.f21656b.d());
        }
        List i4 = cVar.i();
        if (i4 != null) {
            int size = i4.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (i5 > 0 || h4 != null) {
                    sb.append(", ");
                }
                sb.append(((com.squareup.picasso.a) i4.get(i5)).f21656b.d());
            }
        }
        return sb.toString();
    }

    static int l(Resources resources, t tVar) {
        Uri uri;
        int i4 = tVar.f21809e;
        if (i4 != 0 || (uri = tVar.f21808d) == null) {
            return i4;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + tVar.f21808d);
        }
        List<String> pathSegments = tVar.f21808d.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            throw new FileNotFoundException("No path segments: " + tVar.f21808d);
        }
        if (pathSegments.size() == 1) {
            try {
                return Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new FileNotFoundException("Last path segment is not a resource ID: " + tVar.f21808d);
            }
        }
        if (pathSegments.size() == 2) {
            return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        }
        throw new FileNotFoundException("More than two path segments: " + tVar.f21808d);
    }

    static Resources m(Context context, t tVar) {
        Uri uri;
        if (tVar.f21809e != 0 || (uri = tVar.f21808d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + tVar.f21808d);
        }
        try {
            return context.getPackageManager().getResourcesForApplication(authority);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new FileNotFoundException("Unable to obtain resources for package: " + tVar.f21808d);
        }
    }

    static Object n(Context context, String str) {
        return context.getSystemService(str);
    }

    static boolean o(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    static boolean p(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    static boolean q() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    static boolean r(okio.g gVar) {
        return gVar.D(0L, f21878b) && gVar.D(8L, f21879c);
    }

    static void s(String str, String str2, String str3) {
        t(str, str2, str3, "");
    }

    static void t(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }
}
