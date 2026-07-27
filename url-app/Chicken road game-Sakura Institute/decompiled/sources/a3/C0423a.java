package a3;

import Z2.InterfaceC0331g;
import java.util.concurrent.CancellationException;

/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423a extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final transient InterfaceC0331g f4941d;

    public C0423a(InterfaceC0331g interfaceC0331g) {
        super("Flow was aborted, no more elements needed");
        this.f4941d = interfaceC0331g;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
