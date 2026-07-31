package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d60 extends zd implements e60 {
    d60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.e60
    public final void b() {
        O0(2, E());
    }

    @Override // com.google.android.gms.internal.ads.e60
    public final void z(String str) {
        Parcel E = E();
        E.writeString(str);
        O0(1, E);
    }
}
