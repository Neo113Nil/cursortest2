package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;

/* loaded from: classes3.dex */
public final class zzae extends zza {
    zzae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
    }

    public final void zzc(zzad zzadVar, RegisterRequestParams registerRequestParams) {
        Parcel zza = zza();
        zzc.zze(zza, zzadVar);
        zzc.zzd(zza, registerRequestParams);
        zzb(1, zza);
    }

    public final void zzd(zzad zzadVar, SignRequestParams signRequestParams) {
        Parcel zza = zza();
        zzc.zze(zza, zzadVar);
        zzc.zzd(zza, signRequestParams);
        zzb(2, zza);
    }
}
