package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class d implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, b bVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b.c cVar;
        if (this.mApplicationContext == null) {
            i0.l("Custom Tabs Service connected before an applicationcontext has been provided.");
            return;
        }
        int i3 = b.b.f795d;
        if (iBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof b.c)) {
                b.a aVar = new b.a();
                aVar.f794d = iBinder;
                cVar = aVar;
            } else {
                cVar = (b.c) queryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new c(cVar, componentName));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
