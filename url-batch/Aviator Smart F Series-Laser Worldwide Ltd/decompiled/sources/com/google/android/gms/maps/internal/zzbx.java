package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;

/* loaded from: classes3.dex */
public final class zzbx extends com.google.android.gms.internal.maps.zza implements IStreetViewPanoramaDelegate {
    zzbx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void animateTo(StreetViewPanoramaCamera streetViewPanoramaCamera, long j8) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, streetViewPanoramaCamera);
        zza.writeLong(j8);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void enablePanning(boolean z7) {
        Parcel zza = zza();
        int i8 = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z7 ? 1 : 0);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void enableStreetNames(boolean z7) {
        Parcel zza = zza();
        int i8 = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z7 ? 1 : 0);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void enableUserNavigation(boolean z7) {
        Parcel zza = zza();
        int i8 = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z7 ? 1 : 0);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void enableZoom(boolean z7) {
        Parcel zza = zza();
        int i8 = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z7 ? 1 : 0);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final StreetViewPanoramaCamera getPanoramaCamera() {
        Parcel zzJ = zzJ(10, zza());
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) com.google.android.gms.internal.maps.zzc.zza(zzJ, StreetViewPanoramaCamera.CREATOR);
        zzJ.recycle();
        return streetViewPanoramaCamera;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final StreetViewPanoramaLocation getStreetViewPanoramaLocation() {
        Parcel zzJ = zzJ(14, zza());
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) com.google.android.gms.internal.maps.zzc.zza(zzJ, StreetViewPanoramaLocation.CREATOR);
        zzJ.recycle();
        return streetViewPanoramaLocation;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final boolean isPanningGesturesEnabled() {
        Parcel zzJ = zzJ(6, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final boolean isStreetNamesEnabled() {
        Parcel zzJ = zzJ(8, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final boolean isUserNavigationEnabled() {
        Parcel zzJ = zzJ(7, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final boolean isZoomGesturesEnabled() {
        Parcel zzJ = zzJ(5, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final IObjectWrapper orientationToPoint(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, streetViewPanoramaOrientation);
        Parcel zzJ = zzJ(19, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final StreetViewPanoramaOrientation pointToOrientation(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        Parcel zzJ = zzJ(18, zza);
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) com.google.android.gms.internal.maps.zzc.zza(zzJ, StreetViewPanoramaOrientation.CREATOR);
        zzJ.recycle();
        return streetViewPanoramaOrientation;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setOnStreetViewPanoramaCameraChangeListener(zzbl zzblVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzblVar);
        zzc(16, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setOnStreetViewPanoramaChangeListener(zzbn zzbnVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzbnVar);
        zzc(15, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setOnStreetViewPanoramaClickListener(zzbp zzbpVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzbpVar);
        zzc(17, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setOnStreetViewPanoramaLongClickListener(zzbr zzbrVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzbrVar);
        zzc(20, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPosition(LatLng latLng) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLng);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPositionWithID(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPositionWithRadius(LatLng latLng, int i8) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLng);
        zza.writeInt(i8);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPositionWithRadiusAndSource(LatLng latLng, int i8, StreetViewSource streetViewSource) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLng);
        zza.writeInt(i8);
        com.google.android.gms.internal.maps.zzc.zze(zza, streetViewSource);
        zzc(22, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPositionWithSource(LatLng latLng, StreetViewSource streetViewSource) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLng);
        com.google.android.gms.internal.maps.zzc.zze(zza, streetViewSource);
        zzc(21, zza);
    }
}
