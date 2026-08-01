package v1;

import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class v extends B1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f4139m;

    public v(w wVar) {
        this.f4139m = wVar;
    }

    @Override // B1.e
    public final void j() {
        this.f4139m.e(9);
        o oVar = this.f4139m.f4141b;
        synchronized (oVar) {
            long j2 = oVar.f4105n;
            long j3 = oVar.f4104m;
            if (j2 < j3) {
                return;
            }
            oVar.f4104m = j3 + 1;
            oVar.f4106o = System.nanoTime() + 1000000000;
            oVar.h.c(new r1.b(oVar.f4097c + " ping", oVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
