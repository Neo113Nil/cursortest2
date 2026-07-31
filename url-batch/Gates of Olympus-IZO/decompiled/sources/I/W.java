package I;

import h1.C0438i;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class W extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2220d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(String str, int i3) {
        super(str);
        this.f2220d = i3;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f2220d) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 1:
                setStackTrace(U.m.f3315a);
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                setStackTrace(new StackTraceElement[0]);
                break;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                setStackTrace(new StackTraceElement[0]);
                break;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                setStackTrace(n0.s.f6253a);
                break;
            default:
                setStackTrace(new StackTraceElement[0]);
                break;
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W() {
        super("The coroutine scope left the composition");
        this.f2220d = 0;
    }
}
