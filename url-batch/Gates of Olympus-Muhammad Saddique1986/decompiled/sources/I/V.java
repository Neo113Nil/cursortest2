package I;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class V extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2775d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(String str, int i3) {
        super(str);
        this.f2775d = i3;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f2775d) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 1:
                setStackTrace(U.a.f4460e);
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                setStackTrace(new StackTraceElement[0]);
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                setStackTrace(new StackTraceElement[0]);
                break;
            default:
                setStackTrace(n0.q.f7306b);
                break;
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V() {
        super("The coroutine scope left the composition");
        this.f2775d = 0;
    }
}
