package com.chartboost.sdk.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class xd {
    public volatile boolean a;
    public final ConnectivityManager b;
    public a c;
    public Object d;

    public interface a {
        void a();

        void b();
    }

    public static final class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
        
            if (r3.hasCapability(12) == true) goto L8;
         */
        @Override // android.net.ConnectivityManager.NetworkCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onAvailable(Network network) {
            a aVar;
            Intrinsics.checkNotNullParameter(network, "network");
            NetworkCapabilities networkCapabilities = xd.this.b.getNetworkCapabilities(network);
            xd xdVar = xd.this;
            boolean z = networkCapabilities != null;
            xdVar.a = z;
            if (!xd.this.a || (aVar = xd.this.c) == null) {
                return;
            }
            aVar.a();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            xd.this.a = false;
            a aVar = xd.this.c;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    public xd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.b = (ConnectivityManager) systemService;
    }

    public final boolean b() {
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (r0.hasCapability(12) == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(a aVar) {
        this.c = aVar;
        NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
        ConnectivityManager.NetworkCallback a2 = a();
        this.d = a2;
        this.b.registerNetworkCallback(build, a2);
        NetworkCapabilities networkCapabilities = this.b.getNetworkCapabilities(this.b.getActiveNetwork());
        boolean z = networkCapabilities != null;
        this.a = z;
        if (!this.a || aVar == null) {
            return;
        }
        aVar.a();
    }

    public final ConnectivityManager.NetworkCallback a() {
        return new b();
    }
}
