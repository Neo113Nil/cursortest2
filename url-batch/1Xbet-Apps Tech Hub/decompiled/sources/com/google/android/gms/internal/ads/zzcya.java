package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcya extends com.google.android.gms.ads.internal.client.zzdm {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzega zzh;
    private final Bundle zzi;

    public zzcya(zzfdu zzfduVar, String str, zzega zzegaVar, zzfdy zzfdyVar, String str2) {
        String str3 = null;
        this.zzb = zzfduVar == null ? null : zzfduVar.zzac;
        this.zzc = str2;
        this.zzd = zzfdyVar == null ? null : zzfdyVar.zzb;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str3 = zzfduVar.zzw.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = str3 != null ? str3 : str;
        this.zze = zzegaVar.zzc();
        this.zzh = zzegaVar;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() / 1000;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgP)).booleanValue() || zzfdyVar == null) {
            this.zzi = new Bundle();
        } else {
            this.zzi = zzfdyVar.zzj;
        }
        this.zzg = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzja)).booleanValue() || zzfdyVar == null || TextUtils.isEmpty(zzfdyVar.zzh)) ? "" : zzfdyVar.zzh;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final Bundle zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final com.google.android.gms.ads.internal.client.zzu zzf() {
        zzega zzegaVar = this.zzh;
        if (zzegaVar != null) {
            return zzegaVar.zza();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzg() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzh() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final List zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
