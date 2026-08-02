package com.unity3d.player.a;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: com.unity3d.player.a.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0022w extends C0020u {
    public int b;
    public final C0021v c;

    public C0022w(Context context) {
        super(context);
        this.b = 0;
        C0021v c0021v = new C0021v(this);
        this.c = c0021v;
        if (this.a == null) {
            return;
        }
        this.b = super.b();
        this.a.registerDefaultNetworkCallback(c0021v);
    }

    @Override // com.unity3d.player.a.C0020u
    public final int b() {
        return this.b;
    }

    @Override // com.unity3d.player.a.C0020u
    public final void a() {
        ConnectivityManager connectivityManager = this.a;
        if (connectivityManager == null) {
            return;
        }
        connectivityManager.unregisterNetworkCallback(this.c);
    }
}
