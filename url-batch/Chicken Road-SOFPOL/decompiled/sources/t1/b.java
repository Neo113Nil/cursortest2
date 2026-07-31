package t1;

import java.util.concurrent.CancellationException;
import u0.h;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class b extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6895d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i) {
        super(str);
        this.f6895d = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f6895d) {
            case 0:
                setStackTrace(c.f6896a);
                break;
            case 1:
                setStackTrace(h.f7152a);
                break;
            default:
                setStackTrace(w.b.f7500a);
                break;
        }
        return this;
    }
}
