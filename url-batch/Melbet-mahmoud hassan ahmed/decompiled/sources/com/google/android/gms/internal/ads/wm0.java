package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class wm0 extends zd implements ym0 {
    wm0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.ym0
    public final void b3(String str, String str2, Bundle bundle) {
        Parcel E = E();
        E.writeString(str);
        E.writeString(str2);
        be.d(E, bundle);
        O0(3, E);
    }

    @Override // com.google.android.gms.internal.ads.ym0
    public final void s(String str) {
        Parcel E = E();
        E.writeString(str);
        O0(2, E);
    }
}
