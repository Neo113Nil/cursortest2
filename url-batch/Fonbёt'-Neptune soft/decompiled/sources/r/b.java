package r;

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
import java.util.Objects;
import q.AbstractC0282a;
import q.AbstractC0283b;

/* loaded from: classes.dex */
public abstract class b {
    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i2) {
        int i3 = 1;
        if ((i2 & 4) == 0 || str != null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i2 & 1);
        }
        String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        char c2 = 65535;
        if (context.checkPermission(str2, myPid, myUid) != -1) {
            int i4 = Build.VERSION.SDK_INT;
            String d2 = i4 >= 23 ? AbstractC0282a.d(str2) : null;
            if (d2 != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 == myUid && Objects.equals(packageName2, packageName)) {
                    if (i4 >= 29) {
                        AppOpsManager c3 = AbstractC0283b.c(context);
                        i3 = AbstractC0283b.a(c3, d2, Binder.getCallingUid(), packageName);
                        if (i3 == 0) {
                            i3 = AbstractC0283b.a(c3, d2, myUid, AbstractC0283b.b(context));
                        }
                    } else if (i4 >= 23) {
                        i3 = AbstractC0282a.c((AppOpsManager) AbstractC0282a.a(context, AppOpsManager.class), d2, packageName);
                    }
                } else if (i4 >= 23) {
                    i3 = AbstractC0282a.c((AppOpsManager) AbstractC0282a.a(context, AppOpsManager.class), d2, packageName);
                }
                if (i3 != 0) {
                    c2 = 65534;
                }
            }
            c2 = 0;
        }
        if (c2 == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
        }
        throw new RuntimeException("Permission " + str2 + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static ComponentName b(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
