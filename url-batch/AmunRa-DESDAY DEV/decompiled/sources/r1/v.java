package r1;

import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class v extends x1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f3616m;

    public v(w wVar) {
        this.f3616m = wVar;
    }

    @Override // x1.e
    public final void j() {
        this.f3616m.e(9);
        o oVar = this.f3616m.f3618b;
        synchronized (oVar) {
            long j2 = oVar.f3582n;
            long j3 = oVar.f3581m;
            if (j2 < j3) {
                return;
            }
            oVar.f3581m = j3 + 1;
            oVar.f3583o = System.nanoTime() + 1000000000;
            oVar.h.c(new n1.b(oVar.f3574c + " ping", oVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
