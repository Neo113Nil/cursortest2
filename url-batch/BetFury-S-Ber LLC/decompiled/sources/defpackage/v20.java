package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class v20 implements ServiceConnection {
    public final /* synthetic */ w20 a;

    public v20(w20 w20Var) {
        this.a = w20Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [tu] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        su suVar;
        componentName.getClass();
        iBinder.getClass();
        int i = x20.d;
        IInterface queryLocalInterface = iBinder.queryLocalInterface(tu.b);
        if (queryLocalInterface == null || !(queryLocalInterface instanceof tu)) {
            su suVar2 = new su();
            suVar2.c = iBinder;
            suVar = suVar2;
        } else {
            suVar = (tu) queryLocalInterface;
        }
        w20 w20Var = this.a;
        w20Var.g = suVar;
        try {
            w20Var.f = suVar.b(w20Var.j, w20Var.a);
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
        this.a.g = null;
    }
}
