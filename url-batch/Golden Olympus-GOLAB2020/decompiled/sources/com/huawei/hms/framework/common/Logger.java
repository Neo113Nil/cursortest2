package com.huawei.hms.framework.common;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import org.json.JSONException;

/* loaded from: classes.dex */
public class Logger {

    /* renamed from: a, reason: collision with root package name */
    private static ExtLogger f14137a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f14138b = true;

    /* renamed from: c, reason: collision with root package name */
    private static int f14139c = 2;

    private static class ThrowableWrapper extends Throwable {

        /* renamed from: b, reason: collision with root package name */
        private String f14140b;

        /* renamed from: c, reason: collision with root package name */
        private Throwable f14141c;

        /* renamed from: d, reason: collision with root package name */
        private Throwable f14142d;

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void a(Throwable th) {
            this.f14141c = th;
        }

        @Override // java.lang.Throwable
        public synchronized Throwable getCause() {
            Throwable th;
            th = this.f14141c;
            if (th == this) {
                th = null;
            }
            return th;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f14140b;
        }

        public void setMessage(String str) {
            this.f14140b = str;
        }

        @Override // java.lang.Throwable
        public String toString() {
            Throwable th = this.f14142d;
            if (th == null) {
                return "";
            }
            String name = th.getClass().getName();
            if (this.f14140b == null) {
                return name;
            }
            String str = name + ": ";
            if (this.f14140b.startsWith(str)) {
                return this.f14140b;
            }
            return str + this.f14140b;
        }

        private ThrowableWrapper(Throwable th) {
            this.f14142d = th;
            StackTraceElement[] stackTrace = th.getStackTrace();
            int i4 = ((th instanceof IOException) || (th instanceof JSONException)) ? 8 : 20;
            if (stackTrace.length > i4) {
                setStackTrace((StackTraceElement[]) Arrays.copyOf(stackTrace, i4));
            } else {
                setStackTrace(stackTrace);
            }
            setMessage(StringUtils.anonymizeMessage(th.getMessage()));
        }
    }

    private static String a(String str) {
        return "NetworkSdk_" + str;
    }

    private static String b(String str, int i4) {
        if (TextUtils.isEmpty(str)) {
            return h(i4);
        }
        String h4 = h(i4);
        if (TextUtils.isEmpty(h4)) {
            return str;
        }
        return h4 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str;
    }

    private static String c(String str) {
        return "NK_" + str;
    }

    public static void d(String str, Object obj) {
        println(3, str, obj);
    }

    public static void e(String str, Object obj) {
        println(6, str, obj);
    }

    private static void f(int i4, String str, String str2) {
        if (i4 == 2) {
            f14137a.v(str, str2);
            return;
        }
        if (i4 == 3) {
            f14137a.d(str, str2);
            return;
        }
        if (i4 == 4) {
            f14137a.i(str, str2);
        } else if (i4 == 5) {
            f14137a.w(str, str2);
        } else {
            if (i4 != 6) {
                return;
            }
            f14137a.e(str, str2);
        }
    }

    private static String g(int i4) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= i4) {
            return "";
        }
        StackTraceElement stackTraceElement = stackTrace[i4];
        return Thread.currentThread().getName() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + stackTraceElement.getClassName().replace("com.huawei.hms.network.", "").replace("com.huawei.hms.framework.", "") + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + stackTraceElement.getLineNumber();
    }

    private static String h(int i4) {
        return !Log.isLoggable("NK_", 3) ? g(i4 + 1) : j(i4 + 1);
    }

    public static void i(String str, Object obj) {
        println(4, str, obj);
    }

    public static boolean isLoggable(int i4) {
        return Log.isLoggable("NK_", i4);
    }

    private static String j(int i4) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= i4) {
            return "";
        }
        StackTraceElement stackTraceElement = stackTrace[i4];
        return Thread.currentThread().getName() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + stackTraceElement.getFileName() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + stackTraceElement.getClassName() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + stackTraceElement.getMethodName() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + stackTraceElement.getLineNumber();
    }

    private static boolean k(int i4) {
        return f14137a != null && i4 >= 3;
    }

    private static boolean l(int i4) {
        return f14138b && isLoggable(i4);
    }

    private static int m(int i4, String str, String str2) {
        if (i4 < f14139c) {
            return 1;
        }
        if (k(i4)) {
            f(i4, a(str), b(str2, 7));
        }
        if (l(i4)) {
            return Log.println(i4, c(str), b(str2, 7));
        }
        return 1;
    }

    public static void println(int i4, String str, Object obj) {
        if (i4 < 3) {
            return;
        }
        m(i4, str, obj == null ? "null" : obj.toString());
    }

    public static void setExtLogger(ExtLogger extLogger, boolean z4) {
        f14137a = extLogger;
        f14138b = z4;
        i("NK_Logger", "logger = " + extLogger + z4);
    }

    public static void setLogEnableLevel(int i4) {
        f14139c = i4;
        Log.i("NK_Logger", "setLogEnableLevel: " + i4);
    }

    public static void v(String str, String str2, Object... objArr) {
        println(2, str, str2, objArr);
    }

    public static void w(String str, Object obj) {
        println(5, str, obj);
    }

    public static void d(String str, String str2, Object... objArr) {
        println(3, str, str2, objArr);
    }

    public static void e(String str, String str2, Object... objArr) {
        println(6, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        println(4, str, str2, objArr);
    }

    public static void println(int i4, String str, String str2, Object... objArr) {
        if (i4 < 3) {
            return;
        }
        if (str2 == null) {
            Log.w("NK_Logger", "format is null, not log");
            return;
        }
        try {
            m(i4, str, StringUtils.format(str2, objArr));
        } catch (IllegalFormatException e4) {
            w("NK_Logger", "log format error" + str2, e4);
        }
    }

    public static void v(String str, Object obj) {
        println(2, str, obj);
    }

    public static void w(String str, String str2, Object... objArr) {
        println(5, str, str2, objArr);
    }

    public static void e(String str, String str2, Throwable th) {
        if (6 < f14139c) {
            return;
        }
        if (k(6)) {
            f14137a.e(a(str), b(str2, 5), i(th));
        }
        if (f14138b) {
            Log.e(c(str), b(str2, 5), i(th));
        }
    }

    private static Throwable i(Throwable th) {
        if (isLoggable(3)) {
            return th;
        }
        if (th == null) {
            return null;
        }
        ThrowableWrapper throwableWrapper = new ThrowableWrapper(th);
        Throwable cause = th.getCause();
        ThrowableWrapper throwableWrapper2 = throwableWrapper;
        while (cause != null) {
            ThrowableWrapper throwableWrapper3 = new ThrowableWrapper(cause);
            throwableWrapper2.a(throwableWrapper3);
            cause = cause.getCause();
            throwableWrapper2 = throwableWrapper3;
        }
        return throwableWrapper;
    }

    public static void w(String str, String str2, Throwable th) {
        if (5 < f14139c) {
            return;
        }
        if (k(5)) {
            f14137a.w(a(str), b(str2, 5), i(th));
        }
        if (f14138b) {
            Log.w(c(str), b(str2, 5), i(th));
        }
    }
}
