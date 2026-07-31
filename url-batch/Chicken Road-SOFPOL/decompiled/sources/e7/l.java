package e7;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2563d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, int i) {
        super(str);
        this.f2563d = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f2563d) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                break;
            default:
                setStackTrace(s.a.f6683a);
                break;
        }
        return this;
    }
}
