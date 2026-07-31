package com.google.firebase.auth.internal;

import com.google.android.gms.internal.p002firebaseauthapi.zzahg;
import com.google.firebase.auth.ActionCodeInfo;
import com.google.firebase.auth.ActionCodeResult;

/* loaded from: classes.dex */
public final class zzu implements ActionCodeResult {
    private final int zza;
    private final String zzb;
    private final String zzc;
    private final ActionCodeInfo zzd;

    public zzu(zzahg zzahgVar) {
        int i4 = 5;
        this.zzb = zzahgVar.zzg() ? zzahgVar.zzc() : zzahgVar.zzb();
        this.zzc = zzahgVar.zzb();
        ActionCodeInfo actionCodeInfo = null;
        if (!zzahgVar.zzh()) {
            this.zza = 3;
            this.zzd = null;
            return;
        }
        String zzd = zzahgVar.zzd();
        zzd.getClass();
        switch (zzd) {
            case "REVERT_SECOND_FACTOR_ADDITION":
                i4 = 6;
                break;
            case "PASSWORD_RESET":
                i4 = 0;
                break;
            case "VERIFY_EMAIL":
                i4 = 1;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                break;
            case "EMAIL_SIGNIN":
                i4 = 4;
                break;
            case "RECOVER_EMAIL":
                i4 = 2;
                break;
            default:
                i4 = 3;
                break;
        }
        this.zza = i4;
        if (i4 == 4 || i4 == 3) {
            this.zzd = null;
            return;
        }
        if (zzahgVar.zzf()) {
            actionCodeInfo = new zzv(zzahgVar.zzb(), zzbk.zza(zzahgVar.zza()));
        } else if (zzahgVar.zzg()) {
            actionCodeInfo = new zzt(zzahgVar.zzc(), zzahgVar.zzb());
        } else if (zzahgVar.zze()) {
            actionCodeInfo = new zzs(zzahgVar.zzb());
        }
        this.zzd = actionCodeInfo;
    }

    @Override // com.google.firebase.auth.ActionCodeResult
    public final String getData(int i4) {
        if (this.zza == 4) {
            return null;
        }
        if (i4 == 0) {
            return this.zzb;
        }
        if (i4 != 1) {
            return null;
        }
        return this.zzc;
    }

    @Override // com.google.firebase.auth.ActionCodeResult
    public final ActionCodeInfo getInfo() {
        return this.zzd;
    }

    @Override // com.google.firebase.auth.ActionCodeResult
    public final int getOperation() {
        return this.zza;
    }
}
