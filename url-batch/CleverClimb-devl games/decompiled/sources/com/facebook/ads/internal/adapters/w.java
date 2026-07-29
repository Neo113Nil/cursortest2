package com.facebook.ads.internal.adapters;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public class w extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private String f5014a;

    /* renamed from: b, reason: collision with root package name */
    private Context f5015b;

    /* renamed from: c, reason: collision with root package name */
    private InterstitialAdapterListener f5016c;

    /* renamed from: d, reason: collision with root package name */
    private InterstitialAdapter f5017d;

    public w(Context context, String str, InterstitialAdapter interstitialAdapter, InterstitialAdapterListener interstitialAdapterListener) {
        this.f5015b = context;
        this.f5014a = str;
        this.f5016c = interstitialAdapterListener;
        this.f5017d = interstitialAdapter;
    }

    public void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.ads.interstitial.impression.logged:" + this.f5014a);
        intentFilter.addAction("com.facebook.ads.interstitial.displayed:" + this.f5014a);
        intentFilter.addAction("com.facebook.ads.interstitial.dismissed:" + this.f5014a);
        intentFilter.addAction("com.facebook.ads.interstitial.clicked:" + this.f5014a);
        intentFilter.addAction("com.facebook.ads.interstitial.error:" + this.f5014a);
        LocalBroadcastManager.getInstance(this.f5015b).registerReceiver(this, intentFilter);
    }

    public void b() {
        try {
            LocalBroadcastManager.getInstance(this.f5015b).unregisterReceiver(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str = intent.getAction().split(":")[0];
        if (this.f5016c == null || str == null) {
            return;
        }
        if ("com.facebook.ads.interstitial.clicked".equals(str)) {
            this.f5016c.onInterstitialAdClicked(this.f5017d, null, true);
            return;
        }
        if ("com.facebook.ads.interstitial.dismissed".equals(str)) {
            this.f5016c.onInterstitialAdDismissed(this.f5017d);
            return;
        }
        if ("com.facebook.ads.interstitial.displayed".equals(str)) {
            this.f5016c.onInterstitialAdDisplayed(this.f5017d);
        } else if ("com.facebook.ads.interstitial.impression.logged".equals(str)) {
            this.f5016c.onInterstitialLoggingImpression(this.f5017d);
        } else if ("com.facebook.ads.interstitial.error".equals(str)) {
            this.f5016c.onInterstitialError(this.f5017d, AdError.INTERNAL_ERROR);
        }
    }
}
