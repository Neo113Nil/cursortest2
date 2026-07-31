package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class lg0 extends zd implements ng0 {
    lg0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.ng0
    public final void R0(Intent intent) {
        Parcel E = E();
        be.d(E, intent);
        O0(1, E);
    }

    @Override // com.google.android.gms.internal.ads.ng0
    public final void d() {
        O0(3, E());
    }

    @Override // com.google.android.gms.internal.ads.ng0
    public final void t5(x3.a aVar, String str, String str2) {
        Parcel E = E();
        be.f(E, aVar);
        E.writeString(str);
        E.writeString(str2);
        O0(2, E);
    }
}
