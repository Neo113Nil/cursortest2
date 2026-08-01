package ke;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final transient je.f f5505d;

    public a(je.f fVar) {
        super("Flow was aborted, no more elements needed");
        this.f5505d = fVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
