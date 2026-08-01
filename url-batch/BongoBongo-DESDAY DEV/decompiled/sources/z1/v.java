package z1;

import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class v extends F1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f4512m;

    public v(w wVar) {
        this.f4512m = wVar;
    }

    @Override // F1.e
    public final void j() {
        this.f4512m.e(9);
        o oVar = this.f4512m.f4514b;
        synchronized (oVar) {
            long j2 = oVar.f4477n;
            long j3 = oVar.f4476m;
            if (j2 < j3) {
                return;
            }
            oVar.f4476m = j3 + 1;
            oVar.f4478o = System.nanoTime() + 1000000000;
            oVar.f4472h.c(new v1.b(oVar.f4468c + " ping", oVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
