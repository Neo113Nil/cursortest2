package com.google.android.gms.internal.fitness;

import android.os.Parcel;
import com.google.android.gms.fitness.service.FitnessSensorServiceRequest;

/* loaded from: classes3.dex */
public abstract class zzfb extends zzb implements zzfc {
    public zzfb() {
        super("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    protected final boolean zza(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            zzex zzexVar = (zzex) zzc.zza(parcel, zzex.CREATOR);
            zzbq zzc = zzbp.zzc(parcel.readStrongBinder());
            zzc.zzb(parcel);
            zzb(zzexVar, zzc);
        } else if (i8 == 2) {
            FitnessSensorServiceRequest fitnessSensorServiceRequest = (FitnessSensorServiceRequest) zzc.zza(parcel, FitnessSensorServiceRequest.CREATOR);
            zzcp zzb = zzco.zzb(parcel.readStrongBinder());
            zzc.zzb(parcel);
            zzc(fitnessSensorServiceRequest, zzb);
        } else {
            if (i8 != 3) {
                return false;
            }
            zzez zzezVar = (zzez) zzc.zza(parcel, zzez.CREATOR);
            zzcp zzb2 = zzco.zzb(parcel.readStrongBinder());
            zzc.zzb(parcel);
            zzd(zzezVar, zzb2);
        }
        return true;
    }
}
