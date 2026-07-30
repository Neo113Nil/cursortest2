package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class t50 extends y50 {
    public final /* synthetic */ Context m;

    public t50(Context context) {
        this.m = context;
    }

    @Override // defpackage.y50
    public final void onCustomTabsServiceConnected(ComponentName componentName, v50 v50Var) {
        try {
            ((pz0) v50Var.a).d();
        } catch (RemoteException unused) {
        }
        this.m.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
