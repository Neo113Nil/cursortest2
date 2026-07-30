package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzduu {
    private final zzdbd zza;
    private final zzdjk zzb;
    private final zzdcm zzc;
    private final zzdcz zzd;
    private final zzddq zze;
    private final zzdgj zzf;
    private final Executor zzg;
    private final zzdjg zzh;
    private final zzcss zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzcce zzk;
    private final zzazh zzl;
    private final zzdga zzm;
    private final zzeiu zzn;
    private final zzfqk zzo;
    private final zzdxz zzp;
    private final zzcrv zzq;
    private final zzdva zzr;
    private final zzdzc zzs;
    private final zzdae zzt;
    private final zzczz zzu;

    public zzduu(zzdbd zzdbdVar, zzdcm zzdcmVar, zzdcz zzdczVar, zzddq zzddqVar, zzdgj zzdgjVar, Executor executor, zzdjg zzdjgVar, zzcss zzcssVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcce zzcceVar, zzazh zzazhVar, zzdga zzdgaVar, zzeiu zzeiuVar, zzfqk zzfqkVar, zzdxz zzdxzVar, zzdjk zzdjkVar, zzcrv zzcrvVar, zzdva zzdvaVar, zzdzc zzdzcVar, zzdae zzdaeVar, zzczz zzczzVar) {
        this.zza = zzdbdVar;
        this.zzc = zzdcmVar;
        this.zzd = zzdczVar;
        this.zze = zzddqVar;
        this.zzf = zzdgjVar;
        this.zzg = executor;
        this.zzh = zzdjgVar;
        this.zzi = zzcssVar;
        this.zzj = zzbVar;
        this.zzk = zzcceVar;
        this.zzl = zzazhVar;
        this.zzm = zzdgaVar;
        this.zzn = zzeiuVar;
        this.zzo = zzfqkVar;
        this.zzp = zzdxzVar;
        this.zzb = zzdjkVar;
        this.zzq = zzcrvVar;
        this.zzr = zzdvaVar;
        this.zzs = zzdzcVar;
        this.zzt = zzdaeVar;
        this.zzu = zzczzVar;
    }

    public static final ListenableFuture zzj(zzcjl zzcjlVar, String str, String str2, final Bundle bundle, zzfoo zzfooVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcN)).booleanValue()) {
            bundle.putLong(zzdxh.RENDERING_WEBVIEW_LOAD_HTML_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final zzcen zzcenVar = new zzcen();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkm)).booleanValue()) {
            zzfoe zzn = zzfoe.zzn(zzcjlVar.getContext(), 112);
            zzn.zza();
            zzfon.zzd(zzcenVar, zzfooVar, zzn);
        }
        zzcjlVar.zzP().zzG(new zzclh() { // from class: com.google.android.gms.internal.ads.zzdus
            @Override // com.google.android.gms.internal.ads.zzclh
            public final /* synthetic */ void zza(boolean z, int i, String str3, String str4) {
                zzcen zzcenVar2 = zzcenVar;
                if (z) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcN)).booleanValue()) {
                        bundle.putLong(zzdxh.RENDERING_WEBVIEW_LOAD_HTML_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    }
                    zzcenVar2.zzc(null);
                    return;
                }
                int length = String.valueOf(i).length();
                StringBuilder sb = new StringBuilder(length + 55 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb.append("Ad Web View failed to load. Error code: ");
                sb.append(i);
                sb.append(", Description: ");
                sb.append(str3);
                sb.append(", Failing URL: ");
                sb.append(str4);
                zzcenVar2.zzd(new Exception(sb.toString()));
            }
        });
        zzcjlVar.zzau(str, str2, null);
        return zzcenVar;
    }

    final /* synthetic */ void zza() {
        this.zza.onAdClicked();
    }

    final /* synthetic */ void zzb(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    final /* synthetic */ void zzc() {
        this.zzc.zzb();
    }

    final /* synthetic */ boolean zzd(View view, MotionEvent motionEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzly)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzr.zza(motionEvent);
        }
        this.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    final /* synthetic */ void zze(View view) {
        this.zzj.zza();
    }

    final /* synthetic */ void zzf(zzcjl zzcjlVar, zzcjl zzcjlVar2, Map map) {
        this.zzi.zzn(zzcjlVar);
    }

    final /* synthetic */ zzdcm zzg() {
        return this.zzc;
    }

    final /* synthetic */ zzdga zzh() {
        return this.zzm;
    }

    public final void zzi(final zzcjl zzcjlVar, boolean z, zzbok zzbokVar, Bundle bundle) {
        zzazc zzb;
        zzbgv zzbgvVar = zzbhe.zzcN;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            bundle.putLong(zzdxh.RENDERING_CONFIGURE_WEBVIEW_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcjlVar.zzP().zzab(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdut
            @Override // com.google.android.gms.ads.internal.client.zza
            public final /* synthetic */ void onAdClicked() {
                zzduu.this.zza();
            }
        }, this.zzd, this.zze, new zzbmz() { // from class: com.google.android.gms.internal.ads.zzdum
            @Override // com.google.android.gms.internal.ads.zzbmz
            public final /* synthetic */ void zzb(String str, String str2) {
                zzduu.this.zzb(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdun
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                zzduu.this.zzc();
            }
        }, z, zzbokVar, this.zzj, new zzdul(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq, this.zzs, this.zzt, this.zzu);
        zzcjlVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzduo
            @Override // android.view.View.OnTouchListener
            public final /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
                zzduu.this.zzd(view, motionEvent);
                return false;
            }
        });
        zzcjlVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdup
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                zzduu.this.zze(view);
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdq)).booleanValue() && (zzb = this.zzl.zzb()) != null) {
            zzb.zzh(zzcjlVar.zzE());
        }
        zzdjg zzdjgVar = this.zzh;
        Executor executor = this.zzg;
        zzdjgVar.zzq(zzcjlVar, executor);
        zzdjgVar.zzq(new zzbde() { // from class: com.google.android.gms.internal.ads.zzduq
            @Override // com.google.android.gms.internal.ads.zzbde
            public final /* synthetic */ void zzdj(zzbdd zzbddVar) {
                Rect rect = zzbddVar.zzd;
                zzcjl.this.zzP().zza(rect.left, rect.top, false);
            }
        }, executor);
        zzdjgVar.zza(zzcjlVar.zzE());
        zzcjlVar.zzab("/trackActiveViewUnit", new zzboh() { // from class: com.google.android.gms.internal.ads.zzdur
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzduu.this.zzf(zzcjlVar, (zzcjl) obj, map);
            }
        });
        this.zzi.zzo(zzcjlVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            bundle.putLong(zzdxh.RENDERING_CONFIGURE_WEBVIEW_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
    }
}
