package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class sx extends zd implements ux {
    sx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // com.google.android.gms.internal.ads.ux
    public final void z0(String str, String str2) {
        Parcel E = E();
        E.writeString(str);
        E.writeString(str2);
        O0(1, E);
    }
}
