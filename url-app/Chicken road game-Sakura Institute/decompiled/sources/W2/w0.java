package W2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w0 extends b3.q implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final long f4298k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w0(long j4, x0 x0Var) {
        super(x0Var, r0);
        CoroutineContext coroutineContext = x0Var.f2311e;
        Intrinsics.c(coroutineContext);
        this.f4298k = j4;
    }

    @Override // W2.k0
    public final String W() {
        return super.W() + "(timeMillis=" + this.f4298k + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        F.b(this.f4246i);
        C(new v0("Timed out waiting for " + this.f4298k + " ms", this));
    }
}
