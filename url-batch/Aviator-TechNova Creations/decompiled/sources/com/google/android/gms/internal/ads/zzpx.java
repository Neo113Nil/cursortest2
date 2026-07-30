package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzpx {
    private final Context zza;
    private final zzpw zzb;
    private final Handler zzc;
    private final zzpt zzd;
    private final BroadcastReceiver zze;
    private final zzpu zzf;
    private zzps zzg;
    private AudioDeviceInfo zzh;
    private zzd zzi;
    private boolean zzj;

    /* JADX WARN: Multi-variable type inference failed */
    public zzpx(Context context, zzpw zzpwVar, zzd zzdVar, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzb = zzpwVar;
        this.zzi = zzdVar;
        this.zzh = audioDeviceInfo;
        Handler handler = new Handler(zzfj.zze(), null);
        this.zzc = handler;
        this.zzd = new zzpt(this, 0 == true ? 1 : 0);
        this.zze = new zzpv(this, null);
        Uri zzc = zzps.zzc();
        this.zzf = zzc != null ? new zzpu(this, handler, applicationContext.getContentResolver(), zzc) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final void zzf(zzps zzpsVar) {
        if (!this.zzj || zzpsVar.equals(this.zzg)) {
            return;
        }
        this.zzg = zzpsVar;
        this.zzb.zza(zzpsVar);
    }

    public final void zza(zzps zzpsVar) {
        zzf(zzpsVar);
    }

    public final void zzb(zzd zzdVar) {
        if (Objects.equals(zzdVar, this.zzi)) {
            return;
        }
        this.zzi = zzdVar;
        zzf(zzps.zza(this.zza, zzdVar, this.zzh));
    }

    public final void zzc(AudioDeviceInfo audioDeviceInfo) {
        if (Objects.equals(audioDeviceInfo, this.zzh)) {
            return;
        }
        this.zzh = audioDeviceInfo;
        zzf(zzps.zza(this.zza, this.zzi, audioDeviceInfo));
    }

    public final void zze() {
        if (this.zzj) {
            this.zzg = null;
            Context context = this.zza;
            zzcj.zza(context).unregisterAudioDeviceCallback(this.zzd);
            context.unregisterReceiver(this.zze);
            zzpu zzpuVar = this.zzf;
            if (zzpuVar != null) {
                zzpuVar.zzb();
            }
            this.zzj = false;
        }
    }

    final /* synthetic */ Context zzg() {
        return this.zza;
    }

    final /* synthetic */ AudioDeviceInfo zzh() {
        return this.zzh;
    }

    final /* synthetic */ void zzi(AudioDeviceInfo audioDeviceInfo) {
        this.zzh = null;
    }

    final /* synthetic */ zzd zzj() {
        return this.zzi;
    }

    public final zzps zzd() {
        if (this.zzj) {
            zzps zzpsVar = this.zzg;
            zzpsVar.getClass();
            return zzpsVar;
        }
        this.zzj = true;
        zzpu zzpuVar = this.zzf;
        if (zzpuVar != null) {
            zzpuVar.zza();
        }
        Context context = this.zza;
        zzpt zzptVar = this.zzd;
        Handler handler = this.zzc;
        zzcj.zza(context).registerAudioDeviceCallback(zzptVar, handler);
        zzps zzb = zzps.zzb(context, context.registerReceiver(this.zze, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), this.zzi, this.zzh);
        this.zzg = zzb;
        return zzb;
    }
}
