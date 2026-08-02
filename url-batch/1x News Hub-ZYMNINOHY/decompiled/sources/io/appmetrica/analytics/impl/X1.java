package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class X1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f6848e = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final Ma f6849a;

    /* renamed from: b, reason: collision with root package name */
    public final C0975y6 f6850b = C0585j4.l().n();

    /* renamed from: c, reason: collision with root package name */
    public final C0898v6 f6851c = new C0898v6();

    /* renamed from: d, reason: collision with root package name */
    public final Fn f6852d = new Fn();

    public X1(C0794r6 c0794r6) {
        this.f6849a = c0794r6;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        try {
            f6848e.set(true);
            Ma ma = this.f6849a;
            C0992yn apply = this.f6851c.apply(thread);
            Fn fn = this.f6852d;
            Thread a3 = fn.f6018a.a();
            ArrayList a4 = fn.a(a3, thread);
            if (thread != a3) {
                try {
                    stackTraceElementArr = fn.f6018a.b();
                    if (stackTraceElementArr == null) {
                        try {
                            stackTraceElementArr = a3.getStackTrace();
                        } catch (SecurityException unused) {
                        }
                    }
                } catch (SecurityException unused2) {
                    stackTraceElementArr = null;
                }
                a4.add(0, (C0992yn) fn.f6019b.apply(a3, stackTraceElementArr));
            }
            ma.a(th, new V(apply, a4, this.f6850b.f8635a.a()));
        } catch (Throwable th2) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th2, th2.getMessage(), new Object[0]);
        }
    }
}
