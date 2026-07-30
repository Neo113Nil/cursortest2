package s1;

import android.os.Bundle;

/* renamed from: s1.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0868J implements r1.k, r1.l {

    /* renamed from: e, reason: collision with root package name */
    public final r1.e f7622e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7623f;

    /* renamed from: g, reason: collision with root package name */
    public C0888s f7624g;

    public C0868J(r1.e eVar, boolean z7) {
        this.f7622e = eVar;
        this.f7623f = z7;
    }

    @Override // r1.k
    public final void onConnected(Bundle bundle) {
        t1.u.g(this.f7624g, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f7624g.onConnected(bundle);
    }

    @Override // r1.l
    public final void onConnectionFailed(q1.b bVar) {
        r1.e eVar = this.f7622e;
        boolean z7 = this.f7623f;
        t1.u.g(this.f7624g, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        C0888s c0888s = this.f7624g;
        c0888s.f7720e.lock();
        try {
            c0888s.f7729o.b(bVar, eVar, z7);
        } finally {
            c0888s.f7720e.unlock();
        }
    }

    @Override // r1.k
    public final void onConnectionSuspended(int i2) {
        t1.u.g(this.f7624g, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f7624g.onConnectionSuspended(i2);
    }
}
