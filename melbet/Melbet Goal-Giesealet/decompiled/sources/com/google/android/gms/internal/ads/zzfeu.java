package com.google.android.gms.internal.ads;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfeu {
    private final zzfet zza = new zzfet();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    zzfeu() {
    }

    public final void zza() {
        this.zzd++;
    }

    public final void zzb() {
        this.zze++;
    }

    public final void zzc() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zzd() {
        this.zzc++;
        this.zza.zzb = true;
    }

    public final void zze() {
        this.zzf++;
    }

    public final zzfet zzf() {
        zzfet zzfetVar = this.zza;
        zzfet clone = zzfetVar.clone();
        zzfetVar.zza = false;
        zzfetVar.zzb = false;
        return clone;
    }

    public final String zzg() {
        return "\n\tPool does not exist: " + this.zzd + "\n\tNew pools created: " + this.zzb + "\n\tPools removed: " + this.zzc + "\n\tEntries added: " + this.zzf + "\n\tNo entries retrieved: " + this.zze + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
    }
}
