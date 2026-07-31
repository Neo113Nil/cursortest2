package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zm0 extends zd implements bn0 {
    zm0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.bn0
    public final void b4(x3.a aVar, fn0 fn0Var, ym0 ym0Var) {
        Parcel E = E();
        be.f(E, aVar);
        be.d(E, fn0Var);
        be.f(E, ym0Var);
        O0(1, E);
    }
}
