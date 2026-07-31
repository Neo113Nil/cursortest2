package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class s02 extends u02 {
    public s02(Context context) {
        this.f12538f = new gi0(context, y2.t.u().b(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.u02, r3.c.b
    public final void E(o3.b bVar) {
        io0.b("Cannot connect to remote service, fallback to local instance.");
        this.f12533a.f(new k12(1));
    }

    @Override // r3.c.a
    public final void O0(Bundle bundle) {
        bp0<InputStream> bp0Var;
        k12 k12Var;
        synchronized (this.f12534b) {
            if (!this.f12536d) {
                this.f12536d = true;
                try {
                    this.f12538f.i0().m5(this.f12537e, new t02(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    bp0Var = this.f12533a;
                    k12Var = new k12(1);
                    bp0Var.f(k12Var);
                } catch (Throwable th) {
                    y2.t.p().s(th, "RemoteAdRequestClientTask.onConnected");
                    bp0Var = this.f12533a;
                    k12Var = new k12(1);
                    bp0Var.f(k12Var);
                }
            }
        }
    }
}
