package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class a00 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c00 f2544f;

    a00(c00 c00Var) {
        this.f2544f = c00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zw zwVar;
        zw zwVar2;
        zwVar = this.f2544f.f3675f.f4028f;
        if (zwVar != null) {
            try {
                zwVar2 = this.f2544f.f3675f.f4028f;
                zwVar2.D(1);
            } catch (RemoteException e7) {
                io0.h("Could not notify onAdFailedToLoad event.", e7);
            }
        }
    }
}
