package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzoc;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes3.dex */
final class zzac extends zzz {
    private zzff.zze zzg;
    private final /* synthetic */ zzu zzh;

    @Override // com.google.android.gms.measurement.internal.zzz
    final int zza() {
        return this.zzg.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzz
    final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzz
    final boolean zzc() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzac(zzu zzuVar, String str, int i, zzff.zze zzeVar) {
        super(str, i);
        this.zzh = zzuVar;
        this.zzg = zzeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean zza(Long l, Long l2, zzfn.zzo zzoVar, boolean z) {
        Object[] objArr = zzoc.zza() && this.zzh.zze().zzf(this.zza, zzbf.zzbi);
        boolean zzf = this.zzg.zzf();
        boolean zzg = this.zzg.zzg();
        boolean zzh = this.zzg.zzh();
        Object[] objArr2 = zzf || zzg || zzh;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z && objArr2 == false) {
            this.zzh.zzj().zzp().zza("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzb), this.zzg.zzi() ? Integer.valueOf(this.zzg.zza()) : null);
            return true;
        }
        zzff.zzc zzb = this.zzg.zzb();
        boolean zzf2 = zzb.zzf();
        if (zzoVar.zzk()) {
            if (!zzb.zzh()) {
                this.zzh.zzj().zzu().zza("No number filter for long property. property", this.zzh.zzi().zzc(zzoVar.zzg()));
            } else {
                bool = zza(zza(zzoVar.zzc(), zzb.zzc()), zzf2);
            }
        } else if (zzoVar.zzi()) {
            if (!zzb.zzh()) {
                this.zzh.zzj().zzu().zza("No number filter for double property. property", this.zzh.zzi().zzc(zzoVar.zzg()));
            } else {
                bool = zza(zza(zzoVar.zza(), zzb.zzc()), zzf2);
            }
        } else if (zzoVar.zzm()) {
            if (!zzb.zzj()) {
                if (!zzb.zzh()) {
                    this.zzh.zzj().zzu().zza("No string or number filter defined. property", this.zzh.zzi().zzc(zzoVar.zzg()));
                } else if (zznl.zzb(zzoVar.zzh())) {
                    bool = zza(zza(zzoVar.zzh(), zzb.zzc()), zzf2);
                } else {
                    this.zzh.zzj().zzu().zza("Invalid user property value for Numeric number filter. property, value", this.zzh.zzi().zzc(zzoVar.zzg()), zzoVar.zzh());
                }
            } else {
                bool = zza(zza(zzoVar.zzh(), zzb.zzd(), this.zzh.zzj()), zzf2);
            }
        } else {
            this.zzh.zzj().zzu().zza("User property has no value, property", this.zzh.zzi().zzc(zzoVar.zzg()));
        }
        this.zzh.zzj().zzp().zza("Property filter result", bool == null ? AbstractJsonLexerKt.NULL : bool);
        if (bool == null) {
            return false;
        }
        this.zzc = true;
        if (zzh && !bool.booleanValue()) {
            return true;
        }
        if (!z || this.zzg.zzf()) {
            this.zzd = bool;
        }
        if (bool.booleanValue() && objArr2 != false && zzoVar.zzl()) {
            long zzd = zzoVar.zzd();
            if (l != null) {
                zzd = l.longValue();
            }
            if (objArr != false && this.zzg.zzf() && !this.zzg.zzg() && l2 != null) {
                zzd = l2.longValue();
            }
            if (this.zzg.zzg()) {
                this.zzf = Long.valueOf(zzd);
            } else {
                this.zze = Long.valueOf(zzd);
            }
        }
        return true;
    }
}
