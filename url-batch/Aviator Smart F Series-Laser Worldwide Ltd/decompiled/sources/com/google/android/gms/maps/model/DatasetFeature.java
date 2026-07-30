package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.maps.zzbl;
import java.util.Map;

/* loaded from: classes3.dex */
public final class DatasetFeature extends Feature {
    private final com.google.android.gms.internal.maps.zzp zza;

    public DatasetFeature(com.google.android.gms.internal.maps.zzp zzpVar) {
        super(zzpVar);
        this.zza = zzpVar;
    }

    @NonNull
    public Map<String, String> getDatasetAttributes() {
        try {
            return zzbl.zzc(this.zza.zzh().entrySet());
        } catch (RemoteException e8) {
            throw new RuntimeRemoteException(e8);
        }
    }

    @NonNull
    public String getDatasetId() {
        try {
            return this.zza.zze();
        } catch (RemoteException e8) {
            throw new RuntimeRemoteException(e8);
        }
    }
}
