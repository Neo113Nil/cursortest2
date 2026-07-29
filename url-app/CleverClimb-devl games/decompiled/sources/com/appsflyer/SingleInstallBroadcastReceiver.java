package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tapjoy.TapjoyConstants;

/* loaded from: classes.dex */
public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra(TapjoyConstants.TJC_REFERRER);
        if (stringExtra != null) {
            if (stringExtra.contains("AppsFlyer_Test") && intent.getStringExtra("TestIntegrationMode") != null) {
                i.c().a(context, intent);
                return;
            } else if (context.getSharedPreferences("appsflyer-data", 0).getString(TapjoyConstants.TJC_REFERRER, null) != null) {
                i.c();
                i.a(context, stringExtra);
                return;
            }
        }
        String a2 = j.a().a("referrer_timestamp");
        long currentTimeMillis = System.currentTimeMillis();
        if (a2 == null || currentTimeMillis - Long.valueOf(a2).longValue() >= 2000) {
            d.d("SingleInstallBroadcastReceiver called");
            i.c().a(context, intent);
            j.a().a("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
        }
    }
}
