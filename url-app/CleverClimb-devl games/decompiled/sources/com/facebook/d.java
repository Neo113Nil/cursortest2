package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.facebook.internal.ac;

/* compiled from: AccessTokenTracker.java */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f6030a;

    /* renamed from: b, reason: collision with root package name */
    private final LocalBroadcastManager f6031b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6032c = false;

    protected abstract void a(AccessToken accessToken, AccessToken accessToken2);

    public d() {
        ac.a();
        this.f6030a = new a();
        this.f6031b = LocalBroadcastManager.getInstance(l.f());
        a();
    }

    public void a() {
        if (this.f6032c) {
            return;
        }
        d();
        this.f6032c = true;
    }

    public void b() {
        if (this.f6032c) {
            this.f6031b.unregisterReceiver(this.f6030a);
            this.f6032c = false;
        }
    }

    public boolean c() {
        return this.f6032c;
    }

    /* compiled from: AccessTokenTracker.java */
    private class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction())) {
                d.this.a((AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN"), (AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"));
            }
        }
    }

    private void d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        this.f6031b.registerReceiver(this.f6030a, intentFilter);
    }
}
