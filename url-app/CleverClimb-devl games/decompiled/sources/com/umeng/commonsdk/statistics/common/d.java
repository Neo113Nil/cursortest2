package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Formatter;
import java.util.Locale;

/* compiled from: ULog.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f9145a = false;

    /* renamed from: b, reason: collision with root package name */
    private static String f9146b = "ULog";

    /* renamed from: c, reason: collision with root package name */
    private static final int f9147c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f9148d = 2;
    private static final int e = 3;
    private static final int f = 4;
    private static final int g = 5;
    private static int h = 2000;

    private d() {
    }

    public static void a(Locale locale, String str, Object... objArr) {
        try {
            c(f9146b, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            e(th);
        }
    }

    public static void b(Locale locale, String str, Object... objArr) {
        try {
            b(f9146b, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            e(th);
        }
    }

    public static void c(Locale locale, String str, Object... objArr) {
        try {
            e(f9146b, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            e(th);
        }
    }

    public static void d(Locale locale, String str, Object... objArr) {
        try {
            a(f9146b, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            e(th);
        }
    }

    public static void e(Locale locale, String str, Object... objArr) {
        try {
            d(f9146b, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            e(th);
        }
    }

    public static void a(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                c(f9146b, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                c(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            e(th);
        }
    }

    public static void b(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                b(f9146b, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                b(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            e(th);
        }
    }

    public static void c(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                e(f9146b, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                e(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            e(th);
        }
    }

    public static void d(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                a(f9146b, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                a(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            e(th);
        }
    }

    public static void e(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                d(f9146b, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                d(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            e(th);
        }
    }

    public static void a(Throwable th) {
        c(f9146b, (String) null, th);
    }

    public static void b(Throwable th) {
        a(f9146b, (String) null, th);
    }

    public static void c(Throwable th) {
        d(f9146b, (String) null, th);
    }

    public static void d(Throwable th) {
        b(f9146b, (String) null, th);
    }

    public static void e(Throwable th) {
        e(f9146b, (String) null, th);
    }

    public static void a(String str, Throwable th) {
        c(f9146b, str, th);
    }

    public static void b(String str, Throwable th) {
        a(f9146b, str, th);
    }

    public static void c(String str, Throwable th) {
        d(f9146b, str, th);
    }

    public static void d(String str, Throwable th) {
        b(f9146b, str, th);
    }

    public static void e(String str, Throwable th) {
        e(f9146b, str, th);
    }

    public static void a(String str) {
        a(f9146b, str, (Throwable) null);
    }

    public static void b(String str) {
        b(f9146b, str, (Throwable) null);
    }

    public static void c(String str) {
        c(f9146b, str, (Throwable) null);
    }

    public static void d(String str) {
        d(f9146b, str, (Throwable) null);
    }

    public static void e(String str) {
        e(f9146b, str, (Throwable) null);
    }

    public static void a(String str, String str2, Throwable th) {
        if (f9145a) {
            a(1, str, str2, th);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (f9145a) {
            a(2, str, str2, th);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        if (f9145a) {
            a(3, str, str2, th);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (f9145a) {
            a(4, str, str2, th);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (f9145a) {
            a(5, str, str2, th);
        }
    }

    private static void a(int i, String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str2)) {
            int length = str2.length();
            int i2 = h;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 < 100) {
                    if (length > i2) {
                        switch (i) {
                            case 1:
                                Log.v(str, str2.substring(i4, i2));
                                break;
                            case 2:
                                Log.d(str, str2.substring(i4, i2));
                                break;
                            case 3:
                                Log.i(str, str2.substring(i4, i2));
                                break;
                            case 4:
                                Log.w(str, str2.substring(i4, i2));
                                break;
                            case 5:
                                Log.e(str, str2.substring(i4, i2));
                                break;
                        }
                        i3++;
                        i4 = i2;
                        i2 = h + i2;
                    } else {
                        switch (i) {
                            case 1:
                                Log.v(str, str2.substring(i4, length));
                                break;
                            case 2:
                                Log.d(str, str2.substring(i4, length));
                                break;
                            case 3:
                                Log.i(str, str2.substring(i4, length));
                                break;
                            case 4:
                                Log.w(str, str2.substring(i4, length));
                                break;
                            case 5:
                                Log.e(str, str2.substring(i4, length));
                                break;
                        }
                    }
                }
            }
        }
        if (th != null) {
            String f2 = f(th);
            if (TextUtils.isEmpty(f2)) {
                return;
            }
            switch (i) {
                case 1:
                    Log.v(str, f2);
                    break;
                case 2:
                    Log.d(str, f2);
                    break;
                case 3:
                    Log.i(str, f2);
                    break;
                case 4:
                    Log.w(str, f2);
                    break;
                case 5:
                    Log.e(str, f2);
                    break;
            }
        }
    }

    public static String f(Throwable th) {
        StringWriter stringWriter;
        PrintWriter printWriter = null;
        try {
            stringWriter = new StringWriter();
            try {
                PrintWriter printWriter2 = new PrintWriter(stringWriter);
                try {
                    th.printStackTrace(printWriter2);
                    printWriter2.flush();
                    stringWriter.flush();
                    String stringWriter2 = stringWriter.toString();
                    try {
                        stringWriter.close();
                    } catch (Throwable unused) {
                    }
                    printWriter2.close();
                    return stringWriter2;
                } catch (Throwable unused2) {
                    printWriter = printWriter2;
                    if (stringWriter != null) {
                        try {
                            stringWriter.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    if (printWriter != null) {
                        printWriter.close();
                    }
                    return "";
                }
            } catch (Throwable unused4) {
            }
        } catch (Throwable unused5) {
            stringWriter = null;
        }
    }
}
