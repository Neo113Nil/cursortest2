package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class U1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f38342e = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2488ab f38343a;

    /* renamed from: b, reason: collision with root package name */
    public final M6 f38344b = C3082x4.l().n();

    /* renamed from: c, reason: collision with root package name */
    public final K6 f38345c = new K6();

    /* renamed from: d, reason: collision with root package name */
    public final An f38346d = new An();

    public U1(G6 g6) {
        this.f38343a = g6;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        try {
            f38342e.set(true);
            InterfaceC2488ab interfaceC2488ab = this.f38343a;
            C2997tn apply = this.f38345c.apply(thread);
            An an = this.f38346d;
            Thread a4 = an.f37192a.a();
            ArrayList a5 = an.a(a4, thread);
            if (thread != a4) {
                try {
                    stackTraceElementArr = an.f37192a.b();
                    if (stackTraceElementArr == null) {
                        try {
                            stackTraceElementArr = a4.getStackTrace();
                        } catch (SecurityException unused) {
                        }
                    }
                } catch (SecurityException unused2) {
                    stackTraceElementArr = null;
                }
                a5.add(0, (C2997tn) an.f37193b.apply(a4, stackTraceElementArr));
            }
            interfaceC2488ab.a(th, new U(apply, a5, this.f38344b.b()));
        } catch (Throwable th2) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th2, th2.getMessage(), new Object[0]);
        }
    }
}
