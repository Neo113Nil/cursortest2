package com.startapp.sdk.internal;

import android.net.ConnectivityManager;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d6 implements ConnectivityManager.OnNetworkActiveListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f6 f3675a;

    public d6(f6 f6Var) {
        this.f3675a = f6Var;
    }

    @Override // android.net.ConnectivityManager.OnNetworkActiveListener
    public final void onNetworkActive() {
        f6 f6Var = this.f3675a;
        synchronized (f6Var.f3780c) {
            try {
                Iterator it = f6Var.f3780c.iterator();
                while (it.hasNext()) {
                    ((i7) it.next()).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
