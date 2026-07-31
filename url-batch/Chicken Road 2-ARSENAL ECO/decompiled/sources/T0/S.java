package T0;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class S implements S0.e, S0.f {

    /* renamed from: d, reason: collision with root package name */
    public final S0.c f2265d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2266e;

    /* renamed from: f, reason: collision with root package name */
    public x f2267f;

    public S(S0.c cVar, boolean z5) {
        this.f2265d = cVar;
        this.f2266e = z5;
    }

    @Override // S0.e
    public final void onConnected(Bundle bundle) {
        U0.t.g(this.f2267f, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f2267f.onConnected(bundle);
    }

    @Override // S0.f
    public final void onConnectionFailed(R0.a aVar) {
        U0.t.g(this.f2267f, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        x xVar = this.f2267f;
        S0.c cVar = this.f2265d;
        boolean z5 = this.f2266e;
        xVar.f2365d.lock();
        try {
            xVar.f2375n.n(aVar, cVar, z5);
        } finally {
            xVar.f2365d.unlock();
        }
    }

    @Override // S0.e
    public final void onConnectionSuspended(int i7) {
        U0.t.g(this.f2267f, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f2267f.onConnectionSuspended(i7);
    }
}
