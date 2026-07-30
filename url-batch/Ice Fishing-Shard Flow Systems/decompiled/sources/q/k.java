package q;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import b.AbstractBinderC0262c;
import b.C0261b;
import b.InterfaceC0263d;

/* loaded from: classes.dex */
public abstract class k implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, g gVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0263d interfaceC0263d;
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i2 = AbstractBinderC0262c.f4130e;
        if (iBinder == null) {
            interfaceC0263d = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0263d.f4131b);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0263d)) {
                C0261b c0261b = new C0261b();
                c0261b.f4129e = iBinder;
                interfaceC0263d = c0261b;
            } else {
                interfaceC0263d = (InterfaceC0263d) queryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new j(interfaceC0263d, componentName));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
