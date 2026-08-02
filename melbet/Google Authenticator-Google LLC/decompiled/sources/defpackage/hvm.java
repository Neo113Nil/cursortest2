package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface hvm extends ScheduledExecutorService, hvl {
    hvk a(Runnable runnable, long j, TimeUnit timeUnit);

    hvk b(Callable callable, long j, TimeUnit timeUnit);

    hvk c(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    hvk d(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
