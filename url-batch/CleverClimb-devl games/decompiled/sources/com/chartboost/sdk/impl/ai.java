package com.chartboost.sdk.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.chartboost.sdk.Libraries.CBLogging;
import java.util.Observable;

/* loaded from: classes.dex */
public class ai extends Observable {

    /* renamed from: a, reason: collision with root package name */
    private boolean f3713a = true;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3714b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f3715c = -1;

    /* renamed from: d, reason: collision with root package name */
    private final a f3716d = new a();

    public int a() {
        return this.f3715c;
    }

    private class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ai.this.a(context);
            ai.this.notifyObservers();
        }
    }

    public void a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                a(true);
                if (activeNetworkInfo.getType() == 1) {
                    this.f3715c = 1;
                    CBLogging.a("CBReachability", "NETWORK TYPE: TYPE_WIFI");
                } else if (activeNetworkInfo.getType() == 0) {
                    this.f3715c = 2;
                    CBLogging.a("CBReachability", "NETWORK TYPE: TYPE_MOBILE");
                }
            } else {
                a(false);
                this.f3715c = 0;
                CBLogging.a("CBReachability", "NETWORK TYPE: NO Network");
            }
        } catch (SecurityException unused) {
            this.f3715c = -1;
            CBLogging.b("CBReachability", "Chartboost SDK requires 'android.permission.ACCESS_NETWORK_STATE' permission set in your AndroidManifest.xml");
        }
    }

    @Override // java.util.Observable
    public void notifyObservers() {
        if (this.f3713a) {
            setChanged();
            super.notifyObservers(this);
        }
    }

    public void a(boolean z) {
        this.f3713a = z;
    }

    public boolean b() {
        return this.f3713a;
    }

    public Intent b(Context context) {
        if (context == null || this.f3714b) {
            return null;
        }
        b(true);
        CBLogging.a("CBReachability", "Network broadcast successfully registered");
        return context.registerReceiver(this.f3716d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void c(Context context) {
        if (context == null || !this.f3714b) {
            return;
        }
        context.unregisterReceiver(this.f3716d);
        b(false);
        CBLogging.a("CBReachability", "Network broadcast successfully unregistered");
    }

    public void b(boolean z) {
        this.f3714b = z;
    }

    public static Integer d(Context context) {
        TelephonyManager telephonyManager;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (!(activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                return null;
            }
            return Integer.valueOf(telephonyManager.getNetworkType());
        } catch (SecurityException unused) {
            CBLogging.b("CBReachability", "Chartboost SDK requires 'android.permission.ACCESS_NETWORK_STATE' permission set in your AndroidManifest.xml");
            return null;
        }
    }
}
