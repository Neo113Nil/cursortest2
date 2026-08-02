package N3;

import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class x extends T3.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f1930m;

    public x(y yVar) {
        this.f1930m = yVar;
    }

    @Override // T3.e
    public final void j() {
        this.f1930m.e(EnumC0078b.CANCEL);
        q qVar = this.f1930m.f1932b;
        synchronized (qVar) {
            long j4 = qVar.n;
            long j5 = qVar.f1892m;
            if (j4 < j5) {
                return;
            }
            qVar.f1892m = j5 + 1;
            qVar.o = System.nanoTime() + 1000000000;
            qVar.f1887h.c(new J3.b(kotlin.jvm.internal.i.h(" ping", qVar.f1882c), qVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
