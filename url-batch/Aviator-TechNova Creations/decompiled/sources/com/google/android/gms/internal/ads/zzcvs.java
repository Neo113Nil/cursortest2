package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcvs implements zzdct, zzdbz {
    private final Context zza;
    private final zzcjl zzb;
    private final zzfir zzc;
    private final VersionInfoParcel zzd;
    private zzekb zze;
    private boolean zzf;
    private final zzejz zzg;

    public zzcvs(Context context, zzcjl zzcjlVar, zzfir zzfirVar, VersionInfoParcel versionInfoParcel, zzejz zzejzVar) {
        this.zza = context;
        this.zzb = zzcjlVar;
        this.zzc = zzfirVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzejzVar;
    }

    private final synchronized void zza() {
        zzcjl zzcjlVar;
        zzejy zzejyVar;
        zzejx zzejxVar;
        zzfir zzfirVar = this.zzc;
        if (zzfirVar.zzT && (zzcjlVar = this.zzb) != null) {
            if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zza)) {
                VersionInfoParcel versionInfoParcel = this.zzd;
                int i = versionInfoParcel.buddyApkVersion;
                int i2 = versionInfoParcel.clientJarVersion;
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                String sb2 = sb.toString();
                zzfjn zzfjnVar = zzfirVar.zzV;
                String zza = zzfjnVar.zza();
                if (zzfjnVar.zzc() == 1) {
                    zzejxVar = zzejx.VIDEO;
                    zzejyVar = zzejy.DEFINED_BY_JAVASCRIPT;
                } else {
                    int i3 = zzfirVar.zze;
                    zzejx zzejxVar2 = zzejx.HTML_DISPLAY;
                    zzejyVar = i3 == 1 ? zzejy.ONE_PIXEL : zzejy.BEGIN_TO_RENDER;
                    zzejxVar = zzejxVar2;
                }
                zzekb zzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(sb2, zzcjlVar.zzD(), "", "javascript", zza, zzejyVar, zzejxVar, zzfirVar.zzal);
                this.zze = zzc;
                if (zzc != null) {
                    zzfsj zza2 = zzc.zza();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgl)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzu().zzh(zza2, zzcjlVar.zzD());
                        Iterator it = zzcjlVar.zzF().iterator();
                        while (it.hasNext()) {
                            com.google.android.gms.ads.internal.zzt.zzu().zzg(zza2, (View) it.next());
                        }
                    } else {
                        com.google.android.gms.ads.internal.zzt.zzu().zzh(zza2, zzcjlVar.zzE());
                    }
                    zzcjlVar.zzak(this.zze);
                    com.google.android.gms.ads.internal.zzt.zzu().zze(zza2);
                    this.zzf = true;
                    zzcjlVar.zze("onSdkLoaded", new ArrayMap());
                }
            }
        }
    }

    private final boolean zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgm)).booleanValue() && this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final synchronized void zzdr() {
        zzcjl zzcjlVar;
        if (zzb()) {
            this.zzg.zzd();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzcjlVar = this.zzb) == null) {
            return;
        }
        zzcjlVar.zze("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final synchronized void zzg() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }
}
