package com.unity3d.player.a;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: com.unity3d.player.a.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0129w extends C0127u {
    public int b;
    public final C0128v c;

    public C0129w(Context context) {
        super(context);
        this.b = 0;
        C0128v c0128v = new C0128v(this);
        this.c = c0128v;
        if (this.a == null) {
            return;
        }
        this.b = super.b();
        this.a.registerDefaultNetworkCallback(c0128v);
    }

    @Override // com.unity3d.player.a.C0127u
    public final int b() {
        return this.b;
    }

    @Override // com.unity3d.player.a.C0127u
    public final void a() {
        ConnectivityManager connectivityManager = this.a;
        if (connectivityManager == null) {
            return;
        }
        connectivityManager.unregisterNetworkCallback(this.c);
    }
}
