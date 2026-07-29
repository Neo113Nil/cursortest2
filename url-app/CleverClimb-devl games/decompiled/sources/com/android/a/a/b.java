package com.android.a.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import java.util.List;

/* compiled from: InstallReferrerClientImpl.java */
/* loaded from: classes.dex */
class b extends com.android.a.a.a {

    /* renamed from: a, reason: collision with root package name */
    private int f2248a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Context f2249b;

    /* renamed from: c, reason: collision with root package name */
    private IGetInstallReferrerService f2250c;

    /* renamed from: d, reason: collision with root package name */
    private ServiceConnection f2251d;

    public b(Context context) {
        this.f2249b = context.getApplicationContext();
    }

    public boolean c() {
        return (this.f2248a != 2 || this.f2250c == null || this.f2251d == null) ? false : true;
    }

    @Override // com.android.a.a.a
    public void a(c cVar) {
        if (c()) {
            com.android.a.b.a.a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            cVar.a(0);
            return;
        }
        if (this.f2248a == 1) {
            com.android.a.b.a.b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            cVar.a(3);
            return;
        }
        if (this.f2248a == 3) {
            com.android.a.b.a.b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            cVar.a(3);
            return;
        }
        com.android.a.b.a.a("InstallReferrerClient", "Starting install referrer service setup.");
        this.f2251d = new a(cVar);
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> queryIntentServices = this.f2249b.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            ResolveInfo resolveInfo = queryIntentServices.get(0);
            if (resolveInfo.serviceInfo != null) {
                String str = resolveInfo.serviceInfo.packageName;
                String str2 = resolveInfo.serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null && d()) {
                    if (this.f2249b.bindService(new Intent(intent), this.f2251d, 1)) {
                        com.android.a.b.a.a("InstallReferrerClient", "Service was bonded successfully.");
                        return;
                    }
                    com.android.a.b.a.b("InstallReferrerClient", "Connection to service is blocked.");
                    this.f2248a = 0;
                    cVar.a(1);
                    return;
                }
                com.android.a.b.a.b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.f2248a = 0;
                cVar.a(2);
                return;
            }
        }
        this.f2248a = 0;
        com.android.a.b.a.a("InstallReferrerClient", "Install Referrer service unavailable on device.");
        cVar.a(2);
    }

    @Override // com.android.a.a.a
    public void a() {
        this.f2248a = 3;
        if (this.f2251d != null) {
            com.android.a.b.a.a("InstallReferrerClient", "Unbinding from service.");
            this.f2249b.unbindService(this.f2251d);
            this.f2251d = null;
        }
        this.f2250c = null;
    }

    @Override // com.android.a.a.a
    public d b() throws RemoteException {
        if (!c()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString(com.umeng.commonsdk.proguard.d.n, this.f2249b.getPackageName());
        try {
            return new d(this.f2250c.getInstallReferrer(bundle));
        } catch (RemoteException e) {
            com.android.a.b.a.b("InstallReferrerClient", "RemoteException getting install referrer information");
            this.f2248a = 0;
            throw e;
        }
    }

    private boolean d() {
        try {
            return this.f2249b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* compiled from: InstallReferrerClientImpl.java */
    private final class a implements ServiceConnection {

        /* renamed from: b, reason: collision with root package name */
        private final c f2253b;

        private a(c cVar) {
            if (cVar == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f2253b = cVar;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.android.a.b.a.a("InstallReferrerClient", "Install Referrer service connected.");
            b.this.f2250c = IGetInstallReferrerService.Stub.asInterface(iBinder);
            b.this.f2248a = 2;
            this.f2253b.a(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            com.android.a.b.a.b("InstallReferrerClient", "Install Referrer service disconnected.");
            b.this.f2250c = null;
            b.this.f2248a = 0;
            this.f2253b.a();
        }
    }
}
