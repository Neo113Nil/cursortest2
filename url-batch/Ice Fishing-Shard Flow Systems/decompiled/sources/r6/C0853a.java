package r6;

import java.util.concurrent.CancellationException;

/* renamed from: r6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0853a extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f7541d;

    public C0853a(q6.e eVar) {
        super("Flow was aborted, no more elements needed");
        this.f7541d = eVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
