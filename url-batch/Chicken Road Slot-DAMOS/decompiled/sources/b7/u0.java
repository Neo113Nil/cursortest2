package b7;

import android.os.Bundle;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u0 implements a7.k, a7.l {

    /* renamed from: d, reason: collision with root package name */
    public final a7.d f1362d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1363e;

    /* renamed from: f, reason: collision with root package name */
    public y f1364f;

    public u0(a7.d dVar, boolean z10) {
        this.f1362d = dVar;
        this.f1363e = z10;
    }

    @Override // a7.k
    public final void onConnected(Bundle bundle) {
        c7.c0.h(this.f1364f, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f1364f.onConnected(bundle);
    }

    @Override // a7.l
    public final void onConnectionFailed(z6.b bVar) {
        a7.d dVar = this.f1362d;
        boolean z10 = this.f1363e;
        c7.c0.h(this.f1364f, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        y yVar = this.f1364f;
        yVar.f1397d.lock();
        try {
            yVar.f1405n.f(bVar, dVar, z10);
        } finally {
            yVar.f1397d.unlock();
        }
    }

    @Override // a7.k
    public final void onConnectionSuspended(int i3) {
        c7.c0.h(this.f1364f, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f1364f.onConnectionSuspended(i3);
    }
}
