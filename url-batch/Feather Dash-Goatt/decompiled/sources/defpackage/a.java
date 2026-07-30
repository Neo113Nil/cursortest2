package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class a extends CancellationException {
    public final transient Object d;

    public a(d00 d00Var) {
        super("Flow was aborted, no more elements needed");
        this.d = d00Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
