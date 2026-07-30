package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p extends CancellationException {
    public final transient Object m;

    public p(ym0 ym0Var) {
        super("Flow was aborted, no more elements needed");
        this.m = ym0Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
