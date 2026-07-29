package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import com.tapjoy.TapjoyConstants;

/* loaded from: classes.dex */
public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra(TapjoyConstants.TJC_REFERRER);
        if (stringExtra != null) {
            if ("AppsFlyer_Test".equals(stringExtra) && intent.getStringExtra("TestIntegrationMode") != null) {
                i.c().a(context, intent);
                return;
            } else if (context.getSharedPreferences("appsflyer-data", 0).getString(TapjoyConstants.TJC_REFERRER, null) != null) {
                i.c();
                i.a(context, stringExtra);
                return;
            }
        }
        d.d("MultipleInstallBroadcastReceiver called");
        i.c().a(context, intent);
        for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER"), 0)) {
            String action = intent.getAction();
            if (((PackageItemInfo) resolveInfo.activityInfo).packageName.equals(context.getPackageName()) && "com.android.vending.INSTALL_REFERRER".equals(action) && !getClass().getName().equals(((PackageItemInfo) resolveInfo.activityInfo).name)) {
                StringBuilder sb = new StringBuilder("trigger onReceive: class: ");
                sb.append(((PackageItemInfo) resolveInfo.activityInfo).name);
                d.d(sb.toString());
                try {
                    ((BroadcastReceiver) Class.forName(((PackageItemInfo) resolveInfo.activityInfo).name).newInstance()).onReceive(context, intent);
                } catch (Throwable th) {
                    StringBuilder sb2 = new StringBuilder("error in BroadcastReceiver ");
                    sb2.append(((PackageItemInfo) resolveInfo.activityInfo).name);
                    d.a(sb2.toString(), th);
                }
            }
        }
    }
}
