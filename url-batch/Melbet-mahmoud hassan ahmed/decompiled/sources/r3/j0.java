package r3;

import android.app.PendingIntent;
import android.os.Bundle;

/* loaded from: classes.dex */
abstract class j0 extends q0<Boolean> {

    /* renamed from: d, reason: collision with root package name */
    public final int f21292d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f21293e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f21294f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected j0(c cVar, int i7, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f21294f = cVar;
        this.f21292d = i7;
        this.f21293e = bundle;
    }

    @Override // r3.q0
    protected final void a() {
    }

    @Override // r3.q0
    protected final /* bridge */ /* synthetic */ void b(Boolean bool) {
        o3.b bVar;
        if (this.f21292d != 0) {
            this.f21294f.h0(1, null);
            Bundle bundle = this.f21293e;
            bVar = new o3.b(this.f21292d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        } else {
            if (f()) {
                return;
            }
            this.f21294f.h0(1, null);
            bVar = new o3.b(8, null);
        }
        g(bVar);
    }

    protected abstract boolean f();

    protected abstract void g(o3.b bVar);
}
