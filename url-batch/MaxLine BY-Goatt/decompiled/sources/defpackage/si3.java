package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class si3 implements ServiceConnection {
    public final String m;
    public final /* synthetic */ ti3 n;

    public si3(ti3 ti3Var, String str) {
        Objects.requireNonNull(ti3Var);
        this.n = ti3Var;
        this.m = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ti3 ti3Var = this.n;
        if (iBinder == null) {
            vh3 vh3Var = ti3Var.n.r;
            pj3.m(vh3Var);
            vh3Var.u.b("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = qd3.g;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            rd3 pd3Var = queryLocalInterface instanceof rd3 ? (rd3) queryLocalInterface : new pd3(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 2);
            pj3 pj3Var = ti3Var.n;
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.z.b("Install Referrer Service connected");
            lj3 lj3Var = pj3Var.s;
            pj3.m(lj3Var);
            lj3Var.F(new iu0(this, pd3Var, this));
        } catch (RuntimeException e) {
            vh3 vh3Var3 = ti3Var.n.r;
            pj3.m(vh3Var3);
            vh3Var3.u.c(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        vh3 vh3Var = this.n.n.r;
        pj3.m(vh3Var);
        vh3Var.z.b("Install Referrer Service disconnected");
    }
}
