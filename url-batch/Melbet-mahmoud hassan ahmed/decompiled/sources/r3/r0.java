package r3;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes.dex */
public final class r0 extends k0 {

    /* renamed from: f, reason: collision with root package name */
    private c f21324f;

    /* renamed from: g, reason: collision with root package name */
    private final int f21325g;

    public r0(c cVar, int i7) {
        this.f21324f = cVar;
        this.f21325g = i7;
    }

    @Override // r3.k
    public final void U3(int i7, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // r3.k
    public final void l6(int i7, IBinder iBinder, Bundle bundle) {
        o.j(this.f21324f, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f21324f.M(i7, iBinder, bundle, this.f21325g);
        this.f21324f = null;
    }

    @Override // r3.k
    public final void y5(int i7, IBinder iBinder, v0 v0Var) {
        c cVar = this.f21324f;
        o.j(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        o.i(v0Var);
        c.g0(cVar, v0Var);
        l6(i7, iBinder, v0Var.f21334f);
    }
}
