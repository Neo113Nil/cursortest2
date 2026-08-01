package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzdkc implements zzavq {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdkf zzb;

    zzdkc(zzdkf zzdkfVar, String str) {
        this.zzb = zzdkfVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final void zzbu(zzavp zzavpVar) {
        Map map;
        zzdmg zzdmgVar;
        zzdmg zzdmgVar2;
        zzdmg zzdmgVar3;
        zzdmg zzdmgVar4;
        Map map2;
        zzdmg zzdmgVar5;
        zzdmg zzdmgVar6;
        zzdmg zzdmgVar7;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbH)).booleanValue()) {
            if (zzavpVar.zzj) {
                zzdkf zzdkfVar = this.zzb;
                String str = this.zza;
                map = zzdkfVar.zzy;
                map.put(str, true);
                zzdkf zzdkfVar2 = this.zzb;
                zzdmgVar = zzdkfVar2.zzo;
                View zzf = zzdmgVar.zzf();
                zzdmgVar2 = this.zzb.zzo;
                Map zzl = zzdmgVar2.zzl();
                zzdmgVar3 = this.zzb.zzo;
                zzdkfVar2.zzA(zzf, zzl, zzdmgVar3.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (zzavpVar.zzj) {
                zzdkf zzdkfVar3 = this.zzb;
                zzdmgVar4 = zzdkfVar3.zzo;
                if (zzdmgVar4 == null) {
                    return;
                }
                map2 = zzdkfVar3.zzy;
                map2.put(this.zza, true);
                zzdkf zzdkfVar4 = this.zzb;
                zzdmgVar5 = zzdkfVar4.zzo;
                View zzf2 = zzdmgVar5.zzf();
                zzdmgVar6 = this.zzb.zzo;
                Map zzl2 = zzdmgVar6.zzl();
                zzdmgVar7 = this.zzb.zzo;
                zzdkfVar4.zzA(zzf2, zzl2, zzdmgVar7.zzm(), true);
            }
        }
    }
}
