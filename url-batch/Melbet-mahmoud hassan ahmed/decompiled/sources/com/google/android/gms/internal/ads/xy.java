package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class xy extends zd implements zy {
    xy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final String b() {
        Parcel q02 = q0(1, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final String d() {
        Parcel q02 = q0(2, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final List<tv> e() {
        Parcel q02 = q0(3, E());
        ArrayList createTypedArrayList = q02.createTypedArrayList(tv.CREATOR);
        q02.recycle();
        return createTypedArrayList;
    }
}
