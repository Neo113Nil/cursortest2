package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.eo;
import com.ironsource.o9;

/* loaded from: classes2.dex */
public class NetworkStateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private ConnectivityManager f16094a;

    /* renamed from: b, reason: collision with root package name */
    private eo f16095b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16096c = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NetworkStateReceiver.this.f16095b != null) {
                NetworkStateReceiver.this.f16095b.a(NetworkStateReceiver.this.f16096c);
            }
        }
    }

    public NetworkStateReceiver(Context context, eo eoVar) {
        this.f16095b = eoVar;
        if (context != null) {
            this.f16094a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        a();
    }

    private void b() {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null || !a()) {
            return;
        }
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a() {
        boolean z4 = this.f16096c;
        ConnectivityManager connectivityManager = this.f16094a;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                this.f16096c = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            } catch (Exception e4) {
                o9.d().a(e4);
            }
            return z4 == this.f16096c;
        }
        this.f16096c = false;
        if (z4 == this.f16096c) {
        }
    }
}
