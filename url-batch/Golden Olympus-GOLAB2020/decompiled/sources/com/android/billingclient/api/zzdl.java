package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zziu;
import com.google.android.gms.internal.play_billing.zziw;
import com.google.android.gms.internal.play_billing.zziy;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjr;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkf;
import com.google.android.gms.internal.play_billing.zzkh;
import com.google.android.gms.internal.play_billing.zzkn;
import com.google.android.gms.internal.play_billing.zzkr;

/* loaded from: classes.dex */
final class zzdl implements zzcz {
    private zzjr zzb;
    private final zzdn zzc;

    zzdl(Context context, zzjr zzjrVar) {
        this.zzc = new zzdn(context);
        this.zzb = zzjrVar;
    }

    private final void zzl(zziw zziwVar, zzjr zzjrVar) {
        if (zziwVar == null) {
            return;
        }
        try {
            zzkf zza = zzkh.zza();
            zza.zzd(zzjrVar);
            zza.zza(zziwVar);
            this.zzc.zza((zzkh) zza.zzi());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    private final void zzm(zzja zzjaVar, zzjr zzjrVar) {
        if (zzjaVar == null) {
            return;
        }
        try {
            zzkf zza = zzkh.zza();
            zza.zzd(zzjrVar);
            zza.zzb(zzjaVar);
            this.zzc.zza((zzkh) zza.zzi());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zza(zziw zziwVar) {
        try {
            zzl(zziwVar, this.zzb);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzb(zziw zziwVar, int i4) {
        try {
            zzjp zzjpVar = (zzjp) this.zzb.zzq();
            zzjpVar.zzc(i4);
            this.zzb = (zzjr) zzjpVar.zzi();
            zza(zziwVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzc(zziw zziwVar, int i4, long j4) {
        try {
            zzjp zzjpVar = (zzjp) this.zzb.zzq();
            zzjpVar.zzc(i4);
            zzjr zzjrVar = (zzjr) zzjpVar.zzi();
            this.zzb = zzjrVar;
            if (j4 != 0) {
                zzjp zzjpVar2 = (zzjp) zzjrVar.zzq();
                zzjpVar2.zze(j4);
                zzjrVar = (zzjr) zzjpVar2.zzi();
            }
            zzl(zziwVar, zzjrVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzd(zziw zziwVar, long j4, boolean z4) {
        zzjr zzjrVar;
        try {
            zziu zziuVar = (zziu) zziwVar.zzq();
            zzjz zzjzVar = (zzjz) zziwVar.zze().zzq();
            zzjzVar.zza(z4);
            zziuVar.zzd(zzjzVar);
            zziw zziwVar2 = (zziw) zziuVar.zzi();
            if (j4 == 0) {
                zzjrVar = this.zzb;
            } else {
                zzjp zzjpVar = (zzjp) this.zzb.zzq();
                zzjpVar.zze(j4);
                zzjrVar = (zzjr) zzjpVar.zzi();
            }
            zzl(zziwVar2, zzjrVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zze(zziw zziwVar, int i4, long j4, boolean z4) {
        zzjr zzjrVar;
        try {
            zzjp zzjpVar = (zzjp) this.zzb.zzq();
            zzjpVar.zzc(i4);
            this.zzb = (zzjr) zzjpVar.zzi();
            zziu zziuVar = (zziu) zziwVar.zzq();
            zzjz zzjzVar = (zzjz) zziwVar.zze().zzq();
            zzjzVar.zza(z4);
            zziuVar.zzd(zzjzVar);
            zziw zziwVar2 = (zziw) zziuVar.zzi();
            if (j4 == 0) {
                zzjrVar = this.zzb;
            } else {
                zzjp zzjpVar2 = (zzjp) this.zzb.zzq();
                zzjpVar2.zze(j4);
                zzjrVar = (zzjr) zzjpVar2.zzi();
            }
            zzl(zziwVar2, zzjrVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzf(zzja zzjaVar) {
        try {
            zzm(zzjaVar, this.zzb);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzg(zzja zzjaVar, int i4) {
        try {
            zzjp zzjpVar = (zzjp) this.zzb.zzq();
            zzjpVar.zzc(i4);
            this.zzb = (zzjr) zzjpVar.zzi();
            zzf(zzjaVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzh(zzja zzjaVar, long j4, boolean z4) {
        zzjr zzjrVar;
        try {
            zziy zziyVar = (zziy) zzjaVar.zzq();
            zzjz zzjzVar = (zzjz) zzjaVar.zzc().zzq();
            zzjzVar.zza(z4);
            zziyVar.zzc(zzjzVar);
            zzja zzjaVar2 = (zzja) zziyVar.zzi();
            if (j4 == 0) {
                zzjrVar = this.zzb;
            } else {
                zzjp zzjpVar = (zzjp) this.zzb.zzq();
                zzjpVar.zze(j4);
                zzjrVar = (zzjr) zzjpVar.zzi();
            }
            zzm(zzjaVar2, zzjrVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzi(zzji zzjiVar) {
        try {
            zzkf zza = zzkh.zza();
            zza.zzd(this.zzb);
            zza.zzc(zzjiVar);
            this.zzc.zza((zzkh) zza.zzi());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzj(zzkn zzknVar) {
        try {
            zzdn zzdnVar = this.zzc;
            zzkf zza = zzkh.zza();
            zza.zzd(this.zzb);
            zza.zze(zzknVar);
            zzdnVar.zza((zzkh) zza.zzi());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzk(zzkr zzkrVar) {
        if (zzkrVar == null) {
            return;
        }
        try {
            zzkf zza = zzkh.zza();
            zza.zzd(this.zzb);
            zza.zzp(zzkrVar);
            this.zzc.zza((zzkh) zza.zzi());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }
}
