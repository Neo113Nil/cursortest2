package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class O1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f10734e = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final Fa f10735a;

    /* renamed from: b, reason: collision with root package name */
    public final C0916r6 f10736b = C0501b4.l().n();

    /* renamed from: c, reason: collision with root package name */
    public final C0839o6 f10737c = new C0839o6();

    /* renamed from: d, reason: collision with root package name */
    public final Dn f10738d = new Dn();

    public O1(C0735k6 c0735k6) {
        this.f10735a = c0735k6;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        try {
            f10734e.set(true);
            Fa fa = this.f10735a;
            C1063wn apply = this.f10737c.apply(thread);
            Dn dn = this.f10738d;
            Thread a3 = dn.f10224a.a();
            ArrayList a4 = dn.a(a3, thread);
            if (thread != a3) {
                try {
                    stackTraceElementArr = dn.f10224a.b();
                    if (stackTraceElementArr == null) {
                        try {
                            stackTraceElementArr = a3.getStackTrace();
                        } catch (SecurityException unused) {
                        }
                    }
                } catch (SecurityException unused2) {
                    stackTraceElementArr = null;
                }
                a4.add(0, (C1063wn) dn.f10225b.apply(a3, stackTraceElementArr));
            }
            fa.a(th, new V(apply, a4, this.f10736b.f12649a.a()));
        } catch (Throwable th2) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th2, th2.getMessage(), new Object[0]);
        }
    }
}
