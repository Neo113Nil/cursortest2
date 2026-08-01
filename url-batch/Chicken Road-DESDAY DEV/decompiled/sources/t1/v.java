package t1;

import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class v extends z1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f3837m;

    public v(w wVar) {
        this.f3837m = wVar;
    }

    @Override // z1.e
    public final void j() {
        this.f3837m.e(9);
        o oVar = this.f3837m.f3839b;
        synchronized (oVar) {
            long j2 = oVar.f3803n;
            long j3 = oVar.f3802m;
            if (j2 < j3) {
                return;
            }
            oVar.f3802m = j3 + 1;
            oVar.f3804o = System.nanoTime() + 1000000000;
            oVar.h.c(new p1.b(oVar.f3795c + " ping", oVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
