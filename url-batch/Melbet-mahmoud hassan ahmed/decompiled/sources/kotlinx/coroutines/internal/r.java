package kotlinx.coroutines.internal;

import java.util.List;
import m6.y1;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f18373a = true;

    private static final s a(Throwable th, String str) {
        if (f18373a) {
            return new s(th, str);
        }
        if (th != null) {
            throw th;
        }
        c();
        throw new v5.d();
    }

    static /* synthetic */ s b(Throwable th, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            th = null;
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final Void c() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final y1 d(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return a(th, mainDispatcherFactory.hintOnError());
        }
    }
}
