package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class FeatureLayer {
    private final com.google.android.gms.internal.maps.zzs zza;

    @Nullable
    private StyleFactory zzb;
    private final Map zzc = new HashMap();

    public interface OnFeatureClickListener {
        void onFeatureClick(@NonNull FeatureClickEvent featureClickEvent);
    }

    public interface StyleFactory {
        @Nullable
        FeatureStyle getStyle(@NonNull Feature feature);
    }

    public FeatureLayer(com.google.android.gms.internal.maps.zzs zzsVar) {
        this.zza = (com.google.android.gms.internal.maps.zzs) Preconditions.checkNotNull(zzsVar);
    }

    public final void addOnFeatureClickListener(@NonNull OnFeatureClickListener onFeatureClickListener) {
        try {
            zze zzeVar = new zze(this, onFeatureClickListener);
            this.zzc.put(onFeatureClickListener, zzeVar);
            this.zza.zzf(zzeVar);
        } catch (RemoteException e8) {
            throw new RuntimeRemoteException(e8);
        }
    }

    @Nullable
    public String getDatasetId() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e8) {
            throw new RuntimeRemoteException(e8);
        }
    }

    @Nullable
    public StyleFactory getFeatureStyle() {
        return this.zzb;
    }

    @NonNull
    @FeatureType
    public String getFeatureType() {
        try {
            return this.zza.zze();
        } catch (RemoteException e8) {
            throw new RuntimeRemoteException(e8);
        }
    }

    public boolean isAvailable() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e8) {
            throw new RuntimeRemoteException(e8);
        }
    }

    public final void removeOnFeatureClickListener(@NonNull OnFeatureClickListener onFeatureClickListener) {
        try {
            if (this.zzc.containsKey(onFeatureClickListener)) {
                this.zza.zzg((com.google.android.gms.internal.maps.zzaj) this.zzc.get(onFeatureClickListener));
                this.zzc.remove(onFeatureClickListener);
            }
        } catch (RemoteException e8) {
            throw new RuntimeRemoteException(e8);
        }
    }

    public void setFeatureStyle(@Nullable StyleFactory styleFactory) {
        this.zzb = styleFactory;
        if (styleFactory == null) {
            try {
                this.zza.zzh(null);
            } catch (RemoteException e8) {
                throw new RuntimeRemoteException(e8);
            }
        } else {
            try {
                this.zza.zzh(new zzd(this, styleFactory));
            } catch (RemoteException e9) {
                throw new RuntimeRemoteException(e9);
            }
        }
    }
}
