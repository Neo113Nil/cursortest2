package H4;

import java.util.concurrent.CancellationException;

/* renamed from: H4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0070a extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient G4.e f1161a;

    public C0070a(G4.e eVar) {
        super("Flow was aborted, no more elements needed");
        this.f1161a = eVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
