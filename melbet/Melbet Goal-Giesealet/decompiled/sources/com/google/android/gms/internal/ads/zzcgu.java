package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzcgu implements zzaup {
    private final Context zza;
    private final zzfue zzb;

    zzcgu(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdc)).intValue();
        int i = intValue != 1 ? (intValue == 2 || intValue != 3) ? 3 : 4 : 2;
        zzfuw zze = zzfux.zze();
        zze.zza(((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdj)).floatValue());
        zzfux zzfuxVar = (zzfux) zze.zzbu();
        zzfuy zzg = zzfuz.zzg();
        zzg.zza(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdk)).booleanValue());
        zzfuz zzfuzVar = (zzfuz) zzg.zzbu();
        zzfuh zzs = zzfui.zzs();
        zzs.zzi(i);
        zzs.zzb(versionInfoParcel.afmaVersion);
        zzs.zza(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcG)).booleanValue());
        zzs.zzh(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcZ)).intValue() == -1);
        zzs.zzg(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdb)).intValue());
        zzs.zze(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdl)).longValue());
        zzs.zzd(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzda)).intValue());
        zzs.zzc(zzfuxVar);
        zzs.zzf(zzfuzVar);
        zzfue zza = zzfue.zza(context, zzbzh.zza, (zzfui) zzs.zzbu());
        this.zzb = zza;
        zza.zzb();
    }

    public final String zza() {
        int zzh = this.zzb.zzh() - 1;
        return zzh != 1 ? zzh != 2 ? "uns" : "2.0" : "1.0";
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzd(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.zzb.zzg(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    @Deprecated
    public final void zze(int i, int i2, int i3) {
        com.google.android.gms.ads.internal.client.zzbb.zza();
        Context context = this.zza;
        float zzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        float zzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i2);
        zzfue zzfueVar = this.zzb;
        long j = i3;
        MotionEvent obtain = MotionEvent.obtain(0L, j, 0, zzC, zzC2, 0);
        zzfueVar.zzg(obtain);
        obtain.recycle();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        float zzC3 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        MotionEvent obtain2 = MotionEvent.obtain(0L, j, 2, zzC3, com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i2), 0);
        zzfueVar.zzg(obtain2);
        obtain2.recycle();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        float zzC4 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        MotionEvent obtain3 = MotionEvent.obtain(0L, j, 1, zzC4, com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i2), 0);
        zzfueVar.zzg(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzf(Context context, String str, View view, Activity activity) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzg(Context context, String str, View view) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzh(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        this.zzb.zzf(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzj(Context context, View view, Activity activity) {
        return this.zzb.zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzk(Context context) {
        return this.zzb.zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzl(Context context) {
        return this.zzb.zzc(context);
    }
}
