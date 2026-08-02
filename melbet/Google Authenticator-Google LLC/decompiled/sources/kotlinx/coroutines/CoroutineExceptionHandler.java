package kotlinx.coroutines;

import defpackage.ale;
import defpackage.kql;
import defpackage.kqn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface CoroutineExceptionHandler extends kql {
    public static final ale c = ale.b;

    void handleException(kqn kqnVar, Throwable th);
}
