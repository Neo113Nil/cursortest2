package com.facebook.ads.internal.adapters;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public class ag extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private String f4900a;

    /* renamed from: b, reason: collision with root package name */
    private af f4901b;

    /* renamed from: c, reason: collision with root package name */
    private ae f4902c;

    public ag(String str, ae aeVar, af afVar) {
        this.f4902c = aeVar;
        this.f4901b = afVar;
        this.f4900a = str;
    }

    public IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(com.facebook.ads.internal.view.e.b.z.REWARDED_VIDEO_COMPLETE.a(this.f4900a));
        intentFilter.addAction(com.facebook.ads.internal.view.e.b.z.REWARDED_VIDEO_ERROR.a(this.f4900a));
        intentFilter.addAction(com.facebook.ads.internal.view.e.b.z.REWARDED_VIDEO_AD_CLICK.a(this.f4900a));
        intentFilter.addAction(com.facebook.ads.internal.view.e.b.z.REWARDED_VIDEO_IMPRESSION.a(this.f4900a));
        intentFilter.addAction(com.facebook.ads.internal.view.e.b.z.REWARDED_VIDEO_CLOSED.a(this.f4900a));
        intentFilter.addAction(com.facebook.ads.internal.view.e.b.z.REWARD_SERVER_SUCCESS.a(this.f4900a));
        intentFilter.addAction(com.facebook.ads.internal.view.e.b.z.REWARD_SERVER_FAILED.a(this.f4900a));
        return intentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (com.facebook.ads.internal.view.e.b.z.REWARDED_VIDEO_COMPLETE.a(this.f4900a).equals(action)) {
            this.f4901b.d(this.f4902c);
            return;
        }
        if (com.facebook.ads.internal.view.e.b.z.REWARDED_VIDEO_ERROR.a(this.f4900a).equals(action)) {
            this.f4901b.a(this.f4902c, AdError.INTERNAL_ERROR);
            return;
        }
        if (com.facebook.ads.internal.view.e.b.z.REWARDED_VIDEO_AD_CLICK.a(this.f4900a).equals(action)) {
            this.f4901b.b(this.f4902c);
            return;
        }
        if (com.facebook.ads.internal.view.e.b.z.REWARDED_VIDEO_IMPRESSION.a(this.f4900a).equals(action)) {
            this.f4901b.c(this.f4902c);
            return;
        }
        if (com.facebook.ads.internal.view.e.b.z.REWARDED_VIDEO_CLOSED.a(this.f4900a).equals(action)) {
            this.f4901b.a();
        } else if (com.facebook.ads.internal.view.e.b.z.REWARD_SERVER_FAILED.a(this.f4900a).equals(action)) {
            this.f4901b.e(this.f4902c);
        } else if (com.facebook.ads.internal.view.e.b.z.REWARD_SERVER_SUCCESS.a(this.f4900a).equals(action)) {
            this.f4901b.f(this.f4902c);
        }
    }
}
