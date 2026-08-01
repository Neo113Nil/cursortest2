package y1;

import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class v extends E1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f4311m;

    public v(w wVar) {
        this.f4311m = wVar;
    }

    @Override // E1.e
    public final void j() {
        this.f4311m.e(9);
        o oVar = this.f4311m.f4313b;
        synchronized (oVar) {
            long j2 = oVar.f4277n;
            long j3 = oVar.f4276m;
            if (j2 < j3) {
                return;
            }
            oVar.f4276m = j3 + 1;
            oVar.f4278o = System.nanoTime() + 1000000000;
            oVar.h.c(new u1.b(oVar.f4269c + " ping", oVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
