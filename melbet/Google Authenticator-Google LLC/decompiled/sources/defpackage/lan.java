package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lan extends CancellationException {
    public final transient Object a;

    public lan(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.a = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (kvo.a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
