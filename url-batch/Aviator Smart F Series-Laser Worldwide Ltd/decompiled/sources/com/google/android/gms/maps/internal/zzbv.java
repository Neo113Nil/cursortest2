package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public abstract class zzbv extends com.google.android.gms.internal.maps.zzb implements zzbw {
    public zzbv() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            Bitmap bitmap = (Bitmap) com.google.android.gms.internal.maps.zzc.zza(parcel, Bitmap.CREATOR);
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzb(bitmap);
        } else {
            if (i8 != 2) {
                return false;
            }
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzc(asInterface);
        }
        parcel2.writeNoException();
        return true;
    }
}
