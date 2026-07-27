package v;

import android.app.AppOpsManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import b2.AbstractC0279e;
import java.util.Objects;
import u.AbstractC1464e;
import u.AbstractC1465f;

/* loaded from: classes.dex */
public abstract class d {
    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i2) {
        int c2;
        if ((i2 & 4) == 0 || str != null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i2 & 1);
        }
        String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        char c6 = 65535;
        if (context.checkPermission(str2, myPid, myUid) != -1) {
            String d6 = AbstractC1464e.d(str2);
            if (d6 != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    c2 = AbstractC1464e.c((AppOpsManager) AbstractC1464e.a(context, AppOpsManager.class), d6, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager c7 = AbstractC1465f.c(context);
                    c2 = AbstractC1465f.a(c7, d6, Binder.getCallingUid(), packageName);
                    if (c2 == 0) {
                        c2 = AbstractC1465f.a(c7, d6, myUid, AbstractC1465f.b(context));
                    }
                } else {
                    c2 = AbstractC1464e.c((AppOpsManager) AbstractC1464e.a(context, AppOpsManager.class), d6, packageName);
                }
                if (c2 != 0) {
                    c6 = 65534;
                }
            }
            c6 = 0;
        }
        if (c6 == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
        }
        throw new RuntimeException(AbstractC0279e.f("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static ComponentName b(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
