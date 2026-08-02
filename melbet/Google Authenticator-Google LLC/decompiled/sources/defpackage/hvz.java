package defpackage;

import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hvz extends TimeoutException {
    public hvz(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
