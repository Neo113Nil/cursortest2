package n0;

import java.util.concurrent.CancellationException;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0704b extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public static final C0704b f7270d = new C0704b();

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(q.f7306b);
        return this;
    }
}
