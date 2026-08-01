package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbcu {
    private final int zza;
    private final String zzb;
    private final Object zzc;

    /* synthetic */ zzbcu(int i, String str, Object obj, zzbct zzbctVar) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        com.google.android.gms.ads.internal.client.zzba.zza().zzd(this);
    }

    public static zzbcu zzf(int i, String str, float f) {
        return new zzbcr(1, str, Float.valueOf(f));
    }

    public static zzbcu zzg(int i, String str, int i2) {
        return new zzbcp(1, str, Integer.valueOf(i2));
    }

    public static zzbcu zzh(int i, String str, long j) {
        return new zzbcq(1, str, Long.valueOf(j));
    }

    public static zzbcu zzi(int i, String str, Boolean bool) {
        return new zzbco(i, str, bool);
    }

    public static zzbcu zzj(int i, String str, String str2) {
        return new zzbcs(1, str, str2);
    }

    public static zzbcu zzk(int i, String str) {
        zzbcu zzj = zzj(1, "gads:sdk_core_constants:experiment_id", null);
        com.google.android.gms.ads.internal.client.zzba.zza().zzc(zzj);
        return zzj;
    }

    protected abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    protected abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzl() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().zza(this);
    }

    public final Object zzm() {
        return this.zzc;
    }

    public final String zzn() {
        return this.zzb;
    }
}
