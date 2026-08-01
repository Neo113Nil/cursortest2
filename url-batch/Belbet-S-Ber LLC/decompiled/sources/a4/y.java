package a4;

import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class y extends g4.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f237m;

    public y(z zVar) {
        this.f237m = zVar;
    }

    @Override // g4.e
    public final void j() {
        this.f237m.e(9);
        r rVar = this.f237m.f239b;
        synchronized (rVar) {
            long j2 = rVar.f211s;
            long j4 = rVar.f210r;
            if (j2 < j4) {
                return;
            }
            rVar.f210r = j4 + 1;
            rVar.f212t = System.nanoTime() + 1000000000;
            rVar.f205m.c(new p(rVar.h + " ping", rVar, 0), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
