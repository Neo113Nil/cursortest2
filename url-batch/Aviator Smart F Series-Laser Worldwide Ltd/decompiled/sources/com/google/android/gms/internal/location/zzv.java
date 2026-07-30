package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;

/* loaded from: classes3.dex */
public interface zzv extends IInterface {
    @Deprecated
    void zzA(Location location);

    void zzB(Location location, IStatusCallback iStatusCallback);

    void zzC(zzr zzrVar);

    void zzD(LocationSettingsRequest locationSettingsRequest, zzab zzabVar, String str);

    void zzE(zzo zzoVar);

    void zzF(zzj zzjVar);

    @Deprecated
    void zzd(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzt zztVar);

    void zze(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    @Deprecated
    void zzf(zzeh zzehVar, zzt zztVar);

    void zzg(zzeh zzehVar, IStatusCallback iStatusCallback);

    void zzh(long j8, boolean z7, PendingIntent pendingIntent);

    void zzi(com.google.android.gms.location.zzb zzbVar, PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void zzj(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void zzk(PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void zzl(PendingIntent pendingIntent);

    void zzm(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback);

    void zzn(PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void zzo(com.google.android.gms.location.zzad zzadVar, zzdz zzdzVar);

    @Deprecated
    LocationAvailability zzp(String str);

    void zzq(LastLocationRequest lastLocationRequest, zzdz zzdzVar);

    @Deprecated
    void zzr(LastLocationRequest lastLocationRequest, zzz zzzVar);

    @Deprecated
    Location zzs();

    ICancelToken zzt(CurrentLocationRequest currentLocationRequest, zzdz zzdzVar);

    @Deprecated
    ICancelToken zzu(CurrentLocationRequest currentLocationRequest, zzz zzzVar);

    @Deprecated
    void zzv(zzed zzedVar);

    void zzw(zzdz zzdzVar, LocationRequest locationRequest, IStatusCallback iStatusCallback);

    void zzx(zzdz zzdzVar, IStatusCallback iStatusCallback);

    @Deprecated
    void zzy(boolean z7);

    void zzz(boolean z7, IStatusCallback iStatusCallback);
}
