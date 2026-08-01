package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdqt {
    private final zzcyf zza;
    private final zzdgc zzb;
    private final zzczo zzc;
    private final zzdab zzd;
    private final zzdan zze;
    private final zzddb zzf;
    private final Executor zzg;
    private final zzdfy zzh;
    private final zzcql zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzbyo zzk;
    private final zzasi zzl;
    private final zzdcs zzm;
    private final zzeep zzn;
    private final zzfla zzo;
    private final zzdtp zzp;
    private final zzfje zzq;
    private final zzcpo zzr;
    private final zzdqz zzs;

    public zzdqt(zzcyf zzcyfVar, zzczo zzczoVar, zzdab zzdabVar, zzdan zzdanVar, zzddb zzddbVar, Executor executor, zzdfy zzdfyVar, zzcql zzcqlVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbyo zzbyoVar, zzasi zzasiVar, zzdcs zzdcsVar, zzeep zzeepVar, zzfla zzflaVar, zzdtp zzdtpVar, zzfje zzfjeVar, zzdgc zzdgcVar, zzcpo zzcpoVar, zzdqz zzdqzVar) {
        this.zza = zzcyfVar;
        this.zzc = zzczoVar;
        this.zzd = zzdabVar;
        this.zze = zzdanVar;
        this.zzf = zzddbVar;
        this.zzg = executor;
        this.zzh = zzdfyVar;
        this.zzi = zzcqlVar;
        this.zzj = zzbVar;
        this.zzk = zzbyoVar;
        this.zzl = zzasiVar;
        this.zzm = zzdcsVar;
        this.zzn = zzeepVar;
        this.zzo = zzflaVar;
        this.zzp = zzdtpVar;
        this.zzq = zzfjeVar;
        this.zzb = zzdgcVar;
        this.zzr = zzcpoVar;
        this.zzs = zzdqzVar;
    }

    public static final ListenableFuture zzj(zzcgv zzcgvVar, String str, String str2) {
        final zzccf zzccfVar = new zzccf();
        zzcgvVar.zzN().zzA(new zzcig() { // from class: com.google.android.gms.internal.ads.zzdqk
            @Override // com.google.android.gms.internal.ads.zzcig
            public final void zza(boolean z, int i, String str3, String str4) {
                zzccf zzccfVar2 = zzccf.this;
                if (z) {
                    zzccfVar2.zzc(null);
                    return;
                }
                zzccfVar2.zzd(new Exception("Ad Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcgvVar.zzab(str, str2, null);
        return zzccfVar;
    }

    final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    final /* synthetic */ void zzd(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    final /* synthetic */ void zzf(View view) {
        this.zzj.zza();
    }

    final /* synthetic */ void zzg(zzcgv zzcgvVar, zzcgv zzcgvVar2, Map map) {
        this.zzi.zzh(zzcgvVar);
    }

    final /* synthetic */ boolean zzh(View view, MotionEvent motionEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjB)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzs.zzb(motionEvent);
        }
        this.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzi(final zzcgv zzcgvVar, boolean z, zzbkf zzbkfVar) {
        zzcii zzN = zzcgvVar.zzN();
        com.google.android.gms.ads.internal.client.zza zzaVar = new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdql
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                zzdqt.this.zzc();
            }
        };
        zzbiv zzbivVar = new zzbiv() { // from class: com.google.android.gms.internal.ads.zzdqm
            @Override // com.google.android.gms.internal.ads.zzbiv
            public final void zzb(String str, String str2) {
                zzdqt.this.zzd(str, str2);
            }
        };
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = new com.google.android.gms.ads.internal.overlay.zzz() { // from class: com.google.android.gms.internal.ads.zzdqn
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                zzdqt.this.zze();
            }
        };
        zzdqs zzdqsVar = new zzdqs(this);
        zzbyo zzbyoVar = this.zzk;
        zzeep zzeepVar = this.zzn;
        zzfla zzflaVar = this.zzo;
        zzdtp zzdtpVar = this.zzp;
        zzN.zzM(zzaVar, this.zzd, this.zze, zzbivVar, zzzVar, z, zzbkfVar, this.zzj, zzdqsVar, zzbyoVar, zzeepVar, zzflaVar, zzdtpVar, this.zzq, null, this.zzb, null, null, this.zzr);
        zzcgvVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdqo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                zzdqt.this.zzh(view, motionEvent);
                return false;
            }
        });
        zzcgvVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzdqt.this.zzf(view);
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzct)).booleanValue()) {
            this.zzl.zzc().zzo((View) zzcgvVar);
        }
        this.zzh.zzo(zzcgvVar, this.zzg);
        this.zzh.zzo(new zzavq() { // from class: com.google.android.gms.internal.ads.zzdqq
            @Override // com.google.android.gms.internal.ads.zzavq
            public final void zzbu(zzavp zzavpVar) {
                zzcii zzN2 = zzcgv.this.zzN();
                Rect rect = zzavpVar.zzd;
                zzN2.zzp(rect.left, rect.top, false);
            }
        }, this.zzg);
        this.zzh.zza((View) zzcgvVar);
        zzcgvVar.zzad("/trackActiveViewUnit", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdqr
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                zzdqt.this.zzg(zzcgvVar, (zzcgv) obj, map);
            }
        });
        this.zzi.zzi(zzcgvVar);
    }
}
