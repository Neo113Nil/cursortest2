package com.arthenica.ffmpegkit;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.SparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class FFmpegKitConfig {
    static final String FFMPEG_KIT_NAMED_PIPE_PREFIX = "fk_pipe_";
    static final String TAG = "ffmpeg-kit";
    private static Level activeLogLevel;
    private static int asyncConcurrencyLimit;
    private static ExecutorService asyncExecutorService;
    private static i globalFFmpegSessionCompleteCallback;
    private static k globalFFprobeSessionCompleteCallback;
    private static m globalLogCallback;
    private static LogRedirectionStrategy globalLogRedirectionStrategy;
    private static q globalMediaInformationSessionCompleteCallback;
    private static w globalStatisticsCallback;
    private static final SparseArray<b> safFileDescriptorMap;
    private static final SparseArray<b> safIdMap;
    private static final List<u> sessionHistoryList;
    private static final Object sessionHistoryLock;
    private static final Map<Long, u> sessionHistoryMap;
    private static int sessionHistorySize;
    private static final AtomicInteger uniqueIdGenerator;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$arthenica$ffmpegkit$Level;
        static final /* synthetic */ int[] $SwitchMap$com$arthenica$ffmpegkit$LogRedirectionStrategy;

        static {
            int[] iArr = new int[Level.values().length];
            $SwitchMap$com$arthenica$ffmpegkit$Level = iArr;
            try {
                iArr[Level.AV_LOG_QUIET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$arthenica$ffmpegkit$Level[Level.AV_LOG_TRACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$arthenica$ffmpegkit$Level[Level.AV_LOG_DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$arthenica$ffmpegkit$Level[Level.AV_LOG_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$arthenica$ffmpegkit$Level[Level.AV_LOG_WARNING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$arthenica$ffmpegkit$Level[Level.AV_LOG_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$arthenica$ffmpegkit$Level[Level.AV_LOG_FATAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$arthenica$ffmpegkit$Level[Level.AV_LOG_PANIC.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$arthenica$ffmpegkit$Level[Level.AV_LOG_STDERR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$arthenica$ffmpegkit$Level[Level.AV_LOG_VERBOSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr2 = new int[LogRedirectionStrategy.values().length];
            $SwitchMap$com$arthenica$ffmpegkit$LogRedirectionStrategy = iArr2;
            try {
                iArr2[LogRedirectionStrategy.NEVER_PRINT_LOGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$arthenica$ffmpegkit$LogRedirectionStrategy[LogRedirectionStrategy.PRINT_LOGS_WHEN_GLOBAL_CALLBACK_NOT_DEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$arthenica$ffmpegkit$LogRedirectionStrategy[LogRedirectionStrategy.PRINT_LOGS_WHEN_SESSION_CALLBACK_NOT_DEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$arthenica$ffmpegkit$LogRedirectionStrategy[LogRedirectionStrategy.PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$arthenica$ffmpegkit$LogRedirectionStrategy[LogRedirectionStrategy.ALWAYS_PRINT_LOGS.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    static class b {
        private final ContentResolver contentResolver;
        private final String openMode;
        private ParcelFileDescriptor parcelFileDescriptor;
        private final Integer safId;
        private final Uri uri;

        public b(Integer num, Uri uri, String str, ContentResolver contentResolver) {
            this.safId = num;
            this.uri = uri;
            this.openMode = str;
            this.contentResolver = contentResolver;
        }

        public ContentResolver getContentResolver() {
            return this.contentResolver;
        }

        public String getOpenMode() {
            return this.openMode;
        }

        public ParcelFileDescriptor getParcelFileDescriptor() {
            return this.parcelFileDescriptor;
        }

        public Integer getSafId() {
            return this.safId;
        }

        public Uri getUri() {
            return this.uri;
        }

        public void setParcelFileDescriptor(ParcelFileDescriptor parcelFileDescriptor) {
            this.parcelFileDescriptor = parcelFileDescriptor;
        }
    }

    static {
        com.arthenica.smartexception.java.a.registerRootPackage("com.arthenica");
        Log.i(TAG, "Loading ffmpeg-kit.");
        r.loadFFmpegKit(r.loadFFmpeg());
        uniqueIdGenerator = new AtomicInteger(1);
        activeLogLevel = Level.from(r.loadLogLevel());
        asyncConcurrencyLimit = 10;
        asyncExecutorService = Executors.newFixedThreadPool(10);
        sessionHistorySize = 10;
        sessionHistoryMap = new LinkedHashMap<Long, u>() { // from class: com.arthenica.ffmpegkit.FFmpegKitConfig.1
            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry<Long, u> entry) {
                return size() > FFmpegKitConfig.sessionHistorySize;
            }
        };
        sessionHistoryList = new LinkedList();
        sessionHistoryLock = new Object();
        globalLogCallback = null;
        globalStatisticsCallback = null;
        globalFFmpegSessionCompleteCallback = null;
        safIdMap = new SparseArray<>();
        safFileDescriptorMap = new SparseArray<>();
        globalLogRedirectionStrategy = LogRedirectionStrategy.PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED;
        Log.i(TAG, String.format("Loaded ffmpeg-kit-%s-%s-%s-%s.", r.loadPackageName(), r.loadAbi(), r.loadVersion(), r.loadBuildDate()));
    }

    private FFmpegKitConfig() {
    }

    static void addSession(u uVar) {
        synchronized (sessionHistoryLock) {
            try {
                Map<Long, u> map = sessionHistoryMap;
                if (!map.containsKey(Long.valueOf(uVar.getSessionId()))) {
                    map.put(Long.valueOf(uVar.getSessionId()), uVar);
                    sessionHistoryList.add(uVar);
                    deleteExpiredSessions();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String argumentsToString(String[] strArr) {
        if (strArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (i8 > 0) {
                sb.append(cn.hutool.core.text.l.SPACE);
            }
            sb.append(strArr[i8]);
        }
        return sb.toString();
    }

    public static void asyncFFmpegExecute(h hVar) {
        hVar.setFuture(asyncExecutorService.submit(new com.arthenica.ffmpegkit.b(hVar)));
    }

    public static void asyncFFprobeExecute(j jVar) {
        jVar.setFuture(asyncExecutorService.submit(new c(jVar)));
    }

    public static void asyncGetMediaInformationExecute(p pVar, int i8) {
        pVar.setFuture(asyncExecutorService.submit(new d(pVar, Integer.valueOf(i8))));
    }

    public static void clearSessions() {
        synchronized (sessionHistoryLock) {
            sessionHistoryList.clear();
            sessionHistoryMap.clear();
        }
    }

    public static void closeFFmpegPipe(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    private static void deleteExpiredSessions() {
        while (true) {
            List<u> list = sessionHistoryList;
            if (list.size() <= sessionHistorySize) {
                return;
            }
            try {
                u remove = list.remove(0);
                if (remove != null) {
                    sessionHistoryMap.remove(Long.valueOf(remove.getSessionId()));
                }
            } catch (IndexOutOfBoundsException unused) {
            }
        }
    }

    private static native void disableNativeRedirection();

    public static void disableRedirection() {
        disableNativeRedirection();
    }

    public static void enableFFmpegSessionCompleteCallback(i iVar) {
        globalFFmpegSessionCompleteCallback = iVar;
    }

    public static void enableFFprobeSessionCompleteCallback(k kVar) {
    }

    public static void enableLogCallback(m mVar) {
        globalLogCallback = mVar;
    }

    public static void enableMediaInformationSessionCompleteCallback(q qVar) {
    }

    private static native void enableNativeRedirection();

    public static void enableRedirection() {
        enableNativeRedirection();
    }

    public static void enableStatisticsCallback(w wVar) {
        globalStatisticsCallback = wVar;
    }

    static String extractExtensionFromSafDisplayName(String str) {
        try {
            return new StringTokenizer(str.lastIndexOf(".") >= 0 ? str.substring(str.lastIndexOf(".")) : str, " .").nextToken();
        } catch (Exception e8) {
            Log.w(TAG, String.format("Failed to extract extension from saf display name: %s.%s", str, com.arthenica.smartexception.java.a.getStackTraceString(e8)));
            return "raw";
        }
    }

    public static void ffmpegExecute(h hVar) {
        hVar.startRunning();
        try {
            hVar.complete(new t(nativeFFmpegExecute(hVar.getSessionId(), hVar.getArguments())));
        } catch (Exception e8) {
            hVar.fail(e8);
            Log.w(TAG, String.format("FFmpeg execute failed: %s.%s", argumentsToString(hVar.getArguments()), com.arthenica.smartexception.java.a.getStackTraceString(e8)));
        }
    }

    public static void ffprobeExecute(j jVar) {
        jVar.startRunning();
        try {
            jVar.complete(new t(nativeFFprobeExecute(jVar.getSessionId(), jVar.getArguments())));
        } catch (Exception e8) {
            jVar.fail(e8);
            Log.w(TAG, String.format("FFprobe execute failed: %s.%s", argumentsToString(jVar.getArguments()), com.arthenica.smartexception.java.a.getStackTraceString(e8)));
        }
    }

    public static int getAsyncConcurrencyLimit() {
        return asyncConcurrencyLimit;
    }

    public static String getBuildDate() {
        return getNativeBuildDate();
    }

    public static i getFFmpegSessionCompleteCallback() {
        return globalFFmpegSessionCompleteCallback;
    }

    public static List<h> getFFmpegSessions() {
        LinkedList linkedList = new LinkedList();
        synchronized (sessionHistoryLock) {
            try {
                for (u uVar : sessionHistoryList) {
                    if (uVar.isFFmpeg()) {
                        linkedList.add((h) uVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedList;
    }

    public static String getFFmpegVersion() {
        return getNativeFFmpegVersion();
    }

    public static k getFFprobeSessionCompleteCallback() {
        return null;
    }

    public static List<j> getFFprobeSessions() {
        LinkedList linkedList = new LinkedList();
        synchronized (sessionHistoryLock) {
            try {
                for (u uVar : sessionHistoryList) {
                    if (uVar.isFFprobe()) {
                        linkedList.add((j) uVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedList;
    }

    public static u getLastCompletedSession() {
        synchronized (sessionHistoryLock) {
            try {
                for (int size = sessionHistoryList.size() - 1; size >= 0; size--) {
                    u uVar = sessionHistoryList.get(size);
                    if (uVar.getState() == SessionState.COMPLETED) {
                        return uVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static u getLastSession() {
        synchronized (sessionHistoryLock) {
            try {
                List<u> list = sessionHistoryList;
                if (list.size() <= 0) {
                    return null;
                }
                return list.get(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Level getLogLevel() {
        return activeLogLevel;
    }

    public static LogRedirectionStrategy getLogRedirectionStrategy() {
        return globalLogRedirectionStrategy;
    }

    public static void getMediaInformationExecute(p pVar, int i8) {
        pVar.startRunning();
        try {
            t tVar = new t(nativeFFprobeExecute(pVar.getSessionId(), pVar.getArguments()));
            pVar.complete(tVar);
            if (tVar.isValueSuccess()) {
                List<l> allLogs = pVar.getAllLogs(i8);
                StringBuilder sb = new StringBuilder();
                int size = allLogs.size();
                for (int i9 = 0; i9 < size; i9++) {
                    l lVar = allLogs.get(i9);
                    if (lVar.getLevel() == Level.AV_LOG_STDERR) {
                        sb.append(lVar.getMessage());
                    }
                }
                pVar.setMediaInformation(o.fromWithError(sb.toString()));
            }
        } catch (Exception e8) {
            pVar.fail(e8);
            Log.w(TAG, String.format("Get media information execute failed: %s.%s", argumentsToString(pVar.getArguments()), com.arthenica.smartexception.java.a.getStackTraceString(e8)));
        }
    }

    public static q getMediaInformationSessionCompleteCallback() {
        return null;
    }

    public static List<p> getMediaInformationSessions() {
        LinkedList linkedList = new LinkedList();
        synchronized (sessionHistoryLock) {
            try {
                for (u uVar : sessionHistoryList) {
                    if (uVar.isMediaInformation()) {
                        linkedList.add((p) uVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedList;
    }

    private static native String getNativeBuildDate();

    private static native String getNativeFFmpegVersion();

    static native int getNativeLogLevel();

    private static native String getNativeVersion();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0030 A[Catch: all -> 0x002a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002a, blocks: (B:3:0x0002, B:7:0x0030, B:19:0x0029, B:22:0x0026, B:12:0x0011, B:14:0x0017, B:18:0x0021), top: B:2:0x0002, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getSafParameter(Context context, Uri uri, String str) {
        String string;
        try {
            Cursor query = context.getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        string = query.getString(query.getColumnIndex("_display_name"));
                        if (query != null) {
                            query.close();
                        }
                        int andIncrement = uniqueIdGenerator.getAndIncrement();
                        safIdMap.put(andIncrement, new b(Integer.valueOf(andIncrement), uri, str, context.getContentResolver()));
                        return "saf:" + andIncrement + "." + extractExtensionFromSafDisplayName(string);
                    }
                } finally {
                }
            }
            string = "unknown";
            if (query != null) {
            }
            int andIncrement2 = uniqueIdGenerator.getAndIncrement();
            safIdMap.put(andIncrement2, new b(Integer.valueOf(andIncrement2), uri, str, context.getContentResolver()));
            return "saf:" + andIncrement2 + "." + extractExtensionFromSafDisplayName(string);
        } catch (Throwable th) {
            Log.e(TAG, String.format("Failed to get %s column for %s.%s", "_display_name", uri.toString(), com.arthenica.smartexception.java.a.getStackTraceString(th)));
            throw th;
        }
    }

    public static String getSafParameterForRead(Context context, Uri uri) {
        return getSafParameter(context, uri, "r");
    }

    public static String getSafParameterForWrite(Context context, Uri uri) {
        return getSafParameter(context, uri, "w");
    }

    public static u getSession(long j8) {
        u uVar;
        synchronized (sessionHistoryLock) {
            uVar = sessionHistoryMap.get(Long.valueOf(j8));
        }
        return uVar;
    }

    public static int getSessionHistorySize() {
        return sessionHistorySize;
    }

    public static List<u> getSessions() {
        LinkedList linkedList;
        synchronized (sessionHistoryLock) {
            linkedList = new LinkedList(sessionHistoryList);
        }
        return linkedList;
    }

    public static List<u> getSessionsByState(SessionState sessionState) {
        LinkedList linkedList = new LinkedList();
        synchronized (sessionHistoryLock) {
            try {
                for (u uVar : sessionHistoryList) {
                    if (uVar.getState() == sessionState) {
                        linkedList.add(uVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedList;
    }

    public static List<String> getSupportedCameraIds(Context context) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            arrayList.addAll(e.extractSupportedCameraIds(context));
        }
        return arrayList;
    }

    public static String getVersion() {
        return isLTSBuild() ? String.format("%s-lts", getNativeVersion()) : getNativeVersion();
    }

    private static native void ignoreNativeSignal(int i8);

    public static void ignoreSignal(Signal signal) {
        ignoreNativeSignal(signal.getValue());
    }

    public static boolean isLTSBuild() {
        return AbiDetect.isNativeLTSBuild();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void log(long j8, int i8, byte[] bArr) {
        boolean z7;
        m mVar;
        int i9;
        Level from = Level.from(i8);
        String str = new String(bArr);
        l lVar = new l(j8, from, str);
        LogRedirectionStrategy logRedirectionStrategy = globalLogRedirectionStrategy;
        if ((activeLogLevel == Level.AV_LOG_QUIET && i8 != Level.AV_LOG_STDERR.getValue()) || i8 > activeLogLevel.getValue()) {
            return;
        }
        u session = getSession(j8);
        boolean z8 = false;
        if (session != null) {
            logRedirectionStrategy = session.getLogRedirectionStrategy();
            session.addLog(lVar);
            if (session.getLogCallback() != null) {
                try {
                    session.getLogCallback().apply(lVar);
                } catch (Exception e8) {
                    Log.e(TAG, String.format("Exception thrown inside session log callback.%s", com.arthenica.smartexception.java.a.getStackTraceString(e8)));
                }
                z7 = true;
                mVar = globalLogCallback;
                if (mVar != null) {
                    try {
                        mVar.apply(lVar);
                    } catch (Exception e9) {
                        Log.e(TAG, String.format("Exception thrown inside global log callback.%s", com.arthenica.smartexception.java.a.getStackTraceString(e9)));
                    }
                    z8 = true;
                }
                i9 = a.$SwitchMap$com$arthenica$ffmpegkit$LogRedirectionStrategy[logRedirectionStrategy.ordinal()];
                if (i9 == 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 == 4 && (z8 || z7)) {
                                return;
                            }
                        } else if (z7) {
                            return;
                        }
                    } else if (z8) {
                        return;
                    }
                    switch (a.$SwitchMap$com$arthenica$ffmpegkit$Level[from.ordinal()]) {
                        case 1:
                            break;
                        case 2:
                        case 3:
                            Log.d(TAG, str);
                            break;
                        case 4:
                            Log.i(TAG, str);
                            break;
                        case 5:
                            Log.w(TAG, str);
                            break;
                        case 6:
                        case 7:
                        case 8:
                            Log.e(TAG, str);
                            break;
                        default:
                            Log.v(TAG, str);
                            break;
                    }
                    return;
                }
                return;
            }
        }
        z7 = false;
        mVar = globalLogCallback;
        if (mVar != null) {
        }
        i9 = a.$SwitchMap$com$arthenica$ffmpegkit$LogRedirectionStrategy[logRedirectionStrategy.ordinal()];
        if (i9 == 1) {
        }
    }

    public static native int messagesInTransmit(long j8);

    static native void nativeFFmpegCancel(long j8);

    private static native int nativeFFmpegExecute(long j8, String[] strArr);

    static native int nativeFFprobeExecute(long j8, String[] strArr);

    public static String[] parseArguments(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        boolean z7 = false;
        boolean z8 = false;
        while (i8 < str.length()) {
            Character valueOf = i8 > 0 ? Character.valueOf(str.charAt(i8 - 1)) : null;
            char charAt = str.charAt(i8);
            if (charAt == ' ') {
                if (z7 || z8) {
                    sb.append(charAt);
                } else if (sb.length() > 0) {
                    arrayList.add(sb.toString());
                    sb = new StringBuilder();
                }
            } else if (charAt != '\'' || (valueOf != null && valueOf.charValue() == '\\')) {
                if (charAt != '\"' || (valueOf != null && valueOf.charValue() == '\\')) {
                    sb.append(charAt);
                } else if (z8) {
                    z8 = false;
                } else if (z7) {
                    sb.append(charAt);
                } else {
                    z8 = true;
                }
            } else if (z7) {
                z7 = false;
            } else if (z8) {
                sb.append(charAt);
            } else {
                z7 = true;
            }
            i8++;
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void printToLogcat(int i8, String str) {
        do {
            if (str.length() <= 4000) {
                Log.println(i8, TAG, str);
                str = "";
            } else {
                int lastIndexOf = str.substring(0, 4000).lastIndexOf(10);
                if (lastIndexOf < 0) {
                    Log.println(i8, TAG, str.substring(0, 4000));
                    str = str.substring(4000);
                } else {
                    Log.println(i8, TAG, str.substring(0, lastIndexOf));
                    str = str.substring(lastIndexOf);
                }
            }
        } while (str.length() > 0);
    }

    public static String registerNewFFmpegPipe(Context context) {
        File file = new File(context.getCacheDir(), "pipes");
        if (!file.exists() && !file.mkdirs()) {
            Log.e(TAG, String.format("Failed to create pipes directory: %s.", file.getAbsolutePath()));
            return null;
        }
        String format = MessageFormat.format("{0}{1}{2}{3}", file, File.separator, FFMPEG_KIT_NAMED_PIPE_PREFIX, Integer.valueOf(uniqueIdGenerator.getAndIncrement()));
        closeFFmpegPipe(format);
        int registerNewNativeFFmpegPipe = registerNewNativeFFmpegPipe(format);
        if (registerNewNativeFFmpegPipe == 0) {
            return format;
        }
        Log.e(TAG, String.format("Failed to register new FFmpeg pipe %s. Operation failed with rc=%d.", format, Integer.valueOf(registerNewNativeFFmpegPipe)));
        return null;
    }

    private static native int registerNewNativeFFmpegPipe(String str);

    private static int safClose(int i8) {
        try {
            SparseArray<b> sparseArray = safFileDescriptorMap;
            b bVar = sparseArray.get(i8);
            if (bVar != null) {
                ParcelFileDescriptor parcelFileDescriptor = bVar.getParcelFileDescriptor();
                if (parcelFileDescriptor != null) {
                    sparseArray.delete(i8);
                    safIdMap.delete(bVar.getSafId().intValue());
                    parcelFileDescriptor.close();
                    return 1;
                }
                Log.e(TAG, String.format("ParcelFileDescriptor for SAF fd %d not found.", Integer.valueOf(i8)));
            } else {
                Log.e(TAG, String.format("SAF fd %d not found.", Integer.valueOf(i8)));
            }
        } catch (Throwable th) {
            Log.e(TAG, String.format("Failed to close SAF fd: %d.%s", Integer.valueOf(i8), com.arthenica.smartexception.java.a.getStackTraceString(th)));
        }
        return 0;
    }

    private static int safOpen(int i8) {
        b bVar;
        try {
            bVar = safIdMap.get(i8);
        } catch (Throwable th) {
            Log.e(TAG, String.format("Failed to open SAF id: %d.%s", Integer.valueOf(i8), com.arthenica.smartexception.java.a.getStackTraceString(th)));
        }
        if (bVar == null) {
            Log.e(TAG, String.format("SAF id %d not found.", Integer.valueOf(i8)));
            return 0;
        }
        ParcelFileDescriptor openFileDescriptor = bVar.getContentResolver().openFileDescriptor(bVar.getUri(), bVar.getOpenMode());
        bVar.setParcelFileDescriptor(openFileDescriptor);
        int fd = openFileDescriptor.getFd();
        safFileDescriptorMap.put(fd, bVar);
        return fd;
    }

    public static String sessionStateToString(SessionState sessionState) {
        return sessionState.toString();
    }

    public static void setAsyncConcurrencyLimit(int i8) {
        if (i8 > 0) {
            asyncConcurrencyLimit = i8;
            ExecutorService executorService = asyncExecutorService;
            asyncExecutorService = Executors.newFixedThreadPool(i8);
            executorService.shutdown();
        }
    }

    public static int setEnvironmentVariable(String str, String str2) {
        return setNativeEnvironmentVariable(str, str2);
    }

    public static void setFontDirectory(Context context, String str, Map<String, String> map) {
        setFontDirectoryList(context, Collections.singletonList(str), map);
    }

    public static void setFontDirectoryList(Context context, List<String> list, Map<String, String> map) {
        int i8;
        Object obj;
        File file = new File(context.getCacheDir(), "fontconfig");
        if (!file.exists()) {
            Log.d(TAG, String.format("Created temporary font conf directory: %s.", Boolean.valueOf(file.mkdirs())));
        }
        File file2 = new File(file, "fonts.conf");
        if (file2.exists()) {
            Log.d(TAG, String.format("Deleted old temporary font configuration: %s.", Boolean.valueOf(file2.delete())));
        }
        StringBuilder sb = new StringBuilder("");
        if (map == null || map.size() <= 0) {
            i8 = 0;
        } else {
            map.entrySet();
            i8 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null && key.trim().length() > 0 && value.trim().length() > 0) {
                    sb.append("    <match target=\"pattern\">\n");
                    sb.append("        <test qual=\"any\" name=\"family\">\n");
                    sb.append(String.format("            <string>%s</string>\n", key));
                    sb.append("        </test>\n");
                    sb.append("        <edit name=\"family\" mode=\"assign\" binding=\"same\">\n");
                    sb.append(String.format("            <string>%s</string>\n", value));
                    sb.append("        </edit>\n");
                    sb.append("    </match>\n");
                    i8++;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<?xml version=\"1.0\"?>\n");
        sb2.append("<!DOCTYPE fontconfig SYSTEM \"fonts.dtd\">\n");
        sb2.append("<fontconfig>\n");
        sb2.append("    <dir prefix=\"cwd\">.</dir>\n");
        for (String str : list) {
            sb2.append("    <dir>");
            sb2.append(str);
            sb2.append("</dir>\n");
        }
        sb2.append((CharSequence) sb);
        sb2.append("</fontconfig>\n");
        AtomicReference atomicReference = new AtomicReference();
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    atomicReference.set(fileOutputStream);
                    fileOutputStream.write(sb2.toString().getBytes());
                    fileOutputStream.flush();
                    Log.d(TAG, String.format("Saved new temporary font configuration with %d font name mappings.", Integer.valueOf(i8)));
                    setFontconfigConfigurationPath(file.getAbsolutePath());
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        Log.d(TAG, String.format("Font directory %s registered successfully.", it.next()));
                    }
                } catch (IOException e8) {
                    Log.e(TAG, String.format("Failed to set font directory: %s.%s", Arrays.toString(list.toArray()), com.arthenica.smartexception.java.a.getStackTraceString(e8)));
                    if (atomicReference.get() == null) {
                        return;
                    } else {
                        obj = atomicReference.get();
                    }
                }
                if (atomicReference.get() != null) {
                    obj = atomicReference.get();
                    ((FileOutputStream) obj).close();
                }
            } catch (Throwable th) {
                if (atomicReference.get() != null) {
                    try {
                        ((FileOutputStream) atomicReference.get()).close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
        }
    }

    public static int setFontconfigConfigurationPath(String str) {
        return setNativeEnvironmentVariable("FONTCONFIG_PATH", str);
    }

    public static void setLogLevel(Level level) {
        if (level != null) {
            activeLogLevel = level;
            setNativeLogLevel(level.getValue());
        }
    }

    public static void setLogRedirectionStrategy(LogRedirectionStrategy logRedirectionStrategy) {
        globalLogRedirectionStrategy = logRedirectionStrategy;
    }

    private static native int setNativeEnvironmentVariable(String str, String str2);

    private static native void setNativeLogLevel(int i8);

    public static void setSessionHistorySize(int i8) {
        if (i8 >= 1000) {
            throw new IllegalArgumentException("Session history size must not exceed the hard limit!");
        }
        if (i8 > 0) {
            sessionHistorySize = i8;
            deleteExpiredSessions();
        }
    }

    private static void statistics(long j8, int i8, float f8, float f9, long j9, double d8, double d9, double d10) {
        v vVar = new v(j8, i8, f8, f9, j9, d8, d9, d10);
        u session = getSession(j8);
        if (session != null && session.isFFmpeg()) {
            h hVar = (h) session;
            hVar.addStatistics(vVar);
            if (hVar.getStatisticsCallback() != null) {
                try {
                    hVar.getStatisticsCallback().apply(vVar);
                } catch (Exception e8) {
                    Log.e(TAG, String.format("Exception thrown inside session statistics callback.%s", com.arthenica.smartexception.java.a.getStackTraceString(e8)));
                }
            }
        }
        w wVar = globalStatisticsCallback;
        if (wVar != null) {
            try {
                wVar.apply(vVar);
            } catch (Exception e9) {
                Log.e(TAG, String.format("Exception thrown inside global statistics callback.%s", com.arthenica.smartexception.java.a.getStackTraceString(e9)));
            }
        }
    }

    public static void asyncFFmpegExecute(h hVar, ExecutorService executorService) {
        hVar.setFuture(executorService.submit(new com.arthenica.ffmpegkit.b(hVar)));
    }

    public static void asyncFFprobeExecute(j jVar, ExecutorService executorService) {
        jVar.setFuture(executorService.submit(new c(jVar)));
    }

    public static void asyncGetMediaInformationExecute(p pVar, ExecutorService executorService, int i8) {
        pVar.setFuture(executorService.submit(new d(pVar, Integer.valueOf(i8))));
    }
}
