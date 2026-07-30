package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;

/* loaded from: classes3.dex */
public final class zzn extends zza {
    zzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
    }

    public final void zzc(zzg zzgVar, String str) {
        Parcel zza = zza();
        zzc.zze(zza, zzgVar);
        zza.writeString(str);
        zzb(4, zza);
    }

    public final void zzd(zzm zzmVar, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) {
        Parcel zza = zza();
        zzc.zze(zza, zzmVar);
        zzc.zzd(zza, browserPublicKeyCredentialCreationOptions);
        zzb(1, zza);
    }

    public final void zze(zzm zzmVar, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        Parcel zza = zza();
        zzc.zze(zza, zzmVar);
        zzc.zzd(zza, browserPublicKeyCredentialRequestOptions);
        zzb(2, zza);
    }

    public final void zzf(zze zzeVar) {
        Parcel zza = zza();
        zzc.zze(zza, zzeVar);
        zzb(3, zza);
    }
}
