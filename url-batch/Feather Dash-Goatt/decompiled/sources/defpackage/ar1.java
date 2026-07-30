package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ar1 implements ServiceConnection {
    public final /* synthetic */ br1 a;

    public /* synthetic */ ar1(br1 br1Var) {
        this.a = br1Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        br1 br1Var = this.a;
        br1Var.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        br1Var.a().post(new wq1(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        br1 br1Var = this.a;
        br1Var.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        br1Var.a().post(new yq1(0, this));
    }
}
