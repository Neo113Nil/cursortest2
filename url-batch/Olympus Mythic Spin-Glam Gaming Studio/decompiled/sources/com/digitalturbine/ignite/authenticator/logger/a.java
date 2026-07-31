package com.digitalturbine.ignite.authenticator.logger;

/* loaded from: classes3.dex */
public final class a {
    public static final a b = new a();
    public ILogger a;

    public static void a(String str, Object... objArr) {
        ILogger iLogger = b.a;
        if (iLogger != null) {
            iLogger.d(str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        ILogger iLogger = b.a;
        if (iLogger != null) {
            iLogger.w(str, objArr);
        }
    }
}
