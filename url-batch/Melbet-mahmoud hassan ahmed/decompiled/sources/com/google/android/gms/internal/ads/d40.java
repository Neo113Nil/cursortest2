package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d40 extends zd implements g40 {
    d40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.g40
    public final String e() {
        Parcel q02 = q0(2, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.g40
    public final List<n40> f() {
        Parcel q02 = q0(3, E());
        ArrayList b7 = be.b(q02);
        q02.recycle();
        return b7;
    }
}
