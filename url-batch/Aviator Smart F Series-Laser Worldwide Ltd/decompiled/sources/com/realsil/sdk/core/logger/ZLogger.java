package com.realsil.sdk.core.logger;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import cn.hutool.core.io.file.c;
import com.realsil.sdk.core.g.a;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class ZLogger {
    public static final int ASSET = 6;
    public static final int DEBUG = 2;
    public static final int ERROR = 5;
    public static int GLOBAL_LOG_LEVEL = 1;
    public static final int INFO = 3;
    public static boolean LOG_ENABLED = false;
    public static final int NA = 0;
    public static final int VERBOSE = 1;
    public static final int WARN = 4;

    /* renamed from: a, reason: collision with root package name */
    public static String f15687a = "Realtek";

    /* renamed from: b, reason: collision with root package name */
    public static int f15688b;

    /* renamed from: c, reason: collision with root package name */
    public static Logger f15689c = new a();

    public static void a(int i8, String str, String str2) {
        if (f15689c == null) {
            return;
        }
        int max = Math.max(i8, GLOBAL_LOG_LEVEL);
        if ((max & 6) == 6 && f15688b <= 6) {
            f15689c.log(6, str, str2);
            return;
        }
        if ((max & 5) == 5 && f15688b <= 5) {
            f15689c.log(5, str, str2);
            return;
        }
        if ((max & 4) == 4 && f15688b <= 4) {
            f15689c.log(4, str, str2);
            return;
        }
        if ((max & 3) == 3 && f15688b <= 3) {
            f15689c.log(3, str, str2);
            return;
        }
        if ((max & 2) == 2 && f15688b <= 2) {
            f15689c.log(2, str, str2);
        } else {
            if ((max & 1) != 1 || f15688b > 1) {
                return;
            }
            f15689c.log(1, str, str2);
        }
    }

    public static void b(int i8, String str, String str2) {
        if (str2.length() <= 1024) {
            a(i8, str, str2);
            return;
        }
        a(i8, str, str2.substring(0, 1024));
        int length = str2.length() - 1024;
        String substring = str2.substring(1024);
        if (length > 1024) {
            b(i8, str, substring);
        } else {
            a(i8, str, substring);
        }
    }

    public static void d(String str) {
        a(LOG_ENABLED, 2, f15687a, str);
    }

    public static void e(String str) {
        a(LOG_ENABLED, 5, f15687a, str);
    }

    public static void i(String str) {
        a(LOG_ENABLED, 3, f15687a, str);
    }

    public static void initialize(String str, boolean z7) {
        initialize(str, z7, 1);
    }

    public static void setConsoleLogLevel(int i8) {
        GLOBAL_LOG_LEVEL = i8;
    }

    public static void setFilterLogLevel(int i8) {
        f15688b = i8;
    }

    public static void setLogger(@NonNull Logger logger) {
        f15689c = logger;
    }

    public static void v(String str) {
        a(LOG_ENABLED, 1, f15687a, str);
    }

    public static void w(String str) {
        a(LOG_ENABLED, 4, f15687a, str);
    }

    public static void a(boolean z7, int i8, String str, Object obj) {
        String[] strArr;
        String str2;
        if (z7) {
            Object[] objArr = {obj};
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace == null || stackTrace.length < 6) {
                strArr = null;
            } else {
                String className = stackTrace[5].getClassName();
                String[] split = className.split("\\.");
                if (split.length > 0) {
                    className = split[split.length - 1] + c.EXT_JAVA;
                }
                if (className.contains("$")) {
                    className = className.split("\\$")[0] + c.EXT_JAVA;
                }
                String methodName = stackTrace[5].getMethodName();
                int lineNumber = stackTrace[5].getLineNumber();
                if (lineNumber < 0) {
                    lineNumber = 0;
                }
                String str3 = methodName.substring(0, 1).toUpperCase() + methodName.substring(1);
                String str4 = str == null ? className : str;
                if (TextUtils.isEmpty(str4)) {
                    str4 = f15687a;
                }
                String obj2 = objArr[0].toString();
                Locale locale = Locale.US;
                strArr = new String[]{str4, obj2, "[ (" + className + ":" + lineNumber + ")#" + str3 + " ]"};
            }
            if (strArr == null || strArr.length < 3) {
                str2 = (String) obj;
            } else {
                str = strArr[0];
                String str5 = strArr[1];
                str2 = strArr[2] + str5;
            }
            b(i8, str, str2);
        }
    }

    public static void d(boolean z7, String str) {
        a(z7, 2, f15687a, str);
    }

    public static void e(boolean z7, String str) {
        a(z7, 5, f15687a, str);
    }

    public static void i(boolean z7, String str) {
        a(z7, 3, f15687a, str);
    }

    public static void initialize(String str, boolean z7, int i8) {
        f15687a = str;
        LOG_ENABLED = z7;
        GLOBAL_LOG_LEVEL = i8;
    }

    public static void v(boolean z7, String str) {
        a(z7, 1, f15687a, str);
    }

    public static void w(boolean z7, String str) {
        a(z7, 4, f15687a, str);
    }

    public static void d(boolean z7, String str, String str2) {
        a(z7, 2, str, str2);
    }

    public static void e(boolean z7, String str, String str2) {
        a(z7, 5, str, str2);
    }

    public static void i(boolean z7, String str, String str2) {
        a(z7, 3, str, str2);
    }

    public static void v(boolean z7, String str, String str2) {
        a(z7, 1, str, str2);
    }

    public static void w(boolean z7, String str, String str2) {
        a(z7, 4, str, str2);
    }
}
