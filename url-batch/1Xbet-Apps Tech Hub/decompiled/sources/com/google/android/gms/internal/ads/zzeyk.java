package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeyk implements zzhdp {
    public static zzevb zza(Context context, zzcak zzcakVar, zzcal zzcalVar, Object obj, zzevz zzevzVar, zzexq zzexqVar, zzhdj zzhdjVar, zzhdj zzhdjVar2, zzhdj zzhdjVar3, zzhdj zzhdjVar4, zzhdj zzhdjVar5, zzhdj zzhdjVar6, zzhdj zzhdjVar7, zzhdj zzhdjVar8, zzhdj zzhdjVar9, Executor executor, zzfkh zzfkhVar, zzdtp zzdtpVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzexj) obj);
        hashSet.add(zzevzVar);
        hashSet.add(zzexqVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfJ)).booleanValue()) {
            hashSet.add((zzeuy) zzhdjVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfK)).booleanValue()) {
            hashSet.add((zzeuy) zzhdjVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfL)).booleanValue()) {
            hashSet.add((zzeuy) zzhdjVar3.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfM)).booleanValue()) {
            hashSet.add((zzeuy) zzhdjVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfQ)).booleanValue()) {
            hashSet.add((zzeuy) zzhdjVar6.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfR)).booleanValue()) {
            hashSet.add((zzeuy) zzhdjVar7.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcG)).booleanValue()) {
            hashSet.add((zzeuy) zzhdjVar9.zzb());
        }
        return new zzevb(context, executor, hashSet, zzfkhVar, zzdtpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
