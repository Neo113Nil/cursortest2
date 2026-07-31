package com.huawei.hms.base.log;

import android.os.Process;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private String f13981b;

    /* renamed from: c, reason: collision with root package name */
    private String f13982c;

    /* renamed from: d, reason: collision with root package name */
    private int f13983d;

    /* renamed from: g, reason: collision with root package name */
    private String f13986g;

    /* renamed from: h, reason: collision with root package name */
    private int f13987h;

    /* renamed from: i, reason: collision with root package name */
    private int f13988i;

    /* renamed from: j, reason: collision with root package name */
    private int f13989j;

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f13980a = new StringBuilder();

    /* renamed from: e, reason: collision with root package name */
    private long f13984e = 0;

    /* renamed from: f, reason: collision with root package name */
    private long f13985f = 0;

    e(int i4, String str, int i5, String str2) {
        this.f13982c = "HMS";
        this.f13989j = i4;
        this.f13981b = str;
        this.f13983d = i5;
        if (str2 != null) {
            this.f13982c = str2;
        }
        b();
    }

    public static String a(int i4) {
        return i4 != 3 ? i4 != 4 ? i4 != 5 ? i4 != 6 ? String.valueOf(i4) : "E" : "W" : "I" : "D";
    }

    private e b() {
        this.f13984e = System.currentTimeMillis();
        Thread currentThread = Thread.currentThread();
        this.f13985f = currentThread.getId();
        this.f13987h = Process.myPid();
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        int length = stackTrace.length;
        int i4 = this.f13989j;
        if (length > i4) {
            StackTraceElement stackTraceElement = stackTrace[i4];
            this.f13986g = stackTraceElement.getFileName();
            this.f13988i = stackTraceElement.getLineNumber();
        }
        return this;
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        b(sb);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        b(sb);
        a(sb);
        return sb.toString();
    }

    public <T> e a(T t4) {
        this.f13980a.append(t4);
        return this;
    }

    public e a(Throwable th) {
        a((e) '\n').a((e) Log.getStackTraceString(th));
        return this;
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    private StringBuilder b(StringBuilder sb) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        sb.append('[');
        sb.append(simpleDateFormat.format(Long.valueOf(this.f13984e)));
        String a4 = a(this.f13983d);
        sb.append(' ');
        sb.append(a4);
        sb.append('/');
        sb.append(this.f13982c);
        sb.append('/');
        sb.append(this.f13981b);
        sb.append(' ');
        sb.append(this.f13987h);
        sb.append(':');
        sb.append(this.f13985f);
        sb.append(' ');
        sb.append(this.f13986g);
        sb.append(':');
        sb.append(this.f13988i);
        sb.append(']');
        return sb;
    }

    private StringBuilder a(StringBuilder sb) {
        sb.append(' ');
        sb.append(this.f13980a.toString());
        return sb;
    }
}
