package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class io1 extends CancellationException {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ io1(String str, int i) {
        super(str);
        this.m = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.m) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                break;
            default:
                setStackTrace(new StackTraceElement[0]);
                break;
        }
        return this;
    }
}
