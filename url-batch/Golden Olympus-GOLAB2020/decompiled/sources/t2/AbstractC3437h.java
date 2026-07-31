package t2;

import java.util.Collection;
import java.util.ServiceLoader;
import o2.InterfaceC3314H;

/* renamed from: t2.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3437h {

    /* renamed from: a, reason: collision with root package name */
    private static final Collection f46229a = kotlin.sequences.k.D(kotlin.sequences.k.c(ServiceLoader.load(InterfaceC3314H.class, InterfaceC3314H.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f46229a;
    }

    public static final void b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
