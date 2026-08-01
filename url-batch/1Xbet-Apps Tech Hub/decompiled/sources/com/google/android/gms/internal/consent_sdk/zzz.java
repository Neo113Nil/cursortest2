package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;
import java.util.HashSet;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
/* loaded from: classes2.dex */
final class zzz {
    private final zzaa zza;
    private final zzcm zzb;
    private int zzc = 0;
    private ConsentInformation.PrivacyOptionsRequirementStatus zzd = ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN;

    zzz(zzaa zzaaVar, zzcm zzcmVar) {
        this.zza = zzaaVar;
        this.zzb = zzcmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final zzac zza() throws zzi {
        zzas zzasVar;
        String str;
        zzg zzgVar;
        zzaq zzaqVar;
        zzcm zzcmVar = this.zzb;
        int i = zzcmVar.zzf;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
                this.zzc = 3;
                break;
            case 4:
                this.zzc = 2;
                break;
            case 5:
                this.zzc = 1;
                break;
            case 6:
                throw new zzi(1, "Invalid response from server: ".concat(String.valueOf(zzcmVar.zzc)));
            case 7:
                throw new zzi(3, "Publisher misconfiguration: ".concat(String.valueOf(zzcmVar.zzc)));
            default:
                throw new zzi(1, "Invalid response from server.");
        }
        int i3 = zzcmVar.zzg;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 == 1) {
            this.zzd = ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED;
        } else {
            if (i4 != 2) {
                throw new zzi(1, "Invalid response from server.");
            }
            this.zzd = ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED;
        }
        zzcm zzcmVar2 = this.zzb;
        String str2 = zzcmVar2.zza;
        zzbs zzbsVar = str2 == null ? null : new zzbs(zzcmVar2.zzb, str2);
        zzasVar = this.zza.zzc;
        zzasVar.zzi(new HashSet(zzcmVar2.zzd));
        for (zzcl zzclVar : this.zzb.zze) {
            int i5 = zzclVar.zzb;
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 != 0) {
                if (i6 == 1) {
                    str = "write";
                } else if (i6 == 2) {
                    str = "clear";
                }
                if (str == null) {
                    zzaa zzaaVar = this.zza;
                    zzgVar = zzaaVar.zza;
                    String str3 = zzclVar.zza;
                    zzaqVar = zzaaVar.zzb;
                    zzgVar.zzb(str, str3, zzaqVar);
                }
            }
            str = null;
            if (str == null) {
            }
        }
        return new zzac(this.zzc, this.zzd, zzbsVar, null);
    }
}
