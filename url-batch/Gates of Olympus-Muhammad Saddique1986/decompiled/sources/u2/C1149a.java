package u2;

import java.util.concurrent.CancellationException;
import t2.InterfaceC1054g;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1149a extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final transient InterfaceC1054g f9676d;

    public C1149a(InterfaceC1054g interfaceC1054g) {
        super("Flow was aborted, no more elements needed");
        this.f9676d = interfaceC1054g;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
