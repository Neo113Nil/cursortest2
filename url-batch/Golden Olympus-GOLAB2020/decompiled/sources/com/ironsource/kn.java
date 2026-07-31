package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class kn implements Cif {

    /* renamed from: a, reason: collision with root package name */
    private String f16952a = kn.class.getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    private int f16953b = 23;

    /* renamed from: c, reason: collision with root package name */
    private final jf f16954c;

    /* renamed from: d, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f16955d;

    class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f16956a;

        a(Context context) {
            this.f16956a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network != null) {
                kn.this.f16954c.a(y8.a(network, this.f16956a), y8.a(this.f16956a, network));
                return;
            }
            jf jfVar = kn.this.f16954c;
            String b4 = y8.b(this.f16956a);
            Context context = this.f16956a;
            jfVar.a(b4, y8.a(context, y8.a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                kn.this.f16954c.b(y8.a(network, this.f16956a), y8.a(this.f16956a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                kn.this.f16954c.b(y8.a(network, this.f16956a), y8.a(this.f16956a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (y8.b(this.f16956a).equals("none")) {
                kn.this.f16954c.a();
            }
        }
    }

    public kn(jf jfVar) {
        this.f16954c = jfVar;
    }

    @Override // com.ironsource.Cif
    @SuppressLint({"NewApi", "MissingPermission"})
    public void b(Context context) {
        if (Build.VERSION.SDK_INT >= this.f16953b) {
            a(context);
            if (y8.b(context).equals("none")) {
                this.f16954c.a();
            }
            if (this.f16955d == null) {
                this.f16955d = new a(context);
            }
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(build, this.f16955d);
                }
            } catch (Exception e4) {
                o9.d().a(e4);
                Log.e(this.f16952a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.ironsource.Cif
    public JSONObject c(Context context) {
        return y8.a(context, y8.a(context));
    }

    @Override // com.ironsource.Cif
    public void a() {
        this.f16955d = null;
    }

    @Override // com.ironsource.Cif
    @SuppressLint({"NewApi"})
    public void a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.f16953b || this.f16955d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.f16955d);
        } catch (Exception e4) {
            o9.d().a(e4);
            Log.e(this.f16952a, "NetworkCallback for was not registered or already unregistered");
        }
    }
}
