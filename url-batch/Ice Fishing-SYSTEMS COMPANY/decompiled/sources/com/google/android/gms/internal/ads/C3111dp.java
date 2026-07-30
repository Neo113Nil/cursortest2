package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.dp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3111dp {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30230a;

    /* renamed from: b, reason: collision with root package name */
    public C3877s f30231b;

    public C3111dp(Context context) {
        this.f30230a = context;
    }

    public final void a(C3562m7 c3562m7) {
        ServiceInfo serviceInfo;
        C3877s c3877s = this.f30231b;
        if (c3877s.a()) {
            AbstractC3035cL.m("Service connection is valid. No need to re-initialize.");
            c3562m7.m(0);
            return;
        }
        int i = c3877s.f34149n;
        if (i == 1) {
            AbstractC3035cL.v("Client is already in the process of connecting to the service.");
            c3562m7.m(3);
            return;
        }
        if (i == 3) {
            AbstractC3035cL.v("Client was already closed and can't be reused. Please create another instance.");
            c3562m7.m(3);
            return;
        }
        AbstractC3035cL.m("Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context = (Context) c3877s.f34150u;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            c3877s.f34149n = 0;
            AbstractC3035cL.m("Install Referrer service unavailable on device.");
            c3562m7.m(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    M4 m42 = new M4(c3877s, c3562m7);
                    c3877s.f34153x = m42;
                    try {
                        if (context.bindService(intent2, m42, 1)) {
                            AbstractC3035cL.m("Service was bonded successfully.");
                            return;
                        }
                        AbstractC3035cL.v("Connection to service is blocked.");
                        c3877s.f34149n = 0;
                        c3562m7.m(1);
                        return;
                    } catch (SecurityException unused) {
                        AbstractC3035cL.v("No permission to connect to service.");
                        c3877s.f34149n = 0;
                        c3562m7.m(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        AbstractC3035cL.v("Play Store missing or incompatible. Version 8.3.73 or later required.");
        c3877s.f34149n = 0;
        c3562m7.m(2);
    }
}
