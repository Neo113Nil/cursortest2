package p1;

import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class v extends v1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f3864m;

    public v(w wVar) {
        this.f3864m = wVar;
    }

    @Override // v1.e
    public final void j() {
        this.f3864m.e(9);
        o oVar = this.f3864m.f3866b;
        synchronized (oVar) {
            long j2 = oVar.f3825n;
            long j3 = oVar.f3824m;
            if (j2 < j3) {
                return;
            }
            oVar.f3824m = j3 + 1;
            oVar.f3826o = System.nanoTime() + 1000000000;
            oVar.h.c(new l1.b(oVar.f3816c + " ping", oVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
