package com.tapjoy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.tapjoy.internal.ew;
import com.tapjoy.internal.ez;
import com.tapjoy.internal.fd;
import com.tapjoy.internal.gx;
import com.tapjoy.internal.gz;
import com.tapjoy.internal.ha;
import com.tapjoy.internal.hc;
import com.tapjoy.internal.hl;
import java.util.List;

/* loaded from: classes2.dex */
public class TapjoyReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intent intent2;
        hc.b(context);
        if ("com.tapjoy.PUSH_CLICK".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("com.tapjoy.PUSH_ID");
            String stringExtra2 = intent.getStringExtra(Tapjoy.INTENT_EXTRA_PUSH_PAYLOAD);
            String stringExtra3 = intent.getStringExtra("com.tapjoy.PUSH_PLACEMENT");
            if (stringExtra != null && stringExtra.length() != 0) {
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                Intent intent3 = new Intent("android.intent.action.MAIN");
                intent3.setPackage(packageName);
                intent3.addCategory("android.intent.category.LAUNCHER");
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent3, 0);
                if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                    intent2 = null;
                } else {
                    intent2 = new Intent(intent3);
                    intent2.setFlags(268435456);
                    intent2.setClassName(queryIntentActivities.get(0).activityInfo.packageName, queryIntentActivities.get(0).activityInfo.name);
                }
                if (intent2 != null) {
                    if (stringExtra2 != null) {
                        intent2.putExtra(Tapjoy.INTENT_EXTRA_PUSH_PAYLOAD, stringExtra2);
                    }
                    ha a2 = ha.a(context);
                    if (a2.f.c(stringExtra)) {
                        gz gzVar = a2.g;
                        ew.a a3 = gzVar.a(ez.APP, "push_click");
                        a3.s = new fd(null, null, stringExtra);
                        gzVar.a(a3);
                    }
                    if (stringExtra3 != null) {
                        hl.a(stringExtra, stringExtra3);
                    }
                    context.startActivity(intent2);
                } else {
                    gx.b("No intent that can be used to launch the main activity.");
                }
            }
        }
        if (isOrderedBroadcast()) {
            setResult(-1, null, null);
        }
    }
}
