package G1;

import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class x extends M1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f457m;

    public x(y yVar) {
        this.f457m = yVar;
    }

    @Override // M1.e
    public final void j() {
        this.f457m.e(9);
        q qVar = this.f457m.f459b;
        synchronized (qVar) {
            long j2 = qVar.f423n;
            long j3 = qVar.f422m;
            if (j2 < j3) {
                return;
            }
            qVar.f422m = j3 + 1;
            qVar.f424o = System.nanoTime() + 1000000000;
            qVar.h.c(new C1.b(qVar.f415c + " ping", qVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
