package x2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient w2.e f10770a;

    public a(w2.e eVar) {
        super("Flow was aborted, no more elements needed");
        this.f10770a = eVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
