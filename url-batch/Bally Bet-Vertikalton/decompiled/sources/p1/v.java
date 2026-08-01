package p1;

import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class v extends v1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f3472m;

    public v(w wVar) {
        this.f3472m = wVar;
    }

    @Override // v1.e
    public final void j() {
        this.f3472m.e(9);
        o oVar = this.f3472m.f3474b;
        synchronized (oVar) {
            long j2 = oVar.f3438n;
            long j3 = oVar.f3437m;
            if (j2 < j3) {
                return;
            }
            oVar.f3437m = j3 + 1;
            oVar.f3439o = System.nanoTime() + 1000000000;
            oVar.h.c(new l1.b(oVar.f3430c + " ping", oVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
