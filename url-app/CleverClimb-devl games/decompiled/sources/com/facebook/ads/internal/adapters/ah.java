package com.facebook.ads.internal.adapters;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ah extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private Context f4903a;

    /* renamed from: b, reason: collision with root package name */
    private com.facebook.ads.internal.view.n f4904b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4905c = false;

    public ah(com.facebook.ads.internal.view.n nVar, Context context) {
        this.f4904b = nVar;
        this.f4903a = context.getApplicationContext();
    }

    public void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.ads.interstitial.displayed:" + this.f4904b.getUniqueId());
        intentFilter.addAction("videoInterstitalEvent:" + this.f4904b.getUniqueId());
        intentFilter.addAction("performCtaClick:" + this.f4904b.getUniqueId());
        LocalBroadcastManager.getInstance(this.f4903a).registerReceiver(this, intentFilter);
    }

    public void b() {
        try {
            LocalBroadcastManager.getInstance(this.f4903a).unregisterReceiver(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String[] split = intent.getAction().split(":");
        if (split.length == 2 && split[1].equals(this.f4904b.getUniqueId())) {
            if (split[0].equals("com.facebook.ads.interstitial.displayed")) {
                if (this.f4904b.getListener() != null) {
                    this.f4904b.getListener().g();
                    this.f4904b.getListener().a();
                    return;
                }
                return;
            }
            if (!split[0].equals("videoInterstitalEvent")) {
                if (split[0].equals("performCtaClick")) {
                    this.f4904b.b();
                    return;
                }
                return;
            }
            Serializable serializableExtra = intent.getSerializableExtra("event");
            if (serializableExtra instanceof com.facebook.ads.internal.view.e.b.p) {
                if (this.f4904b.getListener() != null) {
                    this.f4904b.getListener().f();
                    this.f4904b.getListener().a();
                }
                if (this.f4905c) {
                    this.f4904b.a(1);
                } else {
                    this.f4904b.a(((com.facebook.ads.internal.view.e.b.p) serializableExtra).b());
                }
                this.f4904b.setVisibility(0);
                this.f4904b.a(com.facebook.ads.internal.view.e.a.a.USER_STARTED);
                return;
            }
            if (serializableExtra instanceof com.facebook.ads.internal.view.e.b.f) {
                if (this.f4904b.getListener() != null) {
                    this.f4904b.getListener().d();
                    return;
                }
                return;
            }
            if (serializableExtra instanceof com.facebook.ads.internal.view.e.b.g) {
                if (this.f4904b.getListener() != null) {
                    this.f4904b.getListener().e();
                }
            } else if (serializableExtra instanceof com.facebook.ads.internal.view.e.b.b) {
                if (this.f4904b.getListener() != null) {
                    this.f4904b.getListener().h();
                }
                this.f4905c = true;
            } else if (serializableExtra instanceof com.facebook.ads.internal.view.e.b.j) {
                if (this.f4904b.getListener() != null) {
                    this.f4904b.getListener().c();
                }
                this.f4905c = false;
            } else {
                if (!(serializableExtra instanceof com.facebook.ads.internal.view.e.b.h) || this.f4904b.getListener() == null) {
                    return;
                }
                this.f4904b.getListener().b();
            }
        }
    }
}
