package com.google.android.gms.internal.ads;

import java.lang.Thread;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.ye, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4233ye implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f35356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4287ze f35357c;

    public C4233ye(C4287ze c4287ze, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i) {
        this.f35355a = i;
        switch (i) {
            case 1:
                this.f35356b = uncaughtExceptionHandler;
                Objects.requireNonNull(c4287ze);
                this.f35357c = c4287ze;
                break;
            default:
                this.f35356b = uncaughtExceptionHandler;
                Objects.requireNonNull(c4287ze);
                this.f35357c = c4287ze;
                break;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        switch (this.f35355a) {
            case 0:
                uncaughtExceptionHandler = this.f35356b;
                try {
                    try {
                        this.f35357c.g(th);
                    } finally {
                    }
                } catch (Throwable unused) {
                    u2.i.c("AdMob exception reporter failed reporting the exception.");
                }
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    return;
                }
                return;
            default:
                uncaughtExceptionHandler = this.f35356b;
                try {
                    try {
                        this.f35357c.g(th);
                    } finally {
                    }
                } catch (Throwable unused2) {
                    u2.i.c("AdMob exception reporter failed reporting the exception.");
                }
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    return;
                }
                return;
        }
    }
}
