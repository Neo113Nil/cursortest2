package K4;

import D4.AbstractC0020u;
import D4.P;
import I4.w;
import java.util.concurrent.Executor;
import k4.C1224j;
import k4.InterfaceC1223i;

/* loaded from: classes.dex */
public final class c extends P implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final c f1436c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC0020u f1437d;

    static {
        l lVar = l.f1453c;
        int i2 = w.f1325a;
        if (64 >= i2) {
            i2 = 64;
        }
        f1437d = lVar.F(I4.a.l("kotlinx.coroutines.io.parallelism", i2, 0, 0, 12));
    }

    @Override // D4.AbstractC0020u
    public final void C(InterfaceC1223i interfaceC1223i, Runnable runnable) {
        f1437d.C(interfaceC1223i, runnable);
    }

    @Override // D4.AbstractC0020u
    public final void D(InterfaceC1223i interfaceC1223i, Runnable runnable) {
        f1437d.D(interfaceC1223i, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C(C1224j.f10720a, runnable);
    }

    @Override // D4.AbstractC0020u
    public final String toString() {
        return "Dispatchers.IO";
    }
}
