package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

/* loaded from: classes3.dex */
public final class zzbu extends com.google.android.gms.internal.maps.zza implements IProjectionDelegate {
    zzbu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final LatLng fromScreenLocation(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        Parcel zzJ = zzJ(1, zza);
        LatLng latLng = (LatLng) com.google.android.gms.internal.maps.zzc.zza(zzJ, LatLng.CREATOR);
        zzJ.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final VisibleRegion getVisibleRegion() {
        Parcel zzJ = zzJ(3, zza());
        VisibleRegion visibleRegion = (VisibleRegion) com.google.android.gms.internal.maps.zzc.zza(zzJ, VisibleRegion.CREATOR);
        zzJ.recycle();
        return visibleRegion;
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final IObjectWrapper toScreenLocation(LatLng latLng) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLng);
        Parcel zzJ = zzJ(2, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final IObjectWrapper toScreenLocationWithAltitude(LatLng latLng, float f8) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLng);
        zza.writeFloat(f8);
        Parcel zzJ = zzJ(4, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }
}
