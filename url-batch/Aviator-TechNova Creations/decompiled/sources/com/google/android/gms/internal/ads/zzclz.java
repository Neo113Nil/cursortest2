package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzclz implements zzazc {
    private final Context zza;
    private final zzgbb zzb;

    zzclz(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdx)).intValue();
        int i = intValue != 1 ? (intValue == 2 || intValue != 3) ? 3 : 4 : 2;
        zzgbw zze = zzgbx.zze();
        zze.zza(((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdE)).floatValue());
        zzgbx zzgbxVar = (zzgbx) zze.zzbu();
        zzgby zzi = zzgbz.zzi();
        zzi.zza(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdF)).booleanValue());
        zzi.zzb(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdH)).longValue());
        zzgbz zzgbzVar = (zzgbz) zzi.zzbu();
        zzgbe zzu = zzgbf.zzu();
        zzu.zzi(i);
        zzu.zzb(versionInfoParcel.afmaVersion);
        zzu.zza(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdb)).booleanValue());
        zzu.zzh(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdu)).intValue() == -1);
        zzu.zzg(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdw)).intValue());
        zzu.zze(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdG)).longValue());
        zzu.zzd(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdv)).intValue());
        zzu.zzc(zzgbxVar);
        zzu.zzf(zzgbzVar);
        zzgbb zza = zzgbb.zza(context, zzcei.zza, (zzgbf) zzu.zzbu());
        this.zzb = zza;
        zza.zzb();
    }

    public final String zza() {
        int zzh = this.zzb.zzh() - 1;
        return zzh != 1 ? zzh != 2 ? zzh != 3 ? "uns" : "3.0" : "2.0" : "1.0";
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzd(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.zzb.zzg(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    @Deprecated
    public final void zze(int i, int i2, int i3) {
        com.google.android.gms.ads.internal.client.zzbb.zza();
        Context context = this.zza;
        float zzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        float zzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i2);
        zzgbb zzgbbVar = this.zzb;
        long j = i3;
        MotionEvent obtain = MotionEvent.obtain(0L, j, 0, zzC, zzC2, 0);
        zzgbbVar.zzg(obtain);
        obtain.recycle();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        float zzC3 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        MotionEvent obtain2 = MotionEvent.obtain(0L, j, 2, zzC3, com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i2), 0);
        zzgbbVar.zzg(obtain2);
        obtain2.recycle();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        float zzC4 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        MotionEvent obtain3 = MotionEvent.obtain(0L, j, 1, zzC4, com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i2), 0);
        zzgbbVar.zzg(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzf(Context context, String str, View view, Activity activity) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzg(Context context, String str, View view) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzh(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        this.zzb.zzf(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzj(Context context, View view, Activity activity) {
        return this.zzb.zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzk(Context context) {
        return this.zzb.zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzl(Context context) {
        return this.zzb.zzc(context);
    }
}
