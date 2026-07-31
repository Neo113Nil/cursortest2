package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e40 extends ae implements g40 {
    public e40() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static g40 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof g40 ? (g40) queryLocalInterface : new d40(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 2) {
            String e7 = e();
            parcel2.writeNoException();
            parcel2.writeString(e7);
            return true;
        }
        if (i7 != 3) {
            return false;
        }
        List<n40> f7 = f();
        parcel2.writeNoException();
        parcel2.writeList(f7);
        return true;
    }
}
