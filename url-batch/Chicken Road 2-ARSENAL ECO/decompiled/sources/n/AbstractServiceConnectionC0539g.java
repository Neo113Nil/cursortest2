package n;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import b.AbstractBinderC0260c;
import b.C0259b;
import b.InterfaceC0261d;

/* renamed from: n.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC0539g implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, AbstractC0534b abstractC0534b);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0261d interfaceC0261d;
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i7 = AbstractBinderC0260c.f3601d;
        if (iBinder == null) {
            interfaceC0261d = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0261d.f3602b);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0261d)) {
                C0259b c0259b = new C0259b();
                c0259b.f3600d = iBinder;
                interfaceC0261d = c0259b;
            } else {
                interfaceC0261d = (InterfaceC0261d) queryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new C0538f(interfaceC0261d, componentName));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
