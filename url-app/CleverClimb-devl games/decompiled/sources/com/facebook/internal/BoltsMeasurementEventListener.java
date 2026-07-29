package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import com.tapjoy.TJAdUnitConstants;

/* loaded from: classes.dex */
public class BoltsMeasurementEventListener extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static BoltsMeasurementEventListener f6041a;

    /* renamed from: b, reason: collision with root package name */
    private Context f6042b;

    private BoltsMeasurementEventListener(Context context) {
        this.f6042b = context.getApplicationContext();
    }

    private void a() {
        LocalBroadcastManager.getInstance(this.f6042b).registerReceiver(this, new IntentFilter("com.parse.bolts.measurement_event"));
    }

    private void b() {
        LocalBroadcastManager.getInstance(this.f6042b).unregisterReceiver(this);
    }

    public static BoltsMeasurementEventListener a(Context context) {
        if (f6041a != null) {
            return f6041a;
        }
        f6041a = new BoltsMeasurementEventListener(context);
        f6041a.a();
        return f6041a;
    }

    protected void finalize() throws Throwable {
        try {
            b();
        } finally {
            super.finalize();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.facebook.appevents.f c2 = com.facebook.appevents.f.c(context);
        String str = "bf_" + intent.getStringExtra(TJAdUnitConstants.PARAM_PLACEMENT_NAME);
        Bundle bundleExtra = intent.getBundleExtra("event_args");
        Bundle bundle = new Bundle();
        for (String str2 : bundleExtra.keySet()) {
            bundle.putString(str2.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String) bundleExtra.get(str2));
        }
        c2.a(str, bundle);
    }
}
