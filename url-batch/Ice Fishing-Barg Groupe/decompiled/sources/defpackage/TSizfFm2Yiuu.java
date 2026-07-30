package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class TSizfFm2Yiuu extends CancellationException {
    public final transient Object rtx2ld2ELZv4;

    public TSizfFm2Yiuu(w80 w80Var) {
        super("Flow was aborted, no more elements needed");
        this.rtx2ld2ELZv4 = w80Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
