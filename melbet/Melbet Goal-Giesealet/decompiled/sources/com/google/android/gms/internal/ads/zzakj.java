package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzakj implements zzajv {
    private final zzef zza = new zzef();
    private final zzef zzb = new zzef();
    private final zzaki zzc = new zzaki();
    private Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzajv
    public final void zza(byte[] bArr, int i, int i2, zzaju zzajuVar, zzdf zzdfVar) {
        zzef zzefVar = this.zza;
        zzefVar.zzb(bArr, i2 + i);
        zzefVar.zzh(i);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        zzef zzefVar2 = this.zzb;
        if (zzeo.zzM(zzefVar, zzefVar2, this.zzd)) {
            zzefVar.zzb(zzefVar2.zzi(), zzefVar2.zze());
        }
        zzaki zzakiVar = this.zzc;
        zzakiVar.zzb();
        ArrayList arrayList = new ArrayList();
        while (zzefVar.zzd() >= 3) {
            int zze = zzefVar.zze();
            int zzs = zzefVar.zzs();
            int zzt = zzefVar.zzt();
            int zzg = zzefVar.zzg() + zzt;
            zzcl zzclVar = null;
            if (zzg > zze) {
                zzefVar.zzh(zze);
            } else {
                if (zzs != 128) {
                    switch (zzs) {
                        case 20:
                            zzakiVar.zzc(zzefVar, zzt);
                            break;
                        case 21:
                            zzakiVar.zzd(zzefVar, zzt);
                            break;
                        case 22:
                            zzakiVar.zze(zzefVar, zzt);
                            break;
                    }
                } else {
                    zzcl zza = zzakiVar.zza();
                    zzakiVar.zzb();
                    zzclVar = zza;
                }
                zzefVar.zzh(zzg);
            }
            if (zzclVar != null) {
                arrayList.add(zzclVar);
            }
        }
        zzdfVar.zza(new zzajn(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
