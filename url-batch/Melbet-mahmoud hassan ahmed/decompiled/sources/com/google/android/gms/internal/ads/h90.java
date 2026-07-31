package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class h90 extends zd implements j90 {
    h90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.j90
    public final void u(String str) {
        Parcel E = E();
        E.writeString(str);
        O0(3, E);
    }
}
