package com.facebook.internal.instrument;

import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.internal.Utility;
import defpackage.li0;
import defpackage.tp2;
import defpackage.yt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class InstrumentUtility {
    public static final String ANALYSIS_REPORT_PREFIX = "analysis_log_";
    public static final String ANR_REPORT_PREFIX = "anr_log_";
    private static final String CODELESS_PREFIX = "com.facebook.appevents.codeless";
    public static final String CRASH_REPORT_PREFIX = "crash_log_";
    public static final String CRASH_SHIELD_PREFIX = "shield_log_";
    public static final String ERROR_REPORT_PREFIX = "error_log_";
    private static final String FBSDK_PREFIX = "com.facebook";
    public static final InstrumentUtility INSTANCE = new InstrumentUtility();
    private static final String INSTRUMENT_DIR = "instrument";
    private static final String METASDK_PREFIX = "com.meta";
    private static final String SUGGESTED_EVENTS_PREFIX = "com.facebook.appevents.suggestedevents";
    public static final String THREAD_CHECK_PREFIX = "thread_check_log_";

    private InstrumentUtility() {
    }

    public static final boolean deleteFile(String str) {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null || str == null) {
            return false;
        }
        return new File(instrumentReportDir, str).delete();
    }

    public static final String getCause(Throwable th) {
        if (th == null) {
            return null;
        }
        return th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
    }

    public static final File getInstrumentReportDir() {
        File file = new File(FacebookSdk.getApplicationContext().getCacheDir(), INSTRUMENT_DIR);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static final String getStackTrace(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            stackTrace.getClass();
            for (StackTraceElement stackTraceElement : stackTrace) {
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    public static final boolean isFromFbOrMeta(StackTraceElement stackTraceElement) {
        stackTraceElement.getClass();
        String className = stackTraceElement.getClassName();
        className.getClass();
        if (tp2.o(className, "com.facebook", false)) {
            return true;
        }
        String className2 = stackTraceElement.getClassName();
        className2.getClass();
        return tp2.o(className2, METASDK_PREFIX, false);
    }

    public static final boolean isSDKRelatedException(Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            stackTrace.getClass();
            for (StackTraceElement stackTraceElement : stackTrace) {
                stackTraceElement.getClass();
                if (isFromFbOrMeta(stackTraceElement)) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    public static final boolean isSDKRelatedThread(Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                stackTraceElement.getClass();
                if (isFromFbOrMeta(stackTraceElement)) {
                    String className = stackTraceElement.getClassName();
                    className.getClass();
                    if (!tp2.o(className, CODELESS_PREFIX, false)) {
                        String className2 = stackTraceElement.getClassName();
                        className2.getClass();
                        if (!tp2.o(className2, SUGGESTED_EVENTS_PREFIX, false)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    methodName.getClass();
                    if (tp2.o(methodName, "onClick", false)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        methodName2.getClass();
                        if (tp2.o(methodName2, "onItemClick", false)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            methodName3.getClass();
                            if (!tp2.o(methodName3, "onTouch", false)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final File[] listAnrReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] listFiles = instrumentReportDir.listFiles(new li0(2));
        return listFiles == null ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listAnrReportFiles$lambda$1(File file, String str) {
        str.getClass();
        return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{ANR_REPORT_PREFIX}, 1))).a(str);
    }

    public static final File[] listExceptionAnalysisReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] listFiles = instrumentReportDir.listFiles(new li0(3));
        return listFiles == null ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listExceptionAnalysisReportFiles$lambda$2(File file, String str) {
        str.getClass();
        return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{ANALYSIS_REPORT_PREFIX}, 1))).a(str);
    }

    public static final File[] listExceptionReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] listFiles = instrumentReportDir.listFiles(new li0(1));
        return listFiles == null ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listExceptionReportFiles$lambda$3(File file, String str) {
        str.getClass();
        return new Regex(String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{CRASH_REPORT_PREFIX, CRASH_SHIELD_PREFIX, THREAD_CHECK_PREFIX}, 3))).a(str);
    }

    public static final JSONObject readFile(String str, boolean z) {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir != null && str != null) {
            try {
                return new JSONObject(Utility.readStreamToString(new FileInputStream(new File(instrumentReportDir, str))));
            } catch (Exception unused) {
                if (z) {
                    deleteFile(str);
                }
            }
        }
        return null;
    }

    public static final void sendReports(String str, JSONArray jSONArray, GraphRequest.Callback callback) {
        jSONArray.getClass();
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject dataProcessingOptions = Utility.getDataProcessingOptions();
            if (dataProcessingOptions != null) {
                Iterator<String> keys = dataProcessingOptions.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, dataProcessingOptions.get(next));
                }
            }
            GraphRequest.Companion.newPostRequest(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1)), jSONObject, callback).executeAsync();
        } catch (JSONException unused) {
        }
    }

    public static final void writeFile(String str, String str2) {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(instrumentReportDir, str));
            byte[] bytes = str2.getBytes(yt.b);
            bytes.getClass();
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    public static final String getStackTrace(Thread thread) {
        thread.getClass();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        stackTrace.getClass();
        for (StackTraceElement stackTraceElement : stackTrace) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }
}
