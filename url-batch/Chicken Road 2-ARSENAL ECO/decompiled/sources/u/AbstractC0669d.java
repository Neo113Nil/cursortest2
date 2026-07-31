package u;

import W4.o;
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
import t.AbstractC0645e;
import t.AbstractC0646f;

/* renamed from: u.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0669d {
    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i7) {
        int c7;
        if ((i7 & 4) == 0 || str != null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i7 & 1);
        }
        String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        char c8 = 65535;
        if (context.checkPermission(str2, myPid, myUid) != -1) {
            String d7 = AbstractC0645e.d(str2);
            if (d7 != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    c7 = AbstractC0645e.c((AppOpsManager) AbstractC0645e.a(context, AppOpsManager.class), d7, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager c9 = AbstractC0646f.c(context);
                    c7 = AbstractC0646f.a(c9, d7, Binder.getCallingUid(), packageName);
                    if (c7 == 0) {
                        c7 = AbstractC0646f.a(c9, d7, myUid, AbstractC0646f.b(context));
                    }
                } else {
                    c7 = AbstractC0645e.c((AppOpsManager) AbstractC0645e.a(context, AppOpsManager.class), d7, packageName);
                }
                if (c7 != 0) {
                    c8 = 65534;
                }
            }
            c8 = 0;
        }
        if (c8 == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
        }
        throw new RuntimeException(o.e("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static ComponentName b(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
