package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzchh {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzcgv, java.lang.Object] */
    public static final zzcgv zza(final Context context, final zzcik zzcikVar, final String str, final boolean z, final boolean z2, final zzasi zzasiVar, final zzbee zzbeeVar, final zzcbt zzcbtVar, zzbdu zzbduVar, final com.google.android.gms.ads.internal.zzl zzlVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzayp zzaypVar, final zzfdu zzfduVar, final zzfdy zzfdyVar, final zzefa zzefaVar) throws zzchg {
        zzbdc.zza(context);
        try {
            final zzbdu zzbduVar2 = null;
            zzfuo zzfuoVar = new zzfuo(context, zzcikVar, str, z, z2, zzasiVar, zzbeeVar, zzcbtVar, zzbduVar2, zzlVar, zzaVar, zzaypVar, zzfduVar, zzfdyVar, zzefaVar) { // from class: com.google.android.gms.internal.ads.zzche
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzcik zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzasi zzf;
                public final /* synthetic */ zzbee zzg;
                public final /* synthetic */ zzcbt zzh;
                public final /* synthetic */ com.google.android.gms.ads.internal.zzl zzi;
                public final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                public final /* synthetic */ zzayp zzk;
                public final /* synthetic */ zzfdu zzl;
                public final /* synthetic */ zzfdy zzm;
                public final /* synthetic */ zzefa zzn;

                {
                    this.zzi = zzlVar;
                    this.zzj = zzaVar;
                    this.zzk = zzaypVar;
                    this.zzl = zzfduVar;
                    this.zzm = zzfdyVar;
                    this.zzn = zzefaVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfuo
                public final Object zza() {
                    zzcik zzcikVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z3 = this.zzd;
                    zzayp zzaypVar2 = this.zzk;
                    boolean z4 = this.zze;
                    zzasi zzasiVar2 = this.zzf;
                    zzbee zzbeeVar2 = this.zzg;
                    com.google.android.gms.ads.internal.zzl zzlVar2 = this.zzi;
                    zzfdu zzfduVar2 = this.zzl;
                    Context context2 = this.zza;
                    zzcbt zzcbtVar2 = this.zzh;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzfdy zzfdyVar2 = this.zzm;
                    zzefa zzefaVar2 = this.zzn;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = zzcho.zza;
                        zzchk zzchkVar = new zzchk(new zzcho(new zzcij(context2), zzcikVar2, str2, z3, z4, zzasiVar2, zzbeeVar2, zzcbtVar2, null, zzlVar2, zzaVar2, zzaypVar2, zzfduVar2, zzfdyVar2));
                        zzchkVar.setWebViewClient(com.google.android.gms.ads.internal.zzt.zzq().zzd(zzchkVar, zzaypVar2, z4, zzefaVar2));
                        zzchkVar.setWebChromeClient(new zzcgu(zzchkVar));
                        return zzchkVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return zzfuoVar.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new zzchg("Webview initialization failed.", th);
        }
    }
}
