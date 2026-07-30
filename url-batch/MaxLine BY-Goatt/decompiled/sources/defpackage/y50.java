package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class y50 implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, v50 v50Var);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        rz0 rz0Var;
        if (this.mApplicationContext == null) {
            lh.g("Custom Tabs Service connected before an applicationcontext has been provided.");
            return;
        }
        int i = qz0.g;
        if (iBinder == null) {
            rz0Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(rz0.b);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof rz0)) {
                pz0 pz0Var = new pz0();
                pz0Var.g = iBinder;
                rz0Var = pz0Var;
            } else {
                rz0Var = (rz0) queryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new x50(rz0Var, componentName));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
