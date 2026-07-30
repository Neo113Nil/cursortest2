package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcja extends zzcfk {
    private final zzcgf zzc;
    private zzcjb zzd;
    private Uri zze;
    private zzcfj zzf;
    private boolean zzg;
    private int zzh;

    public zzcja(Context context, zzcgf zzcgfVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzcgfVar;
        zzcgfVar.zza(this);
    }

    @EnsuresNonNullIf(expression = {"immersiveAdPlayer"}, result = true)
    private final boolean zzu() {
        int i = this.zzh;
        return (i == 1 || i == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i) {
        if (i == 4) {
            this.zzc.zze();
            this.zzb.zzd();
        } else if (this.zzh == 4) {
            this.zzc.zzf();
            this.zzb.zze();
        }
        this.zzh = i;
    }

    @Override // android.view.View
    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final String zza() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzb(zzcfj zzcfjVar) {
        this.zzf = zzcfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzc(String str) {
        if (str != null) {
            this.zze = Uri.parse(str);
            this.zzd = new zzcjb(this.zze.toString());
            zzv(3);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcja.this.zzr();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzd() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView stop");
        zzcjb zzcjbVar = this.zzd;
        if (zzcjbVar != null) {
            zzcjbVar.zzd();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zze() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView play");
        if (zzu()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zza();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcix
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcja.this.zzs();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzf() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView pause");
        if (zzu() && this.zzd.zza()) {
            this.zzd.zzc();
            zzv(5);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcja.this.zzt();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzg() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzh() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzi(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("AdImmersivePlayerView seek ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzj(float f, float f2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzk() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzl() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final long zzm() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final long zzn() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final long zzo() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzp() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgh
    public final void zzq() {
        if (this.zzd != null) {
            this.zzb.zzc();
        }
    }

    final /* synthetic */ void zzr() {
        zzcfj zzcfjVar = this.zzf;
        if (zzcfjVar != null) {
            zzcfjVar.zzb();
        }
    }

    final /* synthetic */ void zzs() {
        zzcfj zzcfjVar = this.zzf;
        if (zzcfjVar != null) {
            if (!this.zzg) {
                zzcfjVar.zzk();
                this.zzg = true;
            }
            this.zzf.zzc();
        }
    }

    final /* synthetic */ void zzt() {
        zzcfj zzcfjVar = this.zzf;
        if (zzcfjVar != null) {
            zzcfjVar.zzd();
        }
    }
}
