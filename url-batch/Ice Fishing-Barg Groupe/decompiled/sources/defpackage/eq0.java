package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class eq0 {
    public int PxuCJdSBwIXG = 0;
    public sm0 TSizfFm2Yiuu;
    public dq0 Y1f8riQaR6yg;
    public final Context lS5Rgt96tfkO;

    public eq0(Context context) {
        this.lS5Rgt96tfkO = context.getApplicationContext();
    }

    public final i2 PxuCJdSBwIXG() {
        if (this.PxuCJdSBwIXG != 2 || this.TSizfFm2Yiuu == null || this.Y1f8riQaR6yg == null) {
            u9.rtx2ld2ELZv4("Service not connected. Please start a connection before using the service.");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.lS5Rgt96tfkO.getPackageName());
        try {
            return new i2(26, ((qm0) this.TSizfFm2Yiuu).PxuCJdSBwIXG(bundle));
        } catch (RemoteException e) {
            ni0.tmVwIGCQF4zR("RemoteException getting install referrer information");
            this.PxuCJdSBwIXG = 0;
            throw e;
        }
    }

    public final void lS5Rgt96tfkO(op0 op0Var) {
        ServiceInfo serviceInfo;
        int i = this.PxuCJdSBwIXG;
        if (i == 2 && this.TSizfFm2Yiuu != null && this.Y1f8riQaR6yg != null) {
            ni0.ozEBbv0hFTAB("Service connection is valid. No need to re-initialize.");
            op0Var.EcgxDIVH5in8(0);
            return;
        }
        if (i == 1) {
            ni0.tmVwIGCQF4zR("Client is already in the process of connecting to the service.");
            op0Var.EcgxDIVH5in8(3);
            return;
        }
        if (i == 3) {
            ni0.tmVwIGCQF4zR("Client was already closed and can't be reused. Please create another instance.");
            op0Var.EcgxDIVH5in8(3);
            return;
        }
        ni0.ozEBbv0hFTAB("Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context = this.lS5Rgt96tfkO;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            this.PxuCJdSBwIXG = 0;
            ni0.ozEBbv0hFTAB("Install Referrer service unavailable on device.");
            op0Var.EcgxDIVH5in8(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    dq0 dq0Var = new dq0(this, op0Var);
                    this.Y1f8riQaR6yg = dq0Var;
                    try {
                        if (context.bindService(intent2, dq0Var, 1)) {
                            ni0.ozEBbv0hFTAB("Service was bonded successfully.");
                            return;
                        }
                        ni0.tmVwIGCQF4zR("Connection to service is blocked.");
                        this.PxuCJdSBwIXG = 0;
                        op0Var.EcgxDIVH5in8(1);
                        return;
                    } catch (SecurityException unused) {
                        ni0.tmVwIGCQF4zR("No permission to connect to service.");
                        this.PxuCJdSBwIXG = 0;
                        op0Var.EcgxDIVH5in8(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        ni0.tmVwIGCQF4zR("Play Store missing or incompatible. Version 8.3.73 or later required.");
        this.PxuCJdSBwIXG = 0;
        op0Var.EcgxDIVH5in8(2);
    }
}
