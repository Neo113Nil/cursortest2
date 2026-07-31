package o2;

import java.util.concurrent.CancellationException;
import n2.InterfaceC0701g;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0752a extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final transient InterfaceC0701g f6693d;

    public C0752a(InterfaceC0701g interfaceC0701g) {
        super("Flow was aborted, no more elements needed");
        this.f6693d = interfaceC0701g;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
