package v5;

import v5.k;

/* loaded from: classes.dex */
public final class l {
    public static final Object a(Throwable th) {
        kotlin.jvm.internal.i.d(th, "exception");
        return new k.b(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof k.b) {
            throw ((k.b) obj).f22833f;
        }
    }
}
