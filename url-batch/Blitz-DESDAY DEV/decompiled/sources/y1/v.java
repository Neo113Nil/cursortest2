package y1;

import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class v extends E1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f4282m;

    public v(w wVar) {
        this.f4282m = wVar;
    }

    @Override // E1.e
    public final void j() {
        this.f4282m.e(9);
        o oVar = this.f4282m.f4284b;
        synchronized (oVar) {
            long j2 = oVar.f4248n;
            long j3 = oVar.f4247m;
            if (j2 < j3) {
                return;
            }
            oVar.f4247m = j3 + 1;
            oVar.f4249o = System.nanoTime() + 1000000000;
            oVar.h.c(new u1.b(oVar.f4240c + " ping", oVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
