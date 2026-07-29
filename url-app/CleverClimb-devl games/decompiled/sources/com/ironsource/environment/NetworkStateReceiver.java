package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes2.dex */
public class NetworkStateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private ConnectivityManager f6992a;

    /* renamed from: b, reason: collision with root package name */
    private a f6993b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6994c;

    public interface a {
        void a(boolean z);
    }

    public NetworkStateReceiver(Context context, a aVar) {
        this.f6993b = aVar;
        this.f6992a = (ConnectivityManager) context.getSystemService("connectivity");
        a();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null || !a()) {
            return;
        }
        b();
    }

    private boolean a() {
        boolean z = this.f6994c;
        NetworkInfo activeNetworkInfo = this.f6992a.getActiveNetworkInfo();
        this.f6994c = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        return z != this.f6994c;
    }

    private void b() {
        if (this.f6993b != null) {
            if (this.f6994c) {
                this.f6993b.a(true);
            } else {
                this.f6993b.a(false);
            }
        }
    }
}
