package com.baidu.mapsdkplatform.comapi.f.a;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;

/* loaded from: classes2.dex */
public class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private static int f8006a = 10240;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f8007b = false;

    /* renamed from: c, reason: collision with root package name */
    private String f8008c;

    /* renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f8009d;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final a f8010a = new a();
    }

    public static a a() {
        return b.f8010a;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (f8007b) {
            return;
        }
        f8007b = true;
        a(th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f8009d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    private a() {
        this.f8008c = "";
        this.f8009d = Thread.getDefaultUncaughtExceptionHandler();
    }

    protected void a(String str) {
        this.f8008c = str;
        if (Thread.getDefaultUncaughtExceptionHandler() instanceof a) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    private void a(Throwable th) {
        String str;
        if (th == null) {
            return;
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            Throwable cause = th.getCause();
            if (cause != null) {
                cause.printStackTrace(printWriter);
            }
            printWriter.close();
            String obj = stringWriter.toString();
            if (obj.isEmpty()) {
                return;
            }
            int length = obj.length();
            int i8 = f8006a;
            if (length > i8) {
                obj = obj.substring(0, i8);
            }
            if (obj.contains("BDMapSDKException")) {
                return;
            }
            if ((obj.contains("com.baidu.platform") || obj.contains("com.baidu.mapsdkplatform") || obj.contains("com.baidu.baidunavis") || obj.contains("com.baidu.navisdk") || obj.contains("com.baidu.navcore")) && (str = this.f8008c) != null && !str.isEmpty()) {
                com.baidu.mapsdkplatform.comapi.f.a.b.c().a(this.f8008c + (System.currentTimeMillis() / 1000) + ".txt", obj);
            }
        } catch (Exception unused) {
        }
    }
}
