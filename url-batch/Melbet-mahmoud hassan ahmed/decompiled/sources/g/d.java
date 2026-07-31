package g;

import a.b;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class d implements ServiceConnection {

    class a extends b {
        a(a.b bVar, ComponentName componentName) {
            super(bVar, componentName);
        }
    }

    public abstract void a(ComponentName componentName, b bVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a(componentName, new a(b.a.E(iBinder), componentName));
    }
}
