package w1;

import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class v extends C1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f4167m;

    public v(w wVar) {
        this.f4167m = wVar;
    }

    @Override // C1.e
    public final void j() {
        this.f4167m.e(9);
        o oVar = this.f4167m.f4169b;
        synchronized (oVar) {
            long j2 = oVar.f4133n;
            long j3 = oVar.f4132m;
            if (j2 < j3) {
                return;
            }
            oVar.f4132m = j3 + 1;
            oVar.f4134o = System.nanoTime() + 1000000000;
            oVar.h.c(new s1.b(oVar.f4125c + " ping", oVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
