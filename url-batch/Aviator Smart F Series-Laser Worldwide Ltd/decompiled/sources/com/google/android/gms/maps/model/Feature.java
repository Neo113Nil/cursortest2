package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public abstract class Feature {
    private final com.google.android.gms.internal.maps.zzp zza;

    Feature(com.google.android.gms.internal.maps.zzp zzpVar) {
        this.zza = zzpVar;
    }

    @Nullable
    static Feature zza(com.google.android.gms.internal.maps.zzp zzpVar) {
        Preconditions.checkNotNull(zzpVar);
        try {
            int zzd = zzpVar.zzd();
            if (zzd == 1) {
                return new PlaceFeature(zzpVar);
            }
            if (zzd == 2) {
                return new DatasetFeature(zzpVar);
            }
            return null;
        } catch (RemoteException e8) {
            throw new RuntimeRemoteException(e8);
        }
    }

    @NonNull
    @FeatureType
    public String getFeatureType() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e8) {
            throw new RuntimeRemoteException(e8);
        }
    }
}
