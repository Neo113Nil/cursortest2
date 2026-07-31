package e7;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f2538d;

    public a(d7.g gVar) {
        super("Flow was aborted, no more elements needed");
        this.f2538d = gVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
