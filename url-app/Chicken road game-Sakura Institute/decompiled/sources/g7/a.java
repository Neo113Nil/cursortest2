package g7;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: f, reason: collision with root package name */
    public final transient Object f4475f;

    public a(f7.g gVar) {
        super("Flow was aborted, no more elements needed");
        this.f4475f = gVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
