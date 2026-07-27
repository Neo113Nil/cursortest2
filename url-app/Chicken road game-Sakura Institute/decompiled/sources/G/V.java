package G;

import java.util.concurrent.CancellationException;
import l0.AbstractC0819q;

/* loaded from: classes.dex */
public final class V extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2771d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(String str, int i2) {
        super(str);
        this.f2771d = i2;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f2771d) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 1:
                setStackTrace(S.a.f3951c);
                break;
            case 2:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 3:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 4:
                setStackTrace(AbstractC0819q.f7921b);
                break;
            default:
                setStackTrace(new StackTraceElement[0]);
                break;
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V() {
        super("The coroutine scope left the composition");
        this.f2771d = 0;
    }
}
