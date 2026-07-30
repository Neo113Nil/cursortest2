package com.baidu.mshield.x0.e;

import android.text.TextUtils;
import com.baidu.mshield.x0.d.d;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;

/* loaded from: classes2.dex */
public class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public static a f8451a = new a();

    /* renamed from: b, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f8452b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8453c;

    /* renamed from: d, reason: collision with root package name */
    public b f8454d;

    public static a a() {
        return f8451a;
    }

    public synchronized void b() {
        try {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f8452b;
            if (uncaughtExceptionHandler != null) {
                Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
                this.f8452b = null;
            }
        } finally {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            String a8 = a(th);
            if (!TextUtils.isEmpty(a8)) {
                if (!a8.contains("mshield")) {
                    if (!a8.contains("WebViewProvider")) {
                        if (a8.contains("createWebView")) {
                        }
                    }
                }
                b bVar = this.f8454d;
                if (bVar != null) {
                    bVar.a(a8);
                }
            }
        } catch (Throwable th2) {
            d.a(th2);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f8452b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public synchronized void a(b bVar) {
        this.f8454d = bVar;
        if (bVar == null) {
            return;
        }
        if (bVar.a()) {
            if (this.f8453c) {
                return;
            }
            this.f8453c = true;
            this.f8452b = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public final String a(Throwable th) {
        PrintWriter printWriter;
        try {
            StringWriter stringWriter = new StringWriter();
            printWriter = new PrintWriter(stringWriter);
            try {
                th.printStackTrace(printWriter);
                String obj = stringWriter.toString();
                printWriter.close();
                return obj;
            } catch (Throwable unused) {
                if (printWriter == null) {
                    return "";
                }
                printWriter.close();
                return "";
            }
        } catch (Throwable unused2) {
            printWriter = null;
        }
    }
}
