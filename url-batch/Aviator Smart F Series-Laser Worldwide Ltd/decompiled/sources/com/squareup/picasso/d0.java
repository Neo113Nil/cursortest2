package com.squareup.picasso;

import android.annotation.TargetApi;
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
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import okio.ByteString;

/* loaded from: classes4.dex */
final class d0 {
    private static final int KEY_PADDING = 50;
    static final char KEY_SEPARATOR = '\n';
    private static final int MAX_DISK_CACHE_SIZE = 52428800;
    private static final int MIN_DISK_CACHE_SIZE = 5242880;
    static final String OWNER_DISPATCHER = "Dispatcher";
    static final String OWNER_HUNTER = "Hunter";
    static final String OWNER_MAIN = "Main";
    private static final String PICASSO_CACHE = "picasso-cache";
    static final String THREAD_IDLE_NAME = "Picasso-Idle";
    static final int THREAD_LEAK_CLEANING_MS = 1000;
    static final String THREAD_PREFIX = "Picasso-";
    static final String VERB_BATCHED = "batched";
    static final String VERB_CANCELED = "canceled";
    static final String VERB_CHANGED = "changed";
    static final String VERB_COMPLETED = "completed";
    static final String VERB_CREATED = "created";
    static final String VERB_DECODED = "decoded";
    static final String VERB_DELIVERED = "delivered";
    static final String VERB_ENQUEUED = "enqueued";
    static final String VERB_ERRORED = "errored";
    static final String VERB_EXECUTING = "executing";
    static final String VERB_IGNORED = "ignored";
    static final String VERB_JOINED = "joined";
    static final String VERB_PAUSED = "paused";
    static final String VERB_REMOVED = "removed";
    static final String VERB_REPLAYING = "replaying";
    static final String VERB_RESUMED = "resumed";
    static final String VERB_RETRYING = "retrying";
    static final String VERB_TRANSFORMED = "transformed";
    static final StringBuilder MAIN_THREAD_KEY_BUILDER = new StringBuilder();
    private static final ByteString WEBP_FILE_HEADER_RIFF = ByteString.encodeUtf8("RIFF");
    private static final ByteString WEBP_FILE_HEADER_WEBP = ByteString.encodeUtf8("WEBP");

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

    private d0() {
    }

    @TargetApi(18)
    static long calculateDiskCacheSize(File file) {
        long j8;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j8 = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j8 = 5242880;
        }
        return Math.max(Math.min(j8, 52428800L), CacheDataSink.DEFAULT_FRAGMENT_SIZE);
    }

    static int calculateMemoryCacheSize(Context context) {
        ActivityManager activityManager = (ActivityManager) getService(context, "activity");
        return (int) ((((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) / 7);
    }

    static void checkMain() {
        if (!isMain()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    static void checkNotMain() {
        if (isMain()) {
            throw new IllegalStateException("Method call should not happen from the main thread.");
        }
    }

    static <T> T checkNotNull(T t7, String str) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(str);
    }

    static File createDefaultCacheDir(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), PICASSO_CACHE);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static String createKey(u uVar) {
        StringBuilder sb = MAIN_THREAD_KEY_BUILDER;
        String createKey = createKey(uVar, sb);
        sb.setLength(0);
        return createKey;
    }

    static void flushStackLocalLeaks(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    static int getBitmapBytes(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    static String getLogIdsForHunter(com.squareup.picasso.c cVar) {
        return getLogIdsForHunter(cVar, "");
    }

    static int getResourceId(Resources resources, u uVar) {
        Uri uri;
        int i8 = uVar.resourceId;
        if (i8 != 0 || (uri = uVar.uri) == null) {
            return i8;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + uVar.uri);
        }
        List<String> pathSegments = uVar.uri.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            throw new FileNotFoundException("No path segments: " + uVar.uri);
        }
        if (pathSegments.size() == 1) {
            try {
                return Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new FileNotFoundException("Last path segment is not a resource ID: " + uVar.uri);
            }
        }
        if (pathSegments.size() == 2) {
            return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        }
        throw new FileNotFoundException("More than two path segments: " + uVar.uri);
    }

    static Resources getResources(Context context, u uVar) {
        Uri uri;
        if (uVar.resourceId != 0 || (uri = uVar.uri) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + uVar.uri);
        }
        try {
            return context.getPackageManager().getResourcesForApplication(authority);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new FileNotFoundException("Unable to obtain resources for package: " + uVar.uri);
        }
    }

    static <T> T getService(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    static boolean hasPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    static boolean isAirplaneModeOn(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }

    static boolean isMain() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    static boolean isWebPFile(okio.e eVar) {
        return eVar.rangeEquals(0L, WEBP_FILE_HEADER_RIFF) && eVar.rangeEquals(8L, WEBP_FILE_HEADER_WEBP);
    }

    static void log(String str, String str2, String str3) {
        log(str, str2, str3, "");
    }

    static String getLogIdsForHunter(com.squareup.picasso.c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        com.squareup.picasso.a action = cVar.getAction();
        if (action != null) {
            sb.append(action.request.logId());
        }
        List<com.squareup.picasso.a> actions = cVar.getActions();
        if (actions != null) {
            int size = actions.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (i8 > 0 || action != null) {
                    sb.append(", ");
                }
                sb.append(actions.get(i8).request.logId());
            }
        }
        return sb.toString();
    }

    static void log(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }

    static String createKey(u uVar, StringBuilder sb) {
        String str = uVar.stableKey;
        if (str != null) {
            sb.ensureCapacity(str.length() + 50);
            sb.append(uVar.stableKey);
        } else {
            Uri uri = uVar.uri;
            if (uri != null) {
                String uri2 = uri.toString();
                sb.ensureCapacity(uri2.length() + 50);
                sb.append(uri2);
            } else {
                sb.ensureCapacity(50);
                sb.append(uVar.resourceId);
            }
        }
        sb.append(KEY_SEPARATOR);
        if (uVar.rotationDegrees != 0.0f) {
            sb.append("rotation:");
            sb.append(uVar.rotationDegrees);
            if (uVar.hasRotationPivot) {
                sb.append('@');
                sb.append(uVar.rotationPivotX);
                sb.append('x');
                sb.append(uVar.rotationPivotY);
            }
            sb.append(KEY_SEPARATOR);
        }
        if (uVar.hasSize()) {
            sb.append("resize:");
            sb.append(uVar.targetWidth);
            sb.append('x');
            sb.append(uVar.targetHeight);
            sb.append(KEY_SEPARATOR);
        }
        if (uVar.centerCrop) {
            sb.append("centerCrop:");
            sb.append(uVar.centerCropGravity);
            sb.append(KEY_SEPARATOR);
        } else if (uVar.centerInside) {
            sb.append("centerInside");
            sb.append(KEY_SEPARATOR);
        }
        List<c0> list = uVar.transformations;
        if (list != null && list.size() > 0) {
            cn.hutool.core.convert.impl.s.a(uVar.transformations.get(0));
            throw null;
        }
        return sb.toString();
    }
}
