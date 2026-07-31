package com.startapp.sdk.internal;

import android.net.ConnectivityManager;
import java.util.Iterator;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class u5 implements ConnectivityManager.OnNetworkActiveListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w5 f449a;

    public u5(w5 w5Var) {
        this.f449a = w5Var;
    }

    @Override // android.net.ConnectivityManager.OnNetworkActiveListener
    public final void onNetworkActive() {
        w5 w5Var = this.f449a;
        synchronized (w5Var.c) {
            Iterator it = w5Var.c.iterator();
            while (it.hasNext()) {
                ((c7) it.next()).call();
            }
        }
    }
}
