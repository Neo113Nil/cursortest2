package h0;

import B0.C0008i;
import P0.h;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import b.InterfaceC0114a;
import b.b;
import b.c;
import b.d;
import l.BinderC0193a;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0145a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public Context f2088a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2089b;

    /* renamed from: c, reason: collision with root package name */
    public Context f2090c;

    /* renamed from: d, reason: collision with root package name */
    public C0008i f2091d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2092e;

    public ServiceConnectionC0145a(String str) {
        this.f2089b = str;
    }

    public final boolean a(Context context) {
        h.e(context, "context");
        if (this.f2092e) {
            return true;
        }
        try {
            String str = this.f2089b;
            this.f2088a = context.getApplicationContext();
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(str)) {
                intent.setPackage(str);
            }
            boolean bindService = context.bindService(intent, this, 33);
            if (bindService) {
                this.f2090c = context;
            }
            this.f2092e = bindService;
        } catch (SecurityException unused) {
            this.f2092e = false;
        }
        return this.f2092e;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IInterface iInterface;
        if (this.f2088a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i2 = c.f1731c;
        C0008i c0008i = null;
        if (iBinder == null) {
            iInterface = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(d.f1732b);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                b bVar = new b();
                bVar.f1730c = iBinder;
                iInterface = bVar;
            } else {
                iInterface = (d) queryLocalInterface;
            }
        }
        h.e(componentName, "name");
        try {
            ((b) iInterface).c();
        } catch (RemoteException unused) {
        }
        componentName.getPackageName();
        BinderC0193a binderC0193a = new BinderC0193a();
        binderC0193a.attachInterface(binderC0193a, InterfaceC0114a.f1729a);
        new Handler(Looper.getMainLooper());
        try {
            if (((b) iInterface).b(binderC0193a)) {
                c0008i = new C0008i(iInterface, binderC0193a, componentName, 9);
            }
        } catch (RemoteException unused2) {
        }
        this.f2091d = c0008i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        h.e(componentName, "name");
        this.f2091d = null;
        this.f2092e = false;
    }
}
