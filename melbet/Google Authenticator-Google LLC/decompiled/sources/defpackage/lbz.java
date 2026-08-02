package defpackage;

import java.util.Collection;
import java.util.Collections;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbz {
    public static final Collection a;

    static {
        CoroutineExceptionHandler.class.getClassLoader();
        a = ksl.e(ksl.c(new yt(Collections.singletonList(AndroidExceptionPreHandler.class.getDeclaredConstructor(null).newInstance(null)).iterator(), 3)));
    }

    public static final void a(Throwable th) {
        Thread currentThread = Thread.currentThread();
        try {
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        } catch (Throwable unused) {
        }
    }
}
