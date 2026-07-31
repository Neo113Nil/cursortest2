package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class f00 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ g00 f4926f;

    f00(g00 g00Var) {
        this.f4926f = g00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zw zwVar;
        zw zwVar2;
        zwVar = this.f4926f.f5402f;
        if (zwVar != null) {
            try {
                zwVar2 = this.f4926f.f5402f;
                zwVar2.D(1);
            } catch (RemoteException e7) {
                io0.h("Could not notify onAdFailedToLoad event.", e7);
            }
        }
    }
}
